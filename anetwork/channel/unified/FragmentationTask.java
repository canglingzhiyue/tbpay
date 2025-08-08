package anetwork.channel.unified;

import mtopsdk.common.util.StringUtils;
import anet.channel.AwcnConfig;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.RequestCb;
import anet.channel.Session;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.bytes.ByteArray;
import anet.channel.request.Cancelable;
import anet.channel.request.Request;
import anet.channel.statist.FragmentStatistic;
import anet.channel.statist.RequestStatistic;
import anet.channel.thread.ThreadPoolExecutorFactory;
import anet.channel.util.ALog;
import anet.channel.util.ErrorConstant;
import anet.channel.util.HttpConstant;
import anet.channel.util.HttpHelper;
import anet.channel.util.StringUtils;
import anetwork.channel.aidl.DefaultFinishEvent;
import anetwork.channel.config.NetworkConfigCenter;
import anetwork.channel.cookie.CookieManager;
import anetwork.channel.monitor.NetworkQoSCenter;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import tb.kge;
import tb.riy;

/* loaded from: classes.dex */
public class FragmentationTask implements IUnifiedTask {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int MAX_RETRY_TIMES = 1;
    private static final int MULTIPATH_TIMER_INTERVAL = 1000;
    private static final String TAG = "anet.FragmentationTask";
    private NetworkQoSCenter.FragmentationRecommender.Fragment fragment;
    private FragmentStatistic fs;
    private RequestContext rc;
    private Request request;
    private volatile int state;
    private int userPathType;
    private FragmentationAggregator aggregator = null;
    private MultipathEnhanceTimer multipathTimer = null;
    private FragmentCallback mainCallback = null;
    private volatile FragmentCallback acceptingCallback = null;
    public volatile Cancelable cancelable = null;
    private Session session = null;
    private int retryTimesCount = 0;
    private int contentLength = 0;
    private int receiveChunkCount = 0;
    private long receiveBytesCount = 0;

    /* loaded from: classes.dex */
    private interface DownloadingType {
        public static final int DEFAULT = 0;
        public static final int FAILED_RETRY = 1;
        public static final int MULTIPATH_TIMER = 2;

        @Retention(RetentionPolicy.SOURCE)
        /* loaded from: classes.dex */
        public @interface Definition {
        }
    }

    /* loaded from: classes.dex */
    public interface FragmentationTaskState {
        public static final int CANCELLED = 6;
        public static final int DATA_RECEIVING = 3;
        public static final int FAILED = 5;
        public static final int FINISH_SUCCESS = 4;
        public static final int INIT = 0;
        public static final int RESPONDED = 2;
        public static final int SENT = 1;

        @Retention(RetentionPolicy.SOURCE)
        /* loaded from: classes.dex */
        public @interface Definition {
        }
    }

    static {
        kge.a(33636735);
        kge.a(471853369);
    }

