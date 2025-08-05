package com.alibaba.fastjson2;

import com.alibaba.fastjson2.util.BeanUtils;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import tb.kge;

/* loaded from: classes2.dex */
public abstract class t<T> {
    protected final Type b;
    protected final Class<? super T> c;

    static {
        kge.a(761625583);
    }

    public t() {
        this.b = ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
        this.c = (Class<? super T>) BeanUtils.e(this.b);
    }

    private t(Type type, boolean z) {
        if (type != null) {
            this.b = BeanUtils.d(type);
            this.c = (Class<? super T>) BeanUtils.e(type);
            return;
        }
        throw new NullPointerException();
    }

    public static t<?> a(Type type) {
        return new t<Object>(type, true) { // from class: com.alibaba.fastjson2.t.1
        };
    }

    public final Type a() {
        return this.b;
    }

    public final Class<? super T> b() {
        return this.c;
    }
}
