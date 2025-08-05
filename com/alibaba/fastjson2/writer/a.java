package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import tb.kge;

/* loaded from: classes2.dex */
final class a<T> extends FieldWriter<T> {
    static {
        kge.a(-854244714);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public a(String str, int i, long j, String str2, String str3, Field field) {
        super(str, i, j, str2, str3, BigDecimal.class, BigDecimal.class, field, null);
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public void a(JSONWriter jSONWriter, T t) {
        jSONWriter.a((BigDecimal) a((a<T>) t), this.d, this.g);
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public boolean b(JSONWriter jSONWriter, T t) {
        BigDecimal bigDecimal = (BigDecimal) a((a<T>) t);
        if (bigDecimal == null && ((this.d | jSONWriter.e()) & JSONWriter.Feature.WriteNulls.mask) == 0) {
            return false;
        }
        a(jSONWriter);
        jSONWriter.a(bigDecimal, this.d, this.g);
        return true;
    }
}
