package io.unicorn.embedding.android;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Handler;
import android.view.Surface;
import com.taobao.android.weex_framework.common.SurfaceTextureWrapper;
import com.taobao.android.weex_framework.ui.h;
import tb.kge;

/* loaded from: classes9.dex */
public class i implements io.unicorn.embedding.engine.renderer.c {

    /* renamed from: a  reason: collision with root package name */
    private io.unicorn.embedding.engine.renderer.a f24823a;
    private SurfaceTextureWrapper b;
    private SurfaceTexture c;
    private Surface d;
    private int e;
    private int f;
    private boolean g;
    private boolean h;
    private h.c i;
    private final SurfaceTexture.OnFrameAvailableListener j;
    private final Runnable k;

    static {
        kge.a(1838474382);
        kge.a(1542522400);
    }

    public i(Context context) {
        this(context, 1, 1);
    }

    public i(Context context, int i, int i2) {
        this.g = false;
        this.h = false;
        this.j = new SurfaceTexture.OnFrameAvailableListener() { // from class: io.unicorn.embedding.android.i.1
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public void onFrameAvailable(SurfaceTexture surfaceTexture) {
                if (i.this.h || i.this.i == null) {
                    return;
                }
                h.c unused = i.this.i;
                SurfaceTextureWrapper unused2 = i.this.b;
            }
        };
        this.k = new Runnable() { // from class: io.unicorn.embedding.android.i.2
            @Override // java.lang.Runnable
            public void run() {
            }
        };
        this.e = i;
        this.f = i2;
    }

    private void d() {
        int i;
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.detachFromGLContext();
        if (Build.VERSION.SDK_INT >= 21) {
            surfaceTexture.setOnFrameAvailableListener(this.j, new Handler());
        } else {
            surfaceTexture.setOnFrameAvailableListener(this.j);
        }
        int i2 = this.e;
        if (i2 > 0 && (i = this.f) > 0) {
            surfaceTexture.setDefaultBufferSize(i2, i);
        }
        this.c = surfaceTexture;
        this.b = new SurfaceTextureWrapper(surfaceTexture, this.k);
    }

    public SurfaceTexture a() {
        return this.b.surfaceTexture();
    }

    @Override // io.unicorn.embedding.engine.renderer.c
    public void attachToRenderer(io.unicorn.embedding.engine.renderer.a aVar) {
        this.f24823a = aVar;
        this.g = true;
        if (this.c == null) {
            d();
        }
        Surface surface = this.d;
        if (surface != null) {
            surface.release();
        }
        this.d = new Surface(a());
        this.f24823a.a(this.d);
    }

    public void b() {
        if (this.h) {
            return;
        }
        SurfaceTextureWrapper surfaceTextureWrapper = this.b;
        if (surfaceTextureWrapper != null) {
            surfaceTextureWrapper.release();
            this.b = null;
            this.c = null;
        }
        this.h = true;
    }

    public void c() {
        Surface surface = this.d;
        if (surface != null) {
            surface.release();
            this.d = null;
        }
    }

    @Override // io.unicorn.embedding.engine.renderer.c
    public void detachFromRenderer() {
        if (!this.g) {
            return;
        }
        io.unicorn.embedding.engine.renderer.a aVar = this.f24823a;
        if (aVar != null) {
            aVar.c();
            this.f24823a = null;
        }
        c();
        this.g = false;
    }

    @Override // io.unicorn.embedding.engine.renderer.c
    public io.unicorn.embedding.engine.renderer.a getAttachedRenderer() {
        return this.f24823a;
    }

    @Override // io.unicorn.embedding.engine.renderer.c
    public void invalid() {
    }

    @Override // io.unicorn.embedding.engine.renderer.c
    public void pause() {
    }

    @Override // io.unicorn.embedding.engine.renderer.c
    public void valid() {
    }
}
