package com.taobao.uikit.immersive;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.util.SystemBarDecorator;
import com.taobao.taobao.R;

/* loaded from: classes9.dex */
public class TBInsetLinearLayout extends LinearLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean mRequirePaddingTop;

    public static /* synthetic */ Object ipc$super(TBInsetLinearLayout tBInsetLinearLayout, String str, Object... objArr) {
        if (str.hashCode() == 650865254) {
            super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public TBInsetLinearLayout(Context context) {
        this(context, null);
    }

    public TBInsetLinearLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public TBInsetLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mRequirePaddingTop = true;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.TBInsetLinearLayout, 0, 0);
        try {
            this.mRequirePaddingTop = obtainStyledAttributes.getBoolean(R.styleable.TBInsetLinearLayout_requirePaddingTop, true);
            obtainStyledAttributes.recycle();
            if (!this.mRequirePaddingTop) {
                return;
            }
            setPaddingTop();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public void setPaddingTop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e44b9f0d", new Object[]{this});
        } else if (Build.VERSION.SDK_INT < 19) {
        } else {
            setPadding(getPaddingLeft(), getPaddingTop() + SystemBarDecorator.getStatusBarHeight(getContext()), getPaddingRight(), getPaddingBottom());
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        int i3 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            if (layoutParams.height > 0) {
                i3 = layoutParams.height;
            }
            if (Build.VERSION.SDK_INT >= 19) {
                if (i3 > 0) {
                    i3 += SystemBarDecorator.getStatusBarHeight(getContext());
                }
                setFitsSystemWindows(true);
            }
            if (i3 > 0) {
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(i3, 1073741824));
                return;
            } else {
                super.onMeasure(i, i2);
                return;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setRequirePaddingTop(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91d0bd06", new Object[]{this, new Boolean(z)});
            return;
        }
        boolean z2 = this.mRequirePaddingTop;
        if (z2 != z) {
            if (z2) {
                if (Build.VERSION.SDK_INT >= 19) {
                    setPadding(getPaddingLeft(), getPaddingTop() - SystemBarDecorator.getStatusBarHeight(getContext()), getPaddingRight(), getPaddingBottom());
                }
            } else {
                setPaddingTop();
            }
        }
        this.mRequirePaddingTop = z;
    }
}
