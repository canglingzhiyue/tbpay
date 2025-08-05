package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.reader.bu;
import java.lang.reflect.Type;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.util.Collection;
import java.util.Map;
import tb.kge;

/* loaded from: classes2.dex */
public class ej implements bu {

    /* renamed from: a  reason: collision with root package name */
    static final long f3014a;
    static final long b;
    private final Class c;

    static {
        kge.a(55246392);
        kge.a(438295340);
        f3014a = com.alibaba.fastjson2.util.c.b("address");
        b = com.alibaba.fastjson2.util.c.b("port");
    }

    public ej(Class cls) {
        this.c = cls;
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
        InetAddress inetAddress = null;
        if (jSONReader.g()) {
            return null;
        }
        if (this.c != InetSocketAddress.class) {
            throw new JSONException(jSONReader.d("not support : " + this.c.getName()));
        }
        int i = 0;
        jSONReader.n();
        while (!jSONReader.p()) {
            long G = jSONReader.G();
            if (G == f3014a) {
                inetAddress = (InetAddress) jSONReader.b((Class<Object>) InetAddress.class);
            } else if (G == b) {
                i = jSONReader.T().intValue();
            } else {
                jSONReader.N();
            }
        }
        jSONReader.s();
        return new InetSocketAddress(inetAddress, i);
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
    public /* synthetic */ T b(JSONReader jSONReader, Type type, Object obj, long j) {
        return bu.CC.$default$b(this, jSONReader, type, obj, j);
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
