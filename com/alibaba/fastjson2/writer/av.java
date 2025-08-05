package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import tb.kge;

/* loaded from: classes2.dex */
final class av<T> extends FieldWriterDate<T> {
    static {
        kge.a(-1622840166);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public av(String str, int i, long j, String str2, String str3, Class cls, Method method) {
        super(str, i, j, str2, str3, cls, cls, null, method);
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
        a(jSONWriter, false, ((Long) a((av<T>) t)).longValue());
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public boolean b(JSONWriter jSONWriter, T t) {
        b(jSONWriter, ((Long) a((av<T>) t)).longValue());
        return true;
    }
}
