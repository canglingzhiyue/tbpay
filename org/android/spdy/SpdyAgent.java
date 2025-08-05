package org.android.spdy;

import android.content.Context;
import android.text.TextUtils;
import com.alipay.birdnest.util.UiUtil;
import com.alipay.mobile.common.amnet.biz.inner.AmnetMonitorLoggerListener;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.v3.t;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.android.netutil.UtilTool;
import org.android.spdy.NetWorkStatusUtil;
import tb.sab;
import tb.sac;
import tb.sad;
import tb.sae;
import tb.xps;

/* loaded from: classes.dex */
public final class SpdyAgent {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    @Deprecated
    public static final int ACCS_ONLINE_SERVER = 1;
    @Deprecated
    public static final int ACCS_TEST_SERVER = 0;
    private static final String CACHE_TIME_SPLIT = "@@@";
    private static final int JNI_ERR = -1;
    private static final int JNI_OK = 0;
    private static final int KB32 = 32768;
    private static final int KB8 = 8192;
    private static final int MAX_LONG_SESSION_COUNT = 150;
    private static final int MB5 = 5242880;
    private static final String TAG = "tnetsdk.SpdyAgent";
    private static final ConcurrentHashMap<String, Integer> domainHashMap;
    public static volatile boolean enableDebug = false;
    public static volatile boolean enableTimeGaurd = false;
    private static volatile long initStartTime = 0;
    private static volatile boolean loadTnetSoSucc = false;
    private static int mSessionUniqueIndex;
    private static final Map<String, byte[]> mStorageMap;
    private static final QuicCacher quicSecureSpCache;
    private static final Lock r;
    private static final ReentrantReadWriteLock rwLock;
    private static volatile long sinceInitStartLast;
    private static final Lock w;
    private static final QuicCacher xqcCache;
    private volatile AccsSSLCallback accsSSLCallback;
    private long agentNativePtr;
    private static final Object loadSolock = new Object();
    private static volatile SpdyAgent gSingleInstance = null;
    public static volatile int wifiConsecutiveFailCount = 0;
    private static final Object ssLCallbackLock = new Object();
    private static Context context = null;
    private final AtomicBoolean isAgentClosed = new AtomicBoolean();
    private final AtomicBoolean isAgentInit = new AtomicBoolean(false);
    private String proxyUsername = null;
    private String proxyPassword = null;
    private final HashMap<String, SpdySession> sessionMgr = new HashMap<>(5);
    private final LinkedList<SpdySession> sessionQueue = new LinkedList<>();

    private native int closeSessionN(long j);

    private static native int configIpStackModeN(int i);

    private native int configLogFileN(String str, int i, int i2);

    private native int configLogFileN(String str, int i, int i2, int i3);

    private static native int configSwitchValueByKeyN(long j, int i, double d, String str);

    private native long createSessionN(long j, SpdySession spdySession, int i, byte[] bArr, char c, byte[] bArr2, char c2, byte[] bArr3, byte[] bArr4, Object obj, int i2, int i3, int i4, byte[] bArr5, int i5, int i6, int i7, int i8, int i9, byte[] bArr6, byte[] bArr7, byte[] bArr8);

    private native int freeAgent(long j);

    private native long initAgent(int i, int i2, int i3);

    private native void logFileCloseN();

    private native void logFileFlushN();

    private static native int pluginLoadQuicSoN(String str);

    private static native int pluginLoadZstdSoN(String str);

    @Deprecated
    public native String ResolveHost(String str, String str2, int i);

