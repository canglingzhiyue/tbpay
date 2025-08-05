package com.taobao.themis.pub_kit.utils;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.utils.n;
import tb.kge;

/* loaded from: classes9.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1260971386);
    }

    public static boolean a(Context context, String str, String str2, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a5c7bcd8", new Object[]{context, str, str2, new Integer(i), new Integer(i2)})).booleanValue();
        }
        if (!n.a()) {
            return false;
        }
        if (i == 0 || i2 == 0) {
            return true;
        }
        String str3 = "pub_add_guide_start_time_" + str + "_" + str2;
        String str4 = "pub_add_guide_times_" + str + "_" + str2;
        long b = com.taobao.themis.utils.j.b(context, str3, 0L);
        int b2 = com.taobao.themis.utils.j.b(context, str4, 0);
        if (b == 0 || System.currentTimeMillis() - b > i * 24 * 60 * 60 * 1000) {
            com.taobao.themis.utils.j.a(context, str3, System.currentTimeMillis());
            com.taobao.themis.utils.j.a(context, str4, 0);
            return false;
        }
        int i3 = b2 + 1;
        com.taobao.themis.utils.j.a(context, str4, i3);
        return i3 >= i2;
    }

    public static boolean a(Context context, String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("602fb813", new Object[]{context, str, str2, new Integer(i)})).booleanValue();
        }
        if (!n.a()) {
            return false;
        }
        int b = com.taobao.themis.utils.j.b(context, "pubArea_enter_times_" + str + "_" + str2, 0);
        if (b >= i) {
            return true;
        }
        com.taobao.themis.utils.j.a(context, "pubArea_enter_times_" + str + "_" + str2, b + 1);
        return false;
    }
}
