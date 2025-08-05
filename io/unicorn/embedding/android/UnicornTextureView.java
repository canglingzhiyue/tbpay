package io.unicorn.embedding.android;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;
import io.unicorn.embedding.engine.FlutterJNI;
import tb.kge;
import tb.rtd;

/* loaded from: classes9.dex */
public class UnicornTextureView extends TextureView implements io.unicorn.embedding.engine.renderer.c {
    private static final String TAG = "FlutterTextureView";
    private io.unicorn.embedding.engine.renderer.a flutterRenderer;
    private boolean isAttachedToFlutterRenderer;
    private boolean isSurfaceAvailableForRendering;
    private final FlutterJNI.c mUpdateListener;
    private Surface renderSurface;
    private boolean renderTransparently;
    private final TextureView.SurfaceTextureListener surfaceTextureListener;

    static {
        kge.a(1489410432);
        kge.a(1542522400);
    }

    public UnicornTextureView(Context context) {
        this(context, false);
    }

    public UnicornTextureView(Context context, boolean z) {
        super(context);
        this.isSurfaceAvailableForRendering = false;
        this.isAttachedToFlutterRenderer = false;
        this.surfaceTextureListener = new TextureView.SurfaceTextureListener() { // from class: io.unicorn.embedding.android.UnicornTextureView.1
            @Override // android.view.TextureView.SurfaceTextureListener
            public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
                rtd.a(UnicornTextureView.TAG, "SurfaceTextureListener.onSurfaceTextureAvailable()");
                UnicornTextureView.this.isSurfaceAvailableForRendering = true;
                if (UnicornTextureView.this.isAttachedToFlutterRenderer) {
                    UnicornTextureView.this.connectSurfaceToRenderer();
                }
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                rtd.a(UnicornTextureView.TAG, "SurfaceTextureListener.onSurfaceTextureDestroyed()");
                UnicornTextureView.this.isSurfaceAvailableForRendering = false;
                if (UnicornTextureView.this.isAttachedToFlutterRenderer) {
                    UnicornTextureView.this.disconnectSurfaceFromRenderer();
                    return true;
                }
                return true;
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
                rtd.a(UnicornTextureView.TAG, "SurfaceTextureListener.onSurfaceTextureSizeChanged()");
                if (UnicornTextureView.this.isAttachedToFlutterRenderer) {
                    UnicornTextureView.this.changeSurfaceSize(i, i2);
                }
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            }
        };
        this.mUpdateListener = new FlutterJNI.c() { // from class: io.unicorn.embedding.android.UnicornTextureView.2
            @Override // io.unicorn.embedding.engine.FlutterJNI.c
            public void a() {
                if (!UnicornTextureView.this.isAttachedToFlutterRenderer) {
                    return;
                }
                boolean isOpaque = UnicornTextureView.this.isOpaque();
                UnicornTextureView.this.setOpaque(!isOpaque);
                UnicornTextureView.this.setOpaque(isOpaque);
            }
        };
        this.renderTransparently = z;
        init();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void changeSurfaceSize(int i, int i2) {
        if (this.flutterRenderer != null) {
            rtd.a(TAG, "Notifying FlutterRenderer that Android surface size has changed to " + i + " x " + i2);
            this.flutterRenderer.a(i, i2);
            return;
        }
        throw new IllegalStateException("changeSurfaceSize() should only be called when flutterRenderer is non-null.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void connectSurfaceToRenderer() {
        if (this.flutterRenderer == null || getSurfaceTexture() == null) {
            throw new IllegalStateException("connectSurfaceToRenderer() should only be called when flutterRenderer and getSurfaceTexture() are non-null.");
        }
        this.renderSurface = new Surface(getSurfaceTexture());
        this.flutterRenderer.b(this.renderSurface, com.taobao.android.weex_framework.util.f.r());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void disconnectSurfaceFromRenderer() {
        io.unicorn.embedding.engine.renderer.a aVar = this.flutterRenderer;
        if (aVar != null) {
            aVar.c();
            Surface surface = this.renderSurface;
            if (surface == null) {
                return;
            }
            surface.release();
            this.renderSurface = null;
            return;
        }
        throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
    }

    private void init() {
        setSurfaceTextureListener(this.surfaceTextureListener);
        if (this.renderTransparently) {
            setOpaque(false);
        }
    }

    @Override // io.unicorn.embedding.engine.renderer.c
    public void attachToRenderer(io.unicorn.embedding.engine.renderer.a aVar) {
        rtd.a(TAG, "Attaching to FlutterRenderer.");
        if (this.flutterRenderer != null) {
            rtd.a(TAG, "Already connected to a FlutterRenderer. Detaching from old one and attaching to new one.");
            this.flutterRenderer.c();
        }
        this.flutterRenderer = aVar;
        this.flutterRenderer.a(this.mUpdateListener);
        this.isAttachedToFlutterRenderer = true;
        if (this.isSurfaceAvailableForRendering) {
            rtd.a(TAG, "Surface is available for rendering. Connecting FlutterRenderer to Android surface.");
            connectSurfaceToRenderer();
        }
    }

    @Override // io.unicorn.embedding.engine.renderer.c
    public void detachFromRenderer() {
        if (this.flutterRenderer == null) {
            rtd.d(TAG, "detachFromRenderer() invoked when no FlutterRenderer was attached.");
            return;
        }
        if (getWindowToken() != null) {
            rtd.a(TAG, "Disconnecting FlutterRenderer from Android surface.");
            disconnectSurfaceFromRenderer();
        }
        this.flutterRenderer.a((FlutterJNI.c) null);
        this.flutterRenderer = null;
        this.isAttachedToFlutterRenderer = false;
    }

    @Override // io.unicorn.embedding.engine.renderer.c
    public io.unicorn.embedding.engine.renderer.a getAttachedRenderer() {
        return this.flutterRenderer;
    }

    @Override // io.unicorn.embedding.engine.renderer.c
    public void invalid() {
        if (this.isAttachedToFlutterRenderer) {
            disconnectSurfaceFromRenderer();
        }
    }

    @Override // io.unicorn.embedding.engine.renderer.c
    public void pause() {
        if (this.flutterRenderer == null) {
            rtd.d(TAG, "pause() invoked when no FlutterRenderer was attached.");
            return;
        }
        this.flutterRenderer = null;
        this.isAttachedToFlutterRenderer = false;
    }

    @Override // io.unicorn.embedding.engine.renderer.c
    public void valid() {
        if (this.isAttachedToFlutterRenderer) {
            connectSurfaceToRenderer();
        }
    }
}
