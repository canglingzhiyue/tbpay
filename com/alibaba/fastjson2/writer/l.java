package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONWriter;
import tb.kge;

/* loaded from: classes2.dex */
final class l<T> extends FieldWriter<T> {
    static {
        kge.a(2099829154);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public l(java.lang.String r12, int r13, long r14, java.lang.String r16, java.lang.String r17, java.lang.reflect.Field r18) {
        /*
            r11 = this;
            java.lang.Class r8 = java.lang.Character.TYPE
            r10 = 0
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r5 = r16
            r6 = r17
            r7 = r8
            r9 = r18
            r0.<init>(r1, r2, r3, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.writer.l.<init>(java.lang.String, int, long, java.lang.String, java.lang.String, java.lang.reflect.Field):void");
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public Object a(Object obj) {
        return Character.valueOf(b(obj));
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public void a(JSONWriter jSONWriter, Object obj) {
        jSONWriter.b(b(obj));
    }

    public char b(Object obj) {
        if (obj == null) {
            throw new JSONException("field.get error, " + this.f3039a);
        }
        try {
            return this.k != -1 ? com.alibaba.fastjson2.util.e.UNSAFE.getChar(obj, this.k) : this.i.getChar(obj);
        } catch (IllegalAccessException | IllegalArgumentException e) {
            throw new JSONException("field.get error, " + this.f3039a, e);
        }
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public boolean b(JSONWriter jSONWriter, T t) {
        char b = b(t);
        a(jSONWriter);
        jSONWriter.b(b);
        return true;
    }
}
