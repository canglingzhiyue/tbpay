package com.taobao.android.weex_uikit.widget.text;

import android.graphics.Typeface;
import android.text.TextPaint;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.widget.FontDO;
import tb.kge;

/* loaded from: classes6.dex */
public class k {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-374868100);
    }

    public static int a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f3a64c25", new Object[]{str})).intValue() : StringUtils.equals(str, "italic") ? 2 : 0;
    }

    public static int b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3dd7e566", new Object[]{str})).intValue();
        }
        if (str == null) {
            return 0;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case 53430:
                if (str.equals("600")) {
                    c = 0;
                    break;
                }
                break;
            case 54391:
                if (str.equals("700")) {
                    c = 1;
                    break;
                }
                break;
            case 55352:
                if (str.equals("800")) {
                    c = 2;
                    break;
                }
                break;
            case 56313:
                if (str.equals("900")) {
                    c = 3;
                    break;
                }
                break;
            case 3029637:
                if (str.equals("bold")) {
                    c = 4;
                    break;
                }
                break;
        }
        return (c == 0 || c == 1 || c == 2 || c == 3 || c == 4) ? 1 : 0;
    }

    public static Typeface a(int i, int i2, String str) {
        IpChange ipChange = $ipChange;
        int i3 = 0;
        if (ipChange instanceof IpChange) {
            return (Typeface) ipChange.ipc$dispatch("d598a808", new Object[]{new Integer(i), new Integer(i2), str});
        }
        Typeface typeface = null;
        if (i2 == 1) {
            i3 = 1;
        }
        if (i == 2) {
            i3 |= 2;
        }
        if (str != null) {
            typeface = a(str, i3);
        }
        if (typeface != null) {
            return Typeface.create(typeface, i3);
        }
        return Typeface.defaultFromStyle(i3);
    }

    public static Typeface a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Typeface) ipChange.ipc$dispatch("490ec9c7", new Object[]{str, new Integer(i)});
        }
        FontDO a2 = com.taobao.android.weex_framework.widget.a.a().a(str);
        if (a2 != null && a2.c() != null) {
            return a2.c();
        }
        return Typeface.create(str, i);
    }

    public static Typeface a(TextPaint textPaint, int i, int i2, String str) {
        IpChange ipChange = $ipChange;
        int i3 = 0;
        if (ipChange instanceof IpChange) {
            return (Typeface) ipChange.ipc$dispatch("28d76f08", new Object[]{textPaint, new Integer(i), new Integer(i2), str});
        }
        Typeface typeface = textPaint.getTypeface();
        int style = typeface == null ? 0 : typeface.getStyle();
        if (i == 1 || ((style & 1) != 0 && i == -1)) {
            i3 = 1;
        }
        if (i2 == 2 || ((style & 2) != 0 && i2 == -1)) {
            i3 |= 2;
        }
        if (str != null) {
            typeface = a(str, i3);
        }
        if (typeface != null) {
            return Typeface.create(typeface, i3);
        }
        return Typeface.defaultFromStyle(i3);
    }

    public static void b(TextPaint textPaint, int i, int i2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21357b93", new Object[]{textPaint, new Integer(i), new Integer(i2), str});
        } else {
            textPaint.setTypeface(a(textPaint, i, i2, str));
        }
    }
}
