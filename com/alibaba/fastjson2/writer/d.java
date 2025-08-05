package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Field;
import java.math.BigInteger;
import tb.kge;

/* loaded from: classes2.dex */
final class d<T> extends FieldWriter<T> {
    static {
        kge.a(-2017382600);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public d(String str, int i, long j, String str2, String str3, Field field) {
        super(str, i, j, str2, str3, BigInteger.class, BigInteger.class, field, null);
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public void a(JSONWriter jSONWriter, T t) {
        jSONWriter.a((BigInteger) a((d<T>) t), this.d);
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public boolean b(JSONWriter jSONWriter, T t) {
        BigInteger bigInteger = (BigInteger) a((d<T>) t);
        if (bigInteger == null && ((this.d | jSONWriter.e()) & JSONWriter.Feature.WriteNulls.mask) == 0) {
            return false;
        }
        a(jSONWriter);
        jSONWriter.a(bigInteger, this.d);
        return true;
    }
}
