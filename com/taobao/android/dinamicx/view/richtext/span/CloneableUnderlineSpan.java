package com.taobao.android.dinamicx.view.richtext.span;

import android.text.TextPaint;
import android.text.style.UnderlineSpan;
import tb.kge;

/* loaded from: classes5.dex */
public class CloneableUnderlineSpan extends UnderlineSpan implements f {
    private static final int UNDERLINE_WIDTH = 4;
    private int mColor;

    static {
        kge.a(1983114101);
        kge.a(-1729001896);
    }

    public Object clone() {
        return null;
    }

    public CloneableUnderlineSpan(int i) {
        this.mColor = 0;
        this.mColor = i;
    }

    @Override // android.text.style.UnderlineSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
    }
}
