package tao.reactivex;

import tb.jdz;

/* loaded from: classes9.dex */
public interface j<T> {
    void onComplete();

    void onError(Throwable th);

    void onNext(T t);

    void onSubscribe(jdz jdzVar);
}
