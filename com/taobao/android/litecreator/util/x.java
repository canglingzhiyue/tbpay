package com.taobao.android.litecreator.util;

import android.graphics.Color;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes5.dex */
public class x {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ERROR_COLOR = -16777216;
    public static final String ERROR_COLOR_STRING = "#ff000000";

    static {
        kge.a(325613093);
    }

    public static int a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3a64c25", new Object[]{str})).intValue();
        }
        if (StringUtils.isEmpty(str)) {
            return -16777216;
        }
        if (str.startsWith("#")) {
            try {
                return Color.parseColor(str);
            } catch (Exception e) {
                u.d("LcColorUtil", "parsing color string :" + str + " error:" + e);
            }
        }
        if (str.startsWith("0x") || str.startsWith("0X")) {
            try {
                return Color.parseColor("#" + str.substring(2));
            } catch (Exception e2) {
                u.d("LcColorUtil", "parsing color int1 :" + str + " error:" + e2);
            }
        }
        try {
            return Integer.parseInt(str);
        } catch (Exception e3) {
            u.d("LcColorUtil", "parsing color int2 :" + str + " error:" + e3);
            StringBuilder sb = new StringBuilder();
            sb.append("parsing color failed due to value =");
            sb.append(str);
            u.d("LcColorUtil", sb.toString());
            return -16777216;
        }
    }

    public static String a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9064aa65", new Object[]{new Integer(i)});
        }
        try {
            return "#" + Integer.toHexString(i);
        } catch (Exception unused) {
            u.d("LcColorUtil", "from int into string. origin =" + i);
            return ERROR_COLOR_STRING;
        }
    }
}
