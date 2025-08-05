package com.alipay.zoloz.toyger.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class GarfieldUploadProgressBar extends UploadProgressBar {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public GarfieldUploadProgressBar(Context context) {
        super(context);
    }

    public GarfieldUploadProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public GarfieldUploadProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // com.alipay.zoloz.toyger.widget.UploadProgressBar
    public void paintStroke(Canvas canvas, RectF rectF) {
        int i;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8aea2959", new Object[]{this, canvas, rectF});
            return;
        }
        this.paint.setStyle(Paint.Style.STROKE);
        if (this.mBitmapShader != null) {
            this.paint.setShader(this.mBitmapShader);
        }
        int i3 = this.startAngle + 180;
        int i4 = 180 - (this.startAngle * 2);
        canvas.drawArc(rectF, i3, i4, false, this.paint);
        int i5 = (int) (((i4 + 120) / 180) * (this.mProgressAngle % 180));
        if (i5 <= 120) {
            i2 = i3;
            i = i5;
        } else {
            int i6 = (i5 + i3) - 120;
            i = (i3 + i4) - i6;
            if (i > 120) {
                i2 = i6;
                i = 120;
            } else {
                i2 = i6;
            }
        }
        String str = "topProcessStep:" + i + " topprocessAngle:" + i2;
        if (i > 0) {
            this.paint.setColor(this.roundProgressColor);
            canvas.drawArc(rectF, i2, i, false, this.paint);
        }
        int i7 = this.startAngle;
        int i8 = 180 - (this.startAngle * 2);
        this.paint.setColor(this.roundColor);
        canvas.drawArc(rectF, i7, i8, false, this.paint);
        if (i > 0) {
            this.paint.setColor(this.roundProgressColor);
            canvas.drawArc(rectF, i2 - 180, i, false, this.paint);
        }
        this.paint.setShader(null);
    }
}
