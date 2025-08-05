package com.taobao.android.detail.core.detail.kit.utils;

import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.framework.common.ExceptionCode;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class m {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(379818190);
        emu.a("com.taobao.android.detail.core.detail.kit.utils.TaoStringUtils");
    }

    public static String a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9064aa65", new Object[]{new Integer(i)});
        }
        if (i <= 0) {
            return "0";
        }
        if (i < 10000) {
            return String.valueOf(i);
        }
        if (i < 10000000) {
            return (i / 10000) + "." + ((i % 10000) / 1000) + "万";
        } else if (i < 100000000) {
            return (i / 10000) + "万";
        } else {
            return (i / 100000000) + "." + ((i % 100000000) / ExceptionCode.CRASH_EXCEPTION) + "亿";
        }
    }

    public static int a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3a64c25", new Object[]{str})).intValue();
        }
        try {
            return Integer.parseInt(str);
        } catch (Exception unused) {
            return 0;
        }
    }
}
