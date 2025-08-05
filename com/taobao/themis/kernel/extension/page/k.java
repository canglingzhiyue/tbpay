package com.taobao.themis.kernel.extension.page;

import android.app.Activity;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.container.Window;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.kernel.solution.TMSSolutionType;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.kge;
import tb.qqa;
import tb.qqc;
import tb.suj;

/* loaded from: classes9.dex */
public final class k implements i {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;

    /* renamed from: a  reason: collision with root package name */
    private boolean f22519a;
    private final boolean b;
    private boolean c;
    private boolean d;
    private final Window e;
    private final int f;
    private final int g;
    private final AtomicBoolean h;
    private final b i;
    private final ITMSPage j;

    static {
        kge.a(2063064477);
        kge.a(-981564708);
        Companion = new a(null);
    }

    public k(ITMSPage page) {
        kotlin.jvm.internal.q.d(page, "page");
        this.j = page;
        this.f22519a = qqc.l(this.j);
        this.b = this.j.c().g();
        this.c = qqc.c(this.j) == Window.Theme.LIGHT;
        this.d = qqc.u(this.j);
        Activity o = this.j.b().o();
        kotlin.jvm.internal.q.b(o, "page.getInstance().activity");
        android.view.Window window = o.getWindow();
        kotlin.jvm.internal.q.b(window, "page.getInstance().activity.window");
        this.e = window;
        this.f = this.e.getStatusBarColor();
        this.g = this.e.getNavigationBarColor();
        this.h = new AtomicBoolean(false);
        this.i = new b();
    }

    public static final /* synthetic */ void a(k kVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cefa342", new Object[]{kVar});
        } else {
            kVar.b();
        }
    }

    /* loaded from: classes9.dex */
    public static final class b implements qqa.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.qqa.b
        public void b(ITMSPage page) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("95f55494", new Object[]{this, page});
            } else {
                kotlin.jvm.internal.q.d(page, "page");
            }
        }

        public b() {
        }

        @Override // tb.qqa.b
        public void d(ITMSPage page) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cb36d996", new Object[]{this, page});
                return;
            }
            kotlin.jvm.internal.q.d(page, "page");
            qqa.b.a.d(this, page);
        }

        @Override // tb.qqa.b
        public void e(ITMSPage page) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("65d79c17", new Object[]{this, page});
                return;
            }
            kotlin.jvm.internal.q.d(page, "page");
            qqa.b.a.a(this, page);
        }

        @Override // tb.qqa.b
        public void f(ITMSPage page) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("785e98", new Object[]{this, page});
                return;
            }
            kotlin.jvm.internal.q.d(page, "page");
            qqa.b.a.b(this, page);
        }

        @Override // tb.qqa.b
        public void a(ITMSPage page) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb549213", new Object[]{this, page});
                return;
            }
            kotlin.jvm.internal.q.d(page, "page");
            if (com.taobao.themis.kernel.utils.n.aK() && (page.b().j() == TMSSolutionType.WEB_SINGLE_PAGE || page.b().j() == TMSSolutionType.WEEX)) {
                return;
            }
            k.a(k.this);
        }

        @Override // tb.qqa.b
        public void c(ITMSPage page) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("30961715", new Object[]{this, page});
                return;
            }
            kotlin.jvm.internal.q.d(page, "page");
            a(page);
        }
    }

    @Override // com.taobao.themis.kernel.extension.page.g
    public void c_(ITMSPage page) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f4ed18e", new Object[]{this, page});
            return;
        }
        kotlin.jvm.internal.q.d(page, "page");
        this.j.a(this.i);
    }

    @Override // com.taobao.themis.kernel.extension.page.g
    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
        } else if (this.j.a(suj.class) != null) {
        } else {
            b();
        }
    }

    @Override // com.taobao.themis.kernel.extension.page.i
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else if (!this.b) {
            this.c = false;
            b();
        } else {
            this.f22519a = z;
            b();
        }
    }

    @Override // com.taobao.themis.kernel.extension.page.i
    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else if (!this.b) {
            this.c = false;
            b();
        } else {
            this.c = z;
            b();
        }
    }

    @Override // com.taobao.themis.kernel.extension.page.g
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            this.j.b(this.i);
        }
    }

    private final synchronized void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        int i = 256;
        d();
        if (this.b) {
            this.e.setStatusBarColor(0);
            i = 1280;
        }
        this.e.clearFlags(67108864);
        int b2 = b(a(i));
        View decorView = this.e.getDecorView();
        kotlin.jvm.internal.q.b(decorView, "mWindow.decorView");
        decorView.setSystemUiVisibility(b2);
        this.h.set(true);
    }

    private final int a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a821938e", new Object[]{this, new Integer(i)})).intValue() : (Build.VERSION.SDK_INT >= 23 && this.c) ? i | 8192 : i;
    }

    private final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (Build.VERSION.SDK_INT < 28 || this.h.get()) {
        } else {
            try {
                WindowManager.LayoutParams attributes = this.e.getAttributes();
                attributes.layoutInDisplayCutoutMode = 1;
                this.e.setAttributes(attributes);
            } catch (Throwable th) {
                TMSLogger.b("SystemWindowPageExtension", "fitsNotchScreen error: " + th.getMessage(), th);
            }
        }
    }

    private final int b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a9d66c2d", new Object[]{this, new Integer(i)})).intValue();
        }
        if (this.f22519a && this.d) {
            i |= 518;
        } else if (this.f22519a && !this.d) {
            i |= 1028;
        } else if (!this.f22519a && this.d) {
            i |= 514;
        }
        return i | 4096;
    }

    /* loaded from: classes9.dex */
    public static final class a {
        static {
            kge.a(-1369888603);
        }

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.o oVar) {
            this();
        }
    }
}
