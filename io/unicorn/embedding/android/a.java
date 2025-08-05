package io.unicorn.embedding.android;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import io.unicorn.embedding.engine.d;
import tb.kge;
import tb.riy;
import tb.rtd;
import tb.xmp;

/* loaded from: classes9.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private InterfaceC1057a f24815a;
    private io.unicorn.embedding.engine.a b;
    private UnicornView d;
    private boolean e;
    private int[] g;
    private Context i;
    private i j;
    private boolean f = false;
    private final io.unicorn.embedding.engine.renderer.b k = new c(this);
    private final ComponentCallbacks2 l = new b(this);
    private boolean h = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: io.unicorn.embedding.android.a$a  reason: collision with other inner class name */
    /* loaded from: classes9.dex */
    public interface InterfaceC1057a extends io.unicorn.embedding.android.b, io.unicorn.embedding.android.c, g {
        @Override // io.unicorn.embedding.android.b
        void cleanUpFlutterEngine(io.unicorn.embedding.engine.a aVar);

        @Override // io.unicorn.embedding.android.b
        void configureFlutterEngine(io.unicorn.embedding.engine.a aVar);

        String getCachedEngineId();

        Context getContext();

        d getFlutterShellArgs();

        RenderMode getRenderMode();

        TransparencyMode getTransparencyMode();

        void onFlutterUiDisplayed();

        void onFlutterUiNoLongerDisplayed();

        @Override // io.unicorn.embedding.android.c
        io.unicorn.embedding.engine.a provideFlutterEngine(Context context);

        @Override // io.unicorn.embedding.android.g
        f provideSplashScreen();

        boolean shouldAttachEngineToActivity();

        boolean shouldDestroyEngineWithHost();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes9.dex */
    public static class b implements ComponentCallbacks2 {

        /* renamed from: a  reason: collision with root package name */
        private final a f24816a;

        static {
            kge.a(-1734825610);
            kge.a(-418195541);
        }

        public b(a aVar) {
            this.f24816a = aVar;
        }

        public static void a() {
        }

        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(Configuration configuration) {
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
        }

        @Override // android.content.ComponentCallbacks2
        public void onTrimMemory(int i) {
            if (this.f24816a.b != null && Build.VERSION.SDK_INT >= 29 && i == 80) {
                this.f24816a.b.j().k();
            }
            this.f24816a.a(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes9.dex */
    public static class c implements io.unicorn.embedding.engine.renderer.b {

        /* renamed from: a  reason: collision with root package name */
        private final a f24817a;

        static {
            kge.a(-1639005103);
            kge.a(1384242717);
        }

        public c(a aVar) {
            this.f24817a = aVar;
        }

        public static void c() {
        }

        @Override // io.unicorn.embedding.engine.renderer.b
        public void a() {
            this.f24817a.f24815a.onFlutterUiDisplayed();
            this.f24817a.h = true;
        }

        @Override // io.unicorn.embedding.engine.renderer.b
        public void b() {
            this.f24817a.f24815a.onFlutterUiNoLongerDisplayed();
        }
    }

    static {
        kge.a(-7432839);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(InterfaceC1057a interfaceC1057a) {
        this.f24815a = interfaceC1057a;
    }

    public static void e() {
        c.c();
        b.a();
    }

    private void x() {
        if (this.f24815a != null) {
            return;
        }
        throw new IllegalStateException("Cannot execute method on a destroyed FlutterActivityAndFragmentDelegate.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View a(android.view.LayoutInflater r8, android.view.ViewGroup r9, android.os.Bundle r10) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.unicorn.embedding.android.a.a(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        this.f24815a = null;
        this.b = null;
        this.d = null;
    }

    public void a(float f, float f2) {
        UnicornView unicornView = this.d;
        if (unicornView != null) {
            unicornView.updateScreenSize(f, f2);
        }
    }

    void a(int i) {
        x();
        if (this.b == null) {
            rtd.d("FlutterActivityAndFragmentDelegate", "onTrimMemory() invoked before FlutterFragment was attached to an Activity.");
            return;
        }
        if (!(this.h && i >= 10)) {
            return;
        }
        this.b.d().c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(int i, int i2) {
        String str = "onPreRendering [" + i + ", " + i2 + riy.ARRAY_END_STR;
        if (Build.VERSION.SDK_INT < 19) {
            rtd.d("FlutterActivityAndFragmentDelegate", "Pre-rendering is not supported on SDK_INT < 19");
        } else if (i <= 0 || i2 <= 0) {
            rtd.d("FlutterActivityAndFragmentDelegate", "Illegal width or height of viewport");
        } else {
            x();
            this.g = new int[2];
            int[] iArr = this.g;
            iArr[0] = i;
            iArr[1] = i2;
            this.f = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Context context) {
        x();
        this.i = context;
        context.registerComponentCallbacks(this.l);
        if (this.b == null) {
            d();
        }
        if (this.f24815a.shouldAttachEngineToActivity()) {
            rtd.a("FlutterActivityAndFragmentDelegate", "Attaching FlutterEngine to the Activity that owns this Fragment.");
            this.b.a(context);
        }
        this.f24815a.configureFlutterEngine(this.b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Bundle bundle) {
        rtd.a("FlutterActivityAndFragmentDelegate", "onActivityCreated. Giving framework and plugins an opportunity to restore state.");
        x();
    }

    public void a(xmp xmpVar) {
        UnicornView unicornView = this.d;
        if (unicornView != null) {
            unicornView.setWeexUnicornListener(xmpVar);
        }
    }

    public io.unicorn.embedding.engine.a b() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean c() {
        return this.e;
    }

    void d() {
        rtd.a("FlutterActivityAndFragmentDelegate", "Setting up FlutterEngine.");
        String cachedEngineId = this.f24815a.getCachedEngineId();
        if (cachedEngineId != null) {
            this.b = io.unicorn.embedding.engine.b.a().a(cachedEngineId);
            this.e = true;
            if (this.b != null) {
                return;
            }
            throw new IllegalStateException("The requested cached FlutterEngine did not exist in the FlutterEngineCache: '" + cachedEngineId + "'");
        }
        InterfaceC1057a interfaceC1057a = this.f24815a;
        this.b = interfaceC1057a.provideFlutterEngine(interfaceC1057a.getContext());
        if (this.b != null) {
            this.e = true;
            return;
        }
        rtd.a("FlutterActivityAndFragmentDelegate", "No preferred FlutterEngine was provided. Creating a new FlutterEngine for this FlutterFragment.");
        this.b = new io.unicorn.embedding.engine.a(this.f24815a.getContext(), this.f24815a.getFlutterShellArgs().a());
        this.e = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g() {
        rtd.a("FlutterActivityAndFragmentDelegate", "onStart()");
        x();
        this.b.j().l();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h() {
        rtd.a("FlutterActivityAndFragmentDelegate", "onResume()");
        x();
        this.b.h().b();
        this.b.j().n();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j() {
        rtd.a("FlutterActivityAndFragmentDelegate", "onPause()");
        x();
        this.b.h().a();
        this.b.j().m();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void k() {
        rtd.a("FlutterActivityAndFragmentDelegate", "onStop()");
        x();
        this.b.h().c();
        this.b.j().o();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void l() {
        rtd.a("FlutterActivityAndFragmentDelegate", "onDestroyView()");
        x();
        this.d.detachFromFlutterEngine();
        this.d.removeOnFirstFrameRenderedListener(this.k);
        this.b.j().p();
    }

    public void m() {
        this.b.h().b();
    }

    public void n() {
        this.b.h().c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void o() {
        UnicornView unicornView = this.d;
        if (unicornView != null) {
            unicornView.convertToSurfaceView();
        }
    }

    public void p() {
        UnicornView unicornView = this.d;
        if (unicornView != null) {
            unicornView.validRenderSurface();
        }
    }

    public void q() {
        UnicornView unicornView = this.d;
        if (unicornView != null) {
            unicornView.invalidRenderSurface();
        }
    }

    public void r() {
        UnicornView unicornView = this.d;
        if (unicornView != null) {
            unicornView.updateViewport();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void s() {
        rtd.a("FlutterActivityAndFragmentDelegate", "onDetach()");
        x();
        this.f24815a.cleanUpFlutterEngine(this.b);
        if (this.f24815a.shouldAttachEngineToActivity()) {
            rtd.a("FlutterActivityAndFragmentDelegate", "Detaching FlutterEngine from the Activity that owns this Fragment.");
        }
        this.b.h().d();
        if (this.f24815a.shouldDestroyEngineWithHost()) {
            boolean z = true;
            if (com.taobao.android.weex_framework.util.f.m() && this.b.m() && this.b.n()) {
                z = true ^ io.unicorn.embedding.engine.b.a().a(this.b);
            }
            if (z) {
                this.b.a();
            }
            if (this.f24815a.getCachedEngineId() != null) {
                io.unicorn.embedding.engine.b.a().b(this.f24815a.getCachedEngineId());
            }
            this.b = null;
        }
        this.i.unregisterComponentCallbacks(this.l);
        this.i = null;
    }
}
