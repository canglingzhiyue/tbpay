package tao.reactivex.d.g;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import tb.kgk;
import tb.mux;
import tb.nam;

/* loaded from: classes9.dex */
public enum g implements nam {
    CANCELLED;

    public static void a(AtomicReference<nam> atomicReference, AtomicLong atomicLong, long j) {
        nam namVar = atomicReference.get();
        if (namVar != null) {
            namVar.a(j);
        } else if (!b(j)) {
        } else {
            tao.reactivex.d.h.d.a(atomicLong, j);
            nam namVar2 = atomicReference.get();
            if (namVar2 == null) {
                return;
            }
            long andSet = atomicLong.getAndSet(0L);
            if (andSet == 0) {
                return;
            }
            namVar2.a(andSet);
        }
    }

    public static boolean a(AtomicReference<nam> atomicReference) {
        nam andSet;
        nam namVar = atomicReference.get();
        g gVar = CANCELLED;
        if (namVar == gVar || (andSet = atomicReference.getAndSet(gVar)) == CANCELLED) {
            return false;
        }
        if (andSet == null) {
            return true;
        }
        andSet.a();
        return true;
    }

    public static boolean a(AtomicReference<nam> atomicReference, AtomicLong atomicLong, nam namVar) {
        if (a(atomicReference, namVar)) {
            long andSet = atomicLong.getAndSet(0L);
            if (andSet == 0) {
                return true;
            }
            namVar.a(andSet);
            return true;
        }
        return false;
    }

    public static boolean a(AtomicReference<nam> atomicReference, nam namVar) {
        kgk.a(namVar, "s is null");
        if (!atomicReference.compareAndSet(null, namVar)) {
            namVar.a();
            if (atomicReference.get() == CANCELLED) {
                return false;
            }
            b();
            return false;
        }
        return true;
    }

    public static boolean a(nam namVar, nam namVar2) {
        if (namVar2 == null) {
            mux.a(new NullPointerException("next is null"));
            return false;
        } else if (namVar == null) {
            return true;
        } else {
            namVar2.a();
            b();
            return false;
        }
    }

    public static void b() {
        mux.a(new tao.reactivex.b.e("Subscription already set!"));
    }

    public static boolean b(long j) {
        if (j <= 0) {
            mux.a(new IllegalArgumentException("n > 0 required but it was " + j));
            return false;
        }
        return true;
    }

    @Override // tb.nam
    public void a() {
    }

    @Override // tb.nam
    public void a(long j) {
    }
}
