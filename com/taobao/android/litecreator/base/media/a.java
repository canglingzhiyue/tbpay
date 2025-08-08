package com.taobao.android.litecreator.base.media;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes5.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(449981906);
    }

    public static int a(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("2619792e", new Object[]{new Integer(i), new Integer(i2), new Integer(i3)})).intValue() : (i3 == 90 || i3 == 270) ? i2 : i;
    }

    public static int b(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8dfaa60d", new Object[]{new Integer(i), new Integer(i2), new Integer(i3)})).intValue() : (i3 == 90 || i3 == 270) ? i : i2;
    }

    public static String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{str, str2}) : a(str, str2, "");
    }

    public static String a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("457cf91a", new Object[]{str, str2, str3});
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(":");
        if (StringUtils.isEmpty(str2)) {
            str2 = str3;
        }
        sb.append(str2);
        return sb.toString();
    }
}
