package anet.channel;

import android.content.Context;
import android.text.TextUtils;
import anet.channel.entity.ConnInfo;
import anet.channel.entity.ConnType;
import anet.channel.entity.Event;
import anet.channel.entity.EventCb;
import anet.channel.request.Cancelable;
import anet.channel.request.Request;
import anet.channel.statist.SessionStatistic;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.strategy.IConnStrategy;
import anet.channel.strategy.ProxyStrategy;
import anet.channel.strategy.StrategyCenter;
import anet.channel.thread.ThreadPoolExecutorFactory;
import anet.channel.util.ALog;
import anet.channel.util.HttpConstant;
import anet.channel.util.HttpHelper;
import anet.channel.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.android.spdy.SpdyAgent;
import org.android.spdy.SpdySessionKind;
import org.android.spdy.SpdyVersion;
import tb.kge;

/* loaded from: classes.dex */
public abstract class Session implements Comparable<Session> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "awcn.Session";
    public IConnStrategy mConnStrategy;
    public int mConnTimeout;
    public ConnType mConnType;
    public String mConnectIp;
    public Context mContext;
    public String mHost;
    public String mIp;
    public boolean mIpToHost;
    public int mPort;
    public String mProxyIp;
    public int mProxyPort;
    public int mReadTimeout;
    public String mRealHost;
    public Runnable mRecvTimeOutRunnable;
    public String mSeq;
    public final SessionStatistic mSessionStat;
    private Future<?> timeoutTaskFuture;
    public Map<EventCb, Integer> mEventCallBacks = new LinkedHashMap();
    private boolean mIsConnTimeOut = false;
    public String unit = null;
    public String accessPoint = null;
    public volatile int mStatus = 6;
    public boolean autoReCreate = false;
    public boolean tryNextWhenFail = true;
    public boolean forceCellular = false;
    private List<Long> errorTimeList = null;
    private long lastAmdcRequestSend = 0;
    public boolean isComplex = false;
    public boolean isCreated = false;
    public boolean isStrategyInvalid = false;
    public boolean isDeprecated = false;
    public boolean isNetworkStatusChangeDeprecated = false;
    public boolean isNetworkStatusChangeNewSession = false;
    public boolean isActualCellular = false;
    public AtomicInteger countIndex = new AtomicInteger();
    public int detectHttp3Status = -1;
    public boolean isTunnel = false;
    public ProxyStrategy useProxyStrategy = null;
    public boolean isMultiSession = false;
    public int secondRefreshOpt = -1;
    public int pubKeyMode = -1;
    public AtomicInteger forcePubKeyMode = new AtomicInteger(-1);

    static {
        kge.a(-1413290249);
        kge.a(415966670);
    }

    public abstract void close();

    public abstract void close(String str);

    public void connect() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66af7871", new Object[]{this});
        }
    }

    public abstract Runnable getRecvTimeOutRunnable();

    public abstract boolean isAvailable();

    public abstract boolean isReuse(Session session);

    public abstract boolean isSupportSmoothReconnect();

    public void onDisconnect() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18aad6e2", new Object[]{this});
        }
    }

    public void ping(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e69854fb", new Object[]{this, new Boolean(z)});
        }
    }

    public void ping(boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec72bd68", new Object[]{this, new Boolean(z), new Integer(i)});
        }
    }

    public abstract Cancelable request(Request request, RequestCb requestCb);

    public void sendCustomFrame(int i, byte[] bArr, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c377614", new Object[]{this, new Integer(i), bArr, new Integer(i2)});
        }
    }

    public void sendCustomFrame(int i, byte[] bArr, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c40a174", new Object[]{this, new Integer(i), bArr, new Integer(i2), new Integer(i3), new Integer(i4)});
        }
    }

    /* loaded from: classes.dex */
    public static class Status {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final int AUTHING = 3;
        public static final int AUTH_FAIL = 5;
        public static final int AUTH_SUCC = 4;
        public static final int CONNECTED = 0;
        public static final int CONNECTING = 1;
        public static final int CONNETFAIL = 2;
        public static final int DISCONNECTED = 6;
        public static final int DISCONNECTING = 7;
        public static final String[] names;

        static {
            kge.a(-2094811553);
            names = new String[]{"CONNECTED", "CONNECTING", "CONNETFAIL", "AUTHING", "AUTH_SUCC", "AUTH_FAIL", "DISCONNECTED", "DISCONNECTING"};
        }

        public static String getName(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("46b1d505", new Object[]{new Integer(i)}) : names[i];
        }
    }

    public void setForceCellular(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11d16da", new Object[]{this, new Boolean(z)});
        } else {
            this.forceCellular = z;
        }
    }

    public boolean getForceCellular() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8fcdf6ca", new Object[]{this})).booleanValue() : this.forceCellular;
    }

    public int getDeprecatedSessionType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("20ab4a81", new Object[]{this})).intValue();
        }
        if (this.isNetworkStatusChangeNewSession) {
            return 3;
        }
        if (!this.isNetworkStatusChangeDeprecated) {
            return 0;
        }
        return this.isDeprecated ? 1 : 2;
    }

    @Override // java.lang.Comparable
    public int compareTo(Session session) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("aff53892", new Object[]{this, session})).intValue() : ConnType.compare(this.mConnType, session.mConnType);
    }

    public Session(Context context, ConnInfo connInfo) {
        int i = 0;
        this.mIpToHost = false;
        this.mContext = context;
        this.mIp = connInfo.getIp();
        this.mConnectIp = this.mIp;
        this.mPort = connInfo.getPort();
        this.mConnType = connInfo.getConnType();
        this.mHost = connInfo.getHost();
        String str = this.mHost;
        this.mRealHost = str.substring(str.indexOf(HttpConstant.SCHEME_SPLIT) + 3);
        this.mReadTimeout = connInfo.getReadTimeout();
        this.mConnTimeout = connInfo.getConnectionTimeout();
        this.mConnStrategy = connInfo.strategy;
        IConnStrategy iConnStrategy = this.mConnStrategy;
        this.mIpToHost = iConnStrategy != null && iConnStrategy.getIpType() == -1;
        this.mSeq = connInfo.getSeq();
        this.mSessionStat = new SessionStatistic(connInfo);
        SessionStatistic sessionStatistic = this.mSessionStat;
        sessionStatistic.host = this.mRealHost;
        sessionStatistic.multiNetworkStatus = NetworkStatusHelper.getCellularNetwork() != null ? 1 : i;
    }

    public void checkAvailable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8eb83aa8", new Object[]{this});
        } else {
            ping(true);
        }
    }

    public static void configTnetALog(Context context, String str, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("becbcb3d", new Object[]{context, str, new Integer(i), new Integer(i2)});
            return;
        }
        SpdyAgent spdyAgent = SpdyAgent.getInstance(context, SpdyVersion.SPDY3, SpdySessionKind.NONE_SESSION);
        if (spdyAgent == null || !SpdyAgent.checkLoadSucc()) {
            ALog.e("agent null or configTnetALog load so fail!!!", null, "loadso", Boolean.valueOf(SpdyAgent.checkLoadSucc()));
        } else {
            spdyAgent.configLogFile(str, i, i2);
        }
    }

    public void updateCloseReason(String str) {
        SessionStatistic sessionStatistic;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3811424", new Object[]{this, str});
        } else if (str == null || str.isEmpty() || (sessionStatistic = this.mSessionStat) == null) {
        } else {
            sessionStatistic.closeReason = str;
        }
    }

    public void close(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8249dc35", new Object[]{this, new Boolean(z)});
            return;
        }
        this.autoReCreate = z;
        close();
    }

    public void close(boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("651642bf", new Object[]{this, new Boolean(z), str});
            return;
        }
        this.autoReCreate = z;
        close(str);
    }

    public void registerEventcb(final int i, final EventCb eventCb) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb364f0f", new Object[]{this, new Integer(i), eventCb});
        } else {
            ThreadPoolExecutorFactory.submitSessionCallbackTask(new Runnable() { // from class: anet.channel.Session.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (Session.this.mEventCallBacks == null) {
                    } else {
                        Session.this.mEventCallBacks.put(eventCb, Integer.valueOf(i));
                    }
                }
            });
        }
    }

    public void unReceiveEventCb(final EventCb eventCb) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5785719f", new Object[]{this, eventCb});
        } else {
            ThreadPoolExecutorFactory.submitSessionCallbackTask(new Runnable() { // from class: anet.channel.Session.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (Session.this.mEventCallBacks == null) {
                    } else {
                        Session.this.mEventCallBacks.remove(eventCb);
                    }
                }
            });
        }
    }

    public String getIp() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d02517fc", new Object[]{this}) : this.mIp;
    }

    public int getPort() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a73231f1", new Object[]{this})).intValue() : this.mPort;
    }

    public ConnType getConnType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ConnType) ipChange.ipc$dispatch("fdfc0fef", new Object[]{this}) : this.mConnType;
    }

    public String getHost() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c9fd6f9b", new Object[]{this}) : this.mHost;
    }

    public String getRealHost() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("89622e9d", new Object[]{this}) : this.mRealHost;
    }

    public IConnStrategy getConnStrategy() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IConnStrategy) ipChange.ipc$dispatch("6a271e62", new Object[]{this}) : this.mConnStrategy;
    }

    public String getUnit() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9e7fcd3f", new Object[]{this}) : this.unit;
    }

    public void handleCallbacks(final int i, final Event event) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4135789e", new Object[]{this, new Integer(i), event});
        } else {
            ThreadPoolExecutorFactory.submitSessionCallbackTask(new Runnable() { // from class: anet.channel.Session.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        if (Session.this.mEventCallBacks == null) {
                            return;
                        }
                        for (EventCb eventCb : Session.this.mEventCallBacks.keySet()) {
                            if (eventCb != null && (Session.this.mEventCallBacks.get(eventCb).intValue() & i) != 0) {
                                try {
                                    eventCb.onEvent(Session.this, i, event);
                                } catch (Exception e) {
                                    ALog.e(Session.TAG, e.toString(), Session.this.mSeq, new Object[0]);
                                }
                            }
                        }
                    } catch (Exception e2) {
                        ALog.e(Session.TAG, "handleCallbacks", Session.this.mSeq, e2, new Object[0]);
                    }
                }
            });
        }
    }

    public synchronized void notifyStatus(int i, Event event) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cead5b3", new Object[]{this, new Integer(i), event});
            return;
        }
        ALog.e(TAG, "notifyStatus", this.mSeq, "status", Status.getName(i));
        if (i == this.mStatus) {
            ALog.i(TAG, "ignore notifyStatus", this.mSeq, new Object[0]);
            return;
        }
        this.mStatus = i;
        switch (this.mStatus) {
            case 0:
                handleCallbacks(1, event);
                return;
            case 1:
                return;
            case 2:
                handleCallbacks(256, event);
                return;
            case 3:
                return;
            case 4:
                if (this.mConnStrategy != null) {
                    this.unit = this.mConnStrategy.getUnit();
                    this.accessPoint = this.mConnStrategy.getAccessPoint();
                    this.mSessionStat.sinceInitTime = System.currentTimeMillis() - GlobalAppRuntimeInfo.getInitTime();
                    parseCommonInfo();
                    ALog.e(TAG, "[unit] host= " + this.mRealHost + " ,ip=" + this.mIp + ", unit=" + this.unit + " ,accessPoint=" + this.accessPoint, this.mSeq, "isStrategyInvalid", Boolean.valueOf(this.isStrategyInvalid));
                }
                handleCallbacks(512, event);
                return;
            case 5:
                handleCallbacks(1024, event);
                break;
            case 6:
                onDisconnect();
                if (!this.mIsConnTimeOut) {
                    handleCallbacks(2, event);
                    return;
                }
                break;
            case 7:
                return;
        }
    }

    private void parseCommonInfo() {
        Map<String, Object> commonInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1006d3", new Object[]{this});
            return;
        }
        try {
            if (this.mConnStrategy == null || (commonInfo = this.mConnStrategy.getCommonInfo()) == null || !"true".equalsIgnoreCase((String) commonInfo.get("isStrategyInvalid"))) {
                return;
            }
            this.isStrategyInvalid = true;
        } catch (Throwable th) {
            ALog.e(TAG, " parseCommonInfo error = " + th.toString(), this.mSeq, new Object[0]);
        }
    }

    public void setPingTimeout(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f56e9daf", new Object[]{this, new Integer(i)});
            return;
        }
        if (this.mRecvTimeOutRunnable == null) {
            this.mRecvTimeOutRunnable = getRecvTimeOutRunnable();
        }
        cancelTimeout();
        Runnable runnable = this.mRecvTimeOutRunnable;
        if (runnable == null) {
            return;
        }
        this.timeoutTaskFuture = ThreadPoolExecutorFactory.submitScheduledTask(runnable, i, TimeUnit.MILLISECONDS);
    }

    public void cancelTimeout() {
        Future<?> future;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfbcc28e", new Object[]{this});
        } else if (this.mRecvTimeOutRunnable == null || (future = this.timeoutTaskFuture) == null) {
        } else {
            future.cancel(true);
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "Session@[" + this.mSeq + '|' + this.mConnType + ']';
    }

    public void handleResponseCode(Request request, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f026f5a7", new Object[]{this, request, new Integer(i)});
        } else if (!request.getHeaders().containsKey("x-pv") || i < 500 || i >= 600) {
        } else {
            synchronized (this) {
                if (this.errorTimeList == null) {
                    this.errorTimeList = new LinkedList();
                }
                if (this.errorTimeList.size() < 5) {
                    this.errorTimeList.add(Long.valueOf(System.currentTimeMillis()));
                } else {
                    long longValue = this.errorTimeList.remove(0).longValue();
                    long currentTimeMillis = System.currentTimeMillis();
                    if (currentTimeMillis - longValue <= 60000) {
                        StrategyCenter.getInstance().forceRefreshStrategy(request.getHost());
                        this.errorTimeList.clear();
                    } else {
                        this.errorTimeList.add(Long.valueOf(currentTimeMillis));
                    }
                }
            }
        }
    }

    public void handleResponseHeaders(Request request, Map<String, List<String>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d063562", new Object[]{this, request, map});
            return;
        }
        try {
            if (!map.containsKey(HttpConstant.X_SWITCH_UNIT)) {
                return;
            }
            String singleHeaderFieldByKey = HttpHelper.getSingleHeaderFieldByKey(map, HttpConstant.X_SWITCH_UNIT);
            if (TextUtils.isEmpty(singleHeaderFieldByKey)) {
                singleHeaderFieldByKey = null;
            }
            if (StringUtils.isStringEqual(this.unit, singleHeaderFieldByKey)) {
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.lastAmdcRequestSend <= 60000) {
                return;
            }
            StrategyCenter.getInstance().forceRefreshStrategy(request.getHost());
            this.lastAmdcRequestSend = currentTimeMillis;
        } catch (Exception unused) {
        }
    }
}
