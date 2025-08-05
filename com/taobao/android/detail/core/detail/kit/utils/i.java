package com.taobao.android.detail.core.detail.kit.utils;

import com.android.alibaba.ip.runtime.IpChange;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class i {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1935488355);
        emu.a("com.taobao.android.detail.core.detail.kit.utils.PriceFormater");
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        if (str == null || str.indexOf(".") == -1 || str.indexOf(".") >= str.length() - 1) {
            return str;
        }
        int indexOf = str.indexOf(".");
        int length = str.length();
        for (int length2 = str.length() - 1; length2 > indexOf && str.charAt(length2) == '0'; length2--) {
            length--;
        }
        if (length - 1 == indexOf) {
            length--;
        }
        return str.substring(0, length);
    }
}
