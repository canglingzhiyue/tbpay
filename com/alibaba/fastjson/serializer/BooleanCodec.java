package com.alibaba.fastjson.serializer;

import com.alibaba.fastjson.parser.deserializer.ObjectDeserializer;
import java.io.IOException;
import java.lang.reflect.Type;
import tb.kge;

/* loaded from: classes.dex */
public final class BooleanCodec implements ObjectDeserializer, ObjectSerializer {
    public static final BooleanCodec instance;

    static {
        kge.a(1237174689);
        kge.a(1456819588);
        kge.a(-1627011960);
        instance = new BooleanCodec();
    }

    private BooleanCodec() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
        if (r3 == 1) goto L4;
     */
    @Override // com.alibaba.fastjson.parser.deserializer.ObjectDeserializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public <T> T deserialze(com.alibaba.fastjson.parser.DefaultJSONParser r3, java.lang.reflect.Type r4, java.lang.Object r5) {
        /*
            r2 = this;
            com.alibaba.fastjson.parser.JSONLexer r4 = r3.lexer
            int r5 = r4.token()
            r0 = 16
            r1 = 6
            if (r5 != r1) goto L11
            r4.nextToken(r0)
        Le:
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            goto L34
        L11:
            r1 = 7
            if (r5 != r1) goto L1a
            r4.nextToken(r0)
        L17:
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            goto L34
        L1a:
            r1 = 2
            if (r5 != r1) goto L28
            int r3 = r4.intValue()
            r4.nextToken(r0)
            r4 = 1
            if (r3 != r4) goto L17
            goto Le
        L28:
            java.lang.Object r3 = r3.parse()
            if (r3 != 0) goto L30
            r3 = 0
            return r3
        L30:
            java.lang.Boolean r3 = com.alibaba.fastjson.util.TypeUtils.castToBoolean(r3)
        L34:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.serializer.BooleanCodec.deserialze(com.alibaba.fastjson.parser.DefaultJSONParser, java.lang.reflect.Type, java.lang.Object):java.lang.Object");
    }

    @Override // com.alibaba.fastjson.serializer.ObjectSerializer
    public void write(JSONSerializer jSONSerializer, Object obj, Object obj2, Type type) throws IOException {
        SerializeWriter serializeWriter = jSONSerializer.out;
        Boolean bool = (Boolean) obj;
        if (bool == null) {
            if ((serializeWriter.features & SerializerFeature.WriteNullBooleanAsFalse.mask) != 0) {
                serializeWriter.write("false");
            } else {
                serializeWriter.writeNull();
            }
        } else if (bool.booleanValue()) {
            serializeWriter.write("true");
        } else {
            serializeWriter.write("false");
        }
    }
}
