package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.b;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes2.dex */
public class el<T> extends cb<T> {

    /* renamed from: a  reason: collision with root package name */
    final String[] f3015a;
    final d[] b;
    private final com.alibaba.fastjson2.function.d<Map<Long, Object>, T> c;

    static {
        kge.a(-952528227);
    }

    public el(Class cls, String str, String str2, long j, com.alibaba.fastjson2.function.d<Map<Long, Object>, T> dVar, String[] strArr, d[] dVarArr, d[] dVarArr2, Class[] clsArr, String[] strArr2) {
        super(cls, str, str2, j, null, null, clsArr, strArr2, null, a(dVarArr, dVarArr2));
        this.f3015a = strArr;
        this.c = dVar;
        this.b = dVarArr2;
    }

    static d[] a(d[] dVarArr, d[] dVarArr2) {
        if (dVarArr2 == null) {
            return dVarArr;
        }
        int length = dVarArr.length;
        d[] dVarArr3 = (d[]) Arrays.copyOf(dVarArr, dVarArr2.length + length);
        System.arraycopy(dVarArr2, 0, dVarArr3, length, dVarArr2.length);
        return dVarArr3;
    }

    @Override // com.alibaba.fastjson2.reader.cc, com.alibaba.fastjson2.reader.bu
    public T a(JSONReader jSONReader, Type type, Object obj, long j) {
        d[] dVarArr;
        if (!this.N) {
            jSONReader.a(this.F);
        }
        if (jSONReader.w) {
            return b(jSONReader, type, obj, 0L);
        }
        LinkedHashMap linkedHashMap = null;
        int i = 0;
        if (jSONReader.c(this.I | j) && jSONReader.q()) {
            while (i < this.u.length) {
                Object b = this.u[i].b(jSONReader);
                if (linkedHashMap == null) {
                    linkedHashMap = new LinkedHashMap();
                }
                linkedHashMap.put(Long.valueOf(this.u[i].m), b);
                i++;
                linkedHashMap = linkedHashMap;
            }
            if (!jSONReader.r()) {
                throw new JSONException(jSONReader.d("array not end, " + jSONReader.a()));
            }
            jSONReader.s();
            LinkedHashMap linkedHashMap2 = linkedHashMap;
            if (linkedHashMap == null) {
                linkedHashMap2 = Collections.emptyMap();
            }
            return a(linkedHashMap2);
        }
        if (!jSONReader.n()) {
            if (jSONReader.K()) {
                jSONReader.a(false);
            } else if (jSONReader.o()) {
                return null;
            }
        }
        JSONReader.c cVar = jSONReader.f2934a;
        long j2 = this.I | j | cVar.p;
        LinkedHashMap linkedHashMap3 = null;
        int i2 = 0;
        while (!jSONReader.p()) {
            long G = jSONReader.G();
            if (G != 0) {
                if (G == this.t && i2 == 0) {
                    long F = jSONReader.F();
                    if (F == g()) {
                        continue;
                    } else {
                        bu a2 = ((JSONReader.Feature.SupportAutoType.mask & j2) > 0L ? 1 : ((JSONReader.Feature.SupportAutoType.mask & j2) == 0L ? 0 : -1)) != 0 ? jSONReader.a(F, this.F, this.I) : cVar.a(jSONReader.aG(), this.F);
                        if (a2 == null) {
                            a2 = cVar.a(jSONReader.aG(), this.F, this.I);
                        }
                        if (a2 != null) {
                            T t = (T) a2.a(jSONReader, type, obj, 0L);
                            jSONReader.s();
                            return t;
                        }
                    }
                } else {
                    d b2 = b(G);
                    if (b2 == null && (JSONReader.Feature.SupportSmartMatch.mask & j2) != 0) {
                        b2 = c(jSONReader.H());
                    }
                    if (b2 == null) {
                        b(jSONReader, null, j);
                    } else {
                        Object b3 = b2.b(jSONReader);
                        if (linkedHashMap3 == null) {
                            linkedHashMap3 = new LinkedHashMap();
                        }
                        linkedHashMap3.put(Long.valueOf(b2 instanceof bl ? ((bl) b2).w : b2.m), b3);
                    }
                }
            }
            i2++;
        }
        if (this.M) {
            if (linkedHashMap3 == null) {
                linkedHashMap3 = new LinkedHashMap();
            }
            for (d dVar : this.u) {
                if (dVar.j != null && linkedHashMap3.get(Long.valueOf(dVar.m)) == null) {
                    linkedHashMap3.put(Long.valueOf(dVar.m), dVar.j);
                }
            }
        }
        T apply = this.c.apply(linkedHashMap3 == null ? Collections.emptyMap() : linkedHashMap3);
        if (this.b != null && linkedHashMap3 != null) {
            while (true) {
                d[] dVarArr2 = this.b;
                if (i >= dVarArr2.length) {
                    break;
                }
                d dVar2 = dVarArr2[i];
                Object obj2 = linkedHashMap3.get(Long.valueOf(dVar2.m));
                if (obj2 != null) {
                    dVar2.a((d) apply, obj2);
                }
                i++;
            }
        }
        jSONReader.s();
        return apply;
    }

