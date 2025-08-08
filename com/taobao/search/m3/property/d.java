package com.taobao.search.m3.property;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.text.TextPaint;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.common.util.l;
import com.taobao.search.m3.i;
import com.taobao.search.m3.price.M3PriceView;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.TypeCastException;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.text.n;
import tb.kge;
import tb.rwf;

/* loaded from: classes7.dex */
public final class d extends com.taobao.search.m3.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;
    private static final float j;
    private static final float k;
    private static final float l;
    private static final float m;
    private static final int n;
    private static final int o;
    private static final int p;
    private static final int q;
    private static final int r;
    private static final int s;

    /* renamed from: a  reason: collision with root package name */
    private int f19134a;
    private final TextPaint b;
    private final TextPaint c;
    private final TextPaint d;
    private final ArrayList<String> e;
    private float f;
    private float g;
    private final b h;
    private final View i;

    public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.search.m3.b, com.taobao.search.m3.c
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        }
    }

    public static final /* synthetic */ int d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2de", new Object[0])).intValue() : r;
    }

    public static final /* synthetic */ int e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca5f", new Object[0])).intValue() : s;
    }

    public d(b info, View view) {
        q.c(info, "info");
        q.c(view, "view");
        this.h = info;
        this.i = view;
        this.b = new TextPaint(1);
        this.c = new TextPaint(1);
        this.d = new TextPaint(1);
        this.e = new ArrayList<>();
        this.c.setTextSize(l);
        this.c.setColor(o);
        this.c.setTypeface(M3PriceView.Companion.b());
        this.d.setTextSize(j);
        this.b.setTypeface(M3PriceView.Companion.b());
        this.b.setColor(o);
    }

    /* loaded from: classes7.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1184830751);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }

        public final int a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : d.d();
        }

        public final int b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : d.e();
        }
    }

    static {
        kge.a(-1180304679);
        Companion = new a(null);
        j = l.a(12.0f);
        k = l.a(21.0f);
        l = l.a(12.0f);
        m = l.a(16.0f);
        n = Color.parseColor("#999999");
        o = Color.parseColor("#FF5000");
        p = Color.parseColor("#333333");
        q = l.a(5.0f);
        float f = k;
        float f2 = j;
        int i = q;
        r = (int) (f + f2 + i);
        s = (int) ((2 * f2) + i);
    }

    public final void a(Canvas canvas, Paint paint, float f, String text, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20fe6d88", new Object[]{this, canvas, paint, new Float(f), text, new Float(f2)});
            return;
        }
        q.c(canvas, "canvas");
        q.c(paint, "paint");
        q.c(text, "text");
        canvas.drawText(text, f, f2, paint);
    }

    @Override // com.taobao.search.m3.c
    public void a(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3f391fd", new Object[]{this, canvas});
            return;
        }
        q.c(canvas, "canvas");
        if (this.h.c()) {
            boolean isEmpty = StringUtils.isEmpty(this.h.a());
            this.b.setTextSize(k);
            Paint.FontMetrics fontMetrics = this.b.getFontMetrics();
            float height = (((isEmpty ? this.i.getHeight() : k) - fontMetrics.bottom) - fontMetrics.top) / 2.0f;
            a(canvas, this.c, 0.0f, "¥", height);
            TextPaint textPaint = this.b;
            float f = this.f;
            String str = this.e.get(0);
            q.a((Object) str, "priceTexts[0]");
            a(canvas, textPaint, f, str, height);
            if (this.e.size() > 1) {
                this.b.setTextSize(m);
                TextPaint textPaint2 = this.b;
                float f2 = this.f + this.g;
                String str2 = this.e.get(1);
                q.a((Object) str2, "priceTexts[1]");
                a(canvas, textPaint2, f2, str2, height);
            }
            if (isEmpty) {
                return;
            }
            this.d.setColor(n);
            com.taobao.search.m3.a.a(canvas, this.d, 0.0f, this.h.a(), k + q, this.i.getHeight());
            return;
        }
        boolean isEmpty2 = StringUtils.isEmpty(this.h.a());
        this.d.setColor(p);
        com.taobao.search.m3.a.a(canvas, this.d, 0.0f, this.h.b(), 0.0f, isEmpty2 ? this.i.getHeight() : j);
        if (isEmpty2) {
            return;
        }
        this.d.setColor(n);
        com.taobao.search.m3.a.a(canvas, this.d, 0.0f, this.h.a(), j + q, this.i.getHeight());
    }

    @Override // com.taobao.search.m3.c
    public int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue();
        }
        if (this.f19134a == 0) {
            if (this.h.c()) {
                g();
            } else {
                f();
            }
        }
        return this.f19134a;
    }

    private final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else {
            this.f19134a = (int) rwf.a(i.Companion.a(this.h.a(), this.d), i.Companion.a(this.h.b(), this.d));
        }
    }

    private final void g() {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        this.e.clear();
        float a2 = i.Companion.a(this.h.a(), this.d);
        this.f = i.Companion.a("¥", this.c);
        float f = this.f;
        this.b.setTextSize(k);
        h();
        Iterator<String> it = this.e.iterator();
        while (it.hasNext()) {
            float a3 = i.Companion.a(it.next(), this.b);
            if (z) {
                this.g = a3;
                z = false;
            }
            f += a3;
            this.b.setTextSize(m);
        }
        this.f19134a = (int) rwf.a(f, a2);
    }

    private final void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        int a2 = n.a((CharSequence) this.h.b(), ".", 0, false, 6, (Object) null);
        if (a2 >= 0) {
            String b = this.h.b();
            int i = a2 + 1;
            int length = this.h.b().length();
            if (b == null) {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
            String substring = b.substring(i, length);
            q.a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            if (Integer.parseInt(substring) == 0) {
                this.e.add(this.h.b());
                return;
            }
            ArrayList<String> arrayList = this.e;
            String b2 = this.h.b();
            if (b2 == null) {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
            String substring2 = b2.substring(0, a2);
            q.a((Object) substring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            arrayList.add(substring2);
            ArrayList<String> arrayList2 = this.e;
            arrayList2.add('.' + substring);
            return;
        }
        this.e.add(this.h.b());
    }
}
