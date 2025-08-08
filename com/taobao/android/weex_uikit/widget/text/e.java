package com.taobao.android.weex_uikit.widget.text;

import android.os.Build;
import android.support.v4.text.TextDirectionHeuristicCompat;
import android.support.v4.text.TextDirectionHeuristicsCompat;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Constructor;
import tb.kge;

/* loaded from: classes6.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Constructor f16215a;
    private static boolean b;

    static {
        kge.a(1595496135);
    }

    private static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else if (b || Build.VERSION.SDK_INT < 18) {
        } else {
            b = true;
            try {
                Constructor constructor = StaticLayout.class.getConstructor(CharSequence.class, Integer.TYPE, Integer.TYPE, TextPaint.class, Integer.TYPE, Layout.Alignment.class, TextDirectionHeuristic.class, Float.TYPE, Float.TYPE, Boolean.TYPE, StringUtils.TruncateAt.class, Integer.TYPE, Integer.TYPE);
                constructor.setAccessible(true);
                f16215a = constructor;
            } catch (NoSuchMethodException e) {
                com.taobao.android.weex_framework.monitor.b.a();
                com.taobao.android.weex_framework.util.g.c(e.class.getSimpleName(), e);
            }
        }
    }

    public static StaticLayout a(CharSequence charSequence, int i, int i2, TextPaint textPaint, int i3, Layout.Alignment alignment, float f, float f2, boolean z, StringUtils.TruncateAt truncateAt, int i4, int i5, TextDirectionHeuristicCompat textDirectionHeuristicCompat) throws Exception {
        a();
        try {
            if (f16215a != null) {
                return (StaticLayout) f16215a.newInstance(charSequence, Integer.valueOf(i), Integer.valueOf(i2), textPaint, Integer.valueOf(i3), alignment, a(textDirectionHeuristicCompat), Float.valueOf(f), Float.valueOf(f2), Boolean.valueOf(z), truncateAt, Integer.valueOf(i4), Integer.valueOf(i5));
            }
            return new StaticLayout(charSequence, i, i2, textPaint, i3, alignment, f, f2, z, truncateAt, i4);
        } catch (Exception e) {
            if (e.getMessage().contains("utext_close")) {
                return new StaticLayout(charSequence, i, i2, textPaint, i3, alignment, f, f2, z, truncateAt, i4);
            }
            throw e;
        }
    }

    public static TextDirectionHeuristic a(TextDirectionHeuristicCompat textDirectionHeuristicCompat) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextDirectionHeuristic) ipChange.ipc$dispatch("96991223", new Object[]{textDirectionHeuristicCompat});
        }
        if (Build.VERSION.SDK_INT >= 18) {
            if (textDirectionHeuristicCompat == TextDirectionHeuristicsCompat.LTR) {
                return TextDirectionHeuristics.LTR;
            }
            if (textDirectionHeuristicCompat == TextDirectionHeuristicsCompat.RTL) {
                return TextDirectionHeuristics.RTL;
            }
            if (textDirectionHeuristicCompat == TextDirectionHeuristicsCompat.FIRSTSTRONG_LTR) {
                return TextDirectionHeuristics.FIRSTSTRONG_LTR;
            }
            if (textDirectionHeuristicCompat == TextDirectionHeuristicsCompat.FIRSTSTRONG_RTL) {
                return TextDirectionHeuristics.FIRSTSTRONG_RTL;
            }
            if (textDirectionHeuristicCompat == TextDirectionHeuristicsCompat.ANYRTL_LTR) {
                return TextDirectionHeuristics.ANYRTL_LTR;
            }
            if (textDirectionHeuristicCompat == TextDirectionHeuristicsCompat.LOCALE) {
                return TextDirectionHeuristics.LOCALE;
            }
            return TextDirectionHeuristics.FIRSTSTRONG_LTR;
        }
        return TextDirectionHeuristics.LTR;
    }
}
