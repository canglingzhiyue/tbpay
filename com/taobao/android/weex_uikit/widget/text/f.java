package com.taobao.android.weex_uikit.widget.text;

import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.support.v4.text.TextDirectionHeuristicCompat;
import android.text.Layout;
import tb.kge;

/* loaded from: classes6.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    public static final Typeface f16216a;
    public static final Layout.Alignment b;
    public static final ColorStateList c;
    public static final int d;
    public static final VerticalGravity e;
    public static final TextDirectionHeuristicCompat f;
    private static final int[][] g;
    private static final int[] h;

    static {
        kge.a(-22948909);
        f16216a = Typeface.DEFAULT;
        int i = 0;
        g = new int[][]{new int[]{0}};
        h = new int[]{-16777216};
        b = Layout.Alignment.ALIGN_NORMAL;
        c = new ColorStateList(g, h);
        Typeface typeface = f16216a;
        if (typeface != null) {
            i = typeface.getStyle();
        }
        d = i;
        e = VerticalGravity.TOP;
        f = null;
    }
}
