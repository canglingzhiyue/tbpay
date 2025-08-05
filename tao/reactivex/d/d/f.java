package tao.reactivex.d.d;

import com.android.alibaba.ip.runtime.IpChange;
import tb.jdz;
import tb.kge;
import tb.mup;
import tb.muw;

/* loaded from: classes9.dex */
public final class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1471015053);
    }

    public static <T, U> void a(mup<T> mupVar, tao.reactivex.j<? super U> jVar, boolean z, jdz jdzVar, tao.reactivex.d.h.h<T, U> hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2fc6f68", new Object[]{mupVar, jVar, new Boolean(z), jdzVar, hVar});
            return;
        }
        int i = 1;
        while (!a(hVar.c(), mupVar.d(), jVar, z, mupVar, jdzVar, hVar)) {
            while (true) {
                boolean c = hVar.c();
                T c2 = mupVar.c();
                boolean z2 = c2 == null;
                if (a(c, z2, jVar, z, mupVar, jdzVar, hVar)) {
                    return;
                }
                if (!z2) {
                    hVar.a(jVar, c2);
                } else {
                    i = hVar.a(-i);
                    if (i == 0) {
                        return;
                    }
                }
            }
        }
    }

    public static <T, U> boolean a(boolean z, boolean z2, tao.reactivex.j<?> jVar, boolean z3, muw<?> muwVar, jdz jdzVar, tao.reactivex.d.h.h<T, U> hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8ee708f3", new Object[]{new Boolean(z), new Boolean(z2), jVar, new Boolean(z3), muwVar, jdzVar, hVar})).booleanValue();
        }
        if (hVar.a()) {
            muwVar.e();
            jdzVar.b_();
            return true;
        }
        if (z) {
            if (!z3) {
                Throwable e = hVar.e();
                if (e != null) {
                    muwVar.e();
                    if (jdzVar != null) {
                        jdzVar.b_();
                    }
                    jVar.onError(e);
                    return true;
                } else if (z2) {
                    if (jdzVar != null) {
                        jdzVar.b_();
                    }
                    jVar.onComplete();
                    return true;
                }
            } else if (z2) {
                if (jdzVar != null) {
                    jdzVar.b_();
                }
                Throwable e2 = hVar.e();
                if (e2 != null) {
                    jVar.onError(e2);
                } else {
                    jVar.onComplete();
                }
                return true;
            }
        }
        return false;
    }
}
