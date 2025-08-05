package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import tb.kge;

/* loaded from: classes2.dex */
final class be<T> extends FieldWriter<T> {
    static {
        kge.a(-1127649755);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public be(String str, int i, String str2, String str3, long j, Method method) {
        super(str, i, j, str2, str3, String.class, String.class, null, method);
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
        String str = (String) a(t);
        if (this.u && str != null) {
            str = str.trim();
        }
        if (this.t && jSONWriter.e) {
            jSONWriter.e(str);
        } else if (this.v) {
            jSONWriter.a(str);
        } else {
            jSONWriter.d(str);
        }
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public boolean b(JSONWriter jSONWriter, T t) {
        try {
            String str = (String) a(t);
            if (str == null && ((this.d | jSONWriter.e()) & (JSONWriter.Feature.WriteNulls.mask | JSONWriter.Feature.NullAsDefaultValue.mask | JSONWriter.Feature.WriteNullStringAsEmpty.mask)) == 0) {
                return false;
            }
            if (this.u && str != null) {
                str = str.trim();
            }
            a(jSONWriter, str);
            return true;
        } catch (JSONException e) {
            if ((jSONWriter.c(this.d) | JSONWriter.Feature.IgnoreNonFieldGetter.mask) == 0) {
                throw e;
            }
            return false;
        }
    }
}
