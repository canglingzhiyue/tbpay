package com.taobao.search.m3.icons;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.common.util.l;
import com.taobao.search.m3.i;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes7.dex */
public final class e extends com.taobao.search.m3.icons.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;
    private static final int p;

    /* renamed from: a  reason: collision with root package name */
    private int f19102a;
    private int b;
    private float c;
    private float d;
    private final TextPaint e;
    private final com.taobao.search.m3.d f;
    private final Paint g;
    private int h;
    private float i;
    private int j;
    private final Paint k;
    private boolean l;
    private final View n;
    private final com.taobao.search.m3.f o;
    private int q;
    private int r;

    public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    /* loaded from: classes7.dex */
    public static final class a {
        static {
            kge.a(-1458494433);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(c itemInfo, View view, com.taobao.search.m3.f infoProvider) {
        super(itemInfo, view);
        q.c(itemInfo, "itemInfo");
        q.c(view, "view");
        q.c(infoProvider, "infoProvider");
        this.n = view;
        this.o = infoProvider;
        this.e = new TextPaint(1);
        this.q = -16777216;
        this.r = -16777216;
        this.f = new com.taobao.search.m3.d(this.n, null, 2, null);
        this.g = new Paint(1);
        this.k = new Paint(1);
        this.k.setStyle(Paint.Style.STROKE);
        this.k.setStrokeWidth(com.taobao.search.m3.icons.a.Companion.d());
    }

    static {
        kge.a(-1978463849);
        Companion = new a(null);
        p = -l.a(1.0f);
    }

    @Override // com.taobao.search.m3.c
    public void a(Canvas canvas) {
        float f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3f391fd", new Object[]{this, canvas});
            return;
        }
        q.c(canvas, "canvas");
        c(canvas);
        float f2 = 0;
        if (this.c > f2) {
            float c = this.l ? com.taobao.search.m3.icons.a.Companion.c() + 0.0f : 0.0f;
            this.e.setColor(this.r);
            TextPaint textPaint = this.e;
            String e = i().e();
            if (e == null) {
                q.a();
            }
            com.taobao.search.m3.a.a(canvas, textPaint, c, e, 0.0f, this.n.getHeight());
            f = ((c + this.c) + com.taobao.search.m3.icons.a.Companion.c()) - p;
        } else {
            f = 0.0f;
        }
        int i = (f > f2 ? 1 : (f == f2 ? 0 : -1));
        if (i > 0) {
            canvas.translate(f, 0.0f);
        }
        this.f.a(canvas);
        if (i > 0) {
            canvas.translate(-f, 0.0f);
        }
        float f3 = f + this.b;
        if (this.d > f2) {
            float c2 = f3 + com.taobao.search.m3.icons.a.Companion.c();
            this.e.setColor(this.q);
            TextPaint textPaint2 = this.e;
            String d = i().d();
            if (d == null) {
                q.a();
            }
            com.taobao.search.m3.a.a(canvas, textPaint2, c2, d, 0.0f, this.n.getHeight());
        }
        b(canvas);
    }

    private final void b(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4a03d9c", new Object[]{this, canvas});
        } else if (this.j == 0) {
        } else {
            float d = com.taobao.search.m3.icons.a.Companion.d() / 2;
            if (this.i > 0) {
                float f = this.i;
                canvas.drawRoundRect(d, d, c() - d, this.n.getMeasuredHeight() - d, f, f, this.k);
                return;
            }
            canvas.drawRect(d, d, c() - d, this.n.getMeasuredHeight() - d, this.k);
        }
    }

    private final void c(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d54ce93b", new Object[]{this, canvas});
        } else if (this.h == 0) {
        } else {
            if (this.i > 0) {
                float f = this.i;
                canvas.drawRoundRect(0.0f, 0.0f, c(), this.n.getMeasuredHeight(), f, f, this.g);
                return;
            }
            canvas.drawRect(0.0f, 0.0f, c(), this.n.getMeasuredHeight(), this.g);
        }
    }

    @Override // com.taobao.search.m3.icons.a
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            this.f.a(i().b().image, this.b, IconView.Companion.a());
        }
    }

    @Override // com.taobao.search.m3.b, com.taobao.search.m3.c
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            this.f.a();
        }
    }

    @Override // com.taobao.search.m3.icons.a
    public boolean j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[]{this})).booleanValue() : this.l;
    }

    @Override // com.taobao.search.m3.c
    public int c() {
        int i;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue();
        }
        if (this.f19102a == 0) {
            this.b = (int) ((i().b().width / i().b().height) * IconView.Companion.a());
            this.h = com.taobao.android.searchbaseframe.util.g.a(i().b().backgroundColor, 0);
            this.g.setColor(this.h);
            this.i = i().b().borderRadius > 0 ? l.a(i().b().borderRadius) : com.taobao.search.m3.icons.a.Companion.a();
            this.j = com.taobao.android.searchbaseframe.util.g.a(i().b().borderColor, 0);
            this.k.setColor(this.j);
            float f = 0;
            this.e.setTextSize(i().b().textSize > f ? l.a(i().b().textSize) / 2.0f : com.taobao.search.m3.icons.a.Companion.b());
            this.q = com.taobao.android.searchbaseframe.util.g.a(i().b().textColor, -16777216);
            this.r = com.taobao.android.searchbaseframe.util.g.a(i().b().prefixColor, -16777216);
            int i2 = this.h;
            if ((i2 == 0 || i2 == this.o.getCardBackgroundColor()) && ((i = this.j) == 0 || i == this.o.getCardBackgroundColor())) {
                z = false;
            }
            this.l = z;
            float f2 = 0.0f;
            this.c = TextUtils.isEmpty(i().e()) ? 0.0f : i.Companion.a(i().e(), this.e);
            float f3 = this.c;
            float f4 = f3 + 0.0f;
            if (f3 > f) {
                f4 = (f4 - p) + com.taobao.search.m3.icons.a.Companion.c();
                if (this.l) {
                    f4 += com.taobao.search.m3.icons.a.Companion.c();
                }
            }
            float f5 = f4 + this.b;
            if (!TextUtils.isEmpty(i().d())) {
                f2 = i.Companion.a(i().d(), this.e);
            }
            this.d = f2;
            if (this.d > f) {
                f5 += com.taobao.search.m3.icons.a.Companion.c();
                if (this.l) {
                    f5 += com.taobao.search.m3.icons.a.Companion.c();
                }
            }
            this.f19102a = (int) (f5 + this.d);
        }
        return this.f19102a;
    }
}
