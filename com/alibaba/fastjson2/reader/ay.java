package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Field;
import tb.kge;

/* loaded from: classes2.dex */
class ay<T> extends d<T> {
    final long v;

    static {
        kge.a(-1233208957);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ay(String str, Class cls, int i, long j, String str2, Long l, Field field) {
        super(str, cls, cls, i, j, str2, null, l, null, field);
        this.v = com.alibaba.fastjson2.util.e.UNSAFE.objectFieldOffset(field);
    }

    @Override // com.alibaba.fastjson2.reader.d
    public void a(JSONReader jSONReader, T t) {
        b(jSONReader, t);
    }

    @Override // com.alibaba.fastjson2.reader.d
    public void a(T t, double d) {
        a((ay<T>) t, Long.valueOf((long) d));
    }

    @Override // com.alibaba.fastjson2.reader.d
    public void a(T t, float f) {
        a((ay<T>) t, Long.valueOf(f));
    }

    @Override // com.alibaba.fastjson2.reader.d
    public void a(T t, Object obj) {
        com.alibaba.fastjson2.util.e.UNSAFE.putLong(t, this.v, TypeUtils.f(obj));
    }

    @Override // com.alibaba.fastjson2.reader.d
    public Object b(JSONReader jSONReader) {
        return jSONReader.Z();
    }

    @Override // com.alibaba.fastjson2.reader.d
    public void b(JSONReader jSONReader, T t) {
        com.alibaba.fastjson2.util.e.UNSAFE.putLong(t, this.v, jSONReader.Y());
    }
}
