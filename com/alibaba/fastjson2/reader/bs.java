package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.reader.bu;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Map;
import tb.kge;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class bs implements bu {

    /* renamed from: a  reason: collision with root package name */
    final Type[] f2951a;
    final bu[] b;

    static {
        kge.a(1627932064);
        kge.a(438295340);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public bs(com.alibaba.fastjson2.util.h hVar) {
        Type[] typeArr = new Type[hVar.a()];
        for (int i = 0; i < hVar.a(); i++) {
            typeArr[i] = hVar.a(i);
        }
        this.f2951a = typeArr;
        this.b = new bu[typeArr.length];
    }

    @Override // com.alibaba.fastjson2.reader.bu
    public /* synthetic */ bu a(JSONReader.c cVar, long j) {
        bu a2;
        a2 = cVar.a(j);
        return a2;
    }

    bu a(JSONReader jSONReader, int i) {
        bu buVar = this.b[i];
        if (buVar == null) {
            bu a2 = jSONReader.a(this.f2951a[i]);
            this.b[i] = a2;
            return a2;
        }
        return buVar;
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
        Object a2;
        if (jSONReader.w) {
            return b(jSONReader, type, obj, 0L);
        }
        if (jSONReader.o()) {
            return null;
        }
        Object[] objArr = new Object[this.f2951a.length];
        if (!jSONReader.q()) {
            throw new JSONException(jSONReader.d("TODO"));
        }
        int i = 0;
        while (!jSONReader.r()) {
            if (jSONReader.u()) {
                String v = jSONReader.v();
                if ("..".equals(v)) {
                    a2 = objArr;
                } else {
                    jSONReader.a(objArr, i, com.alibaba.fastjson2.d.a(v));
                    a2 = null;
                }
            } else {
                a2 = a(jSONReader, i).a(jSONReader, this.f2951a[i], Integer.valueOf(i), j);
            }
            objArr[i] = a2;
            jSONReader.s();
            i++;
        }
        jSONReader.s();
        return objArr;
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
        Object a2;
        int t = jSONReader.t();
        if (t == -1) {
            return null;
        }
        Object[] objArr = new Object[this.f2951a.length];
        for (int i = 0; i < t; i++) {
            if (jSONReader.u()) {
                String v = jSONReader.v();
                if ("..".equals(v)) {
                    a2 = objArr;
                } else {
                    jSONReader.a(objArr, i, com.alibaba.fastjson2.d.a(v));
                    a2 = null;
                }
            } else {
                a2 = a(jSONReader, i).a(jSONReader, this.f2951a[i], Integer.valueOf(i), j);
            }
            objArr[i] = a2;
        }
        return objArr;
    }

    @Override // com.alibaba.fastjson2.reader.bu
    public Object b(Collection collection) {
        return new Object[this.f2951a.length];
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
