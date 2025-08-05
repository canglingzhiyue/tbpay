package tao.reactivex.d.d;

import com.android.alibaba.ip.runtime.IpChange;
import tb.jdz;
import tb.kge;
import tb.mup;

/* loaded from: classes9.dex */
public abstract class g<T, U, V> extends i implements tao.reactivex.d.h.h<U, V>, tao.reactivex.j<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final tao.reactivex.j<? super V> f25098a;
    public final mup<U> b;
    public volatile boolean c;
    public volatile boolean d;
    public Throwable e;

    static {
        kge.a(-1471015052);
        kge.a(-1471011207);
        kge.a(-605775859);
    }

    public g(tao.reactivex.j<? super V> jVar, mup<U> mupVar) {
        this.f25098a = jVar;
        this.b = mupVar;
    }

    @Override // tao.reactivex.d.h.h
    public final int a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a821938e", new Object[]{this, new Integer(i)})).intValue() : this.f.addAndGet(i);
    }

    public final void a(U u, boolean z, jdz jdzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9ee9900", new Object[]{this, u, new Boolean(z), jdzVar});
            return;
        }
        tao.reactivex.j<? super V> jVar = this.f25098a;
        mup<U> mupVar = this.b;
        if (this.f.get() != 0 || !this.f.compareAndSet(0, 1)) {
            mupVar.a(u);
            if (!d()) {
                return;
            }
        } else {
            a(jVar, u);
            if (a(-1) == 0) {
                return;
            }
        }
        f.a(mupVar, jVar, z, jdzVar, this);
    }

    @Override // tao.reactivex.d.h.h
    public void a(tao.reactivex.j<? super V> jVar, U u) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee218808", new Object[]{this, jVar, u});
        }
    }

    @Override // tao.reactivex.d.h.h
    public final boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.c;
    }

    public final void b(U u, boolean z, jdz jdzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("621ed8df", new Object[]{this, u, new Boolean(z), jdzVar});
            return;
        }
        tao.reactivex.j<? super V> jVar = this.f25098a;
        mup<U> mupVar = this.b;
        if (this.f.get() != 0 || !this.f.compareAndSet(0, 1)) {
            mupVar.a(u);
            if (!d()) {
                return;
            }
        } else if (mupVar.d()) {
            a(jVar, u);
            if (a(-1) == 0) {
                return;
            }
        } else {
            mupVar.a(u);
        }
        f.a(mupVar, jVar, z, jdzVar, this);
    }

    @Override // tao.reactivex.d.h.h
    public final boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.d;
    }

    public final boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : this.f.getAndIncrement() == 0;
    }

    @Override // tao.reactivex.d.h.h
    public final Throwable e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Throwable) ipChange.ipc$dispatch("8ad1b151", new Object[]{this}) : this.e;
    }
}
