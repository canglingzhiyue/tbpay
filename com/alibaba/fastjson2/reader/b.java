package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.function.Supplier;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import tb.kge;

/* loaded from: classes2.dex */
final class b implements Supplier {

    /* renamed from: a  reason: collision with root package name */
    final Constructor f2950a;
    final Class b;
    final boolean c;
    final int d;

    static {
        kge.a(-1282591140);
        kge.a(2145810977);
    }

    public b(Constructor constructor) {
        boolean z = true;
        constructor.setAccessible(true);
        this.f2950a = constructor;
        this.b = this.f2950a.getDeclaringClass();
        this.d = constructor.getParameterTypes().length;
        this.c = (this.d != 0 || !Modifier.isPublic(constructor.getModifiers()) || !Modifier.isPublic(this.b.getModifiers())) ? false : z;
    }

    @Override // com.alibaba.fastjson2.function.Supplier
    public Object get() {
        try {
            return this.c ? this.b.newInstance() : this.d == 1 ? this.f2950a.newInstance(new Object[1]) : this.f2950a.newInstance(new Object[0]);
        } catch (Throwable th) {
            throw new JSONException("create instance error", th);
        }
    }
}
