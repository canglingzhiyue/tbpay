package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.List;
import tb.kge;

/* loaded from: classes2.dex */
final class ar<T> extends ap<T> {
    final com.alibaba.fastjson2.function.d<T, List> E;

    static {
        kge.a(-570553387);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ar(String str, int i, long j, String str2, String str3, Type type, Method method, com.alibaba.fastjson2.function.d<T, List> dVar, Type type2, Class cls) {
        super(str, type, i, j, str2, str3, type2, cls, null, method);
        this.E = dVar;
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public Object a(T t) {
        return this.E.apply(t);
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public void a(JSONWriter jSONWriter, T t) {
        List apply = this.E.apply(t);
        if (apply == null) {
            jSONWriter.n();
            return;
        }
        int i = 0;
        Class<?> cls = null;
        if (jSONWriter.e) {
            int size = apply.size();
            jSONWriter.c(size);
            bg bgVar = null;
            while (i < size) {
                Object obj = apply.get(i);
                if (obj == null) {
                    jSONWriter.n();
                } else {
                    Class<?> cls2 = obj.getClass();
                    if (cls2 != cls) {
                        bgVar = a(jSONWriter, (Type) cls2);
                        cls = cls2;
                    }
                    bgVar.a(jSONWriter, obj);
                }
                i++;
            }
            return;
        }
        jSONWriter.j();
        bg bgVar2 = null;
        while (i < apply.size()) {
            if (i != 0) {
                jSONWriter.l();
            }
            Object obj2 = apply.get(i);
            if (obj2 == null) {
                jSONWriter.n();
            } else {
                Class<?> cls3 = obj2.getClass();
                if (cls3 != cls) {
                    bgVar2 = a(jSONWriter, (Type) cls3);
                    cls = cls3;
                }
                bgVar2.a(jSONWriter, obj2);
            }
            i++;
        }
        jSONWriter.k();
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public boolean b(JSONWriter jSONWriter, T t) {
        try {
            List apply = this.E.apply(t);
            if (apply == null) {
                if (((this.d | jSONWriter.e()) & (JSONWriter.Feature.WriteNulls.mask | JSONWriter.Feature.NullAsDefaultValue.mask | JSONWriter.Feature.WriteNullListAsEmpty.mask)) == 0) {
                    return false;
                }
                a(jSONWriter);
                jSONWriter.p();
                return true;
            } else if ((this.d & JSONWriter.Feature.NotWriteEmptyArray.mask) != 0 && apply.isEmpty()) {
                return false;
            } else {
                String a2 = jSONWriter.a(this, apply);
                if (a2 != null) {
                    a(jSONWriter);
                    jSONWriter.f(a2);
                    jSONWriter.b((Object) apply);
                    return true;
                }
                if (this.z == String.class) {
                    b(jSONWriter, true, apply);
                } else {
                    a(jSONWriter, true, apply);
                }
                jSONWriter.b((Object) apply);
                return true;
            }
        } catch (RuntimeException e) {
            if (!jSONWriter.f()) {
                throw e;
            }
            return false;
        }
    }
}
