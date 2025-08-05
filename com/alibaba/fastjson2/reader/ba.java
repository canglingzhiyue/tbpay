package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Field;
import tb.kge;

/* loaded from: classes2.dex */
final class ba<T> extends d<T> {
    static {
        kge.a(-1176426818);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ba(String str, Class cls, int i, long j, String str2, Byte b, Field field) {
        super(str, cls, cls, i, j, str2, null, b, null, field);
    }

    @Override // com.alibaba.fastjson2.reader.d
    public void a(T t, double d) {
        a((ba<T>) t, Byte.valueOf((byte) d));
    }

    @Override // com.alibaba.fastjson2.reader.d
    public void a(T t, float f) {
        a((ba<T>) t, Byte.valueOf((byte) f));
    }

    @Override // com.alibaba.fastjson2.reader.d
    public void a(T t, int i) {
        a((ba<T>) t, Byte.valueOf((byte) i));
    }

    @Override // com.alibaba.fastjson2.reader.d
    public void a(T t, long j) {
        a((ba<T>) t, Byte.valueOf((byte) j));
    }

    @Override // com.alibaba.fastjson2.reader.d
    public void a(T t, Object obj) {
        try {
            this.h.set(t, TypeUtils.h(obj));
        } catch (Exception e) {
            throw new JSONException("set " + this.b + " error", e);
        }
    }

    @Override // com.alibaba.fastjson2.reader.d
    public void a(T t, short s) {
        a((ba<T>) t, Byte.valueOf((byte) s));
    }

    @Override // com.alibaba.fastjson2.reader.d
    public Object b(JSONReader jSONReader) {
        return Byte.valueOf((byte) jSONReader.R());
    }

    @Override // com.alibaba.fastjson2.reader.d
    public void b(JSONReader jSONReader, T t) {
        Integer T = jSONReader.T();
        try {
            this.h.set(t, T == null ? null : Byte.valueOf(T.byteValue()));
        } catch (Exception e) {
            throw new JSONException(jSONReader.d("set " + this.b + " error"), e);
        }
    }
}
