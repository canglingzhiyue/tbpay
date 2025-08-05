package com.meizu.cloud.pushsdk.d;

/* loaded from: classes4.dex */
public class h<T> {

    /* renamed from: a  reason: collision with root package name */
    private T f7880a;
    private T b;

    /* JADX INFO: Access modifiers changed from: protected */
    public h(T t) {
        if (t != null) {
            this.b = t;
            return;
        }
        throw new RuntimeException("proxy must be has a default implementation");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public T b() {
        T t = this.f7880a;
        return t != null ? t : this.b;
    }
}
