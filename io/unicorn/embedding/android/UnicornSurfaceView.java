package io.unicorn.embedding.android;

import android.content.Context;
import android.graphics.Region;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import tb.kge;
import tb.rtd;

/* loaded from: classes9.dex */
public class UnicornSurfaceView extends SurfaceView implements io.unicorn.embedding.engine.renderer.c {
    private static final String TAG = "FlutterSurfaceView";
    private io.unicorn.embedding.engine.renderer.a flutterRenderer;
    private final io.unicorn.embedding.engine.renderer.b flutterUiDisplayListener;
    private boolean isAttachedToFlutterRenderer;
    private boolean isSurfaceAvailableForRendering;
    private final boolean renderTransparently;
    private final SurfaceHolder.Callback surfaceCallback;

    static {
        kge.a(-1527212014);
        kge.a(1542522400);
    }

    public UnicornSurfaceView(Context context) {
        this(context, null, false);
    }

    public UnicornSurfaceView(Context context, AttributeSet attributeSet, boolean z) {
        super(context, attributeSet);
        this.isSurfaceAvailableForRendering = false;
        this.isAttachedToFlutterRenderer = false;
        this.surfaceCallback = new SurfaceHolder.Callback() { // from class: io.unicorn.embedding.android.UnicornSurfaceView.1
            @Override // android.view.SurfaceHolder.Callback
            public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
                rtd.a(UnicornSurfaceView.TAG, "SurfaceHolder.Callback.surfaceChanged()");
                if (UnicornSurfaceView.this.isAttachedToFlutterRenderer) {
                    UnicornSurfaceView.this.changeSurfaceSize(i2, i3);
                }
            }

            @Override // android.view.SurfaceHolder.Callback
            public void surfaceCreated(SurfaceHolder surfaceHolder) {
                rtd.a(UnicornSurfaceView.TAG, "SurfaceHolder.Callback.startRenderingToSurface()");
                UnicornSurfaceView.this.isSurfaceAvailableForRendering = true;
                if (UnicornSurfaceView.this.isAttachedToFlutterRenderer) {
                    UnicornSurfaceView.this.connectSurfaceToRenderer();
                }
            }

            @Override // android.view.SurfaceHolder.Callback
            public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
                rtd.a(UnicornSurfaceView.TAG, "SurfaceHolder.Callback.stopRenderingToSurface()");
                UnicornSurfaceView.this.isSurfaceAvailableForRendering = false;
                if (UnicornSurfaceView.this.isAttachedToFlutterRenderer) {
                    UnicornSurfaceView.this.disconnectSurfaceFromRenderer();
                }
            }
        };
        this.flutterUiDisplayListener = new io.unicorn.embedding.engine.renderer.b() { // from class: io.unicorn.embedding.android.UnicornSurfaceView.2
            @Override // io.unicorn.embedding.engine.renderer.b
            public void a() {
                rtd.a(UnicornSurfaceView.TAG, "onFlutterUiDisplayed()");
                UnicornSurfaceView.this.setAlpha(1.0f);
                if (UnicornSurfaceView.this.flutterRenderer != null) {
                    UnicornSurfaceView.this.flutterRenderer.b(this);
                }
            }

            @Override // io.unicorn.embedding.engine.renderer.b
            public void b() {
            }
        };
        this.renderTransparently = z;
        init();
    }

    public UnicornSurfaceView(Context context, boolean z) {
        this(context, null, z);
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
        if (this.flutterRenderer == null || getHolder() == null) {
            throw new IllegalStateException("connectSurfaceToRenderer() should only be called when flutterRenderer and getHolder() are non-null.");
        }
        this.flutterRenderer.a(getHolder().getSurface());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void disconnectSurfaceFromRenderer() {
        io.unicorn.embedding.engine.renderer.a aVar = this.flutterRenderer;
        if (aVar != null) {
            aVar.c();
            return;
        }
        throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
    }

    private void init() {
        if (this.renderTransparently) {
            getHolder().setFormat(-2);
            setZOrderOnTop(true);
        }
        getHolder().addCallback(this.surfaceCallback);
        setAlpha(0.0f);
    }

    public static void preloadClass() {
    }

    @Override // io.unicorn.embedding.engine.renderer.c
    public void attachToRenderer(io.unicorn.embedding.engine.renderer.a aVar) {
        rtd.a(TAG, "Attaching to FlutterRenderer.");
        if (this.flutterRenderer != null) {
            rtd.a(TAG, "Already connected to a FlutterRenderer. Detaching from old one and attaching to new one.");
            this.flutterRenderer.c();
            this.flutterRenderer.b(this.flutterUiDisplayListener);
        }
        this.flutterRenderer = aVar;
        this.isAttachedToFlutterRenderer = true;
        this.flutterRenderer.a(this.flutterUiDisplayListener);
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
        setAlpha(0.0f);
        this.flutterRenderer.b(this.flutterUiDisplayListener);
        this.flutterRenderer = null;
        this.isAttachedToFlutterRenderer = false;
    }

    @Override // android.view.SurfaceView, android.view.View
    public boolean gatherTransparentRegion(Region region) {
        if (getAlpha() < 1.0f) {
            return false;
        }
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        region.op(iArr[0], iArr[1], (iArr[0] + getRight()) - getLeft(), (iArr[1] + getBottom()) - getTop(), Region.Op.DIFFERENCE);
        return true;
    }

    @Override // io.unicorn.embedding.engine.renderer.c
    public io.unicorn.embedding.engine.renderer.a getAttachedRenderer() {
        return this.flutterRenderer;
    }

    public boolean getRenderTransparently() {
        return this.renderTransparently;
    }

    @Override // io.unicorn.embedding.engine.renderer.c
    public void invalid() {
        if (this.isAttachedToFlutterRenderer) {
            disconnectSurfaceFromRenderer();
            setAlpha(0.0f);
        }
    }

    @Override // io.unicorn.embedding.engine.renderer.c
    public void pause() {
        io.unicorn.embedding.engine.renderer.a aVar = this.flutterRenderer;
        if (aVar == null) {
            rtd.d(TAG, "pause() invoked when no FlutterRenderer was attached.");
            return;
        }
        aVar.b(this.flutterUiDisplayListener);
        this.flutterRenderer = null;
        this.isAttachedToFlutterRenderer = false;
    }

    @Override // io.unicorn.embedding.engine.renderer.c
    public void valid() {
        if (this.isAttachedToFlutterRenderer) {
            setAlpha(1.0f);
            connectSurfaceToRenderer();
        }
    }
}
