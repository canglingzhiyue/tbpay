package com.taobao.themis.container.utils;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.adapter.IEnvironmentService;
import tb.kge;
import tb.qpt;

/* loaded from: classes9.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(716747214);
    }

    public static String a(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fe74945d", new Object[]{context, new Integer(i)});
        }
        if (context != null) {
            return context.getString(i);
        }
        return b(i);
    }

    private static String b(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("da9643a6", new Object[]{new Integer(i)}) : ((IEnvironmentService) qpt.a(IEnvironmentService.class)).getApplicationContext().getString(i);
    }
}
