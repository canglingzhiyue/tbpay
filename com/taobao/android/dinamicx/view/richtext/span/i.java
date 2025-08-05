package com.taobao.android.dinamicx.view.richtext.span;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes5.dex */
public class i extends CharacterStyle implements f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private int f11993a;
    private int b;

    static {
        kge.a(-1979879309);
        kge.a(-1729001896);
    }

    public i(int i, int i2) {
        this.f11993a = i;
        this.b = i2;
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
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("2b8e3c70", new Object[]{this, paint})).intValue() : -(paint.getFontMetricsInt().ascent - this.f11993a);
    }

    public Object clone() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("78b3604e", new Object[]{this}) : new i(this.f11993a, this.b);
    }
}
