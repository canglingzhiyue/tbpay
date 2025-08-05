package com.alibaba.android.split.core.tasks;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes.dex */
public final class m<TResult> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private i<TResult> f2487a = new i<>();

    static {
        kge.a(-1585930605);
    }

    public final boolean a(TResult tresult) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a6251248", new Object[]{this, tresult})).booleanValue() : this.f2487a.b(tresult);
    }

    public final boolean a(Exception exc) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("dd91d322", new Object[]{this, exc})).booleanValue() : this.f2487a.a(exc);
    }

    public final h<TResult> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (h) ipChange.ipc$dispatch("73895db0", new Object[]{this}) : this.f2487a;
    }
}
