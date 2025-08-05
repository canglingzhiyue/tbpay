package com.taobao.search.m3.price;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextPaint;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.common.util.l;
import com.taobao.search.m3.i;
import com.taobao.search.m3.price.b;
import kotlin.TypeCastException;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.text.n;
import tb.kge;

/* loaded from: classes7.dex */
public final class a implements b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final C0766a Companion;
    private static final int o;
    private static final float p;
    private static final float q;
    private static final float r;
    private static final int s;
    public static final String unit = "¥";

    /* renamed from: a  reason: collision with root package name */
    private String f19125a;
    private String b;
    private String c;
    private int d;
    private final TextPaint e;
    private final TextPaint f;
    private int g;
    private int h;
    private int i;
    private final Rect j;
    private final Rect k;
    private int l;
    private boolean m;
    private final View n;

    @Override // com.taobao.search.m3.c
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        }
    }

    /* renamed from: com.taobao.search.m3.price.a$a  reason: collision with other inner class name */
    /* loaded from: classes7.dex */
    public static final class C0766a {
        static {
            kge.a(1554512502);
        }

        private C0766a() {
        }

        public /* synthetic */ C0766a(o oVar) {
            this();
        }
    }

    public a(View view) {
        q.c(view, "view");
        this.n = view;
        this.e = new TextPaint(1);
        this.f = new TextPaint(1);
        this.g = -1;
        this.j = new Rect();
        this.k = new Rect();
        this.e.setColor(o);
        this.e.setTypeface(M3PriceView.Companion.b());
        this.f.setColor(o);
        this.f.setTextSize(p);
        this.f.setTypeface(M3PriceView.Companion.b());
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

    static {
        kge.a(1067094190);
        kge.a(488957804);
        Companion = new C0766a(null);
        o = Color.parseColor("#FF5000");
        p = l.a(12.0f);
        q = l.a(21.0f);
        r = l.a(16.0f);
        s = l.a(1.0f);
    }

    public final void a(String price) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, price});
            return;
        }
        q.c(price, "price");
        if (q.a((Object) this.f19125a, (Object) price)) {
            return;
        }
        this.f19125a = price;
        this.g = n.a((CharSequence) price, ".", 0, false, 6, (Object) null);
        this.m = false;
        this.d = 0;
        d();
    }

    private final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        try {
            if (this.g < 0) {
                return;
            }
            String str = this.f19125a;
            if (str == null) {
                q.a();
            }
            int i = this.g + 1;
            if (str == null) {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
            String substring = str.substring(i);
            q.a((Object) substring, "(this as java.lang.String).substring(startIndex)");
            int parseInt = Integer.parseInt(substring);
            if (parseInt == 0) {
                String str2 = this.f19125a;
                if (str2 == null) {
                    q.a();
                }
                int i2 = this.g;
                if (str2 == null) {
                    throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                }
                String substring2 = str2.substring(0, i2);
                q.a((Object) substring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                this.f19125a = substring2;
                this.g = -1;
            } else if (parseInt % 10 != 0) {
            } else {
                this.m = true;
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.taobao.search.m3.c
    public void a(Canvas canvas) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3f391fd", new Object[]{this, canvas});
            return;
        }
        q.c(canvas, "canvas");
        if (this.f19125a == null) {
            return;
        }
        a(canvas, "¥", 0.0f, this.f);
        float f = this.h + 0.0f;
        this.e.setTextSize(q);
        if (this.g < 0 || (str = this.b) == null) {
            String str2 = this.f19125a;
            if (str2 == null) {
                q.a();
            }
            a(canvas, str2, f, this.e);
            return;
        }
        if (str == null) {
            q.a();
        }
        a(canvas, str, f, this.e);
        float f2 = f + this.i;
        this.e.setTextSize(r);
        String str3 = this.c;
        if (str3 == null) {
            q.a();
        }
        a(canvas, str3, f2 + s, this.e);
    }

    private final void a(Canvas canvas, String str, float f, Paint paint) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff622f2e", new Object[]{this, canvas, str, new Float(f), paint});
        } else {
            canvas.drawText(str, f, -this.j.top, paint);
        }
    }

    @Override // com.taobao.search.m3.c
    public int c() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue();
        }
        if (this.f19125a == null) {
            return 0;
        }
        if (this.d <= 0) {
            float a2 = i.Companion.a("¥", this.f);
            this.h = (int) a2;
            this.e.setTextSize(q);
            if (this.g < 0) {
                this.b = this.f19125a;
                TextPaint textPaint = this.e;
                String str = this.b;
                if (str == null) {
                    q.a();
                }
                textPaint.getTextBounds(str, 0, str.length(), this.j);
                this.i = this.j.width();
                i = this.i;
            } else {
                String str2 = this.f19125a;
                if (str2 == null) {
                    q.a();
                }
                int i2 = this.g;
                if (str2 == null) {
                    throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                }
                String substring = str2.substring(0, i2);
                q.a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                this.b = substring;
                TextPaint textPaint2 = this.e;
                String str3 = this.b;
                if (str3 == null) {
                    q.a();
                }
                textPaint2.getTextBounds(str3, 0, str3.length(), this.j);
                this.i = this.j.width();
                float f = a2 + this.i;
                this.e.setTextSize(r);
                if (this.m) {
                    String str4 = this.f19125a;
                    if (str4 == null) {
                        q.a();
                    }
                    int i3 = this.g;
                    String str5 = this.f19125a;
                    if (str5 == null) {
                        q.a();
                    }
                    int length = str5.length() - 1;
                    if (str4 == null) {
                        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                    }
                    String substring2 = str4.substring(i3, length);
                    q.a((Object) substring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    this.c = substring2;
                } else {
                    String str6 = this.f19125a;
                    if (str6 == null) {
                        q.a();
                    }
                    int i4 = this.g;
                    if (str6 == null) {
                        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                    }
                    String substring3 = str6.substring(i4);
                    q.a((Object) substring3, "(this as java.lang.String).substring(startIndex)");
                    this.c = substring3;
                }
                TextPaint textPaint3 = this.e;
                String str7 = this.c;
                if (str7 == null) {
                    q.a();
                }
                textPaint3.getTextBounds(str7, 0, str7.length(), this.k);
                a2 = f + this.k.width();
                i = s;
            }
            float f2 = a2 + i;
            this.l = this.j.height();
            this.d = (int) f2;
        }
        return this.d;
    }

    public final int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : this.l;
    }
}
