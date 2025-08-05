package com.taobao.weex.utils;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.application.common.c;
import com.taobao.application.common.d;
import tb.kge;

/* loaded from: classes9.dex */
public class BaseUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1065039111);
    }

    public static boolean isLowDevice() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("522b454b", new Object[0])).booleanValue();
        }
        d a2 = c.a();
        return a2 != null && a2.a("deviceLevel", -1) == 2;
    }
}
