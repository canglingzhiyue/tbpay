package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Method;
import java.util.Date;
import tb.kge;

/* loaded from: classes2.dex */
final class n<T> extends FieldWriterDate<T> {
    final com.alibaba.fastjson2.function.d<T, Date> z;

    static {
        kge.a(-123452699);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public n(String str, int i, long j, String str2, String str3, Method method, com.alibaba.fastjson2.function.d<T, Date> dVar) {
        super(str, i, j, str2, str3, Date.class, Date.class, null, method);
        this.z = dVar;
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public Object a(T t) {
        return this.z.apply(t);
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public void a(JSONWriter jSONWriter, T t) {
        Date apply = this.z.apply(t);
        if (apply == null) {
            jSONWriter.n();
        } else {
            a(jSONWriter, false, apply.getTime());
        }
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public boolean b(JSONWriter jSONWriter, T t) {
        Date apply = this.z.apply(t);
        if (apply != null) {
            b(jSONWriter, apply.getTime());
            return true;
        } else if (((this.d | jSONWriter.e()) & JSONWriter.Feature.WriteNulls.mask) == 0) {
            return false;
        } else {
            a(jSONWriter);
            jSONWriter.n();
            return true;
        }
    }
}
