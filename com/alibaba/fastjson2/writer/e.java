package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Method;
import java.math.BigInteger;
import tb.kge;

/* loaded from: classes2.dex */
final class e<T> extends FieldWriter<T> {
    final com.alibaba.fastjson2.function.d<T, BigInteger> z;

    static {
        kge.a(1320408262);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(String str, int i, long j, String str2, String str3, Method method, com.alibaba.fastjson2.function.d<T, BigInteger> dVar) {
        super(str, i, j, str2, str3, BigInteger.class, BigInteger.class, null, method);
        this.z = dVar;
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public Object a(T t) {
        return this.z.apply(t);
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public void a(JSONWriter jSONWriter, T t) {
        jSONWriter.a((BigInteger) a((e<T>) t), this.d);
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public boolean b(JSONWriter jSONWriter, T t) {
        BigInteger apply = this.z.apply(t);
        if (apply == null && ((this.d | jSONWriter.e()) & JSONWriter.Feature.WriteNulls.mask) == 0) {
            return false;
        }
        a(jSONWriter);
        jSONWriter.a(apply, this.d);
        return true;
    }
}
