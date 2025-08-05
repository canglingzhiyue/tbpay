package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import tb.kge;

/* loaded from: classes2.dex */
abstract class g extends i {
    static {
        kge.a(1111276068);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(String str, int i, long j, String str2, String str3, Type type, Class cls, Field field, Method method) {
        super(str, i, j, str2, str3, type, cls, field, method);
    }

    @Override // com.alibaba.fastjson2.writer.i, com.alibaba.fastjson2.writer.FieldWriter
    public boolean b(JSONWriter jSONWriter, Object obj) {
        try {
            boolean booleanValue = ((Boolean) a((g) obj)).booleanValue();
            if (!booleanValue && ((this.d | jSONWriter.e()) & JSONWriter.Feature.NotWriteDefaultValue.mask) != 0) {
                return false;
            }
            a(jSONWriter, booleanValue);
            return true;
        } catch (RuntimeException e) {
            if (!jSONWriter.f()) {
                throw e;
            }
            return false;
        }
    }
}
