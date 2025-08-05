package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import tb.kge;

/* loaded from: classes2.dex */
class w<T> extends FieldWriter<T> {
    static {
        kge.a(335692330);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public w(String str, int i, long j, String str2, String str3, Type type, Class cls, Method method) {
        super(str, i, j, str2, str3, type, cls, null, method);
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public Object a(Object obj) {
        try {
            return this.j.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
            throw new JSONException("invoke getter method error, " + this.f3039a, e);
        }
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public void a(JSONWriter jSONWriter, T t) {
        Float f = (Float) a(t);
        if (f == null) {
            jSONWriter.q();
            return;
        }
        float floatValue = f.floatValue();
        if (this.g != null) {
            jSONWriter.a(floatValue, this.g);
        } else {
            jSONWriter.a(floatValue);
        }
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public boolean b(JSONWriter jSONWriter, T t) {
        try {
            Float f = (Float) a(t);
            if (f != null) {
                a(jSONWriter);
                float floatValue = f.floatValue();
                if (this.g != null) {
                    jSONWriter.a(floatValue, this.g);
                } else {
                    jSONWriter.a(floatValue);
                }
                return true;
            }
            long c = jSONWriter.c(this.d);
            if ((JSONWriter.Feature.WriteNulls.mask & c) == 0 || (c & JSONWriter.Feature.NotWriteDefaultValue.mask) != 0) {
                return false;
            }
            a(jSONWriter);
            jSONWriter.q();
            return true;
        } catch (RuntimeException e) {
            if (!jSONWriter.f()) {
                throw e;
            }
            return false;
        }
    }
}
