package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.reader.bu;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.kge;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class dy implements bu {

    /* renamed from: a  reason: collision with root package name */
    final Class f3005a;
    final Class b;
    final Type c;
    final Type d;
    final Class e;
    final long f;
    final com.alibaba.fastjson2.function.d g;
    final Constructor h;
    bu i;
    bu j;

    static {
        kge.a(178991098);
        kge.a(438295340);
    }

    public dy(Class cls, Class cls2, Type type, Type type2, long j, com.alibaba.fastjson2.function.d dVar) {
        Constructor<?> constructor;
        type = type == Object.class ? null : type;
        this.f3005a = cls;
        this.b = cls2;
        this.c = type;
        this.d = type2;
        this.e = TypeUtils.e(type2);
        this.f = j;
        this.g = dVar;
        Constructor<?>[] declaredConstructors = this.b.getDeclaredConstructors();
        int length = declaredConstructors.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                constructor = null;
                break;
            }
            constructor = declaredConstructors[i];
            if (constructor.getParameterTypes().length == 0 && !Modifier.isPublic(constructor.getModifiers())) {
                constructor.setAccessible(true);
                break;
            }
            i++;
        }
        this.h = constructor;
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
        if (cls == null || cls.isInterface()) {
            return new HashMap();
        }
        try {
            return this.h != null ? this.h.newInstance(new Object[0]) : this.b.newInstance();
        } catch (Exception e) {
            throw new JSONException("create map error", e);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Object] */
    @Override // com.alibaba.fastjson2.reader.bu
    public /* synthetic */ T a(JSONReader jSONReader) {
        ?? a2;
        a2 = a(jSONReader, (Type) null, (Object) null, c());
        return a2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00eb, code lost:
        if (r10.getClass().equals(((com.alibaba.fastjson2.reader.du) r1).i) == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ed, code lost:
        r5 = (java.util.Map) r1.a(r25);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0165, code lost:
        if (r10.getClass().equals(((com.alibaba.fastjson2.reader.du) r1).i) == false) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x021a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01e1  */
    @Override // com.alibaba.fastjson2.reader.bu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(com.alibaba.fastjson2.JSONReader r22, java.lang.reflect.Type r23, java.lang.Object r24, long r25) {
        /*
            Method dump skipped, instructions count: 539
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.reader.dy.a(com.alibaba.fastjson2.JSONReader, java.lang.reflect.Type, java.lang.Object, long):java.lang.Object");
    }

    @Override // com.alibaba.fastjson2.reader.bu
    public Object a(Map map, long j) {
        ObjectReaderProvider objectReaderProvider = JSONFactory.defaultObjectReaderProvider;
        Class cls = this.b;
        Map hashMap = (cls == Map.class || cls == HashMap.class) ? new HashMap() : (Map) a(j);
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            Type type = this.c;
            Object obj = (type == null || type == String.class) ? key.toString() : TypeUtils.a(key, type);
            if (value != null) {
                Class<?> cls2 = value.getClass();
                if (this.d == Object.class) {
                    continue;
                } else if (cls2 == JSONObject.class || cls2 == JSONFactory.d()) {
                    if (this.i == null) {
                        this.i = objectReaderProvider.a(this.d);
                    }
                    value = this.i.a((JSONObject) value, j);
                } else if ((cls2 == JSONArray.class || cls2 == JSONFactory.e()) && this.e == List.class) {
                    if (this.i == null) {
                        this.i = objectReaderProvider.a(this.d);
                    }
                    this.i.b((JSONArray) value);
                } else {
                    com.alibaba.fastjson2.function.d a2 = objectReaderProvider.a(cls2, this.d);
                    if (a2 != null) {
                        value = a2.apply(value);
                    } else if (value instanceof Map) {
                        Map map2 = (Map) value;
                        if (this.i == null) {
                            this.i = objectReaderProvider.a(this.d);
                        }
                        try {
                            value = this.i.a(map2, j);
                        } catch (Exception unused) {
                        }
                    } else if (value instanceof Collection) {
                        if (this.i == null) {
                            this.i = objectReaderProvider.a(this.d);
                        }
                        value = this.i.b((Collection) value);
                    } else if (!cls2.isInstance(value)) {
                        throw new JSONException("can not convert from " + cls2 + " to " + this.d);
                    }
                }
            }
            hashMap.put(obj, value);
        }
        com.alibaba.fastjson2.function.d dVar = this.g;
        return dVar != null ? dVar.apply(hashMap) : hashMap;
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

    /* JADX WARN: Removed duplicated region for block: B:35:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0083 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f3  */
    @Override // com.alibaba.fastjson2.reader.bu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object b(com.alibaba.fastjson2.JSONReader r19, java.lang.reflect.Type r20, java.lang.Object r21, long r22) {
        /*
            Method dump skipped, instructions count: 347
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.reader.dy.b(com.alibaba.fastjson2.JSONReader, java.lang.reflect.Type, java.lang.Object, long):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Object] */
    @Override // com.alibaba.fastjson2.reader.bu
    public /* synthetic */ T b(Collection collection) {
        return bu.CC.$default$b(this, collection);
    }

    @Override // com.alibaba.fastjson2.reader.bu
    public Class bm_() {
        return this.f3005a;
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
