package com.taobao.search.common;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.q;
import mtopsdk.common.util.StringUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.OnScreenChangedListener;
import com.taobao.android.autosize.h;
import com.taobao.android.searchbaseframe.chitu.TBSearchChiTuJSBridge;
import com.taobao.android.searchbaseframe.uikit.screentype.ScreenType;
import com.taobao.android.task.Coordinator;
import com.taobao.orange.OrangeConfig;
import com.taobao.search.common.jsbridge.SearchAddBagBridge;
import com.taobao.search.common.jsbridge.SearchCustomerDataBridge;
import com.taobao.search.common.jsbridge.SearchReviewBridge;
import com.taobao.search.common.jsbridge.SearchScreenShotBridge;
import com.taobao.search.common.jsbridge.SuggestPageBridge;
import com.taobao.search.common.util.r;
import com.taobao.search.common.util.t;
import com.taobao.search.common.voicesearch.jsbridge.SpeechPermissionPlugin;
import com.taobao.search.jarvis.rcmd.SearchXslSdk;
import com.taobao.search.mmd.onesearch.OnesearchBridge;
import com.taobao.search.sf.j;
import com.taobao.search.sf.weex.module.XSearchEventBridge;
import com.taobao.tao.Globals;
import com.taobao.tao.TaoApplication;
import com.taobao.tao.TaobaoApplication;
import com.taobao.tao.util.Constants;
import com.ut.device.UTDevice;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.o;
import kotlin.text.n;
import tb.imk;
import tb.imn;
import tb.imp;
import tb.its;
import tb.jyt;
import tb.kge;
import tb.nsv;
import tb.nsw;
import tb.ntx;
import tb.ntz;
import tb.nuj;
import tb.nyb;
import tb.tdf;

/* loaded from: classes7.dex */
public final class SearchSdk {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion;
    private static final String TAG = "SearchSdk";
    public static volatile boolean sInited;
    private static boolean sIsBeta;
    public static volatile boolean sPartInit;
    public static volatile boolean sRainbowInited;
    public static volatile AtomicBoolean sSearchDoorInited;

