package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONReader;
import java.lang.reflect.Type;
import tb.kge;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class cn extends em {

    /* renamed from: a  reason: collision with root package name */
    static final cn f2970a;

    static {
        kge.a(1871886621);
        f2970a = new cn();
    }

    cn() {
        super(Character.class);
    }

    @Override // com.alibaba.fastjson2.reader.bu
    public Object a(JSONReader jSONReader, Type type, Object obj, long j) {
        String az = jSONReader.az();
        if (az == null) {
            return null;
        }
        return Character.valueOf(az.charAt(0));
    }

    @Override // com.alibaba.fastjson2.reader.em, com.alibaba.fastjson2.reader.bu
    public Object b(JSONReader jSONReader, Type type, Object obj, long j) {
        if (jSONReader.g()) {
            return null;
        }
        return Character.valueOf(jSONReader.aD());
    }
}
