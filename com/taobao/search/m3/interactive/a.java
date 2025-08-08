package com.taobao.search.m3.interactive;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.text.TextPaint;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.common.util.l;
import com.taobao.search.m3.i;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes7.dex */
public final class a implements com.taobao.search.m3.c {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final C0765a Companion;
    private static final int m;
    private static final int n;
    private static final int o;
    private static final int p;
    private static final int q;
    private static final int s;
    private static final int t;
    private static final float u;
    private static final int v;
    private static final float w;
    private static final float x;
    private static final int z;

    /* renamed from: a  reason: collision with root package name */
    private boolean f19116a;
    private final com.taobao.search.m3.d b;
    private final com.taobao.search.m3.d c;
    private int d;
    private float e;
    private float f;
    private final TextPaint g;
    private final TextPaint h;
    private final Paint i;
    private final boolean j;
    private final c k;
    private final View l;
    private final boolean r;
    private final boolean y;

    public a(c info, View view, boolean z2, boolean z3) {
        q.c(info, "info");
        q.c(view, "view");
        this.k = info;
        this.l = view;
        this.r = z2;
        this.y = z3;
        this.b = new com.taobao.search.m3.d(this.l, null, 2, null);
        this.c = new com.taobao.search.m3.d(this.l, null, 2, null);
        this.g = new TextPaint(1);
        this.h = new TextPaint(1);
        this.i = new Paint(1);
        this.j = !StringUtils.isEmpty(this.k.a());
        this.g.setTextSize(u);
        this.h.setTextSize(u);
    }

    public final c e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("136ba938", new Object[]{this}) : this.k;
    }

    /* renamed from: com.taobao.search.m3.interactive.a$a  reason: collision with other inner class name */
    /* loaded from: classes7.dex */
    public static final class C0765a {
        static {
            kge.a(-1620976410);
        }

        private C0765a() {
        }

        public /* synthetic */ C0765a(o oVar) {
            this();
        }
    }

    static {
        kge.a(-1570259170);
        kge.a(-257787766);
        Companion = new C0765a(null);
        m = l.a(8.0f);
        n = l.a(12.0f);
        o = l.a(2.0f);
        p = l.a(2.0f);
        q = Color.parseColor("#f7f7f7");
        s = l.a(6.0f);
        t = l.a(8.0f);
        z = l.a(3.0f);
        u = l.a(12.0f);
        v = Color.parseColor("#333333");
        w = l.a(1.0f);
        x = l.a(4.0f);
    }

    public final boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.f19116a;
    }

    public final void a(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z2)});
        } else {
            this.f19116a = z2;
        }
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        if (StringUtils.isEmpty(this.k.b())) {
            com.taobao.search.m3.d dVar = this.b;
            int i = m;
            dVar.a("https://gw.alicdn.com/imgextra/i3/O1CN01o98VCR1uM7obPMPs0_!!6000000006022-2-tps-24-24.png", i, i);
        } else {
            com.taobao.search.m3.d dVar2 = this.b;
            String b = this.k.b();
            int i2 = m;
            dVar2.a(b, i2, i2);
        }
        if (StringUtils.isEmpty(this.k.a())) {
            return;
        }
        com.taobao.search.m3.d dVar3 = this.c;
        String a2 = this.k.a();
        int i3 = n;
        dVar3.a(a2, i3, i3);
    }

    private final float a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a821938b", new Object[]{this, new Integer(i)})).floatValue() : (this.l.getMeasuredHeight() - i) / 2.0f;
    }

    @Override // com.taobao.search.m3.c
    public void a(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3f391fd", new Object[]{this, canvas});
            return;
        }
        q.c(canvas, "canvas");
        b(canvas);
        float f = s;
        if (this.j) {
            float a2 = a(n);
            canvas.translate(f, a2);
            this.c.a(canvas);
            canvas.translate(-f, -a2);
            f = f + n + o;
        }
        float f2 = 0;
        if (this.e > f2) {
            TextPaint textPaint = this.h;
            String f3 = this.k.f();
            if (f3 == null) {
                q.a();
            }
            com.taobao.search.m3.a.a(canvas, textPaint, f, f3, 0.0f, this.l.getHeight());
            float f4 = f + this.e;
            if (this.y) {
                f = f4 + z;
            } else {
                int i = t;
                f = f4 + i;
                canvas.drawCircle(f - (i / 2.0f), this.l.getMeasuredHeight() / 2.0f, w, this.g);
            }
        }
        if (this.f > f2) {
            com.taobao.search.m3.a.a(canvas, this.g, f, this.k.h(), 0.0f, this.l.getHeight());
            f = f + this.f + p;
        }
        float a3 = a(m);
        canvas.translate(f, a3);
        this.b.a(canvas);
        canvas.translate(-f, -a3);
    }

    private final void b(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4a03d9c", new Object[]{this, canvas});
            return;
        }
        int measuredHeight = this.l.getMeasuredHeight();
        float f = this.r ? x : measuredHeight / 2.0f;
        canvas.drawRoundRect(0.0f, 0.0f, this.d, measuredHeight, f, f, this.i);
    }

    @Override // com.taobao.search.m3.c
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            this.b.a();
        }
    }

    @Override // com.taobao.search.m3.c
    public int c() {
        Integer c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue();
        }
        if (this.d == 0) {
            float f = s << 1;
            if (this.j) {
                f = f + n + o;
            }
            this.e = (StringUtils.isEmpty(this.k.f()) || this.k.c() == null || ((c = this.k.c()) != null && c.intValue() == 0)) ? 0.0f : i.Companion.a(this.k.f(), this.h);
            float f2 = this.e;
            if (f2 > 0) {
                f = f + f2 + (this.y ? z : t);
                TextPaint textPaint = this.h;
                Integer c2 = this.k.c();
                if (c2 == null) {
                    q.a();
                }
                textPaint.setColor(c2.intValue());
            }
            this.f = i.Companion.a(this.k.h(), this.g);
            TextPaint textPaint2 = this.g;
            Integer e = this.k.e();
            textPaint2.setColor(e != null ? e.intValue() : v);
            this.d = (int) (f + this.f + p + m);
            Paint paint = this.i;
            Integer g = this.k.g();
            paint.setColor(g != null ? g.intValue() : q);
        }
        return this.d;
    }
}
