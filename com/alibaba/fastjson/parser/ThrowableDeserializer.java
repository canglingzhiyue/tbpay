package com.alibaba.fastjson.parser;

import tb.kge;

/* loaded from: classes2.dex */
public class ThrowableDeserializer extends JavaBeanDeserializer {
    static {
        kge.a(814438029);
    }

    public ThrowableDeserializer(ParserConfig parserConfig, Class<?> cls) {
        super(parserConfig, cls, cls);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x017c, code lost:
        r0 = (com.alibaba.fastjson.parser.JavaBeanDeserializer) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x017f, code lost:
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0180, code lost:
        if (r0 == null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0182, code lost:
        r2 = r2.entrySet().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x018e, code lost:
        if (r2.hasNext() == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0190, code lost:
        r4 = (java.util.Map.Entry) r2.next();
        r4 = r4.getValue();
        r5 = r0.getFieldDeserializer((java.lang.String) r4.getKey());
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01a4, code lost:
        if (r5 == null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01a6, code lost:
        r5.setValue(r3, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01aa, code lost:
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01ab, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01b3, code lost:
        throw new com.alibaba.fastjson.JSONException("create instance error", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0033, code lost:
        if (java.lang.Throwable.class.isAssignableFrom(r2) != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004c, code lost:
        r3.nextToken(16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00da, code lost:
        if (r10 != null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00dc, code lost:
        r3 = (T) new java.lang.Exception(r11, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00e3, code lost:
        r3 = r10.getConstructors();
        r5 = r3.length;
        r8 = null;
        r13 = null;
        r14 = null;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00ed, code lost:
        if (r7 >= r5) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00ef, code lost:
        r16 = r3[r7];
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00f6, code lost:
        if (r16.getParameterTypes().length != 0) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00f8, code lost:
        r14 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0100, code lost:
        if (r16.getParameterTypes().length != 1) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x010a, code lost:
        if (r16.getParameterTypes()[0] != java.lang.String.class) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x010c, code lost:
        r13 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0115, code lost:
        if (r16.getParameterTypes().length != 2) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x011f, code lost:
        if (r16.getParameterTypes()[0] != java.lang.String.class) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x012a, code lost:
        if (r16.getParameterTypes()[1] != java.lang.Throwable.class) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x012c, code lost:
        r8 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x012e, code lost:
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0132, code lost:
        if (r8 == null) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0134, code lost:
        r3 = r8.newInstance(r11, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0140, code lost:
        r6 = (java.lang.Throwable) r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0144, code lost:
        if (r13 == null) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0146, code lost:
        r3 = r13.newInstance(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0150, code lost:
        if (r14 == null) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0152, code lost:
        r3 = r14.newInstance(new java.lang.Object[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0159, code lost:
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x015a, code lost:
        if (r6 != null) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x015c, code lost:
        r3 = (T) new java.lang.Exception(r11, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0162, code lost:
        r3 = (T) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0163, code lost:
        if (r12 == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0165, code lost:
        ((java.lang.Throwable) r3).setStackTrace(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0168, code lost:
        if (r2 == null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x016a, code lost:
        if (r10 == null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x016e, code lost:
        if (r10 != r17.clazz) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0170, code lost:
        r0 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0172, code lost:
        r0 = r18.config.getDeserializer(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x017a, code lost:
        if ((r0 instanceof com.alibaba.fastjson.parser.JavaBeanDeserializer) == false) goto L49;
     */
    @Override // com.alibaba.fastjson.parser.JavaBeanDeserializer, com.alibaba.fastjson.parser.deserializer.ObjectDeserializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public <T> T deserialze(com.alibaba.fastjson.parser.DefaultJSONParser r18, java.lang.reflect.Type r19, java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 442
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.parser.ThrowableDeserializer.deserialze(com.alibaba.fastjson.parser.DefaultJSONParser, java.lang.reflect.Type, java.lang.Object):java.lang.Object");
    }
}
