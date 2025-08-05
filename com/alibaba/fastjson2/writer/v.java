package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Field;
import tb.kge;

/* loaded from: classes2.dex */
class v<T> extends FieldWriter<T> {
    static {
        kge.a(420110993);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public v(String str, int i, long j, String str2, String str3, Field field) {
        super(str, i, j, str2, str3, Float.class, Float.class, field, null);
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public Object a(Object obj) {
        if (obj == null) {
            throw new JSONException("field.get error, " + this.f3039a);
        }
        try {
            return (this.k == -1 || this.c.isPrimitive()) ? this.i.get(obj) : com.alibaba.fastjson2.util.e.UNSAFE.getObject(obj, this.k);
        } catch (IllegalAccessException | IllegalArgumentException e) {
            throw new JSONException("field.get error, " + this.f3039a, e);
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
    }
}
