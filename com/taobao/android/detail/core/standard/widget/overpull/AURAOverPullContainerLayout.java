package com.taobao.android.detail.core.standard.widget.overpull;

import android.content.Context;
import android.support.design.widget.CoordinatorLayout;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class AURAOverPullContainerLayout extends CoordinatorLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final a mLayoutHelper;

    static {
        kge.a(-1172256937);
        kge.a(1332903710);
    }

    public static /* synthetic */ Object ipc$super(AURAOverPullContainerLayout aURAOverPullContainerLayout, String str, Object... objArr) {
        if (str.hashCode() == 949399698) {
            super.onDetachedFromWindow();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public AURAOverPullContainerLayout(Context context) {
        super(context);
        this.mLayoutHelper = new a(this);
        emu.a("com.taobao.android.detail.core.standard.widget.overpull.AURAOverPullContainerLayout");
    }

    public AURAOverPullContainerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mLayoutHelper = new a(this);
        emu.a("com.taobao.android.detail.core.standard.widget.overpull.AURAOverPullContainerLayout");
    }

    public AURAOverPullContainerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mLayoutHelper = new a(this);
        emu.a("com.taobao.android.detail.core.standard.widget.overpull.AURAOverPullContainerLayout");
    }

    public void setOrientation(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9bea80e", new Object[]{this, new Integer(i)});
        } else {
            this.mLayoutHelper.a(i);
        }
    }

    public void setType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77e09620", new Object[]{this, new Integer(i)});
        } else {
            this.mLayoutHelper.b(i);
        }
    }

    public void setTriggerRangeParams(float f, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3526c497", new Object[]{this, new Float(f), new Integer(i)});
        } else {
            this.mLayoutHelper.a(f, i);
        }
    }

    public void setCallback(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed3a5fa9", new Object[]{this, bVar});
        } else {
            this.mLayoutHelper.a(bVar);
        }
    }

    public void setEndExtraView(View view, View view2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77b7cc3", new Object[]{this, view, view2});
        } else {
            this.mLayoutHelper.a(view, view2);
        }
    }

    public void setContentView(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e38ce1b1", new Object[]{this, recyclerView});
        } else {
            this.mLayoutHelper.b(recyclerView);
        }
    }

    @Override // android.support.design.widget.CoordinatorLayout, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
        } else {
            super.onDetachedFromWindow();
        }
    }
}
