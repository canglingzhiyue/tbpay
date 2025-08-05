package com.alibaba.android.aura.service.render.widget.roundcornerlayout.roundcard;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class UMFNoneCornerCardView extends FrameLayout implements a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private float mRadius;

    static {
        kge.a(-2004255226);
        kge.a(-1199357740);
    }

    public UMFNoneCornerCardView(Context context) {
        super(context);
        this.mRadius = 0.0f;
    }

    public UMFNoneCornerCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mRadius = 0.0f;
    }

    public UMFNoneCornerCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mRadius = 0.0f;
    }

    @Override // com.alibaba.android.aura.service.render.widget.roundcornerlayout.roundcard.a
    public void setCardBackgroundColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94366759", new Object[]{this, new Integer(i)});
        } else {
            setBackgroundColor(i);
        }
    }

    @Override // com.alibaba.android.aura.service.render.widget.roundcornerlayout.roundcard.a
    public void setRadius(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c80fcd05", new Object[]{this, new Float(f)});
        } else {
            this.mRadius = f;
        }
    }

    @Override // com.alibaba.android.aura.service.render.widget.roundcornerlayout.roundcard.a
    public float getRadius() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f9580fff", new Object[]{this})).floatValue() : this.mRadius;
    }
}
