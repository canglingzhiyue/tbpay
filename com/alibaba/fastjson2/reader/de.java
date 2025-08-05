package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.reader.bu;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import tb.kge;
import tb.riy;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class de implements bu {

    /* renamed from: a  reason: collision with root package name */
    final Type f2987a;
    final Class b;
    final Type c;
    final Class<?> d;
    bu e;
    final String f;
    final long g;

    static {
        kge.a(671798350);
        kge.a(438295340);
    }

    public de(GenericArrayType genericArrayType) {
        this.f2987a = genericArrayType;
        this.b = TypeUtils.e(this.f2987a);
        this.c = genericArrayType.getGenericComponentType();
        this.d = TypeUtils.b(this.c);
        this.f = riy.ARRAY_START_STR + TypeUtils.a((Class) this.d);
        this.g = com.alibaba.fastjson2.util.c.b(this.f);
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

    @Override // com.alibaba.fastjson2.reader.bu
    public Object a(JSONReader jSONReader, Type type, Object obj, long j) {
        Object az;
        if (this.e == null) {
            this.e = jSONReader.f2934a.a(this.c);
        }
        if (jSONReader.w) {
            return b(jSONReader, type, obj, 0L);
        }
        if (jSONReader.aF()) {
            return null;
        }
        char a2 = jSONReader.a();
        if (a2 == '\"') {
            if ((type instanceof GenericArrayType) && ((GenericArrayType) type).getGenericComponentType() == Byte.TYPE) {
                return (jSONReader.a(j) & JSONReader.Feature.Base64StringAsByteArray.mask) != 0 ? com.alibaba.fastjson2.util.d.b(jSONReader.az()) : jSONReader.Q();
            } else if (jSONReader.az().isEmpty()) {
                return null;
            } else {
                throw new JSONException(jSONReader.aR());
            }
        }
        ArrayList arrayList = new ArrayList();
        if (a2 != '[') {
            throw new JSONException(jSONReader.aR());
        }
        jSONReader.D();
        while (!jSONReader.r()) {
            bu buVar = this.e;
            if (buVar != null) {
                az = buVar.a(jSONReader, this.c, (Object) null, 0L);
            } else if (this.c != String.class) {
                throw new JSONException(jSONReader.d("TODO : " + this.c));
            } else {
                az = jSONReader.az();
            }
            arrayList.add(az);
            jSONReader.s();
        }
        jSONReader.s();
        Object newInstance = Array.newInstance(this.d, arrayList.size());
        for (int i = 0; i < arrayList.size(); i++) {
            Array.set(newInstance, i, arrayList.get(i));
        }
        return newInstance;
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
        if (jSONReader.a((byte) -110) && jSONReader.F() != this.g) {
            String aG = jSONReader.aG();
            throw new JSONException("not support input typeName " + aG);
        }
        int t = jSONReader.t();
        if (t > 0 && this.e == null) {
            this.e = jSONReader.f2934a.a(this.c);
        }
        Object newInstance = Array.newInstance(this.d, t);
        for (int i = 0; i < t; i++) {
            Array.set(newInstance, i, this.e.b(jSONReader, this.c, null, 0L));
        }
        return newInstance;
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
