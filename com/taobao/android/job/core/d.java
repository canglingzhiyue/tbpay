package com.taobao.android.job.core;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static <T, R> a<T, R> a(b<T, R> bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("fd282efd", new Object[]{bVar}) : new c(bVar);
    }
}
