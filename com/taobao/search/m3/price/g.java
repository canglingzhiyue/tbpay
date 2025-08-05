package com.taobao.search.m3.price;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.TextPaint;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.m3.price.b;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes7.dex */
public final class g implements b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final TextPaint f19130a;
    private String b;
    private int c;
    private final Rect d;
    private final View e;

    static {
        kge.a(-644988165);
        kge.a(488957804);
    }

    @Override // com.taobao.search.m3.c
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        }
    }

    public g(View view) {
        q.c(view, "view");
        this.e = view;
        this.f19130a = new TextPaint(1);
        this.d = new Rect();
    }

    @Override // com.taobao.search.m3.price.b
    public void a(e priceInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5004b42d", new Object[]{this, priceInfo});
            return;
        }
        q.c(priceInfo, "priceInfo");
        b.a.a(this, priceInfo);
    }

    public final void a(String text, int i, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3525ccf", new Object[]{this, text, new Integer(i), new Float(f)});
            return;
        }
        q.c(text, "text");
        a(text, i, f, false);
    }

    public final void a(String text, int i, float f, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6f9efe5", new Object[]{this, text, new Integer(i), new Float(f), new Boolean(z)});
            return;
        }
        q.c(text, "text");
        if (q.a((Object) this.b, (Object) text)) {
            return;
        }
        this.b = text;
        this.f19130a.setColor(i);
        this.f19130a.setTextSize(f);
        this.f19130a.setStrikeThruText(z);
        this.c = 0;
    }

    @Override // com.taobao.search.m3.c
    public void a(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3f391fd", new Object[]{this, canvas});
            return;
        }
        q.c(canvas, "canvas");
        String str = this.b;
        if (str == null) {
            return;
        }
        canvas.drawText(str, 0.0f, (this.e.getHeight() - this.d.height()) - this.d.top, this.f19130a);
    }

    @Override // com.taobao.search.m3.c
    public int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue();
        }
        String str = this.b;
        if (str == null) {
            return 0;
        }
        if (this.c == 0) {
            TextPaint textPaint = this.f19130a;
            if (str == null) {
                q.a();
            }
            String str2 = this.b;
            if (str2 == null) {
                q.a();
            }
            textPaint.getTextBounds(str, 0, str2.length(), this.d);
            this.c = this.d.width();
        }
        return this.c;
    }
}
