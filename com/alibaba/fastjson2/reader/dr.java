package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.reader.bu;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import tb.kge;

/* loaded from: classes2.dex */
public final class dr implements bu {

    /* renamed from: a  reason: collision with root package name */
    final Class f2999a;
    final Class b;
    final long c;

    static {
        kge.a(-936874269);
        kge.a(438295340);
    }

    public dr(Class cls, Class cls2) {
        this.f2999a = cls;
        this.b = cls2;
        this.c = com.alibaba.fastjson2.util.c.b(TypeUtils.a(cls2));
    }

    @Override // com.alibaba.fastjson2.reader.bu
    public /* synthetic */ bu a(JSONReader.c cVar, long j) {
        bu a2;
        a2 = cVar.a(j);
        return a2;
    }

    @Override // com.alibaba.fastjson2.reader.bu
    public /* synthetic */ bu a(ObjectReaderProvider objectReaderProvider, long j) {
        bu a2;
        a2 = objectReaderProvider.a(j);
        return a2;
    }

    @Override // com.alibaba.fastjson2.reader.bu
    public /* synthetic */ d a(String str) {
        return bu.CC.$default$a(this, str);
    }

    @Override // com.alibaba.fastjson2.reader.bu
    public Object a(long j) {
        Class cls = this.b;
        if (cls == ArrayList.class) {
            return new ArrayList();
        }
        if (cls == LinkedList.class) {
            return new LinkedList();
        }
        try {
            return cls.newInstance();
        } catch (IllegalAccessException | InstantiationException unused) {
            throw new JSONException("create list error, type " + this.b);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Object] */
    @Override // com.alibaba.fastjson2.reader.bu
    public /* synthetic */ T a(JSONReader jSONReader) {
        ?? a2;
        a2 = a(jSONReader, (Type) null, (Object) null, c());
        return a2;
    }

    @Override // com.alibaba.fastjson2.reader.bu
    public Object a(JSONReader jSONReader, Type type, Object obj, long j) {
        if (jSONReader.w) {
            return b(jSONReader, type, obj, 0L);
        }
        if (jSONReader.aF()) {
            return null;
        }
        if (jSONReader.z()) {
            Collection collection = (Collection) a(j | jSONReader.f2934a.p);
            String az = jSONReader.az();
            if (az.indexOf(44) != -1) {
                for (String str : az.split(",")) {
                    collection.add(Long.valueOf(Long.parseLong(str)));
                }
            } else {
                collection.add(Long.valueOf(Long.parseLong(az)));
            }
            jSONReader.s();
            return collection;
        }
        boolean A = jSONReader.A();
        if (jSONReader.a() != '[') {
            throw new JSONException(jSONReader.d("format error"));
        }
        jSONReader.D();
        Collection linkedHashSet = (!A || this.b != Collection.class) ? (Collection) a(j | jSONReader.f2934a.p) : new LinkedHashSet();
        while (!jSONReader.b()) {
            if (jSONReader.r()) {
                jSONReader.s();
                return linkedHashSet;
            } else if (jSONReader.a() == ',') {
                throw new JSONException(jSONReader.d("illegal input error"));
            } else {
                linkedHashSet.add(jSONReader.Z());
            }
        }
        throw new JSONException(jSONReader.d("illegal input error"));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Object] */
    @Override // com.alibaba.fastjson2.reader.bu
    public /* synthetic */ T a(Map map, long j) {
        return bu.CC.$default$a(this, map, j);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Object] */
    @Override // com.alibaba.fastjson2.reader.bu
    public /* synthetic */ T a(Map map, JSONReader.Feature... featureArr) {
        return bu.CC.$default$a(this, map, featureArr);
    }

    @Override // com.alibaba.fastjson2.reader.bu
    public /* synthetic */ void a(Object obj, String str, Object obj2, long j) {
        bu.CC.$default$a(this, obj, str, obj2, j);
    }

    @Override // com.alibaba.fastjson2.reader.bu
    public /* synthetic */ d b(long j) {
        return bu.CC.$default$b(this, j);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [T, java.lang.Object] */
    @Override // com.alibaba.fastjson2.reader.bu
    public /* synthetic */ T b() {
        ?? a2;
        a2 = a(0L);
        return a2;
    }

    @Override // com.alibaba.fastjson2.reader.bu
    public Object b(JSONReader jSONReader, Type type, Object obj, long j) {
        Collection collection;
        com.alibaba.fastjson2.function.d f;
        if (jSONReader.g()) {
            return null;
        }
        Class cls = this.f2999a;
        bu a2 = jSONReader.a(cls, this.c, j);
        if (a2 != null) {
            cls = a2.bm_();
        }
        if (cls == ArrayList.class) {
            collection = new ArrayList();
        } else if (cls == JSONArray.class) {
            collection = new JSONArray();
        } else {
            collection = (Collection) ((cls == null || cls == this.f2999a) ? a(j | jSONReader.f2934a.p) : a2.a(j));
        }
        int t = jSONReader.t();
        for (int i = 0; i < t; i++) {
            collection.add(jSONReader.Z());
        }
        return (a2 == null || (f = a2.f()) == null) ? collection : (Collection) f.apply(collection);
    }

    @Override // com.alibaba.fastjson2.reader.bu
    public Object b(Collection collection) {
        Collection collection2 = (Collection) a(0L);
        for (Object obj : collection) {
            collection2.add(TypeUtils.e(obj));
        }
        return collection2;
    }

    @Override // com.alibaba.fastjson2.reader.bu
    public /* synthetic */ Class<T> bm_() {
        return bu.CC.$default$bm_(this);
    }

    @Override // com.alibaba.fastjson2.reader.bu
    public /* synthetic */ long c() {
        return bu.CC.$default$c(this);
    }

    @Override // com.alibaba.fastjson2.reader.bu
    public /* synthetic */ d c(long j) {
        return bu.CC.$default$c(this, j);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Object] */
    @Override // com.alibaba.fastjson2.reader.bu
    public /* synthetic */ T c(JSONReader jSONReader, Type type, Object obj, long j) {
        return bu.CC.$default$c(this, jSONReader, type, obj, j);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Object] */
    @Override // com.alibaba.fastjson2.reader.bu
    public /* synthetic */ T d(JSONReader jSONReader, Type type, Object obj, long j) {
        return bu.CC.$default$d(this, jSONReader, type, obj, j);
    }

    @Override // com.alibaba.fastjson2.reader.bu
    public /* synthetic */ String d() {
        String str;
        str = JSON.DEFAULT_TYPE_KEY;
        return str;
    }

    @Override // com.alibaba.fastjson2.reader.bu
    public /* synthetic */ long e() {
        long j;
        j = bu.HASH_TYPE;
        return j;
    }

    @Override // com.alibaba.fastjson2.reader.bu
    public /* synthetic */ com.alibaba.fastjson2.function.d f() {
        return bu.CC.$default$f(this);
    }
}
