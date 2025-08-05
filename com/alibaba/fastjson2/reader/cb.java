package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.b;
import com.alibaba.fastjson2.function.Supplier;
import com.alibaba.fastjson2.util.BeanUtils;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes2.dex */
public class cb<T> extends cc<T> {
    final int A;
    final Class[] B;
    final String[] C;
    final Class D;
    final Map<Long, Class> E;
    protected final String s;
    protected final long t;
    protected final d[] u;
    final long[] v;
    final short[] w;
    final long[] x;
    final short[] y;
    final Constructor z;

    static {
        kge.a(-1346587005);
    }

    public cb(Class cls, String str, String str2, long j, Supplier<T> supplier, com.alibaba.fastjson2.function.d dVar, d... dVarArr) {
        this(cls, str, str2, j, supplier, dVar, null, null, null, dVarArr);
    }

    public cb(Class cls, String str, String str2, long j, Supplier<T> supplier, com.alibaba.fastjson2.function.d dVar, Class[] clsArr, String[] strArr, Class cls2, d... dVarArr) {
        super(cls, supplier, str2, j, dVar);
        Constructor a2;
        long j2;
        if (supplier instanceof b) {
            a2 = ((b) supplier).f2950a;
        } else {
            a2 = cls == null ? null : BeanUtils.a(cls, true);
            if (a2 != null) {
                a2.setAccessible(true);
            }
        }
        this.A = a2 != null ? a2.getParameterTypes().length : -1;
        this.z = a2;
        if (str == null || str.isEmpty()) {
            this.s = JSON.DEFAULT_TYPE_KEY;
            j2 = bu.HASH_TYPE;
        } else {
            this.s = str;
            j2 = com.alibaba.fastjson2.util.c.b(str);
        }
        this.t = j2;
        this.u = dVarArr;
        long[] jArr = new long[dVarArr.length];
        long[] jArr2 = new long[dVarArr.length];
        for (int i = 0; i < dVarArr.length; i++) {
            d dVar2 = dVarArr[i];
            jArr[i] = dVar2.m;
            jArr2[i] = dVar2.n;
            if (dVar2.b() && (this.L == null || !(this.L instanceof e))) {
                this.L = dVar2;
            }
            if (dVar2.j != null) {
                this.M = true;
            }
        }
        this.v = Arrays.copyOf(jArr, jArr.length);
        Arrays.sort(this.v);
        this.w = new short[this.v.length];
        for (int i2 = 0; i2 < jArr.length; i2++) {
            this.w[Arrays.binarySearch(this.v, jArr[i2])] = (short) i2;
        }
        this.x = Arrays.copyOf(jArr2, jArr2.length);
        Arrays.sort(this.x);
        this.y = new short[this.x.length];
        for (int i3 = 0; i3 < jArr2.length; i3++) {
            this.y[Arrays.binarySearch(this.x, jArr2[i3])] = (short) i3;
        }
        this.B = clsArr;
        if (clsArr != null) {
            this.E = new HashMap(clsArr.length);
            this.C = new String[clsArr.length];
            for (int i4 = 0; i4 < clsArr.length; i4++) {
                Class cls3 = clsArr[i4];
                String str3 = (strArr == null || strArr.length < i4 + 1) ? null : strArr[i4];
                if (str3 == null || str3.isEmpty()) {
                    str3 = cls3.getSimpleName();
                }
                this.E.put(Long.valueOf(com.alibaba.fastjson2.util.c.b(str3)), cls3);
                this.C[i4] = str3;
            }
        } else {
            this.E = null;
            this.C = null;
        }
        this.D = cls2;
    }

    @Override // com.alibaba.fastjson2.reader.cc, com.alibaba.fastjson2.reader.bu
    public bu a(JSONReader.c cVar, long j) {
        Map<Long, Class> map = this.E;
        if (map == null || map.size() <= 0) {
            return cVar.a(j);
        }
        Class cls = this.E.get(Long.valueOf(j));
        if (cls != null) {
            return cVar.a(cls);
        }
        return null;
    }

    @Override // com.alibaba.fastjson2.reader.cc, com.alibaba.fastjson2.reader.bu
    public bu a(ObjectReaderProvider objectReaderProvider, long j) {
        Map<Long, Class> map = this.E;
        if (map == null || map.size() <= 0) {
            return objectReaderProvider.a(j);
        }
        Class cls = this.E.get(Long.valueOf(j));
        if (cls != null) {
            return objectReaderProvider.a((Type) cls);
        }
        return null;
    }

