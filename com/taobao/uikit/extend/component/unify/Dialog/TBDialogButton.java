package com.taobao.uikit.extend.component.unify.Dialog;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.utils.ResourceUtils;
import tb.kge;

/* loaded from: classes9.dex */
public class TBDialogButton extends TextView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Drawable mDefaultBackground;
    private boolean mStacked;
    private Drawable mStackedBackground;
    private int mStackedEndPadding;
    private GravityEnum mStackedGravity;

    static {
        kge.a(2015660988);
    }

    public TBDialogButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mStacked = false;
        init(context, attributeSet, 0, 0);
    }

    public TBDialogButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mStacked = false;
        init(context, attributeSet, i, 0);
    }

    public TBDialogButton(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.mStacked = false;
        init(context, attributeSet, i, i2);
    }

    private void init(Context context, AttributeSet attributeSet, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9aae387d", new Object[]{this, context, attributeSet, new Integer(i), new Integer(i2)});
            return;
        }
        this.mStackedEndPadding = ResourceUtils.getDimensionPixelSize(context, R.dimen.uik_mdDialogFrameMargin);
        this.mStackedGravity = GravityEnum.END;
    }

    public void setStacked(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3dc8fec", new Object[]{this, new Boolean(z), new Boolean(z2)});
        } else if (this.mStacked == z && !z2) {
        } else {
            setGravity(z ? this.mStackedGravity.getGravityInt() | 16 : 17);
            if (Build.VERSION.SDK_INT >= 17) {
                setTextAlignment(z ? this.mStackedGravity.getTextAlignment() : 4);
            }
            ResourceUtils.setBackgroundCompat(this, z ? this.mStackedBackground : this.mDefaultBackground);
            if (z) {
                setPadding(this.mStackedEndPadding, getPaddingTop(), this.mStackedEndPadding, getPaddingBottom());
            }
            this.mStacked = z;
        }
    }

    public void setStackedGravity(GravityEnum gravityEnum) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49e4744", new Object[]{this, gravityEnum});
        } else {
            this.mStackedGravity = gravityEnum;
        }
    }

    public void setStackedSelector(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d83f58f", new Object[]{this, drawable});
            return;
        }
        this.mStackedBackground = drawable;
        if (!this.mStacked) {
            return;
        }
        setStacked(true, true);
    }

    public void setDefaultSelector(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("381722a9", new Object[]{this, drawable});
            return;
        }
        this.mDefaultBackground = drawable;
        if (this.mStacked) {
            return;
        }
        setStacked(false, true);
    }

    public void setAllCapsCompat(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89bc3f6b", new Object[]{this, new Boolean(z)});
        } else if (Build.VERSION.SDK_INT < 14) {
        } else {
            setAllCaps(z);
        }
    }
}
