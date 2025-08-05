package tao.reactivex.d.a;

import java.util.concurrent.atomic.AtomicReference;
import tao.reactivex.b.e;
import tb.jdz;
import tb.kgk;
import tb.mux;

/* loaded from: classes9.dex */
public enum a implements jdz {
    DISPOSED;

    public static boolean a(AtomicReference<jdz> atomicReference) {
        jdz andSet;
        jdz jdzVar = atomicReference.get();
        a aVar = DISPOSED;
        if (jdzVar == aVar || (andSet = atomicReference.getAndSet(aVar)) == aVar) {
            return false;
        }
        if (andSet == null) {
            return true;
        }
        andSet.b_();
        return true;
    }

    public static boolean a(AtomicReference<jdz> atomicReference, jdz jdzVar) {
        jdz jdzVar2;
        do {
            jdzVar2 = atomicReference.get();
            if (jdzVar2 == DISPOSED) {
                if (jdzVar == null) {
                    return false;
                }
                jdzVar.b_();
                return false;
            }
        } while (!atomicReference.compareAndSet(jdzVar2, jdzVar));
        if (jdzVar2 != null) {
            jdzVar2.b_();
            return true;
        }
        return true;
    }

    public static boolean a(jdz jdzVar) {
        return jdzVar == DISPOSED;
    }

    public static boolean a(jdz jdzVar, jdz jdzVar2) {
        if (jdzVar2 == null) {
            mux.a(new NullPointerException("next is null"));
            return false;
        } else if (jdzVar == null) {
            return true;
        } else {
            jdzVar2.b_();
            c();
            return false;
        }
    }

    public static boolean b(AtomicReference<jdz> atomicReference, jdz jdzVar) {
        kgk.a(jdzVar, "d is null");
        if (!atomicReference.compareAndSet(null, jdzVar)) {
            jdzVar.b_();
            if (atomicReference.get() == DISPOSED) {
                return false;
            }
            c();
            return false;
        }
        return true;
    }

    public static void c() {
        mux.a(new e("Disposable already set!"));
    }

    public static boolean c(AtomicReference<jdz> atomicReference, jdz jdzVar) {
        jdz jdzVar2;
        do {
            jdzVar2 = atomicReference.get();
            if (jdzVar2 == DISPOSED) {
                if (jdzVar == null) {
                    return false;
                }
                jdzVar.b_();
                return false;
            }
        } while (!atomicReference.compareAndSet(jdzVar2, jdzVar));
        return true;
    }

    public static boolean d(AtomicReference<jdz> atomicReference, jdz jdzVar) {
        if (!atomicReference.compareAndSet(null, jdzVar)) {
            if (atomicReference.get() != DISPOSED) {
                return false;
            }
            jdzVar.b_();
            return false;
        }
        return true;
    }

    @Override // tb.jdz
    public boolean b() {
        return true;
    }

    @Override // tb.jdz
    public void b_() {
    }
}
