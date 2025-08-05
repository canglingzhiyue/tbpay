package tb;

import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextPaint;
import android.text.style.LineHeightSpan;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes8.dex */
public class ogo implements LineHeightSpan.WithDensity {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static float b;

    /* renamed from: a  reason: collision with root package name */
    private int f32039a;

    static {
        kge.a(1362003117);
        kge.a(-818555037);
        b = 0.0f;
    }

    public ogo(int i) {
        this.f32039a = i;
    }

    @Override // android.text.style.LineHeightSpan
    public void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("646418b3", new Object[]{this, charSequence, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), fontMetricsInt});
        } else {
            chooseHeight(charSequence, i, i2, i3, i4, fontMetricsInt, null);
        }
    }

    @Override // android.text.style.LineHeightSpan.WithDensity
    public void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt, TextPaint textPaint) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ab9aeb3", new Object[]{this, charSequence, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), fontMetricsInt, textPaint});
            return;
        }
        int i5 = this.f32039a;
        if (textPaint != null) {
            i5 = (int) (i5 * textPaint.density);
        }
        if (fontMetricsInt.bottom - fontMetricsInt.top < i5) {
            fontMetricsInt.top = fontMetricsInt.bottom - i5;
            fontMetricsInt.ascent = fontMetricsInt.descent - i5;
            return;
        }
        if (b == 0.0f) {
            Paint paint = new Paint();
            paint.setTextSize(100.0f);
            Rect rect = new Rect();
            paint.getTextBounds("ABCDEFG", 0, 7, rect);
            b = rect.top / paint.ascent();
        }
        int ceil = (int) Math.ceil((-fontMetricsInt.top) * b);
        if (i5 - fontMetricsInt.descent >= ceil) {
            fontMetricsInt.top = fontMetricsInt.bottom - i5;
            fontMetricsInt.ascent = fontMetricsInt.descent - i5;
        } else if (i5 >= ceil) {
            int i6 = -ceil;
            fontMetricsInt.ascent = i6;
            fontMetricsInt.top = i6;
            int i7 = fontMetricsInt.top + i5;
            fontMetricsInt.descent = i7;
            fontMetricsInt.bottom = i7;
        } else {
            int i8 = -i5;
            fontMetricsInt.ascent = i8;
            fontMetricsInt.top = i8;
            fontMetricsInt.descent = 0;
            fontMetricsInt.bottom = 0;
        }
    }
}
