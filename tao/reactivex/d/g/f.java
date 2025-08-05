package tao.reactivex.d.g;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import tb.kge;
import tb.muz;
import tb.nam;

/* loaded from: classes9.dex */
public class f<T> extends AtomicInteger implements tao.reactivex.d<T>, nam {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final muz<? super T> f25141a;
    public final tao.reactivex.d.h.c b = new tao.reactivex.d.h.c();
    public final AtomicLong c = new AtomicLong();
    public final AtomicReference<nam> d = new AtomicReference<>();
    public final AtomicBoolean e = new AtomicBoolean();
    public volatile boolean f;

    static {
        kge.a(-1471012170);
        kge.a(-605775865);
        kge.a(1964950430);
    }

    public f(muz<? super T> muzVar) {
        this.f25141a = muzVar;
    }

    @Override // tb.nam
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.f) {
        } else {
            g.a(this.d);
        }
    }

    @Override // tb.nam
    public void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
        } else if (j > 0) {
            g.a(this.d, this.c, j);
        } else {
            a();
            onError(new IllegalArgumentException("§3.9 violated: positive request amount required but it was " + j));
        }
    }

    @Override // tb.muz
    public void onComplete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cbffcbf", new Object[]{this});
            return;
        }
        this.f = true;
        tao.reactivex.d.h.f.a(this.f25141a, this, this.b);
    }

    @Override // tb.muz
    public void onError(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf54aa85", new Object[]{this, th});
            return;
        }
        this.f = true;
        tao.reactivex.d.h.f.a((muz<?>) this.f25141a, th, (AtomicInteger) this, this.b);
    }

    @Override // tb.muz
    public void onNext(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4b8495", new Object[]{this, t});
        } else {
            tao.reactivex.d.h.f.a(this.f25141a, t, this, this.b);
        }
    }

    @Override // tao.reactivex.d, tb.muz
    public void onSubscribe(nam namVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ab33248", new Object[]{this, namVar});
        } else if (this.e.compareAndSet(false, true)) {
            this.f25141a.onSubscribe(this);
            g.a(this.d, this.c, namVar);
        } else {
            namVar.a();
            a();
            onError(new IllegalStateException("§2.12 violated: onSubscribe must be called at most once"));
        }
    }
}
