package com.taobao.android.litecreator.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes5.dex */
public class FixedAspectRatioFrameLayout extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private float mAspectRatio;

    static {
        kge.a(-1334929804);
    }

    public static /* synthetic */ Object ipc$super(FixedAspectRatioFrameLayout fixedAspectRatioFrameLayout, String str, Object... objArr) {
        if (str.hashCode() == 650865254) {
            super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public FixedAspectRatioFrameLayout(Context context) {
        super(context);
        this.mAspectRatio = 1.0f;
    }

    public FixedAspectRatioFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mAspectRatio = 1.0f;
    }

    public FixedAspectRatioFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mAspectRatio = 1.0f;
    }

    public FixedAspectRatioFrameLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.mAspectRatio = 1.0f;
    }

    public void setAspectRatio(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fa8d1e8", new Object[]{this, new Float(f)});
        } else {
            this.mAspectRatio = f;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode == 1073741824 && mode2 != 1073741824) {
            int size = View.MeasureSpec.getSize(i);
            int i3 = (int) (size / this.mAspectRatio);
            if (mode2 == Integer.MIN_VALUE) {
                i3 = Math.min(i3, View.MeasureSpec.getSize(i2));
            }
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(i3, 1073741824));
            return;
        }
        super.onMeasure(i, i2);
    }
}
