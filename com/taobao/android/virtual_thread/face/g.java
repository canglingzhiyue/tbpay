package com.taobao.android.virtual_thread.face;

/* loaded from: classes6.dex */
public interface g {

    /* loaded from: classes6.dex */
    public interface a<T> {
        T get();
    }

    <T> ThreadLocal<T> a(a<? extends T> aVar);
}
