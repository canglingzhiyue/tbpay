package tao.reactivex.d.a;

import tao.reactivex.j;
import tb.khl;

/* loaded from: classes9.dex */
public enum b implements khl<Object> {
    INSTANCE,
    NEVER;

    public static void a(Throwable th, j<?> jVar) {
        jVar.onSubscribe(INSTANCE);
        jVar.onError(th);
    }

    public static void a(j<?> jVar) {
        jVar.onSubscribe(INSTANCE);
        jVar.onComplete();
    }

    @Override // tb.miv
    public int a(int i) {
        return i & 2;
    }

    @Override // tb.muw
    public boolean a(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // tb.jdz
    public boolean b() {
        return this == INSTANCE;
    }

    @Override // tb.jdz
    public void b_() {
    }

    @Override // tb.muw
    public Object c() {
        return null;
    }

    @Override // tb.muw
    public boolean d() {
        return true;
    }

    @Override // tb.muw
    public void e() {
    }
}
