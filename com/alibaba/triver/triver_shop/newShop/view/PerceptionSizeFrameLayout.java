package com.alibaba.triver.triver_shop.newShop.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes3.dex */
public class PerceptionSizeFrameLayout extends MarginSupportFrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private p viewSizeChangedListener;

    static {
        kge.a(-2485464);
    }

    public static /* synthetic */ Object ipc$super(PerceptionSizeFrameLayout perceptionSizeFrameLayout, String str, Object... objArr) {
        if (str.hashCode() == 348684699) {
            super.onVisibilityChanged((View) objArr[0], ((Number) objArr[1]).intValue());
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PerceptionSizeFrameLayout(Context context) {
        super(context);
        kotlin.jvm.internal.q.d(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PerceptionSizeFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.q.d(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PerceptionSizeFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.q.d(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PerceptionSizeFrameLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        kotlin.jvm.internal.q.d(context, "context");
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

    @Override // android.view.View
    public void onVisibilityChanged(View changedView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14c8819b", new Object[]{this, changedView, new Integer(i)});
            return;
        }
        kotlin.jvm.internal.q.d(changedView, "changedView");
        super.onVisibilityChanged(changedView, i);
    }
}
