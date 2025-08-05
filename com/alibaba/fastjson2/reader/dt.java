package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONReader;
import java.lang.reflect.Type;
import java.util.Locale;
import tb.kge;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class dt extends em {

    /* renamed from: a  reason: collision with root package name */
    static final dt f3001a;

    static {
        kge.a(-1857227546);
        f3001a = new dt();
    }

    dt() {
        super(Locale.class);
    }

    @Override // com.alibaba.fastjson2.reader.bu
    public Object a(JSONReader jSONReader, Type type, Object obj, long j) {
        String az = jSONReader.az();
        if (az == null || az.isEmpty()) {
            return null;
        }
        String[] split = az.split("_");
        return split.length == 1 ? new Locale(split[0]) : split.length == 2 ? new Locale(split[0], split[1]) : new Locale(split[0], split[1], split[2]);
    }

    @Override // com.alibaba.fastjson2.reader.em, com.alibaba.fastjson2.reader.bu
    public Object b(JSONReader jSONReader, Type type, Object obj, long j) {
        String az = jSONReader.az();
        if (az == null || az.isEmpty()) {
            return null;
        }
        String[] split = az.split("_");
        return split.length == 1 ? new Locale(split[0]) : split.length == 2 ? new Locale(split[0], split[1]) : new Locale(split[0], split[1], split[2]);
    }
}
