package com.alipay.android.msp.framework.dynfun;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class DynDataWrapper<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private T f4697a;
    private final int b;
    private final String c;

    public DynDataWrapper(int i, String str, T t) {
        this.b = i;
        this.c = str;
        this.f4697a = t;
        if (drmEnabled()) {
            NativeDynFunManager.registerData(i, str, this);
        }
    }

    public void write(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aee59742", new Object[]{this, t});
        } else {
            this.f4697a = t;
        }
    }

    public void a(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6251244", new Object[]{this, t});
        } else {
            this.f4697a = t;
        }
    }

    public T read() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("b7aff1b5", new Object[]{this}) : this.f4697a;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "DynDataWrapper{val=" + this.f4697a + ", bizId=" + this.b + ", name='" + this.c + "'}";
    }

    public static boolean drmEnabled() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c604402d", new Object[0])).booleanValue() : DynConstants.a();
    }
}
