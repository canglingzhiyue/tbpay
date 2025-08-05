package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Locale;
import tb.kge;

/* loaded from: classes2.dex */
final class bp<T> extends bj<T> {
    final boolean v;

    static {
        kge.a(-352129339);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public bp(String str, Type type, Class cls, int i, long j, String str2, Locale locale, String str3, Method method) {
        super(str, type, cls, i, j, str2, locale, str3, method, null, null);
        this.v = "trim".equals(str2) || (j & JSONReader.Feature.TrimString.mask) != 0;
    }

    @Override // com.alibaba.fastjson2.reader.bj, com.alibaba.fastjson2.reader.d
    public void a(T t, Object obj) {
        String obj2 = ((obj instanceof String) || obj == null) ? (String) obj : obj.toString();
        if (this.v && obj2 != null) {
            obj2 = obj2.trim();
        }
        try {
            this.g.invoke(t, obj2);
        } catch (Exception e) {
            throw new JSONException("set " + this.b + " error", e);
        }
    }

    @Override // com.alibaba.fastjson2.reader.d
    public boolean a(Class cls) {
        return true;
    }

    @Override // com.alibaba.fastjson2.reader.bj, com.alibaba.fastjson2.reader.d
    public void b(JSONReader jSONReader, T t) {
        String az = jSONReader.az();
        if (this.v && az != null) {
            az = az.trim();
        }
        try {
            this.g.invoke(t, az);
        } catch (Exception e) {
            throw new JSONException(jSONReader.d("set " + this.b + " error"), e);
        }
    }

    @Override // com.alibaba.fastjson2.reader.bj, com.alibaba.fastjson2.reader.d
    /* renamed from: d */
    public String b(JSONReader jSONReader) {
        String az = jSONReader.az();
        return (!this.v || az == null) ? az : az.trim();
    }
}
