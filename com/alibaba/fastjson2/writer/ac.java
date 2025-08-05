package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import tb.kge;

/* loaded from: classes2.dex */
abstract class ac<T> extends FieldWriter<T> {
    final boolean z;

    static {
        kge.a(-810281957);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ac(String str, int i, long j, String str2, String str3, Type type, Class cls, Field field, Method method) {
        super(str, i, j, str2, str3, type, cls, field, method);
        this.z = (JSONWriter.Feature.WriteNonStringValueAsString.mask & j) != 0 || "string".equals(str2);
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public bg a(JSONWriter jSONWriter, Class cls) {
        return cls == this.c ? cx.f3077a : jSONWriter.a(cls);
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public final void a(JSONWriter jSONWriter, int i) {
        if (this.z) {
            a(jSONWriter);
            jSONWriter.d(Integer.toString(i));
            return;
        }
        a(jSONWriter);
        if (this.f != null) {
            jSONWriter.a(i, this.f);
        } else {
            jSONWriter.d(i);
        }
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public void a(JSONWriter jSONWriter, T t) {
        Integer num = (Integer) a((ac<T>) t);
        if (num == null) {
            jSONWriter.q();
        } else {
            jSONWriter.d(num.intValue());
        }
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public boolean b(JSONWriter jSONWriter, T t) {
        try {
            Integer num = (Integer) a((ac<T>) t);
            if (num != null) {
                a(jSONWriter, num.intValue());
                return true;
            } else if (((this.d | jSONWriter.e()) & (JSONWriter.Feature.WriteNulls.mask | JSONWriter.Feature.NullAsDefaultValue.mask | JSONWriter.Feature.WriteNullNumberAsZero.mask)) == 0) {
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
