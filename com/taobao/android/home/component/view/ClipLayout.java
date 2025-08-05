package com.taobao.android.home.component.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.utils.e;
import tb.fpr;
import tb.kge;

/* loaded from: classes5.dex */
public class ClipLayout extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int clipLeft;
    private int clipRight;
    private boolean isBannerClipRadius;
    private boolean isBgClipRadius;
    private boolean isCoverImage;
    private int radius;

    static {
        kge.a(-1478968907);
    }

    public static /* synthetic */ Object ipc$super(ClipLayout clipLayout, String str, Object... objArr) {
        if (str.hashCode() == 623593120) {
            super.dispatchDraw((Canvas) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public ClipLayout(Context context) {
        super(context);
        this.isBgClipRadius = false;
        this.isBannerClipRadius = false;
        this.isCoverImage = false;
        this.clipLeft = 24;
        this.clipRight = 24;
        this.radius = 27;
    }

    public ClipLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.isBgClipRadius = false;
        this.isBannerClipRadius = false;
        this.isCoverImage = false;
        this.clipLeft = 24;
        this.clipRight = 24;
        this.radius = 27;
    }

    public ClipLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.isBgClipRadius = false;
        this.isBannerClipRadius = false;
        this.isCoverImage = false;
        this.clipLeft = 24;
        this.clipRight = 24;
        this.radius = 27;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("252b46a0", new Object[]{this, canvas});
            return;
        }
        if (isClipRadius()) {
            clipCorner(this, canvas);
        }
        super.dispatchDraw(canvas);
    }

    public boolean isClipRadius() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6c8b7b57", new Object[]{this})).booleanValue() : this.isBannerClipRadius || this.isBgClipRadius;
    }

    public void setCoverImage(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f8d5907", new Object[]{this, new Boolean(z)});
        } else {
            this.isCoverImage = z;
        }
    }

    public boolean isCoverImage() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c0199a39", new Object[]{this})).booleanValue() : this.isCoverImage;
    }

    public void setClipRadius(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11579ba9", new Object[]{this, new Boolean(z)});
        } else if (this.isBgClipRadius == z) {
        } else {
            this.isBgClipRadius = z;
            refreshStatus();
        }
    }

    public void setBannerClipRadius(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("492f305d", new Object[]{this, new Boolean(z)});
        } else if (this.isBannerClipRadius == z) {
        } else {
            this.isBannerClipRadius = z;
            refreshStatus();
        }
    }

    private void refreshStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd50e4b4", new Object[]{this});
            return;
        }
        try {
            if (isClipRadius()) {
                this.clipLeft = fpr.a(getContext(), "9ap", 0);
                this.clipRight = this.clipLeft;
                this.radius = fpr.a(getContext(), "12ap", 0);
            }
            requestLayout();
        } catch (Throwable th) {
            e.a("ClipLayout", "refreshStatus error", th);
        }
    }

    public void setOnlyRadius(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c23cdfc", new Object[]{this, new Integer(i)});
        } else if (this.radius == i) {
        } else {
            this.isBgClipRadius = true;
            this.radius = i;
            this.clipLeft = 0;
            this.clipRight = 0;
            invalidate();
        }
    }

    private void clipCorner(View view, Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f980e9f", new Object[]{this, view, canvas});
        } else if (canvas == null || Build.VERSION.SDK_INT < 16) {
        } else {
            if (Build.VERSION.SDK_INT >= 11 && canvas.isHardwareAccelerated() && Build.VERSION.SDK_INT < 18) {
                view.setLayerType(1, null);
            }
            int width = canvas.getWidth();
            int height = canvas.getHeight();
            if (width <= 0 || height <= 0) {
                return;
            }
            Path path = new Path();
            RectF rectF = new RectF(this.clipLeft, 0.0f, width - this.clipRight, height);
            int i = this.radius;
            path.addRoundRect(rectF, new float[]{i, i, i, i, i, i, i, i}, Path.Direction.CW);
            canvas.clipPath(path);
            path.close();
        }
    }

    public int dp2px(float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("88b66f1e", new Object[]{this, new Float(f)})).intValue() : (int) ((f * getContext().getResources().getDisplayMetrics().density) + 0.5f);
    }
}
