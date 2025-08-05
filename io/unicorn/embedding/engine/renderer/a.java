package io.unicorn.embedding.engine.renderer;

import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Handler;
import android.view.Surface;
import io.unicorn.embedding.engine.FlutterJNI;
import io.unicorn.view.a;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicLong;
import tb.kge;
import tb.rtd;

/* loaded from: classes9.dex */
public class a implements io.unicorn.view.a {

    /* renamed from: a  reason: collision with root package name */
    private final FlutterJNI f24835a;
    private Surface c;
    private final AtomicLong b = new AtomicLong(0);
    private boolean d = false;
    private Handler e = new Handler();
    private final io.unicorn.embedding.engine.renderer.b f = new d(this);

    /* renamed from: io.unicorn.embedding.engine.renderer.a$a  reason: collision with other inner class name */
    /* loaded from: classes9.dex */
    static final class RunnableC1059a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final long f24836a;
        private final FlutterJNI b;

        static {
            kge.a(-1822482649);
            kge.a(-1390502639);
        }

        RunnableC1059a(long j, FlutterJNI flutterJNI) {
            this.f24836a = j;
            this.b = flutterJNI;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!this.b.isAttached()) {
                return;
            }
            rtd.a("FlutterRenderer", "Releasing a SurfaceTexture (" + this.f24836a + ").");
            this.b.unregisterTexture(this.f24836a);
        }
    }

    /* loaded from: classes9.dex */
    final class b implements a.b {
        private final long b;
        private final SurfaceTextureWrapper c;
        private boolean d;
        private a.InterfaceC1064a e;
        private final Runnable f = new Runnable() { // from class: io.unicorn.embedding.engine.renderer.a.b.1
            @Override // java.lang.Runnable
            public void run() {
                if (b.this.e != null) {
                    b.this.e.a();
                }
            }
        };
        private SurfaceTexture.OnFrameAvailableListener g = new SurfaceTexture.OnFrameAvailableListener() { // from class: io.unicorn.embedding.engine.renderer.a.b.2
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public void onFrameAvailable(SurfaceTexture surfaceTexture) {
                if (b.this.d || !a.this.f24835a.isAttached()) {
                    return;
                }
                a.this.a(b.this.b);
            }
        };

        static {
            kge.a(140932363);
            kge.a(1787749358);
        }

        b(long j, SurfaceTexture surfaceTexture) {
            this.b = j;
            this.c = new SurfaceTextureWrapper(surfaceTexture, this.f);
            if (Build.VERSION.SDK_INT >= 21) {
                b().setOnFrameAvailableListener(this.g, new Handler());
            } else {
                b().setOnFrameAvailableListener(this.g);
            }
        }

        public SurfaceTextureWrapper a() {
            return this.c;
        }

        @Override // io.unicorn.view.a.b
        public void a(a.InterfaceC1064a interfaceC1064a) {
            this.e = interfaceC1064a;
        }

        @Override // io.unicorn.view.a.b
        public SurfaceTexture b() {
            return this.c.surfaceTexture();
        }

        @Override // io.unicorn.view.a.b
        public long c() {
            return this.b;
        }

        @Override // io.unicorn.view.a.b
        public void d() {
            if (this.d) {
                return;
            }
            rtd.a("FlutterRenderer", "Releasing a SurfaceTexture (" + this.b + ").");
            this.c.release();
            a.this.b(this.b);
            this.d = true;
        }

        protected void finalize() throws Throwable {
            try {
                if (this.d) {
                    return;
                }
                a.this.e.post(new RunnableC1059a(this.b, a.this.f24835a));
            } finally {
                super.finalize();
            }
        }
    }

    /* loaded from: classes9.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public float f24840a = 1.0f;
        public int b = 0;
        public int c = 0;
        public int d = 0;
        public int e = 0;
        public int f = 0;
        public int g = 0;
        public int h = 0;
        public int i = 0;
        public int j = 0;
        public int k = 0;
        public int l = 0;
        public int m = 0;
        public int n = 0;
        public int o = 0;
        public int p = 0;
        public int q = 0;

        static {
            kge.a(-1403955423);
        }
    }

    /* loaded from: classes9.dex */
    private static class d implements io.unicorn.embedding.engine.renderer.b {

        /* renamed from: a  reason: collision with root package name */
        private final a f24841a;

        static {
            kge.a(1595914626);
            kge.a(1384242717);
        }

        public d(a aVar) {
            this.f24841a = aVar;
        }

        public static void c() {
        }

        @Override // io.unicorn.embedding.engine.renderer.b
        public void a() {
            this.f24841a.d = true;
        }

        @Override // io.unicorn.embedding.engine.renderer.b
        public void b() {
            this.f24841a.d = false;
        }
    }

    static {
        kge.a(-1953742168);
        kge.a(413222990);
    }

    public a(FlutterJNI flutterJNI) {
        this.f24835a = flutterJNI;
        this.f24835a.addIsDisplayingFlutterUiListener(this.f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(long j) {
        this.f24835a.markTextureFrameAvailable(j);
    }

    private void a(long j, SurfaceTextureWrapper surfaceTextureWrapper) {
        this.f24835a.registerTexture(j, surfaceTextureWrapper);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(long j) {
        this.f24835a.unregisterTexture(j);
    }

    public static void f() {
        d.c();
    }

    public void a(int i, int i2) {
        if (this.c == null) {
            return;
        }
        this.f24835a.onSurfaceChanged(i, i2);
    }

    public void a(Surface surface) {
        b(surface, false);
    }

    public void a(Surface surface, boolean z) {
        this.c = surface;
        this.f24835a.onSurfaceWindowChanged(surface, z);
    }

    public void a(FlutterJNI.c cVar) {
        this.f24835a.setOnFrameAvailableListener(cVar);
    }

    public void a(c cVar) {
        rtd.a("FlutterRenderer", "Setting viewport metrics\nSize: " + cVar.b + " x " + cVar.c + "\nScreen:" + cVar.p + " x " + cVar.q + "\nPadding - L: " + cVar.g + ", T: " + cVar.d + ", R: " + cVar.e + ", B: " + cVar.f + "\nInsets - L: " + cVar.k + ", T: " + cVar.h + ", R: " + cVar.i + ", B: " + cVar.j + "\nSystem Gesture Insets - L: " + cVar.o + ", T: " + cVar.l + ", R: " + cVar.m + ", B: " + cVar.j);
        this.f24835a.setViewportMetrics(cVar.f24840a, cVar.b, cVar.c, cVar.d, cVar.e, cVar.f, cVar.g, cVar.h, cVar.i, cVar.j, cVar.k, cVar.l, cVar.m, cVar.n, cVar.o, cVar.p, cVar.q);
    }

    public void a(io.unicorn.embedding.engine.renderer.b bVar) {
        this.f24835a.addIsDisplayingFlutterUiListener(bVar);
        if (this.d) {
            bVar.a();
        }
    }

    public void a(ByteBuffer byteBuffer, int i) {
        this.f24835a.dispatchPointerDataPacket(byteBuffer, i);
    }

    public void a(boolean z) {
        this.f24835a.setSemanticsEnabled(z);
    }

    public boolean a() {
        return this.d;
    }

    @Override // io.unicorn.view.a
    public a.b b() {
        rtd.a("FlutterRenderer", "Creating a SurfaceTexture.");
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.detachFromGLContext();
        b bVar = new b(this.b.getAndIncrement(), surfaceTexture);
        rtd.a("FlutterRenderer", "New SurfaceTexture ID: " + bVar.c());
        a(bVar.c(), bVar.a());
        return bVar;
    }

    public void b(Surface surface) {
        a(surface, false);
    }

    public void b(Surface surface, boolean z) {
        if (this.c != null) {
            c();
        }
        this.c = surface;
        this.f24835a.onSurfaceCreated(surface, z);
    }

    public void b(io.unicorn.embedding.engine.renderer.b bVar) {
        this.f24835a.removeIsDisplayingFlutterUiListener(bVar);
    }

    public void c() {
        if (this.c == null) {
            return;
        }
        this.f24835a.onSurfaceDestroyed();
        this.c = null;
        if (this.d) {
            this.f.b();
        }
        this.d = false;
    }

    public void d() {
        this.d = false;
    }
}
