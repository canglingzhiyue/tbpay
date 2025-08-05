package com.taobao.android.job.core.graph;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static <T, R> d<T, R> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("58ea2541", new Object[0]) : new DependencyGraphImpl();
    }

    public static <T, R> void a(d<T, R> dVar) throws GraphCycleDetectedException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56f78d81", new Object[]{dVar});
        } else {
            new b().a(dVar);
        }
    }
}
