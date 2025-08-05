package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import tb.kge;

/* loaded from: classes2.dex */
class q<T> extends FieldWriter<T> {
    static {
        kge.a(-162022939);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public q(String str, int i, long j, String str2, String str3, Type type, Class cls, Method method) {
        super(str, i, j, str2, str3, type, cls, null, method);
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
        Double d = (Double) a(t);
        if (d == null) {
            jSONWriter.q();
            return;
        }
        double doubleValue = d.doubleValue();
        if (this.g != null) {
            jSONWriter.a(doubleValue, this.g);
        } else {
            jSONWriter.a(doubleValue);
        }
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public boolean b(JSONWriter jSONWriter, T t) {
        try {
            Double d = (Double) a(t);
            a(jSONWriter);
            if (d == null) {
                jSONWriter.q();
                return true;
            }
            double doubleValue = d.doubleValue();
            if (this.g != null) {
                jSONWriter.a(doubleValue, this.g);
                return true;
            }
            jSONWriter.a(doubleValue);
            return true;
        } catch (RuntimeException e) {
            if (!jSONWriter.f()) {
                throw e;
            }
            return false;
        }
    }
}
