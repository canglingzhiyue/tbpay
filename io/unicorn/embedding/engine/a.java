package io.unicorn.embedding.engine;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import com.taobao.android.weex_framework.m;
import com.taobao.android.weex_framework.util.s;
import io.unicorn.embedding.engine.FlutterJNI;
import io.unicorn.plugin.platform.PlatformViewsController;
import java.util.HashSet;
import java.util.Set;
import tb.kge;
import tb.rtc;
import tb.rtd;
import tb.rtg;
import tb.rti;
import tb.rtk;
import tb.rtl;
import tb.rto;
import tb.rtq;

/* loaded from: classes9.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public static e f24826a;
    private final FlutterJNI b;
    private final io.unicorn.embedding.engine.renderer.a c;
    private rti d;
    private final rtk e;
    private final rto f;
    private final PlatformViewsController g;
    private final rtl h;
    private rtq i;
    private final HashSet<String> j;
    private final Set<InterfaceC1058a> k;
    private final InterfaceC1058a l;
    private FlutterJNI.d m;
    private boolean n;
    private boolean o;

    /* renamed from: io.unicorn.embedding.engine.a$a  reason: collision with other inner class name */
    /* loaded from: classes9.dex */
    public interface InterfaceC1058a {
        void a();

        void b();
    }

    /* loaded from: classes9.dex */
    private static class b implements InterfaceC1058a {

        /* renamed from: a  reason: collision with root package name */
        private final a f24828a;

        static {
            kge.a(1724636033);
            kge.a(1186450881);
        }

        public b(a aVar) {
            this.f24828a = aVar;
        }

        public static void c() {
        }

        @Override // io.unicorn.embedding.engine.a.InterfaceC1058a
        public void a() {
            rtd.a("FlutterEngine", "onPreEngineRestart()");
            for (InterfaceC1058a interfaceC1058a : this.f24828a.k) {
                interfaceC1058a.a();
            }
            this.f24828a.g.f();
        }

        @Override // io.unicorn.embedding.engine.a.InterfaceC1058a
        public void b() {
        }
    }

    /* loaded from: classes9.dex */
    public interface e {
        void a();
    }

    static {
        kge.a(-2082901655);
    }

    public a(Context context) {
        this(context, null, new FlutterJNI(), new PlatformViewsController(), null, null, false);
    }

    public a(Context context, rtg rtgVar, FlutterJNI flutterJNI) {
        this(context, rtgVar, flutterJNI, new PlatformViewsController(), null, null, false);
    }

    public a(Context context, rtg rtgVar, FlutterJNI flutterJNI, PlatformViewsController platformViewsController, String[] strArr, String[] strArr2, boolean z) {
        this.j = new HashSet<>();
        this.k = new HashSet();
        this.l = new b(this);
        this.n = false;
        this.o = false;
        s.a("UnicornExecutorAttach");
        this.d = new rti(flutterJNI);
        this.d.a();
        s.b("UnicornExecutorAttach");
        s.a("createChannel");
        this.e = new rtk(this.d, flutterJNI);
        this.f = new rto(this.d);
        this.h = new rtl(this.d);
        s.b("createChannel");
        s.a("setupFlutterJNI");
        this.b = flutterJNI;
        rtgVar = rtgVar == null ? rtc.a().c() : rtgVar;
        if (!flutterJNI.isAttached()) {
            rtgVar.a(context.getApplicationContext());
            rtgVar.a(context.getApplicationContext(), strArr);
        }
        flutterJNI.addEngineLifecycleListener(this.l);
        flutterJNI.setPlatformViewsController(platformViewsController);
        this.c = new io.unicorn.embedding.engine.renderer.a(flutterJNI);
        this.i = new rtq(this.d, this.c, context);
        this.g = platformViewsController;
        s.b("setupFlutterJNI");
        if (z) {
            return;
        }
        c(context, strArr2);
        this.n = true;
    }

    public a(Context context, boolean z) {
        this(context, null, new FlutterJNI(), new PlatformViewsController(), null, null, z);
    }

    public a(Context context, String[] strArr) {
        this(context, null, new FlutterJNI(), new PlatformViewsController(), strArr, null, false);
    }

    public a(Context context, String[] strArr, String[] strArr2) {
        this(context, null, new FlutterJNI(), new PlatformViewsController(), strArr, strArr2, false);
    }

    private void a(String[] strArr) {
        rtd.a("FlutterEngine", "Attaching to JNI.");
        this.b.attachToNative(strArr);
        if (k()) {
            return;
        }
        throw new RuntimeException("FlutterEngine failed to attach to its native Object reference.");
    }

    public static void b() {
        b.c();
    }

    private void c(Context context, String[] strArr) {
        AssetManager assets;
        if (!this.b.isAttached()) {
            s.a("attachToJni");
            a(strArr);
            s.b("attachToJni");
            if (!m.k()) {
                s.a("createPackageContext");
                assets = context.getAssets();
                s.b("createPackageContext");
            } else {
                try {
                    s.a("createPackageContext");
                    AssetManager assets2 = context.createPackageContext(context.getPackageName(), 0).getAssets();
                    s.b("createPackageContext");
                    assets = assets2;
                } catch (PackageManager.NameNotFoundException unused) {
                    assets = context.getAssets();
                }
            }
            if (assets != null) {
                this.b.setAssetManager(assets);
            }
        }
        s.a("registerBuiltInPlatformViews");
        io.unicorn.plugin.platform.c.a().a(this.g.d(), this.b);
        s.b("registerBuiltInPlatformViews");
    }

    private boolean k() {
        return this.b.isAttached();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a a(Context context, String[] strArr) {
        if (k()) {
            return new a(context, (rtg) null, this.b.spawn(strArr));
        }
        throw new IllegalStateException("Spawn can only be called on a fully constructed FlutterEngine");
    }

    public void a() {
        rtd.a("FlutterEngine", "Destroying.");
        for (InterfaceC1058a interfaceC1058a : this.k) {
            interfaceC1058a.b();
        }
        rtq rtqVar = this.i;
        if (rtqVar != null) {
            rtqVar.a();
        }
        this.g.b();
        this.g.e();
        this.d.b();
        this.b.removeEngineLifecycleListener(this.l);
        this.b.detachFromNativeAndReleaseResources();
    }

    public void a(Context context) {
        this.g.a(context, this.c, this.d);
    }

    public void a(FlutterJNI.d dVar) {
        this.m = dVar;
    }

    public void a(InterfaceC1058a interfaceC1058a) {
        this.k.add(interfaceC1058a);
    }

    public void a(boolean z) {
        this.o = z;
    }

    public void b(final Context context, String[] strArr) {
        this.b.addShellSetupListener(new FlutterJNI.d() { // from class: io.unicorn.embedding.engine.a.1
            @Override // io.unicorn.embedding.engine.FlutterJNI.d
            public void a() {
                AssetManager assets;
                if (!m.k()) {
                    s.a("createPackageContext");
                    assets = context.getAssets();
                    s.b("createPackageContext");
                } else {
                    try {
                        s.a("createPackageContext");
                        assets = context.createPackageContext(context.getPackageName(), 0).getAssets();
                        s.b("createPackageContext");
                    } catch (PackageManager.NameNotFoundException unused) {
                        assets = context.getAssets();
                    }
                }
                if (assets != null) {
                    a.this.b.setAssetManager(assets);
                }
                s.a("registerBuiltInPlatformViews");
                io.unicorn.plugin.platform.c.a().a(a.this.g.d(), a.this.b);
                s.b("registerBuiltInPlatformViews");
                a.this.n = true;
                a.this.m.a();
            }
        });
        if (!this.b.isAttached()) {
            a(strArr);
        }
    }

    public rti d() {
        return this.d;
    }

    public void d(Context context, String[] strArr) {
        this.i = new rtq(this.d, this.c, context);
        this.b.reattachToNative(strArr);
        io.unicorn.plugin.platform.c.a().a(this.g.d(), this.b);
    }

    public io.unicorn.embedding.engine.renderer.a e() {
        return this.c;
    }

    public FlutterJNI f() {
        return this.b;
    }

    public rtk g() {
        return this.e;
    }

    public rto h() {
        return this.f;
    }

    public rtl i() {
        return this.h;
    }

    public PlatformViewsController j() {
        return this.g;
    }

    public void l() {
        for (InterfaceC1058a interfaceC1058a : this.k) {
            interfaceC1058a.b();
        }
        this.k.clear();
        this.i.a();
        this.i = null;
        this.h.d();
        this.g.b();
        this.g.e();
        this.b.detachToNative();
    }

    public boolean m() {
        return this.n;
    }

    public boolean n() {
        return this.o;
    }
}
