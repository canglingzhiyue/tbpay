package com.taobao.android.fluid.framework.card.cards.web;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes5.dex */
public abstract class b implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1294590091);
        kge.a(-1201612728);
    }

    public abstract void a(float f, float f2);

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        } else {
            a(view.getPivotX(), view.getPivotY());
        }
    }
}
