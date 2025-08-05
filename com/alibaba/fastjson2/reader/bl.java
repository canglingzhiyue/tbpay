package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader;
import java.lang.reflect.Type;
import java.util.Locale;
import tb.kge;

/* loaded from: classes2.dex */
class bl<T> extends bj<T> {
    final String v;
    final long w;

    static {
        kge.a(1471363003);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public bl(String str, Type type, Class cls, String str2, int i, long j, String str3, Locale locale, Object obj) {
        super(str, type, cls, i, j, str3, locale, obj, null, null, null);
        this.v = str2;
        this.w = com.alibaba.fastjson2.util.c.b(str2);
    }

    @Override // com.alibaba.fastjson2.reader.bj, com.alibaba.fastjson2.reader.d
    public void a(T t, Object obj) {
    }

    @Override // com.alibaba.fastjson2.reader.bj, com.alibaba.fastjson2.reader.d
    public void b(JSONReader jSONReader, T t) {
        throw new JSONException("UnsupportedOperationException");
    }
}