    public static /* synthetic */ NetworkQoSCenter.FragmentationRecommender.Fragment access$000(FragmentationTask fragmentationTask) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (NetworkQoSCenter.FragmentationRecommender.Fragment) ipChange.ipc$dispatch("c84c894d", new Object[]{fragmentationTask}) : fragmentationTask.fragment;
    }

    public static /* synthetic */ RequestContext access$100(FragmentationTask fragmentationTask) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RequestContext) ipChange.ipc$dispatch("a433e40e", new Object[]{fragmentationTask}) : fragmentationTask.rc;
    }

    public static /* synthetic */ int access$1000(FragmentationTask fragmentationTask) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c607d5e9", new Object[]{fragmentationTask})).intValue() : fragmentationTask.retryTimesCount;
    }

    public static /* synthetic */ int access$1100(FragmentationTask fragmentationTask) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("992f3aa", new Object[]{fragmentationTask})).intValue() : fragmentationTask.userPathType;
    }

    public static /* synthetic */ Request access$1200(FragmentationTask fragmentationTask) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Request) ipChange.ipc$dispatch("4ba8a51d", new Object[]{fragmentationTask}) : fragmentationTask.request;
    }

    public static /* synthetic */ FragmentCallback access$1300(FragmentationTask fragmentationTask) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FragmentCallback) ipChange.ipc$dispatch("154372d0", new Object[]{fragmentationTask}) : fragmentationTask.mainCallback;
    }

    public static /* synthetic */ MultipathEnhanceTimer access$1400(FragmentationTask fragmentationTask) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MultipathEnhanceTimer) ipChange.ipc$dispatch("18bd739b", new Object[]{fragmentationTask}) : fragmentationTask.multipathTimer;
    }

    public static /* synthetic */ Cancelable access$1600(FragmentationTask fragmentationTask, Session session, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Cancelable) ipChange.ipc$dispatch("fe026c2d", new Object[]{fragmentationTask, session, new Integer(i)}) : fragmentationTask.downloading(session, i);
    }

    public static /* synthetic */ int access$200(FragmentationTask fragmentationTask) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("da74eebc", new Object[]{fragmentationTask})).intValue() : fragmentationTask.state;
    }

    public static /* synthetic */ int access$202(FragmentationTask fragmentationTask, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("577ca98b", new Object[]{fragmentationTask, new Integer(i)})).intValue();
        }
        fragmentationTask.state = i;
        return i;
    }

    public static /* synthetic */ int access$300(FragmentationTask fragmentationTask) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("1e000c7d", new Object[]{fragmentationTask})).intValue() : fragmentationTask.contentLength;
    }

    public static /* synthetic */ int access$302(FragmentationTask fragmentationTask, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("855543ea", new Object[]{fragmentationTask, new Integer(i)})).intValue();
        }
        fragmentationTask.contentLength = i;
        return i;
    }

    public static /* synthetic */ FragmentCallback access$400(FragmentationTask fragmentationTask) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FragmentCallback) ipChange.ipc$dispatch("674836e2", new Object[]{fragmentationTask}) : fragmentationTask.acceptingCallback;
    }

    public static /* synthetic */ FragmentCallback access$402(FragmentationTask fragmentationTask, FragmentCallback fragmentCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FragmentCallback) ipChange.ipc$dispatch("acbf5b91", new Object[]{fragmentationTask, fragmentCallback});
        }
        fragmentationTask.acceptingCallback = fragmentCallback;
        return fragmentCallback;
    }

    public static /* synthetic */ FragmentationAggregator access$500(FragmentationTask fragmentationTask) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FragmentationAggregator) ipChange.ipc$dispatch("a0872896", new Object[]{fragmentationTask}) : fragmentationTask.aggregator;
    }

    public static /* synthetic */ int access$600(FragmentationTask fragmentationTask) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e8a165c0", new Object[]{fragmentationTask})).intValue() : fragmentationTask.receiveChunkCount;
    }

    public static /* synthetic */ int access$608(FragmentationTask fragmentationTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e4ee35c8", new Object[]{fragmentationTask})).intValue();
        }
        int i = fragmentationTask.receiveChunkCount;
        fragmentationTask.receiveChunkCount = i + 1;
        return i;
    }

    public static /* synthetic */ long access$700(FragmentationTask fragmentationTask) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("2c2c8382", new Object[]{fragmentationTask})).longValue() : fragmentationTask.receiveBytesCount;
    }

    public static /* synthetic */ long access$702(FragmentationTask fragmentationTask, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3cb7b128", new Object[]{fragmentationTask, new Long(j)})).longValue();
        }
        fragmentationTask.receiveBytesCount = j;
        return j;
    }

    public static /* synthetic */ FragmentStatistic access$800(FragmentationTask fragmentationTask) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FragmentStatistic) ipChange.ipc$dispatch("b29a256e", new Object[]{fragmentationTask}) : fragmentationTask.fs;
    }

    public static /* synthetic */ Session access$900(FragmentationTask fragmentationTask) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Session) ipChange.ipc$dispatch("3f6f8de", new Object[]{fragmentationTask}) : fragmentationTask.session;
    }

    public static /* synthetic */ Session access$902(FragmentationTask fragmentationTask, Session session) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Session) ipChange.ipc$dispatch("77e4d184", new Object[]{fragmentationTask, session});
        }
        fragmentationTask.session = session;
        return session;
    }

    public FragmentationTask(RequestContext requestContext, NetworkQoSCenter.FragmentationRecommender.Fragment fragment, int i) {
        this.rc = null;
        this.fs = null;
        this.userPathType = 0;
        this.state = 0;
        this.rc = requestContext;
        this.request = requestContext.config.getAwcnRequest();
        this.fragment = fragment;
        this.state = 0;
        this.userPathType = i;
        this.fs = new FragmentStatistic();
        ALog.e(TAG, "[fragmentation] create task[" + fragment.index + "], path[" + fragment.pathType + "], userPath[" + i + "], range[" + fragment.rangeStart + ", " + fragment.rangeEnd + riy.ARRAY_END_STR, null, new Object[0]);
    }

    public void setParentAggregator(FragmentationAggregator fragmentationAggregator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9932b368", new Object[]{this, fragmentationAggregator});
        } else {
            this.aggregator = fragmentationAggregator;
        }
    }

    public void setGetLongMultiPathRet(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d73e029", new Object[]{this, new Integer(i)});
        } else {
            this.fs.getLongMultiPathRet = i;
        }
    }

    public void setScenePriority(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c1aedc4", new Object[]{this, str, new Integer(i)});
            return;
        }
        FragmentStatistic fragmentStatistic = this.fs;
        fragmentStatistic.scene = str;
        fragmentStatistic.priorityLevel = i;
    }

    public boolean isMultipath() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2e8f315f", new Object[]{this})).booleanValue() : this.fragment.isMultipath;
    }

    public int getState() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("830709d5", new Object[]{this})).intValue() : this.state;
    }

    public String getRangeInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8e8d5944", new Object[]{this});
        }
        return this.fragment.rangeStart + "-" + this.fragment.rangeEnd + "-" + this.fragment.index;
    }

    @Override // anet.channel.request.Cancelable
    public synchronized void cancel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707fe601", new Object[]{this});
            return;
        }
        this.state = 6;
        if (this.cancelable != null) {
            this.cancelable.cancel();
        }
        if (this.multipathTimer != null) {
            this.multipathTimer.cancel();
        }
    }

    private Request preProcessRequest(Request request) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Request) ipChange.ipc$dispatch("3f01980c", new Object[]{this, request});
        }
        Request.Builder newBuilder = request.newBuilder();
        if (this.rc.config.isRequestCookieEnabled()) {
            String cookie = CookieManager.getCookie(this.rc.config.getUrlString());
            if (!StringUtils.isEmpty(cookie)) {
                String str2 = request.getHeaders().get("Cookie");
                if (!StringUtils.isEmpty(str2)) {
                    cookie = StringUtils.concatString(str2, "; ", cookie);
                }
                if (AwcnConfig.isHostInCookiePrintLogWhiteList(request.getHost())) {
                    CookieManager.printLog("FragmentationTask", this.rc.seqNum, cookie, this.rc.config.getUrlString());
                }
                newBuilder.addHeader("Cookie", cookie);
            }
        }
        if (this.retryTimesCount == 0) {
            str = HttpConstant.RANGE_PRE + this.fragment.rangeStart + "-" + this.fragment.rangeEnd;
            newBuilder.setReadTimeout(2000);
        } else {
            str = HttpConstant.RANGE_PRE + (this.fragment.rangeStart + this.receiveBytesCount) + "-" + this.fragment.rangeEnd;
            newBuilder.setReadTimeout(3000);
        }
        ALog.e(TAG, "[fragmentation] task[" + this.fragment.index + "] with request add Range header[" + str + "]!", this.rc.seqNum, new Object[0]);
        newBuilder.addHeader(HttpConstant.RANGE, str);
        Request build = newBuilder.build();
        if (build != null && request != null) {
            build.isGold = request.isGold;
            build.recvRateBpsLimit = request.recvRateBpsLimit;
        }
        return build;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        int i = this.fragment.index;
        ALog.e(TAG, "[fragmentation] task[" + i + "] retry-func running", this.rc.seqNum, new Object[0]);
        synchronized (this) {
            if (this.state >= 2) {
                ALog.e(TAG, "[fragmentation] task[" + i + "] retry-func exit with state: " + this.state, this.rc.seqNum, new Object[0]);
            } else if (this.retryTimesCount > 0) {
                ALog.e(TAG, "[fragmentation] task[" + i + "] retry-func exit with OVER retry limitation: " + this.retryTimesCount, this.rc.seqNum, new Object[0]);
            } else {
                this.cancelable = downloading(this.session, 1);
            }
        }
    }

    public void download(Session session) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bcd94e7", new Object[]{this, session});
            return;
        }
        ALog.e(TAG, "[fragmentation][QoS] trigger task[" + this.fragment.index + "] download", this.rc.seqNum, new Object[0]);
        try {
            this.fs.requestIndex = this.fragment.index;
            this.fs.startTimestamp = System.currentTimeMillis();
            this.fs.userPathType = this.userPathType;
            this.fs.planPathType = this.fragment.pathType;
            this.fs.planSessionType = session.getConnType().getType();
        } catch (Exception unused) {
        }
        if (session != null) {
            this.session = session;
            this.cancelable = downloading(this.session, 0);
            if (!this.aggregator.isMultipathAvailable() || this.fragment.isMultipath) {
                return;
            }
            setupMultipathTimer();
            return;
        }
        ALog.e(TAG, "[fragmentation] task[" + this.fragment.index + "] exit with NULL session", this.rc.seqNum, new Object[0]);
    }

    private Cancelable downloading(Session session, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Cancelable) ipChange.ipc$dispatch("a3ba1d28", new Object[]{this, session, new Integer(i)});
        }
        NetworkQoSCenter.FragmentationRecommender.Fragment fragment = this.fragment;
        int i2 = fragment != null ? fragment.index : 0;
        if (this.state == 6) {
            ALog.e(TAG, "[fragmentation] task[" + i2 + "] is CANCELLED", this.rc.seqNum, new Object[0]);
            return null;
        } else if (session == null) {
            ALog.e(TAG, "[fragmentation] task[" + i2 + "] run failed, session is NULL", this.rc.seqNum, new Object[0]);
            return null;
        } else {
            boolean z = i == 2;
            FragmentCallback fragmentCallback = new FragmentCallback(this.fragment.pathType, z);
            if (z) {
                this.multipathTimer.callback = fragmentCallback;
            } else {
                this.mainCallback = fragmentCallback;
            }
            this.state = 1;
            if (i == 2 || i == 1) {
                this.retryTimesCount++;
                FragmentStatistic fragmentStatistic = this.fs;
                fragmentStatistic.retryTimes = this.retryTimesCount;
                fragmentStatistic.retryType = i;
                fragmentStatistic.retryTimestamp = System.currentTimeMillis();
            }
            try {
                this.fs.actualPathType = this.fragment.pathType;
                this.fs.actualSessionType = session.getConnType().getType();
            } catch (Exception unused) {
            }
            this.request = preProcessRequest(this.request);
            ALog.e(TAG, "[fragmentation] task[" + i2 + "] send request on session[" + session.mSeq + riy.ARRAY_END_STR, this.rc.seqNum, new Object[0]);
            return session.request(this.request, fragmentCallback);
        }
    }

    /* loaded from: classes.dex */
    public class FragmentCallback implements RequestCb {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private int idx;
        private boolean isMutipathRetry;
        private int pathType;
        private boolean isNormalResponse = false;
        private boolean isCancelled = false;

        static {
            kge.a(1764335450);
            kge.a(-876125329);
        }

        private boolean isNormalResponseCode(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a4946ba1", new Object[]{this, new Integer(i)})).booleanValue() : i == 200 || i == 206;
        }

        public FragmentCallback(int i, boolean z) {
            this.isMutipathRetry = false;
            this.pathType = 0;
            this.idx = 0;
            this.isMutipathRetry = z;
            this.pathType = i;
            this.idx = FragmentationTask.access$000(FragmentationTask.this).index;
        }

        public void setCancelled() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3eecc016", new Object[]{this});
            } else {
                this.isCancelled = true;
            }
        }

        public boolean isCancelled() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6ff5f452", new Object[]{this})).booleanValue() : this.isCancelled;
        }

        @Override // anet.channel.RequestCb
        public void onResponseCode(int i, Map<String, List<String>> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("38c34976", new Object[]{this, new Integer(i), map});
                return;
            }
            synchronized (FragmentationTask.access$100(FragmentationTask.this)) {
                if (FragmentationTask.access$200(FragmentationTask.this) < 2 && !this.isCancelled) {
                    ALog.e(FragmentationTask.TAG, "[fragmentation] task[" + this.idx + "] onResponseCode(" + i + riy.BRACKET_END_STR, FragmentationTask.access$100(FragmentationTask.this).seqNum, new Object[0]);
                    this.isNormalResponse = isNormalResponseCode(i);
                    if (this.isNormalResponse) {
                        cancelParallelRequest();
                        CookieManager.setCookie(FragmentationTask.access$100(FragmentationTask.this).config.getHost(), FragmentationTask.access$100(FragmentationTask.this).config.getUrlString(), map);
                        FragmentationTask.access$302(FragmentationTask.this, HttpHelper.parseContentLength(map));
                        FragmentationTask.access$202(FragmentationTask.this, 2);
                        FragmentationTask.access$402(FragmentationTask.this, this);
                        if (FragmentationTask.access$100(FragmentationTask.this).callback != null && !FragmentationTask.access$500(FragmentationTask.this).isResponded()) {
                            FragmentationTask.access$500(FragmentationTask.this).updateTaskState(FragmentationTask.this, FragmentationTask.access$200(FragmentationTask.this));
                            FragmentationTask.access$100(FragmentationTask.this).callback.onResponseCode(i, FragmentationTask.access$500(FragmentationTask.this).buildResponseHeader(map));
                        } else {
                            FragmentationTask.access$500(FragmentationTask.this).updateTaskState(FragmentationTask.this, FragmentationTask.access$200(FragmentationTask.this));
                        }
                    }
                    return;
                }
                ALog.e(FragmentationTask.TAG, "[fragmentation] task[" + this.idx + "] onResponseCode(" + i + "), exit with state=" + FragmentationTask.access$200(FragmentationTask.this) + ", cancelled=" + this.isCancelled, FragmentationTask.access$100(FragmentationTask.this).seqNum, new Object[0]);
            }
        }

        @Override // anet.channel.RequestCb
        public void onDataReceive(ByteArray byteArray, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a65ed612", new Object[]{this, byteArray, new Boolean(z)});
            } else if (this != FragmentationTask.access$400(FragmentationTask.this)) {
                ALog.e(FragmentationTask.TAG, "[fragmentation] task[" + this.idx + "] onDataReceive(), exit with NOT acceptingCallback" + this.isCancelled, FragmentationTask.access$100(FragmentationTask.this).seqNum, new Object[0]);
            } else if (FragmentationTask.access$200(FragmentationTask.this) > 3 || this.isCancelled) {
                ALog.e(FragmentationTask.TAG, "[fragmentation] task[" + this.idx + "] onDataReceive(), exit with state=" + FragmentationTask.access$200(FragmentationTask.this) + ", cancelled=" + this.isCancelled, FragmentationTask.access$100(FragmentationTask.this).seqNum, new Object[0]);
            } else if (byteArray == null) {
            } else {
                if (byteArray.getDataLength() == 0) {
                    ALog.e(FragmentationTask.TAG, "[fragmentation] task[" + this.idx + "]  onDataReceive fin=true ", FragmentationTask.access$100(FragmentationTask.this).seqNum, new Object[0]);
                    return;
                }
                ALog.d(FragmentationTask.TAG, "[fragmentation] task[" + this.idx + "] onDataReceive data_len = " + byteArray.getDataLength() + " isNormalResponse=[" + this.isNormalResponse + riy.ARRAY_END_STR, FragmentationTask.access$100(FragmentationTask.this).seqNum, new Object[0]);
                FragmentationTask.access$202(FragmentationTask.this, 3);
                if (!this.isNormalResponse) {
                    return;
                }
                FragmentationTask.access$608(FragmentationTask.this);
                FragmentationTask fragmentationTask = FragmentationTask.this;
                FragmentationTask.access$702(fragmentationTask, FragmentationTask.access$700(fragmentationTask) + byteArray.getDataLength());
                if (FragmentationTask.access$100(FragmentationTask.this).callback == null) {
                    return;
                }
                FragmentationAggregator access$500 = FragmentationTask.access$500(FragmentationTask.this);
                FragmentationTask fragmentationTask2 = FragmentationTask.this;
                access$500.updateTaskState(fragmentationTask2, FragmentationTask.access$200(fragmentationTask2));
                byteArray.setRangeIndex(FragmentationTask.access$000(FragmentationTask.this).index);
                FragmentationTask.access$100(FragmentationTask.this).callback.onDataReceiveSize(FragmentationTask.access$600(FragmentationTask.this), FragmentationTask.access$300(FragmentationTask.this), byteArray);
            }
        }

        @Override // anet.channel.RequestCb
        public void onFinish(int i, String str, RequestStatistic requestStatistic) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c490acd4", new Object[]{this, new Integer(i), str, requestStatistic});
                return;
            }
            synchronized (FragmentationTask.access$100(FragmentationTask.this)) {
                if (FragmentationTask.access$200(FragmentationTask.this) >= 4 || this.isCancelled) {
                    ALog.e(FragmentationTask.TAG, "[fragmentation] task[" + this.idx + "] onFinish(), exit with state=" + FragmentationTask.access$200(FragmentationTask.this) + ", cancelled=" + this.isCancelled, FragmentationTask.access$100(FragmentationTask.this).seqNum, new Object[0]);
                    return;
                }
                try {
                    FragmentationTask.access$800(FragmentationTask.this).deprecatedSessionType = FragmentationTask.access$900(FragmentationTask.this).getDeprecatedSessionType();
                    FragmentationTask.access$800(FragmentationTask.this).isNetworkChangeThresholdTime = System.currentTimeMillis() - GlobalAppRuntimeInfo.getNetworkStatusChangedTime() <= NetworkConfigCenter.getNetworkChangeThresholdTime();
                    FragmentationTask.access$800(FragmentationTask.this).setBaseInfo(requestStatistic);
                    FragmentationTask.access$800(FragmentationTask.this).finishTimestamp = System.currentTimeMillis();
                    FragmentationTask.access$800(FragmentationTask.this).retryCostTime = FragmentationTask.access$800(FragmentationTask.this).retryTimes > 0 ? FragmentationTask.access$800(FragmentationTask.this).finishTimestamp - FragmentationTask.access$800(FragmentationTask.this).retryTimestamp : 0L;
                    FragmentationTask.access$800(FragmentationTask.this).totalTime = FragmentationTask.access$800(FragmentationTask.this).finishTimestamp - FragmentationTask.access$800(FragmentationTask.this).startTimestamp;
                    FragmentationTask.access$800(FragmentationTask.this).traffic = FragmentationTask.access$700(FragmentationTask.this);
                    FragmentationTask.access$800(FragmentationTask.this).statusCode = i;
                    FragmentationTask.access$800(FragmentationTask.this).srtt = requestStatistic.srtt;
                } catch (Exception unused) {
                }
                ALog.e(FragmentationTask.TAG, "[fragmentation] task[" + this.idx + "] onFinish( " + i + " ), total received size: " + FragmentationTask.access$700(FragmentationTask.this), FragmentationTask.access$100(FragmentationTask.this).seqNum, new Object[0]);
                if (this.isNormalResponse && isNormalResponseCode(i)) {
                    processFinish(i, str);
                    return;
                }
                if (FragmentationTask.access$1000(FragmentationTask.this) == 0) {
                    FragmentationTask.access$800(FragmentationTask.this).firstErrorCode = FragmentationTask.access$800(FragmentationTask.this).statusCode;
                }
                boolean isReceiveCompleted = isReceiveCompleted();
                if (FragmentationTask.access$1000(FragmentationTask.this) <= 0 && !isReceiveCompleted) {
                    FragmentationTask.access$202(FragmentationTask.this, 0);
                    FragmentationTask.access$500(FragmentationTask.this).updateTaskState(FragmentationTask.this, FragmentationTask.access$200(FragmentationTask.this));
                    ALog.e(FragmentationTask.TAG, "[fragmentation] task[" + this.idx + "] onFinish (FAILURE) with retry", FragmentationTask.access$100(FragmentationTask.this).seqNum, new Object[0]);
                    Session mulitpathSession = FragmentationTask.access$500(FragmentationTask.this).getMulitpathSession();
                    if (!FragmentationTask.access$000(FragmentationTask.this).isMultipath && FragmentationTask.access$500(FragmentationTask.this).isMultipathAvailable() && mulitpathSession != null) {
                        ALog.e(FragmentationTask.TAG, "[fragmentation] task[" + this.idx + "] onFinish (FAILURE), retry MULTI-PATH, userPath=[" + FragmentationTask.access$1100(FragmentationTask.this) + "], retryTimes=[" + FragmentationTask.access$1000(FragmentationTask.this) + riy.ARRAY_END_STR, FragmentationTask.access$100(FragmentationTask.this).seqNum, new Object[0]);
                        FragmentationTask.access$000(FragmentationTask.this).pathType = 1;
                        FragmentationTask.access$902(FragmentationTask.this, mulitpathSession);
                    } else {
                        ALog.e(FragmentationTask.TAG, "[fragmentation] task[" + this.idx + "] onFinish (FAILURE), retry SHORT_LINK, userPath=[" + FragmentationTask.access$1100(FragmentationTask.this) + "], retryTimes=[" + FragmentationTask.access$1000(FragmentationTask.this) + riy.ARRAY_END_STR, FragmentationTask.access$100(FragmentationTask.this).seqNum, new Object[0]);
                        FragmentationTask.access$000(FragmentationTask.this).pathType = FragmentationTask.access$1100(FragmentationTask.this);
                        FragmentationTask.access$902(FragmentationTask.this, FragmentationTask.access$500(FragmentationTask.this).getHttpSession());
                    }
                    ThreadPoolExecutorFactory.submitPriorityTask(FragmentationTask.this, ThreadPoolExecutorFactory.Priority.HIGH);
                    return;
                }
                processFailure(i, str, isReceiveCompleted);
            }
        }

        private void processFinish(int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1bc98404", new Object[]{this, new Integer(i), str});
                return;
            }
            FragmentationTask.access$202(FragmentationTask.this, 4);
            FragmentationAggregator access$500 = FragmentationTask.access$500(FragmentationTask.this);
            FragmentationTask fragmentationTask = FragmentationTask.this;
            access$500.updateTaskState(fragmentationTask, FragmentationTask.access$200(fragmentationTask));
            ALog.e(FragmentationTask.TAG, "[fragmentation] task[" + this.idx + "] onFinish (SUCCESS)", FragmentationTask.access$100(FragmentationTask.this).seqNum, new Object[0]);
            FragmentationTask.access$800(FragmentationTask.this).ret = 1;
            AppMonitor.getInstance().commitStat(FragmentationTask.access$800(FragmentationTask.this));
            if (FragmentationTask.access$500(FragmentationTask.this).isAllTasksFinish() && FragmentationTask.access$100(FragmentationTask.this) != null) {
                if (FragmentationTask.access$100(FragmentationTask.this).callback != null) {
                    if (FragmentationTask.access$500(FragmentationTask.this).isSuccess()) {
                        ALog.e(FragmentationTask.TAG, "[fragmentation] all fragments download finish (SUCCESS)", FragmentationTask.access$100(FragmentationTask.this).seqNum, new Object[0]);
                        FragmentationTask.access$100(FragmentationTask.this).callback.onFinish(new DefaultFinishEvent(i, str, FragmentationTask.access$1200(FragmentationTask.this)));
                    } else {
                        ALog.e(FragmentationTask.TAG, "[fragmentation] all fragments download finish (FRAGMENTATION_PARTIAL_FINISH)", FragmentationTask.access$100(FragmentationTask.this).seqNum, new Object[0]);
                        FragmentationTask.access$100(FragmentationTask.this).callback.onFinish(new DefaultFinishEvent((int) ErrorConstant.ERROR_FRAGMENTATION_PARTIAL_FINISH, str, FragmentationTask.access$1200(FragmentationTask.this)));
                    }
                }
                if (FragmentationTask.access$100(FragmentationTask.this).config != null && FragmentationTask.access$100(FragmentationTask.this).config.isQoSAsync()) {
                    QosTaskQueue.getInstance().pollQueuingTask(FragmentationTask.access$100(FragmentationTask.this));
                }
            }
            NetworkQoSCenter networkQoSCenter = NetworkQoSCenter.getInstance();
            if (networkQoSCenter == null) {
                return;
            }
            networkQoSCenter.input(FragmentationTask.access$800(FragmentationTask.this).traffic, FragmentationTask.access$800(FragmentationTask.this).totalTime - FragmentationTask.access$800(FragmentationTask.this).retryCostTime, FragmentationTask.access$800(FragmentationTask.this).srtt, true, this.pathType);
        }

        private void processFailure(int i, String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("eb0c6c89", new Object[]{this, new Integer(i), str, new Boolean(z)});
            } else if (z) {
                FragmentationTask.access$202(FragmentationTask.this, 4);
                FragmentationAggregator access$500 = FragmentationTask.access$500(FragmentationTask.this);
                FragmentationTask fragmentationTask = FragmentationTask.this;
                access$500.updateTaskState(fragmentationTask, FragmentationTask.access$200(fragmentationTask));
                ALog.e(FragmentationTask.TAG, "[fragmentation] task[" + this.idx + "] onFinish (FAILURE->SUCCESS) with receive-completed", FragmentationTask.access$100(FragmentationTask.this).seqNum, new Object[0]);
                FragmentationTask.access$800(FragmentationTask.this).ret = 3;
                AppMonitor.getInstance().commitStat(FragmentationTask.access$800(FragmentationTask.this));
                if (!FragmentationTask.access$500(FragmentationTask.this).isAllTasksFinish() || FragmentationTask.access$100(FragmentationTask.this) == null) {
                    return;
                }
                if (FragmentationTask.access$100(FragmentationTask.this).callback != null) {
                    if (FragmentationTask.access$500(FragmentationTask.this).isSuccess()) {
                        ALog.e(FragmentationTask.TAG, "[fragmentation] all fragments download finish (SUCCESS)", FragmentationTask.access$100(FragmentationTask.this).seqNum, new Object[0]);
                        FragmentationTask.access$100(FragmentationTask.this).callback.onFinish(new DefaultFinishEvent(206, "receive-completed", FragmentationTask.access$1200(FragmentationTask.this)));
                    } else {
                        ALog.e(FragmentationTask.TAG, "[fragmentation] all fragments download finish (FRAGMENTATION_PARTIAL_FINISH)", FragmentationTask.access$100(FragmentationTask.this).seqNum, new Object[0]);
                        FragmentationTask.access$100(FragmentationTask.this).callback.onFinish(new DefaultFinishEvent((int) ErrorConstant.ERROR_FRAGMENTATION_PARTIAL_FINISH, str, FragmentationTask.access$1200(FragmentationTask.this)));
                    }
                }
                if (FragmentationTask.access$100(FragmentationTask.this).config == null || !FragmentationTask.access$100(FragmentationTask.this).config.isQoSAsync()) {
                    return;
                }
                QosTaskQueue.getInstance().pollQueuingTask(FragmentationTask.access$100(FragmentationTask.this));
            } else if (isParallelRequestingNone()) {
                FragmentationTask.access$202(FragmentationTask.this, 5);
                FragmentationAggregator access$5002 = FragmentationTask.access$500(FragmentationTask.this);
                FragmentationTask fragmentationTask2 = FragmentationTask.this;
                access$5002.updateTaskState(fragmentationTask2, FragmentationTask.access$200(fragmentationTask2));
                ALog.e(FragmentationTask.TAG, "[fragmentation] task[" + this.idx + "] onFinish (FAILURE) with MAX_RETRY_TIMES", FragmentationTask.access$100(FragmentationTask.this).seqNum, new Object[0]);
                FragmentationTask.access$800(FragmentationTask.this).ret = 0;
                AppMonitor.getInstance().commitStat(FragmentationTask.access$800(FragmentationTask.this));
                if (!FragmentationTask.access$500(FragmentationTask.this).isAllTasksFinish() || FragmentationTask.access$100(FragmentationTask.this) == null) {
                    return;
                }
                ALog.e(FragmentationTask.TAG, "[fragmentation] task[" + this.idx + "] onFinish (real return FAILURE) with MAX_RETRY_TIMES", FragmentationTask.access$100(FragmentationTask.this).seqNum, new Object[0]);
                if (FragmentationTask.access$100(FragmentationTask.this).callback != null) {
                    FragmentationTask.access$100(FragmentationTask.this).callback.onFinish(new DefaultFinishEvent(i, str, FragmentationTask.access$1200(FragmentationTask.this)));
                }
                if (FragmentationTask.access$100(FragmentationTask.this).config == null || !FragmentationTask.access$100(FragmentationTask.this).config.isQoSAsync()) {
                    return;
                }
                QosTaskQueue.getInstance().pollQueuingTask(FragmentationTask.access$100(FragmentationTask.this));
            } else {
                ALog.e(FragmentationTask.TAG, "[fragmentation] task[" + this.idx + "] onFinish (FAILURE), wait parallel requesting", FragmentationTask.access$100(FragmentationTask.this).seqNum, new Object[0]);
            }
        }

        private void cancelParallelRequest() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8a03da35", new Object[]{this});
            } else if (this.isMutipathRetry) {
                if (FragmentationTask.access$1300(FragmentationTask.this) != null) {
                    FragmentationTask.access$1300(FragmentationTask.this).setCancelled();
                }
                if (FragmentationTask.this.cancelable == null) {
                    return;
                }
                ALog.e(FragmentationTask.TAG, "[fragmentation] task[" + this.idx + "] multi-path response cancel parallel request", FragmentationTask.access$100(FragmentationTask.this).seqNum, new Object[0]);
                FragmentationTask.this.cancelable.cancel();
            } else if (FragmentationTask.access$1400(FragmentationTask.this) == null) {
            } else {
                FragmentationTask.access$1400(FragmentationTask.this).cancel();
            }
        }

        private boolean isParallelRequestingNone() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("ef7a3f07", new Object[]{this})).booleanValue();
            }
            if (this.isMutipathRetry) {
                if (FragmentationTask.access$1300(FragmentationTask.this) == null) {
                    return true;
                }
                return FragmentationTask.access$1300(FragmentationTask.this).isCancelled();
            } else if (FragmentationTask.access$1400(FragmentationTask.this) != null && FragmentationTask.access$1400(FragmentationTask.this).callback != null) {
                return FragmentationTask.access$1400(FragmentationTask.this).callback.isCancelled;
            } else {
                return true;
            }
        }

        private boolean isReceiveCompleted() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4a512b7d", new Object[]{this})).booleanValue() : FragmentationTask.access$700(FragmentationTask.this) == (FragmentationTask.access$000(FragmentationTask.this).rangeEnd - FragmentationTask.access$000(FragmentationTask.this).rangeStart) + 1;
        }
    }

    private void setupMultipathTimer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9f2576b", new Object[]{this});
        } else if (this.multipathTimer != null) {
        } else {
            MultipathEnhanceTimer multipathEnhanceTimer = new MultipathEnhanceTimer();
            ALog.e(TAG, "[fragmentation] task[" + this.fragment.index + "] setup a multi-path timer:" + multipathEnhanceTimer.hashCode(), this.rc.seqNum, new Object[0]);
            this.multipathTimer = multipathEnhanceTimer;
            ThreadPoolExecutorFactory.submitScheduledTask(multipathEnhanceTimer, 1000L, TimeUnit.MILLISECONDS);
        }
    }

    /* loaded from: classes.dex */
    public class MultipathEnhanceTimer implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public FragmentCallback callback;
        public Cancelable cancelable;
        public Session session;

        static {
            kge.a(985781168);
            kge.a(-1390502639);
        }

        private MultipathEnhanceTimer() {
            this.session = null;
            this.cancelable = null;
            this.callback = null;
        }

        public void cancel() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("707fe601", new Object[]{this});
                return;
            }
            ALog.e(FragmentationTask.TAG, "[fragmentation] task[" + FragmentationTask.access$000(FragmentationTask.this).index + "] cancel multi-path timer", FragmentationTask.access$100(FragmentationTask.this).seqNum, new Object[0]);
            Cancelable cancelable = this.cancelable;
            if (cancelable != null) {
                cancelable.cancel();
            }
            FragmentCallback fragmentCallback = this.callback;
            if (fragmentCallback == null) {
                return;
            }
            fragmentCallback.setCancelled();
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            int i = FragmentationTask.access$000(FragmentationTask.this).index;
            ALog.e(FragmentationTask.TAG, "[fragmentation] task[" + i + "] multi-path timer[" + hashCode() + "] running", FragmentationTask.access$100(FragmentationTask.this).seqNum, new Object[0]);
            synchronized (FragmentationTask.access$100(FragmentationTask.this)) {
                if (FragmentationTask.access$200(FragmentationTask.this) != 1) {
                    ALog.e(FragmentationTask.TAG, "[fragmentation] task[" + i + "] multi-path timer exit with state: " + FragmentationTask.access$200(FragmentationTask.this), FragmentationTask.access$100(FragmentationTask.this).seqNum, new Object[0]);
                } else if (!FragmentationTask.access$500(FragmentationTask.this).isMultipathAvailable()) {
                    ALog.e(FragmentationTask.TAG, "[fragmentation] task[" + i + "] multi-path timer exit with multi-path UNAVAILABLE", FragmentationTask.access$100(FragmentationTask.this).seqNum, new Object[0]);
                } else if (FragmentationTask.access$1000(FragmentationTask.this) > 0) {
                    ALog.e(FragmentationTask.TAG, "[fragmentation] task[" + i + "] multi-path timer exit with OVER retry limitation: " + FragmentationTask.access$1000(FragmentationTask.this), FragmentationTask.access$100(FragmentationTask.this).seqNum, new Object[0]);
                } else {
                    Session mulitpathSession = FragmentationTask.access$500(FragmentationTask.this).getMulitpathSession();
                    if (mulitpathSession != null) {
                        ALog.e(FragmentationTask.TAG, "[fragmentation] task[" + i + "] multi-path timer trigger a new request with LONG_LINK(mp)", FragmentationTask.access$100(FragmentationTask.this).seqNum, new Object[0]);
                        FragmentationTask.access$000(FragmentationTask.this).pathType = 1;
                        this.session = mulitpathSession;
                        this.cancelable = FragmentationTask.access$1600(FragmentationTask.this, mulitpathSession, 2);
                    } else {
                        Session httpSession = FragmentationTask.access$500(FragmentationTask.this).getHttpSession();
                        if (httpSession != null) {
                            ALog.e(FragmentationTask.TAG, "[fragmentation] task[" + i + "] multi-path timer trigger a new request with SHORT_LINK(mp)", FragmentationTask.access$100(FragmentationTask.this).seqNum, new Object[0]);
                            httpSession.setForceCellular(true);
                            FragmentationTask.access$000(FragmentationTask.this).pathType = 1;
                            this.session = httpSession;
                            this.cancelable = FragmentationTask.access$1600(FragmentationTask.this, httpSession, 2);
                        } else {
                            ALog.e(FragmentationTask.TAG, "[fragmentation] task[" + i + "] multi-path timer exit with NULL multi-path session", FragmentationTask.access$100(FragmentationTask.this).seqNum, new Object[0]);
                        }
                    }
                }
            }
        }
    }
}
