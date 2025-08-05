package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.util.TypeUtils;
import tb.kge;

/* loaded from: classes2.dex */
final class v<T> extends bj<T> {
    static {
        kge.a(-267701995);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public v(java.lang.String r14, int r15, long r16, java.lang.String r18, java.lang.Boolean r19, java.lang.reflect.Method r20) {
        /*
            r13 = this;
            java.lang.Class r3 = java.lang.Boolean.TYPE
            r8 = 0
            r11 = 0
            r12 = 0
            r0 = r13
            r1 = r14
            r2 = r3
            r4 = r15
            r5 = r16
            r7 = r18
            r9 = r19
            r10 = r20
            r0.<init>(r1, r2, r3, r4, r5, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.reader.v.<init>(java.lang.String, int, long, java.lang.String, java.lang.Boolean, java.lang.reflect.Method):void");
    }

    @Override // com.alibaba.fastjson2.reader.bj, com.alibaba.fastjson2.reader.d
    public void a(JSONReader jSONReader, T t) {
        try {
            this.g.invoke(t, Boolean.valueOf(jSONReader.aL()));
        } catch (Exception e) {
            throw new JSONException(jSONReader.d("set " + this.b + " error"), e);
        }
    }

    @Override // com.alibaba.fastjson2.reader.bj, com.alibaba.fastjson2.reader.d
    public void a(T t, Object obj) {
        try {
            this.g.invoke(t, Boolean.valueOf(TypeUtils.m(obj)));
        } catch (Exception e) {
            throw new JSONException("set " + this.b + " error", e);
        }
    }

    @Override // com.alibaba.fastjson2.reader.bj, com.alibaba.fastjson2.reader.d
    public Object b(JSONReader jSONReader) {
        return jSONReader.aK();
    }

    @Override // com.alibaba.fastjson2.reader.bj, com.alibaba.fastjson2.reader.d
    public void b(JSONReader jSONReader, T t) {
        try {
            this.g.invoke(t, Boolean.valueOf(jSONReader.aL()));
        } catch (Exception e) {
            throw new JSONException(jSONReader.d("set " + this.b + " error"), e);
        }
    }
}
