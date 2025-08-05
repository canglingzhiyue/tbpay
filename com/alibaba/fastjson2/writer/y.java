package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import tb.kge;

/* loaded from: classes2.dex */
abstract class y<T> extends FieldWriter<T> {
    static {
        kge.a(-810282015);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public y(String str, int i, long j, String str2, String str3, Class cls, Field field, Method method) {
        super(str, i, j, str2, str3, cls, cls, field, method);
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public bg a(JSONWriter jSONWriter, Class cls) {
        return cv.f3075a;
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public void a(JSONWriter jSONWriter, T t) {
        Short sh = (Short) a((y<T>) t);
        if (sh == null) {
            jSONWriter.q();
        } else {
            jSONWriter.d((int) sh.shortValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(JSONWriter jSONWriter, short s) {
        if ((jSONWriter.e() & JSONWriter.Feature.WriteNonStringValueAsString.mask) != 0) {
            a(jSONWriter);
            jSONWriter.d(Short.toString(s));
            return;
        }
        a(jSONWriter);
        jSONWriter.a(s);
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public boolean b(JSONWriter jSONWriter, T t) {
        try {
            Short sh = (Short) a((y<T>) t);
            if (sh != null) {
                a(jSONWriter, sh.shortValue());
                return true;
            } else if (((this.d | jSONWriter.e()) & JSONWriter.Feature.WriteNulls.mask) == 0) {
                return false;
            } else {
                a(jSONWriter);
                jSONWriter.q();
                return true;
            }
        } catch (RuntimeException e) {
            if (!jSONWriter.f()) {
                throw e;
            }
            return false;
        }
    }
}
