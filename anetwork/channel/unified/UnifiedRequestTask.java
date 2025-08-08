package anetwork.channel.unified;

import android.os.Looper;
import android.support.v4.util.Pair;
import mtopsdk.common.util.StringUtils;
import anet.channel.AwcnConfig;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.fulltrace.AnalysisFactory;
import anet.channel.fulltrace.IFullTraceAnalysisV3;
import anet.channel.monitor.BandWidthSampler;
import anet.channel.request.FutureCancelable;
import anet.channel.request.Request;
import anet.channel.statist.ExceptionStatistic;
import anet.channel.statist.RequestStatistic;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.thread.ThreadPoolExecutorFactory;
import anet.channel.util.ALog;
import anet.channel.util.ErrorConstant;
import anet.channel.util.HttpUrl;
import anetwork.channel.aidl.DefaultFinishEvent;
import anetwork.channel.cache.Cache;
import anetwork.channel.cache.CacheManager;
import anetwork.channel.config.NetworkConfigCenter;
import anetwork.channel.entity.Repeater;
import anetwork.channel.entity.RequestConfig;
import anetwork.channel.interceptor.Callback;
import anetwork.channel.interceptor.Interceptor;
import anetwork.channel.interceptor.InterceptorManager;
import anetwork.channel.monitor.NetworkQoSCenter;
import anetwork.channel.util.RequestConstant;
import com.alipay.android.phone.mobilesdk.socketcraft.monitor.MonitorItemConstants;
import com.alipay.mobile.common.transportext.amnet.Baggage;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import tb.kge;
import tb.riy;

/* loaded from: classes.dex */
public class UnifiedRequestTask {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "anet.UnifiedRequestTask";
    public RequestContext rc;

    static {
        kge.a(-2077941075);
    }

