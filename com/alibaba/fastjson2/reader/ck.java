package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONReader;
import java.lang.reflect.Type;
import tb.kge;

/* loaded from: classes2.dex */
public final class ck extends em<Byte> {
    public static final long HASH_TYPE;

    /* renamed from: a  reason: collision with root package name */
    static final ck f2968a;

    static {
        kge.a(2084928148);
        f2968a = new ck();
        HASH_TYPE = com.alibaba.fastjson2.util.c.b("B");
    }

    ck() {
        super(Byte.class);
    }

    @Override // com.alibaba.fastjson2.reader.em, com.alibaba.fastjson2.reader.bu
    public /* bridge */ /* synthetic */ Class bm_() {
        return super.bm_();
    }

    @Override // com.alibaba.fastjson2.reader.em, com.alibaba.fastjson2.reader.bu
    /* renamed from: e */
    public Byte b(JSONReader jSONReader, Type type, Object obj, long j) {
        Integer T = jSONReader.T();
        if (T == null) {
            return null;
        }
        return Byte.valueOf(T.byteValue());
    }

    @Override // com.alibaba.fastjson2.reader.bu
    /* renamed from: f */
    public Byte a(JSONReader jSONReader, Type type, Object obj, long j) {
        Integer T = jSONReader.T();
        if (T == null) {
            return null;
        }
        return Byte.valueOf(T.byteValue());
    }
}
