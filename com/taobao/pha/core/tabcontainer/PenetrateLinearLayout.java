package com.taobao.pha.core.tabcontainer;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes7.dex */
public class PenetrateLinearLayout extends LinearLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static int DEFAULT_PENETRATE_ALPHA;
    private boolean mBitmapCacheUpdated;
    private boolean mEnable;
    private boolean mForceBitmapCacheUpdated;
    private int mPenetrateAlpha;

    public static /* synthetic */ Object ipc$super(PenetrateLinearLayout penetrateLinearLayout, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode != -407533570) {
            if (hashCode != 623593120) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }
            super.dispatchDraw((Canvas) objArr[0]);
            return null;
        }
        return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
    }

    static {
        kge.a(-289461365);
        DEFAULT_PENETRATE_ALPHA = 255;
    }

    public PenetrateLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mPenetrateAlpha = DEFAULT_PENETRATE_ALPHA;
        this.mEnable = true;
        initialize(context);
    }

    public PenetrateLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mPenetrateAlpha = DEFAULT_PENETRATE_ALPHA;
        this.mEnable = true;
        initialize(context);
    }

    public PenetrateLinearLayout(Context context) {
        super(context);
        this.mPenetrateAlpha = DEFAULT_PENETRATE_ALPHA;
        this.mEnable = true;
        initialize(context);
    }

    private void initialize(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1dcfb91", new Object[]{this, context});
        } else {
            setLayoutTransition(null);
        }
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            removeAllViews();
        }
    }

    public void setPenetrateEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e38fb184", new Object[]{this, new Boolean(z)});
        } else {
            this.mEnable = z;
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
    }

    public final int getPenetrateAlpha() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ec322946", new Object[]{this})).intValue() : this.mPenetrateAlpha;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        if (!this.mEnable) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (this.mPenetrateAlpha == 0) {
            return true;
        }
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (x >= 0 && y >= 0) {
            if (motionEvent.getAction() == 0) {
                updateBitmapCacheIfNeed();
            }
            Bitmap drawingCache = getDrawingCache();
            return x > drawingCache.getWidth() || y > drawingCache.getHeight() || 255 - Color.alpha(drawingCache.getPixel(x, y)) >= this.mPenetrateAlpha;
        }
        return true;
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
        } else if (!this.mBitmapCacheUpdated && !this.mForceBitmapCacheUpdated) {
        } else {
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
        } catch (Throwable unused) {
        }
    }
}
