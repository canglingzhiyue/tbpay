package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONReader;
import java.lang.reflect.Type;
import tb.kge;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class cr extends em {

    /* renamed from: a  reason: collision with root package name */
    static final cr f2973a;

    static {
        kge.a(-2085723555);
        f2973a = new cr();
    }

    cr() {
        super(Double.class);
    }

    @Override // com.alibaba.fastjson2.reader.bu
    public Object a(JSONReader jSONReader, Type type, Object obj, long j) {
        return jSONReader.ad();
    }

    @Override // com.alibaba.fastjson2.reader.em, com.alibaba.fastjson2.reader.bu
    public Object b(JSONReader jSONReader, Type type, Object obj, long j) {
        return jSONReader.ad();
    }
}
