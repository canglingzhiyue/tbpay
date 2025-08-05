package com.taobao.android.fluid.business.containerframe.frames;

import android.content.Context;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import tb.kge;

/* loaded from: classes5.dex */
public abstract class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final FluidContext f12380a;
    public final Context b;
    public View c;
    public boolean d;

    static {
        kge.a(-1732025633);
    }

    public b(FluidContext fluidContext, Context context) {
        this.f12380a = fluidContext;
        this.b = context;
    }

    public void a() {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.d || (view = this.c) == null) {
        } else {
            view.setVisibility(4);
        }
    }

    public final boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue();
        }
        View view = this.c;
        return view != null && view.getVisibility() == 0;
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        View view = this.c;
        if (view == null) {
            return;
        }
        view.setVisibility(8);
    }

    public void b() {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (this.d || (view = this.c) == null) {
        } else {
            view.setVisibility(0);
        }
    }
}
