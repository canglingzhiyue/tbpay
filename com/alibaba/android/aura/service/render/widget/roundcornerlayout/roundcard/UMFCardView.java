package com.alibaba.android.aura.service.render.widget.roundcornerlayout.roundcard;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.util.AttributeSet;
import tb.kge;

/* loaded from: classes2.dex */
public class UMFCardView extends CardView implements a {
    static {
        kge.a(-1210908615);
        kge.a(-1199357740);
    }

    public UMFCardView(Context context) {
        this(context, null);
    }

    public UMFCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public UMFCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setCardElevation(0.0f);
        setCardBackgroundColor(0);
        setRadius(0.0f);
    }
}
