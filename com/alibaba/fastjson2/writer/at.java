package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.List;
import tb.kge;

/* loaded from: classes2.dex */
final class at<T> extends FieldWriter<T> {
    final com.alibaba.fastjson2.function.d<T, List> z;

    static {
        kge.a(751568356);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public at(String str, int i, long j, String str2, String str3, Method method, com.alibaba.fastjson2.function.d<T, List> dVar, Type type, Class cls) {
        super(str, i, j, str2, str3, type, cls, null, method);
        this.z = dVar;
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public Object a(T t) {
        return this.z.apply(t);
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public void a(JSONWriter jSONWriter, T t) {
        List apply = this.z.apply(t);
        if (apply == null) {
            jSONWriter.n();
            return;
        }
        int i = 0;
        if (jSONWriter.e) {
            int size = apply.size();
            jSONWriter.c(size);
            while (i < size) {
                String str = (String) apply.get(i);
                if (str == null) {
                    jSONWriter.n();
                } else {
                    jSONWriter.d(str);
                }
                i++;
            }
            return;
        }
        jSONWriter.j();
        while (i < apply.size()) {
            if (i != 0) {
                jSONWriter.l();
            }
            String str2 = (String) apply.get(i);
            if (str2 == null) {
                jSONWriter.n();
            } else {
                jSONWriter.d(str2);
            }
            i++;
        }
        jSONWriter.k();
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public boolean b(JSONWriter jSONWriter, T t) {
        int i = 0;
        try {
            List apply = this.z.apply(t);
            long e = this.d | jSONWriter.e();
            if (apply == null) {
                if ((e & (JSONWriter.Feature.WriteNulls.mask | JSONWriter.Feature.NullAsDefaultValue.mask | JSONWriter.Feature.WriteNullListAsEmpty.mask)) == 0) {
                    return false;
                }
                a(jSONWriter);
                jSONWriter.p();
                return true;
            } else if ((e & JSONWriter.Feature.NotWriteEmptyArray.mask) != 0 && apply.isEmpty()) {
                return false;
            } else {
                a(jSONWriter);
                if (jSONWriter.e) {
                    int size = apply.size();
                    jSONWriter.c(size);
                    while (i < size) {
                        String str = (String) apply.get(i);
                        if (str == null) {
                            jSONWriter.n();
                        } else {
                            jSONWriter.d(str);
                        }
                        i++;
                    }
                    return true;
                }
                jSONWriter.j();
                while (i < apply.size()) {
                    if (i != 0) {
                        jSONWriter.l();
                    }
                    String str2 = (String) apply.get(i);
                    if (str2 == null) {
                        jSONWriter.n();
                    } else {
                        jSONWriter.d(str2);
                    }
                    i++;
                }
                jSONWriter.k();
                return true;
            }
        } catch (RuntimeException e2) {
            if (!jSONWriter.f()) {
                throw e2;
            }
            return false;
        }
    }
}
