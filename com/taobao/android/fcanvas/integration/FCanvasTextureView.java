package com.taobao.android.fcanvas.integration;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.WindowInsets;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fcanvas.integration.FCanvasInstance;
import com.taobao.android.fcanvas.integration.d;
import tb.kge;
import tb.riy;

/* loaded from: classes5.dex */
public class FCanvasTextureView extends TextureView implements d {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean isAttachedToFCanvasRenderer;
    private boolean isSurfaceAvailableForRendering;
    private c mFCanvasRenderer;
    private final FCanvas mHost;
    private d.a mLifecycleListener;
    private FCanvasInstance.RenderType mRenderType;
    private final e mViewportMetrics;
    private final TextureView.SurfaceTextureListener surfaceTextureListener;

    static {
        kge.a(1579761121);
        kge.a(1070618392);
    }

    public static /* synthetic */ Object ipc$super(FCanvasTextureView fCanvasTextureView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode != 880921750) {
            if (hashCode != 1389530587) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }
            super.onSizeChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
            return null;
        }
        return super.onApplyWindowInsets((WindowInsets) objArr[0]);
    }

    @Override // com.taobao.android.fcanvas.integration.d
    public View getCanvasView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("260878dc", new Object[]{this}) : this;
    }

    public static /* synthetic */ FCanvas access$000(FCanvasTextureView fCanvasTextureView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FCanvas) ipChange.ipc$dispatch("312a281d", new Object[]{fCanvasTextureView}) : fCanvasTextureView.mHost;
    }

    public static /* synthetic */ FCanvasInstance.RenderType access$100(FCanvasTextureView fCanvasTextureView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FCanvasInstance.RenderType) ipChange.ipc$dispatch("6c636bf9", new Object[]{fCanvasTextureView}) : fCanvasTextureView.mRenderType;
    }

    public static /* synthetic */ boolean access$202(FCanvasTextureView fCanvasTextureView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("49aff053", new Object[]{fCanvasTextureView, new Boolean(z)})).booleanValue();
        }
        fCanvasTextureView.isSurfaceAvailableForRendering = z;
        return z;
    }

    public static /* synthetic */ boolean access$300(FCanvasTextureView fCanvasTextureView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("473278a", new Object[]{fCanvasTextureView})).booleanValue() : fCanvasTextureView.isAttachedToFCanvasRenderer;
    }

    public static /* synthetic */ void access$400(FCanvasTextureView fCanvasTextureView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ea2afa5", new Object[]{fCanvasTextureView});
        } else {
            fCanvasTextureView.connectSurfaceToRenderer();
        }
    }

    public static /* synthetic */ d.a access$500(FCanvasTextureView fCanvasTextureView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d.a) ipChange.ipc$dispatch("c397f21f", new Object[]{fCanvasTextureView}) : fCanvasTextureView.mLifecycleListener;
    }

    public static /* synthetic */ void access$600(FCanvasTextureView fCanvasTextureView, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("899fb383", new Object[]{fCanvasTextureView, new Integer(i), new Integer(i2)});
        } else {
            fCanvasTextureView.changeSurfaceSize(i, i2);
        }
    }

    public static /* synthetic */ void access$700(FCanvasTextureView fCanvasTextureView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad314802", new Object[]{fCanvasTextureView});
        } else {
            fCanvasTextureView.disconnectSurfaceFromRenderer();
        }
    }

    public FCanvasTextureView(Context context, FCanvas fCanvas, FCanvasInstance.RenderType renderType) {
        this(context, fCanvas, null, renderType);
    }

    public FCanvasTextureView(Context context, FCanvas fCanvas, AttributeSet attributeSet, FCanvasInstance.RenderType renderType) {
        super(context, attributeSet);
        this.isSurfaceAvailableForRendering = false;
        this.isAttachedToFCanvasRenderer = false;
        this.mViewportMetrics = new e();
        this.surfaceTextureListener = new TextureView.SurfaceTextureListener() { // from class: com.taobao.android.fcanvas.integration.FCanvasTextureView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.TextureView.SurfaceTextureListener
            public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("1cbd3ac", new Object[]{this, surfaceTexture, new Integer(i), new Integer(i2)});
                    return;
                }
                if (FCanvasTextureView.access$000(FCanvasTextureView.this) != null) {
                    FCanvas access$000 = FCanvasTextureView.access$000(FCanvasTextureView.this);
                    access$000.printLog(0, riy.ARRAY_START_STR + FCanvasTextureView.access$100(FCanvasTextureView.this).toString() + "] SurfaceTextureListener.onSurfaceTextureAvailable()", null);
                }
                FCanvasTextureView.access$202(FCanvasTextureView.this, true);
                if (FCanvasTextureView.access$300(FCanvasTextureView.this)) {
                    FCanvasTextureView.access$400(FCanvasTextureView.this);
                }
                if (FCanvasTextureView.access$500(FCanvasTextureView.this) == null) {
                    return;
                }
                FCanvasTextureView.access$500(FCanvasTextureView.this).a();
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("83525c82", new Object[]{this, surfaceTexture, new Integer(i), new Integer(i2)});
                    return;
                }
                if (FCanvasTextureView.access$000(FCanvasTextureView.this) != null) {
                    FCanvas access$000 = FCanvasTextureView.access$000(FCanvasTextureView.this);
                    access$000.printLog(0, riy.ARRAY_START_STR + FCanvasTextureView.access$100(FCanvasTextureView.this).toString() + "] SurfaceTextureListener.onSurfaceTextureSizeChanged()", null);
                }
                if (!FCanvasTextureView.access$300(FCanvasTextureView.this)) {
                    return;
                }
                FCanvasTextureView.access$600(FCanvasTextureView.this, i, i2);
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("b3157eda", new Object[]{this, surfaceTexture});
                } else {
                    FCanvasTextureView.this.postInvalidate();
                }
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("177b9d00", new Object[]{this, surfaceTexture})).booleanValue();
                }
                if (FCanvasTextureView.access$500(FCanvasTextureView.this) != null) {
                    FCanvasTextureView.access$500(FCanvasTextureView.this).b();
                }
                if (FCanvasTextureView.access$000(FCanvasTextureView.this) != null) {
                    FCanvas access$000 = FCanvasTextureView.access$000(FCanvasTextureView.this);
                    access$000.printLog(0, riy.ARRAY_START_STR + FCanvasTextureView.access$100(FCanvasTextureView.this).toString() + "] SurfaceTextureListener.onSurfaceTextureDestroyed()", null);
                }
                FCanvasTextureView.access$202(FCanvasTextureView.this, false);
                if (FCanvasTextureView.access$300(FCanvasTextureView.this)) {
                    FCanvasTextureView.access$700(FCanvasTextureView.this);
                }
                return true;
            }
        };
        this.mRenderType = renderType;
        this.mHost = fCanvas;
        init();
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        } else {
            setSurfaceTextureListener(this.surfaceTextureListener);
        }
    }

    @Override // android.view.TextureView, android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52d28ddb", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onSizeChanged(i, i2, i3, i4);
        e eVar = this.mViewportMetrics;
        eVar.b = i;
        eVar.c = i2;
        eVar.f12330a = getResources().getDisplayMetrics().density;
        c cVar = this.mFCanvasRenderer;
        if (cVar == null) {
            return;
        }
        cVar.a(this.mViewportMetrics);
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WindowInsets) ipChange.ipc$dispatch("3481cc96", new Object[]{this, windowInsets}) : super.onApplyWindowInsets(windowInsets);
    }

    public c getAttachedRenderer() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("3583471d", new Object[]{this}) : this.mFCanvasRenderer;
    }

    @Override // com.taobao.android.fcanvas.integration.d
    public void attachToRenderer(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53bf0795", new Object[]{this, cVar});
            return;
        }
        FCanvas fCanvas = this.mHost;
        if (fCanvas != null) {
            fCanvas.printLog(0, "Attaching to FCanvasRenderer.", null);
        }
        if (this.mFCanvasRenderer != null) {
            FCanvas fCanvas2 = this.mHost;
            if (fCanvas2 != null) {
                fCanvas2.printLog(0, "Already connected to a FlutterRenderer. Detaching from old one and attaching to new one.", null);
            }
            this.mFCanvasRenderer.a(this.mRenderType);
        }
        this.mFCanvasRenderer = cVar;
        this.isAttachedToFCanvasRenderer = true;
        if (!this.isSurfaceAvailableForRendering) {
            return;
        }
        FCanvas fCanvas3 = this.mHost;
        if (fCanvas3 != null) {
            fCanvas3.printLog(0, riy.ARRAY_START_STR + this.mRenderType.toString() + "] Surface is available for rendering. Connecting FCanvasRenderer to Android surface.", null);
        }
        connectSurfaceToRenderer();
    }

    @Override // com.taobao.android.fcanvas.integration.d
    public void detachFromRenderer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3f0be47", new Object[]{this});
        } else if (this.mFCanvasRenderer != null) {
            FCanvas fCanvas = this.mHost;
            if (fCanvas != null) {
                fCanvas.printLog(0, riy.ARRAY_START_STR + this.mRenderType.toString() + "] Disconnecting FCanvasRenderer from Android surface.", null);
            }
            disconnectSurfaceFromRenderer();
            this.mFCanvasRenderer = null;
            this.isAttachedToFCanvasRenderer = false;
        } else {
            FCanvas fCanvas2 = this.mHost;
            if (fCanvas2 == null) {
                return;
            }
            fCanvas2.printLog(0, riy.ARRAY_START_STR + this.mRenderType.toString() + "] detachFromRenderer() invoked when no FCanvasRenderer was attached.", null);
        }
    }

    public FCanvasInstance.RenderType getRenderType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FCanvasInstance.RenderType) ipChange.ipc$dispatch("27e69ade", new Object[]{this}) : this.mRenderType;
    }

    @Override // com.taobao.android.fcanvas.integration.d
    public void setLifecycleListener(d.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7822a90", new Object[]{this, aVar});
        } else {
            this.mLifecycleListener = aVar;
        }
    }

    private void connectSurfaceToRenderer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b7c2128", new Object[]{this});
        } else if (this.mFCanvasRenderer == null || getSurfaceTexture() == null) {
            throw new IllegalStateException("connectSurfaceToRenderer() should only be called when flutterRenderer and getSurfaceTexture() are non-null.");
        } else {
            this.mFCanvasRenderer.a(new Surface(getSurfaceTexture()), this.mRenderType);
        }
    }

    private void changeSurfaceSize(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff5b9125", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (this.mFCanvasRenderer == null) {
            throw new IllegalStateException("changeSurfaceSize() should only be called when flutterRenderer is non-null.");
        } else {
            FCanvas fCanvas = this.mHost;
            if (fCanvas != null) {
                fCanvas.printLog(0, "Notifying FCanvasRenderer that Android surface size has changed to " + i + " x " + i2, null);
            }
            this.mFCanvasRenderer.a(i, i2, this.mRenderType);
        }
    }

    private void disconnectSurfaceFromRenderer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71a6af25", new Object[]{this});
            return;
        }
        c cVar = this.mFCanvasRenderer;
        if (cVar == null) {
            throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
        }
        cVar.a(this.mRenderType);
    }
}
