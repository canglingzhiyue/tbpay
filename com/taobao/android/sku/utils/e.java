package com.taobao.android.sku.utils;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes6.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Boolean f15205a;

    static {
        kge.a(2089000033);
    }

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
        } else if (f15205a != null) {
        } else {
            try {
                if ((context.getApplicationInfo().flags & 2) != 0) {
                    z = true;
                }
            } catch (Exception unused) {
            }
            f15205a = Boolean.valueOf(z);
        }
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue();
        }
        Boolean bool = f15205a;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }
}
