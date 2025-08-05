package com.taobao.android.dinamicx.view.richtext.span;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes5.dex */
public class d extends CharacterStyle implements f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private float f11989a;
    private float b;
    private float c;
    private int d;

    static {
        kge.a(-310987349);
        kge.a(-1729001896);
    }

    public d(float f, float f2, float f3, int i) {
        this.c = f;
        this.f11989a = f2;
        this.b = f3;
        this.d = i;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c21f6b6b", new Object[]{this, textPaint});
        } else {
            textPaint.setShadowLayer(this.c, this.f11989a, this.b, this.d);
        }
    }

    public Object clone() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("78b3604e", new Object[]{this}) : new d(this.c, this.f11989a, this.b, this.d);
    }
}
