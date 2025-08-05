package com.taobao.android.dinamicx.view.richtext.span;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes5.dex */
public class a extends CharacterStyle implements UpdateAppearance, f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static int f11986a;
    private int b;
    private com.taobao.android.dinamicx.view.richtext.d c;

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c21f6b6b", new Object[]{this, textPaint});
        }
    }

    public a() {
        int i = f11986a;
        f11986a = i + 1;
        this.b = i;
    }

    static {
        kge.a(-1983180523);
        kge.a(-526054835);
        kge.a(-1729001896);
        f11986a = 0;
    }

    public boolean a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9501e36e", new Object[]{this, view})).booleanValue();
        }
        com.taobao.android.dinamicx.view.richtext.d dVar = this.c;
        if (dVar == null) {
            return false;
        }
        return dVar.a(view);
    }

    public com.taobao.android.dinamicx.view.richtext.d a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.dinamicx.view.richtext.d) ipChange.ipc$dispatch("dde890e4", new Object[]{this}) : this.c;
    }

    public void a(com.taobao.android.dinamicx.view.richtext.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("568cb964", new Object[]{this, dVar});
        } else {
            this.c = dVar;
        }
    }

    public Object clone() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("78b3604e", new Object[]{this});
        }
        a aVar = new a();
        aVar.c = this.c;
        return aVar;
    }
}
