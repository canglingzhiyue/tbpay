package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import tb.kge;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class bt extends em {

    /* renamed from: a  reason: collision with root package name */
    final Class f2952a;
    final Class b;
    final long c;
    final String d;
    final long e;

    static {
        kge.a(-127275811);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public bt(Class cls) {
        super(cls);
        this.f2952a = cls.getComponentType();
        String a2 = TypeUtils.a(this.f2952a);
        this.c = com.alibaba.fastjson2.util.c.b(a2);
        this.d = '[' + a2;
        this.e = com.alibaba.fastjson2.util.c.b(this.d);
        this.b = TypeUtils.e((Type) this.f2952a);
    }

    @Override // com.alibaba.fastjson2.reader.bu
    public Object a(JSONReader jSONReader, Type type, Object obj, long j) {
        if (jSONReader.w) {
            return b(jSONReader, type, obj, 0L);
        }
        if (jSONReader.aF()) {
            return null;
        }
        if (!jSONReader.q()) {
            if (jSONReader.a() == '\"' && jSONReader.az().isEmpty()) {
                return null;
            }
            throw new JSONException(jSONReader.d("TODO"));
        }
        Object[] objArr = (Object[]) Array.newInstance(this.f2952a, 16);
        int i = 0;
        while (!jSONReader.r()) {
            int i2 = i + 1;
            if (i2 - objArr.length > 0) {
                int length = objArr.length;
                int i3 = length + (length >> 1);
                if (i3 - i2 < 0) {
                    i3 = i2;
                }
                objArr = Arrays.copyOf(objArr, i3);
            }
            objArr[i] = jSONReader.b((Class<Object>) this.f2952a);
            jSONReader.s();
            i = i2;
        }
        jSONReader.s();
        return Arrays.copyOf(objArr, i);
    }

    @Override // com.alibaba.fastjson2.reader.em, com.alibaba.fastjson2.reader.bu
    public Object b(JSONReader jSONReader, Type type, Object obj, long j) {
        Object b;
        if (jSONReader.c() == -110) {
            jSONReader.D();
            long F = jSONReader.F();
            if (F != br.TYPE_HASH_CODE && F != this.e) {
                if (!jSONReader.d(j)) {
                    throw new JSONException(jSONReader.d("not support autotype : " + jSONReader.aG()));
                }
                bu a2 = jSONReader.a(F, this.f, j);
                if (a2 != null) {
                    return a2.a(jSONReader, type, obj, j);
                }
                throw new JSONException(jSONReader.d("auotype not support : " + jSONReader.aG()));
            }
        }
        int t = jSONReader.t();
        if (t == -1) {
            return null;
        }
        Object[] objArr = (Object[]) Array.newInstance(this.b, t);
        for (int i = 0; i < t; i++) {
            if (jSONReader.u()) {
                String v = jSONReader.v();
                if ("..".equals(v)) {
                    b = objArr;
                } else {
                    jSONReader.a(objArr, i, com.alibaba.fastjson2.d.a(v));
                    b = null;
                }
            } else {
                bu a3 = jSONReader.a(this.b, this.c, j);
                b = a3 != null ? a3.b(jSONReader, null, null, j) : jSONReader.b((Class<Object>) this.f2952a);
            }
            objArr[i] = b;
        }
        return objArr;
    }

    @Override // com.alibaba.fastjson2.reader.em, com.alibaba.fastjson2.reader.bu
    public Object b(Collection collection) {
        Collection of;
        Class<?> cls;
        com.alibaba.fastjson2.function.d a2;
        Object[] objArr = (Object[]) Array.newInstance(this.b, collection.size());
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            if (next != null && (cls = next.getClass()) != this.f2952a && (a2 = JSONFactory.defaultObjectReaderProvider.a(cls, this.f2952a)) != null) {
                next = a2.apply(next);
            }
            if (!this.f2952a.isInstance(next)) {
                bu a3 = JSONFactory.defaultObjectReaderProvider.a((Type) this.f2952a);
                if (next instanceof Map) {
                    next = a3.a((Map) next, new JSONReader.Feature[0]);
                } else {
                    if (next instanceof Collection) {
                        of = (Collection) next;
                    } else if (next instanceof Object[]) {
                        of = JSONArray.of((Object[]) next);
                    } else if (next != null) {
                        Class<?> cls2 = next.getClass();
                        if (!cls2.isArray()) {
                            throw new JSONException("component type not match, expect " + this.f2952a.getName() + ", but " + cls2);
                        }
                        int length = Array.getLength(next);
                        JSONArray jSONArray = new JSONArray(length);
                        for (int i2 = 0; i2 < length; i2++) {
                            jSONArray.add(Array.get(next, i2));
                        }
                        next = a3.b(jSONArray);
                    } else {
                        continue;
                    }
                    next = a3.b(of);
                }
            }
            objArr[i] = next;
            i++;
        }
        return objArr;
    }
}
