package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Field;
import tb.kge;

/* loaded from: classes2.dex */
final class ao<T> extends al<T> {
    static {
        kge.a(-1298060939);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ao(String str, int i, long j, String str2, String str3, Field field) {
        super(str, i, j, str2, str3, Byte.TYPE, field, null);
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public Object a(T t) {
        return Byte.valueOf(b(t));
    }

    @Override // com.alibaba.fastjson2.writer.al, com.alibaba.fastjson2.writer.FieldWriter
    public void a(JSONWriter jSONWriter, T t) {
        jSONWriter.d((int) b(t));
    }

    public byte b(T t) {
        if (t == null) {
            throw new JSONException("field.get error, " + this.f3039a);
        }
        try {
            return this.k != -1 ? com.alibaba.fastjson2.util.e.UNSAFE.getByte(t, this.k) : this.i.getByte(t);
        } catch (IllegalAccessException | IllegalArgumentException e) {
            throw new JSONException("field.get error, " + this.f3039a, e);
        }
    }

    @Override // com.alibaba.fastjson2.writer.al, com.alibaba.fastjson2.writer.FieldWriter
    public boolean b(JSONWriter jSONWriter, T t) {
        a(jSONWriter, b(t));
        return true;
    }
}
