package com.taobao.search.m3.composite;

import android.graphics.Canvas;
import android.graphics.Color;
import android.text.TextPaint;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.common.util.l;
import com.taobao.search.m3.d;
import com.taobao.search.m3.i;
import kotlin.TypeCastException;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes7.dex */
public final class a extends com.taobao.search.m3.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final C0762a Companion;
    private static final float i;
    private static final int j;
    private static final int k;
    private static final int l;

    /* renamed from: a  reason: collision with root package name */
    private final d f19073a;
    private final TextPaint b;
    private int c;
    private String d;
    private boolean e;
    private int f;
    private final c g;
    private final View h;

    /* renamed from: com.taobao.search.m3.composite.a$a  reason: collision with other inner class name */
    /* loaded from: classes7.dex */
    public static final class C0762a {
        static {
            kge.a(1680206256);
        }

        private C0762a() {
        }

        public /* synthetic */ C0762a(o oVar) {
            this();
        }
    }

    public a(c info, View view) {
        q.c(info, "info");
        q.c(view, "view");
        this.g = info;
        this.h = view;
        this.f19073a = new d(this.h, null, 2, null);
        this.b = new TextPaint(1);
        this.b.setTextSize(i);
        TextPaint textPaint = this.b;
        Integer a2 = this.g.a();
        textPaint.setColor(a2 != null ? a2.intValue() : j);
        this.e = !StringUtils.isEmpty(this.g.b());
    }

    static {
        kge.a(-1058709400);
        Companion = new C0762a(null);
        i = l.a(12.0f);
        j = Color.parseColor("#333333");
        k = l.a(12.0f);
        l = l.a(2.0f);
    }

    public final void a(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i2)});
        } else {
            this.f = i2;
        }
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (!this.e) {
        } else {
            d dVar = this.f19073a;
            String b = this.g.b();
            if (b == null) {
                q.a();
            }
            int i2 = k;
            dVar.a(b, i2, i2);
        }
    }

    @Override // com.taobao.search.m3.c
    public void a(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3f391fd", new Object[]{this, canvas});
            return;
        }
        q.c(canvas, "canvas");
        if (this.e) {
            float height = (this.h.getHeight() - k) >> 1;
            canvas.translate(0.0f, height);
            this.f19073a.a(canvas);
            canvas.translate(0.0f, -height);
        }
        String str = this.d;
        if (str == null) {
            return;
        }
        com.taobao.search.m3.a.a(canvas, this.b, !this.e ? 0.0f : l + k, str, 0.0f, this.h.getHeight());
    }

    @Override // com.taobao.search.m3.b, com.taobao.search.m3.c
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            this.f19073a.a();
        }
    }

    @Override // com.taobao.search.m3.c
    public int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue();
        }
        if (this.c == 0) {
            float f = 0.0f;
            if (this.e) {
                f = 0.0f + k + l;
            }
            float a2 = i.Companion.a(this.g.c(), this.b) + f;
            if (a2 <= this.f) {
                this.d = this.g.c();
            } else {
                float a3 = i.Companion.a("...", this.b);
                float[] fArr = new float[1];
                int breakText = this.b.breakText(this.g.c(), true, (this.f - f) - a3, fArr);
                if (breakText > 0) {
                    StringBuilder sb = new StringBuilder();
                    String c = this.g.c();
                    if (c == null) {
                        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                    }
                    String substring = c.substring(0, breakText);
                    q.a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    sb.append(substring);
                    sb.append("...");
                    this.d = sb.toString();
                    a2 = f + fArr[0] + a3;
                } else {
                    a2 = 1.0f + this.f;
                }
            }
            this.c = (int) a2;
        }
        return this.c;
    }
}
