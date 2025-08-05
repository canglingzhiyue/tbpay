package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Method;
import tb.kge;

/* loaded from: classes2.dex */
final class ac<T> extends bj<T> {
    static {
        kge.a(613497477);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ac(String str, int i, long j, String str2, Double d, Method method) {
        super(str, Double.class, Double.class, i, j, str2, null, d, method, null, null);
    }

    @Override // com.alibaba.fastjson2.reader.bj, com.alibaba.fastjson2.reader.d
    public void a(T t, Object obj) {
        try {
            this.g.invoke(t, TypeUtils.r(obj));
        } catch (Exception e) {
            throw new JSONException("set " + this.b + " error", e);
        }
    }

    @Override // com.alibaba.fastjson2.reader.bj, com.alibaba.fastjson2.reader.d
    public void b(JSONReader jSONReader, T t) {
        Double ad = jSONReader.ad();
        if (ad != null || this.j == null) {
            try {
                this.g.invoke(t, ad);
            } catch (Exception e) {
                throw new JSONException(jSONReader.d("set " + this.b + " error"), e);
            }
        }
    }
}
