package tb;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.utils.e;
import com.taobao.android.home.component.utils.j;
import com.taobao.homepage.utils.n;
import com.taobao.tao.recommend3.tracelog.b;
import com.taobao.tao.topmultitab.c;
import com.taobao.taobao.R;
import java.lang.ref.WeakReference;

/* loaded from: classes8.dex */
public class ojd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final long f32110a;
    private WeakReference<View> b;
    private View c;
    private View d;
    private volatile boolean e;
    private volatile boolean f;
    private final Object g;
    private int h;
    private final nvq i;

    /* loaded from: classes8.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final ojd f32114a;

        static {
            kge.a(905548719);
            f32114a = new ojd();
        }

        public static /* synthetic */ ojd a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ojd) ipChange.ipc$dispatch("f08b455", new Object[0]) : f32114a;
        }
    }

    static {
        kge.a(828875089);
    }

    public static /* synthetic */ View a(ojd ojdVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("39eaced1", new Object[]{ojdVar}) : ojdVar.c;
    }

    public static /* synthetic */ View a(ojd ojdVar, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("d07649a5", new Object[]{ojdVar, view});
        }
        ojdVar.c = view;
        return view;
    }

    public static /* synthetic */ View b(ojd ojdVar, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("c21fefc4", new Object[]{ojdVar, view});
        }
        ojdVar.d = view;
        return view;
    }

    public static /* synthetic */ boolean b(ojd ojdVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e68612d4", new Object[]{ojdVar})).booleanValue() : ojdVar.e;
    }

    public static /* synthetic */ nvq c(ojd ojdVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (nvq) ipChange.ipc$dispatch("8e04198c", new Object[]{ojdVar}) : ojdVar.i;
    }

    public static /* synthetic */ void d(ojd ojdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c38c1fd2", new Object[]{ojdVar});
        } else {
            ojdVar.e();
        }
    }

    public static /* synthetic */ View e(ojd ojdVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("8d8defd5", new Object[]{ojdVar}) : ojdVar.d;
    }

    public static /* synthetic */ boolean f(ojd ojdVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a0922cd8", new Object[]{ojdVar})).booleanValue() : ojdVar.f;
    }

    private ojd() {
        this.f32110a = j.a("enablePreCreateWaitTimeout", 1000);
        this.g = new Object();
        this.i = new nvq();
    }

    public static ojd a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ojd) ipChange.ipc$dispatch("f08b455", new Object[0]) : a.a();
    }

    public View b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("5ed9365a", new Object[]{this, layoutInflater, viewGroup});
        }
        b.a().e(b.HOME_LAYOUT);
        View view = this.c;
        if (view != null) {
            return view;
        }
        WeakReference<View> weakReference = this.b;
        if ((weakReference == null ? null : weakReference.get()) == null) {
            this.b = new WeakReference<>(layoutInflater.inflate(R.layout.activity_homepage_multitab, viewGroup, false));
        }
        b.a().b(b.HOME_LAYOUT);
        return this.b.get();
    }

    private View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("1cc208fb", new Object[]{this, layoutInflater, viewGroup});
        }
        WeakReference<View> weakReference = this.b;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.b = new WeakReference<>(layoutInflater.inflate(R.layout.activity_homepage_multitab, viewGroup, false));
        return this.b.get();
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        if (n.n().v()) {
            ldf.d("RevisionReuseView", "setAsyncTaskCount 性能优化后的新逻辑");
            this.h = i;
        } else {
            ldf.d("RevisionReuseView", "setAsyncTaskCount 性能优化前的老逻辑");
            this.h = 0;
        }
        ldf.d("RevisionReuseView", "remainingThreads ： " + i + "， this.remainingThreads ： " + this.h);
    }

    public View c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("a0f063b9", new Object[]{this, layoutInflater, viewGroup});
        }
        if (n.n().v()) {
            ldf.d("RevisionReuseView", "inflateView 性能优化后的新逻辑");
            return e(layoutInflater, viewGroup);
        }
        ldf.d("RevisionReuseView", "inflateView 性能优化前的老逻辑");
        return d(layoutInflater, viewGroup);
    }

    public View a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("ee74837c", new Object[]{this, activity});
        }
        if (n.n().v()) {
            ldf.d("RevisionReuseView", "inflateRocketView 性能优化后的新逻辑");
            return b(activity);
        }
        ldf.d("RevisionReuseView", "inflateRocketView 性能优化前的老逻辑");
        return LayoutInflater.from(activity).inflate(R.layout.homepage_tab_tao_button, (ViewGroup) null);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [tb.ojd$1] */
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            new Thread("preCreateRootView") { // from class: tb.ojd.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Thread, java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        gso.a();
                        e.e("RevisionReuseView", "开始异步首页框架视图");
                        lar.i("preCreateRootView");
                        if (ojd.a(ojd.this) == null && !ojd.b(ojd.this)) {
                            ldf.d("RevisionReuseView", "preCreateRootView create mHomepageView");
                            ojd.a(ojd.this, ojd.c(ojd.this).a());
                        }
                        lar.j("preCreateRootView");
                    } finally {
                        try {
                            ojd.d(ojd.this);
                            e.e("RevisionReuseView", "异步首页框架视图完成");
                        } catch (Throwable th) {
                        }
                    }
                    ojd.d(ojd.this);
                    e.e("RevisionReuseView", "异步首页框架视图完成");
                }
            }.start();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [tb.ojd$2] */
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            new Thread("preRenderRocketView") { // from class: tb.ojd.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Thread, java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    e.e("RevisionReuseView", "开始异步创建小火箭视图");
                    try {
                        lar.i("preRenderRocketView");
                        if (ojd.e(ojd.this) == null && !ojd.f(ojd.this)) {
                            ojd.b(ojd.this, ojd.c(ojd.this).b());
                        }
                        lar.j("preRenderRocketView");
                    } finally {
                        try {
                            ojd.d(ojd.this);
                            e.e("RevisionReuseView", "异步创建小火箭视图完成");
                        } catch (Throwable th) {
                        }
                    }
                    ojd.d(ojd.this);
                    e.e("RevisionReuseView", "异步创建小火箭视图完成");
                }
            }.start();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [tb.ojd$3] */
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            new Thread("preRenderTheme") { // from class: tb.ojd.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Code restructure failed: missing block: B:12:0x003f, code lost:
                    if (com.taobao.homepage.utils.n.n().g() != false) goto L16;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:21:0x005a, code lost:
                    com.taobao.android.home.component.utils.e.e("RevisionReuseView", "异步创建主题视图完成");
                 */
                /* JADX WARN: Code restructure failed: missing block: B:22:0x0064, code lost:
                    return;
                 */
                @Override // java.lang.Thread, java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public void run() {
                    /*
                        r3 = this;
                        java.lang.String r0 = "preRenderTheme"
                        com.android.alibaba.ip.runtime.IpChange r1 = tb.ojd.AnonymousClass3.$ipChange
                        boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
                        if (r2 == 0) goto L14
                        r0 = 1
                        java.lang.Object[] r0 = new java.lang.Object[r0]
                        r2 = 0
                        r0[r2] = r3
                        java.lang.String r2 = "5c510192"
                        r1.ipc$dispatch(r2, r0)
                        return
                    L14:
                        java.lang.String r1 = "开始异步创建主题视图"
                        java.lang.String[] r1 = new java.lang.String[]{r1}
                        java.lang.String r2 = "RevisionReuseView"
                        com.taobao.android.home.component.utils.e.e(r2, r1)
                        tb.lar.i(r0)     // Catch: java.lang.Throwable -> L44
                        tb.ojd r1 = tb.ojd.this     // Catch: java.lang.Throwable -> L44
                        boolean r1 = tb.ojd.b(r1)     // Catch: java.lang.Throwable -> L44
                        if (r1 != 0) goto L34
                        tb.ojd r1 = tb.ojd.this     // Catch: java.lang.Throwable -> L44
                        tb.nvq r1 = tb.ojd.c(r1)     // Catch: java.lang.Throwable -> L44
                        r1.c()     // Catch: java.lang.Throwable -> L44
                    L34:
                        tb.lar.j(r0)     // Catch: java.lang.Throwable -> L44
                        com.taobao.performance.g r0 = com.taobao.homepage.utils.n.n()
                        boolean r0 = r0.g()
                        if (r0 == 0) goto L5a
                        goto L55
                    L42:
                        r0 = move-exception
                        goto L65
                    L44:
                        r0 = move-exception
                        java.lang.String r1 = "异步创建主题视图异常"
                        com.taobao.android.home.component.utils.e.a(r2, r1, r0)     // Catch: java.lang.Throwable -> L42
                        com.taobao.performance.g r0 = com.taobao.homepage.utils.n.n()
                        boolean r0 = r0.g()
                        if (r0 == 0) goto L5a
                    L55:
                        tb.ojd r0 = tb.ojd.this
                        tb.ojd.d(r0)
                    L5a:
                        java.lang.String r0 = "异步创建主题视图完成"
                        java.lang.String[] r0 = new java.lang.String[]{r0}
                        com.taobao.android.home.component.utils.e.e(r2, r0)
                        return
                    L65:
                        com.taobao.performance.g r1 = com.taobao.homepage.utils.n.n()
                        boolean r1 = r1.g()
                        if (r1 == 0) goto L74
                        tb.ojd r1 = tb.ojd.this
                        tb.ojd.d(r1)
                    L74:
                        throw r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: tb.ojd.AnonymousClass3.run():void");
                }
            }.start();
        }
    }

    private View d(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("e3079118", new Object[]{this, layoutInflater, viewGroup});
        }
        View view = this.c;
        boolean z = view != null && !(view.getContext() instanceof Activity);
        boolean a2 = j.a("enableFixLauncherContext", true);
        ldf.d("RevisionReuseView", "inflateViewByDefault isNotActivityContext:" + z + ",enableFixContext:" + a2);
        if (z) {
            kss.a("Page_Home", 19999, "inflateViewByDefaultContextException", "");
        }
        if (a2 && z) {
            ldf.d("RevisionReuseView", "inflateViewByDefault HomepageView context error,forceInflateMultiTab ");
            this.c = a(layoutInflater, viewGroup);
        }
        if (this.c == null) {
            ldf.d("RevisionReuseView", "inflateViewByDefault mHomepageView not exist ");
            this.c = a().b(layoutInflater, viewGroup);
        }
        ldf.d("RevisionReuseView", "inflateViewByDefault createInfoView: ");
        lar.e("inflateRoot");
        c.a().a(this.c);
        lar.f("inflateRoot");
        ldf.d("RevisionReuseView", "inflateView createInfoView finish: ");
        return this.c;
    }

    private View e(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("251ebe77", new Object[]{this, layoutInflater, viewGroup});
        }
        e.e("RevisionReuseView", "obtainRootView");
        synchronized (this.g) {
            while (this.h > 0) {
                try {
                    this.g.wait(this.f32110a);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    ldf.d("RevisionReuseView", "主线程被中断。");
                }
            }
        }
        if (this.c != null) {
            e.e("RevisionReuseView", "返回异步创建的首页框架视图");
            if (f()) {
                e.e("RevisionReuseView", "替换预创建的context");
                this.i.a(viewGroup.getContext());
            } else {
                e.e("RevisionReuseView", "非经历预创建时机，需要新建信息流");
                c.a().a(this.c);
            }
            return this.c;
        }
        this.e = true;
        this.i.a(viewGroup.getContext());
        e.e("RevisionReuseView", "主线程加载首页框架视图");
        lar.e("UI_Thread_createViewMultiTab");
        lar.e("createRootView");
        ldf.d("RevisionReuseView", "inflateViewByPreCreate create mHomepageView");
        this.c = a().b(layoutInflater, viewGroup);
        lar.f("createRootView");
        c.a().a(this.c);
        lar.f("UI_Thread_createViewMultiTab");
        return this.c;
    }

    private View b(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("891545fd", new Object[]{this, activity});
        }
        e.e("RevisionReuseView", "obtainRocketView");
        synchronized (this.g) {
            while (this.h > 0) {
                try {
                    e.e("RevisionReuseView", "主线程加载小火箭阻塞，等待异步加载完成");
                    this.g.wait(this.f32110a);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    ldf.d("RevisionReuseView", "主线程被中断。");
                }
            }
        }
        if (this.d != null && f()) {
            e.e("RevisionReuseView", "返回异步创建的小火箭");
            return this.d;
        }
        e.e("RevisionReuseView", "主线程加载小火箭");
        this.f = true;
        this.d = LayoutInflater.from(activity).inflate(R.layout.homepage_tab_tao_button, (ViewGroup) null);
        return this.d;
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        synchronized (this.g) {
            this.h--;
            e.e("RevisionReuseView", "remainingThreads : " + this.h);
            if (this.h <= 0) {
                e.e("RevisionReuseView", "通知终止线程阻塞 : " + this.h);
                this.g.notifyAll();
            }
        }
    }

    private boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue() : !(this.i.d() instanceof Activity);
    }
}
