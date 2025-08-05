package com.alibaba.android.patronus;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes2.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Boolean f2409a;

    public static boolean a(Context context) {
        Boolean bool;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            bool = (Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{context});
        } else {
            Boolean bool2 = f2409a;
            if (bool2 != null) {
                return bool2.booleanValue();
            }
            try {
                if ((context.getApplicationInfo().flags & 2) == 0) {
                    z = false;
                }
                f2409a = Boolean.valueOf(z);
            } catch (Exception unused) {
                f2409a = false;
            }
            bool = f2409a;
        }
        return bool.booleanValue();
    }
}
