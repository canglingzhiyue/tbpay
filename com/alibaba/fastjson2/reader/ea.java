package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONReader;
import java.lang.reflect.Type;
import tb.kge;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class ea extends em {

    /* renamed from: a  reason: collision with root package name */
    static final ea f3007a;

    static {
        kge.a(-1794129451);
        f3007a = new ea();
    }

    public ea() {
        super(Number.class);
    }

    @Override // com.alibaba.fastjson2.reader.bu
    public Object a(JSONReader jSONReader, Type type, Object obj, long j) {
        return jSONReader.ae();
    }

    @Override // com.alibaba.fastjson2.reader.em, com.alibaba.fastjson2.reader.bu
    public Object b(JSONReader jSONReader, Type type, Object obj, long j) {
        return jSONReader.ae();
    }
}
