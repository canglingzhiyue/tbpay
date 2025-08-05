package com.alibaba.fastjson.serializer;

import tb.kge;

/* loaded from: classes2.dex */
public abstract class AfterFilter implements SerializeFilter {
    private static final Character COMMA;
    private static final ThreadLocal<Character> seperatorLocal;
    private static final ThreadLocal<JSONSerializer> serializerLocal;

    static {
        kge.a(1996735809);
        kge.a(-1982520123);
        serializerLocal = new ThreadLocal<>();
        seperatorLocal = new ThreadLocal<>();
        COMMA = ',';
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final char writeAfter(JSONSerializer jSONSerializer, Object obj, char c) {
        serializerLocal.set(jSONSerializer);
        seperatorLocal.set(Character.valueOf(c));
        writeAfter(obj);
        serializerLocal.set(null);
        return seperatorLocal.get().charValue();
    }

    public abstract void writeAfter(Object obj);

    protected final void writeKeyValue(String str, Object obj) {
        char charValue = seperatorLocal.get().charValue();
        serializerLocal.get().writeKeyValue(charValue, str, obj);
        if (charValue != ',') {
            seperatorLocal.set(COMMA);
        }
    }
}
