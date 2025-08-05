package com.nirvana.tools.jsoner;

import android.util.LruCache;

/* loaded from: classes4.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private LruCache<Class, f> f8088a = new LruCache<>(100);

    public f a(Class cls) {
        return this.f8088a.get(cls);
    }

    public void a(Class cls, f fVar) {
        this.f8088a.put(cls, fVar);
    }
}
