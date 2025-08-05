package com.taobao.android.dinamicx.view.richtext.span;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes5.dex */
public class h extends CharacterStyle implements f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private int f11992a;
    private int b;
    private int c;

    static {
        kge.a(-125898101);
        kge.a(-1729001896);
    }

    public h(int i, int i2) {
        this.f11992a = i;
        this.b = i2;
    }

    public h(int i, int i2, int i3) {
        this.f11992a = i;
        this.b = i2;
        this.c = i3;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c21f6b6b", new Object[]{this, textPaint});
        } else {
            textPaint.baselineShift = a(textPaint);
        }
    }

    public int a(Paint paint) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2b8e3c70", new Object[]{this, paint})).intValue();
        }
        int i = this.b;
        int i2 = (((i - this.f11992a) / 2) - i) + this.c;
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        return (int) ((((fontMetrics.descent - fontMetrics.ascent) / 2.0f) - fontMetrics.bottom) - i2);
    }

    public Object clone() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("78b3604e", new Object[]{this}) : new h(this.f11992a, this.b);
    }
}
