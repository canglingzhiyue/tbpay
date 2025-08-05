package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Field;
import tb.kge;

/* loaded from: classes2.dex */
final class ad<T> extends d<T> {
    static {
        kge.a(1348162989);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ad(String str, Class cls, int i, long j, String str2, Double d, Field field) {
        super(str, cls, cls, i, j, str2, null, d, null, field);
    }

    @Override // com.alibaba.fastjson2.reader.d
    public void a(T t, Object obj) {
        try {
            this.h.set(t, Double.valueOf(TypeUtils.q(obj)));
        } catch (Exception e) {
            throw new JSONException("set " + this.b + " error", e);
        }
    }

    @Override // com.alibaba.fastjson2.reader.d
    public Object b(JSONReader jSONReader) {
        return Double.valueOf(jSONReader.ac());
    }

    @Override // com.alibaba.fastjson2.reader.d
    public void b(JSONReader jSONReader, T t) {
        try {
            this.h.setDouble(t, jSONReader.ac());
        } catch (Exception e) {
            throw new JSONException(jSONReader.d("set " + this.b + " error"), e);
        }
    }
}
