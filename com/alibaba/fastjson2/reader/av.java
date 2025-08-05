package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Method;
import java.util.Locale;
import tb.kge;

/* loaded from: classes2.dex */
final class av<T> extends bj<T> {
    static {
        kge.a(243005787);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public av(String str, int i, long j, String str2, Locale locale, Long l, Method method) {
        super(str, Long.class, Long.class, i, j, str2, locale, l, method, null, null);
    }

    @Override // com.alibaba.fastjson2.reader.bj, com.alibaba.fastjson2.reader.d
    public void a(JSONReader jSONReader, T t) {
        try {
            this.g.invoke(t, jSONReader.Z());
        } catch (Exception e) {
            throw new JSONException(jSONReader.d("set " + this.b + " error"), e);
        }
    }

    @Override // com.alibaba.fastjson2.reader.bj, com.alibaba.fastjson2.reader.d
    public void a(T t, Object obj) {
        try {
            this.g.invoke(t, TypeUtils.e(obj));
        } catch (Exception e) {
            throw new JSONException("set " + this.b + " error", e);
        }
    }

    @Override // com.alibaba.fastjson2.reader.bj, com.alibaba.fastjson2.reader.d
    public void b(JSONReader jSONReader, T t) {
        try {
            this.g.invoke(t, jSONReader.Z());
        } catch (Exception e) {
            throw new JSONException(jSONReader.d("set " + this.b + " error"), e);
        }
    }
}
