package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import tb.kge;

/* loaded from: classes2.dex */
public class bf<T, V> extends bj<T> {
    final long v;
    final long w;

    static {
        kge.a(-661998063);
    }

    public bf(String str, Type type, Class cls, Type type2, Class cls2, int i, long j, String str2, Locale locale, Object obj, Method method, Field field, com.alibaba.fastjson2.function.a aVar) {
        super(str, type, cls, i, j, str2, locale, obj, method, field, aVar);
        this.s = type2;
        this.t = cls2;
        long j2 = 0;
        this.w = this.t == null ? 0L : com.alibaba.fastjson2.util.c.b(cls2.getName());
        this.v = cls != null ? com.alibaba.fastjson2.util.c.b(TypeUtils.a(cls)) : j2;
        if (str2 == null || type2 != Date.class) {
            return;
        }
        this.u = new cq(str2, locale);
    }

    public void a(T t, JSONArray jSONArray) {
        a((bf<T, V>) t, (Object) jSONArray);
    }

    @Override // com.alibaba.fastjson2.reader.bj, com.alibaba.fastjson2.reader.d
    public Object b(JSONReader jSONReader) {
        com.alibaba.fastjson2.function.d a2;
        int i = 0;
        if (jSONReader.w) {
            int t = jSONReader.t();
            Object[] objArr = new Object[t];
            bu b = b(jSONReader.f2934a);
            while (i < t) {
                objArr[i] = b.a(jSONReader, (Type) null, (Object) null, 0L);
                i++;
            }
            return Arrays.asList(objArr);
        } else if (jSONReader.a() == '[') {
            JSONReader.c cVar = jSONReader.f2934a;
            bu b2 = b(cVar);
            Collection<V> c = c(cVar);
            jSONReader.D();
            while (!jSONReader.r()) {
                c.add((V) b2.a(jSONReader, (Type) null, (Object) null, 0L));
                jSONReader.s();
            }
            jSONReader.s();
            return c;
        } else {
            if (jSONReader.z()) {
                String az = jSONReader.az();
                if ((this.s instanceof Class) && Number.class.isAssignableFrom((Class) this.s) && (a2 = jSONReader.f2934a.w.a(String.class, this.s)) != null) {
                    Collection<V> c2 = c(jSONReader.f2934a);
                    if (az.indexOf(44) != -1) {
                        String[] split = az.split(",");
                        int length = split.length;
                        while (i < length) {
                            c2.add((V) a2.apply(split[i]));
                            i++;
                        }
                    }
                    return c2;
                }
            }
            throw new JSONException(jSONReader.d("TODO : " + getClass()));
        }
    }

    @Override // com.alibaba.fastjson2.reader.bj, com.alibaba.fastjson2.reader.d
    public void b(JSONReader jSONReader, T t) {
        V v;
        if (jSONReader.w) {
            a(jSONReader, (JSONReader) t);
            return;
        }
        com.alibaba.fastjson2.function.d dVar = null;
        if (jSONReader.g()) {
            a((bf<T, V>) t, (JSONArray) null);
            return;
        }
        JSONReader.c cVar = jSONReader.f2934a;
        bu a2 = a(cVar);
        if (this.y != null) {
            dVar = this.y.f();
        } else if (a2 instanceof dq) {
            dVar = a2.f();
        }
        char a3 = jSONReader.a();
        if (a3 != '[') {
            if (a3 != '{' || !(b(cVar) instanceof cc)) {
                a((bf<T, V>) t, a2.a(jSONReader, (Type) null, (Object) null, this.e));
                return;
            }
            Object a4 = this.u.a(jSONReader, (Type) null, (Object) null, this.e);
            Collection collection = (Collection) a2.a(this.e);
            collection.add(a4);
            if (dVar != null) {
                collection = (Collection) dVar.apply(collection);
            }
            a((bf<T, V>) t, collection);
            jSONReader.s();
            return;
        }
        bu b = b(cVar);
        Collection<V> c = c(cVar);
        jSONReader.D();
        int i = 0;
        while (!jSONReader.r()) {
            if (jSONReader.u()) {
                String v2 = jSONReader.v();
                if ("..".equals(v2)) {
                    v = (V) c;
                } else {
                    a(jSONReader, (List) c, i, v2);
                    i++;
                }
            } else {
                v = (V) b.a(jSONReader, (Type) null, (Object) null, 0L);
            }
            c.add(v);
            jSONReader.s();
            i++;
        }
        if (dVar != 0) {
            c = (Collection) dVar.apply(c);
        }
        a((bf<T, V>) t, c);
        jSONReader.s();
    }

    public Collection<V> c(JSONReader.c cVar) {
        return (this.c == List.class || this.c == Collection.class || this.c == ArrayList.class) ? new ArrayList() : (Collection) a(cVar).b();
    }
}
