package io.unicorn.embedding.android;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.taobao.android.weex.WeexExternalEventCheckException;
import com.taobao.android.weex.WeexExternalEventType;
import com.taobao.android.weex.n;
import com.taobao.android.weex_framework.ui.h;
import io.unicorn.adapter.muise.UnicornMuiseJNI;
import io.unicorn.embedding.android.a;
import io.unicorn.embedding.engine.d;
import io.unicorn.plugin.platform.WeexPlatformView;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import tb.kge;
import tb.rtd;
import tb.tbq;
import tb.xmp;

/* loaded from: classes9.dex */
public class h implements com.taobao.android.weex_framework.ui.h, a.InterfaceC1057a {

    /* renamed from: a  reason: collision with root package name */
    private final Context f24820a;
    private io.unicorn.embedding.android.a b;
    private long e;
    private final Set<tbq> g = new HashSet();
    private boolean f = false;
    private Bundle c = new Bundle();
    private f d = null;

    /* renamed from: io.unicorn.embedding.android.h$1  reason: invalid class name */
    /* loaded from: classes9.dex */
    class AnonymousClass1 implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.taobao.android.weex_framework.ui.i f24821a;

        @Override // io.unicorn.embedding.android.f
        public View a(Context context, Bundle bundle) {
            return this.f24821a.a(context, bundle);
        }

