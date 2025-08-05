package com.taobao.search.m3.image;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes7.dex */
public abstract class a implements d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final TextPaint f19107a;
    private final Paint b;
    private final com.taobao.search.m3.d c;
    private float d;
    private int e;
    private c f;
    private int g;
    private boolean h;
    private final View i;
    private final boolean j;

    static {
        kge.a(2105637377);
        kge.a(1001207257);
    }

    public abstract float a();

    public abstract int a(c cVar);

    public abstract int b();

    public abstract int b(c cVar);

    public abstract float c();

    public abstract float d();

    public abstract int e();

    public abstract int f();

    public abstract int g();

    public abstract float h();

    public abstract int i();

    public abstract int j();

    public abstract boolean k();

    public a(View view, boolean z) {
        q.c(view, "view");
        this.i = view;
        this.j = z;
        this.f19107a = new TextPaint(1);
        this.b = new Paint(1);
        this.c = new com.taobao.search.m3.d(this.i, null, 2, null);
    }

    public final boolean p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("63fccfb", new Object[]{this})).booleanValue() : this.j;
    }

    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
            return;
        }
        this.f19107a.setColor(g());
        this.f19107a.setTextSize(h());
        this.b.setColor(i());
    }

    @Override // com.taobao.search.m3.image.d
    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
            return;
        }
        c cVar = this.f;
        if (cVar == null || this.e <= 0) {
            return;
        }
        this.c.a(cVar.c(), this.g, b(cVar));
    }

    @Override // com.taobao.search.m3.image.d
    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
        } else {
            this.c.a();
        }
    }

    private final void d(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85c54de0", new Object[]{this, cVar});
            return;
        }
        String f = cVar.f();
        if (f != null) {
            int hashCode = f.hashCode();
            if (hashCode != 3791) {
                if (hashCode == 3322014 && f.equals("list") && !this.j) {
                    return;
                }
            } else if (f.equals("wf") && this.j) {
                return;
            }
        }
        this.d = com.taobao.search.m3.i.Companion.a(cVar.a(), this.f19107a);
    }

    @Override // com.taobao.search.m3.image.d
    public void o() {
        c cVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631b576", new Object[]{this});
        } else if (this.e > 0 || (cVar = this.f) == null) {
        } else {
            this.g = a(cVar);
            this.c.a();
            this.c.a(cVar.c(), this.g, b(cVar));
            this.d = 0.0f;
            d(cVar);
            this.e = this.g + j();
            float f = this.d;
            if (f <= 0) {
                return;
            }
            this.e += (int) (f + e() + f());
        }
    }

    @Override // com.taobao.search.m3.image.d
    public void a(c cVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d62777d7", new Object[]{this, cVar, new Boolean(z)});
            return;
        }
        if (!this.h) {
            this.h = true;
            l();
        }
        if (this.f == cVar) {
            return;
        }
        this.f = cVar;
        this.e = 0;
        this.d = 0.0f;
    }

    @Override // com.taobao.search.m3.image.d
    public void a(Canvas cns) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3f391fd", new Object[]{this, cns});
            return;
        }
        q.c(cns, "cns");
        c cVar = this.f;
        if (cVar == null) {
            return;
        }
        if (!k() && this.d <= 0) {
            return;
        }
        float c = c();
        float d = d();
        cns.translate(c, d);
        float f = 0;
        if (this.d > f) {
            cns.drawRoundRect(0.0f, 0.0f, this.e, b(), a(), a(), this.b);
        }
        float b = (b() - b(cVar)) / 2.0f;
        int j = j();
        int i = (b > f ? 1 : (b == f ? 0 : -1));
        if (i > 0 || j > 0) {
            cns.translate(j, b);
        }
        this.c.a(cns);
        if (i > 0 || j > 0) {
            cns.translate(-j, -b);
        }
        if (this.d > f) {
            TextPaint textPaint = this.f19107a;
            float e = j + this.g + e();
            String a2 = cVar.a();
            if (a2 == null) {
                q.a();
            }
            com.taobao.search.m3.a.a(cns, textPaint, e, a2, 0.0f, b());
        }
        cns.translate(-c, -d);
    }
}
