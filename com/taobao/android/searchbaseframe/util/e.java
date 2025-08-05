package com.taobao.android.searchbaseframe.util;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes6.dex */
public class e<F, S> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public F f15014a;
    public S b;

    static {
        kge.a(774534585);
    }

    public e(F f, S s) {
        this.f15014a = f;
        this.b = s;
    }

    public static <F, S> e<F, S> a(F f, S s) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("b08e0c8b", new Object[]{f, s}) : new e<>(f, s);
    }
}
