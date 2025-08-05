package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import tb.kge;

/* loaded from: classes2.dex */
abstract class ay<T> extends FieldWriterObject<T> {
    final Type E;
    final Class F;
    volatile bg G;
    final boolean H;

    static {
        kge.a(1021703492);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ay(String str, int i, long j, String str2, String str3, Type type, Class cls, Field field, Method method) {
        super(str, i, j, str2, str3, type, cls, field, method);
        this.E = type;
        this.F = cls;
        this.H = !du.d(cls);
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriterObject, com.alibaba.fastjson2.writer.FieldWriter
    public bg a(JSONWriter jSONWriter, Class cls) {
        if (this.F != cls) {
            return super.a(jSONWriter, cls);
        }
        if (this.G != null) {
            return this.G;
        }
        bg a2 = super.a(jSONWriter, cls);
        this.G = a2;
        return a2;
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriterObject, com.alibaba.fastjson2.writer.FieldWriter
    public void a(JSONWriter jSONWriter, T t) {
        Object a2 = a((ay<T>) t);
        if (a2 == null) {
            jSONWriter.n();
            return;
        }
        boolean z = true;
        boolean z2 = this.H && jSONWriter.c();
        if (z2) {
            if (a2 == t) {
                jSONWriter.f("..");
                return;
            }
            String a3 = jSONWriter.a(this.f3039a, a2);
            if (a3 != null) {
                jSONWriter.f(a3);
                jSONWriter.b(a2);
                return;
            }
        }
        bg a4 = a(jSONWriter, this.F);
        if ((jSONWriter.c(this.d) & JSONWriter.Feature.BeanToArray.mask) == 0) {
            z = false;
        }
        if (jSONWriter.e) {
            if (z) {
                a4.c(jSONWriter, a2, this.f3039a, this.E, this.d);
            } else {
                a4.b(jSONWriter, a2, this.f3039a, this.E, this.d);
            }
        } else if (z) {
            a4.d(jSONWriter, a2, this.f3039a, this.E, this.d);
        } else {
            a4.a(jSONWriter, a2, this.f3039a, this.E, this.d);
        }
        if (!z2) {
            return;
        }
        jSONWriter.b(a2);
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriterObject, com.alibaba.fastjson2.writer.FieldWriter
    public boolean b(JSONWriter jSONWriter, T t) {
        try {
            Object a2 = a((ay<T>) t);
            if (a2 != null) {
                bg a3 = a(jSONWriter, this.F);
                a(jSONWriter);
                if (jSONWriter.e) {
                    a3.b(jSONWriter, a2, this.f3039a, this.E, this.d);
                } else {
                    a3.a(jSONWriter, a2, this.f3039a, this.E, this.d);
                }
                return true;
            } else if (((this.d | jSONWriter.e()) & JSONWriter.Feature.WriteNulls.mask) == 0) {
                return false;
            } else {
                a(jSONWriter);
                if (this.F.isArray()) {
                    jSONWriter.p();
                } else {
                    Class cls = this.F;
                    if (cls == StringBuffer.class || cls == StringBuilder.class) {
                        jSONWriter.o();
                    } else {
                        jSONWriter.n();
                    }
                }
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
