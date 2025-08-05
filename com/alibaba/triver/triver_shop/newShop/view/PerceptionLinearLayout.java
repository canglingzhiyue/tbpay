package com.alibaba.triver.triver_shop.newShop.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes3.dex */
public final class PerceptionLinearLayout extends LinearLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private p viewSizeChangedListener;

    static {
        kge.a(-1727962883);
    }

    public final p getViewSizeChangedListener() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (p) ipChange.ipc$dispatch("4f13021d", new Object[]{this}) : this.viewSizeChangedListener;
    }

    public final void setViewSizeChangedListener(p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26741bb3", new Object[]{this, pVar});
        } else {
            this.viewSizeChangedListener = pVar;
        }
    }

    public PerceptionLinearLayout(Context context) {
        super(context);
    }

    public PerceptionLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PerceptionLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public PerceptionLinearLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52d28ddb", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        p pVar = this.viewSizeChangedListener;
        if (pVar == null) {
            return;
        }
        pVar.a(this, i, i2, i3, i4);
    }
}
