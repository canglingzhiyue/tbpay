package com.taobao.alivfssdk.fresco.common.internal;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes.dex */
public final class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-470066063);
    }

    public static <T> T a(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("9798556e", new Object[]{t});
        }
        if (t == null) {
            throw new NullPointerException();
        }
        return t;
    }
}
