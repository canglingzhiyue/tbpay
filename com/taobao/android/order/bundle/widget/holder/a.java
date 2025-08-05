package com.taobao.android.order.bundle.widget.holder;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes6.dex */
public abstract class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public ViewGroup f14605a;
    public Activity b;

    static {
        kge.a(-1059263866);
    }

    public abstract View a();

    public a(Activity activity) {
        this.b = activity;
    }

    public a a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("83bd32fc", new Object[]{this, new Integer(i)});
        }
        this.f14605a = (ViewGroup) this.b.findViewById(i);
        return this;
    }

    public a a(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("9c793808", new Object[]{this, viewGroup});
        }
        this.f14605a = viewGroup;
        return this;
    }

    public View b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("639153eb", new Object[]{this});
        }
        View a2 = a();
        ViewGroup viewGroup = this.f14605a;
        if (viewGroup != a2 && viewGroup != null) {
            this.f14605a.addView(a2, new ViewGroup.LayoutParams(-1, -1));
        }
        return this.f14605a;
    }
}
