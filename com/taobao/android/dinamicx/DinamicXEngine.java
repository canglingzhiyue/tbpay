package com.taobao.android.dinamicx;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRenderOptions;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.bf;
import com.taobao.android.dinamicx.eventchain.f;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.expression.event.DXMsgCenterEvent;
import com.taobao.android.dinamicx.monitor.DXMonitorConstant;
import com.taobao.android.dinamicx.s;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.dinamicx.videoc.DXVideoControlConfig;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.DXWidgetRefreshOption;
import com.taobao.android.dinamicx.y;
import com.taobao.android.dxv4common.logic.dex.DXModuleManager;
import java.io.File;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.alr;
import tb.alu;
import tb.ctz;
import tb.dkt;
import tb.dln;
import tb.fpv;
import tb.fpw;
import tb.fpy;
import tb.fqb;
import tb.fqh;
import tb.fqi;
import tb.fuf;
import tb.fut;
import tb.fuw;
import tb.fux;
import tb.fva;
import tb.fvb;
import tb.fvc;
import tb.fve;
import tb.fvl;
import tb.fwl;
import tb.fwn;
import tb.fxf;
import tb.fxh;
import tb.fzm;
import tb.gbc;
import tb.gbg;
import tb.gfc;
import tb.gfx;
import tb.ggx;
import tb.ggz;
import tb.gha;
import tb.ghb;
import tb.ghe;
import tb.kge;

