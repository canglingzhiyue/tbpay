package com.tmall.android.dai.internal.init;

import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.q;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.v3.FalcoSpanLayer;
import com.taobao.mrt.task.g;
import com.tmall.android.dai.adapter.DAIUserAdapter;
import com.tmall.android.dai.internal.compute.b;
import com.tmall.android.dai.internal.streamprocessing.WalleStreamListener;
import com.tmall.android.dai.internal.streamprocessing.WalleStreamSource;
import com.tmall.android.dai.internal.usertrack.c;
import com.tmall.android.dai.internal.util.DeviceInfos;
import com.tmall.android.dai.internal.util.LogUtil;
import com.tmall.android.dai.internal.windvane.WVDaiApiPlugin;
import com.ut.mini.module.plugin.d;
import org.tensorflow.contrib.tmall.sqlite.DbManager;
import org.tensorflow.contrib.tmall.task.TaskManager;
import tb.gsc;
import tb.huk;
import tb.kge;
import tb.ktk;
import tb.riq;
import tb.rkq;
import tb.rkr;
import tb.rku;

/* loaded from: classes9.dex */
public class WalleInitBridgeJava {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f23693a = false;
    private final String b = "Bridge";
    private final String c = "ConfigCenter";
    private final String d = "DataLayer";
    private final String e = "PythonLib";
    private final String f = "Highway";
    private final String g = "FeatureCenter";
    private final String h = "StreamProcessing";
    private final String i = com.tmall.android.dai.internal.streamprocessing.a.LISTENER_NAME;
    private final String j = "WalleNonCommonNativeModules";
    private final String k = "WalleConfigUpdateListener";
    private final String l = "MrtThreadPool";

