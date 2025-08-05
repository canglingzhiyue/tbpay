package com.taobao.android.dinamicx.view.richtext.span;

import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.PathEffect;
import android.graphics.RectF;
import android.text.Spanned;
import android.text.style.ReplacementSpan;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes5.dex */
public class g extends ReplacementSpan {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int BORDER_TYPE_DASH = 1;
    public static final int BORDER_TYPE_NORMAL = 0;

    /* renamed from: a  reason: collision with root package name */
    private final int[] f11991a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;
    private final int f;
    private final int[] g;
    private final int h;
    private final int i;
    private final int j;
    private final int k;
    private final Integer l;
    private int m;

    static {
        kge.a(-1686836745);
    }

    public static /* synthetic */ Object ipc$super(g gVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public g(Integer num, int[] iArr, int i, int i2, int i3, int i4, int i5, int[] iArr2, int i6, int i7, int i8, int i9) {
        this.f11991a = iArr;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = iArr2;
        this.h = i6;
        this.i = i7;
        this.j = i8;
        this.k = i9;
        this.l = num;
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("46263898", new Object[]{this, paint, charSequence, new Integer(i), new Integer(i2), fontMetricsInt})).intValue();
        }
        int measureText = ((int) paint.measureText(charSequence, i, i2)) + a() + c();
        this.m = measureText;
        return measureText;
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        int i6;
        int i7;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5acc076", new Object[]{this, canvas, charSequence, new Integer(i), new Integer(i2), new Float(f), new Integer(i3), new Integer(i4), new Integer(i5), paint});
            return;
        }
        canvas.save();
        int a2 = a(paint, charSequence, i, i2);
        if (a2 != 0) {
            canvas.translate(0.0f, a2);
        }
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        boolean isAntiAlias = paint.isAntiAlias();
        paint.setAntiAlias(true);
        if (this.f != 0) {
            int color = paint.getColor();
            paint.setColor(this.f);
            float f2 = i4;
            com.taobao.android.dinamicx.view.richtext.a.a(canvas, paint, new RectF(f - Math.max(0, this.h), ((fontMetrics.ascent + f2) - (b() / 2.0f)) - Math.max(0, this.j), this.m + f + Math.max(0, this.i), f2 + fontMetrics.descent + (d() / 2.0f) + Math.max(0, this.k)), this.g);
            paint.setColor(color);
        }
        int color2 = paint.getColor();
        Integer num = this.l;
        if (num != null) {
            paint.setColor(num.intValue());
        }
        float f3 = i4;
        canvas.drawText(charSequence, i, i2, f + a(), f3, paint);
        paint.setColor(color2);
        int e = e();
        if (e > 0) {
            float strokeWidth = paint.getStrokeWidth();
            int color3 = paint.getColor();
            PathEffect pathEffect = paint.getPathEffect();
            paint.setStrokeWidth(e);
            paint.setColor(this.b);
            if (this.c != 1 || (i7 = this.d) <= 0) {
                i6 = 0;
            } else {
                i6 = 0;
                paint.setPathEffect(new DashPathEffect(new float[]{i7, this.e}, 0.0f));
            }
            com.taobao.android.dinamicx.view.richtext.a.a(canvas, paint, new RectF((f - Math.max(i6, this.h)) + (a() / 2.0f), ((fontMetrics.ascent + f3) - (b() / 2.0f)) - Math.max(0, this.j), ((this.m + f) + Math.max(0, this.i)) - (c() / 2.0f), f3 + fontMetrics.descent + (d() / 2.0f) + Math.max(0, this.k)), this.g, this.f11991a);
            paint.setStrokeWidth(strokeWidth);
            paint.setColor(color3);
            paint.setPathEffect(pathEffect);
        }
        paint.setAntiAlias(isAntiAlias);
        canvas.restore();
    }

    private int a(Paint paint, CharSequence charSequence, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1e401634", new Object[]{this, paint, charSequence, new Integer(i), new Integer(i2)})).intValue();
        }
        if (!(charSequence instanceof Spanned)) {
            return 0;
        }
        Spanned spanned = (Spanned) charSequence;
        h[] hVarArr = (h[]) spanned.getSpans(i, i2, h.class);
        if (hVarArr != null && hVarArr.length > 0) {
            return hVarArr[0].a(paint);
        }
        i[] iVarArr = (i[]) spanned.getSpans(i, i2, i.class);
        if (iVarArr != null && iVarArr.length > 0) {
            return iVarArr[0].a(paint);
        }
        j[] jVarArr = (j[]) spanned.getSpans(i, i2, j.class);
        if (jVarArr != null && jVarArr.length > 0) {
            return jVarArr[0].a(paint);
        }
        return 0;
    }

    public int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : com.taobao.android.dinamicx.view.richtext.a.a(this.f11991a);
    }

    public int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : com.taobao.android.dinamicx.view.richtext.a.b(this.f11991a);
    }

    public int c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue() : com.taobao.android.dinamicx.view.richtext.a.c(this.f11991a);
    }

    public int d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue() : com.taobao.android.dinamicx.view.richtext.a.d(this.f11991a);
    }

    public int e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca5f", new Object[]{this})).intValue() : com.taobao.android.dinamicx.view.richtext.a.e(this.f11991a);
    }
}
