package com.taobao.android.weex_framework.util;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSValue;
import tb.kge;

/* loaded from: classes6.dex */
public class i {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(235844509);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        }
    }

    public static float a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a821938b", new Object[]{new Integer(i)})).floatValue() : (i * l.d(com.taobao.android.weex_framework.m.b)) / 750.0f;
    }

    public static float a(float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a8218848", new Object[]{new Float(f)})).floatValue() : (f * l.d(com.taobao.android.weex_framework.m.b)) / 750.0f;
    }

    public static float a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f3a64c22", new Object[]{str})).floatValue() : a(str, 1.0f);
    }

    public static float a(String str, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8123a1be", new Object[]{str, new Float(f)})).floatValue();
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("value is empty or null");
        }
        if (str.length() > 2) {
            char charAt = str.charAt(str.length() - 1);
            char charAt2 = str.charAt(str.length() - 2);
            if (charAt == 'x' && charAt2 == 'p') {
                if (str.length() > 3 && str.charAt(str.length() - 3) == 'r') {
                    return d(str.substring(0, str.length() - 3));
                }
                return Float.parseFloat(str.substring(0, str.length() - 2)) * l.c(com.taobao.android.weex_framework.m.b);
            } else if (charAt == 'm' && charAt2 == 'e' && str.length() > 3) {
                return a(c(str) * f);
            } else {
                return d(str);
            }
        }
        return d(str);
    }

    public static float b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3dd7e563", new Object[]{str})).floatValue() : b(str, 1.0f);
    }

    public static float b(String str, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7d25309d", new Object[]{str, new Float(f)})).floatValue();
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("value is empty or null");
        }
        if (str.length() > 2) {
            char charAt = str.charAt(str.length() - 1);
            char charAt2 = str.charAt(str.length() - 2);
            if (charAt == 'x' && charAt2 == 'p') {
                if (str.length() > 3 && str.charAt(str.length() - 3) == 'r') {
                    return Float.parseFloat(str.substring(0, str.length() - 3));
                }
                float parseFloat = Float.parseFloat(str.substring(0, str.length() - 2));
                Application application = com.taobao.android.weex_framework.m.b;
                return ((parseFloat * 750.0f) * l.c(application)) / l.d(application);
            } else if (charAt == 'm' && charAt2 == 'e' && str.length() > 3) {
                return c(str) * f;
            } else {
                return Float.parseFloat(str);
            }
        }
        return Float.parseFloat(str);
    }

    private static float c(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("88097ea4", new Object[]{str})).floatValue() : Float.parseFloat(str.substring(0, str.length() - 3));
    }

    public static float a(MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("42efcb05", new Object[]{mUSValue})).floatValue() : a(mUSValue, 1.0f);
    }

    public static float a(MUSValue mUSValue, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1b09ff3b", new Object[]{mUSValue, new Float(f)})).floatValue();
        }
        if (mUSValue == null) {
            throw new IllegalArgumentException("value is null");
        }
        int type = mUSValue.getType();
        if (type == 2 || type == 3) {
            return a(mUSValue.convertToFloat());
        }
        if (type == 4) {
            return a(mUSValue.getStringValue(), f);
        }
        throw new IllegalArgumentException("Float can't parse from attr value type: " + mUSValue.toString());
    }

    private static float d(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d23b17e5", new Object[]{str})).floatValue() : a(Float.parseFloat(str));
    }

    public static float a(Context context, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("258f9a93", new Object[]{context, new Integer(i)})).floatValue() : i / context.getResources().getDisplayMetrics().density;
    }

    public static float a(Context context, float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("258f8f50", new Object[]{context, new Float(f)})).floatValue() : f / context.getResources().getDisplayMetrics().density;
    }

    public static float b(Context context, float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3a785791", new Object[]{context, new Float(f)})).floatValue() : f * context.getResources().getDisplayMetrics().density;
    }
}
