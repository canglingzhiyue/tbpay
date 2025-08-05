package com.alipay.mobile.common.transport.utils;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public abstract class Singleton<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private T f5636a;

    public abstract T create();

    public final T get() {
        T t;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("6352d3f5", new Object[]{this});
        }
        synchronized (this) {
            if (this.f5636a == null) {
                this.f5636a = create();
            }
            t = this.f5636a;
        }
        return t;
    }
}
