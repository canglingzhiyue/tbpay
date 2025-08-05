package com.taobao.android.trade.component.display;

import android.content.Context;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.trade.component.data.Component;
import tb.kge;

/* loaded from: classes6.dex */
public abstract class b<T extends Component> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public View f15613a;
    public Context b;
    public T c;

    static {
        kge.a(796682736);
    }

    public abstract View a();

    public b(Context context) {
        this.b = context;
    }

    public View a(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("48b40d33", new Object[]{this, t});
        }
        this.c = t;
        this.f15613a = a();
        return this.f15613a;
    }

    public boolean b(Component component) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6fd0d214", new Object[]{this, component})).booleanValue();
        }
        this.c = component;
        b();
        return true;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        d();
        c();
    }

    public void c() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        View view = this.f15613a;
        if (view == null) {
            return;
        }
        T t = this.c;
        if (t != null && t.g() != Component.Status.DISABLE) {
            z = true;
        }
        view.setEnabled(z);
    }

    private void d() {
        T t;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (this.f15613a == null || (t = this.c) == null) {
        } else {
            Component.Status g = t.g();
            View view = this.f15613a;
            if (g == Component.Status.HIDDEN) {
                i = 8;
            }
            view.setVisibility(i);
        }
    }
}
