package anet.channel;

import android.content.Context;
import android.content.Intent;
import mtopsdk.common.util.StringUtils;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.detect.Ipv6Detector;
import anet.channel.detect.WifiDetector;
import anet.channel.entity.ConnInfo;
import anet.channel.entity.ConnType;
import anet.channel.entity.Event;
import anet.channel.entity.EventCb;
import anet.channel.entity.EventType;
import anet.channel.entity.ProtocolType;
import anet.channel.entity.SessionType;
import anet.channel.flow.NetworkAnalysis;
import anet.channel.quic.Http3ConnectionDetector;
import anet.channel.session.HttpSession;
import anet.channel.session.TnetSpdySession;
import anet.channel.statist.AlarmObject;
import anet.channel.statist.SessionConnStat;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.strategy.ConnEvent;
import anet.channel.strategy.IConnStrategy;
import anet.channel.strategy.IStrategyInstance;
import anet.channel.strategy.StrategyCenter;
import anet.channel.strategy.utils.Utils;
import anet.channel.thread.ThreadPoolExecutorFactory;
import anet.channel.util.ALog;
import anet.channel.util.ComplexUtils;
import anet.channel.util.HttpConstant;
import anet.channel.util.Inet64Util;
import anet.channel.util.SessionSeq;
import anet.channel.util.StringUtils;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.container.a;
import com.taobao.tao.log.statistics.d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.kge;

/* loaded from: classes.dex */
public class SessionRequest {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "awcn.SessionRequest";
    public volatile Future complexFuture;
    public volatile Session connectingComplexSession;
    public volatile Session connectingMultiSession;
    public volatile Session connectingSession;
    private int hashCode;
    private boolean isContainHttp3;
    private String mHost;
    private String mRealHost;
    private SessionPool retryReqSessionPool;
    private SessionCenter sessionCenter;
    public volatile SessionComplexTask sessionComplexTask;
    private SessionInfo sessionInfo;
    private SessionPool sessionPool;
    private volatile Future timeoutTask;
    public volatile boolean isToClose = false;
    public volatile boolean isForceCellular = false;
    private AtomicBoolean mOneCreating = new AtomicBoolean(false);
    private HashMap<SessionGetCallback, SessionGetWaitTimeoutTask> callbackTaskMap = new HashMap<>();
    public SessionConnStat connStat = null;
    private Object locked = new Object();
    private AtomicBoolean isSuccess = new AtomicBoolean(false);
    private AtomicBoolean mConnecting = new AtomicBoolean(false);
    private AtomicBoolean isGetPubKeyFail = new AtomicBoolean(false);

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public interface IConnCb {
        void onDisConnect(Session session, long j, int i);

        void onFailed(Session session, long j, int i, int i2);

        void onSuccess(Session session, long j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public interface IOneSessionConnCb {
        void onCreateSessionFinish();
    }

    static {
        kge.a(588787608);
    }

    public static /* synthetic */ AtomicBoolean access$000(SessionRequest sessionRequest) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicBoolean) ipChange.ipc$dispatch("69ea452", new Object[]{sessionRequest}) : sessionRequest.mConnecting;
    }

