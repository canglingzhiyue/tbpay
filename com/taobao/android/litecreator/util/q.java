package com.taobao.android.litecreator.util;

import android.graphics.Rect;
import android.text.TextPaint;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes5.dex */
public class q {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1970818385);
    }

    public static CharSequence a(CharSequence charSequence, TextPaint textPaint, int i) {
        int ceil;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence) ipChange.ipc$dispatch("a6c39163", new Object[]{charSequence, textPaint, new Integer(i)});
        }
        Rect rect = new Rect();
        textPaint.getTextBounds(charSequence.toString(), 0, charSequence.length(), rect);
        if (rect.width() > i || (ceil = (int) Math.ceil((i - rect.width()) / a(textPaint))) <= 0) {
            return charSequence;
        }
        int length = charSequence.toString().length() + ceil;
        return a(b(charSequence.toString(), length / 2), length);
    }

    private static float a(TextPaint textPaint) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("92df7358", new Object[]{textPaint})).floatValue();
        }
        Rect rect = new Rect();
        textPaint.getTextBounds("a a", 0, 3, rect);
        Rect rect2 = new Rect();
        textPaint.getTextBounds(new char[]{'a'}, 0, 1, rect2);
        return rect.width() - (rect2.width() << 1);
    }

    public static String a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("75f5ebaf", new Object[]{str, new Integer(i)});
        }
        return String.format("%1$-" + i + "s", str);
    }

    public static String b(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("29616b0", new Object[]{str, new Integer(i)});
        }
        return String.format("%1$" + i + "s", str);
    }
}
