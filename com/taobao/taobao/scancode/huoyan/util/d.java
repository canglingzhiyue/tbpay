package com.taobao.taobao.scancode.huoyan.util;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes8.dex */
public abstract class d<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(700051838);
    }

    public abstract void a(T t, String str);

    public void a(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb9ad88d", new Object[]{this, th});
        }
    }
}
