package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Field;
import tb.kge;

/* loaded from: classes2.dex */
class as<T> extends d<T> {
    final long v;

    static {
        kge.a(1973445604);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public as(String str, Class cls, int i, String str2, Integer num, Field field) {
        super(str, cls, cls, i, 0L, str2, null, num, null, field);
        this.v = com.alibaba.fastjson2.util.e.UNSAFE.objectFieldOffset(field);
    }

    @Override // com.alibaba.fastjson2.reader.d
    public void a(JSONReader jSONReader, T t) {
        a((as<T>) t, jSONReader.R());
    }

    @Override // com.alibaba.fastjson2.reader.d
    public void a(T t, double d) {
        a((as<T>) t, Integer.valueOf((int) d));
    }

    @Override // com.alibaba.fastjson2.reader.d
    public void a(T t, float f) {
        a((as<T>) t, Integer.valueOf((int) f));
    }

    @Override // com.alibaba.fastjson2.reader.d
    public void a(T t, long j) {
        com.alibaba.fastjson2.util.e.UNSAFE.putInt(t, this.v, (int) j);
    }

    @Override // com.alibaba.fastjson2.reader.d
    public void a(T t, Object obj) {
        com.alibaba.fastjson2.util.e.UNSAFE.putInt(t, this.v, TypeUtils.l(obj));
    }

    @Override // com.alibaba.fastjson2.reader.d
    public Object b(JSONReader jSONReader) {
        return Integer.valueOf(jSONReader.R());
    }

    @Override // com.alibaba.fastjson2.reader.d
    public void b(JSONReader jSONReader, T t) {
        com.alibaba.fastjson2.util.e.UNSAFE.putInt(t, this.v, jSONReader.R());
    }
}
