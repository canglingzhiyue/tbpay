package com.taobao.android.livehome.plugin.atype.flexalocal.utils;

import com.android.alibaba.ip.runtime.IpChange;
import tb.aks;
import tb.kge;

/* loaded from: classes6.dex */
public class q {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int HIGH_DEVICE = 1;
    public static final int LOW_DEVICE = 3;
    public static final int MIDDLE_DEVICE = 2;
    public static final int UNKNOWN_DEVICE = 0;

    /* renamed from: a  reason: collision with root package name */
    private static aks.d f14225a;

    static {
        kge.a(333211947);
    }

    public static int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[0])).intValue();
        }
        if (f14225a == null) {
            f14225a = aks.a().g();
        }
        aks.d dVar = f14225a;
        if (dVar == null) {
            return -1;
        }
        return dVar.f25407a;
    }
}
