package com.taobao.rxm.schedule;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes7.dex */
public class f<OUT> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f19010a;
    public boolean b;
    public OUT c;
    public float d;
    public Throwable e;

    public f(int i, boolean z) {
        this.f19010a = i;
        this.b = z;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "type:" + this.f19010a + ",isLast:" + this.b;
    }
}
