package com.alipay.mobile.security.bio.task;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class ActionFrame<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private T f5821a;

    public ActionFrame(T t) {
        this.f5821a = t;
    }

    public T getObject() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("a8d7ee76", new Object[]{this}) : this.f5821a;
    }
}
