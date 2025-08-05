package tao.reactivex.d.d;

import com.android.alibaba.ip.runtime.IpChange;
import tb.jdz;
import tb.kge;
import tb.khl;
import tb.mux;

/* loaded from: classes9.dex */
public abstract class a<T, R> implements tao.reactivex.j<T>, khl<R> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final tao.reactivex.j<? super R> f25095a;
    public jdz b;
    public khl<T> c;
    public boolean d;
    public int e;

    static {
        kge.a(-1471015058);
        kge.a(-1471016018);
        kge.a(-605775859);
    }

    public a(tao.reactivex.j<? super R> jVar) {
        this.f25095a = jVar;
    }

    public final void a(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb9ad88d", new Object[]{this, th});
            return;
        }
        tao.reactivex.b.b.a(th);
        this.b.b_();
        onError(th);
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // tb.muw
    public final boolean a(R r) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a6251248", new Object[]{this, r})).booleanValue();
        }
        throw new UnsupportedOperationException("Should not be called!");
    }

    public final int b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a9d66c2d", new Object[]{this, new Integer(i)})).intValue();
        }
        khl<T> khlVar = this.c;
        if (khlVar == null || (i & 4) != 0) {
            return 0;
        }
        int a2 = khlVar.a(i);
        if (a2 != 0) {
            this.e = a2;
        }
        return a2;
    }

    @Override // tb.jdz
    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.b.b();
    }

    @Override // tb.jdz
    public void b_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac8b2a44", new Object[]{this});
        } else {
            this.b.b_();
        }
    }

    @Override // tb.muw
    public boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : this.c.d();
    }

    @Override // tb.muw
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else {
            this.c.e();
        }
    }

    @Override // tao.reactivex.j
    public void onComplete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cbffcbf", new Object[]{this});
        } else if (this.d) {
        } else {
            this.d = true;
            this.f25095a.onComplete();
        }
    }

    @Override // tao.reactivex.j
    public void onError(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf54aa85", new Object[]{this, th});
        } else if (this.d) {
            mux.a(th);
        } else {
            this.d = true;
            this.f25095a.onError(th);
        }
    }

    @Override // tao.reactivex.j
    public final void onSubscribe(jdz jdzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("940fff22", new Object[]{this, jdzVar});
        } else if (!tao.reactivex.d.a.a.a(this.b, jdzVar)) {
        } else {
            this.b = jdzVar;
            if (jdzVar instanceof khl) {
                this.c = (khl) jdzVar;
            }
            if (!a()) {
                return;
            }
            this.f25095a.onSubscribe(this);
        }
    }
}
