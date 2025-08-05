package com.taobao.taolive.room.utils;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.pmd;
import tb.ppx;

/* loaded from: classes8.dex */
public class k {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static ppx f21771a;

    static {
        kge.a(898240562);
    }

    public static int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[0])).intValue();
        }
        if (f21771a == null && pmd.a().v() != null) {
            f21771a = pmd.a().v().c();
        }
        ppx ppxVar = f21771a;
        if (ppxVar == null) {
            return -1;
        }
        return ppxVar.f32806a;
    }
}
