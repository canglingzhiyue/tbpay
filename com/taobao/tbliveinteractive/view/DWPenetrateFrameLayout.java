package com.taobao.tbliveinteractive.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.pmd;
import tb.pnj;
import tb.qne;

/* loaded from: classes8.dex */
public class DWPenetrateFrameLayout extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static int DEFAULT_PENETRATE_ALPHA;
    private static final String TAG;
    private boolean hasShowingComponent;
    private Integer lastAlpha;
    private boolean mBitmapCacheUpdated;
    private boolean mForceBitmapCacheUpdated;
    private int mPenetrateAlpha;
    private boolean mUseTempBitmap;

    public static /* synthetic */ Object ipc$super(DWPenetrateFrameLayout dWPenetrateFrameLayout, String str, Object... objArr) {
        if (str.hashCode() == 623593120) {
            super.dispatchDraw((Canvas) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    static {
        kge.a(-730558798);
        TAG = DWPenetrateFrameLayout.class.getSimpleName();
        DEFAULT_PENETRATE_ALPHA = 200;
    }

    public DWPenetrateFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mPenetrateAlpha = DEFAULT_PENETRATE_ALPHA;
        this.hasShowingComponent = false;
        initialize(context);
    }

    public DWPenetrateFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mPenetrateAlpha = DEFAULT_PENETRATE_ALPHA;
        this.hasShowingComponent = false;
        initialize(context);
    }

    public DWPenetrateFrameLayout(Context context) {
        super(context);
        this.mPenetrateAlpha = DEFAULT_PENETRATE_ALPHA;
        this.hasShowingComponent = false;
        initialize(context);
    }

    private void initialize(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1dcfb91", new Object[]{this, context});
            return;
        }
        setLayoutTransition(null);
        this.mUseTempBitmap = qne.l();
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            removeAllViews();
        }
    }

    public final void setPenetrateAlpha(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8583384", new Object[]{this, new Integer(i)});
            return;
        }
        if (i > 255) {
            i = 255;
        } else if (i < 0) {
            i = 0;
        }
        this.mPenetrateAlpha = i;
        pnj m = pmd.a().m();
        m.a("PenetrateFrame.setPenetrateAlpha.penetrateAlpha{%s}", this.mPenetrateAlpha + "");
    }

    public final int getPenetrateAlpha() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ec322946", new Object[]{this})).intValue() : this.mPenetrateAlpha;
    }

    public void setHasShowingComponent(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c420a37d", new Object[]{this, new Boolean(z)});
        } else {
            this.hasShowingComponent = z;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        try {
            if (255 != this.mPenetrateAlpha && !this.hasShowingComponent) {
                if (this.mPenetrateAlpha == 0) {
                    return true;
                }
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                if (x >= 0 && y >= 0) {
                    if (!qne.r() || this.lastAlpha == null || motionEvent.getAction() == 0) {
                        if (qne.n()) {
                            this.lastAlpha = Integer.valueOf(255 - getAlphaAt(this, x, y));
                        } else {
                            if (motionEvent.getAction() == 0) {
                                updateBitmapCacheIfNeed();
                            }
                            Bitmap drawingCache = getDrawingCache();
                            Bitmap bitmap = null;
                            if (drawingCache == null && this.mUseTempBitmap) {
                                drawingCache = getViewBitmap(this);
                                bitmap = drawingCache;
                            }
                            if (drawingCache != null && x <= drawingCache.getWidth() && y <= drawingCache.getHeight()) {
                                int pixel = drawingCache.getPixel(x, y);
                                if (bitmap != null) {
                                    bitmap.recycle();
                                }
                                this.lastAlpha = Integer.valueOf(255 - Color.alpha(pixel));
                            }
                        }
                    }
                    return this.lastAlpha.intValue() > this.mPenetrateAlpha;
                }
                return true;
            }
            return false;
        } catch (Throwable th) {
            if (pmd.a().m() != null) {
                pmd.a().m().a("PenetrateFrame.onInterceptTouchEvent.error", th.getLocalizedMessage());
            }
            return true;
        }
    }

    public Bitmap getViewBitmap(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("f535cd5f", new Object[]{this, view});
        }
        Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
        view.draw(new Canvas(createBitmap));
        return createBitmap;
    }

    public static int getAlphaAt(View view, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4b029ce3", new Object[]{view, new Integer(i), new Integer(i2)})).intValue();
        }
        Bitmap createBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Matrix matrix = new Matrix();
        matrix.postTranslate(-i, -i2);
        canvas.setMatrix(matrix);
        view.draw(canvas);
        return Color.alpha(createBitmap.getPixel(0, 0));
    }

    public void updateDrawingCache(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c2005e0", new Object[]{this, new Boolean(z)});
        } else {
            this.mForceBitmapCacheUpdated = z;
        }
    }

    private void updateBitmapCacheIfNeed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e406904", new Object[]{this});
        } else if (qne.n()) {
        } else {
            if (!this.mBitmapCacheUpdated && !this.mForceBitmapCacheUpdated) {
                return;
            }
            destroyDrawingCache();
            buildDrawingCache();
            this.mBitmapCacheUpdated = false;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("252b46a0", new Object[]{this, canvas});
            return;
        }
        try {
            super.dispatchDraw(canvas);
            this.mBitmapCacheUpdated = true;
        } catch (Throwable th) {
            if (pmd.a().m() == null) {
                return;
            }
            pmd.a().m().a("PenetrateFrame.dispatchDraw.error", th.getLocalizedMessage());
        }
    }
}
