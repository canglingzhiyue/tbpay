package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Field;
import tb.kge;

/* loaded from: classes2.dex */
final class ab<T> extends y<T> {
    static {
        kge.a(-313574054);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ab(String str, int i, long j, String str2, String str3, Field field) {
        super(str, i, j, str2, str3, Short.TYPE, field, null);
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public Object a(T t) {
        return Short.valueOf(b(t));
    }

    @Override // com.alibaba.fastjson2.writer.y, com.alibaba.fastjson2.writer.FieldWriter
    public void a(JSONWriter jSONWriter, T t) {
        jSONWriter.d((int) b(t));
    }

    public short b(T t) {
        if (t == null) {
            throw new JSONException("field.get error, " + this.f3039a);
        }
        try {
            return this.k != -1 ? com.alibaba.fastjson2.util.e.UNSAFE.getShort(t, this.k) : this.i.getShort(t);
        } catch (IllegalAccessException | IllegalArgumentException e) {
            throw new JSONException("field.get error, " + this.f3039a, e);
        }
    }

    @Override // com.alibaba.fastjson2.writer.y, com.alibaba.fastjson2.writer.FieldWriter
    public boolean b(JSONWriter jSONWriter, T t) {
        a(jSONWriter, b(t));
        return true;
    }
}
