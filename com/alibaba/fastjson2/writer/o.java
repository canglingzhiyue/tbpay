package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Date;
import tb.kge;

/* loaded from: classes2.dex */
final class o<T> extends FieldWriterDate<T> {
    static {
        kge.a(1806855362);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public o(String str, int i, long j, String str2, String str3, Class cls, Method method) {
        super(str, i, j, str2, str3, cls, cls, null, method);
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public Object a(Object obj) {
        try {
            return this.j.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
            throw new JSONException("invoke getter method error, " + this.f3039a, e);
        }
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public void a(JSONWriter jSONWriter, T t) {
        Date date = (Date) a(t);
        if (date == null) {
            jSONWriter.n();
        } else {
            a(jSONWriter, false, date.getTime());
        }
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public boolean b(JSONWriter jSONWriter, T t) {
        Date date = (Date) a(t);
        if (date != null) {
            b(jSONWriter, date.getTime());
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
