package com.taobao.search.mmd.util;

import android.graphics.Color;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.common.util.q;
import tb.kge;

@Deprecated
/* loaded from: classes7.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(966736647);
    }

    public static int a(int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5c1152bb", new Object[]{new Integer(i), new Integer(i2)})).intValue() : Color.argb(i, Color.red(i2), Color.green(i2), Color.blue(i2));
    }

    public static int a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8123ad04", new Object[]{str, new Integer(i)})).intValue();
        }
        if (str != null && str.length() != 0) {
            if ("transparent".equalsIgnoreCase(str)) {
                return 0;
            }
            try {
                return Color.parseColor(str);
            } catch (Exception unused) {
                q.i("ParseUtil", "error while parsing " + str);
            }
        }
        return i;
    }

    public static int b(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7d253be3", new Object[]{str, new Integer(i)})).intValue();
        }
        if (str != null && str.length() != 0) {
            try {
                return Integer.parseInt(str);
            } catch (Exception unused) {
                q.i("ParseUtil", "error while parsing " + str);
            }
        }
        return i;
    }

    public static int a(String str, int i, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f4196d98", new Object[]{str, new Integer(i), str2, str3})).intValue();
        }
        if (str != null && str.length() != 0) {
            try {
                return Integer.parseInt(str);
            } catch (Exception unused) {
                q.i(str2, str3 + " --- parsing: " + str);
            }
        }
        return i;
    }

    public static long a(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8123b0c6", new Object[]{str, new Long(j)})).longValue();
        }
        if (str != null && str.length() != 0) {
            try {
                return Long.parseLong(str);
            } catch (Exception unused) {
                q.i("ParseUtil", "error while parsing " + str);
            }
        }
        return j;
    }

    public static float a(String str, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8123a1be", new Object[]{str, new Float(f)})).floatValue();
        }
        if (str != null && str.length() != 0) {
            try {
                return Float.parseFloat(str);
            } catch (Exception unused) {
                q.i("ParseUtil", "error while parsing " + str);
            }
        }
        return f;
    }

    public static boolean a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8123ece6", new Object[]{str, new Boolean(z)})).booleanValue();
        }
        if (str != null && str.length() != 0) {
            try {
                return Boolean.parseBoolean(str);
            } catch (Exception unused) {
                q.i("ParseUtil", "error while parsing " + str);
            }
        }
        return z;
    }
}
