package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Field;
import tb.kge;

/* loaded from: classes2.dex */
final class ak<T> extends ah<T> {
    static {
        kge.a(-1976199949);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ak(String str, int i, long j, String str2, String str3, Field field) {
        super(str, i, j, str2, str3, Long.TYPE, field, null);
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public Object a(T t) {
        return Long.valueOf(b(t));
    }

    @Override // com.alibaba.fastjson2.writer.ah, com.alibaba.fastjson2.writer.FieldWriter
    public void a(JSONWriter jSONWriter, T t) {
        jSONWriter.e(b(t));
    }

    public long b(T t) {
        if (t == null) {
            throw new JSONException("field.get error, " + this.f3039a);
        }
        try {
            return this.k != -1 ? com.alibaba.fastjson2.util.e.UNSAFE.getLong(t, this.k) : this.i.getLong(t);
        } catch (IllegalAccessException | IllegalArgumentException e) {
            throw new JSONException("field.get error, " + this.f3039a, e);
        }
    }

    @Override // com.alibaba.fastjson2.writer.ah, com.alibaba.fastjson2.writer.FieldWriter
    public boolean b(JSONWriter jSONWriter, T t) {
        long b = b(t);
        if (b != 0 || !jSONWriter.a(JSONWriter.Feature.NotWriteDefaultValue)) {
            a(jSONWriter, b);
            return true;
        }
        return false;
    }
}
