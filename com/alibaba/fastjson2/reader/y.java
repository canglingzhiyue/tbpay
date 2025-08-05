package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONReader;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import tb.kge;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class y<T> extends bj<T> {
    static {
        kge.a(-1166585196);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public y(String str, Type type, Class cls, int i, long j, String str2, Method method, Field field) {
        super(str, type, cls, i, j, str2, null, null, method, field, null);
        Type type2;
        if (type instanceof ParameterizedType) {
            Type[] actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments();
            if (actualTypeArguments.length > 0) {
                type2 = actualTypeArguments[0];
                this.s = type2;
            }
        }
        type2 = null;
        this.s = type2;
    }

    @Override // com.alibaba.fastjson2.reader.bj, com.alibaba.fastjson2.reader.d
    public void a(T t, Object obj) {
        if (obj == null) {
            return;
        }
        try {
            Collection collection = (Collection) this.g.invoke(t, new Object[0]);
            if (collection == Collections.EMPTY_LIST || collection == Collections.EMPTY_SET || collection == null || collection.equals(obj)) {
                return;
            }
            String name = collection.getClass().getName();
            if ("java.util.Collections$UnmodifiableRandomAccessList".equals(name) || "java.util.Arrays$ArrayList".equals(name) || "java.util.Collections$SingletonList".equals(name) || obj == collection) {
                return;
            }
            for (Object obj2 : (Collection) obj) {
                if (obj2 != null && (obj2 instanceof Map) && (this.s instanceof Class) && !((Class) this.s).isAssignableFrom(obj2.getClass())) {
                    if (this.u == null) {
                        this.u = JSONFactory.defaultObjectReaderProvider.a(this.s);
                    }
                    obj2 = this.u.a((Map) obj2, 0L);
                }
                collection.add(obj2);
            }
        } catch (Exception e) {
            throw new JSONException("set " + this.b + " error", e);
        }
    }

    @Override // com.alibaba.fastjson2.reader.bj, com.alibaba.fastjson2.reader.d
    public void b(JSONReader jSONReader, T t) {
        if (this.y == null) {
            this.y = jSONReader.f2934a.a(this.d);
        }
        a((y<T>) t, jSONReader.w ? this.y.b(jSONReader, this.d, this.b, 0L) : this.y.a(jSONReader, this.d, this.b, 0L));
    }

    @Override // com.alibaba.fastjson2.reader.d
    public boolean c() {
        return true;
    }
}