    public static /* synthetic */ HashMap access$100(SessionRequest sessionRequest) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashMap) ipChange.ipc$dispatch("29777914", new Object[]{sessionRequest}) : sessionRequest.callbackTaskMap;
    }

    public static /* synthetic */ void access$1000(SessionRequest sessionRequest, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e824a57", new Object[]{sessionRequest, str, str2});
        } else {
            sessionRequest.updateForceCell(str, str2);
        }
    }

    public static /* synthetic */ void access$1100(SessionRequest sessionRequest, Context context, ConnInfo connInfo, IConnCb iConnCb, String str, boolean z, int i, IOneSessionConnCb iOneSessionConnCb, SessionParamStat sessionParamStat) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b10506d2", new Object[]{sessionRequest, context, connInfo, iConnCb, str, new Boolean(z), new Integer(i), iOneSessionConnCb, sessionParamStat});
        } else {
            sessionRequest.createSession(context, connInfo, iConnCb, str, z, i, iOneSessionConnCb, sessionParamStat);
        }
    }

    public static /* synthetic */ AtomicBoolean access$1200(SessionRequest sessionRequest) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicBoolean) ipChange.ipc$dispatch("c636ef81", new Object[]{sessionRequest}) : sessionRequest.isSuccess;
    }

    public static /* synthetic */ void access$1300(SessionRequest sessionRequest, Session session) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf3f0cf8", new Object[]{sessionRequest, session});
        } else {
            sessionRequest.commitSuccess(session);
        }
    }

    public static /* synthetic */ SessionInfo access$1400(SessionRequest sessionRequest) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SessionInfo) ipChange.ipc$dispatch("d044f601", new Object[]{sessionRequest}) : sessionRequest.sessionInfo;
    }

    public static /* synthetic */ SessionCenter access$1600(SessionRequest sessionRequest) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SessionCenter) ipChange.ipc$dispatch("6db12ebc", new Object[]{sessionRequest}) : sessionRequest.sessionCenter;
    }

    public static /* synthetic */ AtomicBoolean access$1700(SessionRequest sessionRequest) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicBoolean) ipChange.ipc$dispatch("433d879c", new Object[]{sessionRequest}) : sessionRequest.mOneCreating;
    }

    public static /* synthetic */ String access$1800(SessionRequest sessionRequest) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("cb640445", new Object[]{sessionRequest}) : sessionRequest.mHost;
    }

    public static /* synthetic */ void access$1900(SessionRequest sessionRequest, Session session, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ba191b", new Object[]{sessionRequest, session, new Integer(i), str});
        } else {
            sessionRequest.sendConnectInfoToAccs(session, i, str);
        }
    }

    public static /* synthetic */ AtomicBoolean access$200(SessionRequest sessionRequest) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicBoolean) ipChange.ipc$dispatch("38a14790", new Object[]{sessionRequest}) : sessionRequest.isGetPubKeyFail;
    }

    public static /* synthetic */ SessionPool access$300(SessionRequest sessionRequest) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SessionPool) ipChange.ipc$dispatch("fab5bbe3", new Object[]{sessionRequest}) : sessionRequest.retryReqSessionPool;
    }

    public static /* synthetic */ SessionPool access$400(SessionRequest sessionRequest) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SessionPool) ipChange.ipc$dispatch("b52b5c64", new Object[]{sessionRequest}) : sessionRequest.sessionPool;
    }

    public static /* synthetic */ void access$500(SessionRequest sessionRequest, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8944107", new Object[]{sessionRequest, new Boolean(z)});
        } else {
            sessionRequest.finish(z);
        }
    }

    public static /* synthetic */ void access$600(SessionRequest sessionRequest, Session session, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d317ff44", new Object[]{sessionRequest, session, new Integer(i), new Integer(i2)});
        } else {
            sessionRequest.commitFail(session, i, i2);
        }
    }

    public static /* synthetic */ List access$700(SessionRequest sessionRequest, List list, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("2bff47a1", new Object[]{sessionRequest, list, str}) : sessionRequest.getConnInfoList(list, str);
    }

    public static /* synthetic */ List access$800(SessionRequest sessionRequest, int i, int i2, String str, boolean z, SessionParamStat sessionParamStat) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("7e5b7290", new Object[]{sessionRequest, new Integer(i), new Integer(i2), str, new Boolean(z), sessionParamStat}) : sessionRequest.getAvailStrategy(i, i2, str, z, sessionParamStat);
    }

    public static /* synthetic */ String access$900(SessionRequest sessionRequest) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ebb382d7", new Object[]{sessionRequest}) : sessionRequest.mRealHost;
    }

    public synchronized void setForceCellular(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11d16da", new Object[]{this, new Boolean(z)});
        } else {
            this.isForceCellular = z;
        }
    }

    public SessionRequest(String str, SessionCenter sessionCenter) {
        this.mHost = str;
        String str2 = this.mHost;
        this.mRealHost = str2.substring(str2.indexOf(HttpConstant.SCHEME_SPLIT) + 3);
        this.sessionCenter = sessionCenter;
        this.sessionInfo = sessionCenter.attributeManager.getSessionInfo(this.mRealHost);
        this.sessionPool = sessionCenter.sessionPool;
        this.retryReqSessionPool = sessionCenter.retryReqSessionPool;
        this.hashCode = hashCode();
    }

    public String getHost() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c9fd6f9b", new Object[]{this}) : this.mHost;
    }

    public String getRealHost() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("89622e9d", new Object[]{this}) : this.mRealHost;
    }

    public void setConnecting(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32a1eb3", new Object[]{this, new Boolean(z)});
        } else {
            setConnecting(z, false);
        }
    }

    public void setConnecting(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("621a6a81", new Object[]{this, new Boolean(z), new Boolean(z2)});
            return;
        }
        this.mConnecting.set(z);
        if (!z) {
            if (this.timeoutTask != null) {
                this.timeoutTask.cancel(true);
                this.timeoutTask = null;
            }
            this.connectingSession = null;
            this.connectingComplexSession = null;
            if (this.complexFuture != null) {
                this.complexFuture.cancel(true);
                this.complexFuture = null;
            }
            this.sessionComplexTask = null;
            this.isSuccess.set(false);
        }
        if (!z2) {
            return;
        }
        this.connectingMultiSession = null;
    }

    /* loaded from: classes.dex */
    public class ConnectTimeoutTask implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public String seq;

        static {
            kge.a(-219223064);
            kge.a(-1390502639);
        }

        public ConnectTimeoutTask(String str) {
            this.seq = null;
            this.seq = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (!SessionRequest.access$000(SessionRequest.this).get()) {
            } else {
                ALog.e(SessionRequest.TAG, "Connecting timeout!!! reset status!", this.seq, new Object[0]);
                SessionRequest.this.connStat.ret = 2;
                SessionRequest.this.connStat.totalTime = System.currentTimeMillis() - SessionRequest.this.connStat.start;
                if (SessionRequest.this.connectingSession != null) {
                    SessionRequest.this.connectingSession.tryNextWhenFail = false;
                    SessionRequest.this.connectingSession.close("Connecting timeout");
                    SessionRequest.this.connStat.syncValueFromSession(SessionRequest.this.connectingSession);
                }
                if (SessionRequest.this.connectingComplexSession != null) {
                    SessionRequest.this.connectingComplexSession.tryNextWhenFail = false;
                    SessionRequest.this.connectingComplexSession.close("Connecting timeout");
                }
                AppMonitor.getInstance().commitStat(SessionRequest.this.connStat);
                SessionRequest.this.setConnecting(false);
            }
        }
    }

    /* loaded from: classes2.dex */
    public class SessionGetWaitTimeoutTask implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public SessionGetCallback cb;
        public AtomicBoolean isFinish = new AtomicBoolean(false);

        static {
            kge.a(170898085);
            kge.a(-1390502639);
        }

        public SessionGetWaitTimeoutTask(SessionGetCallback sessionGetCallback) {
            this.cb = null;
            this.cb = sessionGetCallback;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (!this.isFinish.compareAndSet(false, true)) {
            } else {
                ALog.e(SessionRequest.TAG, "get session timeout", null, new Object[0]);
                synchronized (SessionRequest.access$100(SessionRequest.this)) {
                    SessionRequest.access$100(SessionRequest.this).remove(this.cb);
                }
                this.cb.onSessionGetFail();
            }
        }
    }

    public synchronized void start(Context context, int i, int i2, String str, SessionGetCallback sessionGetCallback, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fea301d0", new Object[]{this, context, new Integer(i), new Integer(i2), str, sessionGetCallback, new Long(j)});
        } else {
            start(context, i, i2, str, sessionGetCallback, j, null);
        }
    }

    public synchronized void start(Context context, int i, int i2, String str, SessionGetCallback sessionGetCallback, long j, SessionParamStat sessionParamStat) {
        Session session;
        char c;
        List<ConnInfo> list;
        List<ConnInfo> complexIpList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f9106a7", new Object[]{this, context, new Integer(i), new Integer(i2), str, sessionGetCallback, new Long(j), sessionParamStat});
            return;
        }
        String createSequenceNo = StringUtils.isEmpty(str) ? SessionSeq.createSequenceNo(null) : str;
        String str2 = sessionParamStat == null ? "" : sessionParamStat.req;
        boolean z = sessionParamStat != null && sessionParamStat.isRetry;
        ALog.e(TAG, "SessionRequest start", createSequenceNo, "host", this.mHost, "sessionType", Integer.valueOf(i), "protocolType", Integer.valueOf(i2), "sessionRequest", Integer.valueOf(this.hashCode), "reqSeq", str2, d.PARAM_IS_RETRY, Boolean.valueOf(z));
        if (!this.mConnecting.compareAndSet(false, true)) {
            ALog.e(TAG, "session connecting", createSequenceNo, "host", getHost(), "reqSeq", str2);
            if (sessionGetCallback != null) {
                if (getConnectingType() == i && getConnectingProtocolType() == i2) {
                    SessionGetWaitTimeoutTask sessionGetWaitTimeoutTask = new SessionGetWaitTimeoutTask(sessionGetCallback);
                    synchronized (this.callbackTaskMap) {
                        this.callbackTaskMap.put(sessionGetCallback, sessionGetWaitTimeoutTask);
                    }
                    ThreadPoolExecutorFactory.submitScheduledTask(sessionGetWaitTimeoutTask, j, TimeUnit.MILLISECONDS);
                    return;
                }
                sessionGetCallback.onSessionGetFail();
            }
            return;
        }
        if (z) {
            session = this.retryReqSessionPool.getSessionByRetry(this, i, i2, sessionParamStat);
        } else {
            session = this.sessionPool.getSession(this, i, i2);
        }
        if (session != null) {
            ALog.e(TAG, "Available Session exist!!!", createSequenceNo, "reqSeq", str2);
            if (sessionGetCallback != null) {
                sessionGetCallback.onSessionGetSuccess(session);
            }
            finish();
            return;
        }
        setConnecting(true);
        this.timeoutTask = ThreadPoolExecutorFactory.submitScheduledTask(new ConnectTimeoutTask(createSequenceNo), 45L, TimeUnit.SECONDS);
        this.connStat = new SessionConnStat();
        this.connStat.start = System.currentTimeMillis();
        if (!NetworkStatusHelper.isConnected()) {
            if (ALog.isPrintLog(1)) {
                ALog.d(TAG, "network is not available, can't create session", createSequenceNo, "isConnected", Boolean.valueOf(NetworkStatusHelper.isConnected()), "reqSeq", str2);
            }
            finish();
            throw new RuntimeException("no network");
        }
        updateForceCell(createSequenceNo, sessionParamStat == null ? "" : sessionParamStat.req);
        String str3 = createSequenceNo;
        List<IConnStrategy> availStrategy = getAvailStrategy(i, i2, str3, this.isForceCellular, sessionParamStat);
        if (availStrategy.isEmpty()) {
            ALog.i(TAG, "no avalible strategy, can't create session", str3, "host", this.mHost, "sessionType", Integer.valueOf(i), "prototoclType", Integer.valueOf(i2), "reqSeq", str2);
            finish();
            throw new NoAvailStrategyException("no avalible strategy");
        }
        List<ConnInfo> connInfoList = getConnInfoList(availStrategy, str3);
        ConnInfo connInfo = connInfoList.get(0);
        if (AwcnConfig.isMultiConnectOpened() && AwcnConfig.isHostInMultiConnectWhiteList(this.mRealHost)) {
            createMultiSession(context, connInfoList, sessionParamStat);
            list = connInfoList;
            c = 0;
        } else {
            connInfoList.remove(0);
            c = 0;
            list = connInfoList;
            createSession(context, connInfo, new ConnCb(context, connInfoList, connInfo, sessionParamStat), connInfo.getSeq(), false, 0, null, sessionParamStat);
        }
        if (ComplexUtils.isAllowComplexConnect(this.mRealHost, connInfo.getIp()) && (complexIpList = ComplexUtils.getComplexIpList(this.connectingSession, list, 1)) != null && complexIpList.size() > 0) {
            long complexConnectDelayTime = ComplexUtils.getComplexConnectDelayTime();
            Object[] objArr = new Object[4];
            objArr[c] = "delay";
            objArr[1] = Long.valueOf(complexConnectDelayTime);
            objArr[2] = "reqSeq";
            objArr[3] = str2;
            ALog.d(TAG, "sessionComplexTask will start", null, objArr);
            this.sessionComplexTask = new SessionComplexTask(context, this, i, i2, complexIpList, sessionParamStat);
            this.complexFuture = ThreadPoolExecutorFactory.submitScheduledTask(this.sessionComplexTask, complexConnectDelayTime, TimeUnit.MILLISECONDS);
        }
        if (sessionGetCallback != null) {
            SessionGetWaitTimeoutTask sessionGetWaitTimeoutTask2 = new SessionGetWaitTimeoutTask(sessionGetCallback);
            synchronized (this.callbackTaskMap) {
                this.callbackTaskMap.put(sessionGetCallback, sessionGetWaitTimeoutTask2);
            }
            ThreadPoolExecutorFactory.submitScheduledTask(sessionGetWaitTimeoutTask2, j, TimeUnit.MILLISECONDS);
        }
    }

    private void updateForceCell(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f90223f", new Object[]{this, str, str2});
        } else if (WifiDetector.isForceCell(this.mRealHost, str)) {
            this.isForceCellular = true;
            ALog.e(TAG, "[wifi fg detect opt] session set force cell!", str, "reqSeq", str2);
        } else {
            this.isForceCellular = false;
        }
    }

    public synchronized void startAsync(Context context, int i, String str, SessionGetCallback sessionGetCallback, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b33d086d", new Object[]{this, context, new Integer(i), str, sessionGetCallback, new Long(j)});
        } else {
            startAsync(context, i, str, sessionGetCallback, j, false, null);
        }
    }

    public synchronized void startAsync(Context context, int i, String str, SessionGetCallback sessionGetCallback, long j, boolean z, SessionParamStat sessionParamStat) {
        Session session;
        char c;
        List<ConnInfo> list;
        int i2;
        List<ConnInfo> complexIpList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81764990", new Object[]{this, context, new Integer(i), str, sessionGetCallback, new Long(j), new Boolean(z), sessionParamStat});
            return;
        }
        String str2 = sessionParamStat == null ? "" : sessionParamStat.req;
        boolean z2 = sessionParamStat != null && sessionParamStat.isRetry;
        String createSequenceNo = StringUtils.isEmpty(str) ? SessionSeq.createSequenceNo(null) : str;
        ALog.e(TAG, "SessionRequest startAsync", createSequenceNo, "host", this.mHost, "type", Integer.valueOf(i), "reqSeq", str2, d.PARAM_IS_RETRY, Boolean.valueOf(z2));
        if (!this.mConnecting.compareAndSet(false, true)) {
            ALog.e(TAG, "session connecting", createSequenceNo, "host", getHost(), "reqSeq", str2);
            if (sessionGetCallback != null) {
                if (getConnectingType() == i) {
                    SessionGetWaitTimeoutTask sessionGetWaitTimeoutTask = new SessionGetWaitTimeoutTask(sessionGetCallback);
                    synchronized (this.callbackTaskMap) {
                        this.callbackTaskMap.put(sessionGetCallback, sessionGetWaitTimeoutTask);
                    }
                    ThreadPoolExecutorFactory.submitScheduledTask(sessionGetWaitTimeoutTask, j, TimeUnit.MILLISECONDS);
                    return;
                }
                sessionGetCallback.onSessionGetFail();
            }
            return;
        }
        if (sessionParamStat == null || sessionParamStat.sessionFlag != 0) {
            session = null;
        } else if (z2) {
            session = this.retryReqSessionPool.getSessionByRetry(this, i, ProtocolType.ALL, sessionParamStat);
        } else {
            session = this.sessionPool.getSession(this, i);
        }
        if (session != null) {
            ALog.d(TAG, "Available Session exist!!!", createSequenceNo, "reqSeq", str2);
            if (sessionGetCallback != null) {
                sessionGetCallback.onSessionGetSuccess(session);
            }
            finish();
            return;
        }
        setConnecting(true);
        this.timeoutTask = ThreadPoolExecutorFactory.submitScheduledTask(new ConnectTimeoutTask(createSequenceNo), 45L, TimeUnit.SECONDS);
        this.connStat = new SessionConnStat();
        this.connStat.start = System.currentTimeMillis();
        if (!NetworkStatusHelper.isConnected()) {
            if (ALog.isPrintLog(1)) {
                ALog.d(TAG, "network is not available, can't create session", createSequenceNo, "isConnected", Boolean.valueOf(NetworkStatusHelper.isConnected()), "reqSeq", str2);
            }
            finish();
            throw new RuntimeException("no network");
        }
        updateForceCell(createSequenceNo, sessionParamStat == null ? "" : sessionParamStat.req);
        String str3 = createSequenceNo;
        List<IConnStrategy> availStrategy = getAvailStrategy(i, ProtocolType.ALL, str3, z, sessionParamStat);
        if (availStrategy.isEmpty()) {
            ALog.i(TAG, "no avalible strategy, can't create session", str3, "host", this.mHost, "type", Integer.valueOf(i), "reqSeq", str2);
            finish();
            throw new NoAvailStrategyException("no avalible strategy");
        }
        List<ConnInfo> connInfoList = getConnInfoList(availStrategy, str3);
        ConnInfo connInfo = connInfoList.get(0);
        if (AwcnConfig.isMultiConnectOpened() && AwcnConfig.isHostInMultiConnectWhiteList(this.mRealHost)) {
            createMultiSession(context, connInfoList, sessionParamStat);
            list = connInfoList;
            i2 = 4;
            c = 0;
        } else {
            connInfoList.remove(0);
            c = 0;
            list = connInfoList;
            i2 = 4;
            createSession(context, connInfo, new ConnCb(context, connInfoList, connInfo, sessionParamStat), connInfo.getSeq(), false, 0, null, sessionParamStat);
        }
        if (ComplexUtils.isAllowComplexConnect(this.mRealHost, connInfo.getIp()) && (complexIpList = ComplexUtils.getComplexIpList(this.connectingSession, list, 1)) != null && complexIpList.size() > 0) {
            long complexConnectDelayTime = ComplexUtils.getComplexConnectDelayTime();
            Object[] objArr = new Object[i2];
            objArr[c] = "delay";
            objArr[1] = Long.valueOf(complexConnectDelayTime);
            objArr[2] = "reqSeq";
            objArr[3] = str2;
            ALog.e(TAG, "sessionComplexTask will start", null, objArr);
            this.sessionComplexTask = new SessionComplexTask(this, context, this, i, complexIpList, sessionParamStat);
            this.complexFuture = ThreadPoolExecutorFactory.submitScheduledTask(this.sessionComplexTask, complexConnectDelayTime, TimeUnit.MILLISECONDS);
        }
        SessionGetWaitTimeoutTask sessionGetWaitTimeoutTask2 = new SessionGetWaitTimeoutTask(sessionGetCallback);
        synchronized (this.callbackTaskMap) {
            this.callbackTaskMap.put(sessionGetCallback, sessionGetWaitTimeoutTask2);
        }
        ThreadPoolExecutorFactory.submitScheduledTask(sessionGetWaitTimeoutTask2, j, TimeUnit.MILLISECONDS);
    }

    /* loaded from: classes.dex */
    public class ConnCb implements IConnCb {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private ConnInfo connInfo;
        private Context context;
        public boolean isHandleFinish = false;
        private SessionParamStat stat;
        private List<ConnInfo> strategys;

        static {
            kge.a(-1612942505);
            kge.a(1309726024);
        }

        public static /* synthetic */ Context access$1500(ConnCb connCb) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("49b861db", new Object[]{connCb}) : connCb.context;
        }

        public ConnCb(Context context, List<ConnInfo> list, ConnInfo connInfo, SessionParamStat sessionParamStat) {
            this.context = context;
            this.strategys = list;
            this.connInfo = connInfo;
            this.stat = sessionParamStat;
        }

        @Override // anet.channel.SessionRequest.IConnCb
        public void onFailed(Session session, long j, int i, int i2) {
            IpChange ipChange = $ipChange;
            char c = 3;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5f785e9", new Object[]{this, session, new Long(j), new Integer(i), new Integer(i2)});
                return;
            }
            SessionParamStat sessionParamStat = this.stat;
            String str = sessionParamStat == null ? "" : sessionParamStat.req;
            SessionParamStat sessionParamStat2 = this.stat;
            boolean z = sessionParamStat2 != null && sessionParamStat2.isRetry;
            ALog.e(SessionRequest.TAG, "Connect failed", this.connInfo.getSeq(), MspGlobalDefine.SESSION, session, "host", SessionRequest.this.getHost(), "isHandleFinish", Boolean.valueOf(this.isHandleFinish), "reqSeq", str, d.PARAM_IS_RETRY, Boolean.valueOf(z));
            if (SessionRequest.this.isToClose) {
                SessionRequest.this.isToClose = false;
            } else if (!this.isHandleFinish) {
                this.isHandleFinish = true;
                if (!SessionRequest.access$000(SessionRequest.this).get()) {
                    return;
                }
                if (i2 == -3530) {
                    SessionRequest.access$200(SessionRequest.this).set(true);
                    ALog.e(SessionRequest.TAG, "[pubKey] isGetPubKeyFail true！" + session.toString(), "errorCode", Integer.valueOf(i2), "reqSeq", str);
                }
                if (z) {
                    SessionRequest.access$300(SessionRequest.this).remove(SessionRequest.this, session);
                } else {
                    SessionRequest.access$400(SessionRequest.this).remove(SessionRequest.this, session);
                }
                boolean z2 = AwcnConfig.isSocketBgOptEnable() && (i2 == -2611 || i2 == -2301);
                if (!session.tryNextWhenFail || !NetworkStatusHelper.isConnected() || this.strategys.isEmpty() || z2) {
                    SessionRequest.access$500(SessionRequest.this, session.isMultiSession);
                    SessionRequest.access$600(SessionRequest.this, session, i, i2);
                    synchronized (SessionRequest.access$100(SessionRequest.this)) {
                        for (Map.Entry entry : SessionRequest.access$100(SessionRequest.this).entrySet()) {
                            SessionGetWaitTimeoutTask sessionGetWaitTimeoutTask = (SessionGetWaitTimeoutTask) entry.getValue();
                            if (sessionGetWaitTimeoutTask.isFinish.compareAndSet(false, true)) {
                                ThreadPoolExecutorFactory.removeScheduleTask(sessionGetWaitTimeoutTask);
                                ((SessionGetCallback) entry.getKey()).onSessionGetFail();
                            }
                        }
                        SessionRequest.access$100(SessionRequest.this).clear();
                    }
                    if (!z2) {
                        return;
                    }
                    ALog.e(SessionRequest.TAG, "[bg_socket_opt] no socket read and write permissions in the background！" + session.toString(), "errorCode", Integer.valueOf(i2), "reqSeq", str);
                    throw new NoSocketPermissionInBgException("no socket permissions in background");
                }
                if (ALog.isPrintLog(1)) {
                    ALog.d(SessionRequest.TAG, "use next connInfo to create session", this.connInfo.getSeq(), "host", SessionRequest.this.getHost(), "reqSeq", str);
                }
                if (this.connInfo.retryTime == this.connInfo.maxRetryTime && (i2 == -2003 || i2 == -2410)) {
                    ListIterator<ConnInfo> listIterator = this.strategys.listIterator();
                    while (listIterator.hasNext()) {
                        if (session.getIp().equals(listIterator.next().strategy.getIp())) {
                            listIterator.remove();
                        }
                    }
                }
                if (Utils.isIPV6Address(session.getIp()) && (Ipv6Detector.detectIpv6Status() == 0 || Inet64Util.isIPv4OnlyNetwork())) {
                    ALog.e(SessionRequest.TAG, "[bg_socket_opt] ipv6 failed, remove all ipv6 strategys! strategy=" + this.strategys.toString(), session.mSeq, "detectIpv6Status", Integer.valueOf(Ipv6Detector.detectIpv6Status()), "isIPv4OnlyNetwork", Boolean.valueOf(Inet64Util.isIPv4OnlyNetwork()), "reqSeq", str);
                    ListIterator<ConnInfo> listIterator2 = this.strategys.listIterator();
                    while (listIterator2.hasNext()) {
                        if (Utils.isIPV6Address(listIterator2.next().strategy.getIp())) {
                            listIterator2.remove();
                        }
                    }
                    if (SessionRequest.this.complexFuture != null) {
                        if (!SessionRequest.this.complexFuture.isDone()) {
                            ALog.d(SessionRequest.TAG, "it already failed , so start complex task!", session.mSeq, "reqSeq", str);
                            SessionRequest.this.complexFuture.cancel(false);
                            ThreadPoolExecutorFactory.submitPriorityTask(SessionRequest.this.sessionComplexTask, ThreadPoolExecutorFactory.Priority.NORMAL);
                            return;
                        }
                        ALog.d(SessionRequest.TAG, "we already start complex!", session.mSeq, "reqSeq", str);
                        return;
                    }
                    List<ConnInfo> list = this.strategys;
                    if ((list == null || list.isEmpty()) && Inet64Util.getStackType() == 3) {
                        this.strategys = SessionRequest.access$700(SessionRequest.this, StrategyCenter.getInstance().getIpv4ConnStrategyListByHost(session.getRealHost(), SessionRequest.this.getHost().startsWith("https"), SessionRequest.this.getConnectingType()), session.mSeq);
                        ALog.e(SessionRequest.TAG, "ipv6 failed will retry with local dns ipv4 " + this.strategys.toString(), session.mSeq, "reqSeq", str);
                    }
                }
                if (this.connInfo.getConnType().isHTTP3() && GlobalAppRuntimeInfo.isAppBackground()) {
                    ListIterator<ConnInfo> listIterator3 = this.strategys.listIterator();
                    while (listIterator3.hasNext()) {
                        if (listIterator3.next().getConnType().isHTTP3()) {
                            listIterator3.remove();
                        }
                    }
                }
                ALog.e(SessionRequest.TAG, "[SessionOpt] Connect failed!!! start", this.connInfo.getSeq(), "host", SessionRequest.this.getHost(), "strategys", this.strategys, "isComplex", Boolean.valueOf(session.isComplex), "errorcode", Integer.valueOf(i2), "reqSeq", str);
                ListIterator<ConnInfo> listIterator4 = this.strategys.listIterator();
                int detectHttp3Status = Http3ConnectionDetector.detectHttp3Status();
                String uniqueId = NetworkStatusHelper.getUniqueId(NetworkStatusHelper.getStatus());
                boolean isHttp3Enable = AwcnConfig.isHttp3Enable();
                while (listIterator4.hasNext()) {
                    ConnInfo next = listIterator4.next();
                    if ((next.getConnType().equals(this.connInfo.getConnType()) && next.getPort() == this.connInfo.getPort() && next.getIp().equalsIgnoreCase(this.connInfo.getIp())) || (next.getConnType().isHTTP3() && (!isHttp3Enable || detectHttp3Status == 0))) {
                        listIterator4.remove();
                        String seq = this.connInfo.getSeq();
                        Object[] objArr = new Object[12];
                        objArr[0] = "host";
                        objArr[1] = SessionRequest.this.getHost();
                        objArr[2] = "connInfo";
                        objArr[c] = this.connInfo;
                        objArr[4] = "detectHttp3Status";
                        objArr[5] = Integer.valueOf(detectHttp3Status);
                        objArr[6] = "uniqueId";
                        objArr[7] = uniqueId;
                        objArr[8] = "isHttp3Enable";
                        objArr[9] = Boolean.valueOf(isHttp3Enable);
                        objArr[10] = "reqSeq";
                        objArr[11] = str;
                        ALog.e(SessionRequest.TAG, "[SessionOpt] Connect failed!!! remove connInfo!!", seq, objArr);
                    }
                    c = 3;
                }
                ALog.e(SessionRequest.TAG, "[SessionOpt] Connect failed!!! end", this.connInfo.getSeq(), "host", SessionRequest.this.getHost(), "strategys", this.strategys, "isComplex", Boolean.valueOf(session.isComplex), "reqSeq", str);
                if (AwcnConfig.isNetworkStatusOpt() && session.isNetworkStatusChangeDeprecated) {
                    this.strategys = SessionRequest.access$700(SessionRequest.this, SessionRequest.access$800(SessionRequest.this, session.getConnType().getType(), session.getConnType().getProtocolType(), this.connInfo.getSeq(), SessionRequest.this.isForceCellular, this.stat), this.connInfo.getSeq());
                    ALog.e(SessionRequest.TAG, "[network status opt] onFailed! strategys update!", this.connInfo.getSeq(), "host", SessionRequest.this.getHost(), "strategys", this.strategys, "reqSeq", str);
                }
                if (this.strategys.isEmpty()) {
                    SessionRequest.access$500(SessionRequest.this, session.isMultiSession);
                    SessionRequest.access$600(SessionRequest.this, session, i, i2);
                    synchronized (SessionRequest.access$100(SessionRequest.this)) {
                        for (Map.Entry entry2 : SessionRequest.access$100(SessionRequest.this).entrySet()) {
                            SessionGetWaitTimeoutTask sessionGetWaitTimeoutTask2 = (SessionGetWaitTimeoutTask) entry2.getValue();
                            if (sessionGetWaitTimeoutTask2.isFinish.compareAndSet(false, true)) {
                                ThreadPoolExecutorFactory.removeScheduleTask(sessionGetWaitTimeoutTask2);
                                ((SessionGetCallback) entry2.getKey()).onSessionGetFail();
                            }
                        }
                        SessionRequest.access$100(SessionRequest.this).clear();
                    }
                    return;
                }
                ConnInfo remove = this.strategys.remove(0);
                boolean z3 = AwcnConfig.isMultiConnectOpened() && AwcnConfig.isHostInMultiConnectWhiteList(SessionRequest.access$900(SessionRequest.this));
                SessionRequest sessionRequest = SessionRequest.this;
                String str2 = session.mSeq;
                SessionParamStat sessionParamStat3 = this.stat;
                SessionRequest.access$1000(sessionRequest, str2, sessionParamStat3 == null ? "" : sessionParamStat3.req);
                if (session.isComplex) {
                    SessionRequest sessionRequest2 = SessionRequest.this;
                    Context context = this.context;
                    sessionRequest2.createComplexSession(context, remove, new ConnCb(context, this.strategys, remove, this.stat), remove.getSeq(), z3, this.stat);
                    return;
                }
                SessionRequest sessionRequest3 = SessionRequest.this;
                Context context2 = this.context;
                SessionRequest.access$1100(sessionRequest3, context2, remove, new ConnCb(context2, this.strategys, remove, this.stat), remove.getSeq(), z3, 0, null, this.stat);
            }
        }

        @Override // anet.channel.SessionRequest.IConnCb
        public void onSuccess(Session session, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("357a84a1", new Object[]{this, session, new Long(j)});
                return;
            }
            SessionParamStat sessionParamStat = this.stat;
            String str = sessionParamStat == null ? "" : sessionParamStat.req;
            SessionParamStat sessionParamStat2 = this.stat;
            boolean z = sessionParamStat2 != null && sessionParamStat2.isRetry;
            ALog.d(SessionRequest.TAG, "Connect Success", this.connInfo.getSeq(), MspGlobalDefine.SESSION, session, "host", SessionRequest.this.getHost(), "reqSeq", str, d.PARAM_IS_RETRY, Boolean.valueOf(z));
            try {
                if (SessionRequest.this.isToClose) {
                    SessionRequest.this.isToClose = false;
                    session.close(false, "isToClose");
                    return;
                }
                if (AwcnConfig.isComplexConnectEnable() && ((!SessionRequest.access$1200(SessionRequest.this).compareAndSet(false, true) || !SessionRequest.access$000(SessionRequest.this).get()) && !session.isCreated && (!AwcnConfig.isMultiConnectOpened() || !AwcnConfig.isHostInMultiConnectWhiteList(SessionRequest.access$900(SessionRequest.this))))) {
                    ALog.e(SessionRequest.TAG, "session connect already finish", session.mSeq, "reqSeq", str);
                    session.close(false, "session_already_finish");
                }
                ALog.e(SessionRequest.TAG, "session connect Success", session.mSeq, "reqSeq", str, d.PARAM_IS_RETRY, Boolean.valueOf(z));
                if (z) {
                    SessionRequest.access$300(SessionRequest.this).add(SessionRequest.this, session);
                } else {
                    SessionRequest.access$400(SessionRequest.this).add(SessionRequest.this, session);
                }
                if (session.pubKeyMode == 0) {
                    SessionRequest.access$200(SessionRequest.this).set(false);
                    ALog.e(SessionRequest.TAG, "[pubKey] session isGetPubKeyFail Success", session.mSeq, "reqSeq", str);
                }
                SessionRequest.access$1300(SessionRequest.this, session);
                synchronized (SessionRequest.access$100(SessionRequest.this)) {
                    for (Map.Entry entry : SessionRequest.access$100(SessionRequest.this).entrySet()) {
                        SessionGetWaitTimeoutTask sessionGetWaitTimeoutTask = (SessionGetWaitTimeoutTask) entry.getValue();
                        if (sessionGetWaitTimeoutTask.isFinish.compareAndSet(false, true)) {
                            ThreadPoolExecutorFactory.removeScheduleTask(sessionGetWaitTimeoutTask);
                            ((SessionGetCallback) entry.getKey()).onSessionGetSuccess(session);
                        }
                    }
                    SessionRequest.access$100(SessionRequest.this).clear();
                }
                if (session.isComplex) {
                    if (SessionRequest.this.connectingSession != null && !SessionRequest.this.connectingSession.isAvailable()) {
                        SessionRequest.this.connectingSession.mSessionStat.isReported = false;
                        SessionRequest.this.connectingSession.close(false, "session_already_true");
                        ALog.e(SessionRequest.TAG, "Complex session is success, cancel connectingSession !", null, "host", SessionRequest.access$900(SessionRequest.this), "reqSeq", str);
                    }
                } else if (SessionRequest.this.complexFuture != null && !SessionRequest.this.complexFuture.isDone()) {
                    SessionRequest.this.complexFuture.cancel(true);
                    SessionRequest.this.complexFuture = null;
                    ALog.e(SessionRequest.TAG, " session is success, remove complex task !", null, "host", SessionRequest.access$900(SessionRequest.this), "reqSeq", str);
                } else if (SessionRequest.this.connectingComplexSession != null && !SessionRequest.this.connectingComplexSession.isAvailable()) {
                    SessionRequest.this.connectingComplexSession.mSessionStat.isReported = false;
                    SessionRequest.this.connectingComplexSession.close(false, "session_already_true");
                    ALog.e(SessionRequest.TAG, " session is success, cancel complex session !", SessionRequest.this.connectingComplexSession.mSeq, "host", SessionRequest.access$900(SessionRequest.this), "reqSeq", str);
                }
            } catch (Exception e) {
                ALog.e(SessionRequest.TAG, "[onSuccess]:", this.connInfo.getSeq(), e, new Object[0]);
            } finally {
                SessionRequest.access$500(SessionRequest.this, session.isMultiSession);
            }
        }

        @Override // anet.channel.SessionRequest.IConnCb
        public void onDisConnect(final Session session, long j, int i) {
            Session session2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cc0d5899", new Object[]{this, session, new Long(j), new Integer(i)});
                return;
            }
            SessionParamStat sessionParamStat = this.stat;
            String str = sessionParamStat == null ? "" : sessionParamStat.req;
            SessionParamStat sessionParamStat2 = this.stat;
            boolean z = sessionParamStat2 != null && sessionParamStat2.isRetry;
            boolean isAppBackground = GlobalAppRuntimeInfo.isAppBackground();
            boolean z2 = AwcnConfig.isNetworkStatusOpt() && session.isNetworkStatusChangeDeprecated;
            ALog.e(SessionRequest.TAG, "Connect Disconnect", this.connInfo.getSeq(), MspGlobalDefine.SESSION, session, "host", SessionRequest.this.getHost(), "appIsBg", Boolean.valueOf(isAppBackground), "isHandleFinish", Boolean.valueOf(this.isHandleFinish), "isNetworkStatusSession", Boolean.valueOf(z2), "autoReCreate", Boolean.valueOf(session.autoReCreate), "reqSeq", str, d.PARAM_IS_RETRY, Boolean.valueOf(z));
            if (z) {
                SessionRequest.access$300(SessionRequest.this).remove(SessionRequest.this, session);
            } else {
                SessionRequest.access$400(SessionRequest.this).remove(SessionRequest.this, session);
            }
            if (this.isHandleFinish) {
                return;
            }
            this.isHandleFinish = true;
            if (!session.autoReCreate) {
                return;
            }
            if (isAppBackground && (SessionRequest.access$1400(SessionRequest.this) == null || !SessionRequest.access$1400(SessionRequest.this).isAccs || AwcnConfig.isAccsSessionCreateForbiddenInBg())) {
                ALog.e(SessionRequest.TAG, "[onDisConnect]app background, don't Recreate", this.connInfo.getSeq(), MspGlobalDefine.SESSION, session, "reqSeq", str);
            } else if (!NetworkStatusHelper.isConnected()) {
                ALog.e(SessionRequest.TAG, "[onDisConnect]no network, don't Recreate", this.connInfo.getSeq(), MspGlobalDefine.SESSION, session, "reqSeq", str);
            } else {
                try {
                    if (z) {
                        session2 = SessionRequest.access$300(SessionRequest.this).getSessionByRetry(SessionRequest.this, SessionType.LONG_LINK, ProtocolType.ALL, this.stat);
                    } else {
                        session2 = SessionRequest.access$400(SessionRequest.this).getSession(SessionRequest.this, SessionType.LONG_LINK);
                    }
                    if (session2 != null) {
                        ALog.e(SessionRequest.TAG, "[onDisConnect]already have other session.", this.connInfo.getSeq(), "reqSeq", str);
                        return;
                    }
                    int i2 = 10000;
                    if (SessionRequest.access$1400(SessionRequest.this) != null && SessionRequest.access$1400(SessionRequest.this).isAccs) {
                        i2 = AwcnConfig.getAccsReconnectionDelayPeriod();
                    } else if (z2) {
                        i2 = 0;
                    }
                    ALog.e(SessionRequest.TAG, "session disconnected, try to recreate session.", this.connInfo.getSeq(), "delay period ", Integer.valueOf(i2), "isNetworkStatusSession", Boolean.valueOf(z2), "reqSeq", str);
                    ThreadPoolExecutorFactory.submitScheduledTask(new Runnable() { // from class: anet.channel.SessionRequest.ConnCb.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            try {
                                SessionRequest.this.start(ConnCb.access$1500(ConnCb.this), session.getConnType().getType(), session.getConnType().getProtocolType(), SessionSeq.createSequenceNo(SessionRequest.access$1600(SessionRequest.this).seqNum), null, 0L);
                            } catch (Exception unused) {
                            }
                        }
                    }, (long) (Math.random() * i2), TimeUnit.MILLISECONDS);
                } catch (Exception e) {
                    ALog.e(SessionRequest.TAG, "session disconnected, fail=" + e.toString(), this.connInfo.getSeq(), "reqSeq", str);
                }
            }
        }
    }

    private void commitSuccess(Session session) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2589f22b", new Object[]{this, session});
            return;
        }
        AlarmObject alarmObject = new AlarmObject();
        alarmObject.module = "networkPrefer";
        alarmObject.modulePoint = a.CONFIG_POLICY;
        alarmObject.arg = this.mHost;
        alarmObject.isSuccess = true;
        AppMonitor.getInstance().commitAlarm(alarmObject);
        this.connStat.syncValueFromSession(session);
        SessionConnStat sessionConnStat = this.connStat;
        sessionConnStat.ret = 1;
        sessionConnStat.totalTime = System.currentTimeMillis() - this.connStat.start;
        this.connStat.isComplex = session.mSessionStat.isComplex;
        this.connStat.isCreated = session.isCreated;
        SessionInfo sessionInfo = this.sessionInfo;
        if (sessionInfo != null && sessionInfo.isAccs) {
            List<Session> availableSessions = this.sessionPool.getAvailableSessions(this);
            this.connStat.sessionCount = availableSessions != null ? availableSessions.size() : 0;
            ALog.e(TAG, "[commitSuccess]", session.mSeq, "count", Integer.valueOf(this.connStat.sessionCount));
        }
        NetworkAnalysis.getInstance().createConnectCount(this.connStat.host, this.connStat.ip, this.connStat.protocolType);
        AppMonitor.getInstance().commitStat(this.connStat);
    }

    private void commitFail(Session session, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af5ada74", new Object[]{this, session, new Integer(i), new Integer(i2)});
        } else if (256 != i || i2 == -2613 || i2 == -2601) {
        } else {
            AlarmObject alarmObject = new AlarmObject();
            alarmObject.module = "networkPrefer";
            alarmObject.modulePoint = a.CONFIG_POLICY;
            alarmObject.arg = this.mHost;
            alarmObject.errorCode = String.valueOf(i2);
            alarmObject.isSuccess = false;
            AppMonitor.getInstance().commitAlarm(alarmObject);
            SessionConnStat sessionConnStat = this.connStat;
            sessionConnStat.ret = 0;
            sessionConnStat.appendErrorTrace(i2);
            this.connStat.errorCode = String.valueOf(i2);
            this.connStat.totalTime = System.currentTimeMillis() - this.connStat.start;
            this.connStat.syncValueFromSession(session);
            this.connStat.isComplex = session.mSessionStat.isComplex;
            if (!session.mSessionStat.isReported) {
                this.connStat.ret = 2;
            }
            AppMonitor.getInstance().commitStat(this.connStat);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0098 A[Catch: Throwable -> 0x014e, TryCatch #0 {Throwable -> 0x014e, blocks: (B:7:0x0045, B:9:0x004f, B:11:0x0052, B:13:0x0064, B:15:0x0075, B:20:0x007f, B:22:0x0085, B:26:0x008e, B:27:0x0092, B:29:0x0098, B:31:0x00a8, B:33:0x00ae, B:35:0x00b2, B:37:0x00b8, B:39:0x00bc, B:43:0x00c5, B:45:0x00cf, B:47:0x00d5, B:49:0x00df, B:51:0x00e5, B:53:0x00e9, B:55:0x00ef, B:56:0x00f3, B:58:0x00f8, B:62:0x0132, B:64:0x013e, B:68:0x0144, B:61:0x0130), top: B:73:0x0045 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.util.List<anet.channel.strategy.IConnStrategy> getAvailStrategy(int r20, int r21, java.lang.String r22, boolean r23, anet.channel.SessionParamStat r24) {
        /*
            Method dump skipped, instructions count: 341
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: anet.channel.SessionRequest.getAvailStrategy(int, int, java.lang.String, boolean, anet.channel.SessionParamStat):java.util.List");
    }

    private List<ConnInfo> getConnInfoList(List<IConnStrategy> list, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("c62dcb57", new Object[]{this, list, str});
        }
        if (list == null || list.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        this.isContainHttp3 = false;
        int i = 0;
        int i2 = 0;
        while (i < list.size()) {
            IConnStrategy iConnStrategy = list.get(i);
            int retryTimes = iConnStrategy.getRetryTimes();
            int i3 = i2;
            for (int i4 = 0; i4 <= retryTimes; i4++) {
                i3++;
                String host = getHost();
                ConnInfo connInfo = new ConnInfo(host, str + "_" + i3, iConnStrategy);
                connInfo.retryTime = i4;
                connInfo.maxRetryTime = retryTimes;
                arrayList.add(connInfo);
                if (connInfo.getConnType().isHTTP3()) {
                    this.isContainHttp3 = true;
                }
            }
            i++;
            i2 = i3;
        }
        return arrayList;
    }

    private void createMultiSession(Context context, List<ConnInfo> list, SessionParamStat sessionParamStat) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b4d60de", new Object[]{this, context, list, sessionParamStat});
            return;
        }
        try {
            int i = GlobalAppRuntimeInfo.getSessionIndex(this.mRealHost) == 1 ? 2 : 1;
            if (list != null && !list.isEmpty()) {
                ConnInfo remove = list.remove(0);
                createSession(context, remove, new ConnCb(context, list, remove, sessionParamStat), remove.getSeq(), true, i, null, sessionParamStat);
            }
        } catch (Throwable th) {
            ALog.e(TAG, "[multiConnect] [createMultiSession] fail = " + th.toString(), null, new Object[0]);
        }
    }

    public void createOneSession(Session session, int i, int i2, final String str) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f511575", new Object[]{this, session, new Integer(i), new Integer(i2), str});
        } else if (!AwcnConfig.isMultiConnectOpened() || !AwcnConfig.isHostInMultiConnectWhiteList(this.mRealHost)) {
        } else {
            try {
            } catch (Throwable th) {
                th = th;
                z = false;
            }
            try {
                if (this.mOneCreating.get()) {
                    ALog.e(TAG, "[multiConnect] [createOneSession] creating session", str, "host", this.mHost);
                    return;
                }
                this.mOneCreating.set(true);
                ALog.e(TAG, "[multiConnect] only one session [" + session.toString() + "], to createOneSession", str, new Object[0]);
                updateForceCell(str, "");
                List<IConnStrategy> availStrategy = getAvailStrategy(i, i2, str, this.isForceCellular, null);
                if (availStrategy.isEmpty()) {
                    this.mOneCreating.set(false);
                    ALog.e(TAG, "[multiConnect] [createOneSession] no avalible strategy, can't create session", str, "host", this.mHost);
                    return;
                }
                List<ConnInfo> connInfoList = getConnInfoList(availStrategy, str);
                ConnInfo remove = connInfoList.remove(0);
                Context context = GlobalAppRuntimeInfo.getContext();
                createSession(context, remove, new ConnCb(context, connInfoList, remove, null), remove.getSeq(), true, session.countIndex.get() == 1 ? 2 : 1, new IOneSessionConnCb() { // from class: anet.channel.SessionRequest.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // anet.channel.SessionRequest.IOneSessionConnCb
                    public void onCreateSessionFinish() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("40d00055", new Object[]{this});
                            return;
                        }
                        SessionRequest.access$1700(SessionRequest.this).set(false);
                        ALog.e(SessionRequest.TAG, "[multiConnect] [createOneSession] onCreateSessionFinish", str, "host", SessionRequest.access$1800(SessionRequest.this), "sessionModel");
                    }
                }, null);
            } catch (Throwable th2) {
                th = th2;
                this.mOneCreating.set(z);
                Object[] objArr = new Object[2];
                byte b = z ? 1 : 0;
                byte b2 = z ? 1 : 0;
                objArr[b] = "host";
                objArr[1] = this.mHost;
                ALog.e(TAG, "[multiConnect] [createOneSession] fail = " + th.toString(), str, objArr);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void createSession(Context context, ConnInfo connInfo, IConnCb iConnCb, String str, boolean z, int i, IOneSessionConnCb iOneSessionConnCb, SessionParamStat sessionParamStat) {
        HttpSession httpSession;
        TnetSpdySession tnetSpdySession;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("108114f1", new Object[]{this, context, connInfo, iConnCb, str, new Boolean(z), new Integer(i), iOneSessionConnCb, sessionParamStat});
            return;
        }
        ConnType connType = connInfo.getConnType();
        if (context != null && !connType.isHttpType()) {
            TnetSpdySession tnetSpdySession2 = new TnetSpdySession(context, connInfo);
            tnetSpdySession2.setForceCellular(this.isForceCellular);
            tnetSpdySession2.initConfig(this.sessionCenter.config);
            this.sessionInfo = this.sessionCenter.attributeManager.getSessionInfo(this.mRealHost);
            tnetSpdySession2.initSessionInfo(this.sessionInfo);
            tnetSpdySession2.setTnetPublicKey(this.sessionCenter.attributeManager.getPublicKey(this.mRealHost));
            if (this.isGetPubKeyFail.get()) {
                tnetSpdySession2.forcePubKeyMode.set(1);
            }
            IStrategyInstance strategyCenter = StrategyCenter.getInstance();
            tnetSpdySession2.mSessionStat.xqcConnEnv = tnetSpdySession2.mSessionStat.xqcConnEnv + "-isStrategyExistHttp3=" + strategyCenter.isContainHttp3() + "-isContainHttp3=" + this.isContainHttp3;
            if (z) {
                GlobalAppRuntimeInfo.updateSessionIndex(str, this.mRealHost);
            }
            if (i > 0) {
                tnetSpdySession2.mSeq += "_" + i;
                tnetSpdySession2.countIndex.set(i);
            }
            if (connType.isHTTP3()) {
                tnetSpdySession2.detectHttp3Status = strategyCenter.getDetectHttp3Status();
            }
            httpSession = tnetSpdySession2;
            tnetSpdySession = httpSession;
        } else {
            httpSession = new HttpSession(context, connInfo);
            tnetSpdySession = 0;
        }
        httpSession.setForceCellular(this.isForceCellular);
        if (z && this.connectingSession != null) {
            this.connectingMultiSession = httpSession;
            this.connectingMultiSession.isMultiSession = true;
            Object[] objArr = new Object[18];
            objArr[0] = HttpConstant.HOST;
            objArr[1] = getHost();
            objArr[2] = "Type";
            objArr[3] = connInfo.getConnType();
            objArr[4] = "IP";
            objArr[5] = connInfo.getIp();
            objArr[6] = "Port";
            objArr[7] = Integer.valueOf(connInfo.getPort());
            objArr[8] = "heartbeat";
            objArr[9] = Integer.valueOf(connInfo.getHeartbeat());
            objArr[10] = MspGlobalDefine.SESSION;
            objArr[11] = this.connectingMultiSession;
            objArr[12] = "enableMultiConn";
            objArr[13] = Boolean.valueOf(z);
            objArr[14] = "forcePubKeyMode";
            objArr[15] = this.connectingMultiSession != null ? this.connectingMultiSession.forcePubKeyMode : -2;
            objArr[16] = "reqSeq";
            objArr[17] = sessionParamStat == null ? "" : sessionParamStat.req;
            ALog.e(TAG, "[pubKey] [SessionOpt][connectingMutilSession] create connection...", str, objArr);
            registerEvent(this.connectingMultiSession, iConnCb, System.currentTimeMillis(), str, iOneSessionConnCb, sessionParamStat);
            this.connectingMultiSession.connect();
        } else {
            this.connectingSession = httpSession;
            Object[] objArr2 = new Object[18];
            objArr2[0] = HttpConstant.HOST;
            objArr2[1] = getHost();
            objArr2[2] = "Type";
            objArr2[3] = connInfo.getConnType();
            objArr2[4] = "IP";
            objArr2[5] = connInfo.getIp();
            objArr2[6] = "Port";
            objArr2[7] = Integer.valueOf(connInfo.getPort());
            objArr2[8] = "heartbeat";
            objArr2[9] = Integer.valueOf(connInfo.getHeartbeat());
            objArr2[10] = MspGlobalDefine.SESSION;
            objArr2[11] = this.connectingSession;
            objArr2[12] = "enableMultiConn";
            objArr2[13] = Boolean.valueOf(z);
            objArr2[14] = "forcePubKeyMode";
            objArr2[15] = this.connectingSession != null ? this.connectingSession.forcePubKeyMode : -2;
            objArr2[16] = "reqSeq";
            objArr2[17] = sessionParamStat == null ? "" : sessionParamStat.req;
            ALog.e(TAG, "[pubKey] [SessionOpt][connectingSession] create connection...", str, objArr2);
            registerEvent(this.connectingSession, iConnCb, System.currentTimeMillis(), str, iOneSessionConnCb, sessionParamStat);
            this.connectingSession.connect();
        }
        this.connStat.retryTimes++;
        this.connStat.startConnect = System.currentTimeMillis();
        if (tnetSpdySession != 0) {
            this.connStat.xquicErrorCode = tnetSpdySession.getErrorCode();
            this.connStat.putExtra("tnetExternStat", tnetSpdySession.getTnetExternStatMsg());
        }
        if (this.connStat.retryTimes != 0) {
            return;
        }
        this.connStat.putExtra("firstIp", connInfo.getIp());
        if (connInfo.strategy == null) {
            return;
        }
        this.connStat.firstIpType = connInfo.strategy.getIpType();
    }

    private void registerEvent(final Session session, final IConnCb iConnCb, final long j, String str, final IOneSessionConnCb iOneSessionConnCb, final SessionParamStat sessionParamStat) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c8ad8d9", new Object[]{this, session, iConnCb, new Long(j), str, iOneSessionConnCb, sessionParamStat});
        } else if (iConnCb == null) {
        } else {
            session.registerEventcb(EventType.ALL, new EventCb() { // from class: anet.channel.SessionRequest.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // anet.channel.entity.EventCb
                public void onEvent(Session session2, int i, Event event) {
                    String str2;
                    String str3;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("786c54ab", new Object[]{this, session2, new Integer(i), event});
                    } else if (session2 == null) {
                    } else {
                        SessionParamStat sessionParamStat2 = sessionParamStat;
                        String str4 = sessionParamStat2 == null ? "" : sessionParamStat2.req;
                        SessionParamStat sessionParamStat3 = sessionParamStat;
                        boolean z = sessionParamStat3 != null && sessionParamStat3.isRetry;
                        int i2 = event == null ? 0 : event.errorCode;
                        String str5 = event == null ? "" : event.errorDetail;
                        String str6 = null;
                        if (i != 2) {
                            if (i == 256) {
                                ALog.d(SessionRequest.TAG, null, session2 != null ? session2.mSeq : null, "Session", session2, "EventType", Integer.valueOf(i), "Event", event, "reqSeq", str4);
                                iConnCb.onFailed(session2, j, i, i2);
                                if (iOneSessionConnCb == null) {
                                    return;
                                }
                                ALog.e(SessionRequest.TAG, "[multiConnect] CONNECT_FAIL --> onCreateSessionFinish", session2.mSeq, "reqSeq", str4);
                                iOneSessionConnCb.onCreateSessionFinish();
                                return;
                            } else if (i != 512) {
                                return;
                            } else {
                                ALog.d(SessionRequest.TAG, null, session2 != null ? session2.mSeq : null, "Session", session2, "EventType", Integer.valueOf(i), "Event", event, "reqSeq", str4);
                                if (SessionRequest.access$1400(SessionRequest.this) != null && SessionRequest.access$1400(SessionRequest.this).isAccs) {
                                    List<Session> availableSessions = SessionRequest.access$400(SessionRequest.this).getAvailableSessions(SessionRequest.this);
                                    if (availableSessions == null || availableSessions.isEmpty()) {
                                        SessionRequest.access$1900(SessionRequest.this, session2, 0, null);
                                    } else {
                                        if (session2 != null) {
                                            str6 = session2.mSeq;
                                        }
                                        ALog.e(SessionRequest.TAG, "[connected]sessionPool has accs session, will not send msg to accs!", str6, "size", Integer.valueOf(availableSessions.size()), "reqSeq", str4);
                                    }
                                }
                                iConnCb.onSuccess(session2, j);
                                if (iOneSessionConnCb == null) {
                                    return;
                                }
                                ALog.e(SessionRequest.TAG, "[multiConnect] AUTH_SUCC --> onCreateSessionFinish", session2.mSeq, "reqSeq", str4);
                                iOneSessionConnCb.onCreateSessionFinish();
                                return;
                            }
                        }
                        ALog.e(SessionRequest.TAG, null, session2 != null ? session2.mSeq : null, "Session", session2, "EventType", Integer.valueOf(i), "Event", event, "reqSeq", str4, d.PARAM_IS_RETRY, Boolean.valueOf(z));
                        if ((!z || !SessionRequest.access$300(SessionRequest.this).containsValue(SessionRequest.this, session2)) && (z || !SessionRequest.access$400(SessionRequest.this).containsValue(SessionRequest.this, session2))) {
                            str2 = null;
                            iConnCb.onFailed(session2, j, i, i2);
                            str3 = "[multiConnect] onFailed -->";
                        } else {
                            iConnCb.onDisConnect(session2, j, i);
                            str3 = "[multiConnect] DISCONNECTED -->";
                            str2 = null;
                        }
                        if (iOneSessionConnCb != null) {
                            ALog.e(SessionRequest.TAG, str3 + " onCreateSessionFinish", session2.mSeq, new Object[0]);
                            iOneSessionConnCb.onCreateSessionFinish();
                        }
                        if (SessionRequest.access$1400(SessionRequest.this) != null && SessionRequest.access$1400(SessionRequest.this).isAccs && SessionRequest.access$400(SessionRequest.this).getSession(SessionRequest.access$1600(SessionRequest.this).getSessionRequest(StringUtils.concatString("https", HttpConstant.SCHEME_SPLIT, SessionRequest.access$1400(SessionRequest.this).host))) == null) {
                            SessionRequest.access$1900(SessionRequest.this, session2, i2, str5);
                        } else if (SessionRequest.access$1400(SessionRequest.this) == null || !SessionRequest.access$1400(SessionRequest.this).isAccs) {
                        } else {
                            if (session2 != null) {
                                str2 = session2.mSeq;
                            }
                            ALog.e(SessionRequest.TAG, "[disconnected] sessionPool has accs session, will not send msg to accs!", str2, "reqSeq", str4);
                        }
                    }
                }
            });
            session.registerEventcb(1792, new EventCb() { // from class: anet.channel.SessionRequest.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // anet.channel.entity.EventCb
                public void onEvent(Session session2, int i, Event event) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("786c54ab", new Object[]{this, session2, new Integer(i), event});
                        return;
                    }
                    ALog.d(SessionRequest.TAG, "Receive session event", null, "eventType", Integer.valueOf(i));
                    ConnEvent connEvent = new ConnEvent();
                    if (i == 512) {
                        connEvent.isSuccess = true;
                    }
                    if (SessionRequest.access$1400(SessionRequest.this) != null) {
                        connEvent.isAccs = SessionRequest.access$1400(SessionRequest.this).isAccs;
                    }
                    connEvent.isTunnel = session.isTunnel;
                    connEvent.isForceCell = session.forceCellular;
                    if (!session2.mSessionStat.isReported) {
                        ALog.e(SessionRequest.TAG, "isReported is false!,we will not report to StrategyCenter", session.mSeq, new Object[0]);
                    } else if (event != null && (event.errorCode == -2611 || event.errorCode == -2301)) {
                        ALog.e(SessionRequest.TAG, "[bg_socket_opt]no socket read and write permissions in the background！not update strategyCenter", session.mSeq, "errorCode", Integer.valueOf(event.errorCode));
                    } else {
                        connEvent.useProxyStrategy = session.useProxyStrategy;
                        StrategyCenter.getInstance().notifyConnEvent(session.getRealHost(), session.getConnStrategy(), connEvent);
                    }
                }
            });
        }
    }

    public void closeSessions(boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af708162", new Object[]{this, new Boolean(z), str});
            return;
        }
        ALog.d(TAG, "closeSessions", this.sessionCenter.seqNum, "host", this.mHost, "autoCreate", Boolean.valueOf(z));
        if (!z && this.connectingSession != null) {
            this.connectingSession.tryNextWhenFail = false;
            this.connectingSession.close(false, str);
            if (this.connectingComplexSession != null) {
                this.connectingComplexSession.tryNextWhenFail = false;
                this.connectingComplexSession.close(false, str);
            }
        }
        List<Session> sessions = this.sessionPool.getSessions(this);
        if (sessions == null) {
            return;
        }
        for (Session session : sessions) {
            if (session != null) {
                session.close(z, str);
            }
        }
    }

    public void checkSession(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ab6f1f8", new Object[]{this, new Integer(i), str});
            return;
        }
        List<Session> sessions = this.sessionPool.getSessions(this);
        if (sessions == null) {
            return;
        }
        for (Session session : sessions) {
            if (session != null && session.isAvailable()) {
                session.ping(true, i);
                ALog.e(TAG, "[ap] checkSession session=" + session.mSeq, str, "host", session.getRealHost());
            }
        }
    }

    public void checkSessionsAvailable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81e4e90b", new Object[]{this});
            return;
        }
        List<Session> sessions = this.sessionPool.getSessions(this);
        if (sessions == null) {
            return;
        }
        for (Session session : sessions) {
            if (session != null && session.isAvailable() && (session.getConnType().isHTTP3() || session.getConnType().isQuic())) {
                session.ping(true, 3000);
            }
        }
    }

    public void reCreateSession(String str, NetworkStatusHelper.NetworkStatus networkStatus) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44d8acfd", new Object[]{this, str, networkStatus});
            return;
        }
        ALog.d(TAG, "reCreateSession", str, "host", this.mHost);
        ALog.e(TAG, "[handleNetworkStatusSessions]smooth ", this.sessionCenter.seqNum, "host", this.mHost);
        this.sessionCenter.handleSessionNetworkStatus(this.sessionPool.getSessions(this), AwcnConfig.isHttp3NetworkChangeWhiteList(this.mRealHost), networkStatus);
    }

    public void await(long j) throws InterruptedException, TimeoutException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52f16f87", new Object[]{this, new Long(j)});
            return;
        }
        ALog.d(TAG, "[await]", null, "timeoutMs", Long.valueOf(j));
        if (j <= 0) {
            return;
        }
        synchronized (this.locked) {
            long currentTimeMillis = System.currentTimeMillis() + j;
            while (this.mConnecting.get()) {
                long currentTimeMillis2 = System.currentTimeMillis();
                if (currentTimeMillis2 >= currentTimeMillis) {
                    break;
                }
                this.locked.wait(currentTimeMillis - currentTimeMillis2);
            }
            if (this.mConnecting.get()) {
                throw new TimeoutException();
            }
        }
    }

    public int getConnectingType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fc6af382", new Object[]{this})).intValue();
        }
        Session session = this.connectingSession;
        if (session == null) {
            return -1;
        }
        return session.mConnType.getType();
    }

    public int getConnectingProtocolType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("80c9203a", new Object[]{this})).intValue();
        }
        Session session = this.connectingSession;
        if (session == null) {
            return -1;
        }
        return session.mConnType.getProtocolType();
    }

    private void finish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44908f9a", new Object[]{this});
        } else {
            finish(false);
        }
    }

    private void finish(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d82167a", new Object[]{this, new Boolean(z)});
            return;
        }
        setConnecting(false, z);
        synchronized (this.locked) {
            this.locked.notifyAll();
        }
    }

    private void sendConnectInfoToAccs(Session session, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("492a5711", new Object[]{this, session, new Integer(i), str});
        } else {
            sendConnectInfoToAccsByCallBack(session, i, str, true, AwcnConfig.isSendConnectInfoByService());
        }
    }

    private void sendConnectInfoToAccsByCallBack(Session session, int i, String str, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c4a815", new Object[]{this, session, new Integer(i), str, new Boolean(z), new Boolean(z2)});
            return;
        }
        SessionInfo sessionInfo = this.sessionInfo;
        if (sessionInfo == null || !sessionInfo.isAccs) {
            return;
        }
        ALog.e(TAG, "sendConnectInfoToAccsByCallBack", null, new Object[0]);
        Intent intent = new Intent("com.taobao.ACCS_CONNECT_INFO");
        intent.putExtra("command", 103);
        intent.putExtra("host", session.getHost());
        intent.putExtra(com.taobao.accs.common.Constants.KEY_CENTER_HOST, true);
        boolean isAvailable = session.isAvailable();
        if (!isAvailable) {
            intent.putExtra("errorCode", i);
            intent.putExtra(com.taobao.accs.common.Constants.KEY_ERROR_DETAIL, str);
        }
        intent.putExtra(com.taobao.accs.common.Constants.KEY_CONNECT_AVAILABLE, isAvailable);
        intent.putExtra(com.taobao.accs.common.Constants.KEY_TYPE_INAPP, true);
        if (z) {
            intent.putExtra("isSendConnectInfoByService", z2);
            ALog.e(TAG, "sendConnectInfoToAccsByCallBack, isAccsServiceOptOpend=true", null, "isSendConnectInfoByService", Boolean.valueOf(z2));
        }
        this.sessionCenter.accsSessionManager.notifyListener(intent);
    }

    /* loaded from: classes2.dex */
    public class SessionComplexTask implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private List<ConnInfo> connInfoList;
        private Context context;
        private int protocolType;
        private SessionRequest sessionRequest;
        private int sessionType;
        private SessionParamStat stat;

        static {
            kge.a(1500264075);
            kge.a(-1390502639);
        }

        public SessionComplexTask(SessionRequest sessionRequest, Context context, SessionRequest sessionRequest2, int i, List<ConnInfo> list, SessionParamStat sessionParamStat) {
            this(context, sessionRequest2, i, ProtocolType.ALL, list, sessionParamStat);
        }

        public SessionComplexTask(Context context, SessionRequest sessionRequest, int i, int i2, List<ConnInfo> list, SessionParamStat sessionParamStat) {
            this.connInfoList = new ArrayList();
            this.context = context;
            this.sessionRequest = sessionRequest;
            this.sessionType = i;
            this.protocolType = i2;
            this.connInfoList = list;
            this.stat = sessionParamStat;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            SessionParamStat sessionParamStat = this.stat;
            String str = sessionParamStat == null ? "" : sessionParamStat.req;
            if (SessionRequest.access$400(SessionRequest.this).getSession(this.sessionRequest, this.sessionType, this.protocolType) != null) {
                ALog.e(SessionRequest.TAG, "SessionComplexTask cancel,  already connect successfully", null, "host", SessionRequest.access$900(SessionRequest.this), "reqSeq", str);
                return;
            }
            List<ConnInfo> list = this.connInfoList;
            if (list == null || list.size() <= 0) {
                ALog.e(SessionRequest.TAG, "SessionComplexTask cancel,  conn list is null", null, "host", SessionRequest.access$900(SessionRequest.this), "reqSeq", str);
                return;
            }
            ConnInfo remove = this.connInfoList.remove(0);
            ALog.e(SessionRequest.TAG, "SessionComplexTask run :" + remove.toString(), remove.getSeq(), "host", SessionRequest.access$900(SessionRequest.this), "reqSeq", str);
            SessionRequest sessionRequest = SessionRequest.this;
            Context context = this.context;
            sessionRequest.createComplexSession(context, remove, new ConnCb(context, this.connInfoList, remove, this.stat), remove.getSeq(), true, this.stat);
        }
    }

    public void createComplexSession(Context context, ConnInfo connInfo, IConnCb iConnCb, String str, boolean z, SessionParamStat sessionParamStat) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be40fabf", new Object[]{this, context, connInfo, iConnCb, str, new Boolean(z), sessionParamStat});
            return;
        }
        ConnType connType = connInfo.getConnType();
        if (context != null && !connType.isHttpType()) {
            TnetSpdySession tnetSpdySession = new TnetSpdySession(context, connInfo);
            tnetSpdySession.initConfig(this.sessionCenter.config);
            tnetSpdySession.initSessionInfo(this.sessionInfo);
            if (this.isGetPubKeyFail.get()) {
                tnetSpdySession.forcePubKeyMode.set(1);
            }
            tnetSpdySession.setTnetPublicKey(this.sessionCenter.attributeManager.getPublicKey(this.mRealHost));
            if (z) {
                GlobalAppRuntimeInfo.updateSessionIndex(str, this.mRealHost);
            }
            this.connectingComplexSession = tnetSpdySession;
            if (connType.isHTTP3()) {
                this.connectingSession.detectHttp3Status = StrategyCenter.getInstance().getDetectHttp3Status();
            }
        } else {
            this.connectingComplexSession = new HttpSession(context, connInfo);
        }
        this.connectingComplexSession.isComplex = true;
        Object[] objArr = new Object[18];
        objArr[0] = HttpConstant.HOST;
        objArr[1] = getHost();
        objArr[2] = "Type";
        objArr[3] = connInfo.getConnType();
        objArr[4] = "IP";
        objArr[5] = connInfo.getIp();
        objArr[6] = "Port";
        objArr[7] = Integer.valueOf(connInfo.getPort());
        objArr[8] = "heartbeat";
        objArr[9] = Integer.valueOf(connInfo.getHeartbeat());
        objArr[10] = MspGlobalDefine.SESSION;
        objArr[11] = this.connectingComplexSession;
        objArr[12] = "enableMultiConn";
        objArr[13] = Boolean.valueOf(z);
        objArr[14] = "forcePubKeyMode";
        objArr[15] = this.connectingComplexSession != null ? this.connectingComplexSession.forcePubKeyMode : -2;
        objArr[16] = "reqSeq";
        objArr[17] = sessionParamStat == null ? "" : sessionParamStat.req;
        ALog.e(TAG, "[pubKey] [SessionOpt] create complex connection...", str, objArr);
        registerEvent(this.connectingComplexSession, iConnCb, System.currentTimeMillis(), str, null, sessionParamStat);
        this.connectingComplexSession.mSessionStat.isComplex = true;
        this.connectingComplexSession.connect();
    }
}
