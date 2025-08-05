package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import tb.kge;

/* loaded from: classes2.dex */
final class c<T> extends FieldWriter<T> {
    static {
        kge.a(-514628923);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public c(String str, int i, long j, String str2, String str3, Method method) {
        super(str, i, j, str2, str3, BigDecimal.class, BigDecimal.class, null, method);
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public Object a(T t) {
        try {
            return this.j.invoke(t, new Object[0]);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
            throw new JSONException("invoke getter method error, " + this.f3039a, e);
        }
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public void a(JSONWriter jSONWriter, T t) {
        jSONWriter.a((BigDecimal) a((c<T>) t), this.d, this.g);
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public boolean b(JSONWriter jSONWriter, T t) {
        try {
            BigDecimal bigDecimal = (BigDecimal) a((c<T>) t);
            if (bigDecimal == null && ((this.d | jSONWriter.e()) & JSONWriter.Feature.WriteNulls.mask) == 0) {
                return false;
            }
            a(jSONWriter);
            jSONWriter.a(bigDecimal, this.d, this.g);
            return true;
        } catch (RuntimeException e) {
            if (!jSONWriter.f()) {
                throw e;
            }
            return false;
        }
    }
}
