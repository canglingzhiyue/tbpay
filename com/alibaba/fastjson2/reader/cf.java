package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONReader;
import java.lang.reflect.Type;
import java.util.concurrent.atomic.AtomicReference;
import tb.kge;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class cf extends em {

    /* renamed from: a  reason: collision with root package name */
    static final cf f2963a;
    final Type b;

    static {
        kge.a(1315766356);
        f2963a = new cf(Object.class);
    }

    public cf(Type type) {
        super(AtomicReference.class);
        this.b = type;
    }

    @Override // com.alibaba.fastjson2.reader.bu
    public Object a(JSONReader jSONReader, Type type, Object obj, long j) {
        if (jSONReader.g()) {
            return null;
        }
        return new AtomicReference(jSONReader.b(this.b));
    }

    @Override // com.alibaba.fastjson2.reader.em, com.alibaba.fastjson2.reader.bu
    public Object b(JSONReader jSONReader, Type type, Object obj, long j) {
        if (jSONReader.g()) {
            return null;
        }
        return new AtomicReference(jSONReader.b(this.b));
    }
}