/* loaded from: classes.dex */
public final class DinamicXEngine extends m implements y.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static Class<? extends fvl> B = null;
    public static final String ENGINE_INIT_ERROR_LOG_KEY = "DinamicXInitError";
    private static long L = 0;
    public static final String OPEN_TRACE_KEY_RENDER_TMPL = "renderForTemplate";
    public static final int REFRESH_TYPE_LAYOUT = 1;
    public static final int REFRESH_TYPE_PARSE = 0;
    public static final String RENDER_TEMPLATE = "renderTemplateTime";
    public static final String URL_SKIP_VERSION_KEY = "skipV";
    private static volatile boolean q;
    private static boolean r;
    private static Context s;
    private static y t;
    private static i u;
    private t A;
    private fvl C;
    private Map<String, ai> D;
    private com.taobao.android.dinamicx.videoc.b E;
    private bb F;
    private final DXEngineConfig G;
    private fqh H;
    private ggz I;
    private bj J;
    private ggx K;
    private WeakReference<Activity> M;
    private alu N;
    private Map<String, com.alibaba.ability.b> O;
    private Map<String, Map<String, dln>> P;
    public bo Q;
    private com.taobao.android.dinamicx.model.b<com.taobao.android.dinamicx.widget.ak> R;
    private bi S;
    public am c;
    public aw d;
    public ThreadLocal<aw> e;
    public fzm f;
    public fva g;
    public ab h;
    public fqb i;
    public com.taobao.android.dinamicx.eventchain.i j;
    public gfc k;
    private fxh l;
    private fpw m;
    private com.taobao.android.dinamicx.model.b<fut> n;
    private com.taobao.android.dinamicx.model.b<bn> o;
    private com.taobao.android.dinamicx.model.b<com.taobao.android.dinamicx.widget.ak> p;
    private boolean v;
    private ak w;
    private com.taobao.android.dinamicx.expression.expr_v2.d x;
    private ghb y;
    private HashMap<String, com.taobao.android.dinamicx.expression.expr_v2.j> z;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes5.dex */
    public @interface DXRefreshType {
    }

    public static /* synthetic */ Object ipc$super(DinamicXEngine dinamicXEngine, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ DXRuntimeContext a(DinamicXEngine dinamicXEngine, Context context, DXRootView dXRootView, DXTemplateItem dXTemplateItem, JSONObject jSONObject, am amVar, DXRenderOptions dXRenderOptions) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXRuntimeContext) ipChange.ipc$dispatch("48b30a8e", new Object[]{dinamicXEngine, context, dXRootView, dXTemplateItem, jSONObject, amVar, dXRenderOptions}) : dinamicXEngine.a(context, dXRootView, dXTemplateItem, jSONObject, amVar, dXRenderOptions);
    }

    public static /* synthetic */ DXRuntimeContext a(DinamicXEngine dinamicXEngine, Context context, DXTemplateItem dXTemplateItem, JSONObject jSONObject, DXButterRootView dXButterRootView, DXRenderOptions dXRenderOptions) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXRuntimeContext) ipChange.ipc$dispatch("af0ecd00", new Object[]{dinamicXEngine, context, dXTemplateItem, jSONObject, dXButterRootView, dXRenderOptions}) : dinamicXEngine.a(context, dXTemplateItem, jSONObject, dXButterRootView, dXRenderOptions);
    }

    public static /* synthetic */ fpw a(DinamicXEngine dinamicXEngine) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (fpw) ipChange.ipc$dispatch("1748fb80", new Object[]{dinamicXEngine}) : dinamicXEngine.m;
    }

    public static /* synthetic */ void a(s sVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bea75199", new Object[]{sVar});
        } else {
            b(sVar);
        }
    }

    static {
        kge.a(648849982);
        kge.a(-337578759);
        q = false;
        r = false;
    }

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
        } else {
            a(context, (v) null);
        }
    }

    public static synchronized void a(Context context, v vVar) {
        synchronized (DinamicXEngine.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8c56b7be", new Object[]{context, vVar});
                return;
            }
            try {
                fux.b("开始初始化DX SDK Engine initialize ");
                Log.e("DinamicX", "开始初始化DX SDK Engine initialize ");
                if (q) {
                    return;
                }
                L = System.currentTimeMillis();
                Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    s = applicationContext;
                } else {
                    s = context;
                }
                if (vVar == null) {
                    q = true;
                    return;
                }
                r = vVar.n;
                if (vVar.g != null) {
                    fux.a(vVar.g);
                }
                if (vVar.f != null) {
                    com.taobao.android.dinamicx.monitor.b.a(vVar.f);
                }
                if (vVar.b != null) {
                    u.f11936a.a(vVar.b);
                }
                if (vVar.w != null) {
                    com.taobao.android.dinamicx.monitor.e.a(vVar.w);
                }
                if (s == null) {
                    s sVar = new s("initialize");
                    s.a aVar = new s.a(DXMonitorConstant.DX_MONITOR_ENGINE, DXMonitorConstant.DX_MONITOR_SERVICE_ID_SDK_INIT_ENV, 30018);
                    String str = "";
                    if (applicationContext == null) {
                        str = str + "applicationContext == null";
                    }
                    if (context == null) {
                        str = str + "   context == nul";
                    }
                    aVar.e = str;
                    sVar.c.add(aVar);
                    com.taobao.android.dinamicx.monitor.b.a(sVar);
                    b(sVar);
                    fux.b(aVar.e);
                }
                for (int i = 0; i < u.f11936a.size(); i++) {
                    fut valueAt = u.f11936a.valueAt(i);
                    if ((valueAt instanceof fuf) && !StringUtils.isEmpty(((fuf) valueAt).getDxFunctionName())) {
                        com.taobao.android.dinamicx.expression.expr_v2.d.a(((fuf) valueAt).getDxFunctionName(), (fuf) valueAt);
                    }
                }
                if (vVar.f11937a != null) {
                    u.b.a(vVar.f11937a);
                }
                for (int i2 = 0; i2 < u.b.size(); i2++) {
                    bn valueAt2 = u.b.valueAt(i2);
                    if ((valueAt2 instanceof h) && !StringUtils.isEmpty(((h) valueAt2).getDxFunctionName())) {
                        com.taobao.android.dinamicx.expression.expr_v2.d.a(((h) valueAt2).getDxFunctionName(), (h) valueAt2);
                    }
                }
                if (vVar.c != null) {
                    u.c.a(vVar.c);
                }
                if (vVar.G != null) {
                    u.t.a(vVar.G);
                }
                if (vVar.e != null) {
                    u.d = vVar.e;
                }
                if (vVar.h != null) {
                    u.e = vVar.h;
                }
                if (vVar.j != null) {
                    u.f = vVar.j;
                }
                if (vVar.B != null) {
                    u.o = vVar.B;
                }
                if (vVar.r != null) {
                    u.g = vVar.r;
                    au.f11810a = vVar.r;
                }
                if (vVar.k != null) {
                    u.j = vVar.k;
                }
                if (vVar.i != null) {
                    u.i = vVar.i;
                }
                if (vVar.s != null) {
                    u.h = vVar.s;
                }
                fqi.a();
                if (vVar.p != 0) {
                    gbg.a(vVar.p);
                }
                if (vVar.A != null) {
                    com.taobao.android.dinamicx.monitor.h.a(vVar.A);
                }
                if (vVar.l != null) {
                    DXDarkModeCenter.b = vVar.l;
                }
                if (vVar.H != null) {
                    cl.f11838a = vVar.H;
                }
                if (vVar.q != null) {
                    B = vVar.q;
                }
                if (vVar.t != null) {
                    p.f11916a = vVar.t;
                }
                if (vVar.u != null) {
                    p.b = new q(vVar.u);
                }
                if (vVar.v != null) {
                    u.k = vVar.v;
                }
                DXDarkModeCenter.f11774a = vVar.o;
                if (vVar.x != null) {
                    u.l = vVar.x;
                }
                u.m = vVar.y;
                if (vVar.z != null) {
                    u.n = vVar.z;
                }
                if (vVar.d != null) {
                    b(vVar.d);
                }
                if (vVar.C != null) {
                    bx.f11831a = vVar.C;
                }
                if (vVar.D != null) {
                    u.p = vVar.D;
                }
                if (vVar.E != null) {
                    u.q = vVar.E;
                }
                if (vVar.F != null) {
                    u.s = vVar.F;
                }
                fwl.b().a();
                ctz.b().a();
                b(i());
                com.taobao.android.dinamicx.monitor.d.a(i());
                com.taobao.android.dinamicx.monitor.d.b();
                C();
                DXModuleManager.getInstance().init();
                bx.c();
                bx.n();
                au.a();
                q = true;
                Log.e("DinamicX", "完成DX SDK Engine initialize");
                fux.b("完成DX SDK Engine initialize ");
            } catch (Throwable th) {
                try {
                    if (j()) {
                        th.printStackTrace();
                    }
                    final String a2 = com.taobao.android.dinamicx.exception.a.a(th);
                    fux.b("DX SDK 初始化失败发生异常 " + a2);
                    new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.taobao.android.dinamicx.DinamicXEngine.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            s sVar2 = new s("initialize");
                            s.a aVar2 = new s.a(DXMonitorConstant.DX_MONITOR_ENGINE, DXMonitorConstant.DX_MONITOR_SERVICE_ID_ENGINE_INIT_ENV, 30001);
                            aVar2.e = a2;
                            sVar2.c.add(aVar2);
                            com.taobao.android.dinamicx.monitor.b.a(sVar2);
                            DinamicXEngine.a(sVar2);
                        }
                    }, 10000L);
                } catch (Throwable unused) {
                }
            }
        }
    }

    private static void b(List<ghe> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d39e1eda", new Object[]{list});
            return;
        }
        for (ghe gheVar : list) {
            if (gheVar != null && !StringUtils.isEmpty(gheVar.getDxFunctionName())) {
                gha.BUILD_IN_FUNC_MAP.put(gheVar.getDxFunctionName(), gfx.a(gheVar));
            }
        }
        list.clear();
    }

    private static void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eca0fff", new Object[]{context});
        } else if (fqi.S()) {
            t = new y(fqi.T());
            if (context != null) {
                context.registerComponentCallbacks(t);
            }
            if (!j()) {
                return;
            }
            fuw.d("DXConfigCenter", "全局 LowMemory 监听开");
        } else if (!j()) {
        } else {
            fuw.d("DXConfigCenter", "全局 LowMemory 监听关");
        }
    }

    private static void C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c5ab4a", new Object[0]);
            return;
        }
        IDXApmManager h = u.h();
        if (h == null) {
            return;
        }
        u = new i();
        h.a(u);
        if (!fqi.ar()) {
            return;
        }
        a(fvc.a());
    }

    public DinamicXEngine(DXEngineConfig dXEngineConfig) {
        super(new r(dXEngineConfig));
        String c;
        this.v = true;
        String str = null;
        this.M = null;
        if (dXEngineConfig == null) {
            if (j()) {
                throw new RuntimeException("DXEngineConfig cannot be null");
            }
            fux.b("构建DXEngine的时候，DXEngineConfig cannot be null");
            Log.e("DinamicX", "构建DXEngine的时候，DXEngineConfig cannot be null");
            c = null;
        } else {
            c = dXEngineConfig.c();
            a(dXEngineConfig.c());
        }
        fux.b("开始构造DXEngine " + c);
        Log.e("DinamicX", "开始构造DXEngine " + c);
        if (!q || i() == null) {
            if (j()) {
                throw new RuntimeException("DinamicX not initialize");
            }
            s sVar = new s(this.f11887a);
            s.a aVar = new s.a(DXMonitorConstant.DX_MONITOR_ENGINE, DXMonitorConstant.DX_MONITOR_SERVICE_ID_ENGINE_INIT, 30011);
            aVar.e = !q ? "没有初始化" : "context == null";
            String str2 = aVar.e;
            sVar.c.add(aVar);
            com.taobao.android.dinamicx.monitor.b.a(sVar);
            this.v = false;
            b(sVar);
            str = str2;
        }
        this.G = dXEngineConfig;
        try {
            this.b.a(this);
            this.n = new com.taobao.android.dinamicx.model.b<>(u.f11936a);
            this.o = new com.taobao.android.dinamicx.model.b<>(u.b);
            this.p = K();
            this.f = new fzm();
            this.g = new fva(b());
            this.d = L();
            this.d.a(b().d);
            fux.b("Engine 构造 dxTemplateManager" + this.d);
            this.h = new ab(this.b);
            this.c = a(this.b, this.d);
            if (dXEngineConfig.D()) {
                this.Q = new bo(this.b, this.d);
                this.R = this.Q.a(this.p);
            }
        } catch (Throwable th) {
            this.v = false;
            s sVar2 = new s(this.f11887a);
            s.a aVar2 = new s.a(DXMonitorConstant.DX_MONITOR_ENGINE, DXMonitorConstant.DX_MONITOR_SERVICE_ID_ENGINE_INIT, 30002);
            aVar2.e = "30002 reason=" + str + "-" + com.taobao.android.dinamicx.exception.a.a(th);
            sVar2.c.add(aVar2);
            com.taobao.android.dinamicx.monitor.b.a(sVar2);
            com.taobao.android.dinamicx.exception.a.b(th);
            b(sVar2);
        }
        a(false);
        H();
        G();
        b(dXEngineConfig);
        I();
        c(dXEngineConfig);
        fqi.b();
        a(dXEngineConfig);
        F();
        E();
        com.taobao.android.dinamicx.monitor.d.a(this);
        D();
        R();
        fux.b("完成构造DXEngine " + c);
        Log.e("DinamicX", "完成构造DXEngine " + c);
    }

    private void a(String str) {
        try {
            if (!fqi.aG() || q) {
                return;
            }
            Class.forName("com.taobao.android.launcher.DinamicXLauncherV3").getMethod("init", Application.class, HashMap.class).invoke(null, O(), null);
            Log.e("DinamicX", "DX 没有在启动任务初始化，补偿初始化" + str);
            fux.b("DX 没有在启动任务初始化，补偿初始化" + str);
            com.taobao.android.dinamicx.monitor.b.a(this.f11887a, null, DXMonitorConstant.DX_MONITOR_ENGINE, DXMonitorConstant.DX_MONITOR_SERVICE_ID_ENGINE_INIT_ENV, s.DXError_INIT_30021, "进行dx sdkde 补偿初始化");
        } catch (Exception e) {
            fux.b(str + "DX 没有在启动任务初始化，补偿初始化" + com.taobao.android.dinamicx.exception.a.a(e));
        }
    }

    private void D() {
        try {
            this.I = (ggz) u.g().b().getClass().newInstance();
            J();
            this.k = new gfc();
        } catch (Throwable th) {
            com.taobao.android.dinamicx.exception.a.b(th);
            com.taobao.android.dinamicx.monitor.b.a(this.f11887a, null, DXMonitorConstant.DX_MONITOR_ENGINE, DXMonitorConstant.DX_MONITOR_SERVICE_ID_ENGINE_INIT_ENV, 30020, com.taobao.android.dinamicx.exception.a.a(th));
        }
    }

    private void R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4990bd9", new Object[]{this});
            return;
        }
        this.N = new alu(new alr("bizId", "DX"), false);
        this.O = new ConcurrentHashMap();
        this.O.putAll(u.r);
    }

    private void E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e1da4c", new Object[]{this});
            return;
        }
        y yVar = t;
        if (yVar == null) {
            return;
        }
        yVar.a(this);
    }

    private void F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3eff1cd", new Object[]{this});
        } else {
            this.F = new bb();
        }
    }

    private void a(DXEngineConfig dXEngineConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3384374c", new Object[]{this, dXEngineConfig});
            return;
        }
        try {
            this.E = new com.taobao.android.dinamicx.videoc.b(dXEngineConfig.p() != null ? dXEngineConfig.p() : DXVideoControlConfig.b(), this.f11887a);
            if (!fqi.j() || !dXEngineConfig.q()) {
                return;
            }
            this.E.c();
        } catch (Throwable th) {
            String str = this.f11887a;
            com.taobao.android.dinamicx.monitor.b.a(str, null, DXMonitorConstant.DX_VIDEO_CONTROL, DXMonitorConstant.DX_VIDEO_CONTROL_INIT_CRASH, s.DX_VIDEO_CONTROL_INIT_CRASH, " initTime: " + L + " curTime: " + System.currentTimeMillis() + " trace: " + com.taobao.android.dinamicx.exception.a.a(th));
        }
    }

    @Deprecated
    public boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : this.v;
    }

    private void b(DXEngineConfig dXEngineConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("330dd14d", new Object[]{this, dXEngineConfig});
            return;
        }
        try {
            this.l = new fxh(dXEngineConfig.g());
        } catch (Throwable th) {
            com.taobao.android.dinamicx.exception.a.b(th);
            com.taobao.android.dinamicx.monitor.b.a(this.f11887a, null, DXMonitorConstant.DX_MONITOR_ENGINE, DXMonitorConstant.DX_MONITOR_SERVICE_ID_ENGINE_INIT, 30013, com.taobao.android.dinamicx.exception.a.a(th));
        }
    }

    public void a(fxf fxfVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4446e6c0", new Object[]{this, fxfVar, new Long(j)});
        } else {
            this.l.a(fxfVar, j);
        }
    }

    public void a(fxf fxfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e96da084", new Object[]{this, fxfVar});
        } else {
            this.l.a(fxfVar);
        }
    }

    private void G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fe094e", new Object[]{this});
            return;
        }
        try {
            this.m = new fpw(this.b);
        } catch (Throwable th) {
            com.taobao.android.dinamicx.monitor.b.a(this.f11887a, null, DXMonitorConstant.DX_MONITOR_ASYNC_RENDER, DXMonitorConstant.DX_ASYNC_RENDER_INIT_CRASH, s.V3_ASYNC_RENDER_INIT_CRASH, com.taobao.android.dinamicx.exception.a.a(th));
        }
    }

    private void H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40c20cf", new Object[]{this});
            return;
        }
        try {
            this.i = new fqb(this.b);
            if (!j()) {
                return;
            }
            com.alibaba.android.bindingx.core.h.f2229a = false;
        } catch (Throwable th) {
            com.taobao.android.dinamicx.exception.a.b(th);
            com.taobao.android.dinamicx.monitor.b.a(this.f11887a, null, DXMonitorConstant.DX_MONITOR_BINDINGX, DXMonitorConstant.DX_BINDINGX_CRASH, s.BINDINGX_INIT_CRASH, com.taobao.android.dinamicx.exception.a.a(th));
        }
    }

    public fvl e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (fvl) ipChange.ipc$dispatch("2dcb607e", new Object[]{this}) : this.C;
    }

    private void I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41a3850", new Object[]{this});
            return;
        }
        try {
            this.j = new com.taobao.android.dinamicx.eventchain.i(this.b);
        } catch (Throwable th) {
            com.taobao.android.dinamicx.exception.a.a(th, false);
            com.taobao.android.dinamicx.monitor.b.a(this.f11887a, null, DXMonitorConstant.DX_MONITOR_EVENTCHAIN, DXMonitorConstant.DX_EVENTCHAIN_CRASH, s.EVENTCHAIN_INIT_CRASH, com.taobao.android.dinamicx.exception.a.a(th));
        }
    }

    private void J() {
        try {
            Class<? extends ghb> e = u.g().e();
            if (e == null) {
                return;
            }
            this.y = e.newInstance();
        } catch (Throwable th) {
            com.taobao.android.dinamicx.exception.a.b(th);
            com.taobao.android.dinamicx.monitor.b.a(this.f11887a, null, DXMonitorConstant.DX_MONITOR_V4_LOGIC, DXMonitorConstant.DX_MONITOR_V4_LOGIC_ERROR, s.DXSCRIPT_V4_LOGIC_ERROR, com.taobao.android.dinamicx.exception.a.a(th));
        }
    }

    public ghb f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ghb) ipChange.ipc$dispatch("357d4478", new Object[]{this}) : this.y;
    }

    private void c(DXEngineConfig dXEngineConfig) {
        try {
            this.x = new com.taobao.android.dinamicx.expression.expr_v2.d();
            this.b.a(this.x);
            this.z = new HashMap<>();
            Class<? extends fvl> cls = B;
            if (cls != null) {
                this.C = cls.newInstance();
            }
            this.A = new t(this.z, this.C);
            this.b.a(this.A);
        } catch (Throwable th) {
            com.taobao.android.dinamicx.exception.a.b(th);
            com.taobao.android.dinamicx.monitor.b.a(this.f11887a, null, DXMonitorConstant.DX_MONITOR_SCRIPT, DXMonitorConstant.DX_MONITOR_SCRIPT_ERROR, s.DXSCRIPT_INIT_ERROR, com.taobao.android.dinamicx.exception.a.a(th));
        }
    }

    public com.taobao.android.dinamicx.eventchain.i g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.dinamicx.eventchain.i) ipChange.ipc$dispatch("3a150dc3", new Object[]{this}) : this.j;
    }

    @Override // com.taobao.android.dinamicx.m
    public DXEngineConfig b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXEngineConfig) ipChange.ipc$dispatch("78a66ef1", new Object[]{this}) : this.G;
    }

    public DXResult<DXRootView> a(DXRootView dXRootView, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXResult) ipChange.ipc$dispatch("bce3921a", new Object[]{this, dXRootView, jSONObject});
        }
        if (dXRootView != null) {
            try {
                if (dXRootView.getContext() != null && dXRootView.dxTemplateItem != null) {
                    return a(dXRootView.getContext(), jSONObject, dXRootView, gbg.a(), gbg.b(), (Object) null);
                }
            } catch (Throwable th) {
                if (j()) {
                    th.printStackTrace();
                }
                s sVar = new s(this.f11887a);
                if (dXRootView != null) {
                    sVar.b = dXRootView.dxTemplateItem;
                }
                s.a aVar = new s.a(DXMonitorConstant.DX_MONITOR_ENGINE, DXMonitorConstant.DX_MONITOR_SERVICE_ID_ENGINE_RENDER, 30004);
                aVar.e = com.taobao.android.dinamicx.exception.a.a(th);
                sVar.c.add(aVar);
                com.taobao.android.dinamicx.monitor.b.a(sVar);
                return new DXResult<>(sVar);
            }
        }
        s sVar2 = new s(this.f11887a);
        s.a aVar2 = new s.a(DXMonitorConstant.DX_MONITOR_ENGINE, DXMonitorConstant.DX_MONITOR_SERVICE_ID_ENGINE_RENDER, 30004);
        aVar2.e = "dxRootView == null || dxRootView.getContext() == null || dxRootView.dxTemplateItem == null";
        sVar2.c.add(aVar2);
        com.taobao.android.dinamicx.monitor.b.a(sVar2);
        return new DXResult<>(sVar2);
    }

    public DXResult<DXRootView> a(Context context, JSONObject jSONObject, DXRootView dXRootView, int i, int i2, Object obj) {
        DXTemplateItem dXTemplateItem;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXResult) ipChange.ipc$dispatch("89443634", new Object[]{this, context, jSONObject, dXRootView, new Integer(i), new Integer(i2), obj});
        }
        try {
            dXTemplateItem = dXRootView.dxTemplateItem;
        } catch (Throwable th) {
            th = th;
            dXTemplateItem = null;
        }
        try {
            return a(context, dXRootView, dXTemplateItem, jSONObject, -1, new DXRenderOptions.a().a(i).b(i2).a(obj).a());
        } catch (Throwable th2) {
            th = th2;
            com.taobao.android.dinamicx.exception.a.b(th);
            s sVar = new s(this.f11887a);
            sVar.b = dXTemplateItem;
            s.a aVar = new s.a(DXMonitorConstant.DX_MONITOR_ENGINE, DXMonitorConstant.DX_MONITOR_SERVICE_ID_ENGINE_RENDER, 30004);
            aVar.e = com.taobao.android.dinamicx.exception.a.a(th);
            sVar.c.add(aVar);
            com.taobao.android.dinamicx.monitor.b.a(sVar);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0380 A[Catch: Throwable -> 0x03e6, TryCatch #6 {Throwable -> 0x03e6, blocks: (B:88:0x02bd, B:92:0x02dc, B:96:0x02ee, B:98:0x02f8, B:100:0x0300, B:103:0x0315, B:106:0x031b, B:108:0x032f, B:110:0x0335, B:111:0x0357, B:114:0x035f, B:116:0x0365, B:117:0x0374, B:119:0x0380, B:120:0x0391, B:122:0x03ba), top: B:154:0x028e }] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x03ba A[Catch: Throwable -> 0x03e6, TRY_LEAVE, TryCatch #6 {Throwable -> 0x03e6, blocks: (B:88:0x02bd, B:92:0x02dc, B:96:0x02ee, B:98:0x02f8, B:100:0x0300, B:103:0x0315, B:106:0x031b, B:108:0x032f, B:110:0x0335, B:111:0x0357, B:114:0x035f, B:116:0x0365, B:117:0x0374, B:119:0x0380, B:120:0x0391, B:122:0x03ba), top: B:154:0x028e }] */
    /* JADX WARN: Type inference failed for: r13v0, types: [com.taobao.android.dinamicx.DXRenderOptions] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v20 */
    /* JADX WARN: Type inference failed for: r13v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.android.alibaba.ip.runtime.IpChange] */
    /* JADX WARN: Type inference failed for: r2v30, types: [java.lang.Object[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.taobao.android.dinamicx.DXResult<com.taobao.android.dinamicx.DXRootView> a(final android.content.Context r29, com.taobao.android.dinamicx.DXRootView r30, com.taobao.android.dinamicx.template.download.DXTemplateItem r31, com.alibaba.fastjson.JSONObject r32, int r33, com.taobao.android.dinamicx.DXRenderOptions r34) {
        /*
            Method dump skipped, instructions count: 1080
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.dinamicx.DinamicXEngine.a(android.content.Context, com.taobao.android.dinamicx.DXRootView, com.taobao.android.dinamicx.template.download.DXTemplateItem, com.alibaba.fastjson.JSONObject, int, com.taobao.android.dinamicx.DXRenderOptions):com.taobao.android.dinamicx.DXResult");
    }

    public void a(DXWidgetNode dXWidgetNode, int i, DXWidgetRefreshOption dXWidgetRefreshOption) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe6c32b", new Object[]{this, dXWidgetNode, new Integer(i), dXWidgetRefreshOption});
        } else if (dXWidgetNode == null) {
        } else {
            if (dXWidgetRefreshOption == null) {
                dXWidgetRefreshOption = new DXWidgetRefreshOption();
            }
            if (i == 0) {
                dXWidgetNode.setNeedParse(dXWidgetRefreshOption);
            } else if (i == 1) {
                dXWidgetNode.setNeedLayout(dXWidgetRefreshOption);
            }
            fuw.a("完成局部刷新");
        }
    }

    public void b(Context context, DXTemplateItem dXTemplateItem, JSONObject jSONObject, int i, DXRenderOptions dXRenderOptions) {
        DXRenderOptions dXRenderOptions2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c0e4f45", new Object[]{this, context, dXTemplateItem, jSONObject, new Integer(i), dXRenderOptions});
        } else if (dXTemplateItem == null) {
        } else {
            dXTemplateItem.a(this.G.D());
            if (dXTemplateItem.a(this.f11887a)) {
                if (dXRenderOptions != null) {
                    dXRenderOptions2 = new DXRenderOptions.a().c(4).a(dXRenderOptions.a()).b(dXRenderOptions.b()).a(dXRenderOptions.c()).a(dXRenderOptions.d()).a();
                } else {
                    dXRenderOptions2 = DXRenderOptions.DEFAULT_PRERENDER_X_OPTIONS;
                }
                a(context, dXTemplateItem, jSONObject, i, dXRenderOptions2);
                return;
            }
            a(context, dXTemplateItem, jSONObject, i, dXRenderOptions);
        }
    }

    public void a(final Context context, final DXTemplateItem dXTemplateItem, final JSONObject jSONObject, int i, final DXRenderOptions dXRenderOptions) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8b9f084", new Object[]{this, context, dXTemplateItem, jSONObject, new Integer(i), dXRenderOptions});
            return;
        }
        fuw.f("开始 preRenderTemplate ", dXTemplateItem.b() + " " + dXTemplateItem.l);
        if (!fqi.o(this.f11887a) || fqi.ao() || this.m == null || dXTemplateItem == null) {
            return;
        }
        dXTemplateItem.a(this.G.D());
        if (dXTemplateItem.a(this.f11887a)) {
            this.m.b(new Runnable() { // from class: com.taobao.android.dinamicx.DinamicXEngine.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        DXRenderOptions dXRenderOptions2 = dXRenderOptions == null ? DXRenderOptions.DEFAULT_PRERENDER_OPTIONS : dXRenderOptions;
                        DXRuntimeContext a2 = DinamicXEngine.a(DinamicXEngine.this, context, dXTemplateItem, jSONObject, (DXButterRootView) null, dXRenderOptions);
                        if (a2 != null) {
                            fuw.f("开始butter preRenderTemplate ", a2.K());
                        }
                        DinamicXEngine.a(DinamicXEngine.this).a(a2, dXRenderOptions2);
                    } catch (Throwable th) {
                        com.taobao.android.dinamicx.exception.a.b(th);
                    }
                }
            });
        } else {
            this.m.b(new Runnable() { // from class: com.taobao.android.dinamicx.DinamicXEngine.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        DXRenderOptions dXRenderOptions2 = dXRenderOptions == null ? DXRenderOptions.DEFAULT_PRERENDER_OPTIONS : dXRenderOptions;
                        DXRuntimeContext a2 = DinamicXEngine.a(DinamicXEngine.this, context, null, dXTemplateItem, jSONObject, null, dXRenderOptions2);
                        if (a2 != null) {
                            fuw.f("开始preRenderTemplate ", a2.K());
                        }
                        DinamicXEngine.a(DinamicXEngine.this).b(a2, dXRenderOptions2, DinamicXEngine.this.d, DinamicXEngine.this.h, DinamicXEngine.this.f);
                    } catch (Throwable th) {
                        com.taobao.android.dinamicx.exception.a.b(th);
                    }
                }
            });
        }
    }

    public void a(DXRuntimeContext dXRuntimeContext, final DXRenderOptions dXRenderOptions, final View view, final fpv<DXRuntimeContext> fpvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4aeb1acf", new Object[]{this, dXRuntimeContext, dXRenderOptions, view, fpvVar});
        } else if (this.m == null) {
        } else {
            final DXWidgetNode a2 = gbc.a(dXRuntimeContext, dXRuntimeContext.e);
            a2.setParentWidget(dXRuntimeContext.e.getParentWidget());
            Runnable runnable = new Runnable() { // from class: com.taobao.android.dinamicx.DinamicXEngine.9
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        DinamicXEngine.a(DinamicXEngine.this).a(a2.getDXRuntimeContext(), (dXRenderOptions != null ? new DXRenderOptions.a().c(1).e(dXRenderOptions.i()).d(dXRenderOptions.h()).a(dXRenderOptions.a()).b(dXRenderOptions.b()).a(dXRenderOptions.c()).b(dXRenderOptions.f()).a(dXRenderOptions.e()) : new DXRenderOptions.a().c(1).e(4)).a(), (ab) null, view, fpvVar);
                    } catch (Throwable th) {
                        com.taobao.android.dinamicx.exception.a.b(th);
                    }
                }
            };
            if (dXRenderOptions != null && !dXRenderOptions.l()) {
                runnable.run();
            } else {
                this.m.c(runnable);
            }
        }
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        fpy.a().a(this.f11887a);
        if (!this.G.D()) {
            return;
        }
        fpy.a().b(this.f11887a);
    }

    public void a(Context context, JSONObject jSONObject, DXTemplateItem dXTemplateItem, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4e873ea", new Object[]{this, context, jSONObject, dXTemplateItem, new Integer(i)});
        } else {
            a(context, jSONObject, dXTemplateItem, i, (DXRenderOptions) null);
        }
    }

    public void a(final Context context, final JSONObject jSONObject, final DXTemplateItem dXTemplateItem, int i, final DXRenderOptions dXRenderOptions) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45960b36", new Object[]{this, context, jSONObject, dXTemplateItem, new Integer(i), dXRenderOptions});
        } else if (this.m == null || p() || dXTemplateItem == null) {
        } else {
            dXTemplateItem.a(this.G.D());
            if (dXTemplateItem.a(this.f11887a)) {
                return;
            }
            this.m.a(new Runnable() { // from class: com.taobao.android.dinamicx.DinamicXEngine.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        DXRenderOptions a2 = (dXRenderOptions != null ? new DXRenderOptions.a().c(1).e(dXRenderOptions.i()).d(dXRenderOptions.h()).a(dXRenderOptions.a()).b(dXRenderOptions.b()).a(dXRenderOptions.c()).b(dXRenderOptions.f()).a(dXRenderOptions.e()).a(dXRenderOptions.d()).e(dXRenderOptions.m()).f(dXRenderOptions.n()) : new DXRenderOptions.a().c(1).e(4)).a();
                        DXRuntimeContext a3 = DinamicXEngine.a(DinamicXEngine.this, context, null, dXTemplateItem, jSONObject, null, a2);
                        fuw.f("开始prefetchTemplate ", a3.K());
                        DinamicXEngine.a(DinamicXEngine.this).a(a3, a2, DinamicXEngine.this.d, DinamicXEngine.this.h, DinamicXEngine.this.f);
                    } catch (Throwable th) {
                        com.taobao.android.dinamicx.exception.a.b(th);
                    }
                }
            });
        }
    }

    public DXTemplateItem c(DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXTemplateItem) ipChange.ipc$dispatch("5354490c", new Object[]{this, dXTemplateItem});
        }
        aw awVar = this.d;
        if (awVar == null) {
            s sVar = new s(this.f11887a);
            s.a aVar = new s.a(DXMonitorConstant.DX_MONITOR_ENGINE, DXMonitorConstant.DX_MONITOR_SERVICE_ID_ENGINE_FETCH, 30005);
            aVar.e = "fetchPresetTemplate dxTemplateManager == null";
            sVar.c.add(aVar);
            com.taobao.android.dinamicx.monitor.b.a(sVar);
            return null;
        }
        return awVar.d(dXTemplateItem);
    }

    public DXResult<DXRootView> a(Context context, DXTemplateItem dXTemplateItem) {
        DXRootView b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXResult) ipChange.ipc$dispatch("1bd33d78", new Object[]{this, context, dXTemplateItem});
        }
        if (dXTemplateItem == null) {
            return b(context, (DXTemplateItem) null);
        }
        dXTemplateItem.a(this.G.D());
        if (dXTemplateItem.a(this.f11887a)) {
            if (bx.q() && (b = fpy.a().b(context, dXTemplateItem, this.f11887a)) != null) {
                if (dXTemplateItem != null) {
                    if (j()) {
                        fuw.d("命中dx3.0 butter预加载view:  " + dXTemplateItem);
                    }
                    fuw.f("命中dx3.0 butter预加载view:  " + dXTemplateItem.b());
                }
                DXResult<DXRootView> dXResult = new DXResult<>(b);
                dXResult.a(1);
                return dXResult;
            }
        } else {
            DXRootView a2 = fpy.a().a(context, dXTemplateItem, this.f11887a);
            if (a2 != null) {
                if (dXTemplateItem != null) {
                    if (j()) {
                        fuw.d("命中3.0预加载view:  " + dXTemplateItem.toString());
                    }
                    fuw.f("命中3.0预加载view:  " + dXTemplateItem.b());
                }
                new DXResult(a2).a(1);
                return new DXResult<>(a2);
            }
        }
        return b(context, dXTemplateItem);
    }

    public boolean a(long j, fut futVar) {
        com.taobao.android.dinamicx.model.b<fut> bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("926eae2b", new Object[]{this, new Long(j), futVar})).booleanValue();
        }
        if (j == 0 || futVar == null || (bVar = this.n) == null) {
            return false;
        }
        bVar.put(j, futVar);
        if (futVar instanceof fuf) {
            fuf fufVar = (fuf) futVar;
            if (!StringUtils.isEmpty(fufVar.getDxFunctionName())) {
                a(fufVar.getDxFunctionName(), fufVar);
            }
        }
        return true;
    }

    public boolean a(long j, bn bnVar) {
        com.taobao.android.dinamicx.model.b<bn> bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fa971a50", new Object[]{this, new Long(j), bnVar})).booleanValue();
        }
        if (j == 0 || (bVar = this.o) == null || bnVar == null) {
            return false;
        }
        bVar.put(j, bnVar);
        return true;
    }

    public boolean a(long j, com.taobao.android.dinamicx.widget.ak akVar) {
        com.taobao.android.dinamicx.model.b<com.taobao.android.dinamicx.widget.ak> bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("18a2b987", new Object[]{this, new Long(j), akVar})).booleanValue();
        }
        if (j == 0 || akVar == null || this.p == null) {
            return false;
        }
        if (b().D() && (bVar = this.R) != null) {
            bVar.put(j, this.Q.a(j, akVar));
        }
        this.p.put(j, akVar);
        return true;
    }

    public boolean b(long j, com.taobao.android.dinamicx.widget.ak akVar) {
        com.taobao.android.dinamicx.model.b<com.taobao.android.dinamicx.widget.ak> bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b3437c08", new Object[]{this, new Long(j), akVar})).booleanValue();
        }
        if (j == 0 || akVar == null || (bVar = this.p) == null) {
            return false;
        }
        bVar.put(j, akVar);
        return true;
    }

    public boolean c(long j, com.taobao.android.dinamicx.widget.ak akVar) {
        com.taobao.android.dinamicx.model.b<com.taobao.android.dinamicx.widget.ak> bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4de43e89", new Object[]{this, new Long(j), akVar})).booleanValue();
        }
        if (j == 0 || akVar == null || !b().D() || (bVar = this.R) == null) {
            return false;
        }
        bVar.put(j, this.Q.a(j, akVar));
        return true;
    }

    public void a(fve fveVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e950fd23", new Object[]{this, fveVar});
        } else if (fveVar == null) {
        } else {
            try {
                if (this.g == null) {
                    return;
                }
                this.g.a(fveVar);
            } catch (Throwable th) {
                s sVar = new s(b().f11775a);
                s.a aVar = new s.a(DXMonitorConstant.DX_MONITOR_ENGINE, DXMonitorConstant.DX_MONITOR_SERVICE_ID_ENGINE_REGISTER_NOTIFICATION, 30012);
                aVar.e = com.taobao.android.dinamicx.exception.a.a(th);
                sVar.c.add(aVar);
                com.taobao.android.dinamicx.monitor.b.a(sVar);
            }
        }
    }

    public void b(fve fveVar) {
        fva fvaVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7d403a4", new Object[]{this, fveVar});
        } else if (fveVar == null || (fvaVar = this.g) == null) {
        } else {
            if (fvaVar.d() == null) {
                this.g.a(new fve() { // from class: com.taobao.android.dinamicx.DinamicXEngine.7
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // tb.fve
                    public void onNotificationListener(fvb fvbVar) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("73876f63", new Object[]{this, fvbVar});
                        }
                    }
                });
            }
            this.g.c(fveVar);
        }
    }

    public void c(fve fveVar) {
        fva fvaVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6570a25", new Object[]{this, fveVar});
        } else if (fveVar == null || (fvaVar = this.g) == null) {
        } else {
            fvaVar.d(fveVar);
        }
    }

    public void d(fve fveVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4da10a6", new Object[]{this, fveVar});
        } else if (fveVar == null) {
        } else {
            try {
                if (this.g == null) {
                    return;
                }
                this.g.b(fveVar);
            } catch (Throwable th) {
                com.taobao.android.dinamicx.exception.a.a(th);
                s sVar = new s(b().f11775a);
                s.a aVar = new s.a(DXMonitorConstant.DX_MONITOR_ENGINE, DXMonitorConstant.DX_MONITOR_SERVICE_ID_ENGINE_REGISTER_NOTIFICATION, 30017);
                aVar.e = com.taobao.android.dinamicx.exception.a.a(th);
                sVar.c.add(aVar);
                com.taobao.android.dinamicx.monitor.b.a(sVar);
            }
        }
    }

    public void a(String str, com.taobao.android.dinamicx.expression.expr_v2.j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c85ca44", new Object[]{this, str, jVar});
        } else if (StringUtils.isEmpty(str) || jVar == null) {
        } else {
            this.z.put(str, jVar);
        }
    }

    public void a(ghe gheVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea408cb4", new Object[]{this, gheVar});
            return;
        }
        ggz ggzVar = this.I;
        if (ggzVar == null) {
            return;
        }
        ggzVar.a(gheVar);
    }

    public boolean a(long j, dln dlnVar) {
        com.taobao.android.dinamicx.eventchain.i iVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8e836f2a", new Object[]{this, new Long(j), dlnVar})).booleanValue();
        }
        if (j == 0 || dlnVar == null || (iVar = this.j) == null) {
            return false;
        }
        iVar.d().a(String.valueOf(j), dlnVar);
        return true;
    }

    public boolean a(String str, dln dlnVar) {
        com.taobao.android.dinamicx.eventchain.i iVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2548ee00", new Object[]{this, str, dlnVar})).booleanValue();
        }
        if (StringUtils.isEmpty(str) || dlnVar == null || (iVar = this.j) == null) {
            return false;
        }
        iVar.d().a(str, dlnVar);
        return true;
    }

    public boolean a(String str, String str2, dln dlnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("25d1454a", new Object[]{this, str, str2, dlnVar})).booleanValue();
        }
        if (StringUtils.isEmpty(str2) || StringUtils.isEmpty(str) || dlnVar == null) {
            return false;
        }
        if (this.P == null) {
            this.P = new HashMap();
        }
        Map<String, dln> map = this.P.get(str);
        if (map == null) {
            map = new HashMap<>();
            this.P.put(str, map);
        }
        map.put(str2, dlnVar);
        return true;
    }

    public dln a(String str, String str2) {
        Map<String, Map<String, dln>> map;
        Map<String, dln> map2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dln) ipChange.ipc$dispatch("9538fd64", new Object[]{this, str, str2});
        }
        if (!StringUtils.isEmpty(str2) && !StringUtils.isEmpty(str) && (map = this.P) != null && (map2 = map.get(str)) != null) {
            return map2.get(str2);
        }
        return null;
    }

    public void a(List<DXTemplateItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
            return;
        }
        try {
            this.d.a(list, a());
        } catch (Throwable th) {
            if (j()) {
                th.printStackTrace();
            }
            s sVar = new s(this.f11887a);
            s.a aVar = new s.a(DXMonitorConstant.DX_MONITOR_ENGINE, DXMonitorConstant.DX_MONITOR_SERVICE_ID_ENGINE_DOWNLOAD, 30005);
            aVar.e = "downLoadTemplates error " + com.taobao.android.dinamicx.exception.a.a(th);
            sVar.c.add(aVar);
            com.taobao.android.dinamicx.monitor.b.a(sVar);
            fux.b(aVar.e);
        }
    }

    public DXTemplateItem a(DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXTemplateItem) ipChange.ipc$dispatch("762f314e", new Object[]{this, dXTemplateItem});
        }
        if (dXTemplateItem == null) {
            return null;
        }
        try {
            b(dXTemplateItem);
            if (this.d == null) {
                s sVar = new s(this.f11887a);
                s.a aVar = new s.a(DXMonitorConstant.DX_MONITOR_ENGINE, DXMonitorConstant.DX_MONITOR_SERVICE_ID_ENGINE_FETCH, s.DXError_EngineFetchTemplate_ERROR);
                sVar.b = dXTemplateItem;
                aVar.e = "fetch Template  dxTemplateManager == null";
                sVar.c.add(aVar);
                com.taobao.android.dinamicx.monitor.b.a(sVar);
                return null;
            }
            long nanoTime = System.nanoTime();
            DXTemplateItem b = this.d.b(dXTemplateItem);
            HashMap hashMap = new HashMap();
            hashMap.put("exactVersion", "-1");
            if (b != null) {
                b.l = dXTemplateItem.l;
                hashMap.put("exactVersion", String.valueOf(b.b));
            }
            a(dXTemplateItem, DXMonitorConstant.DX_MONITOR_SERVICE_ID_ENGINE_FETCH, System.nanoTime() - nanoTime, hashMap);
            if (!fqi.aK() || b == null || b.e || b.g == null || StringUtils.isEmpty(b.g.f11934a) || new File(b.g.f11934a).exists() || !fwn.a().b(b.g.f11934a)) {
            }
            return b;
        } catch (Throwable th) {
            if (j()) {
                th.printStackTrace();
            }
            s sVar2 = new s(this.f11887a);
            s.a aVar2 = new s.a(DXMonitorConstant.DX_MONITOR_ENGINE, DXMonitorConstant.DX_MONITOR_SERVICE_ID_ENGINE_FETCH, s.DXError_EngineFetchException);
            sVar2.b = dXTemplateItem;
            aVar2.e = com.taobao.android.dinamicx.exception.a.a(th);
            sVar2.c.add(aVar2);
            com.taobao.android.dinamicx.monitor.b.a(sVar2);
            return null;
        }
    }

    public DXResult<DXRootView> b(Context context, DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXResult) ipChange.ipc$dispatch("ff922d79", new Object[]{this, context, dXTemplateItem});
        }
        if (dXTemplateItem == null) {
            DXRootView dXRootView = new DXRootView(context);
            dXRootView.setLayoutParams(new ViewGroup.LayoutParams(0, 0));
            dXRootView.dxTemplateItem = null;
            dXRootView.setBindingXManagerWeakReference(this.i);
            return new DXResult<>(dXRootView);
        }
        dXTemplateItem.a(this.G.D());
        if (dXTemplateItem.a(this.f11887a)) {
            return this.Q.a(context, dXTemplateItem);
        }
        DXRootView dXRootView2 = new DXRootView(context);
        dXRootView2.setLayoutParams(new ViewGroup.LayoutParams(0, 0));
        dXRootView2.dxTemplateItem = dXTemplateItem;
        dXRootView2.setBindingXManagerWeakReference(this.i);
        return new DXResult<>(dXRootView2);
    }

    private DXRuntimeContext a(Context context, DXTemplateItem dXTemplateItem, JSONObject jSONObject, DXButterRootView dXButterRootView, DXRenderOptions dXRenderOptions) {
        DXRuntimeContext dXRuntimeContext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRuntimeContext) ipChange.ipc$dispatch("652abbcf", new Object[]{this, context, dXTemplateItem, jSONObject, dXButterRootView, dXRenderOptions});
        }
        if (dXButterRootView == null || dXButterRootView.getExpandWidgetNode() == null) {
            dXRuntimeContext = new DXRuntimeContext(this.b);
            dXRuntimeContext.f11781a = new by(this.b);
            dXRuntimeContext.c = new DXRuntimeContext.a();
        } else {
            dXRuntimeContext = dXButterRootView.getExpandWidgetNode().getDXRuntimeContext();
        }
        dXRuntimeContext.f11781a.h = new WeakReference<>(context);
        dXRuntimeContext.f11781a.f = this.n;
        dXRuntimeContext.f11781a.g = new WeakReference<>(this.o);
        dXRuntimeContext.f11781a.e = this.R;
        dXRuntimeContext.f11781a.i = new WeakReference<>(this.f);
        dXRuntimeContext.f11781a.k = new WeakReference<>(this.g);
        dXRuntimeContext.f11781a.r = new WeakReference<>(this.Q);
        dXRuntimeContext.f11781a.q = new WeakReference<>(dXButterRootView);
        if (dXRenderOptions != null) {
            dXRuntimeContext.f11781a.m = dXRenderOptions.d();
            dXRuntimeContext.f11781a.n = dXRenderOptions.c();
            dXRuntimeContext.f11781a.c = dXRenderOptions.g();
            dXRuntimeContext.f11781a.f11832a = dXRenderOptions.a();
            dXRuntimeContext.f11781a.b = dXRenderOptions.b();
        }
        dXRuntimeContext.c.f11782a = dXTemplateItem;
        dXRuntimeContext.c.c = new s(this.f11887a);
        dXRuntimeContext.c.b = jSONObject;
        return dXRuntimeContext;
    }

    public static Context i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("c0133768", new Object[0]) : s;
    }

    public static boolean j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[0])).booleanValue() : r;
    }

    private DXRuntimeContext a(Context context, DXRootView dXRootView, DXTemplateItem dXTemplateItem, JSONObject jSONObject, am amVar, DXRenderOptions dXRenderOptions) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRuntimeContext) ipChange.ipc$dispatch("f92e049d", new Object[]{this, context, dXRootView, dXTemplateItem, jSONObject, amVar, dXRenderOptions});
        }
        DXRuntimeContext dXRuntimeContext = new DXRuntimeContext(this.b);
        dXRuntimeContext.f11781a = new by(this.b);
        dXRuntimeContext.f11781a.h = new WeakReference<>(context);
        dXRuntimeContext.f11781a.f = this.n;
        dXRuntimeContext.f11781a.g = new WeakReference<>(this.o);
        dXRuntimeContext.f11781a.e = this.p;
        dXRuntimeContext.f11781a.i = new WeakReference<>(this.f);
        dXRuntimeContext.f11781a.j = new WeakReference<>(amVar);
        dXRuntimeContext.f11781a.k = new WeakReference<>(this.g);
        dXRuntimeContext.d = dXTemplateItem;
        dXRuntimeContext.f11781a.q = new WeakReference<>(dXRootView);
        dXRuntimeContext.a(jSONObject);
        dXRuntimeContext.t = new s(this.f11887a);
        dXRuntimeContext.t.b = dXTemplateItem;
        dXRuntimeContext.y = 0;
        if (dXRenderOptions != null) {
            dXRuntimeContext.f11781a.m = dXRenderOptions.d();
            dXRuntimeContext.f11781a.n = dXRenderOptions.c();
            dXRuntimeContext.f11781a.c = dXRenderOptions.g();
            dXRuntimeContext.f11781a.f11832a = dXRenderOptions.a();
            dXRuntimeContext.f11781a.b = dXRenderOptions.b();
        }
        return dXRuntimeContext;
    }

    private void a(DXTemplateItem dXTemplateItem, String str, long j, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15803bdc", new Object[]{this, dXTemplateItem, str, new Long(j), map});
        } else {
            com.taobao.android.dinamicx.monitor.b.a(0, this.f11887a, DXMonitorConstant.DX_MONITOR_ENGINE, str, dXTemplateItem, map, j, true);
        }
    }

    private void b(DXTemplateItem dXTemplateItem, String str, long j, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e8b875d", new Object[]{this, dXTemplateItem, str, new Long(j), map});
        } else {
            com.taobao.android.dinamicx.monitor.b.c(0, this.f11887a, DXMonitorConstant.DX_MONITOR_ENGINE, str, dXTemplateItem, map, j, true);
        }
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        ab abVar = this.h;
        if (abVar != null) {
            abVar.e();
        }
        fpw fpwVar = this.m;
        if (fpwVar != null) {
            fpwVar.g();
        }
        com.taobao.android.dinamicx.eventchain.i g = g();
        if (g == null) {
            return;
        }
        g.e();
    }

    public dkt l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dkt) ipChange.ipc$dispatch("63a5d506", new Object[]{this});
        }
        com.taobao.android.dinamicx.eventchain.i g = g();
        if (g == null) {
            return null;
        }
        return g.d();
    }

    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
            return;
        }
        fpw fpwVar = this.m;
        if (fpwVar != null) {
            fpwVar.h();
        }
        com.taobao.android.dinamicx.monitor.d.a(a());
    }

    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
            return;
        }
        fpw fpwVar = this.m;
        if (fpwVar != null) {
            fpwVar.i();
        }
        com.taobao.android.dinamicx.monitor.d.b(a());
    }

    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631b576", new Object[]{this});
            return;
        }
        fpw fpwVar = this.m;
        if (fpwVar != null) {
            fpwVar.f();
        }
        fqb fqbVar = this.i;
        if (fqbVar != null && fqbVar.d() != null) {
            this.i.d().a();
        }
        fxh fxhVar = this.l;
        if (fxhVar != null) {
            fxhVar.d();
        }
        com.taobao.android.dinamicx.videoc.b bVar = this.E;
        if (bVar != null) {
            bVar.a();
        }
        s();
        fvl fvlVar = this.C;
        if (fvlVar != null) {
            try {
                fvlVar.a();
            } catch (Throwable th) {
                com.taobao.android.dinamicx.exception.a.b(th);
            }
        }
        ghb ghbVar = this.y;
        if (ghbVar != null) {
            ghbVar.a();
        }
        ThreadLocal<aw> threadLocal = this.e;
        if (threadLocal != null) {
            threadLocal.remove();
        }
        ab abVar = this.h;
        if (abVar != null) {
            abVar.e();
        }
        y yVar = t;
        if (yVar != null) {
            yVar.b(this);
        }
        com.taobao.android.dinamicx.monitor.d.c(a());
    }

    public static void a(y.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb2b5b36", new Object[]{aVar});
            return;
        }
        y yVar = t;
        if (yVar == null || aVar == null) {
            return;
        }
        yVar.a(aVar);
    }

    public static void a(bf.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56e67c83", new Object[]{aVar});
            return;
        }
        i iVar = u;
        if (iVar == null || aVar == null) {
            return;
        }
        iVar.a(aVar);
    }

    @Override // com.taobao.android.dinamicx.y.a
    public void M_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88b56539", new Object[]{this});
            return;
        }
        fwl.b().a(a());
        fwl.b().c();
        ab abVar = this.h;
        if (abVar != null) {
            abVar.e();
        }
        fpw fpwVar = this.m;
        if (fpwVar != null) {
            fpwVar.g();
        }
        h();
    }

    @Override // com.taobao.android.dinamicx.y.a
    public String N_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3e0821c8", new Object[]{this});
        }
        if (!j() || this.h == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(c().n() ? c().p() : a());
        sb.append(" DinamicXEngine pipelineCacheSize: ");
        sb.append(this.h.d());
        return sb.toString();
    }

    public void a(DXRootView dXRootView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acc619e9", new Object[]{this, dXRootView});
        } else if (dXRootView == null) {
        } else {
            dXRootView.onRootViewDisappear(-1);
        }
    }

    public void b(DXRootView dXRootView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4766dc6a", new Object[]{this, dXRootView});
        } else if (dXRootView == null) {
        } else {
            dXRootView.onRootViewAppear(-1);
        }
    }

    public void a(DXRootView dXRootView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebfd963a", new Object[]{this, dXRootView, new Integer(i)});
        } else if (dXRootView == null) {
        } else {
            dXRootView.onRootViewDisappear(i);
        }
    }

    public void b(DXRootView dXRootView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a57523d9", new Object[]{this, dXRootView, new Integer(i)});
        } else if (dXRootView == null) {
        } else {
            dXRootView.onRootViewAppear(i);
        }
    }

    public void a(DXRootView dXRootView, Object obj) {
        DXWidgetNode expandWidgetNode;
        JSONObject jSONObject;
        DXWidgetNode expandWidgetNode2;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5028c185", new Object[]{this, dXRootView, obj});
            return;
        }
        try {
            if (!(obj instanceof JSONObject)) {
                return;
            }
            JSONObject jSONObject3 = (JSONObject) obj;
            String string = jSONObject3.getString("type");
            if ("BNDX".equalsIgnoreCase(string) && this.i != null) {
                this.i.a(dXRootView, jSONObject3);
            } else if (!"General".equalsIgnoreCase(string)) {
                if (dXRootView == null || (expandWidgetNode = dXRootView.getExpandWidgetNode()) == null || (jSONObject = jSONObject3.getJSONObject("params")) == null) {
                    return;
                }
                String string2 = jSONObject.getString("targetId");
                DXMsgCenterEvent dXMsgCenterEvent = new DXMsgCenterEvent(-1747756056147111305L);
                dXMsgCenterEvent.setParams(jSONObject);
                dXMsgCenterEvent.setTargetId(string2);
                dXMsgCenterEvent.setType(string);
                DXWidgetNode queryWidgetNodeByUserId = expandWidgetNode.queryWidgetNodeByUserId(string2);
                if (queryWidgetNodeByUserId == null) {
                    expandWidgetNode.sendBroadcastEvent(dXMsgCenterEvent);
                } else {
                    queryWidgetNodeByUserId.postEvent(dXMsgCenterEvent);
                }
            } else if (dXRootView == null || (expandWidgetNode2 = dXRootView.getExpandWidgetNode()) == null || (jSONObject2 = jSONObject3.getJSONObject("params")) == null) {
            } else {
                String string3 = jSONObject2.getString("targetId");
                if (StringUtils.isEmpty(string3) && jSONObject2.containsKey("target")) {
                    string3 = jSONObject2.getString("target");
                }
                String string4 = jSONObject2.getString("method");
                DXMsgCenterEvent dXMsgCenterEvent2 = new DXMsgCenterEvent(-1747756056147111305L);
                dXMsgCenterEvent2.setParams(jSONObject2);
                dXMsgCenterEvent2.setTargetId(string3);
                dXMsgCenterEvent2.setType(string);
                dXMsgCenterEvent2.setMethod(string4);
                DXWidgetNode queryWidgetNodeByUserId2 = expandWidgetNode2.queryWidgetNodeByUserId(string3);
                if (queryWidgetNodeByUserId2 != null && queryWidgetNodeByUserId2.getReferenceNode() != null) {
                    queryWidgetNodeByUserId2.postEvent(dXMsgCenterEvent2);
                } else {
                    expandWidgetNode2.sendBroadcastEvent(dXMsgCenterEvent2);
                }
            }
        } catch (Throwable th) {
            com.taobao.android.dinamicx.exception.a.b(th);
            String a2 = a();
            if (StringUtils.isEmpty(a2)) {
                a2 = "dinamicx";
            }
            com.taobao.android.dinamicx.monitor.b.a(a2, null, DXMonitorConstant.DX_MONITOR_ENGINE, DXMonitorConstant.DX_MONITOR_SERVICE_ID_ENGINE_POST_MSG, 30014, com.taobao.android.dinamicx.exception.a.a(th));
        }
    }

    public void a(DXRootView dXRootView, DXRootView.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b866780d", new Object[]{this, dXRootView, aVar});
        } else if (dXRootView == null) {
        } else {
            dXRootView.registerDXRootViewLifeCycle(aVar);
        }
    }

    public fpw q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (fpw) ipChange.ipc$dispatch("8a1f0bc1", new Object[]{this}) : this.m;
    }

    private com.taobao.android.dinamicx.model.b<com.taobao.android.dinamicx.widget.ak> K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.dinamicx.model.b) ipChange.ipc$dispatch("c97568da", new Object[]{this});
        }
        if (fqi.m(this.f11887a)) {
            return new com.taobao.android.dinamicx.model.c(u.c);
        }
        if (fqi.l(this.f11887a)) {
            return new com.taobao.android.dinamicx.model.e(u.c);
        }
        return new com.taobao.android.dinamicx.model.b<>(u.c);
    }

    private aw L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (aw) ipChange.ipc$dispatch("e1076a29", new Object[]{this});
        }
        aw M = M();
        if (fqi.I()) {
            this.e = new ThreadLocal<>();
            this.e.set(M);
        }
        return M;
    }

    private aw M() {
        fwn fwnVar;
        aw awVar = new aw(this.b, s);
        if (j()) {
            try {
                Class<?> cls = Class.forName("com.taobao.android.dinamicx.DXDevTemplateManager");
                aw awVar2 = null;
                if (cls != null) {
                    Method method = cls.getMethod("getDXDevFileManager", new Class[0]);
                    if (method != null) {
                        method.setAccessible(true);
                        fwnVar = (fwn) method.invoke(null, new Object[0]);
                    } else {
                        fwnVar = null;
                    }
                    Method method2 = cls.getMethod("newDXDevTemplateManager", r.class, Context.class);
                    if (method2 != null) {
                        method2.setAccessible(true);
                        awVar2 = (aw) method2.invoke(null, this.b, s);
                    }
                } else {
                    fwnVar = null;
                }
                if (awVar2 == null || fwnVar == null) {
                    return awVar;
                }
                fwn.a(fwnVar);
                return awVar2;
            } catch (Exception unused) {
                return awVar;
            }
        }
        return awVar;
    }

    public void a(ak akVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("155b4aba", new Object[]{this, akVar});
        } else if (akVar == null) {
        } else {
            this.w = akVar;
        }
    }

    public ak r() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ak) ipChange.ipc$dispatch("2269c6cf", new Object[]{this}) : this.w;
    }

    public static void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{new Boolean(z)});
        } else {
            a((Activity) null, z);
        }
    }

    public static void a(Activity activity, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cabb445a", new Object[]{activity, new Boolean(z)});
            return;
        }
        try {
            fuw.a("DinamicX", "DinamicX processWindowChanged forceChange" + z);
            gbg.a(z, activity);
        } catch (Exception e) {
            com.taobao.android.dinamicx.exception.a.b(e);
        }
    }

    public static void a(String str, DXTemplateItem dXTemplateItem, List<s.a> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("100974c", new Object[]{str, dXTemplateItem, list});
            return;
        }
        s sVar = new s(str);
        sVar.b = dXTemplateItem;
        sVar.c.addAll(list);
        com.taobao.android.dinamicx.monitor.b.a(sVar);
    }

    public void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66a137a", new Object[]{this});
            return;
        }
        com.taobao.android.dinamicx.eventchain.i iVar = this.j;
        if (iVar == null) {
            return;
        }
        iVar.f();
    }

    public Map<String, ai> t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("e3b9e9f0", new Object[]{this});
        }
        if (this.D == null) {
            this.D = new ConcurrentHashMap();
        }
        return this.D;
    }

    public com.taobao.android.dinamicx.videoc.b u() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.dinamicx.videoc.b) ipChange.ipc$dispatch("6334729b", new Object[]{this}) : this.E;
    }

    private void b(DXTemplateItem dXTemplateItem) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15c5a1d2", new Object[]{this, dXTemplateItem});
            return;
        }
        dXTemplateItem.d = new ArrayList();
        if (StringUtils.isEmpty(dXTemplateItem.c)) {
            return;
        }
        char[] charArray = dXTemplateItem.c.toCharArray();
        int length = charArray.length - 1;
        while (true) {
            if (length < 0) {
                i = 0;
                break;
            } else if (charArray[length] == '?') {
                i = length + 1;
                break;
            } else {
                length--;
            }
        }
        if (i <= 0) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        while (i < charArray.length) {
            if (charArray[i] == '=') {
                if (sb.toString().equalsIgnoreCase(URL_SKIP_VERSION_KEY)) {
                    StringBuilder sb2 = new StringBuilder();
                    int i2 = i + 1;
                    while (true) {
                        if (i2 < charArray.length) {
                            if (charArray[i2] != '&') {
                                sb2.append(charArray[i2]);
                                i2++;
                            } else {
                                sb.setLength(0);
                                i = i2;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    dXTemplateItem.d.add(sb2.toString());
                } else {
                    sb.setLength(0);
                }
            } else {
                sb.append(charArray[i]);
            }
            i++;
        }
    }

    public com.taobao.android.dinamicx.eventchain.j a(String str, DXRootView dXRootView, JSONObject jSONObject, String str2, com.taobao.android.dinamicx.eventchain.g gVar) {
        DXWidgetNode expandWidgetNode;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.dinamicx.eventchain.j) ipChange.ipc$dispatch("daa32e0c", new Object[]{this, str, dXRootView, jSONObject, str2, gVar});
        }
        final com.taobao.android.dinamicx.eventchain.j[] jVarArr = {null};
        if (this.j == null) {
            jVarArr[0] = com.taobao.android.dinamicx.eventchain.j.a(-999, "eventChainManager ==  null");
            return jVarArr[0];
        } else if (StringUtils.isEmpty(str)) {
            jVarArr[0] = com.taobao.android.dinamicx.eventchain.j.a(-998, "eventChainName 是空");
            return jVarArr[0];
        } else {
            if (gVar != null && gVar.a() != null) {
                expandWidgetNode = gVar.a();
            } else if (dXRootView == null) {
                jVarArr[0] = com.taobao.android.dinamicx.eventchain.j.a(-997, "rootView 是空");
                return jVarArr[0];
            } else {
                expandWidgetNode = dXRootView.getExpandWidgetNode();
            }
            if (expandWidgetNode == null) {
                jVarArr[0] = com.taobao.android.dinamicx.eventchain.j.a(-996, "rootExpandNode 是空");
                return jVarArr[0];
            }
            if (!StringUtils.isEmpty(str2)) {
                expandWidgetNode = expandWidgetNode.queryWidgetNodeByUserId(str2);
            }
            new com.taobao.android.dinamicx.eventchain.f(new f.a() { // from class: com.taobao.android.dinamicx.DinamicXEngine.8
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.dinamicx.eventchain.f.a
                public void a(com.taobao.android.dinamicx.eventchain.j jVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ee043022", new Object[]{this, jVar});
                    } else {
                        jVarArr[0] = jVar;
                    }
                }
            }).a((DXEvent) null, jSONObject != null ? new Object[]{str, jSONObject} : new Object[]{str}, expandWidgetNode.getDXRuntimeContext(), (DXWidgetNode) null);
            return jVarArr[0];
        }
    }

    public bb v() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bb) ipChange.ipc$dispatch("f366aaf5", new Object[]{this}) : this.F;
    }

    public com.taobao.android.dinamicx.eventchain.j a(String str, DXWidgetNode dXWidgetNode, DXWidgetNode dXWidgetNode2, JSONObject jSONObject, String str2, com.taobao.android.dinamicx.eventchain.g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.dinamicx.eventchain.j) ipChange.ipc$dispatch("dfcdc2ab", new Object[]{this, str, dXWidgetNode, dXWidgetNode2, jSONObject, str2, gVar});
        }
        final com.taobao.android.dinamicx.eventchain.j[] jVarArr = {null};
        if (this.j == null) {
            jVarArr[0] = com.taobao.android.dinamicx.eventchain.j.a(-999, "eventChainManager ==  null");
            return jVarArr[0];
        } else if (StringUtils.isEmpty(str)) {
            jVarArr[0] = com.taobao.android.dinamicx.eventchain.j.a(-998, "eventChainName 是空");
            return jVarArr[0];
        } else {
            if (dXWidgetNode2 == null) {
                dXWidgetNode2 = dXWidgetNode;
            }
            new com.taobao.android.dinamicx.eventchain.f(new f.a() { // from class: com.taobao.android.dinamicx.DinamicXEngine.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.dinamicx.eventchain.f.a
                public void a(com.taobao.android.dinamicx.eventchain.j jVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ee043022", new Object[]{this, jVar});
                    } else {
                        jVarArr[0] = jVar;
                    }
                }
            }).a((DXEvent) null, jSONObject != null ? new Object[]{str, jSONObject} : new Object[]{str}, dXWidgetNode.getDXRuntimeContext(), dXWidgetNode2);
            return jVarArr[0];
        }
    }

    public void a(bj bjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1568eddc", new Object[]{this, bjVar});
        } else {
            this.J = bjVar;
        }
    }

    private static void b(s sVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32e689f8", new Object[]{sVar});
            return;
        }
        Log.e(ENGINE_INIT_ERROR_LOG_KEY, sVar.toString());
        fux.b(ENGINE_INIT_ERROR_LOG_KEY + sVar.toString());
    }

    public aw w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (aw) ipChange.ipc$dispatch("67a5e21e", new Object[]{this});
        }
        if (!fqi.I()) {
            return this.d;
        }
        aw awVar = this.e.get();
        if (awVar != null) {
            return awVar;
        }
        aw M = M();
        M.a(b().d);
        this.e.set(M);
        return M;
    }

    public ggz x() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ggz) ipChange.ipc$dispatch("bffae44d", new Object[]{this}) : this.I;
    }

    public bj y() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bj) ipChange.ipc$dispatch("5024550a", new Object[]{this}) : this.J;
    }

    public ggx z() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ggx) ipChange.ipc$dispatch("cf5e2ecd", new Object[]{this}) : this.K;
    }

    public gfc A() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (gfc) ipChange.ipc$dispatch("18d0565a", new Object[]{this}) : this.k;
    }

    public fqh B() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (fqh) ipChange.ipc$dispatch("2081b140", new Object[]{this}) : this.H;
    }

    public Activity N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("fe4193f3", new Object[]{this});
        }
        WeakReference<Activity> weakReference = this.M;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public void a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68a25ba", new Object[]{this, activity});
        } else {
            this.M = new WeakReference<>(activity);
        }
    }

    private Application O() {
        try {
            Class<?> cls = Class.forName(ProcessUtils.ACTIVITY_THREAD);
            Method declaredMethod = cls.getDeclaredMethod(ProcessUtils.CURRENT_ACTIVITY_THREAD, new Class[0]);
            Field declaredField = cls.getDeclaredField("mInitialApplication");
            declaredField.setAccessible(true);
            return (Application) declaredField.get(declaredMethod.invoke(null, new Object[0]));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public void c(List<DXTemplateItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e037145b", new Object[]{this, list});
        } else if (list != null) {
            for (DXTemplateItem dXTemplateItem : list) {
                DXTemplateItem c = c(dXTemplateItem);
                if (c != null) {
                    fuw.f("开始preload ", c.b());
                    this.c.d().a(a(i(), (DXRootView) null, dXTemplateItem, (JSONObject) null, this.c, (DXRenderOptions) null));
                }
            }
        }
    }

    private boolean p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("63fccfb", new Object[]{this})).booleanValue() : Build.VERSION.SDK_INT == 28 && fqi.aX();
    }

    public alu P() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (alu) ipChange.ipc$dispatch("8c366565", new Object[]{this}) : this.N;
    }

    public Map<String, com.alibaba.ability.b> Q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("c56e8c8d", new Object[]{this}) : this.O;
    }

    public void a(bi biVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1568797d", new Object[]{this, biVar});
        } else {
            this.S = biVar;
        }
    }

    public bi S() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bi) ipChange.ipc$dispatch("ec1f6d1", new Object[]{this}) : this.S;
    }
}
