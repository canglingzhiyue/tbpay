package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONReader;
import java.lang.reflect.Type;
import tb.kge;

/* loaded from: classes2.dex */
public final class dd<T> extends em<T> {

    /* renamed from: a  reason: collision with root package name */
    final com.alibaba.fastjson2.function.d<String, T> f2986a;

    static {
        kge.a(-1188479769);
    }

    public dd(Class<T> cls, com.alibaba.fastjson2.function.d<String, T> dVar) {
        super(cls);
        this.f2986a = dVar;
    }

    @Override // com.alibaba.fastjson2.reader.bu
    public T a(JSONReader jSONReader, Type type, Object obj, long j) {
        String az = jSONReader.az();
        if (az == null) {
            return null;
        }
        return this.f2986a.apply(az);
    }

    @Override // com.alibaba.fastjson2.reader.em, com.alibaba.fastjson2.reader.bu
    public T b(JSONReader jSONReader, Type type, Object obj, long j) {
        String az = jSONReader.az();
        if (az == null || az.isEmpty()) {
            return null;
        }
        return this.f2986a.apply(az);
    }

    @Override // com.alibaba.fastjson2.reader.em, com.alibaba.fastjson2.reader.bu
    public /* bridge */ /* synthetic */ Class bm_() {
        return super.bm_();
    }
}
