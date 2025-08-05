package com.taobao.message.uikit.text.style;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.uikit.util.ApplicationUtil;
import com.taobao.message.uikit.util.DisplayUtil;
import tb.kge;

/* loaded from: classes7.dex */
public class EllipsizeLineSpan extends ReplacementSpan {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DEFAULT_COLOR_INT = -16744193;
    public int color;
    public boolean isSingleLine = true;
    public int maxWidth;
    public int screenLimit;

    static {
        kge.a(1967124435);
    }

    public EllipsizeLineSpan(int i) {
        this.screenLimit = 0;
        this.color = DEFAULT_COLOR_INT;
        this.screenLimit = DisplayUtil.getScreenWidth() - DisplayUtil.dip2px(ApplicationUtil.getApplication(), 64.0f);
        this.color = i;
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("46263898", new Object[]{this, paint, charSequence, new Integer(i), new Integer(i2), fontMetricsInt})).intValue();
        }
        paint.measureText(charSequence, 0, charSequence.length());
        this.maxWidth = (int) paint.measureText("…");
        if (i2 - i > 10) {
            this.maxWidth += (int) paint.measureText(charSequence, i, i + 10);
        } else {
            this.maxWidth = (int) paint.measureText(charSequence, i, i2);
        }
        return this.maxWidth;
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5acc076", new Object[]{this, canvas, charSequence, new Integer(i), new Integer(i2), new Float(f), new Integer(i3), new Integer(i4), new Integer(i5), paint});
            return;
        }
        float measureText = paint.measureText(charSequence, i, i2);
        float measureText2 = paint.measureText("…");
        paint.setColor(this.color);
        if (this.isSingleLine) {
            int ceil = (int) Math.ceil(measureText);
            int i6 = this.maxWidth;
            if (ceil <= i6) {
                canvas.drawText(charSequence, i, i2, f, i4, paint);
                return;
            }
            int breakText = i + paint.breakText(charSequence, i, i2, true, i6 - measureText2, null);
            float f2 = i4;
            canvas.drawText(charSequence, i, breakText, f, f2, paint);
            canvas.drawText("…", paint.measureText(charSequence, i, breakText) + f, f2, paint);
            return;
        }
        int i7 = this.maxWidth;
        if (measureText <= i7) {
            canvas.drawText(charSequence, i, i2, f, i4, paint);
            return;
        }
        int breakText2 = i + paint.breakText(charSequence, i, i2, true, i7 - measureText2, null);
        float f3 = i4;
        canvas.drawText(charSequence, i, breakText2, f, f3, paint);
        canvas.drawText("…", paint.measureText(charSequence, i, breakText2) + f, f3, paint);
    }
}
