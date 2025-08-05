package com.taobao.android.fluid.framework.adapter.mtop;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes5.dex */
public final class d<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int RET_CODE_FAILED = 0;
    public static final int RET_CODE_SUCCESS = 1;

    /* renamed from: a  reason: collision with root package name */
    public static d<Void> f12462a;
    public static d<Void> b;
    public final int c;
    public final String d;
    public final T e;
    public Object f;

    static {
        kge.a(-446641957);
        f12462a = new d<>(1, "", null);
        b = new d<>(0, "", null);
    }

    private d(int i, String str, T t) {
        this.c = i;
        this.d = str;
        this.e = t;
    }

    public final <O> d<O> a(String str, O o) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("46540a79", new Object[]{this, str, o}) : new d<>(this.c, str, o);
    }

    public d<T> a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("ee3e6faf", new Object[]{this, obj});
        }
        this.f = obj;
        return this;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue() : (obj instanceof d) && ((d) obj).c == this.c;
    }

    public boolean a(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("cf6a2f57", new Object[]{this, dVar})).booleanValue() : dVar != null && this.c == dVar.c;
    }
}
