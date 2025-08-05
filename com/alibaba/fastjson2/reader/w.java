package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader;
import tb.kge;

/* loaded from: classes2.dex */
final class w<T> extends d<T> {
    static {
        kge.a(166734770);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public w(java.lang.String r13, int r14, long r15, java.lang.String r17, java.lang.Character r18, java.lang.reflect.Field r19) {
        /*
            r12 = this;
            java.lang.Class r3 = java.lang.Character.TYPE
            r8 = 0
            r10 = 0
            r0 = r12
            r1 = r13
            r2 = r3
            r4 = r14
            r5 = r15
            r7 = r17
            r9 = r18
            r11 = r19
            r0.<init>(r1, r2, r3, r4, r5, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.reader.w.<init>(java.lang.String, int, long, java.lang.String, java.lang.Character, java.lang.reflect.Field):void");
    }

    @Override // com.alibaba.fastjson2.reader.d
    public void a(T t, Object obj) {
        char charValue;
        if (obj instanceof String) {
            charValue = ((String) obj).charAt(0);
        } else if (!(obj instanceof Character)) {
            throw new JSONException("cast to char error");
        } else {
            charValue = ((Character) obj).charValue();
        }
        try {
            this.h.set(t, Character.valueOf(charValue));
        } catch (Exception e) {
            throw new JSONException("set " + this.b + " error", e);
        }
    }

    @Override // com.alibaba.fastjson2.reader.d
    public Object b(JSONReader jSONReader) {
        return Character.valueOf(jSONReader.aD());
    }

    @Override // com.alibaba.fastjson2.reader.d
    public void b(JSONReader jSONReader, T t) {
        char aD = jSONReader.aD();
        if (aD != 0 || !jSONReader.aH()) {
            a((w<T>) t, aD);
        }
    }
}
