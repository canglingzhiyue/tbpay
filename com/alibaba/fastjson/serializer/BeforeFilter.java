package com.alibaba.fastjson.serializer;

import tb.kge;

/* loaded from: classes2.dex */
public abstract class BeforeFilter implements SerializeFilter {
    private static final Character COMMA;
    private static final ThreadLocal<Character> seperatorLocal;
    private static final ThreadLocal<JSONSerializer> serializerLocal;

    static {
        kge.a(1994643626);
        kge.a(-1982520123);
        serializerLocal = new ThreadLocal<>();
        seperatorLocal = new ThreadLocal<>();
        COMMA = ',';
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final char writeBefore(JSONSerializer jSONSerializer, Object obj, char c) {
        serializerLocal.set(jSONSerializer);
        seperatorLocal.set(Character.valueOf(c));
        writeBefore(obj);
        serializerLocal.set(null);
        return seperatorLocal.get().charValue();
    }

    public abstract void writeBefore(Object obj);

    protected final void writeKeyValue(String str, Object obj) {
        char charValue = seperatorLocal.get().charValue();
        serializerLocal.get().writeKeyValue(charValue, str, obj);
        if (charValue != ',') {
            seperatorLocal.set(COMMA);
        }
    }
}
