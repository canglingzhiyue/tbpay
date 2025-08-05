package com.taobao.themis.utils;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes9.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1673563292);
    }

    public static Bitmap a(View view, int i, int i2, int i3, int i4) {
        Bitmap createBitmap;
        Canvas canvas;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("c7683808", new Object[]{view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        }
        if (view == null || i <= 0 || i2 <= 0) {
            return null;
        }
        if (i3 > 0 || i4 > 0) {
            Bitmap createBitmap2 = Bitmap.createBitmap(view.getMeasuredWidth(), view.getMeasuredHeight(), Bitmap.Config.ARGB_4444);
            view.draw(new Canvas(createBitmap2));
            createBitmap = Bitmap.createBitmap(createBitmap2, i3, i4, i, i2);
            canvas = new Canvas(createBitmap);
        } else {
            createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_4444);
            canvas = new Canvas(createBitmap);
            view.draw(canvas);
        }
        canvas.drawBitmap(createBitmap, 0.0f, 0.0f, new Paint());
        return createBitmap;
    }
}
