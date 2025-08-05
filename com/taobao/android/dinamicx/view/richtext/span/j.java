package com.taobao.android.dinamicx.view.richtext.span;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes5.dex */
public class j extends CharacterStyle implements f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1500057768);
        kge.a(-1729001896);
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
        Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
        return fontMetricsInt.descent - fontMetricsInt.bottom;
    }

    public Object clone() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("78b3604e", new Object[]{this}) : new j();
    }
}
