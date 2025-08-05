package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import tb.kge;

/* loaded from: classes2.dex */
final class ag extends ac {
    final com.alibaba.fastjson2.function.g A;

    static {
        kge.a(-620845846);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ag(java.lang.String r12, int r13, long r14, java.lang.String r16, java.lang.String r17, java.lang.reflect.Method r18, com.alibaba.fastjson2.function.g r19) {
        /*
            r11 = this;
            java.lang.Class r8 = java.lang.Integer.TYPE
            r9 = 0
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r5 = r16
            r6 = r17
            r7 = r8
            r10 = r18
            r0.<init>(r1, r2, r3, r5, r6, r7, r8, r9, r10)
            r1 = r19
            r0.A = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.writer.ag.<init>(java.lang.String, int, long, java.lang.String, java.lang.String, java.lang.reflect.Method, com.alibaba.fastjson2.function.g):void");
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public Object a(Object obj) {
        return Integer.valueOf(this.A.applyAsInt(obj));
    }

    @Override // com.alibaba.fastjson2.writer.ac, com.alibaba.fastjson2.writer.FieldWriter
    public void a(JSONWriter jSONWriter, Object obj) {
        jSONWriter.d(this.A.applyAsInt(obj));
    }

    @Override // com.alibaba.fastjson2.writer.ac, com.alibaba.fastjson2.writer.FieldWriter
    public boolean b(JSONWriter jSONWriter, Object obj) {
        try {
            a(jSONWriter, this.A.applyAsInt(obj));
            return true;
        } catch (RuntimeException e) {
            if (!jSONWriter.f()) {
                throw e;
            }
            return false;
        }
    }
}
