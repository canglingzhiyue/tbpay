package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONReader;
import java.lang.reflect.Type;
import tb.kge;

/* loaded from: classes2.dex */
public final class db<T> extends em<T> {

    /* renamed from: a  reason: collision with root package name */
    final com.alibaba.fastjson2.function.e<T> f2984a;

    static {
        kge.a(1622727385);
    }

    public db(Class<T> cls, com.alibaba.fastjson2.function.e eVar) {
        super(cls);
        this.f2984a = eVar;
    }

    @Override // com.alibaba.fastjson2.reader.bu
    public T a(JSONReader jSONReader, Type type, Object obj, long j) {
        if (jSONReader.g()) {
            return null;
        }
        return this.f2984a.apply(jSONReader.R());
    }

    @Override // com.alibaba.fastjson2.reader.em, com.alibaba.fastjson2.reader.bu
    public T b(JSONReader jSONReader, Type type, Object obj, long j) {
        if (jSONReader.g()) {
            return null;
        }
        return this.f2984a.apply(jSONReader.R());
    }

    @Override // com.alibaba.fastjson2.reader.em, com.alibaba.fastjson2.reader.bu
    public /* bridge */ /* synthetic */ Class bm_() {
        return super.bm_();
    }
}
