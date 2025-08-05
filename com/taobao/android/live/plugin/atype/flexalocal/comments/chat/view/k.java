package com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes5.dex */
public class k extends ImageSpan {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Context f13674a;
    private String b;

    static {
        kge.a(1161502421);
    }

    public k(Context context, Drawable drawable, String str) {
        super(drawable);
        this.f13674a = context;
        this.b = str;
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("46263898", new Object[]{this, paint, charSequence, new Integer(i), new Integer(i2), fontMetricsInt})).intValue();
        }
        Rect bounds = getDrawable().getBounds();
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
            int i3 = fontMetricsInt2.bottom - fontMetricsInt2.top;
            int i4 = (bounds.bottom - bounds.top) / 2;
            int i5 = i3 / 4;
            int i6 = i4 - i5;
            int i7 = -(i4 + i5);
            fontMetricsInt.ascent = i7;
            fontMetricsInt.top = i7;
            fontMetricsInt.bottom = i6;
            fontMetricsInt.descent = i6;
        }
        return bounds.right;
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        float f2;
        int a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5acc076", new Object[]{this, canvas, charSequence, new Integer(i), new Integer(i2), new Float(f), new Integer(i3), new Integer(i4), new Integer(i5), paint});
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
        Drawable drawable = getDrawable();
        canvas.save();
        canvas.translate(f, i4 + (((fontMetricsInt.descent + fontMetricsInt.ascent) - drawable.getBounds().bottom) / 2));
        drawable.draw(canvas);
        canvas.restore();
        paint.setTextSize(com.taobao.taolive.room.utils.d.a(this.f13674a, 10.0f));
        float a3 = com.taobao.taolive.room.utils.d.a(this.f13674a, 18.0f) + f;
        if (this.b.length() == 1) {
            a2 = com.taobao.taolive.room.utils.d.a(this.f13674a, 26.0f);
        } else if (this.b.length() == 2) {
            a2 = com.taobao.taolive.room.utils.d.a(this.f13674a, 22.0f);
        } else {
            f2 = a3;
            canvas.drawText(charSequence, i, i2, f2, i4 - com.taobao.taolive.room.utils.d.a(this.f13674a, 1.0f), paint);
        }
        f2 = f + a2;
        canvas.drawText(charSequence, i, i2, f2, i4 - com.taobao.taolive.room.utils.d.a(this.f13674a, 1.0f), paint);
    }
}
