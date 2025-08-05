package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Field;
import tb.kge;

/* loaded from: classes2.dex */
final class au<T> extends d<T> {
    static {
        kge.a(-137068224);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public au(String str, Class cls, int i, long j, String str2, Long l, Field field) {
        super(str, cls, cls, i, j, str2, null, l, null, field);
    }

    @Override // com.alibaba.fastjson2.reader.d
    public void a(T t, double d) {
        a((au<T>) t, Long.valueOf((long) d));
    }

    @Override // com.alibaba.fastjson2.reader.d
    public void a(T t, float f) {
        a((au<T>) t, Long.valueOf(f));
    }

    @Override // com.alibaba.fastjson2.reader.d
    public void a(T t, Object obj) {
        try {
            this.h.set(t, TypeUtils.e(obj));
        } catch (Exception e) {
            throw new JSONException("set " + this.b + " error", e);
        }
    }

    @Override // com.alibaba.fastjson2.reader.d
    public Object b(JSONReader jSONReader) {
        return jSONReader.Z();
    }

    @Override // com.alibaba.fastjson2.reader.d
    public void b(JSONReader jSONReader, T t) {
        try {
            this.h.set(t, jSONReader.Z());
        } catch (Exception e) {
            throw new JSONException(jSONReader.d("set " + this.b + " error"), e);
        }
    }
}
