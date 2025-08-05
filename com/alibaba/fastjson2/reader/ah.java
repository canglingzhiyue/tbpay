package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Field;
import tb.kge;

/* loaded from: classes2.dex */
final class ah<T> extends d<T> {
    static {
        kge.a(-1062912462);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ah(String str, Class cls, int i, long j, String str2, Float f, Field field) {
        super(str, cls, cls, i, j, str2, null, f, null, field);
    }

    @Override // com.alibaba.fastjson2.reader.d
    public void a(T t, Object obj) {
        try {
            this.h.setFloat(t, TypeUtils.o(obj));
        } catch (Exception e) {
            throw new JSONException("set " + this.b + " error", e);
        }
    }

    @Override // com.alibaba.fastjson2.reader.d
    public Object b(JSONReader jSONReader) {
        return Float.valueOf(jSONReader.aa());
    }

    @Override // com.alibaba.fastjson2.reader.d
    public void b(JSONReader jSONReader, T t) {
        try {
            this.h.setFloat(t, jSONReader.aa());
        } catch (Exception e) {
            throw new JSONException(jSONReader.d("set " + this.b + " error"), e);
        }
    }
}