    @JvmStatic
    public static final synchronized void init() {
        synchronized (SearchSdk.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fede197", new Object[0]);
            } else {
                Companion.b();
            }
        }
    }

    @JvmStatic
    public static final boolean isBeta() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3f1ec9c5", new Object[0])).booleanValue() : Companion.a();
    }

    @JvmStatic
    public static final synchronized void partInit() {
        synchronized (SearchSdk.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d3df06aa", new Object[0]);
            } else {
                Companion.n();
            }
        }
    }

    /* loaded from: classes7.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* loaded from: classes7.dex */
        public static final class b implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ imn f19023a;

            public b(imn imnVar) {
                this.f19023a = imnVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    com.taobao.search.sf.remote.c.INSTANCE.a(this.f19023a);
                } catch (Throwable unused) {
                }
            }
        }

        static {
            kge.a(-904564502);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }

        public static final /* synthetic */ void a(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("df6f0318", new Object[]{aVar});
            } else {
                aVar.k();
            }
        }

        @JvmStatic
        public final boolean a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : SearchSdk.access$getSIsBeta$cp();
        }

        private final void l() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6076ef3", new Object[]{this});
                return;
            }
            imn imnVar = j.f19452a;
            if (imnVar == null) {
                return;
            }
            Coordinator.execute(new b(imnVar));
        }

        @JvmStatic
        public final synchronized void n() {
            Display defaultDisplay;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6239df5", new Object[]{this});
            } else if (SearchSdk.sPartInit) {
            } else {
                SearchSdk.sPartInit = true;
                i();
                int i = Constants.screen_height;
                if (!ScreenType.IS_PAD && !ScreenType.IS_FOLDABLE) {
                    Object systemService = Globals.getApplication().getSystemService(com.taobao.android.weex_framework.util.a.ATOM_EXT_window);
                    if (!(systemService instanceof WindowManager)) {
                        systemService = null;
                    }
                    WindowManager windowManager = (WindowManager) systemService;
                    if (windowManager != null && (defaultDisplay = windowManager.getDefaultDisplay()) != null) {
                        i = defaultDisplay.getHeight();
                    }
                    nsv.b(new nsw(), Globals.getApplication(), ntx.b(), ntx.a(), i);
                    o();
                }
                i = h.a().e((Context) Globals.getApplication());
                nsv.b(new nsw(), Globals.getApplication(), ntx.b(), ntx.a(), i);
                o();
            }
        }

        private final void o() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("631b576", new Object[]{this});
            } else if (SearchSdk.sSearchDoorInited.get()) {
            } else {
                SearchSdk.sSearchDoorInited.set(true);
                nsv.b();
            }
        }

        @JvmStatic
        public final synchronized void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            } else if (SearchSdk.sInited) {
                m();
                l();
                nsv.c();
            } else {
                SearchSdk.sPartInit = true;
                SearchSdk.sInited = true;
                long currentTimeMillis = System.currentTimeMillis();
                f();
                j();
                i();
                nyb.a().b();
                SearchXslSdk.install();
                g();
                if (com.taobao.search.common.util.c.a()) {
                    imp.a().a(Globals.getApplication());
                    c();
                    q.a(j.f19452a.n().e, (Class<? extends e>) TBSearchChiTuJSBridge.class, true);
                }
                e();
                d();
                jyt.INSTANCE.a(new com.taobao.search.musie.a());
                Log.e("search framework", "good to see launch cost " + (System.currentTimeMillis() - currentTimeMillis));
                m();
                l();
            }
        }

        private final void m() {
            IpChange ipChange = $ipChange;
            boolean z = false;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6158674", new Object[]{this});
                return;
            }
            if (r.e("mtopStreamParse") && r.bw()) {
                z = true;
            }
            its.d = z;
        }

        private final void c() {
            try {
                Class.forName("com.taobao.android.xsearchplugin.debugger.AceDebugAbility").getDeclaredMethod("install", new Class[0]).invoke(null, new Object[0]);
            } catch (Throwable unused) {
            }
            imp.a().a("srp.cells.move", new tdf());
        }

        private final void j() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            } else if (!ScreenType.IS_FOLDABLE && !ScreenType.IS_PAD) {
            } else {
                h.a().c(C0756a.INSTANCE);
                k();
            }
        }

        /* renamed from: com.taobao.search.common.SearchSdk$a$a  reason: collision with other inner class name */
        /* loaded from: classes7.dex */
        public static final class C0756a implements OnScreenChangedListener {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public static final C0756a INSTANCE = new C0756a();

            @Override // com.taobao.android.autosize.OnScreenChangedListener
            public /* synthetic */ void onActivityChanged(Activity activity, int i, Configuration configuration) {
                OnScreenChangedListener.CC.$default$onActivityChanged(this, activity, i, configuration);
            }

            @Override // com.taobao.android.autosize.OnScreenChangedListener
            public final void onScreenChanged(int i, Configuration configuration) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("cfdcd1d", new Object[]{this, new Integer(i), configuration});
                    return;
                }
                kotlin.jvm.internal.q.c(configuration, "<anonymous parameter 1>");
                a.a(SearchSdk.Companion);
            }
        }

        private final void k() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5f95772", new Object[]{this});
                return;
            }
            Application application = Globals.getApplication();
            kotlin.jvm.internal.q.a((Object) application, "Globals.getApplication()");
            Resources resources = application.getResources();
            kotlin.jvm.internal.q.a((Object) resources, "Globals.getApplication().resources");
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            int a2 = h.a().a((Context) Globals.getApplication());
            int e = h.a().e((Context) Globals.getApplication());
            float f = displayMetrics.density;
            ntx.a(a2, e, f);
            imk.b = e;
            imk.c = a2;
            imk.f29154a = f;
        }

        private final void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            } else if (!r.cc()) {
            } else {
                OrangeConfig.getInstance().registerListener(new String[]{nuj.NAMESPACE}, new nuj(), true);
            }
        }

        private final void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            } else if (!r.aP()) {
            } else {
                ntz.INSTANCE.a();
            }
        }

        private final void f() {
            IpChange ipChange = $ipChange;
            boolean z = false;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
                return;
            }
            String appVersion = TaobaoApplication.getAppVersion();
            String str = appVersion;
            if (!StringUtils.isEmpty(str)) {
                kotlin.jvm.internal.q.a((Object) appVersion, "appVersion");
                if (n.b((CharSequence) str, new String[]{"."}, false, 0, 6, (Object) null).size() > 3) {
                    z = true;
                }
            }
            SearchSdk.access$setSIsBeta$cp(z);
        }

        private final void g() {
            Display defaultDisplay;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
                return;
            }
            int i = Constants.screen_height;
            if (ScreenType.IS_PAD || ScreenType.IS_FOLDABLE) {
                i = h.a().e((Context) Globals.getApplication());
            } else {
                Object systemService = Globals.getApplication().getSystemService(com.taobao.android.weex_framework.util.a.ATOM_EXT_window);
                if (!(systemService instanceof WindowManager)) {
                    systemService = null;
                }
                WindowManager windowManager = (WindowManager) systemService;
                if (windowManager != null && (defaultDisplay = windowManager.getDefaultDisplay()) != null) {
                    i = defaultDisplay.getHeight();
                }
            }
            nsv.a(new nsw(), Globals.getApplication(), ntx.b(), ntx.a(), i);
            a aVar = this;
            aVar.o();
            nsv.a();
            aVar.h();
        }

        private final void h() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
                return;
            }
            q.a(SearchAddBagBridge.API_NAME, (Class<? extends e>) SearchAddBagBridge.class, true);
            q.a(SearchCustomerDataBridge.API_NAME, (Class<? extends e>) SearchCustomerDataBridge.class, true);
            q.a(SpeechPermissionPlugin.API_NAME, (Class<? extends e>) SpeechPermissionPlugin.class, true);
            q.a(XSearchEventBridge.API_NAME, (Class<? extends e>) XSearchEventBridge.class, true);
            q.a(SearchReviewBridge.API_NAME, (Class<? extends e>) SearchReviewBridge.class, true);
            q.a(SuggestPageBridge.API_NAME, (Class<? extends e>) SuggestPageBridge.class, true);
            q.a(SearchScreenShotBridge.API_NAME, (Class<? extends e>) SearchScreenShotBridge.class, true);
            q.a("OnesearchBridge", (Class<? extends e>) OnesearchBridge.class, true);
        }

        private final void i() {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            } else if (SearchSdk.sRainbowInited) {
            } else {
                SearchSdk.sRainbowInited = true;
                try {
                    str = UTDevice.getUtdid(Globals.getApplication());
                } catch (Exception e) {
                    com.taobao.search.common.util.q.c(SearchSdk.TAG, "获取utdid失败", e);
                    str = "";
                }
                com.taobao.search.rainbow.a.a(new t());
                com.taobao.search.rainbow.a.a(new com.taobao.search.common.util.h());
                com.taobao.search.rainbow.a.a(TaoApplication.getVersion(), str, Globals.getApplication());
                com.taobao.search.rainbow.a.b();
            }
        }
    }

    public static final /* synthetic */ boolean access$getSIsBeta$cp() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8dcde025", new Object[0])).booleanValue() : sIsBeta;
    }

    public static final /* synthetic */ void access$setSIsBeta$cp(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62c57047", new Object[]{new Boolean(z)});
        } else {
            sIsBeta = z;
        }
    }

    static {
        kge.a(490719266);
        Companion = new a(null);
        sSearchDoorInited = new AtomicBoolean(false);
    }
}
