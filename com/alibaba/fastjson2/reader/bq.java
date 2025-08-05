package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONReader;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Locale;
import tb.kge;

/* loaded from: classes2.dex */
final class bq extends bj {
    static {
        kge.a(-661750514);
    }

    public bq(String str, Type type, Class cls, int i, long j, String str2, Locale locale, Object obj, Method method, Field field, com.alibaba.fastjson2.function.a aVar) {
        super(str, type, cls, i, j, str2, locale, obj, method, field, aVar);
        this.y = eg.f3012a;
    }

    @Override // com.alibaba.fastjson2.reader.bj, com.alibaba.fastjson2.reader.d
    public bu a(JSONReader.c cVar) {
        return this.y;
    }

    @Override // com.alibaba.fastjson2.reader.bj, com.alibaba.fastjson2.reader.d
    public bu a(JSONReader jSONReader) {
        return this.y;
    }

    @Override // com.alibaba.fastjson2.reader.bj, com.alibaba.fastjson2.reader.d
    public void b(JSONReader jSONReader, Object obj) {
        a((bq) obj, (Object) jSONReader.ah());
    }
}
