package com.taobao.android.litecreator.util;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.kge;

/* loaded from: classes5.dex */
public class ac {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1100863550);
    }

    public static void a(Map map, String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8610c43", new Object[]{map, str, str2, new Boolean(z)});
        } else if ((StringUtils.isEmpty(str2) && !z) || map == null) {
        } else {
            if (StringUtils.isEmpty(str2)) {
                str2 = "";
            }
            map.put(str, str2);
        }
    }

    public static void a(Map map, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38873cb1", new Object[]{map, str, str2});
        } else {
            a(map, str, str2, false);
        }
    }

    public static int a(Map map, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1ec6792f", new Object[]{map, str, new Integer(i)})).intValue();
        }
        if (!StringUtils.isEmpty(str) && map != null && map.containsKey(str)) {
            try {
                return Integer.parseInt(String.valueOf(map.get(str)));
            } catch (Throwable unused) {
            }
        }
        return i;
    }

    public static long a(Map map, String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1ec67cf1", new Object[]{map, str, new Long(j)})).longValue();
        }
        if (!StringUtils.isEmpty(str) && map != null && map.containsKey(str)) {
            try {
                return Long.parseLong(String.valueOf(map.get(str)));
            } catch (Throwable unused) {
            }
        }
        return j;
    }

    public static float a(Map map, String str, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1ec66de9", new Object[]{map, str, new Float(f)})).floatValue();
        }
        if (!StringUtils.isEmpty(str) && map != null && map.containsKey(str)) {
            try {
                return Float.parseFloat(String.valueOf(map.get(str)));
            } catch (Throwable unused) {
            }
        }
        return f;
    }

    public static boolean a(Map map, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1ec6b911", new Object[]{map, str, new Boolean(z)})).booleanValue();
        }
        if (!StringUtils.isEmpty(str) && map != null && map.containsKey(str)) {
            try {
                return Boolean.parseBoolean(String.valueOf(map.get(str)));
            } catch (Throwable unused) {
            }
        }
        return z;
    }

    public static String b(Map map, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("307b7710", new Object[]{map, str, str2});
        }
        if (!StringUtils.isEmpty(str) && map != null && map.containsKey(str)) {
            try {
                return String.valueOf(map.get(str));
            } catch (Throwable unused) {
            }
        }
        return str2;
    }
}
