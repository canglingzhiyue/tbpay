package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.function.Supplier;
import com.alibaba.fastjson2.reader.bu;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes2.dex */
public final class du implements bu {
    public static final du d;
    public static final du e;

    /* renamed from: a  reason: collision with root package name */
    final boolean f3002a;
    final Type f;
    final Class g;
    final long h;
    final Class i;
    final long j;
    final com.alibaba.fastjson2.function.d k;
    Object l;
    volatile boolean m;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class a implements com.alibaba.fastjson2.function.d<Map, Map> {
        static {
            kge.a(-1864940293);
            kge.a(895087661);
        }

        a() {
        }

        @Override // com.alibaba.fastjson2.function.d
        /* renamed from: a */
        public Map apply(Map map) {
            Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
            return Collections.singletonMap(entry.getKey(), entry.getValue());
        }
    }

    static {
        kge.a(1729833552);
        kge.a(438295340);
        d = new du(null, HashMap.class, 77L, HashMap.class, 0L, null);
        e = new du(null, JSONObject.class, -2622135058008237800L, JSONObject.class, 0L, null);
    }

    du(Class cls, long j, Object obj) {
        this(cls, cls, cls, j, null);
        this.l = obj;
    }

    private du(Type type, Class cls, long j, Class cls2, long j2, com.alibaba.fastjson2.function.d dVar) {
        this.f = type;
        this.g = cls;
        this.h = j;
        this.i = cls2;
        this.j = j2;
        this.k = dVar;
        this.f3002a = cls != null && cls.getName().equals("com.alibaba.fastjson.JSONObject");
    }

    du(Type type, Class cls, Class cls2, long j, com.alibaba.fastjson2.function.d dVar) {
        this(type, cls, com.alibaba.fastjson2.util.c.b(TypeUtils.a(cls)), cls2, j, dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.alibaba.fastjson2.reader.bu a(java.lang.reflect.Type r15, java.lang.Class r16, long r17) {
        /*
            Method dump skipped, instructions count: 372
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.reader.du.a(java.lang.reflect.Type, java.lang.Class, long):com.alibaba.fastjson2.reader.bu");
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
        Class cls = this.i;
        if (cls == HashMap.class) {
            return new HashMap();
        }
        if (cls == LinkedHashMap.class) {
            return new LinkedHashMap();
        }
        if (cls == JSONObject.class) {
            return new JSONObject();
        }
        Object obj = this.l;
        if (obj != null) {
            return obj;
        }
        String name = cls.getName();
        char c = 65535;
        int hashCode = name.hashCode();
        if (hashCode != 92004358) {
            if (hashCode == 92004387 && name.equals("java.util.ImmutableCollections$MapN")) {
                c = 1;
            }
        } else if (name.equals("java.util.ImmutableCollections$Map1")) {
            c = 0;
        }
        if (c == 0) {
            return new HashMap();
        }
        if (c == 1) {
            return new LinkedHashMap();
        }
        try {
            return this.i.newInstance();
        } catch (IllegalAccessException | InstantiationException unused) {
            throw new JSONException("create map error : " + this.i);
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
        Class cls;
        if (jSONReader.w) {
            return b(jSONReader, type, obj, j);
        }
        if (jSONReader.g()) {
            return null;
        }
        JSONReader.c cVar = jSONReader.f2934a;
        Supplier<Map> b = jSONReader.f2934a.b();
        Map map = (Map) ((b == null || !((cls = this.g) == null || cls == JSONObject.class || "com.alibaba.fastjson.JSONObject".equals(cls.getName()))) ? a(cVar.p | j) : b.get());
        if (!jSONReader.z() || jSONReader.K()) {
            jSONReader.a(map, j);
        } else {
            String az = jSONReader.az();
            if (!az.isEmpty()) {
                JSONReader a2 = JSONReader.a(az, jSONReader.h());
                try {
                    a2.a(map, j);
                    if (a2 != null) {
                        a2.close();
                    }
                } catch (Throwable th) {
                    if (a2 != null) {
                        try {
                            a2.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            }
        }
        jSONReader.s();
        if (this.f3002a) {
            return JSONFactory.a(map);
        }
        com.alibaba.fastjson2.function.d dVar = this.k;
        return dVar != null ? dVar.apply(map) : map;
    }

    @Override // com.alibaba.fastjson2.reader.bu
    public Object a(Map map, long j) {
        if (this.g.isInstance(map)) {
            return map;
        }
        if (this.g == JSONObject.class) {
            return new JSONObject(map);
        }
        Map map2 = (Map) a(j);
        map2.putAll(map);
        if (this.f3002a) {
            return JSONFactory.a(map2);
        }
        com.alibaba.fastjson2.function.d dVar = this.k;
        return dVar != null ? dVar.apply(map2) : map2;
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

    /* JADX WARN: Removed duplicated region for block: B:116:0x00f8 A[EDGE_INSN: B:116:0x00f8->B:48:0x00f8 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x015b  */
    @Override // com.alibaba.fastjson2.reader.bu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object b(com.alibaba.fastjson2.JSONReader r19, java.lang.reflect.Type r20, java.lang.Object r21, long r22) {
        /*
            Method dump skipped, instructions count: 506
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.reader.du.b(com.alibaba.fastjson2.JSONReader, java.lang.reflect.Type, java.lang.Object, long):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Object] */
    @Override // com.alibaba.fastjson2.reader.bu
    public /* synthetic */ T b(Collection collection) {
        return bu.CC.$default$b(this, collection);
    }

    @Override // com.alibaba.fastjson2.reader.bu
    public Class bm_() {
        return this.g;
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
    public com.alibaba.fastjson2.function.d f() {
        return this.k;
    }
}
