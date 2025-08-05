package com.airbnb.lottie.model;

import android.support.v4.util.LruCache;

/* loaded from: classes2.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    private static final f f1771a = new f();
    private final LruCache<String, com.airbnb.lottie.g> b = new LruCache<>(20);

    f() {
    }

    public static f a() {
        return f1771a;
    }

    public com.airbnb.lottie.g a(String str) {
        if (str == null) {
            return null;
        }
        return this.b.get(str);
    }

    public void a(String str, com.airbnb.lottie.g gVar) {
        if (str == null) {
            return;
        }
        this.b.put(str, gVar);
    }
}
