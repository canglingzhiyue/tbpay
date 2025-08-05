package com.taobao.android.detail2.core.framework.view.feeds;

import android.app.Activity;
import android.graphics.Rect;
import android.os.Build;
import android.support.v7.widget.RecyclerView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.view.feeds.DetailVerticalRecyclerView;
import com.taobao.taobao.R;
import tb.bga;
import tb.fjl;
import tb.fkp;
import tb.fmd;
import tb.fme;
import tb.kge;

/* loaded from: classes5.dex */
public abstract class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public fmd f11592a;
    public com.taobao.android.detail2.core.framework.b b;
    public d c;
    public DetailVerticalRecyclerView.a d;

    static {
        kge.a(-693661050);
    }

    public abstract void a(String str, int i, int i2);

    public abstract boolean b(int i, String str);

    public abstract boolean d();

    public abstract float e();

    public abstract float f();

    public static /* synthetic */ void a(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79957656", new Object[]{eVar});
        } else {
            eVar.h();
        }
    }

    public e(fmd fmdVar, com.taobao.android.detail2.core.framework.b bVar, d dVar) {
        this.f11592a = fmdVar;
        this.b = bVar;
        this.c = dVar;
    }

    public void a(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20f12ca5", new Object[]{this, new Integer(i), str});
        } else if (!d()) {
        } else {
            g();
            a(i, str, false);
            c(i, str);
        }
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else if (this.d != null) {
        } else {
            this.d = new b() { // from class: com.taobao.android.detail2.core.framework.view.feeds.e.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.detail2.core.framework.view.feeds.b, com.taobao.android.detail2.core.framework.view.feeds.DetailVerticalRecyclerView.a
                public void a(RecyclerView recyclerView, int i, int i2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("2febb876", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
                    } else {
                        e.a(e.this);
                    }
                }

                @Override // com.taobao.android.detail2.core.framework.view.feeds.b, com.taobao.android.detail2.core.framework.view.feeds.DetailVerticalRecyclerView.a
                public void a(String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str});
                        return;
                    }
                    int f = e.this.f11592a.f(str);
                    int f2 = e.this.f11592a.f(e.this.c.G());
                    if (f == f2 - 1) {
                        e.this.c.a(0);
                    }
                    e.this.a(str, f, f2);
                }
            };
            this.f11592a.a(this.d);
        }
    }

    private void h() {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else if (!a()) {
        } else {
            Rect q = this.c.q();
            if (Build.VERSION.SDK_INT >= 19) {
                z = this.c.X();
            }
            if (q.top < 0 || q.top > e() || !z) {
                return;
            }
            this.c.a(q.top / e());
        }
    }

    public void a(int i, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd351acf", new Object[]{this, new Integer(i), str, new Boolean(z)});
            return;
        }
        Activity g = this.b.g();
        if (g == null) {
            return;
        }
        boolean a2 = a();
        boolean b = b(i, str);
        this.c.a(a(b, a2));
        if (b) {
            bga.c.a("newDetail", fkp.TINCT_SCROLL_OPT, fkp.TINCT_SCROLL_OPT_HALF_SCREEN, "default", true);
        }
        if (!b(b, z)) {
            return;
        }
        if (b) {
            this.c.d((int) e());
            this.c.e((int) g.getResources().getDimension(R.dimen.new_detail_half_screen_bottom_divider_height));
            this.c.a("newdetailNonFullScreen".hashCode(), "true");
            return;
        }
        this.c.d(-1);
        this.c.e(fjl.a(this.b.g(), 0.0f));
        this.c.a("newdetailNonFullScreen".hashCode(), (Object) null);
    }

    private void c(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18f44a63", new Object[]{this, new Integer(i), str});
        } else if (!a(i)) {
        } else {
            d dVar = this.c;
            dVar.a(-dVar.j());
        }
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        com.taobao.android.detail2.core.framework.data.model.d a2 = this.f11592a.a(this.f11592a.f(this.c.G()) - 1);
        if (a2 != null) {
            return b(a2.f, a2.g);
        }
        return false;
    }

    private float[] a(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (float[]) ipChange.ipc$dispatch("271050f9", new Object[]{this, new Boolean(z), new Boolean(z2)});
        }
        float c = fme.c(this.b);
        return z ? z2 ? new float[]{c, c, c, c, c, c, c, c} : new float[]{0.0f, 0.0f, 0.0f, 0.0f, c, c, c, c} : z2 ? new float[]{c, c, c, c, 0.0f, 0.0f, 0.0f, 0.0f} : new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
    }

    private boolean b(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("90ff882d", new Object[]{this, new Boolean(z), new Boolean(z2)})).booleanValue();
        }
        boolean z3 = this.c.f("newdetailNonFullScreen".hashCode()) != null;
        if (z && z3 && !z2) {
            return false;
        }
        return z || z3;
    }

    private boolean a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821939f", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (!a() || this.c.D()) {
            return false;
        }
        int[] k = this.f11592a.k();
        if (i >= k[0] && i < k[1]) {
            return false;
        }
        return i != k[1] || !this.f11592a.h();
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        d dVar = this.c;
        if (dVar == null) {
            return;
        }
        dVar.a(0);
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (!d()) {
        } else {
            a(this.c.F(), this.c.E(), true);
        }
    }
}
