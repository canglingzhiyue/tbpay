package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.b;
import com.alibaba.fastjson2.function.Supplier;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Type;
import java.util.Map;
import tb.kge;

/* loaded from: classes2.dex */
public final class ei<T> extends cb<T> {
    static {
        kge.a(1049461613);
    }

    public ei(Class cls, String str, String str2, long j, Supplier supplier, com.alibaba.fastjson2.function.d dVar, d[] dVarArr) {
        super(cls, str, str2, j, supplier, dVar, dVarArr);
    }

    @Override // com.alibaba.fastjson2.reader.cb, com.alibaba.fastjson2.reader.cc, com.alibaba.fastjson2.reader.bu
    public T a(long j) {
        return (T) TypeUtils.a(this.F, new JSONObject());
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0144 A[SYNTHETIC] */
    @Override // com.alibaba.fastjson2.reader.cc, com.alibaba.fastjson2.reader.bu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public T a(com.alibaba.fastjson2.JSONReader r18, java.lang.reflect.Type r19, java.lang.Object r20, long r21) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.reader.ei.a(com.alibaba.fastjson2.JSONReader, java.lang.reflect.Type, java.lang.Object, long):java.lang.Object");
    }

    @Override // com.alibaba.fastjson2.reader.cb, com.alibaba.fastjson2.reader.cc, com.alibaba.fastjson2.reader.bu
    public T a(Map map, long j) {
        return (T) TypeUtils.a(this.F, map instanceof JSONObject ? (JSONObject) map : new JSONObject(map));
    }

    @Override // com.alibaba.fastjson2.reader.cb, com.alibaba.fastjson2.reader.cc, com.alibaba.fastjson2.reader.bu
    public T b(JSONReader jSONReader, Type type, Object obj, long j) {
        Object b;
        String str;
        if (jSONReader.g()) {
            return null;
        }
        bu a2 = jSONReader.a(this.F, g(), this.I | j);
        if (a2 != null && a2.bm_() != this.F) {
            return (T) a2.b(jSONReader, type, obj, j);
        }
        if (jSONReader.w()) {
            if (jSONReader.m()) {
                return c(jSONReader, type, obj, j);
            }
            throw new JSONException(jSONReader.d("expect object, but " + b.CC.a(jSONReader.c())));
        }
        jSONReader.n();
        JSONObject jSONObject = new JSONObject();
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
                    return (T) a3.b(jSONReader, type, obj, j);
                }
            } else if (G != 0) {
                d b2 = b(G);
                if (b2 == null && jSONReader.b(this.I | j)) {
                    b2 = c(jSONReader.H());
                }
                if (b2 == null) {
                    str = jSONReader.J();
                    b = jSONReader.aM();
                } else {
                    b = b2.b(jSONReader);
                    str = b2.b;
                }
                jSONObject.put(str, b);
            }
            i++;
        }
        return (T) TypeUtils.a(this.F, jSONObject);
    }
}
