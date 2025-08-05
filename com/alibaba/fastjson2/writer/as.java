package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.List;
import tb.kge;

/* loaded from: classes2.dex */
final class as<T> extends ap<T> {
    static {
        kge.a(1639823794);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public as(String str, Type type, int i, long j, String str2, String str3, Method method, Type type2, Class cls) {
        super(str, type, i, j, str2, str3, type2, cls, null, method);
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
        List list = (List) a(t);
        if (list == null) {
            jSONWriter.n();
        } else {
            a(jSONWriter, false, list);
        }
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public boolean b(JSONWriter jSONWriter, T t) {
        try {
            List<String> list = (List) a(t);
            long e = this.d | jSONWriter.e();
            if (list == null) {
                if ((e & (JSONWriter.Feature.WriteNulls.mask | JSONWriter.Feature.NullAsDefaultValue.mask | JSONWriter.Feature.WriteNullListAsEmpty.mask)) == 0) {
                    return false;
                }
                a(jSONWriter);
                jSONWriter.p();
                return true;
            } else if ((JSONWriter.Feature.NotWriteEmptyArray.mask & e) != 0 && list.isEmpty()) {
                return false;
            } else {
                String a2 = jSONWriter.a(this, list);
                if (a2 != null) {
                    a(jSONWriter);
                    jSONWriter.f(a2);
                    jSONWriter.b((Object) list);
                    return true;
                }
                if (this.z == String.class) {
                    b(jSONWriter, true, list);
                } else {
                    a(jSONWriter, true, (List) list);
                }
                if ((e & JSONWriter.Feature.ReferenceDetection.mask) != 0) {
                    jSONWriter.b((Object) list);
                }
                return true;
            }
        } catch (JSONException e2) {
            if (!jSONWriter.f()) {
                throw e2;
            }
            return false;
        }
    }
}
