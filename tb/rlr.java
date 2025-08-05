package tb;

import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import com.android.alibaba.ip.runtime.IpChange;
import com.tmall.stylekit.datatype.GradientColorVO;

/* loaded from: classes9.dex */
public class rlr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private int f33226a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private float l;
    private GradientColorVO m = null;
    private GradientDrawable n = null;
    private GradientDrawable o = null;
    private GradientDrawable p = null;
    private GradientDrawable q = null;
    private StateListDrawable r;

    static {
        kge.a(-1949370038);
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.f = i;
        }
    }

    public void a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8218858", new Object[]{this, new Float(f)});
        } else {
            this.l = f;
        }
    }

    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
        } else {
            this.d = i;
        }
    }

    public void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i)});
            return;
        }
        this.b = i;
        this.f33226a = i;
    }

    public void d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad401d78", new Object[]{this, new Integer(i)});
        } else {
            this.c = i;
        }
    }

    public void e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef4f617", new Object[]{this, new Integer(i)});
        } else {
            this.e = i;
        }
    }

    public void f(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0a9ceb6", new Object[]{this, new Integer(i)});
            return;
        }
        this.h = i;
        this.g = i;
    }

    public void g(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b25ea755", new Object[]{this, new Integer(i)});
        } else {
            this.i = i;
        }
    }

    public void h(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4137ff4", new Object[]{this, new Integer(i)});
        } else {
            this.j = i;
        }
    }

    public void i(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5c85893", new Object[]{this, new Integer(i)});
        } else {
            this.k = i;
        }
    }

    public void j(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b77d3132", new Object[]{this, new Integer(i)});
        } else {
            this.g = i;
        }
    }

    public StateListDrawable a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StateListDrawable) ipChange.ipc$dispatch("bfa4a5f9", new Object[]{this});
        }
        this.r = new StateListDrawable();
        if (this.e != -1 || this.k != -1) {
            int i = this.k;
            if (i == -1 || i == 0) {
                this.k = this.g;
            }
            int i2 = this.e;
            if (i2 == -1 || i2 == 0) {
                this.e = this.f33226a;
            }
            this.q = rmk.a(this.e, this.k, this.f, this.l, this.m);
            this.r.addState(rmp.d, this.q);
        }
        if (this.d != -1 || this.j != -1) {
            int i3 = this.j;
            if (i3 == -1 || i3 == 0) {
                this.j = this.g;
            }
            int i4 = this.d;
            if (i4 == -1 || i4 == 0) {
                this.d = this.f33226a;
            }
            this.p = rmk.a(this.d, this.j, this.f, this.l, this.m);
            this.r.addState(rmp.b, this.p);
        }
        if (this.c != -1 || this.i != -1) {
            int i5 = this.i;
            if (i5 == -1 || i5 == 0) {
                this.i = this.g;
            }
            int i6 = this.c;
            if (i6 == -1 || i6 == 0) {
                this.c = this.f33226a;
            }
            this.o = rmk.a(this.c, this.i, this.f, this.l, this.m);
            this.r.addState(rmp.f33236a, this.o);
        }
        if (this.b != -1 || this.h != -1) {
            int i7 = this.h;
            if (i7 == -1 || i7 == 0) {
                this.h = this.g;
            }
            int i8 = this.b;
            if (i8 == -1 || i8 == 0) {
                this.b = this.f33226a;
            }
            this.n = rmk.a(this.b, this.h, this.f, this.l, this.m);
            this.r.addState(rmp.c, this.n);
        }
        return this.r;
    }

    public void k(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b93209d1", new Object[]{this, new Integer(i)});
        } else {
            this.f33226a = i;
        }
    }
}
