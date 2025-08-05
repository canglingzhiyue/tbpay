package com.etao.feimagesearch.cip.camera;

import android.content.Context;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.cot;
import tb.kge;
import tb.rvm;

/* loaded from: classes3.dex */
public final class AutoFitSurfaceView extends SurfaceView {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion;
    private static final int STATE_SURFACE_CHANGED;
    private static final int STATE_SURFACE_CREATED = 0;
    private static final int STATE_SURFACE_DESTROYED;
    private static final String TAG;
    private float aspectRatio;
    private SurfaceHolder.Callback callback;
    private int curState;
    private int formatCache;
    private int heightCache;
    private SurfaceHolder holderCache;
    private int rotation;
    private int widthCache;

    public AutoFitSurfaceView(Context context) {
        this(context, null, 0, 6, null);
    }

    public AutoFitSurfaceView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public static final /* synthetic */ SurfaceHolder.Callback access$getCallback$p(AutoFitSurfaceView autoFitSurfaceView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SurfaceHolder.Callback) ipChange.ipc$dispatch("8c6307ee", new Object[]{autoFitSurfaceView}) : autoFitSurfaceView.callback;
    }

    public static final /* synthetic */ int access$getSTATE_SURFACE_CHANGED$cp() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("1205eb0d", new Object[0])).intValue() : STATE_SURFACE_CHANGED;
    }

    public static final /* synthetic */ int access$getSTATE_SURFACE_CREATED$cp() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a086c59", new Object[0])).intValue() : STATE_SURFACE_CREATED;
    }

    public static final /* synthetic */ int access$getSTATE_SURFACE_DESTROYED$cp() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57163a88", new Object[0])).intValue() : STATE_SURFACE_DESTROYED;
    }

    public static final /* synthetic */ void access$setCallback$p(AutoFitSurfaceView autoFitSurfaceView, SurfaceHolder.Callback callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3353c2a4", new Object[]{autoFitSurfaceView, callback});
        } else {
            autoFitSurfaceView.callback = callback;
        }
    }

    public static final /* synthetic */ void access$setCurState$p(AutoFitSurfaceView autoFitSurfaceView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1938f7d4", new Object[]{autoFitSurfaceView, new Integer(i)});
        } else {
            autoFitSurfaceView.curState = i;
        }
    }

    public static final /* synthetic */ void access$setFormatCache$p(AutoFitSurfaceView autoFitSurfaceView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8c015be", new Object[]{autoFitSurfaceView, new Integer(i)});
        } else {
            autoFitSurfaceView.formatCache = i;
        }
    }

    public static final /* synthetic */ void access$setHeightCache$p(AutoFitSurfaceView autoFitSurfaceView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acd5a2ee", new Object[]{autoFitSurfaceView, new Integer(i)});
        } else {
            autoFitSurfaceView.heightCache = i;
        }
    }

    public static final /* synthetic */ void access$setHolderCache$p(AutoFitSurfaceView autoFitSurfaceView, SurfaceHolder surfaceHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80078050", new Object[]{autoFitSurfaceView, surfaceHolder});
        } else {
            autoFitSurfaceView.holderCache = surfaceHolder;
        }
    }

    public static final /* synthetic */ void access$setWidthCache$p(AutoFitSurfaceView autoFitSurfaceView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35bd0d09", new Object[]{autoFitSurfaceView, new Integer(i)});
        } else {
            autoFitSurfaceView.widthCache = i;
        }
    }

    public /* synthetic */ AutoFitSurfaceView(Context context, AttributeSet attributeSet, int i, int i2, o oVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoFitSurfaceView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        q.c(context, "context");
        this.curState = -1;
        this.widthCache = -1;
        this.heightCache = -1;
        getHolder().addCallback(new SurfaceHolder.Callback() { // from class: com.etao.feimagesearch.cip.camera.AutoFitSurfaceView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.SurfaceHolder.Callback
            public void surfaceCreated(SurfaceHolder surfaceHolder) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("84fd8b02", new Object[]{this, surfaceHolder});
                    return;
                }
                AutoFitSurfaceView.access$setCurState$p(AutoFitSurfaceView.this, AutoFitSurfaceView.access$getSTATE_SURFACE_CREATED$cp());
                SurfaceHolder.Callback access$getCallback$p = AutoFitSurfaceView.access$getCallback$p(AutoFitSurfaceView.this);
                if (access$getCallback$p == null) {
                    return;
                }
                access$getCallback$p.surfaceCreated(surfaceHolder);
            }

            @Override // android.view.SurfaceHolder.Callback
            public void surfaceChanged(SurfaceHolder surfaceHolder, int i2, int i3, int i4) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("a7f2c515", new Object[]{this, surfaceHolder, new Integer(i2), new Integer(i3), new Integer(i4)});
                    return;
                }
                AutoFitSurfaceView.access$setCurState$p(AutoFitSurfaceView.this, AutoFitSurfaceView.access$getSTATE_SURFACE_CHANGED$cp());
                AutoFitSurfaceView.access$setHolderCache$p(AutoFitSurfaceView.this, surfaceHolder);
                AutoFitSurfaceView.access$setFormatCache$p(AutoFitSurfaceView.this, i2);
                AutoFitSurfaceView.access$setWidthCache$p(AutoFitSurfaceView.this, i3);
                AutoFitSurfaceView.access$setHeightCache$p(AutoFitSurfaceView.this, i4);
                SurfaceHolder.Callback access$getCallback$p = AutoFitSurfaceView.access$getCallback$p(AutoFitSurfaceView.this);
                if (access$getCallback$p == null) {
                    return;
                }
                access$getCallback$p.surfaceChanged(surfaceHolder, i2, i3, i4);
            }

            @Override // android.view.SurfaceHolder.Callback
            public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("a7b74573", new Object[]{this, surfaceHolder});
                    return;
                }
                AutoFitSurfaceView.access$setCurState$p(AutoFitSurfaceView.this, AutoFitSurfaceView.access$getSTATE_SURFACE_DESTROYED$cp());
                SurfaceHolder.Callback access$getCallback$p = AutoFitSurfaceView.access$getCallback$p(AutoFitSurfaceView.this);
                if (access$getCallback$p == null) {
                    return;
                }
                access$getCallback$p.surfaceDestroyed(surfaceHolder);
            }
        });
    }

    public final void registerCallback(SurfaceHolder.Callback callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfbd22b8", new Object[]{this, callback});
            return;
        }
        q.c(callback, "callback");
        this.callback = callback;
        int i = this.curState;
        if (i == STATE_SURFACE_CREATED) {
            callback.surfaceCreated(this.holderCache);
        } else if (i == STATE_SURFACE_CHANGED) {
            callback.surfaceCreated(this.holderCache);
            callback.surfaceChanged(this.holderCache, this.formatCache, this.widthCache, this.heightCache);
        } else if (i != STATE_SURFACE_DESTROYED) {
        } else {
            callback.surfaceDestroyed(this.holderCache);
        }
    }

    public final void setAspectRatio(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28f49ecb", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
        } else if (i <= 0 || i2 <= 0) {
        } else {
            float f = i;
            float f2 = i2;
            float f3 = f / f2;
            this.aspectRatio = f3;
            this.rotation = i3;
            if (i3 == 90 || i3 == 270) {
                this.aspectRatio = f3;
                getHolder().setFixedSize(i, i2);
            } else {
                this.aspectRatio = f2 / f;
                getHolder().setFixedSize(i2, i);
            }
            requestLayout();
        }
    }

    @Override // android.view.SurfaceView, android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        String str = TAG;
        cot.c(str, "onMeasure: " + size + " x " + size2 + "，aspectRatio=" + this.aspectRatio + ", rotation=" + this.rotation);
        if (this.aspectRatio == 0.0f) {
            setMeasuredDimension(size, size2);
            return;
        }
        String str2 = TAG;
        cot.c(str2, "actualRatio=" + this.aspectRatio);
        float f = (float) size;
        float f2 = (float) size2;
        float f3 = this.aspectRatio;
        if (f < f2 * f3) {
            size = rvm.a(f2 * f3);
        } else {
            size2 = rvm.a(f / f3);
        }
        String str3 = TAG;
        cot.c(str3, "Measured dimensions set: " + size + " x " + size2);
        setMeasuredDimension(size, size2);
    }

    /* loaded from: classes3.dex */
    public static final class a {
        static {
            kge.a(-1890837906);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    static {
        kge.a(32491174);
        Companion = new a(null);
        TAG = TAG;
        STATE_SURFACE_CHANGED = 1;
        STATE_SURFACE_DESTROYED = 2;
    }
}
