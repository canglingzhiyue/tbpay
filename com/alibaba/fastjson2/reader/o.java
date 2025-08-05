package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import tb.kge;

/* loaded from: classes2.dex */
final class o<T> extends d<T> {
    static {
        kge.a(45383158);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public o(String str, Class cls, int i, long j, String str2, BigDecimal bigDecimal, Field field) {
        super(str, cls, cls, i, j, str2, null, bigDecimal, null, field);
    }

    @Override // com.alibaba.fastjson2.reader.d
    public void a(T t, int i) {
        try {
            this.h.set(t, BigDecimal.valueOf(i));
        } catch (Exception e) {
            throw new JSONException("set " + this.b + " error", e);
        }
    }

    @Override // com.alibaba.fastjson2.reader.d
    public void a(T t, long j) {
        try {
            this.h.set(t, BigDecimal.valueOf(j));
        } catch (Exception e) {
            throw new JSONException("set " + this.b + " error", e);
        }
    }

    @Override // com.alibaba.fastjson2.reader.d
    public void a(T t, Object obj) {
        try {
            this.h.set(t, TypeUtils.c(obj));
        } catch (Exception e) {
            throw new JSONException("set " + this.b + " error", e);
        }
    }

    @Override // com.alibaba.fastjson2.reader.d
    public Object b(JSONReader jSONReader) {
        return jSONReader.ag();
    }

    @Override // com.alibaba.fastjson2.reader.d
    public void b(JSONReader jSONReader, T t) {
        try {
            this.h.set(t, jSONReader.ag());
        } catch (Exception e) {
            throw new JSONException(jSONReader.d("set " + this.b + " error"), e);
        }
    }
}
