package com.taobao.android.job.core.graph;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static <T, R> Node<T, R> a(T t) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Node) ipChange.ipc$dispatch("c0eb23d3", new Object[]{t}) : new Node<>(t);
    }
}
