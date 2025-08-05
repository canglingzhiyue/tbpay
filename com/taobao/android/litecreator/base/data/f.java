package com.taobao.android.litecreator.base.data;

import com.android.alibaba.ip.runtime.IpChange;
import java.lang.Number;
import tb.kge;

/* loaded from: classes5.dex */
public final class f<T extends Number> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public T f13305a;
    public T b;

    static {
        kge.a(-335545044);
    }

    public f(T t, T t2) {
        this.f13305a = t;
        this.b = t2;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return this.f13305a + "x" + this.b;
    }
}
