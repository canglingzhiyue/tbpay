package com.taobao.android.navigationextern;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final d f14462a = new d();

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
        } else if (context == null) {
        } else {
            f14462a.a(context.getApplicationContext());
            e.g();
        }
    }
}
