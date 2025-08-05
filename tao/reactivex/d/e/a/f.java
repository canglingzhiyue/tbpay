package tao.reactivex.d.e.a;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.atomic.AtomicLong;
import tb.jev;
import tb.kge;
import tb.mup;
import tb.muz;
import tb.nam;

/* loaded from: classes9.dex */
public final class f<T> extends tao.reactivex.d.e.a.a<T, T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final jev f;

    /* loaded from: classes9.dex */
    public static final class a<T> extends tao.reactivex.d.g.c<T> implements tao.reactivex.d<T> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final muz<? super T> f25106a;
        public final mup<T> b;
        public final boolean c;
        public final jev d;
        public nam e;
        public volatile boolean f;
        public volatile boolean g;
        public Throwable h;
        public final AtomicLong i = new AtomicLong();
        public boolean j;

        static {
            kge.a(-1367749437);
            kge.a(-605775865);
        }

        public a(muz<? super T> muzVar, int i, boolean z, boolean z2, jev jevVar) {
            this.f25106a = muzVar;
            this.d = jevVar;
            this.c = z2;
            this.b = z ? new tao.reactivex.d.f.c<>(i) : new tao.reactivex.d.f.b<>(i);
        }

        @Override // tb.miv
        public int a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("a821938e", new Object[]{this, new Integer(i)})).intValue();
            }
            if ((i & 2) == 0) {
                return 0;
            }
            this.j = true;
            return 2;
        }

        @Override // tb.nam
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else if (this.f) {
            } else {
                this.f = true;
                this.e.a();
                if (getAndIncrement() != 0) {
                    return;
                }
                this.b.e();
            }
        }

        @Override // tb.nam
        public void a(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
            } else if (this.j || !tao.reactivex.d.g.g.b(j)) {
            } else {
                tao.reactivex.d.h.d.a(this.i, j);
                b();
            }
        }

        public boolean a(boolean z, boolean z2, muz<? super T> muzVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("e342be4a", new Object[]{this, new Boolean(z), new Boolean(z2), muzVar})).booleanValue();
            }
            if (this.f) {
                this.b.e();
                return true;
            }
            if (z) {
                if (!this.c) {
                    Throwable th = this.h;
                    if (th != null) {
                        this.b.e();
                        muzVar.onError(th);
                        return true;
                    } else if (z2) {
                        muzVar.onComplete();
                        return true;
                    }
                } else if (z2) {
                    Throwable th2 = this.h;
                    if (th2 != null) {
                        muzVar.onError(th2);
                    } else {
                        muzVar.onComplete();
                    }
                    return true;
                }
            }
            return false;
        }

        public void b() {
            int i;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            } else if (getAndIncrement() != 0) {
            } else {
                mup<T> mupVar = this.b;
                muz<? super T> muzVar = this.f25106a;
                int i2 = 1;
                while (!a(this.g, mupVar.d(), muzVar)) {
                    long j = this.i.get();
                    long j2 = 0;
                    while (true) {
                        i = (j2 > j ? 1 : (j2 == j ? 0 : -1));
                        if (i == 0) {
                            break;
                        }
                        boolean z = this.g;
                        Object obj = (T) mupVar.c();
                        boolean z2 = obj == null;
                        if (!a(z, z2, muzVar)) {
                            if (z2) {
                                break;
                            }
                            muzVar.onNext(obj);
                            j2++;
                        } else {
                            return;
                        }
                    }
                    if (i == 0 && a(this.g, mupVar.d(), muzVar)) {
                        return;
                    }
                    if (j2 != 0 && j != Long.MAX_VALUE) {
                        this.i.addAndGet(-j2);
                    }
                    i2 = addAndGet(-i2);
                    if (i2 == 0) {
                        return;
                    }
                }
            }
        }

        @Override // tb.muw
        public T c() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("ca3f7d08", new Object[]{this}) : this.b.c();
        }

        @Override // tb.muw
        public boolean d() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : this.b.d();
        }

        @Override // tb.muw
        public void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            } else {
                this.b.e();
            }
        }

        @Override // tb.muz
        public void onComplete() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5cbffcbf", new Object[]{this});
                return;
            }
            this.g = true;
            if (this.j) {
                this.f25106a.onComplete();
            } else {
                b();
            }
        }

        @Override // tb.muz
        public void onError(Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cf54aa85", new Object[]{this, th});
                return;
            }
            this.h = th;
            this.g = true;
            if (this.j) {
                this.f25106a.onError(th);
            } else {
                b();
            }
        }

        @Override // tb.muz
        public void onNext(T t) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b4b8495", new Object[]{this, t});
            } else if (!this.b.a(t)) {
                this.e.a();
                onError(new tao.reactivex.b.c("Buffer is full"));
            } else if (this.j) {
                this.f25106a.onNext(null);
            } else {
                b();
            }
        }

        @Override // tao.reactivex.d, tb.muz
        public void onSubscribe(nam namVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9ab33248", new Object[]{this, namVar});
            } else if (!tao.reactivex.d.g.g.a(this.e, namVar)) {
            } else {
                this.e = namVar;
                this.f25106a.onSubscribe(this);
                namVar.a(Long.MAX_VALUE);
            }
        }
    }

    static {
        kge.a(-600305274);
    }

    public f(tao.reactivex.c<T> cVar, int i, boolean z, boolean z2, jev jevVar) {
        super(cVar);
        this.c = i;
        this.d = z;
        this.e = z2;
        this.f = jevVar;
    }

    @Override // tao.reactivex.c
    public void b(muz<? super T> muzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3c16447", new Object[]{this, muzVar});
        } else {
            this.b.a((tao.reactivex.d) new a(muzVar, this.c, this.d, this.e, this.f));
        }
    }
}
