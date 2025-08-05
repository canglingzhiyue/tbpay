package com.taobao.search.m3.icons;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.common.util.l;
import com.taobao.search.m3.i;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes7.dex */
public final class f extends a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final com.taobao.search.m3.d f19103a;
    private float b;
    private float c;
    private int d;
    private final TextPaint e;
    private final Paint f;
    private final Paint g;
    private final Paint h;
    private int i;
    private int j;
    private int k;
    private float l;
    private int m;
    private boolean n;
    private final View p;
    private final com.taobao.search.m3.f q;
    private final Path r;
    private final Path s;
    private boolean t;
    private int u;
    private int v;
    private boolean w;
    private int x;
    private int y;
    private LinearGradient z;

    static {
        kge.a(-1692470168);
    }

    public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(c itemInfo, View view, com.taobao.search.m3.f infoProvider) {
        super(itemInfo, view);
        q.c(itemInfo, "itemInfo");
        q.c(view, "view");
        q.c(infoProvider, "infoProvider");
        this.p = view;
        this.q = infoProvider;
        this.f19103a = new com.taobao.search.m3.d(this.p, null, 2, null);
        this.v = -16777216;
        this.d = -1;
        this.e = new TextPaint(1);
        this.f = new Paint(1);
        this.g = new Paint(1);
        this.h = new Paint(1);
        this.r = new Path();
        this.s = new Path();
        this.t = true;
        this.h.setStyle(Paint.Style.STROKE);
        this.h.setStrokeWidth(a.Companion.d());
    }

    @Override // com.taobao.search.m3.icons.a
    public boolean j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[]{this})).booleanValue() : this.n;
    }

    @Override // com.taobao.search.m3.c
    public void a(Canvas canvas) {
        float f;
        float f2;
        int i;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3f391fd", new Object[]{this, canvas});
            return;
        }
        q.c(canvas, "canvas");
        if (this.k != 0 && this.b > 0) {
            float c = a.Companion.c() + this.b + (this.m > 0 ? i2 >> 1 : a.Companion.c());
            a(canvas, 0.0f, 0.0f, c, IconView.Companion.a(), this.l, 0.0f, this.r, this.t, this.g);
            if (this.i != 0 || this.w) {
                if (this.w && this.z == null) {
                    this.z = new LinearGradient(0.0f, 0.0f, this.d - c, 0.0f, this.x, this.y, Shader.TileMode.CLAMP);
                    this.f.setShader(this.z);
                }
                a(canvas, c, 0.0f, this.d, IconView.Companion.a(), 0.0f, this.l, this.s, this.t, this.f);
            }
        } else {
            int i3 = this.i;
            if ((i3 != 0 && i3 != this.q.getCardBackgroundColor()) || this.w) {
                if (this.w && this.z == null) {
                    this.z = new LinearGradient(0.0f, 0.0f, this.d, 0.0f, this.x, this.y, Shader.TileMode.CLAMP);
                    this.f.setShader(this.z);
                }
                float f3 = this.l;
                a(canvas, 0.0f, 0.0f, this.d, IconView.Companion.a(), f3, f3, this.s, false, this.f);
            }
        }
        float f4 = 0;
        if (this.b > f4) {
            float c2 = a.Companion.c() + 0.0f;
            this.e.setColor(this.u);
            TextPaint textPaint = this.e;
            float c3 = a.Companion.c();
            String e = i().e();
            if (e == null) {
                q.a();
            }
            com.taobao.search.m3.a.a(canvas, textPaint, c3, e, 0.0f, this.p.getHeight());
            float f5 = this.b + c2;
            int i4 = this.m;
            f2 = f5;
            f = (i4 > 0 ? i4 / 2.0f : a.Companion.c()) + f5;
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        if (this.c > f4) {
            this.e.setColor(this.v);
            if (this.n || f > f4) {
                TextPaint textPaint2 = this.e;
                float c4 = f + ((this.m <= 0 || this.b <= f4) ? a.Companion.c() : i >> 1);
                String d = i().d();
                if (d == null) {
                    q.a();
                }
                com.taobao.search.m3.a.a(canvas, textPaint2, c4, d, 0.0f, this.p.getHeight());
            } else {
                TextPaint textPaint3 = this.e;
                String d2 = i().d();
                if (d2 == null) {
                    q.a();
                }
                com.taobao.search.m3.a.a(canvas, textPaint3, f, d2, 0.0f, this.p.getHeight());
            }
        }
        if (this.b > f4) {
            int i5 = (f2 > f4 ? 1 : (f2 == f4 ? 0 : -1));
            if (i5 > 0) {
                canvas.translate(f2, 0.0f);
            }
            this.f19103a.a(canvas);
            if (i5 > 0) {
                canvas.translate(-f2, 0.0f);
            }
        }
        b(canvas);
        this.t = false;
    }

    private final void b(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4a03d9c", new Object[]{this, canvas});
            return;
        }
        int i = this.j;
        if (i == 0 || i == this.q.getCardBackgroundColor()) {
            return;
        }
        float d = a.Companion.d() / 2;
        if (this.l > 0) {
            float f = this.l;
            canvas.drawRoundRect(d, d, c() - d, this.p.getMeasuredHeight() - d, f, f, this.h);
            return;
        }
        canvas.drawRect(d, d, c() - d, this.p.getMeasuredHeight() - d, this.h);
    }

    private final void a(Canvas canvas, float f, float f2, float f3, float f4, float f5, float f6, Path path, boolean z, Paint paint) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d62fc36e", new Object[]{this, canvas, new Float(f), new Float(f2), new Float(f3), new Float(f4), new Float(f5), new Float(f6), path, new Boolean(z), paint});
            return;
        }
        int i = (int) f5;
        if (i == ((int) f6)) {
            if (i == 0) {
                canvas.drawRect(f, f2, f3, f4, paint);
                return;
            } else {
                canvas.drawRoundRect(f, f2, f3, f4, f5, f5, paint);
                return;
            }
        }
        if (z) {
            path.reset();
            path.addRoundRect(f, f2, f3, f4, new float[]{f5, f5, f6, f6, f6, f6, f5, f5}, Path.Direction.CW);
        }
        canvas.drawPath(path, paint);
    }

    @Override // com.taobao.search.m3.b, com.taobao.search.m3.c
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            this.f19103a.a();
        }
    }

    @Override // com.taobao.search.m3.icons.a
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (TextUtils.isEmpty(i().e())) {
        } else {
            this.f19103a.a(i().b().separatorImg, this.m, IconView.Companion.a());
        }
    }

    @Override // com.taobao.search.m3.c
    public int c() {
        int i;
        int c;
        float f;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue();
        }
        if (this.d == -1) {
            this.w = false;
            this.t = true;
            float f2 = 0;
            this.e.setTextSize(i().b().textSize > f2 ? l.a(i().b().textSize) / 2.0f : a.Companion.b());
            this.v = com.taobao.android.searchbaseframe.util.g.a(i().b().textColor, -16777216);
            this.u = com.taobao.android.searchbaseframe.util.g.a(i().b().prefixColor, -16777216);
            float f3 = 0.0f;
            this.b = !TextUtils.isEmpty(i().e()) ? i.Companion.a(i().e(), this.e) : 0.0f;
            this.m = (i().b().separatorWidth <= 0 || i().b().separatorHeight <= 0) ? 0 : (int) ((IconView.Companion.a() / i().b().separatorHeight) * i().b().separatorWidth);
            this.i = com.taobao.android.searchbaseframe.util.g.a(i().b().backgroundColor, 0);
            this.f.setColor(this.i);
            this.x = 0;
            this.y = 0;
            if (this.b <= f2 && i().b().backgroundGradientStart != null && i().b().backgroundGradientEnd != null) {
                this.x = com.taobao.android.searchbaseframe.util.g.a(i().b().backgroundGradientStart, 0);
                this.y = com.taobao.android.searchbaseframe.util.g.a(i().b().backgroundGradientEnd, 0);
                this.w = (this.x == 0 && this.y == 0) ? false : true;
            }
            this.j = com.taobao.android.searchbaseframe.util.g.a(i().b().borderColor, 0);
            this.h.setColor(this.j);
            this.k = com.taobao.android.searchbaseframe.util.g.a(i().b().prefixBgColor, 0);
            this.g.setColor(this.k);
            this.l = i().b().borderRadius > 0 ? l.a(i().b().borderRadius) : a.Companion.a();
            int i2 = this.i;
            if ((i2 == 0 || i2 == this.q.getCardBackgroundColor()) && ((i = this.j) == 0 || i == this.q.getCardBackgroundColor())) {
                z = false;
            }
            this.n = z;
            float f4 = this.b;
            if (f4 > f2) {
                float c2 = f4 + 0.0f + a.Companion.c();
                int i3 = this.m;
                f3 = (i3 > 0 ? i3 / 2.0f : a.Companion.c()) + c2;
            }
            if (!TextUtils.isEmpty(i().d())) {
                this.c = i.Companion.a(i().d(), this.e);
                f3 += this.c;
                if (this.n) {
                    f3 += a.Companion.c();
                }
                if (this.b > f2) {
                    int i4 = this.m;
                    if (i4 > 0) {
                        f = i4 / 2.0f;
                        f3 += f;
                    } else {
                        c = a.Companion.c();
                    }
                } else if (this.n) {
                    c = a.Companion.c();
                }
                f = c;
                f3 += f;
            }
            this.d = (int) f3;
        }
        return this.d;
    }
}
