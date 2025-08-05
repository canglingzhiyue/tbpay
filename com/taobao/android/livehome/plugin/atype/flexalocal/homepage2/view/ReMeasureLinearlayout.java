package com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes6.dex */
public class ReMeasureLinearlayout extends LinearLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int FINAL_MEASURE_INDEX_INVALID = -1;
    private int finalMeasureIndex;

    static {
        kge.a(1166106216);
    }

    public static /* synthetic */ Object ipc$super(ReMeasureLinearlayout reMeasureLinearlayout, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode != 64333381) {
            if (hashCode != 650865254) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }
            super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
            return null;
        }
        return super.getChildAt(((Number) objArr[0]).intValue());
    }

    public ReMeasureLinearlayout(Context context) {
        this(context, null);
    }

    public ReMeasureLinearlayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.finalMeasureIndex = -1;
    }

    @Override // android.view.ViewGroup
    public View getChildAt(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("3d5a645", new Object[]{this, new Integer(i)});
        }
        int i2 = this.finalMeasureIndex;
        if (i2 < 0) {
            return super.getChildAt(i);
        }
        if (i < i2) {
            return super.getChildAt(i);
        }
        if (i == getChildCount() - 1) {
            return super.getChildAt(this.finalMeasureIndex);
        }
        return super.getChildAt(i + 1);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        int i3 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        int childCount = getChildCount();
        this.finalMeasureIndex = -1;
        while (true) {
            if (i3 >= childCount) {
                break;
            } else if (isFinalMeasure(getChildAt(i3))) {
                this.finalMeasureIndex = i3;
                break;
            } else {
                i3++;
            }
        }
        super.onMeasure(i, i2);
        this.finalMeasureIndex = -1;
    }

    private boolean isFinalMeasure(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b2a7e75d", new Object[]{this, view})).booleanValue();
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof LayoutParams)) {
            return false;
        }
        return ((LayoutParams) layoutParams).finalMeasure;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: generateLayoutParams  reason: collision with other method in class */
    public LayoutParams mo988generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LayoutParams) ipChange.ipc$dispatch("253c66f6", new Object[]{this, layoutParams}) : new LayoutParams(layoutParams);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: generateDefaultLayoutParams  reason: collision with other method in class */
    public LayoutParams mo985generateDefaultLayoutParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LayoutParams) ipChange.ipc$dispatch("c6f935c8", new Object[]{this});
        }
        if (getOrientation() == 0) {
            return new LayoutParams(-2, -2);
        }
        if (getOrientation() != 1) {
            return null;
        }
        return new LayoutParams(-1, -2);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: generateLayoutParams  reason: collision with other method in class */
    public LayoutParams mo987generateLayoutParams(AttributeSet attributeSet) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LayoutParams) ipChange.ipc$dispatch("31b0d8a7", new Object[]{this, attributeSet}) : new LayoutParams(getContext(), attributeSet);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("79d4b702", new Object[]{this, layoutParams})).booleanValue() : layoutParams instanceof LayoutParams;
    }

    /* loaded from: classes6.dex */
    public static class LayoutParams extends LinearLayout.LayoutParams {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public boolean finalMeasure;

        static {
            kge.a(-1530797524);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public void setFinalMeasure(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9884ece3", new Object[]{this, new Boolean(z)});
            } else {
                this.finalMeasure = z;
            }
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(int i, int i2, float f) {
            super(i, i2, f);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }
}