    @Deprecated
    public void disableHeaderCache() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98dad6f4", new Object[]{this});
        }
    }

    @Deprecated
    public void switchAccsServer(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a53144b3", new Object[]{this, new Integer(i)});
        }
    }

    public static /* synthetic */ Context access$000() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("bf71316f", new Object[0]) : context;
    }

    public static /* synthetic */ QuicCacher access$100() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (QuicCacher) ipChange.ipc$dispatch("faa2009", new Object[0]) : quicSecureSpCache;
    }

    public static /* synthetic */ QuicCacher access$200() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (QuicCacher) ipChange.ipc$dispatch("7682dfca", new Object[0]) : xqcCache;
    }

    public static /* synthetic */ Map access$300() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("eeb91def", new Object[0]) : mStorageMap;
    }

    static {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        rwLock = reentrantReadWriteLock;
        r = reentrantReadWriteLock.readLock();
        w = rwLock.writeLock();
        domainHashMap = new ConcurrentHashMap<>();
        mSessionUniqueIndex = 0;
        xqcCache = new SecurityGuardCacherImp();
        quicSecureSpCache = new xps();
        mStorageMap = new ConcurrentHashMap();
        initStartTime = 0L;
        sinceInitStartLast = 0L;
        enableDebug = false;
        enableTimeGaurd = false;
    }

    public static SpdyAgent getInstance(Context context2, SpdyVersion spdyVersion, SpdySessionKind spdySessionKind) throws UnsatisfiedLinkError, SpdyErrorException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SpdyAgent) ipChange.ipc$dispatch("3365208a", new Object[]{context2, spdyVersion, spdySessionKind});
        }
        if (context2 != null && context == null) {
            context = context2;
        }
        return getInstance(context2, spdyVersion, spdySessionKind, null);
    }

    @Deprecated
    public static SpdyAgent getInstance(Context context2, SpdyVersion spdyVersion, SpdySessionKind spdySessionKind, AccsSSLCallback accsSSLCallback) throws UnsatisfiedLinkError, SpdyErrorException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SpdyAgent) ipChange.ipc$dispatch("2e985968", new Object[]{context2, spdyVersion, spdySessionKind, accsSSLCallback});
        }
        if (gSingleInstance == null) {
            synchronized (loadSolock) {
                if (gSingleInstance == null) {
                    gSingleInstance = new SpdyAgent(context2, accsSSLCallback);
                }
            }
        }
        return gSingleInstance;
    }

    private SpdyAgent(Context context2, AccsSSLCallback accsSSLCallback) throws UnsatisfiedLinkError {
        try {
            initStartTime = System.currentTimeMillis();
            setContext(context2);
            if (this.isAgentInit.compareAndSet(false, true)) {
                Boolean isABGlobalFeatureOpened = UtilTool.isABGlobalFeatureOpened(getContext(), "Home_Page_SecondRefreshOpt");
                if (isABGlobalFeatureOpened != null) {
                    sad.p(isABGlobalFeatureOpened.booleanValue());
                }
                sac.b(context2);
                loadTnetSoSucc = SoInstallMgrSdk.loadTnetSo();
                if (sad.x()) {
                    SoInstallMgrSdk.fetchLocalSoAndPluginLoad();
                    this.agentNativePtr = initAgent(0, sad.I(), sad.q());
                    setAccsSslCallback(accsSSLCallback);
                    sae.b(new Runnable() { // from class: org.android.spdy.SpdyAgent.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange = $ipChange;
                            if (ipChange instanceof IpChange) {
                                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            long currentTimeMillis = System.currentTimeMillis();
                            sac.a(SpdyAgent.access$000());
                            NetWorkStatusUtil.a(SpdyAgent.access$000());
                            sab.a(SpdyAgent.access$000());
                            long currentTimeMillis2 = System.currentTimeMillis();
                            SpdyAgent.this.InitializeSecurityStuff();
                            spduLog.Tloge(SpdyAgent.TAG, "[tnetInit]", " Async task cost:" + (System.currentTimeMillis() - currentTimeMillis), "spTime", Long.valueOf(currentTimeMillis2 - currentTimeMillis));
                        }
                    });
                } else {
                    sac.a(context);
                    SoInstallMgrSdk.fetchLocalSoAndPluginLoad();
                    this.agentNativePtr = initAgent(0, sad.I(), sad.q());
                    this.accsSSLCallback = accsSSLCallback;
                    NetWorkStatusUtil.a(context);
                    sab.a(context);
                    sae.b(new Runnable() { // from class: org.android.spdy.SpdyAgent.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange = $ipChange;
                            if (ipChange instanceof IpChange) {
                                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            long currentTimeMillis = System.currentTimeMillis();
                            SpdyAgent.this.InitializeSecurityStuff();
                            spduLog.Tloge(SpdyAgent.TAG, "[tnetInit]", "quic root ca init cost:" + (System.currentTimeMillis() - currentTimeMillis), new Object[0]);
                        }
                    });
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        this.isAgentClosed.set(false);
        spduLog.Tloge(TAG, "[tnetInit]", " core cost:" + (System.currentTimeMillis() - initStartTime), "thread", Integer.valueOf(sad.I()));
    }

    public static boolean isInAllowLaunchTimePass(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("48786d76", new Object[]{new Long(j)})).booleanValue();
        }
        if (sinceInitStartLast > j) {
            return false;
        }
        if (initStartTime == 0) {
            initStartTime = System.currentTimeMillis();
        }
        long currentTimeMillis = System.currentTimeMillis() - initStartTime;
        sinceInitStartLast = currentTimeMillis;
        return currentTimeMillis < j;
    }

    private int getDomainHashIndex(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("812e90ce", new Object[]{this, str})).intValue();
        }
        Integer num = domainHashMap.get(str);
        if (num == null) {
            ConcurrentHashMap<String, Integer> concurrentHashMap = domainHashMap;
            int i = mSessionUniqueIndex + 1;
            mSessionUniqueIndex = i;
            concurrentHashMap.put(str, Integer.valueOf(i));
            num = Integer.valueOf(mSessionUniqueIndex);
        }
        return num.intValue();
    }

    public void clearSpdySession(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a1bd48", new Object[]{this, str});
        } else if (str == null) {
        } else {
            w.lock();
            try {
                this.sessionMgr.remove(str);
            } catch (Throwable th) {
                try {
                    th.printStackTrace();
                } finally {
                    w.unlock();
                }
            }
        }
    }

    public void InitializeSecurityStuff() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4747374b", new Object[]{this});
            return;
        }
        xqcCache.init(context);
        quicSecureSpCache.init(context);
        b.a().b();
    }

    public static boolean isQuicReady() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ddbcf06", new Object[0])).booleanValue() : SoInstallMgrSdk.loadQuicSucc;
    }

    public static void registerQuicListener(IPluginFetchCallback iPluginFetchCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6577c030", new Object[]{iPluginFetchCallback});
        } else {
            SoInstallMgrSdk.registerQuicListener(iPluginFetchCallback);
        }
    }

    public static void unregisterQuicListener(IPluginFetchCallback iPluginFetchCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ba94277", new Object[]{iPluginFetchCallback});
        } else {
            SoInstallMgrSdk.unregisterQuicListener(iPluginFetchCallback);
        }
    }

    public static boolean checkLoadSucc() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2e356dfb", new Object[0])).booleanValue() : loadTnetSoSucc;
    }

    private void checkLoadSo() throws SpdyErrorException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a7e0891", new Object[]{this});
            return;
        }
        if (SoInstallMgrSdk.fetchLocalSOStartTime == 0) {
            SoInstallMgrSdk.fetchLocalSoAndPluginLoad();
        }
        if (SoInstallMgrSdk.fetchRemoteSOStartTime == 0) {
            SoInstallMgrSdk.fetchRemoteSoAndPluginLoad();
        }
        if (loadTnetSoSucc) {
            return;
        }
        try {
        } catch (Throwable th) {
            th.printStackTrace();
        }
        synchronized (loadSolock) {
            if (loadTnetSoSucc) {
                return;
            }
            loadTnetSoSucc = SoInstallMgrSdk.loadTnetSo();
            this.agentNativePtr = initAgent(0, sad.I(), sad.q());
            if (!loadTnetSoSucc) {
                throw new SpdyErrorException("So load fail", (int) TnetStatusCode.TNET_JNI_ERR_LOAD_SO_FAIL);
            }
        }
    }

    public static void setContext(Context context2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a164154", new Object[]{context2});
            return;
        }
        if (context2 == null) {
            context2 = UtilTool.b();
        }
        context = context2;
    }

    public static Context getContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[0]);
        }
        if (context == null) {
            context = UtilTool.b();
        }
        return context;
    }

    public void setProxyUsernamePassword(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e0ac9f8", new Object[]{this, str, str2});
            return;
        }
        this.proxyUsername = str;
        this.proxyPassword = str2;
    }

    public static void securityCheck(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e64b06cf", new Object[]{new Integer(i), new Integer(i2)});
        } else if (i >= 32768) {
            throw new SpdyErrorException("INVALID_PARAM:total1=" + i, (int) TnetStatusCode.TNET_JNI_ERR_INVLID_PARAM);
        } else if (i2 < 8192) {
        } else {
            throw new SpdyErrorException("INVALID_PARAM:value=" + i2, (int) TnetStatusCode.TNET_JNI_ERR_INVLID_PARAM);
        }
    }

    public static void tableListJudge(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4ae0d51", new Object[]{new Integer(i)});
        } else if (i < 5242880) {
        } else {
            throw new SpdyErrorException("INVALID_PARAM:total2=" + i, (int) TnetStatusCode.TNET_JNI_ERR_INVLID_PARAM);
        }
    }

    public static void InvlidCharJudge(byte[] bArr, byte[] bArr2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f65686c0", new Object[]{bArr, bArr2});
            return;
        }
        for (int i = 0; i < bArr.length; i++) {
            if ((bArr[i] & 255) < 32 || (bArr[i] & 255) > 126) {
                bArr[i] = 63;
            }
        }
        for (int i2 = 0; i2 < bArr2.length; i2++) {
            if ((bArr2[i2] & 255) < 32 || (bArr2[i2] & 255) > 126) {
                bArr2[i2] = 63;
            }
        }
    }

    public static void headJudge(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fcc9da7", new Object[]{map});
        } else if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                InvlidCharJudge(key.getBytes(), value.getBytes());
                i += key.length() + 1 + value.length();
                securityCheck(i, value.length());
            }
        }
    }

    public static String mapBodyToString(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7fbd8cec", new Object[]{map});
        }
        StringBuilder sb = new StringBuilder();
        if (map == null) {
            return null;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            sb.append(key);
            sb.append('=');
            sb.append(value);
            sb.append('&');
            i += key.length() + 1 + value.length();
            tableListJudge(i);
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }

    public static byte[] dataproviderToByteArray(SpdyRequest spdyRequest, SpdyDataProvider spdyDataProvider) {
        byte[] bArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("503d4861", new Object[]{spdyRequest, spdyDataProvider});
        }
        headJudge(spdyRequest.getHeaders());
        if (spdyDataProvider == null) {
            return null;
        }
        String mapBodyToString = mapBodyToString(spdyDataProvider.postBody);
        if (mapBodyToString != null) {
            bArr = mapBodyToString.getBytes();
        } else {
            bArr = spdyDataProvider.data;
        }
        if (bArr == null || bArr.length < 5242880) {
            return bArr;
        }
        throw new SpdyErrorException("INVALID_PARAM:total=" + bArr.length, (int) TnetStatusCode.TNET_JNI_ERR_INVLID_PARAM);
    }

    @Deprecated
    public SpdySession createSession(String str, String str2, Object obj, SessionCb sessionCb, SslCertcb sslCertcb, int i, int i2) throws SpdyErrorException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SpdySession) ipChange.ipc$dispatch("4f35824", new Object[]{this, str, str2, obj, sessionCb, sslCertcb, new Integer(i), new Integer(i2)}) : createSession(str, str2, obj, sessionCb, null, i, i2, -1);
    }

    @Deprecated
    public SpdySession createSession(String str, String str2, Object obj, SessionCb sessionCb, SslCertcb sslCertcb, int i, int i2, int i3) throws SpdyErrorException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SpdySession) ipChange.ipc$dispatch("537dce7f", new Object[]{this, str, str2, obj, sessionCb, sslCertcb, new Integer(i), new Integer(i2), new Integer(i3)}) : createSession(str, str2, obj, sessionCb, null, i, i2, i3, null, 0, 0, -1, null, null, false, false, false, 0);
    }

    public SpdySession createSession(SessionInfo sessionInfo) throws SpdyErrorException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SpdySession) ipChange.ipc$dispatch("b29f7bf5", new Object[]{this, sessionInfo}) : createSession(sessionInfo.getAuthority(), sessionInfo.getDomain(), sessionInfo.getSessonUserData(), sessionInfo.getSessionCb(), sessionInfo.getSessionCustomExtraCb(), sessionInfo.getMode(), sessionInfo.getPubKeySeqNum(), sessionInfo.getConnectionTimeoutMs(), sessionInfo.getCertHost(), sessionInfo.getXquicCongControl(), sessionInfo.getRecvRateBps(), sessionInfo.getMss(), sessionInfo.getTunnelDomain(), sessionInfo.getTunnelStrategyList(), sessionInfo.getMultiPathCompensateEnable(), sessionInfo.getMultiPathParallelAddSpeedEnable(), sessionInfo.isTryForceCellular(), sessionInfo.getConnectIndex());
    }

    /* JADX WARN: Can't wrap try/catch for region: R(35:33|34|35|36|37|38|(5:(27:43|44|(1:46)(1:113)|47|(1:49)(1:112)|(1:51)(1:111)|(4:107|108|109|110)(1:54)|55|56|(1:106)(1:60)|61|(1:63)(1:105)|(1:65)(2:100|101)|66|67|(1:69)(1:99)|70|(1:72)(1:98)|73|(1:75)(1:97)|76|(1:78)(1:96)|79|80|(3:82|83|84)(2:88|(1:90)(2:91|92))|85|86)|80|(0)(0)|85|86)|114|44|(0)(0)|47|(0)(0)|(0)(0)|(0)|107|108|109|110|55|56|(1:58)|106|61|(0)(0)|(0)(0)|66|67|(0)(0)|70|(0)(0)|73|(0)(0)|76|(0)(0)|79) */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0417, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00ba, code lost:
        if (r55 == 10) goto L123;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x03de A[Catch: all -> 0x041a, TRY_LEAVE, TryCatch #2 {all -> 0x041a, blocks: (B:43:0x01cb, B:45:0x01e7, B:50:0x01fb, B:54:0x020e, B:63:0x022c, B:83:0x02bd, B:87:0x0307, B:91:0x032b, B:95:0x0343, B:97:0x03d0, B:101:0x03de, B:86:0x0302, B:65:0x0239, B:60:0x0222, B:57:0x0217, B:49:0x01f1), top: B:129:0x01cb }] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0217 A[Catch: all -> 0x041a, TryCatch #2 {all -> 0x041a, blocks: (B:43:0x01cb, B:45:0x01e7, B:50:0x01fb, B:54:0x020e, B:63:0x022c, B:83:0x02bd, B:87:0x0307, B:91:0x032b, B:95:0x0343, B:97:0x03d0, B:101:0x03de, B:86:0x0302, B:65:0x0239, B:60:0x0222, B:57:0x0217, B:49:0x01f1), top: B:129:0x01cb }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0222 A[Catch: all -> 0x041a, TryCatch #2 {all -> 0x041a, blocks: (B:43:0x01cb, B:45:0x01e7, B:50:0x01fb, B:54:0x020e, B:63:0x022c, B:83:0x02bd, B:87:0x0307, B:91:0x032b, B:95:0x0343, B:97:0x03d0, B:101:0x03de, B:86:0x0302, B:65:0x0239, B:60:0x0222, B:57:0x0217, B:49:0x01f1), top: B:129:0x01cb }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x028d A[Catch: all -> 0x0417, TRY_LEAVE, TryCatch #1 {all -> 0x0417, blocks: (B:68:0x0251, B:70:0x0255, B:72:0x0259, B:74:0x026e, B:80:0x028d, B:67:0x024c), top: B:127:0x024c }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0302 A[Catch: all -> 0x041a, TryCatch #2 {all -> 0x041a, blocks: (B:43:0x01cb, B:45:0x01e7, B:50:0x01fb, B:54:0x020e, B:63:0x022c, B:83:0x02bd, B:87:0x0307, B:91:0x032b, B:95:0x0343, B:97:0x03d0, B:101:0x03de, B:86:0x0302, B:65:0x0239, B:60:0x0222, B:57:0x0217, B:49:0x01f1), top: B:129:0x01cb }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x03d0 A[Catch: all -> 0x041a, TryCatch #2 {all -> 0x041a, blocks: (B:43:0x01cb, B:45:0x01e7, B:50:0x01fb, B:54:0x020e, B:63:0x022c, B:83:0x02bd, B:87:0x0307, B:91:0x032b, B:95:0x0343, B:97:0x03d0, B:101:0x03de, B:86:0x0302, B:65:0x0239, B:60:0x0222, B:57:0x0217, B:49:0x01f1), top: B:129:0x01cb }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x03d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private org.android.spdy.SpdySession createSession(java.lang.String r49, java.lang.String r50, java.lang.Object r51, org.android.spdy.SessionCb r52, org.android.spdy.SessionCustomExtraCb r53, int r54, int r55, int r56, java.lang.String r57, int r58, int r59, int r60, java.lang.String r61, java.util.ArrayList<org.android.spdy.StrategyInfo> r62, boolean r63, boolean r64, boolean r65, int r66) throws org.android.spdy.SpdyErrorException {
        /*
            Method dump skipped, instructions count: 1085
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.android.spdy.SpdyAgent.createSession(java.lang.String, java.lang.String, java.lang.Object, org.android.spdy.SessionCb, org.android.spdy.SessionCustomExtraCb, int, int, int, java.lang.String, int, int, int, java.lang.String, java.util.ArrayList, boolean, boolean, boolean, int):org.android.spdy.SpdySession");
    }

    private SpdySession getSpdySession(String str) {
        SpdySession spdySession;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (SpdySession) ipChange.ipc$dispatch("9ff52554", new Object[]{this, str});
        }
        agentIsOpen();
        r.lock();
        try {
            SpdySession spdySession2 = this.sessionMgr.get(str);
            if (this.sessionMgr.size() < 150) {
                z = false;
            }
            if (z) {
                throw new SpdyErrorException("SPDY_SESSION_EXCEED_MAXED", (int) TnetStatusCode.TNET_SESSION_EXCEED_MAXED);
            }
            if (spdySession2 != null) {
                spdySession2.increRefCount();
                return spdySession2;
            }
            w.lock();
            try {
                spdySession = this.sessionMgr.get(str);
                w.unlock();
            } catch (Throwable unused) {
                w.unlock();
                spdySession = null;
            }
            if (spdySession == null) {
                return null;
            }
            spdySession.increRefCount();
            return spdySession;
        } finally {
            r.unlock();
        }
    }

    @Deprecated
    public SpdySession submitRequest(SpdyRequest spdyRequest, SpdyDataProvider spdyDataProvider, Object obj, Object obj2, Spdycb spdycb, SessionCb sessionCb, SslCertcb sslCertcb, int i) throws SpdyErrorException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SpdySession) ipChange.ipc$dispatch("6957a2b4", new Object[]{this, spdyRequest, spdyDataProvider, obj, obj2, spdycb, sessionCb, sslCertcb, new Integer(i)});
        }
        SpdySession createSession = createSession(spdyRequest.getAuthority(), spdyRequest.getDomain(), obj, sessionCb, sslCertcb, i, 0, spdyRequest.getConnectionTimeoutMs());
        createSession.submitRequest(spdyRequest, spdyDataProvider, obj2, spdycb);
        return createSession;
    }

    @Deprecated
    public SpdySession submitRequest(SpdyRequest spdyRequest, SpdyDataProvider spdyDataProvider, Object obj, Object obj2, Spdycb spdycb, SessionCb sessionCb, SslCertcb sslCertcb, int i, int i2) throws SpdyErrorException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SpdySession) ipChange.ipc$dispatch("7ba2d5ef", new Object[]{this, spdyRequest, spdyDataProvider, obj, obj2, spdycb, sessionCb, sslCertcb, new Integer(i), new Integer(i2)});
        }
        SpdySession createSession = createSession(spdyRequest.getAuthority(), spdyRequest.getDomain(), obj, sessionCb, sslCertcb, i, i2, spdyRequest.getConnectionTimeoutMs());
        createSession.submitRequest(spdyRequest, spdyDataProvider, obj2, spdycb);
        return createSession;
    }

    public SpdySession submitRequest(SpdyRequest spdyRequest, SpdyDataProvider spdyDataProvider, Object obj, Object obj2, Spdycb spdycb, SessionCb sessionCb, int i, int i2) throws SpdyErrorException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SpdySession) ipChange.ipc$dispatch("e335a2a1", new Object[]{this, spdyRequest, spdyDataProvider, obj, obj2, spdycb, sessionCb, new Integer(i), new Integer(i2)}) : submitRequest(spdyRequest, spdyDataProvider, obj, obj2, spdycb, sessionCb, null, i, i2);
    }

    @Deprecated
    public SpdySession submitRequest(SpdyRequest spdyRequest, SpdyDataProvider spdyDataProvider, Object obj, Object obj2, Spdycb spdycb, SessionCb sessionCb, int i) throws SpdyErrorException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SpdySession) ipChange.ipc$dispatch("aebf77c2", new Object[]{this, spdyRequest, spdyDataProvider, obj, obj2, spdycb, sessionCb, new Integer(i)}) : submitRequest(spdyRequest, spdyDataProvider, obj, obj2, spdycb, sessionCb, (SslCertcb) null, i);
    }

    private void agentIsOpen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f569fa00", new Object[]{this});
        } else if (this.isAgentClosed.get()) {
            throw new SpdyErrorException("SPDY_JNI_ERR_ASYNC_CLOSE", (int) TnetStatusCode.TNET_JNI_ERR_ASYNC_CLOSE);
        } else {
            checkLoadSo();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x004d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void close() {
        /*
            r5 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = org.android.spdy.SpdyAgent.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            if (r1 == 0) goto L12
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r2 = 0
            r1[r2] = r5
            java.lang.String r2 = "e32ba67f"
            r0.ipc$dispatch(r2, r1)
            return
        L12:
            boolean r0 = tb.sad.p()
            if (r0 != 0) goto L19
            return
        L19:
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.isAgentClosed
            boolean r0 = r0.getAndSet(r2)
            if (r0 != 0) goto L7f
            java.util.concurrent.locks.Lock r0 = org.android.spdy.SpdyAgent.w
            r0.lock()
            java.util.LinkedList<org.android.spdy.SpdySession> r0 = r5.sessionQueue     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r0 = r0.poll()     // Catch: java.lang.Throwable -> L3c
        L2c:
            org.android.spdy.SpdySession r0 = (org.android.spdy.SpdySession) r0     // Catch: java.lang.Throwable -> L3c
            if (r0 == 0) goto L40
            r0.closeInternal()     // Catch: java.lang.Throwable -> L3c
            java.util.LinkedList<org.android.spdy.SpdySession> r0 = r5.sessionQueue     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r0 = r0.poll()     // Catch: java.lang.Throwable -> L3c
            goto L2c
        L3a:
            r0 = move-exception
            goto L79
        L3c:
            r0 = move-exception
            r0.printStackTrace()     // Catch: java.lang.Throwable -> L3a
        L40:
            java.util.concurrent.locks.Lock r0 = org.android.spdy.SpdyAgent.w
            r0.unlock()
            long r0 = r5.agentNativePtr
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L57
            r5.freeAgent(r0)     // Catch: java.lang.UnsatisfiedLinkError -> L51
            goto L55
        L51:
            r0 = move-exception
            r0.printStackTrace()
        L55:
            r5.agentNativePtr = r2
        L57:
            java.util.concurrent.locks.Lock r0 = org.android.spdy.SpdyAgent.w
            r0.lock()
            java.util.HashMap<java.lang.String, org.android.spdy.SpdySession> r0 = r5.sessionMgr     // Catch: java.lang.Throwable -> L69
            r0.clear()     // Catch: java.lang.Throwable -> L69
            java.util.concurrent.locks.Lock r0 = org.android.spdy.SpdyAgent.w
            r0.unlock()
            return
        L67:
            r0 = move-exception
            goto L73
        L69:
            r0 = move-exception
            r0.printStackTrace()     // Catch: java.lang.Throwable -> L67
            java.util.concurrent.locks.Lock r0 = org.android.spdy.SpdyAgent.w
            r0.unlock()
            return
        L73:
            java.util.concurrent.locks.Lock r1 = org.android.spdy.SpdyAgent.w
            r1.unlock()
            throw r0
        L79:
            java.util.concurrent.locks.Lock r1 = org.android.spdy.SpdyAgent.w
            r1.unlock()
            throw r0
        L7f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.android.spdy.SpdyAgent.close():void");
    }

    public void removeSession(SpdySession spdySession) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("545ff676", new Object[]{this, spdySession});
            return;
        }
        w.lock();
        try {
            this.sessionQueue.remove(spdySession);
        } finally {
            w.unlock();
        }
    }

    public int closeSession(long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("bfbf2c52", new Object[]{this, new Long(j)})).intValue() : closeSessionN(j);
    }

    public static String[] mapToByteArray(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("f2df51b3", new Object[]{map});
        }
        if (map == null || map.size() <= 0) {
            return null;
        }
        String[] strArr = new String[map.size() << 1];
        for (Map.Entry<String, String> entry : map.entrySet()) {
            strArr[i] = entry.getKey();
            strArr[i + 1] = entry.getValue();
            i += 2;
        }
        return strArr;
    }

    public static Map<String, List<String>> stringArrayToMap(String[] strArr) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("e6b9a414", new Object[]{strArr});
        }
        if (strArr == null) {
            return null;
        }
        HashMap hashMap = new HashMap(5);
        while (true) {
            int i2 = i + 2;
            if (i2 > strArr.length) {
                return hashMap;
            }
            if (strArr[i] == null) {
                break;
            }
            int i3 = i + 1;
            if (strArr[i3] == null) {
                break;
            }
            List list = (List) hashMap.get(strArr[i]);
            if (list == null) {
                list = new ArrayList(1);
                hashMap.put(strArr[i], list);
            }
            list.add(strArr[i3]);
            i = i2;
        }
        return null;
    }

    public void setAccsSslCallback(AccsSSLCallback accsSSLCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dae67a6", new Object[]{this, accsSSLCallback});
        } else if (accsSSLCallback == null) {
            spduLog.Tloge(TAG, null, "[setAccsSslCallback] cb null", new Object[0]);
        } else {
            synchronized (ssLCallbackLock) {
                this.accsSSLCallback = accsSSLCallback;
                spduLog.Tloge(TAG, null, "[setAccsSslCallback]", accsSSLCallback.getClass(), t.CALL_BACK, this.accsSSLCallback);
            }
        }
    }

    private void spdySessionConnectCB(SpdySession spdySession, SuperviseConnectInfo superviseConnectInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d2bcf0e", new Object[]{this, spdySession, superviseConnectInfo});
            return;
        }
        spduLog.Logi(TAG, "[spdySessionConnectCB] - ");
        if (spdySession == null || spdySession.intenalcb == null) {
            spduLog.Logi(TAG, "[spdySessionConnectCB] - session|session.intenalcb is null");
            return;
        }
        spdySession.setSuperviseConnectInfoOnConnectedCB(superviseConnectInfo);
        spduLog.Tloge(TAG, spdySession.getSessionSeq(), "[SessionConnectCB]", "stat", spdySession.getConnectInfoOnConnected());
        spdySession.intenalcb.spdySessionConnectCB(spdySession, superviseConnectInfo);
    }

    private void spdySessionFailedError(SpdySession spdySession, int i, Object obj, SuperviseConnectInfo superviseConnectInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed7421c3", new Object[]{this, spdySession, new Integer(i), obj, superviseConnectInfo});
            return;
        }
        spduLog.Logi(TAG, "[spdySessionFailedError] - ");
        if (spdySession == null) {
            spduLog.Logi(TAG, "[spdySessionFailedError] - session|session.intenalcb is null");
            return;
        }
        try {
            spdySession.setSuperviseConnectInfoOnConnectedCB(superviseConnectInfo);
            spdySession.setSuperviseConnectInfoOnDisconnectedCB(superviseConnectInfo);
            spduLog.Tloge(TAG, spdySession.getSessionSeq(), "spdySessionFailedError", AmnetMonitorLoggerListener.LogModel.ERR_CODE, Integer.valueOf(i), "stat", spdySession.getConnectInfoOnDisConnected());
            spdySession.checkWifiConsecutiveFailStatus(i);
            if (spdySession.intenalcb != null) {
                spdySession.intenalcb.spdySessionFailedError(spdySession, i, obj);
            }
            spdySession.cleanUp();
            spdySession.releasePptr();
        } catch (Throwable th) {
            spdySession.cleanUp();
            throw th;
        }
    }

    private void spdySessionCloseCallback(SpdySession spdySession, Object obj, SuperviseConnectInfo superviseConnectInfo, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f76348e5", new Object[]{this, spdySession, obj, superviseConnectInfo, new Integer(i)});
            return;
        }
        spduLog.Logi(TAG, "[spdySessionCloseCallback] - errorCode = ", i);
        if (spdySession == null) {
            spduLog.Logi(TAG, "[spdySessionCloseCallback] - session|session.intenalcb is null");
            return;
        }
        try {
            if (!spdySession.isBg && sab.a() && i == -2301) {
                superviseConnectInfo.bgForbiddenTime = System.currentTimeMillis() - sab.f();
            }
            spdySession.setSuperviseConnectInfoOnDisconnectedCB(superviseConnectInfo);
            spdySession.checkWifiConsecutiveFailStatus(i);
            spduLog.Tloge(TAG, spdySession.getSessionSeq(), "[SessionCloseCallback]", AmnetMonitorLoggerListener.LogModel.ERR_CODE, Integer.valueOf(i));
            if (spdySession.intenalcb != null) {
                spdySession.intenalcb.spdySessionCloseCallback(spdySession, obj, superviseConnectInfo, i);
            }
            spdySession.cleanUp();
            spdySession.releasePptr();
        } catch (Throwable th) {
            spdySession.cleanUp();
            throw th;
        }
    }

    private void spdyDataChunkRecvCB(SpdySession spdySession, boolean z, int i, SpdyByteArray spdyByteArray, ByteBuffer byteBuffer, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea6aa066", new Object[]{this, spdySession, new Boolean(z), new Integer(i), spdyByteArray, byteBuffer, new Integer(i2), new Integer(i3)});
            return;
        }
        spduLog.Logi(TAG, "[spdyDataChunkRecvCB] - ");
        if (i2 == 1) {
            spdyByteArray.setDirectBufferMode(true);
            spdyByteArray.setDirectByteBuffer(byteBuffer);
        }
        long j = i & 4294967295L;
        if (spdySession == null || spdySession.intenalcb == null) {
            spduLog.Logi(TAG, "[spdyDataChunkRecvCB] - session|session.intenalcb is null");
        } else {
            spdySession.intenalcb.spdyDataChunkRecvCB(spdySession, z, j, spdyByteArray, i3);
        }
    }

    private void spdyDataRecvCallback(SpdySession spdySession, boolean z, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cd9167a", new Object[]{this, spdySession, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        spduLog.Logi(TAG, "[spdyDataRecvCallback] - ");
        long j = i & 4294967295L;
        if (spdySession == null || spdySession.intenalcb == null) {
            spduLog.Logi(TAG, "[spdyDataRecvCallback] - session|session.intenalcb is null");
        } else {
            spdySession.intenalcb.spdyDataRecvCallback(spdySession, z, j, i2, i3);
        }
    }

    private void spdyDataSendCallback(SpdySession spdySession, boolean z, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87a1009c", new Object[]{this, spdySession, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        long j = i & 4294967295L;
        if (spdySession == null || spdySession.intenalcb == null) {
            spduLog.Logi(TAG, "[spdyDataSendCallback] - session|session.intenalcb is null");
        } else {
            spdySession.intenalcb.spdyDataSendCallback(spdySession, z, j, i2, i3);
        }
    }

    private void spdyStreamCloseCallback(SpdySession spdySession, int i, int i2, int i3, SuperviseData superviseData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ce3a38b", new Object[]{this, spdySession, new Integer(i), new Integer(i2), new Integer(i3), superviseData});
            return;
        }
        spduLog.Logi(TAG, "[spdyStreamCloseCallback] - ");
        long j = i & 4294967295L;
        if (spdySession == null || spdySession.intenalcb == null) {
            spduLog.Logi(TAG, "[spdyStreamCloseCallback] - session|session.intenalcb is null");
            return;
        }
        if (!spdySession.isForceUseCellular() && i2 == 0) {
            wifiConsecutiveFailCount = 0;
        }
        if (superviseData != null) {
            try {
                superviseData.spdySession = spdySession;
                if (spdySession.isQUIC() && superviseData.unreliableChannelMss != spdySession.unreliableChannelMss) {
                    spdySession.unreliableChannelMss = superviseData.unreliableChannelMss;
                }
                if (spdySession.isTunnel()) {
                    superviseData.tunnelType = spdySession.mSuperviseConnectInfo.tunnelType;
                    if (spdySession.isTunnelProxyClose()) {
                        superviseData.tunnelDegraded = 1;
                        superviseData.tunnelErrorCode = spdySession.mSuperviseConnectInfo.tunnelErrorCode;
                    }
                }
            } catch (Exception unused) {
            }
        }
        spdySession.intenalcb.spdyStreamCloseCallback(spdySession, j, i2, i3, superviseData);
    }

    private void spdyPingRecvCallback(SpdySession spdySession, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e52c08cc", new Object[]{this, spdySession, new Integer(i), obj});
            return;
        }
        spduLog.Logi(TAG, "[spdyPingRecvCallback] - ");
        if (spdySession == null || spdySession.intenalcb == null) {
            spduLog.Logi(TAG, "[spdyPingRecvCallback] - session|session.intenalcb is null");
            return;
        }
        if (!spdySession.isForceUseCellular() && i > 0) {
            wifiConsecutiveFailCount = 0;
        }
        spdySession.intenalcb.spdyPingRecvCallback(spdySession, i, obj);
    }

    private void spdyCustomControlFrameRecvCallback(SpdySession spdySession, Object obj, int i, int i2, int i3, int i4, byte[] bArr, SuperviseData superviseData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bd9c77c", new Object[]{this, spdySession, obj, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), bArr, superviseData});
            return;
        }
        spduLog.Logi("tnet-jni", "[spdyCustomControlFrameRecvCallback] - ");
        if (spdySession == null || (spdySession.intenalcb == null && spdySession.customExtraCb == null)) {
            spduLog.Logi("tnet-jni", "[spdyCustomControlFrameRecvCallback] - session|session.intenalcb is null");
            return;
        }
        if (!spdySession.isForceUseCellular()) {
            wifiConsecutiveFailCount = 0;
        }
        System.currentTimeMillis();
        if (spdySession.customExtraCb != null) {
            spdySession.customExtraCb.onCustomFrameRecvCallback(spdySession, obj, i, i2, i3, i4, bArr, superviseData, null);
        } else {
            spdySession.intenalcb.spdyCustomControlFrameRecvCallback(spdySession, obj, i, i2, i3, i4, bArr);
        }
        if ((spdySession.getMode() & 256) == 0 || (spdySession.getMode() & 16) == 0 || superviseData == null || superviseData.unreliableChannelMss <= spdySession.unreliableChannelMss) {
            return;
        }
        spdySession.unreliableChannelMss = superviseData.unreliableChannelMss;
    }

    private void spdyCustomControlFrameFailCallback(SpdySession spdySession, Object obj, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7576ccd6", new Object[]{this, spdySession, obj, new Integer(i), new Integer(i2)});
            return;
        }
        spduLog.Logi(TAG, "[spdyCustomControlFrameFailCallback] - ");
        if (spdySession == null || spdySession.intenalcb == null) {
            spduLog.Logi(TAG, "[spdyCustomControlFrameFailCallback] - session|session.intenalcb is null");
        } else {
            spdySession.intenalcb.spdyCustomControlFrameFailCallback(spdySession, obj, i, i2);
        }
    }

    private void bioPingRecvCallback(SpdySession spdySession, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b6dabda", new Object[]{this, spdySession, new Integer(i)});
            return;
        }
        spduLog.Logi(TAG, "[bioPingRecvCallback] - ");
        if (spdySession == null || spdySession.intenalcb == null) {
            spduLog.Logi(TAG, "[bioPingRecvCallback] - session|session.intenalcb is null");
        } else {
            spdySession.intenalcb.bioPingRecvCallback(spdySession, i);
        }
    }

    private void spdyRequestRecvCallback(SpdySession spdySession, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad5f084c", new Object[]{this, spdySession, new Integer(i), new Integer(i2)});
            return;
        }
        long j = i & 4294967295L;
        if (spdySession == null || spdySession.intenalcb == null) {
            spduLog.Logi(TAG, "[spdyRequestRecvCallback] - session|session.intenalcb is null");
        } else {
            spdySession.intenalcb.spdyRequestRecvCallback(spdySession, j, i2);
        }
    }

    private void spdyStreamResponseRecv(SpdySession spdySession, int i, byte[] bArr, int[] iArr, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a81d4a8", new Object[]{this, spdySession, new Integer(i), bArr, iArr, new Integer(i2)});
            return;
        }
        spduLog.Logi(TAG, "[spdyStreamResponseRecv] - ");
        if (spdySession == null || spdySession.intenalcb == null) {
            spduLog.Logi(TAG, "[spdyStreamResponseRecv] - session|session.intenalcb is null");
            return;
        }
        String[] strArr = new String[iArr.length];
        c a2 = c.a();
        int i3 = 0;
        for (int i4 = 0; i4 < iArr.length; i4 += 2) {
            strArr[i4] = a2.a(ByteBuffer.wrap(bArr, i3, iArr[i4]));
            int i5 = i3 + iArr[i4];
            int i6 = i4 + 1;
            if (iArr[i6] > 32) {
                strArr[i6] = new String(bArr, i5, iArr[i6]);
            } else {
                strArr[i6] = a2.a(ByteBuffer.wrap(bArr, i5, iArr[i6]));
            }
            i3 = i5 + iArr[i6];
        }
        spdySession.intenalcb.spdyOnStreamResponse(spdySession, i & 4294967295L, stringArrayToMap(strArr), i2);
    }

    private void spdySessionOnWritable(SpdySession spdySession, Object obj, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f5c8a40", new Object[]{this, spdySession, obj, new Integer(i)});
            return;
        }
        spduLog.Logi(TAG, "[spdySessionOnWritable] - ");
        if (spdySession == null || spdySession.intenalcb == null) {
            spduLog.Logi(TAG, "[spdySessionOnWritable] - session|session.intenalcb is null");
            return;
        }
        try {
            spdySession.intenalcb.spdySessionOnWritable(spdySession, obj, i);
        } catch (Throwable th) {
            spduLog.Loge(TAG, "[spdySessionOnWritable] - exception:", th);
        }
    }

    private byte[] getSSLPublicKey(int i, byte[] bArr) {
        byte[] bArr2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("13408d1a", new Object[]{this, new Integer(i), bArr});
        }
        if (sad.x() && isInAllowLaunchTimePass(sad.H()) && sad.N() && i == 1) {
            spduLog.Tloge(TAG, null, "[getSSLPublicKey] second refresh cdn pubkey to plain", UiUtil.INPUT_TYPE_VALUE_NUM, Integer.valueOf(i));
            return null;
        }
        synchronized (ssLCallbackLock) {
            if (this.accsSSLCallback != null) {
                bArr2 = this.accsSSLCallback.getSSLPublicKey(i, bArr);
            } else {
                spduLog.Tloge(TAG, null, "getSSLPublicKey fail, cb is null", new Object[0]);
                bArr2 = null;
            }
        }
        if (bArr2 == null) {
            spduLog.Tloge(TAG, null, "getSSLPublicKey fail", t.CALL_BACK, this.accsSSLCallback, UiUtil.INPUT_TYPE_VALUE_NUM, Integer.valueOf(i), "cipher", bArr);
        }
        return bArr2;
    }

    private int putSSLMeta(SpdySession spdySession, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8ce64c60", new Object[]{this, spdySession, bArr})).intValue();
        }
        if (spdySession == null || spdySession.intenalcb == null) {
            spduLog.Logi(TAG, "[putSSLMeta] - session|session.intenalcb is null");
            return -1;
        }
        return spdySession.intenalcb.putSSLMeta(spdySession, bArr);
    }

    private byte[] getSSLMeta(SpdySession spdySession) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("c9362ffe", new Object[]{this, spdySession});
        }
        if (spdySession == null || spdySession.intenalcb == null) {
            spduLog.Logi(TAG, "[getSSLMeta] - session|session.intenalcb is null");
            return null;
        }
        return spdySession.intenalcb.getSSLMeta(spdySession);
    }

    private int bindSocketFd2NetworkInterfaceN(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2138c839", new Object[]{this, new Integer(i), new Integer(i2)})).intValue();
        }
        if (i2 == NetWorkStatusUtil.InterfaceStatus.ACTIVE_INTERFACE_WIFI.getInterfaceStatus()) {
            return NetWorkStatusUtil.b(i);
        }
        if (i2 != NetWorkStatusUtil.InterfaceStatus.ACTIVE_INTERFACE_CELLULAR.getInterfaceStatus()) {
            return -1;
        }
        return NetWorkStatusUtil.a(i);
    }

    public HashMap<String, SpdySession> getAllSession() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashMap) ipChange.ipc$dispatch("2eb35595", new Object[]{this}) : this.sessionMgr;
    }

    public int configLogFile(String str, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ec49f1e2", new Object[]{this, str, new Integer(i), new Integer(i2)})).intValue();
        }
        if (!loadTnetSoSucc) {
            return -1;
        }
        return configLogFileN(str, i, i2);
    }

    public int configLogFile(String str, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9cf4bee7", new Object[]{this, str, new Integer(i), new Integer(i2), new Integer(i3)})).intValue();
        }
        if (!loadTnetSoSucc) {
            return -1;
        }
        return configLogFileN(str, i, i2, i3);
    }

    public void logFileFlush() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6092e8b", new Object[]{this});
        } else if (!loadTnetSoSucc) {
        } else {
            logFileFlushN();
        }
    }

    public void logFileClose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebac377f", new Object[]{this});
        } else if (!loadTnetSoSucc) {
        } else {
            logFileFlushN();
            logFileCloseN();
        }
    }

    private boolean commonCacheStore(final String str, final String str2, final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d2e988c2", new Object[]{this, str, str2, new Integer(i)})).booleanValue();
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        try {
            mStorageMap.put(str, str2.getBytes());
            sae.b(new Runnable() { // from class: org.android.spdy.SpdyAgent.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    String str3;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (sad.z()) {
                        SpdyAgent.access$100().store(str, str2);
                    } else {
                        String valueOf = String.valueOf(System.currentTimeMillis());
                        if (1 != i) {
                            str3 = valueOf + SpdyAgent.CACHE_TIME_SPLIT + str2;
                        } else {
                            str3 = str2;
                        }
                        SpdyAgent.access$200().store(str, str3);
                    }
                }
            });
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    private byte[] commonCacheLoad(final String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("15118768", new Object[]{this, str, new Integer(i)});
        }
        try {
            byte[] bArr = mStorageMap.get(str);
            if (bArr != null) {
                return bArr;
            }
            if (sad.z()) {
                byte[] load = quicSecureSpCache.load(str);
                if (load != null) {
                    mStorageMap.put(str, load);
                }
                return load;
            }
            byte[] load2 = xqcCache.load(str);
            if (load2 == null) {
                return null;
            }
            if (i == 1) {
                return load2;
            }
            long currentTimeMillis = System.currentTimeMillis();
            String str2 = new String(load2, 0, load2.length);
            int indexOf = str2.indexOf(CACHE_TIME_SPLIT);
            if (-1 == indexOf) {
                return null;
            }
            if (sad.o() + Long.parseLong(str2.substring(0, indexOf)) < currentTimeMillis) {
                spduLog.Logd("tnet-jni", "xquic cache is expired");
                sae.b(new Runnable() { // from class: org.android.spdy.SpdyAgent.4
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            SpdyAgent.access$200().remove(str);
                        }
                    }
                });
            }
            return str2.substring(indexOf + 3).getBytes();
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    private void commonCacheRemove(final String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2cd0f077", new Object[]{this, str, new Integer(i)});
            return;
        }
        try {
            sae.b(new Runnable() { // from class: org.android.spdy.SpdyAgent.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    SpdyAgent.access$300().remove(str);
                    if (sad.z()) {
                        SpdyAgent.access$100().remove(str);
                    } else {
                        SpdyAgent.access$200().remove(str);
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    private int getNetWorkStatus() {
        IpChange ipChange = $ipChange;
        int i = 1;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d9433a4", new Object[]{this})).intValue();
        }
        if (!NetWorkStatusUtil.a()) {
            i = 0;
        }
        return NetWorkStatusUtil.b() ? i | 2 : i;
    }

    private int AndroidVerifyProof(String[] strArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("67b1eb2f", new Object[]{this, strArr})).intValue() : QuicProofVerifier.VerifyProof(null, strArr);
    }

    private int getActiveInterfaceType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("48fbc471", new Object[]{this})).intValue() : NetWorkStatusUtil.f.getInterfaceStatus();
    }

    private int logOutput(final int i, final String str, final String str2, final String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b3949ba8", new Object[]{this, new Integer(i), str, str2, str3})).intValue();
        }
        if (!sad.a()) {
            return -1;
        }
        try {
            sae.a(new Runnable() { // from class: org.android.spdy.SpdyAgent.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        spduLog.logAdapter(i, str, str2, str3, new Object[0]);
                    }
                }
            });
            return 0;
        } catch (Throwable unused) {
            return -1;
        }
    }

    public static void configSwitchValueByKey(long j, int i, double d, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e175095", new Object[]{new Long(j), new Integer(i), new Double(d), str});
        } else if (!loadTnetSoSucc) {
        } else {
            configSwitchValueByKeyN(j, i, d, str);
        }
    }

    public static boolean pluginLoadQuicSo(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6588d3a8", new Object[]{str})).booleanValue() : loadTnetSoSucc && pluginLoadQuicSoN(str) == 0;
    }

    public static boolean pluginLoadZstdSo(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2c6d3d3", new Object[]{str})).booleanValue() : loadTnetSoSucc && pluginLoadZstdSoN(str) == 0;
    }

    public static int configIpStackMode(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9011d64d", new Object[]{new Integer(i)})).intValue();
        }
        if (!loadTnetSoSucc) {
            return -1;
        }
        return configIpStackModeN(i);
    }
}