        @Override // io.unicorn.embedding.android.f
        public void a(Runnable runnable) {
            this.f24821a.a(runnable);
        }
    }

    /* loaded from: classes9.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private final String f24822a;
        private boolean b;
        private RenderMode c;
        private TransparencyMode d;
        private boolean e;
        private f f;
        private d g;

        static {
            kge.a(257518921);
        }

        private a(String str) {
            this.b = false;
            this.c = RenderMode.surface;
            this.d = TransparencyMode.opaque;
            this.e = true;
            this.f = null;
            this.g = null;
            this.f24822a = str;
        }

        /* synthetic */ a(String str, AnonymousClass1 anonymousClass1) {
            this(str);
        }

        public static void b() {
        }

        protected Bundle a() {
            Bundle bundle = new Bundle();
            bundle.putString("cached_engine_id", this.f24822a);
            bundle.putBoolean("destroy_engine_with_fragment", this.b);
            d dVar = this.g;
            if (dVar != null) {
                bundle.putStringArray("initialization_args", dVar.a());
            }
            RenderMode renderMode = this.c;
            if (renderMode == null) {
                renderMode = RenderMode.surface;
            }
            bundle.putString("flutterview_render_mode", renderMode.name());
            TransparencyMode transparencyMode = this.d;
            if (transparencyMode == null) {
                transparencyMode = TransparencyMode.transparent;
            }
            bundle.putString("flutterview_transparency_mode", transparencyMode.name());
            bundle.putBoolean("should_attach_engine_to_activity", this.e);
            return bundle;
        }

        public a a(RenderMode renderMode) {
            this.c = renderMode;
            return this;
        }

        public a a(TransparencyMode transparencyMode) {
            this.d = transparencyMode;
            return this;
        }

        public a a(f fVar) {
            this.f = fVar;
            return this;
        }

        public a a(boolean z) {
            this.b = z;
            return this;
        }

        public h a(Context context) {
            h hVar = new h(context);
            hVar.a(a());
            hVar.a(this.f);
            return hVar;
        }
    }

    static {
        kge.a(70352925);
        kge.a(-1679907309);
        kge.a(-1928838154);
        kge.a(-966648995);
    }

    public h(Context context) {
        this.f24820a = context;
    }

    public static a a(String str) {
        return new a(str, null);
    }

    public static void b() {
        a.b();
    }

    @Override // com.taobao.android.weex_framework.ui.h
    public HashMap<String, String> a(int i) {
        synchronized (this) {
            if (this.e != 0) {
                return UnicornMuiseJNI.getUnicornMuiseFirstScreenInfo(this.e);
            }
            return null;
        }
    }

    @Override // com.taobao.android.weex_framework.ui.h
    public void a() {
        io.unicorn.embedding.android.a aVar = this.b;
        if (aVar != null) {
            aVar.a((Bundle) null);
        }
    }

    @Override // com.taobao.android.weex_framework.ui.h
    public void a(float f, float f2) {
        io.unicorn.embedding.android.a aVar = this.b;
        if (aVar != null) {
            aVar.a(f, f2);
        }
    }

    @Override // com.taobao.android.weex_framework.ui.h
    public void a(int i, int i2) {
        io.unicorn.embedding.android.a aVar = this.b;
        if (aVar != null) {
            aVar.a(i, i2);
        }
    }

    public void a(long j) {
        this.e = j;
    }

    @Override // com.taobao.android.weex_framework.ui.h
    public void a(Context context) {
        this.b = new io.unicorn.embedding.android.a(this);
        this.b.a(context);
    }

    public void a(Bundle bundle) {
        this.c = bundle;
    }

    @Override // com.taobao.android.weex_framework.ui.h
    public void a(n nVar) throws WeexExternalEventCheckException {
        boolean z;
        WeexExternalEventType f = nVar.f();
        io.unicorn.embedding.android.a aVar = this.b;
        if (aVar == null || aVar.b() == null) {
            return;
        }
        if (f != WeexExternalEventType.START) {
            if (f == WeexExternalEventType.UPDATE) {
                boolean z2 = this.f;
                if (!z2) {
                    throw WeexExternalEventCheckException.fromState(z2, f);
                }
            } else if (f == WeexExternalEventType.END || f == WeexExternalEventType.CANCEL) {
                boolean z3 = this.f;
                if (!z3) {
                    throw WeexExternalEventCheckException.fromState(z3, f);
                }
                z = false;
            }
            this.b.b().i().a(nVar);
        }
        boolean z4 = this.f;
        if (z4) {
            throw WeexExternalEventCheckException.fromState(z4, f);
        }
        z = true;
        this.f = z;
        this.b.b().i().a(nVar);
    }

    @Override // com.taobao.android.weex_framework.ui.h
    public void a(h.b bVar) {
        io.unicorn.embedding.android.a aVar = this.b;
        if (aVar == null || aVar.b() == null) {
            return;
        }
        this.b.b().i().a(bVar);
    }

    public void a(f fVar) {
        this.d = fVar;
    }

    @Override // com.taobao.android.weex_framework.ui.h
    public void a(String str, Object obj) {
        io.unicorn.embedding.android.a aVar = this.b;
        if (aVar == null || aVar.b() == null) {
            return;
        }
        this.b.b().i().a(str, obj);
    }

    @Override // com.taobao.android.weex_framework.ui.h
    public void a(tbq tbqVar) {
        this.g.add(tbqVar);
    }

    @Override // com.taobao.android.weex_framework.ui.h
    public void a(xmp xmpVar) {
        io.unicorn.embedding.android.a aVar = this.b;
        if (aVar != null) {
            aVar.a(xmpVar);
        }
    }

    @Override // com.taobao.android.weex_framework.ui.h
    public void a(boolean z, com.taobao.android.weex_framework.ui.c cVar, h.a aVar) {
        io.unicorn.embedding.android.a aVar2 = this.b;
        if (aVar2 == null || aVar2.b() == null) {
            return;
        }
        this.b.b().i().a(z, cVar, aVar);
    }

    @Override // com.taobao.android.weex_framework.ui.h
    public HashMap<String, String> b(int i) {
        synchronized (this) {
            if (this.e != 0) {
                return UnicornMuiseJNI.getPerformanceInfo(this.e);
            }
            return null;
        }
    }

    @Override // com.taobao.android.weex_framework.ui.h
    public Map<String, String> c(int i) {
        io.unicorn.embedding.android.a aVar = this.b;
        return (aVar == null || aVar.b() == null) ? new HashMap() : ((WeexPlatformView) this.b.b().j().g(i)).checkWhiteScreenInfo();
    }

    @Override // io.unicorn.embedding.android.a.InterfaceC1057a, io.unicorn.embedding.android.b
    public void cleanUpFlutterEngine(io.unicorn.embedding.engine.a aVar) {
        Activity activity = getActivity();
        if (activity instanceof b) {
            ((b) activity).cleanUpFlutterEngine(aVar);
        }
    }

    @Override // io.unicorn.embedding.android.a.InterfaceC1057a, io.unicorn.embedding.android.b
    public void configureFlutterEngine(io.unicorn.embedding.engine.a aVar) {
        Activity activity = getActivity();
        if (activity instanceof b) {
            ((b) activity).configureFlutterEngine(aVar);
        }
    }

    @Override // com.taobao.android.weex_framework.ui.h
    public View d() {
        return this.b.a(null, null, null);
    }

    @Override // com.taobao.android.weex_framework.ui.h
    public void e() {
        io.unicorn.embedding.android.a aVar = this.b;
        if (aVar != null) {
            aVar.g();
        }
    }

    @Override // com.taobao.android.weex_framework.ui.h
    public void f() {
        io.unicorn.embedding.android.a aVar = this.b;
        if (aVar != null) {
            aVar.h();
        }
    }

    @Override // com.taobao.android.weex_framework.ui.h
    public void g() {
        io.unicorn.embedding.android.a aVar = this.b;
        if (aVar != null) {
            aVar.j();
        }
    }

    public Activity getActivity() {
        Context context = this.f24820a;
        if (context instanceof Activity) {
            return (Activity) context;
        }
        return null;
    }

    @Override // io.unicorn.embedding.android.a.InterfaceC1057a
    public String getCachedEngineId() {
        return x().getString("cached_engine_id", null);
    }

    @Override // io.unicorn.embedding.android.a.InterfaceC1057a
    public Context getContext() {
        return this.f24820a;
    }

    @Override // io.unicorn.embedding.android.a.InterfaceC1057a
    public d getFlutterShellArgs() {
        if (this.c.containsKey("initialization_args")) {
            String[] stringArray = this.c.getStringArray("initialization_args");
            if (stringArray != null) {
                return new d(stringArray);
            }
        } else {
            Context context = this.f24820a;
            if ((context instanceof Activity) && ((Activity) context).getIntent() != null) {
                return d.a(((Activity) this.f24820a).getIntent());
            }
        }
        return new d(new String[0]);
    }

    @Override // io.unicorn.embedding.android.a.InterfaceC1057a
    public RenderMode getRenderMode() {
        return RenderMode.valueOf(x().getString("flutterview_render_mode", RenderMode.surface.name()));
    }

    @Override // io.unicorn.embedding.android.a.InterfaceC1057a
    public TransparencyMode getTransparencyMode() {
        return TransparencyMode.valueOf(x().getString("flutterview_transparency_mode", TransparencyMode.opaque.name()));
    }

    @Override // com.taobao.android.weex_framework.ui.h
    public void h() {
        io.unicorn.embedding.android.a aVar = this.b;
        if (aVar != null) {
            aVar.k();
        }
    }

    @Override // com.taobao.android.weex_framework.ui.h
    public void i() {
        io.unicorn.embedding.android.a aVar = this.b;
        if (aVar != null) {
            aVar.l();
        }
    }

    @Override // com.taobao.android.weex_framework.ui.h
    public void j() {
        io.unicorn.embedding.android.a aVar = this.b;
        if (aVar != null) {
            aVar.s();
            this.b.a();
            this.b = null;
        }
        synchronized (this) {
            if (this.e != 0) {
                UnicornMuiseJNI.destroyRenderEngine(this.e);
                this.e = 0L;
            }
        }
    }

    @Override // com.taobao.android.weex_framework.ui.h
    public String k() {
        io.unicorn.embedding.android.a aVar = this.b;
        return (aVar == null || aVar.b() == null) ? "" : this.b.b().f().getScreenshotPixelCheckInfo();
    }

    @Override // com.taobao.android.weex_framework.ui.h
    public void l() {
        io.unicorn.embedding.android.a aVar = this.b;
        if (aVar != null) {
            aVar.o();
        }
    }

    @Override // com.taobao.android.weex_framework.ui.h
    public void m() {
        io.unicorn.embedding.android.a aVar = this.b;
        if (aVar == null || aVar.b() == null) {
            return;
        }
        this.b.b().f().cleanOrRestoreImages(true);
    }

    @Override // com.taobao.android.weex_framework.ui.h
    public void n() {
        io.unicorn.embedding.android.a aVar = this.b;
        if (aVar == null || aVar.b() == null) {
            return;
        }
        this.b.b().f().cleanOrRestoreImages(false);
    }

    @Override // com.taobao.android.weex_framework.ui.h
    public void o() {
        io.unicorn.embedding.android.a aVar = this.b;
        if (aVar != null) {
            aVar.p();
        }
    }

    @Override // io.unicorn.embedding.android.a.InterfaceC1057a
    public void onFlutterUiDisplayed() {
        Activity activity = getActivity();
        if (activity instanceof io.unicorn.embedding.engine.renderer.b) {
            ((io.unicorn.embedding.engine.renderer.b) activity).a();
        }
        for (tbq tbqVar : this.g) {
            tbqVar.a();
        }
    }

    @Override // io.unicorn.embedding.android.a.InterfaceC1057a
    public void onFlutterUiNoLongerDisplayed() {
        Activity activity = getActivity();
        if (activity instanceof io.unicorn.embedding.engine.renderer.b) {
            ((io.unicorn.embedding.engine.renderer.b) activity).b();
        }
        for (tbq tbqVar : this.g) {
            tbqVar.b();
        }
    }

    @Override // com.taobao.android.weex_framework.ui.h
    public void p() {
        io.unicorn.embedding.android.a aVar = this.b;
        if (aVar != null) {
            aVar.q();
        }
    }

    @Override // io.unicorn.embedding.android.a.InterfaceC1057a, io.unicorn.embedding.android.c
    public io.unicorn.embedding.engine.a provideFlutterEngine(Context context) {
        Activity activity = getActivity();
        if (activity instanceof c) {
            rtd.a("UnicornComponent", "Deferring to attached Activity to provide a FlutterEngine.");
            return ((c) activity).provideFlutterEngine(getContext());
        }
        return null;
    }

    @Override // io.unicorn.embedding.android.a.InterfaceC1057a, io.unicorn.embedding.android.g
    public f provideSplashScreen() {
        Activity activity = getActivity();
        if (activity instanceof g) {
            return ((g) activity).provideSplashScreen();
        }
        f fVar = this.d;
        if (fVar == null) {
            return null;
        }
        return fVar;
    }

    @Override // com.taobao.android.weex_framework.ui.h
    public void q() {
        io.unicorn.embedding.android.a aVar = this.b;
        if (aVar == null || aVar.b() == null || RenderMode.image == getRenderMode()) {
            return;
        }
        this.b.b().f().invalidGlContext();
    }

    @Override // com.taobao.android.weex_framework.ui.h
    public void r() {
        io.unicorn.embedding.android.a aVar = this.b;
        if (aVar != null) {
            aVar.r();
        }
    }

    @Override // io.unicorn.embedding.android.a.InterfaceC1057a
    public boolean shouldAttachEngineToActivity() {
        return x().getBoolean("should_attach_engine_to_activity");
    }

    @Override // io.unicorn.embedding.android.a.InterfaceC1057a
    public boolean shouldDestroyEngineWithHost() {
        boolean z = x().getBoolean("destroy_engine_with_fragment", false);
        return (getCachedEngineId() != null || this.b.c()) ? z : x().getBoolean("destroy_engine_with_fragment", true);
    }

    @Override // com.taobao.android.weex_framework.ui.h
    public void t() {
        io.unicorn.embedding.android.a aVar = this.b;
        if (aVar == null || aVar.b() == null) {
            return;
        }
        this.b.b().i().a();
    }

    @Override // com.taobao.android.weex_framework.ui.h
    public void u() {
        io.unicorn.embedding.android.a aVar = this.b;
        if (aVar == null || aVar.b() == null) {
            return;
        }
        this.b.b().i().b();
    }

    @Override // com.taobao.android.weex_framework.ui.h
    public void v() {
        io.unicorn.embedding.android.a aVar = this.b;
        if (aVar != null) {
            aVar.m();
        }
    }

    @Override // com.taobao.android.weex_framework.ui.h
    public void w() {
        io.unicorn.embedding.android.a aVar = this.b;
        if (aVar != null) {
            aVar.n();
        }
    }

    public Bundle x() {
        return this.c;
    }
}
