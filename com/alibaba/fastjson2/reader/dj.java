package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONReader;
import java.lang.reflect.Type;
import tb.kge;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class dj extends em<Long> {

    /* renamed from: a  reason: collision with root package name */
    static final dj f2992a;

    static {
        kge.a(214398689);
        f2992a = new dj();
    }

    dj() {
        super(Long.class);
    }

    @Override // com.alibaba.fastjson2.reader.em, com.alibaba.fastjson2.reader.bu
    /* renamed from: e */
    public Long b(JSONReader jSONReader, Type type, Object obj, long j) {
        return jSONReader.Z();
    }

    @Override // com.alibaba.fastjson2.reader.bu
    /* renamed from: f */
    public Long a(JSONReader jSONReader, Type type, Object obj, long j) {
        return jSONReader.Z();
    }
}
