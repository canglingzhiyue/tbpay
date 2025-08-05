package com.taobao.android.dinamicx;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.monitor.DXTraceUtil;
import java.io.File;
import tb.fqi;
import tb.fux;
import tb.kge;

/* loaded from: classes5.dex */
public class bx {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static boolean A;
    private static String C;

    /* renamed from: a  reason: collision with root package name */
    public static bz f11831a;
    private static boolean b;
    private static boolean c;
    private static boolean d;
    private static boolean e;
    private static boolean f;
    private static boolean g;
    private static boolean h;
    private static boolean i;
    private static boolean j;
    private static boolean k;
    private static boolean l;
    private static boolean m;
    private static boolean n;
    private static boolean o;
    private static boolean p;
    private static boolean q;
    private static boolean r;
    private static boolean s;
    private static boolean t;
    private static boolean u;
    private static boolean v;
    private static boolean w;
    private static boolean x;
    private static boolean y;
    private static boolean z;

    static {
        kge.a(-1492912798);
        c = false;
        e = false;
        g = false;
        i = false;
        j = u.e() != null && u.e().a() == 2;
        v = true;
        w = true;
        x = true;
        y = true;
        z = false;
        C = "";
    }

    public static boolean q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("64de47c", new Object[0])).booleanValue() : v;
    }

    public static boolean r() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("65bfbfd", new Object[0])).booleanValue() : x;
    }

    public static String v() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b8ef3443", new Object[0]) : C;
    }

    public static final boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue();
        }
        if (c) {
            return b && fqi.D();
        }
        bz bzVar = f11831a;
        if (bzVar != null) {
            b = bzVar.a(DinamicXEngine.i(), "dx_scroll_hitchrate_dinamicx_key");
        } else {
            b = false;
        }
        c = true;
        fux.b("DXABGlobalManage  dxScrollHitchRateDinamicX " + b);
        Log.e("DXABGlobalManager", "DXABGlobalManage  dxScrollHitchRateDinamicX " + b);
        return b && fqi.D();
    }

    public static final boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : d && fqi.aH();
    }

    public static final boolean j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[0])).booleanValue() : f && fqi.aH();
    }

    public static final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[0]);
            return;
        }
        fux.b("DXABGlobalManage  initImageABForLauncher ");
        Log.e("DXABGlobalManager", "DXABGlobalManage  initImageABForLauncher ");
        if (!g) {
            bz bzVar = f11831a;
            if (bzVar != null) {
                f = bzVar.a(DinamicXEngine.i(), "dx_scroll_hitchrate_image_post_runnable_key_new");
            } else {
                f = false;
            }
            g = true;
            fux.b("DXABGlobalManage initImageABForLauncher dxScrollHitchRateImagePost " + f);
            Log.e("DXABGlobalManager", "DXABGlobalManage initImageABForLauncher  dxScrollHitchRateImagePost " + f);
        }
        if (e) {
            return;
        }
        bz bzVar2 = f11831a;
        if (bzVar2 != null) {
            d = bzVar2.a(DinamicXEngine.i(), "dx_scroll_hitchrate_image_work_thread_key_new");
        } else {
            d = false;
        }
        e = true;
        fux.b("DXABGlobalManage initImageABForLauncher  dxScrollHitchRateImage " + d);
        Log.e("DXABGlobalManager", "DXABGlobalManage initImageABForLauncher  dxScrollHitchRateImage " + d);
    }

    public static final boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[0])).booleanValue();
        }
        if (!i) {
            bz bzVar = f11831a;
            if (bzVar != null) {
                h = bzVar.a(DinamicXEngine.i(), "dx_scroll_hitchrate_view_reuse_key_new");
            } else {
                h = false;
            }
            i = true;
            fux.b("DXABGlobalManage  dx_scroll_hitchrate_view_reuse_key_new " + h);
            Log.e("DXABGlobalManager", "DXABGlobalManage  dx_scroll_hitchrate_view_reuse_key_new " + h);
            return h;
        }
        return h;
    }

    public static final boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[0])).booleanValue() : (j && fqi.aL() && b) || k;
    }

    public static final boolean u() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6864280", new Object[0])).booleanValue() : j && fqi.bp();
    }

    public static final boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[0])).booleanValue();
        }
        if (m) {
            return true;
        }
        return j && b;
    }

    public static void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[0]);
            return;
        }
        try {
            File[] listFiles = new File("/data/local/tmp/.DXABGlobalManager").listFiles();
            if (DinamicXEngine.j()) {
                u = true;
                t = true;
                A = true;
            }
            if (listFiles == null) {
                return;
            }
            for (File file : listFiles) {
                if (file.getName().equalsIgnoreCase(".dxScrollHitchRateDinamicX")) {
                    c = true;
                    b = true;
                    Log.e("DXABGlobalManager", "initForTester DXABGlobalManage  dxScrollHitchRateDinamicX " + b);
                } else if (file.getName().equalsIgnoreCase(".dxScrollHitchRateImage")) {
                    e = true;
                    d = true;
                    Log.e("DXABGlobalManager", "initForTester DXABGlobalManage  dxScrollHitchRateImage " + d);
                } else if (file.getName().equalsIgnoreCase(".dxScrollHitchRateImagePost")) {
                    g = true;
                    f = true;
                    Log.e("DXABGlobalManager", "initForTester DXABGlobalManage  dxScrollHitchRateImagePost " + f);
                } else if (file.getName().equalsIgnoreCase(".dxScrollHitchRateViewReuse")) {
                    i = true;
                    h = true;
                    Log.e("DXABGlobalManager", "initForTester DXABGlobalManage  dxScrollHitchRateViewReuse " + h);
                } else if (".closeAppMonitor".equalsIgnoreCase(file.getName())) {
                    k = true;
                    Log.e("DXABGlobalManager", "initForTester DXABGlobalManage  closeAppMonitor " + k);
                } else if (".closeTLog".equalsIgnoreCase(file.getName())) {
                    l = true;
                    Log.e("DXABGlobalManager", "initForTester DXABGlobalManage  closeTlog " + l);
                } else if (".closeOpenTrace".equalsIgnoreCase(file.getName())) {
                    m = true;
                    Log.e("DXABGlobalManager", "initForTester DXABGlobalManage  closeOpenTrace " + m);
                } else if (".openReleaseLog".equalsIgnoreCase(file.getName())) {
                    n = true;
                    Log.e("DXABGlobalManager", "initForTester DXABGlobalManage  openReleaseLog " + n);
                } else if (".openConsumeLog".equalsIgnoreCase(file.getName())) {
                    o = true;
                    Log.e("DXABGlobalManager", "initForTester DXABGlobalManage  openConsumeLog " + o);
                } else if (".openEventChainLog".equalsIgnoreCase(file.getName())) {
                    s = true;
                    Log.e("DXABGlobalManager", "initForTester DXABGlobalManage  openEventChainLog " + s);
                } else if (".openSysTrace".equalsIgnoreCase(file.getName())) {
                    p = true;
                    DXTraceUtil.a(true);
                    Log.e("DXABGlobalManager", "initForTester DXABGlobalManage  openSysTrace " + p);
                } else if (".closeDebugException".equalsIgnoreCase(file.getName())) {
                    q = true;
                    Log.e("DXABGlobalManager", "initForTester DXABGlobalManage  closeDebugException " + q);
                } else if (".openParserSysTrace".equalsIgnoreCase(file.getName())) {
                    DXTraceUtil.b(true);
                    Log.e("DXABGlobalManager", "initForTester DXABGlobalManage  parserTraceEnableSwicth true");
                } else if (".openRecyclerLayoutPrefetchLog".equalsIgnoreCase(file.getName())) {
                    r = true;
                    Log.e("DXABGlobalManager", "initForTester DXABGlobalManage  openRecyclerLayoutPrefetchLog " + r);
                } else if (".openOnBeforeDeepCloneOpt".equalsIgnoreCase(file.getName())) {
                    t = true;
                    Log.e("DXABGlobalManager", "initForTester DXABGlobalManage  isOpenOnBeforeDeepCloneOpt " + t);
                } else if (".closeOnBeforeDeepCloneOpt".equalsIgnoreCase(file.getName())) {
                    t = false;
                    Log.e("DXABGlobalManager", "initForTester DXABGlobalManage  isOpenOnBeforeDeepCloneOpt " + t);
                } else if (".openFlattenOptimize".equalsIgnoreCase(file.getName())) {
                    u = true;
                    Log.e("DXABGlobalManager", "initForTester DXABGlobalManage  openFlattenOptimize " + u);
                } else if (".closeFlattenOptimize".equalsIgnoreCase(file.getName())) {
                    u = false;
                    Log.e("DXABGlobalManager", "initForTester DXABGlobalManage  openFlattenOptimize " + u);
                } else if (".openCommonOptimize".equalsIgnoreCase(file.getName())) {
                    A = true;
                    Log.e("DXABGlobalManager", "initForTester DXABGlobalManage  openCommonOptimize " + A);
                } else if (".closeCommonOptimize".equalsIgnoreCase(file.getName())) {
                    A = false;
                    Log.e("DXABGlobalManager", "initForTester DXABGlobalManage  openCommonOptimize " + A);
                } else if (".closeButterPreRender".equalsIgnoreCase(file.getName())) {
                    v = false;
                    Log.e("DXABGlobalManager", "init DXABGlobalManage  openPreRender " + v);
                } else if (".closeButter".equalsIgnoreCase(file.getName())) {
                    w = false;
                    Log.e("DXABGlobalManager", "init DXABGlobalManage  openButter " + w);
                } else if (".closeFlat".equalsIgnoreCase(file.getName())) {
                    x = false;
                    Log.e("DXABGlobalManager", "init DXABGlobalManage  openFlat " + x);
                } else if (".closeForceLayout".equalsIgnoreCase(file.getName())) {
                    y = false;
                    Log.e("DXABGlobalManager", "init DXABGlobalManage  openForceLayout " + y);
                } else if (".openCollectMeasure".equalsIgnoreCase(file.getName())) {
                    z = true;
                    Log.e("DXABGlobalManager", "init DXABGlobalManage  openCollectMeasure " + z);
                } else if (".butterTemplateWhiteList".equalsIgnoreCase(file.getName())) {
                    C = com.taobao.android.dinamicx.template.download.c.a(file);
                }
            }
            if (!new File("/data/local/tmp/.trace_dx").exists()) {
                return;
            }
            p = true;
            DXTraceUtil.a(true);
            Log.e("DXABGlobalManager", "init DXABGlobalManage  openSysTrace " + p);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static boolean h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[0])).booleanValue() : o;
    }

    public static boolean i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[0])).booleanValue() : n;
    }

    public static boolean k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[0])).booleanValue() : q;
    }

    public static boolean l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[0])).booleanValue() : r;
    }

    public static boolean m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6158678", new Object[0])).booleanValue() : s;
    }

    public static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[0]);
            return;
        }
        bz bzVar = f11831a;
        if (bzVar == null) {
            return;
        }
        t = bzVar.a(DinamicXEngine.i(), "dx_performace_opt_open_on_before_deep_clone");
        fux.b("DXABGlobalManage init  isOpenOnBeforeDeepCloneOpt " + o());
        Log.e("DXABGlobalManager", "DXABGlobalManage init  isOpenOnBeforeDeepCloneOpt " + o());
        u = f11831a.a(DinamicXEngine.i(), "dx_performace_opt_open_flatten_opt");
        fux.b("DXABGlobalManage init  openFlattenOptimize " + p());
        Log.e("DXABGlobalManager", "DXABGlobalManage init  openFlattenOptimize " + p());
        A = f11831a.a(DinamicXEngine.i(), "dx_performace_opt_common");
        fux.b("DXABGlobalManage init  openCommonOptimize " + p());
        Log.e("DXABGlobalManager", "DXABGlobalManage init  openCommonOptimize " + p());
    }

    public static boolean o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("631b57a", new Object[0])).booleanValue() : t && fqi.D();
    }

    public static boolean p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("63fccfb", new Object[0])).booleanValue() : u && fqi.bf();
    }

    public static boolean t() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6782aff", new Object[0])).booleanValue() : A && fqi.D();
    }

    public static boolean s() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("66a137e", new Object[0])).booleanValue() : t && fqi.D();
    }
}
