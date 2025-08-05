package tb;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes5.dex */
public class taz extends ReplacementSpan {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Paint f34007a = new Paint();
    private int b;
    private int c;
    private float d;

    static {
        kge.a(680411479);
    }

    public taz(int i, int i2, float f, float f2) {
        this.d = 8.0f;
        this.f34007a.setColor(i);
        this.f34007a.setStyle(Paint.Style.STROKE);
        this.f34007a.setStrokeWidth(f);
        this.c = i2;
        this.d = f2;
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("46263898", new Object[]{this, paint, charSequence, new Integer(i), new Integer(i2), fontMetricsInt})).intValue();
        }
        this.b = (int) paint.measureText(charSequence, i, i2);
        return this.b;
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5acc076", new Object[]{this, canvas, charSequence, new Integer(i), new Integer(i2), new Float(f), new Integer(i3), new Integer(i4), new Integer(i5), paint});
            return;
        }
        paint.setColor(this.c);
        float f2 = i4;
        canvas.drawText(charSequence, i, i2, f, f2, paint);
        float f3 = this.d;
        canvas.drawLine(f, f2 + f3, f + this.b, f2 + f3, this.f34007a);
    }
}