    public T a(Map<Long, Object> map) {
        return this.c.apply(map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [com.alibaba.fastjson2.reader.el, com.alibaba.fastjson2.reader.el<T>] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.util.LinkedHashMap] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.util.LinkedHashMap] */
    @Override // com.alibaba.fastjson2.reader.cb, com.alibaba.fastjson2.reader.cc, com.alibaba.fastjson2.reader.bu
    public T a(Map map, long j) {
        Class<?> cls;
        Class<?> cls2;
        com.alibaba.fastjson2.function.d a2;
        ObjectReaderProvider objectReaderProvider = JSONFactory.defaultObjectReaderProvider;
        Object obj = map.get(d());
        ?? r3 = 0;
        if (obj instanceof String) {
            String str = (String) obj;
            bu a3 = (JSONReader.Feature.SupportAutoType.mask & j) != 0 ? a(objectReaderProvider, com.alibaba.fastjson2.util.c.b(str)) : null;
            if (a3 == null) {
                a3 = objectReaderProvider.a(str, bm_(), c() | j);
            }
            if (a3 != this && a3 != null) {
                return (T) a3.a(map, j);
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            String obj2 = entry.getKey().toString();
            Object value = entry.getValue();
            d a4 = a(obj2);
            if (a4 != null) {
                if (value != null && (cls = value.getClass()) != (cls2 = a4.c) && (a2 = objectReaderProvider.a(cls, cls2)) != null) {
                    value = a2.apply(value);
                }
                if (r3 == 0) {
                    r3 = new LinkedHashMap();
                }
                r3.put(Long.valueOf(a4 instanceof bl ? ((bl) a4).w : a4.m), value);
            }
        }
        if (r3 == 0) {
            r3 = Collections.emptyMap();
        }
        T t = (T) a(r3);
        int i = 0;
        while (true) {
            d[] dVarArr = this.b;
            if (i < dVarArr.length) {
                d dVar = dVarArr[i];
                Object obj3 = map.get(dVar.b);
                if (obj3 != null) {
                    Class<?> cls3 = obj3.getClass();
                    Class<?> cls4 = dVar.c;
                    Type type = dVar.d;
                    if (cls3 != cls4) {
                        com.alibaba.fastjson2.function.d a5 = objectReaderProvider.a(cls3, cls4);
                        if (!(type instanceof Class)) {
                            obj3 = TypeUtils.a(obj3, type, objectReaderProvider);
                        } else if (a5 != null) {
                            obj3 = a5.apply(obj3);
                        } else if (obj3 instanceof Map) {
                            obj3 = dVar.a(JSONFactory.a(objectReaderProvider, new JSONReader.Feature[0])).a((Map) obj3, dVar.e | j);
                        }
                    }
                    dVar.a((d) t, obj3);
                }
                i++;
            } else {
                return t;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [com.alibaba.fastjson2.reader.el, com.alibaba.fastjson2.reader.el<T>] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16, types: [java.util.LinkedHashMap] */
    /* JADX WARN: Type inference failed for: r4v17, types: [java.util.LinkedHashMap] */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.util.Map] */
    @Override // com.alibaba.fastjson2.reader.cb, com.alibaba.fastjson2.reader.cc, com.alibaba.fastjson2.reader.bu
    public T b(JSONReader jSONReader, Type type, Object obj, long j) {
        LinkedHashMap linkedHashMap;
        bu a2;
        if (!this.N) {
            jSONReader.a(this.F);
        }
        byte c = jSONReader.c();
        HashMap hashMap = null;
        if (c == -81) {
            jSONReader.D();
            return null;
        } else if (c == -110 && (a2 = jSONReader.a(this.F, g(), this.I | j)) != null && a2 != this) {
            return (T) a2.b(jSONReader, type, obj, j);
        } else {
            int i = 0;
            if (!jSONReader.w()) {
                jSONReader.n();
                HashMap hashMap2 = null;
                linkedHashMap = null;
                int i2 = 0;
                while (!jSONReader.p()) {
                    long G = jSONReader.G();
                    if (G != 0) {
                        if (G == bu.HASH_TYPE && i2 == 0) {
                            long F = jSONReader.F();
                            JSONReader.c cVar = jSONReader.f2934a;
                            bu a3 = cVar.a(F);
                            if (a3 == null) {
                                String aG = jSONReader.aG();
                                bu a4 = cVar.a(aG, this.F);
                                if (a4 == null) {
                                    throw new JSONException(jSONReader.d("auotype not support : " + aG));
                                }
                                a3 = a4;
                            }
                            T t = (T) a3.b(jSONReader, type, obj, j);
                            jSONReader.s();
                            return t;
                        }
                        d b = b(G);
                        if (b == null) {
                            b(jSONReader, null, j);
                        } else if (jSONReader.u()) {
                            jSONReader.D();
                            String az = jSONReader.az();
                            if (hashMap2 == null) {
                                hashMap2 = new HashMap();
                            }
                            hashMap2.put(Long.valueOf(G), az);
                        } else {
                            Object b2 = b.b(jSONReader);
                            linkedHashMap = linkedHashMap;
                            if (linkedHashMap == 0) {
                                linkedHashMap = new LinkedHashMap();
                            }
                            linkedHashMap.put(Long.valueOf(b.m), b2);
                        }
                    }
                    i2++;
                    linkedHashMap = linkedHashMap;
                }
                hashMap = hashMap2;
            } else if (!jSONReader.m()) {
                throw new JSONException(jSONReader.d("expect object, but " + b.CC.a(jSONReader.c())));
            } else {
                int t2 = jSONReader.t();
                linkedHashMap = 0;
                int i3 = 0;
                while (i3 < t2) {
                    d dVar = this.u[i3];
                    Object b3 = dVar.b(jSONReader);
                    if (linkedHashMap == 0) {
                        linkedHashMap = new LinkedHashMap();
                    }
                    linkedHashMap.put(Long.valueOf(dVar.m), b3);
                    i3++;
                    linkedHashMap = linkedHashMap;
                }
            }
            if (linkedHashMap == 0) {
                linkedHashMap = Collections.emptyMap();
            }
            T t3 = (T) a(linkedHashMap);
            if (this.b != null) {
                while (true) {
                    d[] dVarArr = this.b;
                    if (i >= dVarArr.length) {
                        break;
                    }
                    d dVar2 = dVarArr[i];
                    dVar2.a((d) t3, linkedHashMap.get(Long.valueOf(dVar2.m)));
                    i++;
                }
            }
            if (hashMap != null) {
                for (Map.Entry entry : hashMap.entrySet()) {
                    String str = (String) entry.getValue();
                    d b4 = b(((Long) entry.getKey()).longValue());
                    if ("..".equals(str)) {
                        b4.a((d) t3, (Object) t3);
                    } else {
                        b4.a(jSONReader, t3, str);
                    }
                }
            }
            return t3;
        }
    }

    @Override // com.alibaba.fastjson2.reader.cb, com.alibaba.fastjson2.reader.cc, com.alibaba.fastjson2.reader.bu
    public T b(Collection collection) {
        com.alibaba.fastjson2.function.d a2;
        ObjectReaderProvider objectReaderProvider = JSONFactory.defaultObjectReaderProvider;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            if (i >= this.u.length) {
                break;
            }
            d dVar = this.u[i];
            if (next != null) {
                Class<?> cls = next.getClass();
                Class<?> cls2 = dVar.c;
                Type type = dVar.d;
                if (!(type instanceof Class)) {
                    next = TypeUtils.a(next, type, objectReaderProvider);
                } else if (cls != cls2 && (a2 = objectReaderProvider.a(cls, cls2)) != null) {
                    next = a2.apply(next);
                }
            }
            linkedHashMap.put(Long.valueOf(dVar instanceof bl ? ((bl) dVar).w : dVar.m), next);
            i++;
        }
        return a((Map<Long, Object>) linkedHashMap);
    }
}
