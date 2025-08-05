package com.taobao.search.sf.remote;

import android.app.Activity;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.q;
import tb.ium;
import tb.iur;
import tb.kge;

/* loaded from: classes8.dex */
public final class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Activity f19486a;
    private final ium b;
    private final Object c;
    private final ViewGroup d;
    private final iur e;

    static {
        kge.a(-350848862);
    }

    public d(Activity activity, ium parent, Object obj, ViewGroup viewGroup, iur iurVar) {
        q.c(activity, "activity");
        q.c(parent, "parent");
        this.f19486a = activity;
        this.b = parent;
        this.c = obj;
        this.d = viewGroup;
        this.e = iurVar;
    }

    public final Activity a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Activity) ipChange.ipc$dispatch("2162bf40", new Object[]{this}) : this.f19486a;
    }

    public final ium b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ium) ipChange.ipc$dispatch("16b7c9dc", new Object[]{this}) : this.b;
    }

    public final Object c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("ca3f7d08", new Object[]{this}) : this.c;
    }

    public final ViewGroup d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("5ee44eca", new Object[]{this}) : this.d;
    }

    public final iur e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (iur) ipChange.ipc$dispatch("2dccba94", new Object[]{this}) : this.e;
    }
}
