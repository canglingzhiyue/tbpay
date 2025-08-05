package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Method;
import java.util.Calendar;
import tb.kge;

/* loaded from: classes2.dex */
final class j<T> extends FieldWriterDate<T> {
    final com.alibaba.fastjson2.function.d<T, Calendar> z;

    static {
        kge.a(-1375984395);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(String str, int i, long j, String str2, String str3, Method method, com.alibaba.fastjson2.function.d<T, Calendar> dVar) {
        super(str, i, j, str2, str3, Calendar.class, Calendar.class, null, method);
        this.z = dVar;
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public Object a(T t) {
        return this.z.apply(t);
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public void a(JSONWriter jSONWriter, T t) {
        Calendar apply = this.z.apply(t);
        if (apply == null) {
            jSONWriter.n();
        } else {
            a(jSONWriter, false, apply.getTimeInMillis());
        }
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public boolean b(JSONWriter jSONWriter, T t) {
        Calendar apply = this.z.apply(t);
        if (apply != null) {
            b(jSONWriter, apply.getTimeInMillis());
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
