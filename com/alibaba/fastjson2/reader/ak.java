package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Locale;
import tb.kge;

/* loaded from: classes2.dex */
final class ak<T> extends bj<T> {
    static {
        kge.a(1893896066);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ak(String str, Type type, Class cls, int i, long j, String str2, Locale locale, Short sh, Method method) {
        super(str, type, cls, i, j, str2, locale, sh, method, null, null);
    }

    @Override // com.alibaba.fastjson2.reader.bj, com.alibaba.fastjson2.reader.d
    public void a(T t, Object obj) {
        try {
            this.g.invoke(t, TypeUtils.j(obj));
        } catch (Exception e) {
            throw new JSONException("set " + this.b + " error", e);
        }
    }

    @Override // com.alibaba.fastjson2.reader.bj, com.alibaba.fastjson2.reader.d
    public Object b(JSONReader jSONReader) {
        return jSONReader.T();
    }

    @Override // com.alibaba.fastjson2.reader.bj, com.alibaba.fastjson2.reader.d
    public void b(JSONReader jSONReader, T t) {
        Integer T = jSONReader.T();
        try {
            Method method = this.g;
            Object[] objArr = new Object[1];
            objArr[0] = T == null ? null : Short.valueOf(T.shortValue());
            method.invoke(t, objArr);
        } catch (Exception e) {
            throw new JSONException(jSONReader.d("set " + this.b + " error"), e);
        }
    }
}
