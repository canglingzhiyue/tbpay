package com.taobao.android.dinamicx.view.richtext.span;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes5.dex */
public class b extends ClickableSpan implements f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private com.taobao.android.dinamicx.view.richtext.b f11987a;

    static {
        kge.a(1463975619);
        kge.a(-1729001896);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c21f6b6b", new Object[]{this, textPaint});
        }
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            return;
        }
        com.taobao.android.dinamicx.view.richtext.b bVar = this.f11987a;
        if (bVar == null) {
            return;
        }
        bVar.a(view);
    }

    public com.taobao.android.dinamicx.view.richtext.b a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.dinamicx.view.richtext.b) ipChange.ipc$dispatch("dde890a6", new Object[]{this}) : this.f11987a;
    }

    public void a(com.taobao.android.dinamicx.view.richtext.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("568bd0a6", new Object[]{this, bVar});
        } else {
            this.f11987a = bVar;
        }
    }

    public Object clone() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("78b3604e", new Object[]{this});
        }
        b bVar = new b();
        bVar.f11987a = this.f11987a;
        return bVar;
    }
}
