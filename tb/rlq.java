package tb;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.tmall.stylekit.datatype.GradientColorVO;

/* loaded from: classes9.dex */
public class rlq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public float f33225a;
    public int b;
    public float c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private GradientColorVO l;
    private int m;
    private boolean n = false;
    private boolean o = false;
    private boolean p = false;
    private boolean q = false;
    private boolean r = false;

    static {
        kge.a(-589173429);
    }

    public Drawable a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("4a76be10", new Object[]{this, view});
        }
        if (this.r) {
            return rmk.a(this.m, this.b, (int) this.f33225a, this.c, this.l);
        }
        if (this.n || this.q) {
            rlr rlrVar = new rlr();
            rlrVar.k(this.m);
            rlrVar.c(this.h);
            rlrVar.b(this.j);
            rlrVar.d(this.i);
            rlrVar.e(this.k);
            rlrVar.a((int) this.f33225a);
            rlrVar.j(this.b);
            rlrVar.f(this.d);
            rlrVar.g(this.e);
            rlrVar.h(this.f);
            rlrVar.i(this.g);
            rlrVar.a(this.c);
            return rlrVar.a();
        }
        return rmk.a(this.m, this.b, (int) this.f33225a, this.c, this.l);
    }

    public void a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8218858", new Object[]{this, new Float(f)});
        } else {
            this.f33225a = f;
        }
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.b = i;
        }
    }

    public void b(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d660f7", new Object[]{this, new Float(f)});
        } else {
            this.c = f;
        }
    }

    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            return;
        }
        this.h = i;
        boolean z = this.n;
        if (z) {
            return;
        }
        this.n = !z;
    }

    public void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i)});
            return;
        }
        this.i = i;
        boolean z = this.n;
        if (z) {
            return;
        }
        this.n = !z;
    }

    public void d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad401d78", new Object[]{this, new Integer(i)});
            return;
        }
        this.j = i;
        boolean z = this.n;
        if (z) {
            return;
        }
        this.n = !z;
    }

    public void e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef4f617", new Object[]{this, new Integer(i)});
            return;
        }
        this.k = i;
        boolean z = this.n;
        if (z) {
            return;
        }
        this.n = !z;
    }

    public void f(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0a9ceb6", new Object[]{this, new Integer(i)});
            return;
        }
        this.m = i;
        boolean z = this.o;
        if (z) {
            return;
        }
        this.o = !z;
    }

    public void g(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b25ea755", new Object[]{this, new Integer(i)});
            return;
        }
        this.d = i;
        boolean z = this.q;
        if (z) {
            return;
        }
        this.q = !z;
    }

    public void h(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4137ff4", new Object[]{this, new Integer(i)});
            return;
        }
        this.e = i;
        boolean z = this.q;
        if (z) {
            return;
        }
        this.q = !z;
    }

    public void i(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5c85893", new Object[]{this, new Integer(i)});
            return;
        }
        this.f = i;
        boolean z = this.q;
        if (z) {
            return;
        }
        this.q = !z;
    }

    public void j(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b77d3132", new Object[]{this, new Integer(i)});
            return;
        }
        this.g = i;
        boolean z = this.q;
        if (z) {
            return;
        }
        this.q = !z;
    }

    public void a(GradientColorVO gradientColorVO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b707863", new Object[]{this, gradientColorVO});
            return;
        }
        this.l = gradientColorVO;
        boolean z = this.r;
        if (z) {
            return;
        }
        this.r = !z;
    }
}
