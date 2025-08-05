package tao.reactivex.d.e.b;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import tb.jdz;
import tb.kge;

/* loaded from: classes9.dex */
public final class s extends tao.reactivex.e<Long> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final tao.reactivex.k f25133a;
    public final long b;
    public final TimeUnit c;

    /* loaded from: classes9.dex */
    public static final class a extends AtomicReference<jdz> implements Runnable, jdz {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final tao.reactivex.j<? super Long> f25134a;

        static {
            kge.a(-1366813423);
            kge.a(-1390502639);
            kge.a(1964944663);
        }

        public a(tao.reactivex.j<? super Long> jVar) {
            this.f25134a = jVar;
        }

        public void a(jdz jdzVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ef304458", new Object[]{this, jdzVar});
            } else {
                tao.reactivex.d.a.a.d(this, jdzVar);
            }
        }

        @Override // tb.jdz
        public boolean b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : get() == tao.reactivex.d.a.a.DISPOSED;
        }

        @Override // tb.jdz
        public void b_() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ac8b2a44", new Object[]{this});
            } else {
                tao.reactivex.d.a.a.a((AtomicReference<jdz>) this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (b()) {
            } else {
                this.f25134a.onNext(0L);
                lazySet(tao.reactivex.d.a.b.INSTANCE);
                this.f25134a.onComplete();
            }
        }
    }

    static {
        kge.a(-600304300);
    }

    public s(long j, TimeUnit timeUnit, tao.reactivex.k kVar) {
        this.b = j;
        this.c = timeUnit;
        this.f25133a = kVar;
    }

    @Override // tao.reactivex.e
    public void a(tao.reactivex.j<? super Long> jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aac18b2c", new Object[]{this, jVar});
            return;
        }
        a aVar = new a(jVar);
        jVar.onSubscribe(aVar);
        aVar.a(this.f25133a.a(aVar, this.b, this.c));
    }
}
