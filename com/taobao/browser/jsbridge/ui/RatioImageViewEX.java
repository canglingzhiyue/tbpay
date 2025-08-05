package com.taobao.browser.jsbridge.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.kge;

/* loaded from: classes6.dex */
public class RatioImageViewEX extends ImageView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private float aspectRatio;
    private OnSizeChangedListener onSizeChangedListener;

    /* loaded from: classes6.dex */
    public interface OnSizeChangedListener {
        void onSizeChanged(RatioImageViewEX ratioImageViewEX, int i, int i2, int i3, int i4);
    }

    static {
        kge.a(902880064);
    }

    public static /* synthetic */ Object ipc$super(RatioImageViewEX ratioImageViewEX, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1150258430) {
            super.setImageDrawable((Drawable) objArr[0]);
            return null;
        } else if (hashCode == 650865254) {
            super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
            return null;
        } else if (hashCode != 1389530587) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onSizeChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
            return null;
        }
    }

    public RatioImageViewEX(Context context) {
        super(context);
        this.aspectRatio = 0.0f;
        init(null);
    }

    public RatioImageViewEX(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.aspectRatio = 0.0f;
        init(attributeSet);
    }

    public RatioImageViewEX(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.aspectRatio = 0.0f;
        init(attributeSet);
    }

    private void init(AttributeSet attributeSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92cba817", new Object[]{this, attributeSet});
            return;
        }
        Context context = getContext();
        if (attributeSet == null || context == null) {
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.RatioImageView);
        if (obtainStyledAttributes != null) {
            this.aspectRatio = obtainStyledAttributes.getFloat(R.styleable.RatioImageView_aspectRatio, 0.0f);
        }
        try {
            obtainStyledAttributes.recycle();
        } catch (Exception unused) {
        }
    }

    public float getAspectRatio() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("9b371754", new Object[]{this})).floatValue() : this.aspectRatio;
    }

    public void setAspectRatio(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fa8d1e8", new Object[]{this, new Float(f)});
        } else if (f <= 0.0f || this.aspectRatio == f) {
        } else {
            this.aspectRatio = f;
            invalidate();
        }
    }

    public void setOnSizeChangedListener(OnSizeChangedListener onSizeChangedListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab164c50", new Object[]{this, onSizeChangedListener});
        } else {
            this.onSizeChangedListener = onSizeChangedListener;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        if (this.aspectRatio > 0.0f && (mode == Integer.MIN_VALUE || mode == 1073741824)) {
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int paddingTop = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            int resolveSizeAndState = resolveSizeAndState(paddingLeft + paddingRight + 0, i, 0);
            setMeasuredDimension(resolveSizeAndState, ((int) (((resolveSizeAndState - paddingLeft) - paddingRight) * this.aspectRatio)) + paddingTop + paddingBottom);
            return;
        }
        super.onMeasure(i, i2);
    }

    public static int resolveSizeAndState(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8d425ea8", new Object[]{new Integer(i), new Integer(i2), new Integer(i3)})).intValue();
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0 && mode == 1073741824) {
                i = size;
            }
        } else if (size < i) {
            i = 16777216 | size;
        }
        return i | ((-16777216) & i3);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52d28ddb", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onSizeChanged(i, i2, i3, i4);
        OnSizeChangedListener onSizeChangedListener = this.onSizeChangedListener;
        if (onSizeChangedListener == null) {
            return;
        }
        onSizeChangedListener.onSizeChanged(this, i, i2, i3, i4);
    }

    public void setImageDrawable(Drawable drawable, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b29ea012", new Object[]{this, drawable, new Boolean(z)});
            return;
        }
        if (!z) {
            setAspectRatio(drawable.getIntrinsicHeight() / drawable.getIntrinsicWidth());
        }
        super.setImageDrawable(drawable);
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb707302", new Object[]{this, drawable});
        } else {
            setImageDrawable(drawable, false);
        }
    }
}
