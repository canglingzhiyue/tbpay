package com.taobao.downgrade;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* loaded from: classes.dex */
public class h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static String a(Map<String, Object> map, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("696f900f", new Object[]{map, str, str2});
        }
        Object obj = map.get(str);
        return obj instanceof String ? (String) obj : str2;
    }

    public static int a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f3a64c25", new Object[]{str})).intValue() : a(str, -1);
    }

    public static int a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8123ad04", new Object[]{str, new Integer(i)})).intValue();
        }
        try {
            return Integer.valueOf(str).intValue();
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    public static float b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3dd7e563", new Object[]{str})).floatValue() : a(str, -1.0f);
    }

    public static float a(String str, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8123a1be", new Object[]{str, new Float(f)})).floatValue();
        }
        try {
            if (str.indexOf(".") != str.lastIndexOf(".")) {
                str = str.substring(0, str.lastIndexOf(".")) + str.substring(str.lastIndexOf(".") + 1);
            }
            return Float.valueOf(str).floatValue();
        } catch (NumberFormatException unused) {
            return f;
        }
    }
}
