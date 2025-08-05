package com.taobao.android.icart.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.util.SystemBarDecorator;
import tb.kge;

/* loaded from: classes5.dex */
public class CartInsetLinearLayout extends LinearLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-595684646);
    }

    public CartInsetLinearLayout(Context context) {
        this(context, null);
    }

    public CartInsetLinearLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public CartInsetLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setPaddingTop();
    }

    public void setPaddingTop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e44b9f0d", new Object[]{this});
        } else {
            setPadding(getPaddingLeft(), getPaddingTop() + SystemBarDecorator.getStatusBarHeight(getContext()), getPaddingRight(), getPaddingBottom());
        }
    }
}
