package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import tb.kge;

/* loaded from: classes2.dex */
final class b<T> extends FieldWriter<T> {
    final com.alibaba.fastjson2.function.d<T, BigDecimal> z;

    static {
        kge.a(-1828659800);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public b(String str, int i, long j, String str2, String str3, Method method, com.alibaba.fastjson2.function.d<T, BigDecimal> dVar) {
        super(str, i, j, str2, str3, BigDecimal.class, BigDecimal.class, null, method);
        this.z = dVar;
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public Object a(T t) {
        return this.z.apply(t);
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public void a(JSONWriter jSONWriter, T t) {
        jSONWriter.a(this.z.apply(t), this.d, this.g);
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public boolean b(JSONWriter jSONWriter, T t) {
        try {
            BigDecimal apply = this.z.apply(t);
            if (apply == null && ((this.d | jSONWriter.e()) & JSONWriter.Feature.WriteNulls.mask) == 0) {
                return false;
            }
            a(jSONWriter);
            jSONWriter.a(apply, this.d, this.g);
            return true;
        } catch (RuntimeException e) {
            if (!jSONWriter.f()) {
                throw e;
            }
            return false;
        }
    }
}
