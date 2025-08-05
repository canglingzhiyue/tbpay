package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Field;
import tb.kge;

/* loaded from: classes2.dex */
final class am<T> extends d<T> {
    static {
        kge.a(-1177557974);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public am(String str, Class cls, int i, long j, String str2, Short sh, Field field) {
        super(str, cls, cls, i, j, str2, null, sh, null, field);
    }

    @Override // com.alibaba.fastjson2.reader.d
    public void a(T t, double d) {
        a((am<T>) t, Short.valueOf((short) d));
    }

    @Override // com.alibaba.fastjson2.reader.d
    public void a(T t, float f) {
        a((am<T>) t, Short.valueOf((short) f));
    }

    @Override // com.alibaba.fastjson2.reader.d
    public void a(T t, int i) {
        try {
            this.h.setShort(t, (short) i);
        } catch (Exception e) {
            throw new JSONException("set " + this.b + " error", e);
        }
    }

    @Override // com.alibaba.fastjson2.reader.d
    public void a(T t, long j) {
        try {
            this.h.setShort(t, (short) j);
        } catch (Exception e) {
            throw new JSONException("set " + this.b + " error", e);
        }
    }

    @Override // com.alibaba.fastjson2.reader.d
    public void a(T t, Object obj) {
        try {
            this.h.setShort(t, TypeUtils.k(obj));
        } catch (Exception e) {
            throw new JSONException("set " + this.b + " error", e);
        }
    }

    @Override // com.alibaba.fastjson2.reader.d
    public Object b(JSONReader jSONReader) {
        return Short.valueOf((short) jSONReader.R());
    }

    @Override // com.alibaba.fastjson2.reader.d
    public void b(JSONReader jSONReader, T t) {
        try {
            this.h.setShort(t, (short) jSONReader.R());
        } catch (Exception e) {
            throw new JSONException(jSONReader.d("set " + this.b + " error"), e);
        }
    }
}
