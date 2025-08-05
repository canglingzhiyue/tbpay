package com.taobao.message.lab.comfrm.inner2.lazy;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes7.dex */
public class LazyInitObjectRef<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private T object;

    static {
        kge.a(475480598);
    }

    public void initObject(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fd85bd2", new Object[]{this, t});
        } else if (this.object != null) {
            throw new IllegalStateException("禁止重复初始化");
        } else {
            this.object = t;
        }
    }

    public T get() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("6352d3f5", new Object[]{this});
        }
        T t = this.object;
        if (t == null) {
            throw new IllegalStateException("需要先初始化，才能调用get方法");
        }
        return t;
    }

    public boolean isInit() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e0a588e5", new Object[]{this})).booleanValue() : this.object != null;
    }
}
