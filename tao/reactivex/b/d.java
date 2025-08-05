package tao.reactivex.b;

import tb.kge;

/* loaded from: classes9.dex */
public final class d extends RuntimeException {
    static {
        kge.a(1964945626);
    }

    public d(Throwable th) {
        super(th != null ? th.getMessage() : null, th == null ? new NullPointerException() : th);
    }
}
