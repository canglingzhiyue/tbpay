package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.UUID;
import tb.kge;

/* loaded from: classes2.dex */
final class bf<T> extends ay<T> {
    final com.alibaba.fastjson2.function.d I;

    static {
        kge.a(412879954);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public bf(String str, int i, long j, String str2, String str3, Type type, Class cls, Method method, com.alibaba.fastjson2.function.d dVar) {
        super(str, i, j, str2, str3, type, cls, null, method);
        this.I = dVar;
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public Object a(Object obj) {
        return this.I.apply(obj);
    }

    @Override // com.alibaba.fastjson2.writer.ay, com.alibaba.fastjson2.writer.FieldWriterObject, com.alibaba.fastjson2.writer.FieldWriter
    public boolean b(JSONWriter jSONWriter, T t) {
        UUID uuid = (UUID) this.I.apply(t);
        if (uuid == null) {
            if (((this.d | jSONWriter.e()) & JSONWriter.Feature.WriteNulls.mask) == 0) {
                return false;
            }
            a(jSONWriter);
            jSONWriter.n();
            return true;
        }
        a(jSONWriter);
        if (this.G == null) {
            this.G = a(jSONWriter, UUID.class);
        }
        if (this.G != dq.f3095a) {
            this.G.a(jSONWriter, uuid, this.f3039a, this.F, this.d);
        } else {
            jSONWriter.a(uuid);
        }
        return true;
    }
}
