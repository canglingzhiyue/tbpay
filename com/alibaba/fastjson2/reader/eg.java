package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONReader;
import java.lang.reflect.Type;
import java.util.UUID;
import tb.kge;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class eg extends em {

    /* renamed from: a  reason: collision with root package name */
    static final eg f3012a;

    static {
        kge.a(2085458215);
        f3012a = new eg();
    }

    public eg() {
        super(UUID.class);
    }

    @Override // com.alibaba.fastjson2.reader.bu
    public Object a(JSONReader jSONReader, Type type, Object obj, long j) {
        return jSONReader.ah();
    }

    @Override // com.alibaba.fastjson2.reader.em, com.alibaba.fastjson2.reader.bu
    public Object b(JSONReader jSONReader, Type type, Object obj, long j) {
        return jSONReader.ah();
    }
}
