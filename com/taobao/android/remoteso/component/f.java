package com.taobao.android.remoteso.component;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes6.dex */
public class f<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private volatile T f14792a;
    private volatile a<T> b;

    public void a(a<T> aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc78184", new Object[]{this, aVar});
            return;
        }
        this.b = aVar;
        T t = this.f14792a;
        if (aVar == null || t == null) {
            return;
        }
        aVar.a(t);
    }

    public void a(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6251244", new Object[]{this, t});
            return;
        }
        this.f14792a = t;
        a<T> aVar = this.b;
        if (aVar == null || t == null) {
            return;
        }
        aVar.a(t);
    }
}
