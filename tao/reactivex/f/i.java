package tao.reactivex.f;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReferenceArray;
import tb.jdz;
import tb.jeq;
import tb.kge;

/* loaded from: classes9.dex */
public final class i extends AtomicReferenceArray<Object> implements Runnable, Callable<Object>, jdz {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Object b;
    public static final Object c;
    public static final Object d;
    public static final Object e;

    /* renamed from: a  reason: collision with root package name */
    public final Runnable f25161a;

    static {
        kge.a(1964949475);
        kge.a(-1390502639);
        kge.a(-119797776);
        kge.a(1964944663);
        b = new Object();
        c = new Object();
        d = new Object();
        e = new Object();
    }

    public i(Runnable runnable, jeq jeqVar) {
        super(3);
        this.f25161a = runnable;
        lazySet(0, jeqVar);
    }

    public void a(Future<?> future) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6f9effe", new Object[]{this, future});
            return;
        }
        do {
            obj = get(1);
            if (obj == e) {
                return;
            }
            if (obj == c) {
                future.cancel(false);
                return;
            } else if (obj == d) {
                future.cancel(true);
                return;
            }
        } while (!compareAndSet(1, obj, future));
    }

    @Override // tb.jdz
    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        Object obj = get(0);
        return obj == b || obj == e;
    }

    @Override // tb.jdz
    public void b_() {
        Object obj;
        Object obj2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac8b2a44", new Object[]{this});
            return;
        }
        while (true) {
            Object obj3 = get(1);
            if (obj3 == e || obj3 == c || obj3 == d) {
                break;
            }
            boolean z = get(2) != Thread.currentThread();
            if (compareAndSet(1, obj3, z ? d : c)) {
                if (obj3 != null) {
                    ((Future) obj3).cancel(z);
                }
            }
        }
        do {
            obj = get(0);
            if (obj == e || obj == (obj2 = b) || obj == null) {
                return;
            }
        } while (!compareAndSet(0, obj, obj2));
        ((jeq) obj).c(this);
    }

    @Override // java.util.concurrent.Callable
    public Object call() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("6d249ded", new Object[]{this});
        }
        run();
        return null;
    }

    @Override // java.lang.Runnable
    public void run() {
        Object obj;
        Object obj2;
        Object obj3;
        boolean compareAndSet;
        Object obj4;
        Object obj5;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        lazySet(2, Thread.currentThread());
        try {
            this.f25161a.run();
        } finally {
            try {
                lazySet(2, null);
                obj4 = get(0);
                if (obj4 != b) {
                    ((jeq) obj4).c(this);
                }
                do {
                    obj5 = get(1);
                    if (obj5 == c) {
                        return;
                    }
                    return;
                } while (!compareAndSet(1, obj5, e));
            } catch (Throwable th) {
                do {
                    if (obj == obj2) {
                        break;
                    } else if (obj == obj3) {
                        break;
                    }
                } while (!compareAndSet);
            }
        }
        lazySet(2, null);
        obj4 = get(0);
        if (obj4 != b && compareAndSet(0, obj4, e) && obj4 != null) {
            ((jeq) obj4).c(this);
        }
        do {
            obj5 = get(1);
            if (obj5 == c || obj5 == d) {
                return;
            }
        } while (!compareAndSet(1, obj5, e));
    }
}
