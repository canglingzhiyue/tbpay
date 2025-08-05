package com.taobao.android.sku.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes6.dex */
public class HeightMutableFrameLayout extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean mHeightMeasured;
    private ValueAnimator mLastAnimator;
    private View mRelationView;

    static {
        kge.a(-204894626);
    }

    public static /* synthetic */ Object ipc$super(HeightMutableFrameLayout heightMutableFrameLayout, String str, Object... objArr) {
        if (str.hashCode() == 650865254) {
            super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void access$000(HeightMutableFrameLayout heightMutableFrameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37e3a908", new Object[]{heightMutableFrameLayout});
        } else {
            heightMutableFrameLayout.clearRelationConstraints();
        }
    }

    public HeightMutableFrameLayout(Context context) {
        super(context);
    }

    public HeightMutableFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public HeightMutableFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        super.onMeasure(i, i2);
        this.mHeightMeasured = true;
    }

    public void shrinkHeight(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd6f589", new Object[]{this, new Float(f)});
        } else {
            shrinkHeight(f, true);
        }
    }

    public void shrinkHeight(float f, boolean z) {
        ViewGroup.LayoutParams layoutParams;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d086e6b", new Object[]{this, new Float(f), new Boolean(z)});
            return;
        }
        if (f <= 1.0E-5f) {
            f = 0.0f;
        } else if (f >= 1.00001f) {
            f = 1.0f;
        }
        ValueAnimator valueAnimator = this.mLastAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int height = getHeight();
        if (height <= 0 && (layoutParams = getLayoutParams()) != null) {
            height = layoutParams.height;
        }
        if (height <= 0) {
            height = getMeasuredHeight();
        }
        int parentHeight = (int) (getParentHeight() * f);
        if (!this.mHeightMeasured && Math.abs(f - 1.0f) < 1.0E-5f) {
            ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
            if (layoutParams2 == null) {
                return;
            }
            layoutParams2.height = -1;
            clearRelationConstraints();
            setLayoutParams(layoutParams2);
        } else if (height <= 0 || parentHeight <= 0) {
        } else {
            if (!z) {
                ViewGroup.LayoutParams layoutParams3 = getLayoutParams();
                if (layoutParams3 == null) {
                    return;
                }
                layoutParams3.height = parentHeight;
                clearRelationConstraints();
                setLayoutParams(layoutParams3);
                return;
            }
            ValueAnimator ofInt = ValueAnimator.ofInt(height, parentHeight);
            ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.taobao.android.sku.widget.HeightMutableFrameLayout.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator2});
                        return;
                    }
                    ViewGroup.LayoutParams layoutParams4 = HeightMutableFrameLayout.this.getLayoutParams();
                    if (layoutParams4 == null) {
                        return;
                    }
                    layoutParams4.height = ((Integer) valueAnimator2.getAnimatedValue()).intValue();
                    HeightMutableFrameLayout.access$000(HeightMutableFrameLayout.this);
                    HeightMutableFrameLayout.this.setLayoutParams(layoutParams4);
                }
            });
            ofInt.setInterpolator(new AccelerateDecelerateInterpolator());
            ofInt.start();
            this.mLastAnimator = ofInt;
        }
    }

    private int getParentHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a7cd29e1", new Object[]{this})).intValue();
        }
        ViewParent parent = getParent();
        if (!(parent instanceof ViewGroup)) {
            return 0;
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        int height = viewGroup.getHeight();
        return height == 0 ? viewGroup.getMeasuredHeight() : height;
    }

    public void setRelationView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("718d4d48", new Object[]{this, view});
        } else {
            this.mRelationView = view;
        }
    }

    private void clearRelationConstraints() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f13d8114", new Object[]{this});
            return;
        }
        View view = this.mRelationView;
        if (view == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
        if (!(layoutParams instanceof LinearLayout.LayoutParams) || !(layoutParams2 instanceof LinearLayout.LayoutParams)) {
            return;
        }
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) layoutParams;
        LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams2;
        if (layoutParams3.weight == 0.0f && layoutParams3.height == 0) {
            return;
        }
        layoutParams3.weight = 0.0f;
        layoutParams3.height = 0;
        layoutParams4.weight = 0.0f;
        this.mRelationView.setLayoutParams(layoutParams3);
        setLayoutParams(layoutParams4);
    }
}
