package com.meizu.cloud.pushsdk.e.b;

import com.meizu.cloud.pushsdk.e.d.k;

/* loaded from: classes4.dex */
public class c<T> {

    /* renamed from: a  reason: collision with root package name */
    private final T f7905a;
    private final com.meizu.cloud.pushsdk.e.c.a b;
    private k c;

    public c(com.meizu.cloud.pushsdk.e.c.a aVar) {
        this.f7905a = null;
        this.b = aVar;
    }

    public c(T t) {
        this.f7905a = t;
        this.b = null;
    }

    public static <T> c<T> a(com.meizu.cloud.pushsdk.e.c.a aVar) {
        return new c<>(aVar);
    }

    public static <T> c<T> a(T t) {
        return new c<>(t);
    }

    public com.meizu.cloud.pushsdk.e.c.a a() {
        return this.b;
    }

    public void a(k kVar) {
        this.c = kVar;
    }

    public T b() {
        return this.f7905a;
    }

    public boolean c() {
        return this.b == null;
    }
}
