package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONReader;
import java.lang.reflect.Type;
import tb.kge;

/* loaded from: classes2.dex */
public final class da<T> extends em<T> {

    /* renamed from: a  reason: collision with root package name */
    final com.alibaba.fastjson2.function.d<Boolean, T> f2983a;

    static {
        kge.a(-536663534);
    }

    public da(Class<T> cls, com.alibaba.fastjson2.function.d<Boolean, T> dVar) {
        super(cls);
        this.f2983a = dVar;
    }

    @Override // com.alibaba.fastjson2.reader.bu
    public T a(JSONReader jSONReader, Type type, Object obj, long j) {
        if (jSONReader.g()) {
            return null;
        }
        return this.f2983a.apply(Boolean.valueOf(jSONReader.aL()));
    }

    @Override // com.alibaba.fastjson2.reader.em, com.alibaba.fastjson2.reader.bu
    public T b(JSONReader jSONReader, Type type, Object obj, long j) {
        if (jSONReader.g()) {
            return null;
        }
        return this.f2983a.apply(Boolean.valueOf(jSONReader.aL()));
    }

    @Override // com.alibaba.fastjson2.reader.em, com.alibaba.fastjson2.reader.bu
    public /* bridge */ /* synthetic */ Class bm_() {
        return super.bm_();
    }
}
