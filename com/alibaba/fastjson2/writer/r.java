package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONWriter;
import tb.kge;

/* loaded from: classes2.dex */
final class r<T> extends FieldWriter<T> {
    static {
        kge.a(-2095452579);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public r(java.lang.String r12, int r13, java.lang.String r14, java.lang.String r15, java.lang.reflect.Field r16) {
        /*
            r11 = this;
            java.lang.Class r8 = java.lang.Double.TYPE
            r3 = 0
            r10 = 0
            r0 = r11
            r1 = r12
            r2 = r13
            r5 = r14
            r6 = r15
            r7 = r8
            r9 = r16
            r0.<init>(r1, r2, r3, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.writer.r.<init>(java.lang.String, int, java.lang.String, java.lang.String, java.lang.reflect.Field):void");
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public Object a(Object obj) {
        return Double.valueOf(b(obj));
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public void a(JSONWriter jSONWriter, T t) {
        double b = b(t);
        if (this.g != null) {
            jSONWriter.a(b, this.g);
        } else {
            jSONWriter.a(b);
        }
    }

    public double b(Object obj) {
        if (obj == null) {
            throw new JSONException("field.get error, " + this.f3039a);
        }
        try {
            return this.k != -1 ? com.alibaba.fastjson2.util.e.UNSAFE.getDouble(obj, this.k) : this.i.getDouble(obj);
        } catch (IllegalAccessException | IllegalArgumentException e) {
            throw new JSONException("field.get error, " + this.f3039a, e);
        }
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public boolean b(JSONWriter jSONWriter, T t) {
        a(jSONWriter, b(t));
        return true;
    }
}
