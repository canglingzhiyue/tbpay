package com.taobao.search.m3;

import android.graphics.Canvas;
import android.graphics.Paint;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes7.dex */
public final class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1231293959);
    }

    public static final void a(Canvas canvas, Paint paint, float f, String text, float f2, float f3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fecfab38", new Object[]{canvas, paint, new Float(f), text, new Float(f2), new Float(f3)});
            return;
        }
        q.c(canvas, "canvas");
        q.c(paint, "paint");
        q.c(text, "text");
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        q.a((Object) fontMetrics, "paint.fontMetrics");
        canvas.drawText(text, f, f2 + ((((f3 - f2) - fontMetrics.bottom) - fontMetrics.top) / 2.0f), paint);
    }
}
