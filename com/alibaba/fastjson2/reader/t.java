package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Locale;
import tb.kge;

/* loaded from: classes2.dex */
final class t<T> extends bj<T> {
    static {
        kge.a(732201886);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public t(String str, Type type, Class cls, int i, long j, String str2, Locale locale, Boolean bool, Method method) {
        super(str, type, cls, i, j, str2, locale, bool, method, null, null);
    }

    @Override // com.alibaba.fastjson2.reader.bj, com.alibaba.fastjson2.reader.d
    public void a(T t, Object obj) {
        try {
            this.g.invoke(t, TypeUtils.n(obj));
        } catch (Exception e) {
            throw new JSONException("set " + this.b + " error", e);
        }
    }

    @Override // com.alibaba.fastjson2.reader.bj, com.alibaba.fastjson2.reader.d
    public void b(JSONReader jSONReader, T t) {
        try {
            this.g.invoke(t, jSONReader.aK());
        } catch (Exception e) {
            throw new JSONException(jSONReader.d("set " + this.b + " error"), e);
        }
    }
}
