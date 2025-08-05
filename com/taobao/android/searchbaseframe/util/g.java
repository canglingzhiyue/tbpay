package com.taobao.android.searchbaseframe.util;

import android.graphics.Color;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes6.dex */
public class g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-498348586);
    }

    public static int a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8123ad04", new Object[]{str, new Integer(i)})).intValue();
        }
        if (str != null && str.length() != 0) {
            try {
                return Color.parseColor(str);
            } catch (Exception unused) {
                k.a("ParseUtil", "error while parsing " + str);
            }
        }
        return i;
    }

    public static Integer a(String str, Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("6399f4ec", new Object[]{str, num});
        }
        if (str != null && str.length() != 0) {
            try {
                return Integer.valueOf(Color.parseColor(str));
            } catch (Exception unused) {
                k.a("ParseUtil", "error while parsing " + str);
            }
        }
        return num;
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
                k.e("ParseUtil", "error while parsing " + str);
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
                k.e("ParseUtil", "error while parsing " + str);
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
                k.e("ParseUtil", "error while parsing " + str);
            }
        }
        return f;
    }

    public static boolean a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8123ece6", new Object[]{str, new Boolean(z)})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return z;
        }
        try {
            return Boolean.parseBoolean(str);
        } catch (Exception unused) {
            return z;
        }
    }
}
