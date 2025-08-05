package com.taobao.message.kit.core;

/* loaded from: classes7.dex */
public interface IObserver<T> {
    void onComplete();

    void onError(Throwable th);

    void onNext(T t);
}
