package org.android.spdy;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import org.android.netutil.UtilTool;
import tb.ihq;
import tb.ihu;
import tb.ihw;
import tb.sad;

/* loaded from: classes.dex */
public class SoInstallMgrSdk {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String QUIC_SO_NAME = "xquic";
    private static final String TAG = "tnetsdk.SoInstallMgrSdk";
    private static final String TNET_SO_NAME = "tnet-4.0.0";
    private static final String ZSTD_SO_NAME = "zstd";
    private static String mQuicSoPath;
    private static String mZstdSoPath;
    private static final AtomicBoolean isLocalSOInit = new AtomicBoolean(false);
    private static final CopyOnWriteArraySet<IPluginFetchCallback> quicListeners = new CopyOnWriteArraySet<>();
    public static volatile long fetchLocalSOStartTime = 0;
    private static long fetchQuicTime = 0;
    public static volatile boolean loadQuicSucc = false;
    public static int loadQuicStat = -1;
    private static final AtomicBoolean isRemoteSOInit = new AtomicBoolean(false);
    public static volatile long fetchRemoteSOStartTime = 0;
    private static long fetchZstdTime = 0;
    public static int loadZstdStat = -1;

    public static /* synthetic */ long access$000() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("bcd6076b", new Object[0])).longValue() : fetchQuicTime;
    }

    public static /* synthetic */ long access$002(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e1550f5f", new Object[]{new Long(j)})).longValue();
        }
        fetchQuicTime = j;
        return j;
    }

    public static /* synthetic */ String access$100() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6c2478e8", new Object[0]) : mQuicSoPath;
    }

    public static /* synthetic */ String access$102(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("de613c1c", new Object[]{str});
        }
        mQuicSoPath = str;
        return str;
    }

    public static /* synthetic */ CopyOnWriteArraySet access$200() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CopyOnWriteArraySet) ipChange.ipc$dispatch("c59b2470", new Object[0]) : quicListeners;
    }

    public static /* synthetic */ long access$302(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("18f895fc", new Object[]{new Long(j)})).longValue();
        }
        fetchZstdTime = j;
        return j;
    }

    public static /* synthetic */ String access$400() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("60292585", new Object[0]) : mZstdSoPath;
    }

    public static /* synthetic */ String access$402(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f490db79", new Object[]{str});
        }
        mZstdSoPath = str;
        return str;
    }

    public static boolean loadTnetSo() {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2d84ac76", new Object[0])).booleanValue();
        }
        long currentTimeMillis = System.currentTimeMillis();
        try {
            System.loadLibrary(TNET_SO_NAME);
            z = true;
        } catch (Throwable th) {
            th.printStackTrace();
            z = false;
        }
        spduLog.Tloge(TAG, null, "loadTnet so", "cost", Long.valueOf(System.currentTimeMillis() - currentTimeMillis), "succ", Boolean.valueOf(z));
        return z;
    }

    public static void fetchLocalSoAndPluginLoad() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0bb8cea", new Object[0]);
        } else if (!isLocalSOInit.compareAndSet(false, true)) {
        } else {
            fetchLocalSOStartTime = System.currentTimeMillis();
            fetchQuicSoAndPluginLoad();
        }
    }

    public static void fetchRemoteSoAndPluginLoad() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c72339bb", new Object[0]);
        } else if (!isRemoteSOInit.compareAndSet(false, true)) {
        } else {
            fetchRemoteSOStartTime = System.currentTimeMillis();
            fetchZstdSoAndPluginLoad();
        }
    }

    public static void fetchQuicSoAndPluginLoad() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe4e7e43", new Object[0]);
        } else if (!sad.s()) {
            spduLog.Tloge(TAG, null, "disable load quic", "enable", Boolean.valueOf(sad.r()), "process", UtilTool.a());
            loadQuicStat = 0;
        } else {
            try {
                ihq.b().a(QUIC_SO_NAME, new ihu() { // from class: org.android.spdy.SoInstallMgrSdk.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // tb.ihu
                    public void onFetchFinished(ihw ihwVar) {
                        int errorCode;
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("e2928fec", new Object[]{this, ihwVar});
                            return;
                        }
                        SoInstallMgrSdk.access$002(System.currentTimeMillis() - SoInstallMgrSdk.fetchLocalSOStartTime);
                        if (!TextUtils.isEmpty(ihwVar.b())) {
                            SoInstallMgrSdk.access$102(ihwVar.b());
                            boolean pluginLoadQuicSo = SpdyAgent.pluginLoadQuicSo(SoInstallMgrSdk.access$100());
                            SoInstallMgrSdk.loadQuicSucc = pluginLoadQuicSo;
                            errorCode = pluginLoadQuicSo ? 1 : 2;
                        } else {
                            errorCode = ihwVar.f().getErrorCode();
                        }
                        SoInstallMgrSdk.loadQuicStat = errorCode;
                        spduLog.Tloge(SoInstallMgrSdk.TAG, null, "[RemoteXquic] succ=" + SoInstallMgrSdk.loadQuicSucc, "stat", Integer.valueOf(SoInstallMgrSdk.loadQuicStat), "path", SoInstallMgrSdk.access$100(), "cost", Long.valueOf(SoInstallMgrSdk.access$000()));
                        Iterator it = SoInstallMgrSdk.access$200().iterator();
                        while (it.hasNext()) {
                            try {
                                ((IPluginFetchCallback) it.next()).onFetchFinished(SoInstallMgrSdk.loadQuicSucc, null);
                            } catch (Exception e) {
                                spduLog.Tloge(SoInstallMgrSdk.TAG, null, "listener exception", e);
                            }
                        }
                    }
                });
            } catch (Throwable th) {
                loadQuicStat = 3;
                spduLog.Tloge(TAG, null, "[RemoteXquic] fail", "qcStat", Integer.valueOf(loadQuicStat), "e", th);
            }
        }
    }

    public static void fetchZstdSoAndPluginLoad() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff35cf38", new Object[0]);
        } else if (!sad.F()) {
            loadZstdStat = 0;
        } else {
            try {
                ihq.b().a("zstd", new ihu() { // from class: org.android.spdy.SoInstallMgrSdk.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // tb.ihu
                    public void onFetchFinished(ihw ihwVar) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("e2928fec", new Object[]{this, ihwVar});
                            return;
                        }
                        SoInstallMgrSdk.access$302(System.currentTimeMillis() - SoInstallMgrSdk.fetchRemoteSOStartTime);
                        if (TextUtils.isEmpty(ihwVar.b())) {
                            SoInstallMgrSdk.loadZstdStat = ihwVar.f().getErrorCode();
                            spduLog.Tloge(SoInstallMgrSdk.TAG, null, "[RemoteZstd] path null", "errCode", Integer.valueOf(SoInstallMgrSdk.loadZstdStat));
                            return;
                        }
                        SoInstallMgrSdk.access$402(ihwVar.b());
                        boolean pluginLoadZstdSo = SpdyAgent.pluginLoadZstdSo(SoInstallMgrSdk.access$400());
                        SoInstallMgrSdk.loadZstdStat = pluginLoadZstdSo ? 1 : 2;
                        spduLog.Tloge(SoInstallMgrSdk.TAG, null, "[RemoteZstd] succ=" + pluginLoadZstdSo, "path", SoInstallMgrSdk.access$400());
                    }
                });
            } catch (Throwable th) {
                loadZstdStat = 3;
                spduLog.Tloge(TAG, null, "[RemoteZstd] fail", "e", th);
            }
        }
    }

    public static void registerQuicListener(IPluginFetchCallback iPluginFetchCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6577c030", new Object[]{iPluginFetchCallback});
        } else if (iPluginFetchCallback == null) {
        } else {
            quicListeners.add(iPluginFetchCallback);
        }
    }

    public static void unregisterQuicListener(IPluginFetchCallback iPluginFetchCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ba94277", new Object[]{iPluginFetchCallback});
        } else {
            quicListeners.remove(iPluginFetchCallback);
        }
    }

    public static Long getFetchZstdTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Long) ipChange.ipc$dispatch("bab22474", new Object[0]);
        }
        long j = fetchZstdTime;
        if (j <= 0) {
            j = System.currentTimeMillis() - fetchRemoteSOStartTime;
        }
        return Long.valueOf(j);
    }

    public static Long getFetchQuicTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Long) ipChange.ipc$dispatch("107655ff", new Object[0]);
        }
        long j = fetchQuicTime;
        if (j <= 0) {
            j = System.currentTimeMillis() - fetchLocalSOStartTime;
        }
        return Long.valueOf(j);
    }
}