    public static /* synthetic */ long access$000(UnifiedRequestTask unifiedRequestTask) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4164fa51", new Object[]{unifiedRequestTask})).longValue() : unifiedRequestTask.interceptorCostTime();
    }

    public static /* synthetic */ void access$100(UnifiedRequestTask unifiedRequestTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f3d94bc", new Object[]{unifiedRequestTask});
        } else {
            unifiedRequestTask.commitTimeoutTask();
        }
    }

    public static /* synthetic */ void access$200(UnifiedRequestTask unifiedRequestTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d162f1b", new Object[]{unifiedRequestTask});
        } else {
            unifiedRequestTask.submitMultiPathTask();
        }
    }

    public static /* synthetic */ void access$300(UnifiedRequestTask unifiedRequestTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("caeec97a", new Object[]{unifiedRequestTask});
        } else {
            unifiedRequestTask.submitVpnFastDegradeTask();
        }
    }

    public UnifiedRequestTask(RequestConfig requestConfig, Repeater repeater) {
        repeater.setSeqNo(requestConfig.seqNo);
        this.rc = new RequestContext(requestConfig, repeater);
    }

    /* loaded from: classes.dex */
    public class UnifiedRequestChain implements Interceptor.Chain {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private Callback callback;
        private int index;
        private Request request;

        static {
            kge.a(-1794934899);
            kge.a(1627465706);
        }

        public UnifiedRequestChain(int i, Request request, Callback callback) {
            this.index = 0;
            this.request = null;
            this.callback = null;
            this.index = i;
            this.request = request;
            this.callback = callback;
        }

        @Override // anetwork.channel.interceptor.Interceptor.Chain
        public Request request() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Request) ipChange.ipc$dispatch("d7ddfbbf", new Object[]{this}) : this.request;
        }

        @Override // anetwork.channel.interceptor.Interceptor.Chain
        public Callback callback() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Callback) ipChange.ipc$dispatch("6843dde0", new Object[]{this}) : this.callback;
        }

        @Override // anetwork.channel.interceptor.Interceptor.Chain
        public Future proceed(Request request, Callback callback) {
            boolean z;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Future) ipChange.ipc$dispatch("4fdb72c6", new Object[]{this, request, callback});
            }
            if (UnifiedRequestTask.this.rc.isDone.get()) {
                ALog.i(UnifiedRequestTask.TAG, "request canneled or timeout in processing interceptor", request.getSeq(), new Object[0]);
                return null;
            }
            if (this.index < InterceptorManager.getSize()) {
                UnifiedRequestTask.this.rc.config.rs.lastInterceptorStartTime = UnifiedRequestTask.access$000(UnifiedRequestTask.this);
                Pair<Integer, Interceptor> interceptor = InterceptorManager.getInterceptor(this.index, UnifiedRequestTask.this.rc.config.getInterceptorOptType());
                if (!interceptor.equals(null)) {
                    this.index = interceptor.first.intValue();
                    Interceptor interceptor2 = interceptor.second;
                    if (this.index < InterceptorManager.getSize() && interceptor2 != null) {
                        ALog.e(UnifiedRequestTask.TAG, "[Interceptor] proceed", UnifiedRequestTask.this.rc.seqNum, "interceptorOptType", Long.valueOf(UnifiedRequestTask.this.rc.config.getInterceptorOptType()), "index", Integer.valueOf(this.index), "currentInterceptor", interceptor2.toString());
                        UnifiedRequestTask.this.rc.config.rs.lastInterceptor = interceptor2.toString();
                        return interceptor2.intercept(new UnifiedRequestChain(this.index + 1, request, callback));
                    }
                    String str = "";
                    if (this.index > InterceptorManager.getSize()) {
                        str = str + "index > " + InterceptorManager.getSize();
                    }
                    if (interceptor2 == null) {
                        str = str + "currentInterceptor null";
                    }
                    ALog.e(UnifiedRequestTask.TAG, "[Interceptor] proceed, " + str, UnifiedRequestTask.this.rc.seqNum, "interceptorOptType", Long.valueOf(UnifiedRequestTask.this.rc.config.getInterceptorOptType()), "index", Integer.valueOf(this.index));
                } else {
                    ALog.e(UnifiedRequestTask.TAG, "[Interceptor] proceed, currInterceptorPair null", UnifiedRequestTask.this.rc.seqNum, "interceptorOptType", Long.valueOf(UnifiedRequestTask.this.rc.config.getInterceptorOptType()), "index", Integer.valueOf(this.index));
                }
                z = true;
            } else {
                z = false;
            }
            if (this.index < InterceptorManager.getSize() && !z) {
                return null;
            }
            UnifiedRequestTask.access$000(UnifiedRequestTask.this);
            UnifiedRequestTask.this.rc.config.setAwcnRequest(request);
            UnifiedRequestTask.this.rc.callback = callback;
            ALog.e(UnifiedRequestTask.TAG, "start task", UnifiedRequestTask.this.rc.seqNum, " bizReqId", UnifiedRequestTask.this.rc.config.bizReqId);
            Cache cache = NetworkConfigCenter.isHttpCacheEnable() ? CacheManager.getCache(UnifiedRequestTask.this.rc.config.getUrlString(), UnifiedRequestTask.this.rc.config.getHeaders()) : null;
            boolean z2 = cache != null;
            boolean isDownloaderAsync = AwcnConfig.isDownloaderAsync();
            boolean isQoSAsync = UnifiedRequestTask.this.rc.config.isQoSAsync();
            UnifiedRequestTask.this.rc.config.rs.envinfo4AsyncDownload = isDownloaderAsync + "_" + isQoSAsync;
            if (isDownloaderAsync && isQoSAsync) {
                ALog.e(UnifiedRequestTask.TAG, "[RemoteFeatureQoS] proceed: " + UnifiedRequestTask.this.rc.config.getUrlString(), UnifiedRequestTask.this.rc.seqNum, " bizReqId", UnifiedRequestTask.this.rc.config.bizReqId);
                QosTaskQueue.getInstance().offerRequest(UnifiedRequestTask.this.rc);
                return null;
            }
            if (UnifiedRequestTask.this.rc.config.isBizRangeEnable()) {
                ArrayList<NetworkQoSCenter.FragmentationRecommender.Fragment> fragmentationControl = UnifiedRequestTask.this.rc.config.getFragmentationControl();
                if (fragmentationControl != null && fragmentationControl.size() > 0) {
                    UnifiedRequestTask.this.rc.config.rs.fragmented = true;
                    QosTaskQueue.startFragmentsTasks(UnifiedRequestTask.this.rc, fragmentationControl);
                    return null;
                }
                ALog.e(UnifiedRequestTask.TAG, "[fragmentation] onFragmentationContext() with DEGRADED origin path", UnifiedRequestTask.this.rc.seqNum, " bizReqId", UnifiedRequestTask.this.rc.config.bizReqId);
            }
            UnifiedRequestTask.this.rc.config.rs.fragmented = false;
            if (AwcnConfig.isWifiUnavailableUseCellOptOpened() && UnifiedRequestTask.this.rc.config.isDetectReq()) {
                UnifiedRequestTask.this.rc.runningTask = new NetworkTask(UnifiedRequestTask.this.rc, null, null);
                UnifiedRequestTask.this.rc.runningTask.run();
                ALog.e(UnifiedRequestTask.TAG, "[wifi fg detect opt] detect request run!", UnifiedRequestTask.this.rc.seqNum, "host", UnifiedRequestTask.this.rc.config.getHost());
                UnifiedRequestTask.access$100(UnifiedRequestTask.this);
                return null;
            }
            UnifiedRequestTask.this.rc.runningTask = z2 ? new CacheTask(UnifiedRequestTask.this.rc, cache) : new NetworkTask(UnifiedRequestTask.this.rc, null, null);
            if (z2) {
                ThreadPoolExecutorFactory.submitPriorityTask(UnifiedRequestTask.this.rc.runningTask, ThreadPoolExecutorFactory.Priority.NORMAL);
            } else {
                UnifiedRequestTask.access$200(UnifiedRequestTask.this);
                if (AwcnConfig.isVpnOptOpened()) {
                    UnifiedRequestTask.access$300(UnifiedRequestTask.this);
                }
                UnifiedRequestTask.this.rc.runningTask.run();
            }
            UnifiedRequestTask.access$100(UnifiedRequestTask.this);
            return null;
        }
    }

    private long interceptorCostTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("54a3ea7a", new Object[]{this})).longValue();
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (this.rc.config.rs.lastInterceptor != null && !this.rc.config.rs.lastInterceptor.isEmpty() && this.rc.config.rs.lastInterceptorStartTime != -1) {
            long j = currentTimeMillis - this.rc.config.rs.lastInterceptorStartTime;
            if (this.rc.config.rs.lastInterceptor.toLowerCase().contains(Baggage.Amnet.CFG_SSL)) {
                this.rc.config.rs.secInterceptorTime += j;
            }
            if (this.rc.config.rs.lastInterceptor.toLowerCase().contains("aliprivacyext")) {
                this.rc.config.rs.privacyInterceptorTime += j;
            }
            this.rc.config.rs.interceptorTime += j;
            ALog.e(TAG, "[Interceptor] interceptorCostTime", this.rc.seqNum, "costTime", Long.valueOf(j), "secInterceptorTime", Long.valueOf(this.rc.config.rs.secInterceptorTime), "privacyInterceptorTime", Long.valueOf(this.rc.config.rs.privacyInterceptorTime), "interceptorTime", Long.valueOf(this.rc.config.rs.interceptorTime));
        }
        return currentTimeMillis;
    }

    private void submitMultiPathTask() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8fe9172", new Object[]{this});
        } else if (!NetworkConfigCenter.isMultiPathABEnable() || !NetworkConfigCenter.isMultiPathOpened() || NetworkStatusHelper.getCellularNetwork() == null) {
        } else {
            if ((!NetworkConfigCenter.isMultiPathBizInWhiteList(this.rc.config.getAwcnRequest().getBizId()) || !"picture".equalsIgnoreCase(this.rc.config.getFlowRefer())) && !NetworkConfigCenter.isMultiPathUrlInWhiteList(this.rc.config.getHttpUrl())) {
                return;
            }
            if (GlobalAppRuntimeInfo.isAppBackground()) {
                ALog.e(TAG, "[submitMultiPathTask]not allow to use multi path in background.", this.rc.seqNum, " bizReqId", this.rc.config.bizReqId);
                return;
            }
            if (this.rc.config.getAwcnRequest().rs.retryTimes > 0 && this.rc.config.rs.retryTimes <= this.rc.config.rs.maxRetryTime) {
                Request.Builder newBuilder = this.rc.config.getAwcnRequest().newBuilder();
                newBuilder.addHeader("x-nw-retry", "true");
                this.rc.config.setAwcnRequest(newBuilder.build());
            }
            if (!this.rc.config.isAllowRetry()) {
                ALog.e(TAG, "[submitMultiPathTask]not allow to retry.", this.rc.seqNum, " bizReqId", this.rc.config.bizReqId);
                return;
            }
            RequestContext requestContext = this.rc;
            requestContext.multiPathTask = new MultiPathTask(requestContext);
            this.rc.config.rs.allowMultiPath = 1;
            ThreadPoolExecutorFactory.submitScheduledTask(new Runnable() { // from class: anetwork.channel.unified.UnifiedRequestTask.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (UnifiedRequestTask.this.rc.isDone.get()) {
                    } else {
                        ALog.e(UnifiedRequestTask.TAG, "[submitMultiPathTask]request is in multi path white list.", UnifiedRequestTask.this.rc.seqNum, " bizReqId", UnifiedRequestTask.this.rc.config.bizReqId);
                        if (UnifiedRequestTask.this.rc.multiPathTask == null || UnifiedRequestTask.this.rc.multiPathTask.isCanceled()) {
                            return;
                        }
                        ThreadPoolExecutorFactory.submitBackupTask(UnifiedRequestTask.this.rc.multiPathTask);
                    }
                }
            }, NetworkConfigCenter.getMultiPathTriggerTime(), TimeUnit.MILLISECONDS);
        }
    }

    private void submitVpnFastDegradeTask() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ec3124a", new Object[]{this});
        } else if (!NetworkStatusHelper.isVpn() || !AwcnConfig.isVpnFastDegradeEnable() || !AwcnConfig.isVpnFastDegradeABEnable()) {
        } else {
            if (!AwcnConfig.inVpnFastDegradeHostWhiteList(this.rc.config.getHost()) && (!AwcnConfig.inVpnFastDegradBizIdWhiteList(this.rc.config.getAwcnRequest().getBizId()) || !"picture".equalsIgnoreCase(this.rc.config.getFlowRefer()))) {
                return;
            }
            if (GlobalAppRuntimeInfo.isAppBackground()) {
                ALog.e(TAG, "[ap] [submitVpnFastDegradeTask]not allow submitVpnFastDegradeTask in background.", this.rc.seqNum, " bizReqId", this.rc.config.bizReqId);
            } else if (!this.rc.config.isAllowRetry()) {
                ALog.e(TAG, "[submitVpnFastDegradeTask]not allow to retry.", this.rc.seqNum, " bizReqId", this.rc.config.bizReqId);
            } else {
                RequestContext requestContext = this.rc;
                requestContext.vpnFastDegradeTask = new MultiPathTask(requestContext);
                this.rc.config.rs.allowVpnFastDegrade = 1;
                this.rc.vpnFastDegradeTask.setVpnFastDegradeTaskFlag(true);
                ThreadPoolExecutorFactory.submitScheduledTask(new Runnable() { // from class: anetwork.channel.unified.UnifiedRequestTask.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else if (UnifiedRequestTask.this.rc.isDone.get()) {
                        } else {
                            ALog.e(UnifiedRequestTask.TAG, "[submitVpnFastDegradeTask] request is in Vpn Fast Degrade white list.", UnifiedRequestTask.this.rc.seqNum, " bizReqId", UnifiedRequestTask.this.rc.config.bizReqId);
                            if (UnifiedRequestTask.this.rc.vpnFastDegradeTask == null || UnifiedRequestTask.this.rc.vpnFastDegradeTask.isCanceled()) {
                                return;
                            }
                            ThreadPoolExecutorFactory.submitBackupTask(UnifiedRequestTask.this.rc.vpnFastDegradeTask);
                        }
                    }
                }, AwcnConfig.getVpnFastDegradTime(), TimeUnit.MILLISECONDS);
            }
        }
    }

    public Future request() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Future) ipChange.ipc$dispatch("cb4b1a2c", new Object[]{this});
        }
        long currentTimeMillis = System.currentTimeMillis();
        this.rc.config.rs.reqServiceTransmissionEnd = currentTimeMillis;
        this.rc.config.rs.start = currentTimeMillis;
        this.rc.config.rs.fisrtStart = currentTimeMillis;
        this.rc.config.rs.isReqSync = this.rc.config.isSyncRequest();
        this.rc.config.rs.isReqMain = Looper.myLooper() == Looper.getMainLooper();
        this.rc.config.rs.multiPathOpened = NetworkConfigCenter.isMultiPathOpened() ? 1 : 0;
        this.rc.config.rs.mpquicOpened = NetworkConfigCenter.isMPQuicOpened() ? 1 : 0;
        try {
            this.rc.config.rs.netReqStart = Long.valueOf(this.rc.config.getRequestProperty(RequestConstant.KEY_REQ_START)).longValue();
        } catch (Exception unused) {
        }
        IFullTraceAnalysisV3.ISpan createRequest = AnalysisFactory.getV3Instance().createRequest(this.rc.config.getRequestProperties());
        if (createRequest != null) {
            this.rc.config.rs.span = createRequest;
            IFullTraceAnalysisV3 v3Instance = AnalysisFactory.getV3Instance();
            v3Instance.log(createRequest, "netReqStart", "url=" + this.rc.config.getUrlString());
        }
        String requestProperty = this.rc.config.getRequestProperty(RequestConstant.KEY_TRACE_ID);
        if (!StringUtils.isEmpty(requestProperty)) {
            this.rc.config.rs.falcoId = requestProperty;
        }
        String requestProperty2 = this.rc.config.getRequestProperty(RequestConstant.KEY_REQ_PROCESS);
        this.rc.config.rs.process = requestProperty2;
        this.rc.config.rs.pTraceId = this.rc.config.getRequestProperty(RequestConstant.KEY_PARENT_TRACE_ID);
        ALog.e(TAG, "[falcoId:" + requestProperty + riy.ARRAY_END_STR + "start", this.rc.seqNum, "bizId", this.rc.config.getAwcnRequest().getBizId(), "processFrom", requestProperty2, "url", this.rc.config.getUrlString());
        this.rc.config.rs.topic = this.rc.config.getRequestProperty("biz-topic");
        if (NetworkConfigCenter.isUrlInDegradeList(this.rc.config.getHttpUrl())) {
            DegradeTask degradeTask = new DegradeTask(this.rc);
            this.rc.runningTask = degradeTask;
            degradeTask.cancelable = new FutureCancelable(ThreadPoolExecutorFactory.submitBackupTask(new Runnable() { // from class: anetwork.channel.unified.UnifiedRequestTask.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        UnifiedRequestTask.this.rc.runningTask.run();
                    }
                }
            }), this.rc.config.getAwcnRequest().getSeq());
            commitTimeoutTask();
            return new FutureResponse(this);
        }
        if (AwcnConfig.isQoSQueueABSwitch) {
            ThreadPoolExecutorFactory.submitPriorityTaskEx(new Runnable() { // from class: anetwork.channel.unified.UnifiedRequestTask.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    UnifiedRequestTask.this.rc.config.setInterceptorOptEnable();
                    UnifiedRequestTask.this.rc.config.rs.threadStartWaitTime = System.currentTimeMillis() - UnifiedRequestTask.this.rc.config.rs.start;
                    UnifiedRequestTask unifiedRequestTask = UnifiedRequestTask.this;
                    new UnifiedRequestChain(0, unifiedRequestTask.rc.config.getAwcnRequest(), UnifiedRequestTask.this.rc.callback).proceed(UnifiedRequestTask.this.rc.config.getAwcnRequest(), UnifiedRequestTask.this.rc.callback);
                }
            }, NetworkQoSCenter.getRequestPriority(this.rc.config));
        } else {
            ThreadPoolExecutorFactory.submitPriorityTask(new Runnable() { // from class: anetwork.channel.unified.UnifiedRequestTask.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    UnifiedRequestTask.this.rc.config.setInterceptorOptEnable();
                    UnifiedRequestTask.this.rc.config.rs.threadStartWaitTime = System.currentTimeMillis() - UnifiedRequestTask.this.rc.config.rs.start;
                    UnifiedRequestTask unifiedRequestTask = UnifiedRequestTask.this;
                    new UnifiedRequestChain(0, unifiedRequestTask.rc.config.getAwcnRequest(), UnifiedRequestTask.this.rc.callback).proceed(UnifiedRequestTask.this.rc.config.getAwcnRequest(), UnifiedRequestTask.this.rc.callback);
                }
            }, ThreadPoolExecutorFactory.Priority.HIGH);
        }
        return new FutureResponse(this);
    }

    private void commitTimeoutTask() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3a949d6", new Object[]{this});
        } else {
            this.rc.timeoutTask = ThreadPoolExecutorFactory.submitScheduledTask(new Runnable() { // from class: anetwork.channel.unified.UnifiedRequestTask.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (!UnifiedRequestTask.this.rc.isDone.compareAndSet(false, true)) {
                    } else {
                        RequestStatistic requestStatistic = UnifiedRequestTask.this.rc.config.rs;
                        if (requestStatistic.isDone.compareAndSet(false, true)) {
                            requestStatistic.statusCode = -202;
                            requestStatistic.msg = ErrorConstant.getErrMsg(-202);
                            requestStatistic.rspEnd = System.currentTimeMillis();
                            AnalysisFactory.getV3Instance().log(requestStatistic.span, "netRspRecvEnd", null);
                            ALog.e(UnifiedRequestTask.TAG, "task time out", UnifiedRequestTask.this.rc.seqNum, "rs", requestStatistic, " bizReqId", UnifiedRequestTask.this.rc.config.bizReqId);
                            AppMonitor.getInstance().commitStat(new ExceptionStatistic(-202, null, requestStatistic, null));
                        }
                        UnifiedRequestTask.this.rc.cancelRunningTask();
                        UnifiedRequestTask.this.rc.cancelMultiPathTask();
                        UnifiedRequestTask.this.rc.cancelVpnFastDegradeTask();
                        UnifiedRequestTask.this.rc.callback.onFinish(new DefaultFinishEvent(-202, (String) null, UnifiedRequestTask.this.rc.config.getAwcnRequest()));
                    }
                }
            }, this.rc.config.getWaitTimeout(), TimeUnit.MILLISECONDS);
        }
    }

    public void cancelTask() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("745ee826", new Object[]{this});
            return;
        }
        if (this.rc.config.isBizRangeEnable() && this.rc.config.rs.fragmented) {
            this.rc.fragmentationAggregator.cancelAllTask();
            HttpUrl httpUrl = this.rc.config.getHttpUrl();
            String str = this.rc.seqNum;
            Object[] objArr = new Object[4];
            objArr[0] = MonitorItemConstants.KEY_URL;
            objArr[1] = httpUrl != null ? httpUrl.simpleUrlString() : null;
            objArr[2] = " bizReqId";
            objArr[3] = this.rc.config.bizReqId;
            ALog.e(TAG, "[fragmentation] cancel all task", str, objArr);
        }
        if (!this.rc.isDone.compareAndSet(false, true)) {
            return;
        }
        ALog.e(TAG, "task cancelled", this.rc.seqNum, MonitorItemConstants.KEY_URL, this.rc.config.getHttpUrl().simpleUrlString(), " bizReqId", this.rc.config.bizReqId);
        RequestStatistic requestStatistic = this.rc.config.rs;
        if (requestStatistic.isDone.compareAndSet(false, true)) {
            requestStatistic.ret = 2;
            requestStatistic.statusCode = ErrorConstant.ERROR_REQUEST_CANCEL;
            requestStatistic.msg = ErrorConstant.getErrMsg(ErrorConstant.ERROR_REQUEST_CANCEL);
            requestStatistic.rspEnd = System.currentTimeMillis();
            AnalysisFactory.getV3Instance().log(requestStatistic.span, "netRspRecvEnd", null);
            AppMonitor.getInstance().commitStat(new ExceptionStatistic(ErrorConstant.ERROR_REQUEST_CANCEL, null, requestStatistic, null));
            if (requestStatistic.recDataSize > 102400) {
                BandWidthSampler.getInstance().onDataReceived(requestStatistic.sendStart, requestStatistic.rspEnd, requestStatistic.recDataSize);
            }
        }
        this.rc.cancelRunningTask();
        this.rc.cancelMultiPathTask();
        this.rc.cancelVpnFastDegradeTask();
        this.rc.cancelTimeoutTask();
        this.rc.callback.onFinish(new DefaultFinishEvent((int) ErrorConstant.ERROR_REQUEST_CANCEL, (String) null, this.rc.config.getAwcnRequest()));
    }
}
