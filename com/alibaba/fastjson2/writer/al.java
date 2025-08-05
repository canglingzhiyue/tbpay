package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import tb.kge;

/* loaded from: classes2.dex */
abstract class al<T> extends FieldWriter<T> {
    static {
        kge.a(250956540);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public al(String str, int i, long j, String str2, String str3, Class cls, Field field, Method method) {
        super(str, i, j, str2, str3, cls, cls, field, method);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(JSONWriter jSONWriter, byte b) {
        if ((jSONWriter.e() & JSONWriter.Feature.WriteNonStringValueAsString.mask) != 0) {
            a(jSONWriter);
            jSONWriter.d(Byte.toString(b));
            return;
        }
        a(jSONWriter);
        jSONWriter.b(b);
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public void a(JSONWriter jSONWriter, T t) {
        Byte b = (Byte) a((al<T>) t);
        if (b == null) {
            jSONWriter.q();
        } else {
            jSONWriter.d((int) b.byteValue());
        }
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public boolean b(JSONWriter jSONWriter, T t) {
        try {
            Byte b = (Byte) a((al<T>) t);
            if (b != null) {
                a(jSONWriter, b.byteValue());
                return true;
            } else if (((this.d | jSONWriter.e()) & JSONWriter.Feature.WriteNulls.mask) == 0) {
                return false;
            } else {
                a(jSONWriter);
                jSONWriter.q();
                return true;
            }
        } catch (RuntimeException e) {
            if (!jSONWriter.f()) {
                throw e;
            }
            return false;
        }
    }
}