    @Override // com.alibaba.fastjson2.reader.cc, com.alibaba.fastjson2.reader.bu
    public T a(long j) {
        T t;
        Constructor constructor = this.z;
        if (constructor != null && this.A == 0) {
            try {
                t = (T) constructor.newInstance(new Object[0]);
            } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
                throw new JSONException("create instance error, " + this.F, e);
            }
        } else if (this.G == null) {
            throw new JSONException("create instance error, " + this.F);
        } else {
            t = this.G.get();
        }
        if (this.M) {
            a((cb<T>) t);
        }
        return t;
    }

    @Override // com.alibaba.fastjson2.reader.cc, com.alibaba.fastjson2.reader.bu
    public T a(Map map, long j) {
        ObjectReaderProvider c = JSONFactory.c();
        Object obj = map.get(this.s);
        long j2 = this.I | j;
        if (obj instanceof String) {
            String str = (String) obj;
            long b = com.alibaba.fastjson2.util.c.b(str);
            bu buVar = null;
            if ((JSONReader.Feature.SupportAutoType.mask & j) != 0 || (this instanceof en)) {
                buVar = a(c, b);
            }
            if (buVar == null) {
                buVar = c.a(str, (Class<?>) bm_(), j2);
            }
            if (buVar != this && buVar != null) {
                return (T) buVar.a(map, j);
            }
        }
        T a2 = a(0L);
        if (this.L == null && ((JSONReader.Feature.SupportSmartMatch.mask | JSONReader.Feature.ErrorOnUnknownProperties.mask) & j2) == 0) {
            int i = 0;
            boolean z = (j2 & JSONReader.Feature.FieldBased.mask) != 0;
            while (true) {
                d[] dVarArr = this.u;
                if (i >= dVarArr.length) {
                    break;
                }
                d dVar = dVarArr[i];
                Object obj2 = map.get(dVar.b);
                if (obj2 != null) {
                    if (obj2.getClass() != dVar.d) {
                        if ((dVar instanceof bf) && (obj2 instanceof JSONArray)) {
                            obj2 = dVar.a(c).b((JSONArray) obj2);
                        } else if (!(obj2 instanceof JSONObject) || dVar.d == JSONObject.class) {
                            dVar.a((d) a2, obj2, j);
                        } else {
                            obj2 = c.a(dVar.d, z).a((JSONObject) obj2, j);
                        }
                    }
                    dVar.a((d) a2, obj2);
                }
                i++;
            }
        } else {
            for (Map.Entry entry : map.entrySet()) {
                String obj3 = entry.getKey().toString();
                Object value = entry.getValue();
                d a3 = a(obj3);
                if (a3 == null) {
                    a(a2, obj3, entry.getValue(), j);
                } else if (value == null || value.getClass() != a3.d) {
                    a3.a((d) a2, value, j);
                } else {
                    a3.a((d) a2, value);
                }
            }
        }
        return this.H != null ? (T) this.H.apply(a2) : a2;
    }

    @Override // com.alibaba.fastjson2.reader.cc
    protected void a(T t) {
        d[] dVarArr;
        for (d dVar : this.u) {
            Object obj = dVar.j;
            if (obj != null) {
                dVar.a((d) t, obj);
            }
        }
    }

    @Override // com.alibaba.fastjson2.reader.cc, com.alibaba.fastjson2.reader.bu
    public d b(long j) {
        int binarySearch = Arrays.binarySearch(this.v, j);
        if (binarySearch < 0) {
            return null;
        }
        return this.u[this.w[binarySearch]];
    }

    @Override // com.alibaba.fastjson2.reader.cc, com.alibaba.fastjson2.reader.bu
    public T b(JSONReader jSONReader, Type type, Object obj, long j) {
        if (jSONReader.g()) {
            return null;
        }
        bu a2 = jSONReader.a(this.F, g(), this.I | j);
        if (a2 == null || a2.bm_() == this.F) {
            if (!this.N) {
                jSONReader.a(this.F);
            }
            if (jSONReader.w()) {
                if (jSONReader.m()) {
                    return c(jSONReader, type, obj, j);
                }
                throw new JSONException(jSONReader.d("expect object, but " + b.CC.a(jSONReader.c())));
            }
            jSONReader.n();
            T t = null;
            int i = 0;
            while (!jSONReader.p()) {
                long G = jSONReader.G();
                if (G == this.t && i == 0) {
                    long E = jSONReader.E();
                    JSONReader.c cVar = jSONReader.f2934a;
                    bu a3 = a(cVar, E);
                    if (a3 == null) {
                        String aG = jSONReader.aG();
                        bu a4 = cVar.a(aG, null);
                        if (a4 == null) {
                            throw new JSONException(jSONReader.d("auotype not support : " + aG));
                        }
                        a3 = a4;
                    }
                    if (a3 != this) {
                        jSONReader.a(true);
                        a2 = a3;
                    }
                } else if (G != 0) {
                    d b = b(G);
                    if (b == null && jSONReader.b(this.I | j)) {
                        b = c(jSONReader.H());
                    }
                    if (b == null) {
                        b(jSONReader, t, j);
                    } else {
                        if (t == null) {
                            t = a(jSONReader.f2934a.p | j);
                        }
                        b.b(jSONReader, t);
                    }
                }
                i++;
            }
            return t == null ? a(jSONReader.f2934a.p | j) : t;
        }
        return (T) a2.b(jSONReader, type, obj, j);
    }

    @Override // com.alibaba.fastjson2.reader.cc, com.alibaba.fastjson2.reader.bu
    public T b(Collection collection) {
        T a2 = a(0L);
        int i = 0;
        for (Object obj : collection) {
            d[] dVarArr = this.u;
            if (i >= dVarArr.length) {
                break;
            }
            dVarArr[i].a((d) a2, obj);
            i++;
        }
        return a2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.alibaba.fastjson2.reader.cc
    public void b(Object obj) {
        int i = 0;
        while (true) {
            d[] dVarArr = this.u;
            if (i < dVarArr.length) {
                d dVar = dVarArr[i];
                if (dVar.c == String.class) {
                    dVar.a((d) obj, (Object) "");
                }
                i++;
            } else {
                return;
            }
        }
    }

    @Override // com.alibaba.fastjson2.reader.cc, com.alibaba.fastjson2.reader.bu
    public final long c() {
        return this.I;
    }

    @Override // com.alibaba.fastjson2.reader.cc, com.alibaba.fastjson2.reader.bu
    public d c(long j) {
        int binarySearch = Arrays.binarySearch(this.x, j);
        if (binarySearch < 0) {
            return null;
        }
        return this.u[this.y[binarySearch]];
    }

    @Override // com.alibaba.fastjson2.reader.cc, com.alibaba.fastjson2.reader.bu
    public T c(JSONReader jSONReader, Type type, Object obj, long j) {
        d[] dVarArr;
        if (!this.N) {
            jSONReader.a(this.F);
        }
        bu a2 = a(jSONReader, this.F, this.I | j);
        if (a2 == null || a2 == this || a2.bm_() == this.F) {
            int t = jSONReader.t();
            T a3 = a(0L);
            int i = 0;
            while (true) {
                dVarArr = this.u;
                if (i >= dVarArr.length) {
                    break;
                }
                if (i < t) {
                    dVarArr[i].b(jSONReader, a3);
                }
                i++;
            }
            for (int length = dVarArr.length; length < t; length++) {
                jSONReader.N();
            }
            return this.H != null ? (T) this.H.apply(a3) : a3;
        }
        return (T) a2.c(jSONReader, type, obj, j);
    }

    @Override // com.alibaba.fastjson2.reader.cc, com.alibaba.fastjson2.reader.bu
    public T d(JSONReader jSONReader, Type type, Object obj, long j) {
        if (!this.N) {
            jSONReader.a(this.F);
        }
        jSONReader.q();
        T t = this.G.get();
        int i = 0;
        while (true) {
            d[] dVarArr = this.u;
            if (i >= dVarArr.length) {
                break;
            }
            dVarArr[i].b(jSONReader, t);
            i++;
        }
        if (jSONReader.r()) {
            jSONReader.s();
            return this.H != null ? (T) this.H.apply(t) : t;
        }
        throw new JSONException(jSONReader.d("array to bean end error"));
    }

    @Override // com.alibaba.fastjson2.reader.cc, com.alibaba.fastjson2.reader.bu
    public final String d() {
        return this.s;
    }

    @Override // com.alibaba.fastjson2.reader.cc, com.alibaba.fastjson2.reader.bu
    public final long e() {
        return this.t;
    }

    @Override // com.alibaba.fastjson2.reader.cc, com.alibaba.fastjson2.reader.bu
    public final com.alibaba.fastjson2.function.d f() {
        return this.H;
    }
}