    /* loaded from: classes9.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final WalleInitBridgeJava f23694a;

        static {
            kge.a(579177027);
            f23694a = new WalleInitBridgeJava();
        }

        public static /* synthetic */ WalleInitBridgeJava a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (WalleInitBridgeJava) ipChange.ipc$dispatch("64f47a48", new Object[0]) : f23694a;
        }
    }

    static {
        kge.a(1153502833);
    }

    public native void nativeInitWalle();

    public static WalleInitBridgeJava a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WalleInitBridgeJava) ipChange.ipc$dispatch("64f47a48", new Object[0]) : a.a();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005e, code lost:
        if (r6.equals("ConfigCenter") != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean initWalleJavaModule(java.lang.String r6) {
        /*
            r5 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.tmall.android.dai.internal.init.WalleInitBridgeJava.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            r3 = 2
            r4 = 0
            if (r1 == 0) goto L1c
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r1[r4] = r5
            r1[r2] = r6
            java.lang.String r6 = "4e6ab40e"
            java.lang.Object r6 = r0.ipc$dispatch(r6, r1)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            return r6
        L1c:
            r0 = -1
            int r1 = r6.hashCode()
            switch(r1) {
                case -1714812435: goto L81;
                case -909656870: goto L76;
                case -766215691: goto L6b;
                case -422013710: goto L61;
                case -108030377: goto L58;
                case 518724585: goto L4e;
                case 949080275: goto L44;
                case 1622495143: goto L3a;
                case 1742225107: goto L30;
                case 1998032809: goto L26;
                default: goto L24;
            }
        L24:
            goto L8b
        L26:
            java.lang.String r1 = "Bridge"
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L8b
            r2 = 0
            goto L8c
        L30:
            java.lang.String r1 = "StreamProcessing"
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L8b
            r2 = 5
            goto L8c
        L3a:
            java.lang.String r1 = "DataLayer"
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L8b
            r2 = 2
            goto L8c
        L44:
            java.lang.String r1 = "WalleNonCommonNativeModules"
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L8b
            r2 = 7
            goto L8c
        L4e:
            java.lang.String r1 = "PythonLib"
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L8b
            r2 = 3
            goto L8c
        L58:
            java.lang.String r1 = "ConfigCenter"
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L8b
            goto L8c
        L61:
            java.lang.String r1 = "WalleUtTrackerListener"
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L8b
            r2 = 6
            goto L8c
        L6b:
            java.lang.String r1 = "MrtThreadPool"
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L8b
            r2 = 9
            goto L8c
        L76:
            java.lang.String r1 = "WalleConfigUpdateListener"
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L8b
            r2 = 8
            goto L8c
        L81:
            java.lang.String r1 = "Highway"
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L8b
            r2 = 4
            goto L8c
        L8b:
            r2 = -1
        L8c:
            switch(r2) {
                case 0: goto Ld4;
                case 1: goto Lcf;
                case 2: goto Lca;
                case 3: goto Lc5;
                case 4: goto Lc0;
                case 5: goto Lbb;
                case 6: goto Lb6;
                case 7: goto Lb1;
                case 8: goto Lac;
                case 9: goto La7;
                default: goto L8f;
            }
        L8f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "unknown module "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            java.lang.String r0 = "WalleInitBridgeJava"
            com.tmall.android.dai.internal.util.LogUtil.e(r0, r6)
            goto Ld8
        La7:
            boolean r4 = r5.o()
            goto Ld8
        Lac:
            boolean r4 = r5.n()
            goto Ld8
        Lb1:
            boolean r4 = r5.j()
            goto Ld8
        Lb6:
            boolean r4 = r5.i()
            goto Ld8
        Lbb:
            boolean r4 = r5.h()
            goto Ld8
        Lc0:
            boolean r4 = r5.f()
            goto Ld8
        Lc5:
            boolean r4 = r5.e()
            goto Ld8
        Lca:
            boolean r4 = r5.d()
            goto Ld8
        Lcf:
            boolean r4 = r5.c()
            goto Ld8
        Ld4:
            boolean r4 = r5.b()
        Ld8:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tmall.android.dai.internal.init.WalleInitBridgeJava.initWalleJavaModule(java.lang.String):boolean");
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        if (rkq.d().b()) {
            return true;
        }
        try {
            LogUtil.d("WalleInitBridgeJava", "initBridge start");
            b.a().b();
            LogUtil.d("WalleInitBridgeJava", "initBridge addTaskInner success");
            rkq.d().b(true);
            LogUtil.d("WalleInitBridgeJava", "initBridge success");
            return true;
        } catch (Throwable th) {
            LogUtil.e("WalleInitBridgeJava", "initBridge error!!!", th);
            a(181, th.getMessage());
            com.tmall.android.dai.internal.util.a.a("DAI", 19999, "init_error", "java-c bridge", null, null);
            return false;
        }
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        TaskManager.getInstance().onNativeInit();
        return true;
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
        }
        if (rkq.d().a()) {
            return true;
        }
        try {
            DbManager.getInstance().initIfNeeded();
            rkq.d().a(true);
            return true;
        } catch (Throwable th) {
            LogUtil.e("WalleInitBridgeJava", "初始化数据层失败.", th);
            a(181, th.getMessage());
            com.tmall.android.dai.internal.util.a.a("DAI", 19999, "init_error", "java-c-data bridge", null, null);
            return false;
        }
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue();
        }
        gsc.a().b();
        return true;
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue();
        }
        DAIUserAdapter a2 = rkr.a();
        if (a2 != null) {
            ktk.a(rkq.d().e(), a2.getTtid());
            return true;
        }
        LogUtil.w("WalleInitBridgeJava", "highway client not init!");
        com.tmall.android.dai.internal.util.a.a("DAI", 19999, "init_error", "highway client", null, null);
        return false;
    }

    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue();
        }
        com.taobao.android.jarviswe.a.a().a(rkq.d().e().getApplicationContext());
        return true;
    }

    public boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue();
        }
        DeviceInfos.b();
        WalleStreamListener.getInstance().registerCallbackToStreamConstructor();
        WalleStreamSource.getInstance();
        return true;
    }

    public boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[]{this})).booleanValue();
        }
        com.tmall.android.dai.internal.streamprocessing.a.a().b();
        return true;
    }

    private boolean p() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("63fccfb", new Object[]{this})).booleanValue();
        }
        try {
            z = huk.a();
            if (!z) {
                LogUtil.e("WalleInitBridgeJava", "MNNBridge load fail");
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return z;
    }

    private boolean q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("64de47c", new Object[]{this})).booleanValue();
        }
        try {
            q.a("WVDAIHandler", (Class<? extends e>) WVDaiApiPlugin.class);
            return true;
        } catch (Throwable th) {
            LogUtil.e("WalleInitBridgeJava", "WV插件注册失败。", th);
            return false;
        }
    }

    public boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[]{this})).booleanValue();
        }
        q();
        return p();
    }

    public boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[]{this})).booleanValue();
        }
        try {
            d.getInstance().registerPlugin(new c());
            return true;
        } catch (Throwable th) {
            a(97, th.getMessage());
            com.tmall.android.dai.internal.util.a.a("DAI", 19999, "init_error", "ut plugin", null, null);
            return false;
        }
    }

    public boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[]{this})).booleanValue();
        }
        try {
            riq.a(rkq.d().e());
            return true;
        } catch (Throwable th) {
            LogUtil.e("WalleInitBridgeJava", "WADataCollector初始化失败.", th);
            return false;
        }
    }

    public boolean m() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6158678", new Object[]{this})).booleanValue();
        }
        boolean z2 = l() && k();
        if (g() && z2) {
            z = true;
        }
        rku.a().b();
        return z;
    }

    public boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6239df9", new Object[]{this})).booleanValue();
        }
        rkq.d().n().a();
        return m();
    }

    public boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("631b57a", new Object[]{this})).booleanValue();
        }
        com.taobao.mrt.c.a(rkq.d().e());
        g.a().a(com.tmall.android.dai.internal.config.d.a().g(), com.tmall.android.dai.internal.config.d.a().h(), "ODCP");
        return true;
    }

    private static void a(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20f12ca5", new Object[]{new Integer(i), str});
            return;
        }
        com.tmall.android.dai.internal.util.a.a(FalcoSpanLayer.BUSINESS, "initialize", String.valueOf(i), str);
        rkq.d().d(true);
    }
}
