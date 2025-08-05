package com.taobao.message.lab.comfrm.util;

/* loaded from: classes7.dex */
public interface Observer<T> {
    void onComplete();

    void onData(T t);

    void onError(String str, String str2, Object obj);
}
