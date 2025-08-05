package com.alibaba.android.split.core.splitinstall;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import tb.asi;
import tb.kge;

/* loaded from: classes.dex */
public class h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static asi f2466a;

    static {
        kge.a(293072306);
        f2466a = (asi) com.alibaba.android.split.a.a((Class<? extends Object>) asi.class, new Object[0]);
    }

    public static g a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (g) ipChange.ipc$dispatch("7ecfbfe", new Object[]{context}) : f2466a.a(context);
    }
}
