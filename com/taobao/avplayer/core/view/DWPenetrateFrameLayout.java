package com.taobao.avplayer.core.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobaoavsdk.util.c;
import tb.kge;

/* loaded from: classes6.dex */
public class DWPenetrateFrameLayout extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static int DEFAULT_PENETRATE_ALPHA;
    private boolean mBitmapCacheUpdated;
    private int mPenetrateAlpha;

    public static /* synthetic */ Object ipc$super(DWPenetrateFrameLayout dWPenetrateFrameLayout, String str, Object... objArr) {
        if (str.hashCode() == 623593120) {
            super.dispatchDraw((Canvas) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    static {
        kge.a(759858594);
        DEFAULT_PENETRATE_ALPHA = 0;
    }

    public DWPenetrateFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mPenetrateAlpha = DEFAULT_PENETRATE_ALPHA;
        initialize(context);
    }

    public DWPenetrateFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mPenetrateAlpha = DEFAULT_PENETRATE_ALPHA;
        initialize(context);
    }

    public DWPenetrateFrameLayout(Context context) {
        super(context);
        this.mPenetrateAlpha = DEFAULT_PENETRATE_ALPHA;
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
        c.a("PenetrateFrame.setPenetrateAlpha.penetrateAlpha{%s}", this.mPenetrateAlpha + "");
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
        try {
            if (255 == this.mPenetrateAlpha) {
                return false;
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
                if (x <= drawingCache.getWidth() && y <= drawingCache.getHeight()) {
                    return 255 - Color.alpha(drawingCache.getPixel(x, y)) > this.mPenetrateAlpha;
                }
            }
            return true;
        } catch (Throwable th) {
            c.b("PenetrateFrame.onInterceptTouchEvent.error", th.getLocalizedMessage());
            return true;
        }
    }

    private void updateBitmapCacheIfNeed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e406904", new Object[]{this});
        } else if (!this.mBitmapCacheUpdated) {
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
        } catch (Throwable th) {
            c.b("PenetrateFrame.dispatchDraw.error", th.getLocalizedMessage());
        }
    }
}
