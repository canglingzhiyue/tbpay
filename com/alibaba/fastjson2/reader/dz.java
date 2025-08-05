package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.reader.bu;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes2.dex */
public class dz implements bu<Method> {

    /* renamed from: a  reason: collision with root package name */
    static final long f3006a;
    static final long b;
    static final long c;

    static {
        kge.a(-1837320339);
        kge.a(438295340);
        f3006a = com.alibaba.fastjson2.util.c.b("declaringClass");
        b = com.alibaba.fastjson2.util.c.b("name");
        c = com.alibaba.fastjson2.util.c.b("parameterTypes");
    }

    private Method a(long j, String str, String str2, List<String> list) {
        Class<?>[] clsArr;
        if ((j & JSONReader.Feature.SupportClassForName.mask) != 0) {
            Class c2 = TypeUtils.c(str2);
            if (list == null) {
                clsArr = new Class[0];
            } else {
                clsArr = new Class[list.size()];
                for (int i = 0; i < list.size(); i++) {
                    clsArr[i] = TypeUtils.c(list.get(i));
                }
            }
            try {
                return c2.getDeclaredMethod(str, clsArr);
            } catch (NoSuchMethodException e) {
                throw new JSONException("method not found", e);
            }
        }
        throw new JSONException("ClassForName not support");
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

    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Object] */
    @Override // com.alibaba.fastjson2.reader.bu
    public /* synthetic */ T a(long j) {
        return bu.CC.$default$a(this, j);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Object] */
    @Override // com.alibaba.fastjson2.reader.bu
    public /* synthetic */ T a(JSONReader jSONReader) {
        ?? a2;
        a2 = a(jSONReader, (Type) null, (Object) null, c());
        return a2;
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

    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Object] */
    @Override // com.alibaba.fastjson2.reader.bu
    public /* synthetic */ T b(Collection collection) {
        return bu.CC.$default$b(this, collection);
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
    /* renamed from: e */
    public Method b(JSONReader jSONReader, Type type, Object obj, long j) {
        return a(jSONReader, type, obj, j);
    }

    @Override // com.alibaba.fastjson2.reader.bu
    public /* synthetic */ com.alibaba.fastjson2.function.d f() {
        return bu.CC.$default$f(this);
    }

    @Override // com.alibaba.fastjson2.reader.bu
    /* renamed from: f */
    public Method c(JSONReader jSONReader, Type type, Object obj, long j) {
        if (jSONReader.t() == 3) {
            String az = jSONReader.az();
            return a(jSONReader.f2934a.p | j, jSONReader.az(), az, jSONReader.c(String.class));
        }
        throw new JSONException("not support input " + jSONReader.aR());
    }

    @Override // com.alibaba.fastjson2.reader.bu
    /* renamed from: g */
    public Method d(JSONReader jSONReader, Type type, Object obj, long j) {
        if (!jSONReader.q()) {
            throw new JSONException("not support input " + jSONReader.aR());
        }
        String az = jSONReader.az();
        String az2 = jSONReader.az();
        List c2 = jSONReader.c(String.class);
        if (jSONReader.r()) {
            jSONReader.s();
            return a(jSONReader.f2934a.p | j, az2, az, c2);
        }
        throw new JSONException("not support input " + jSONReader.aR());
    }

    @Override // com.alibaba.fastjson2.reader.bu
    /* renamed from: h */
    public Method a(JSONReader jSONReader, Type type, Object obj, long j) {
        if (!jSONReader.n()) {
            if (jSONReader.c(j)) {
                return jSONReader.w ? c(jSONReader, type, obj, j) : d(jSONReader, type, obj, j);
            }
            throw new JSONException("not support input " + jSONReader.aR());
        }
        String str = null;
        String str2 = null;
        List list = null;
        while (!jSONReader.p()) {
            long G = jSONReader.G();
            if (G == f3006a) {
                str2 = jSONReader.az();
            } else if (G == b) {
                str = jSONReader.az();
            } else if (G == c) {
                list = jSONReader.c(String.class);
            } else {
                jSONReader.N();
            }
        }
        if (!jSONReader.w) {
            jSONReader.s();
        }
        return a(jSONReader.f2934a.p | j, str, str2, list);
    }
}
