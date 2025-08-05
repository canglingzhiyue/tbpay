package com.taobao.android.fcanvas.integration;

import android.content.Context;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.WindowInsets;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fcanvas.integration.FCanvasInstance;
import com.taobao.android.fcanvas.integration.d;
import tb.kge;

/* loaded from: classes5.dex */
public class FCanvasSurfaceView extends SurfaceView implements d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "FCanvas";
    private boolean isAttachedToFCanvasRenderer;
    private boolean isSurfaceAvailableForRendering;
    private boolean keepTransparentBeforeRender;
    private c mFCanvasRenderer;
    private FCanvas mHost;
    private d.a mLifecycleListener;
    private FCanvasInstance.RenderType mRenderType;
    private final e mViewportMetrics;
    private final boolean renderTransparently;
    private final SurfaceHolder.Callback surfaceCallback;

    static {
        kge.a(-1436861325);
        kge.a(1070618392);
    }

    public static /* synthetic */ Object ipc$super(FCanvasSurfaceView fCanvasSurfaceView, String str, Object... objArr) {
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

    public static /* synthetic */ boolean access$002(FCanvasSurfaceView fCanvasSurfaceView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("61395e63", new Object[]{fCanvasSurfaceView, new Boolean(z)})).booleanValue();
        }
        fCanvasSurfaceView.isSurfaceAvailableForRendering = z;
        return z;
    }

    public static /* synthetic */ boolean access$100(FCanvasSurfaceView fCanvasSurfaceView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1dfbb77a", new Object[]{fCanvasSurfaceView})).booleanValue() : fCanvasSurfaceView.isAttachedToFCanvasRenderer;
    }

    public static /* synthetic */ void access$200(FCanvasSurfaceView fCanvasSurfaceView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("882b3f95", new Object[]{fCanvasSurfaceView});
        } else {
            fCanvasSurfaceView.connectSurfaceToRenderer();
        }
    }

    public static /* synthetic */ d.a access$300(FCanvasSurfaceView fCanvasSurfaceView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d.a) ipChange.ipc$dispatch("d18ecc2f", new Object[]{fCanvasSurfaceView}) : fCanvasSurfaceView.mLifecycleListener;
    }

    public static /* synthetic */ void access$400(FCanvasSurfaceView fCanvasSurfaceView, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63440773", new Object[]{fCanvasSurfaceView, new Integer(i), new Integer(i2)});
        } else {
            fCanvasSurfaceView.changeSurfaceSize(i, i2);
        }
    }

    public static /* synthetic */ void access$500(FCanvasSurfaceView fCanvasSurfaceView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6b9d7f2", new Object[]{fCanvasSurfaceView});
        } else {
            fCanvasSurfaceView.disconnectSurfaceFromRenderer();
        }
    }

    public FCanvasSurfaceView(Context context) {
        this(context, null, false, true);
    }

    public FCanvasSurfaceView(Context context, FCanvas fCanvas, boolean z, boolean z2, FCanvasInstance.RenderType renderType) {
        this(context, null, z, z2);
        this.mRenderType = renderType;
        this.mHost = fCanvas;
    }

    public FCanvasSurfaceView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, false, true);
    }

    private FCanvasSurfaceView(Context context, AttributeSet attributeSet, boolean z, boolean z2) {
        super(context, attributeSet);
        this.isSurfaceAvailableForRendering = false;
        this.isAttachedToFCanvasRenderer = false;
        this.mViewportMetrics = new e();
        this.mRenderType = FCanvasInstance.RenderType.canvas2D;
        this.surfaceCallback = new SurfaceHolder.Callback() { // from class: com.taobao.android.fcanvas.integration.FCanvasSurfaceView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.SurfaceHolder.Callback
            public void surfaceCreated(SurfaceHolder surfaceHolder) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("84fd8b02", new Object[]{this, surfaceHolder});
                    return;
                }
                FCanvasSurfaceView.access$002(FCanvasSurfaceView.this, true);
                if (FCanvasSurfaceView.access$100(FCanvasSurfaceView.this)) {
                    FCanvasSurfaceView.access$200(FCanvasSurfaceView.this);
                }
                if (FCanvasSurfaceView.access$300(FCanvasSurfaceView.this) == null) {
                    return;
                }
                FCanvasSurfaceView.access$300(FCanvasSurfaceView.this).a();
            }

            @Override // android.view.SurfaceHolder.Callback
            public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("a7f2c515", new Object[]{this, surfaceHolder, new Integer(i), new Integer(i2), new Integer(i3)});
                } else if (!FCanvasSurfaceView.access$100(FCanvasSurfaceView.this)) {
                } else {
                    FCanvasSurfaceView.access$400(FCanvasSurfaceView.this, i2, i3);
                }
            }

            @Override // android.view.SurfaceHolder.Callback
            public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("a7b74573", new Object[]{this, surfaceHolder});
                    return;
                }
                if (FCanvasSurfaceView.access$300(FCanvasSurfaceView.this) != null) {
                    FCanvasSurfaceView.access$300(FCanvasSurfaceView.this).b();
                }
                FCanvasSurfaceView.access$002(FCanvasSurfaceView.this, false);
                if (!FCanvasSurfaceView.access$100(FCanvasSurfaceView.this)) {
                    return;
                }
                FCanvasSurfaceView.access$500(FCanvasSurfaceView.this);
            }
        };
        this.renderTransparently = z;
        this.keepTransparentBeforeRender = z2;
        init();
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        if (this.renderTransparently) {
            getHolder().setFormat(-2);
            setZOrderOnTop(true);
        }
        getHolder().addCallback(this.surfaceCallback);
        if (!this.keepTransparentBeforeRender) {
            return;
        }
        setAlpha(0.0f);
    }

    @Override // android.view.View
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
        c cVar2 = this.mFCanvasRenderer;
        if (cVar2 != null) {
            cVar2.a(this.mRenderType);
            FCanvas fCanvas2 = this.mHost;
            if (fCanvas2 != null) {
                fCanvas2.printLog(0, "Already connected to a FCanvasRenderer. Detaching from old one and attaching to new one.", null);
            }
        }
        this.mFCanvasRenderer = cVar;
        this.isAttachedToFCanvasRenderer = true;
        if (!this.isSurfaceAvailableForRendering) {
            return;
        }
        FCanvas fCanvas3 = this.mHost;
        if (fCanvas3 != null) {
            fCanvas3.printLog(0, "Surface is available for rendering. Connecting FCanvasRenderer to Android surface.", null);
        }
        connectSurfaceToRenderer();
    }

    @Override // com.taobao.android.fcanvas.integration.d
    public void detachFromRenderer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3f0be47", new Object[]{this});
        } else if (this.mFCanvasRenderer != null) {
            if (getWindowToken() != null) {
                FCanvas fCanvas = this.mHost;
                if (fCanvas != null) {
                    fCanvas.printLog(0, "Disconnecting FCanvasRenderer from Android surface.", null);
                }
                disconnectSurfaceFromRenderer();
            }
            if (this.keepTransparentBeforeRender) {
                setAlpha(0.0f);
            }
            this.mFCanvasRenderer = null;
            this.isAttachedToFCanvasRenderer = false;
        } else {
            FCanvas fCanvas2 = this.mHost;
            if (fCanvas2 == null) {
                return;
            }
            fCanvas2.printLog(0, "detachFromRenderer() invoked when no FCanvasRenderer was attached.", null);
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
        } else if (this.mFCanvasRenderer == null || getHolder() == null) {
            throw new IllegalStateException("connectSurfaceToRenderer() should only be called when flutterRenderer and getHolder() are non-null.");
        } else {
            this.mFCanvasRenderer.a(getHolder().getSurface(), this.mRenderType);
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
