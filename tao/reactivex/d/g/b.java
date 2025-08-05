package tao.reactivex.d.g;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.mun;
import tb.mux;
import tb.muz;
import tb.nam;

/* loaded from: classes9.dex */
public abstract class b<T, R> implements tao.reactivex.d<T>, mun<R> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final muz<? super R> b;
    public nam c;
    public mun<T> d;
    public boolean e;
    public int f;

    static {
        kge.a(-1471012174);
        kge.a(-605775865);
        kge.a(-1471016016);
    }

    public b(muz<? super R> muzVar) {
        this.b = muzVar;
    }

    @Override // tb.nam
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.c.a();
        }
    }

    @Override // tb.nam
    public void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
        } else {
            this.c.a(j);
        }
    }

    public final void a(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb9ad88d", new Object[]{this, th});
            return;
        }
        tao.reactivex.b.b.a(th);
        this.c.a();
        onError(th);
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
        mun<T> munVar = this.d;
        if (munVar == null || (i & 4) != 0) {
            return 0;
        }
        int a2 = munVar.a(i);
        if (a2 != 0) {
            this.f = a2;
        }
        return a2;
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // tb.muw
    public boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : this.d.d();
    }

    @Override // tb.muw
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else {
            this.d.e();
        }
    }

    @Override // tb.muz
    public void onComplete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cbffcbf", new Object[]{this});
        } else if (this.e) {
        } else {
            this.e = true;
            this.b.onComplete();
        }
    }

    @Override // tb.muz
    public void onError(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf54aa85", new Object[]{this, th});
        } else if (this.e) {
            mux.a(th);
        } else {
            this.e = true;
            this.b.onError(th);
        }
    }

    @Override // tao.reactivex.d, tb.muz
    public final void onSubscribe(nam namVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ab33248", new Object[]{this, namVar});
        } else if (!g.a(this.c, namVar)) {
        } else {
            this.c = namVar;
            if (namVar instanceof mun) {
                this.d = (mun) namVar;
            }
            if (!b()) {
                return;
            }
            this.b.onSubscribe(this);
        }
    }
}
