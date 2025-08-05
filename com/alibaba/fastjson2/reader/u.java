package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.util.TypeUtils;
import tb.kge;

/* loaded from: classes2.dex */
final class u<T> extends d<T> {
    static {
        kge.a(-1677563322);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public u(java.lang.String r13, int r14, long r15, java.lang.String r17, java.lang.Boolean r18, java.lang.reflect.Field r19) {
        /*
            r12 = this;
            java.lang.Class r3 = java.lang.Boolean.TYPE
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
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.reader.u.<init>(java.lang.String, int, long, java.lang.String, java.lang.Boolean, java.lang.reflect.Field):void");
    }

    @Override // com.alibaba.fastjson2.reader.d
    public void a(T t, int i) {
        a((u<T>) t, TypeUtils.m(Integer.valueOf(i)));
    }

    @Override // com.alibaba.fastjson2.reader.d
    public void a(T t, Object obj) {
        boolean booleanValue;
        if (obj == null) {
            if ((this.e & JSONReader.Feature.IgnoreSetNullValue.mask) != 0) {
                return;
            }
            booleanValue = false;
        } else if (!(obj instanceof Boolean)) {
            throw new JSONException("set " + this.b + " error, type not support " + obj.getClass());
        } else {
            booleanValue = ((Boolean) obj).booleanValue();
        }
        a((u<T>) t, booleanValue);
    }

    @Override // com.alibaba.fastjson2.reader.d
    public void a(T t, boolean z) {
        if (this.i != -1) {
            com.alibaba.fastjson2.util.e.UNSAFE.putBoolean(t, this.i, z);
            return;
        }
        try {
            this.h.setBoolean(t, z);
        } catch (Exception e) {
            throw new JSONException("set " + this.b + " error", e);
        }
    }

    @Override // com.alibaba.fastjson2.reader.d
    public Object b(JSONReader jSONReader) {
        return Boolean.valueOf(jSONReader.aL());
    }

    @Override // com.alibaba.fastjson2.reader.d
    public void b(JSONReader jSONReader, T t) {
        try {
            this.h.setBoolean(t, jSONReader.aL());
        } catch (Exception e) {
            throw new JSONException(jSONReader.d("set " + this.b + " error"), e);
        }
    }
}
