package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.b;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Type;
import tb.kge;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class bu extends dt {

    /* renamed from: a  reason: collision with root package name */
    static final bu f3052a;
    final byte[] b;
    final long c;
    final Type d;

    static {
        kge.a(-2078145395);
        f3052a = new bu(Object.class);
    }

    public bu(Type type) {
        String str;
        this.d = type;
        if (type == Object.class) {
            this.b = b.CC.a("[O");
            str = "[0";
        } else {
            str = '[' + TypeUtils.a((Class) type);
            this.b = b.CC.a(str);
        }
        this.c = com.alibaba.fastjson2.util.c.b(str);
    }

    @Override // com.alibaba.fastjson2.writer.bg
    public void a(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        bg bgVar;
        boolean z;
        Class<?> cls;
        String a2;
        if (jSONWriter.e) {
            b(jSONWriter, obj, obj2, type, j);
        } else if (obj == null) {
            jSONWriter.p();
        } else {
            boolean c = jSONWriter.c();
            Object[] objArr = (Object[]) obj;
            jSONWriter.j();
            Class<?> cls2 = null;
            boolean z2 = c;
            bg bgVar2 = null;
            for (int i = 0; i < objArr.length; i++) {
                if (i != 0) {
                    jSONWriter.l();
                }
                Object obj3 = objArr[i];
                if (obj3 == null) {
                    jSONWriter.n();
                } else {
                    Class<?> cls3 = obj3.getClass();
                    if (cls3 == cls2) {
                        bgVar = bgVar2;
                        z = z2;
                        cls = cls2;
                    } else {
                        boolean c2 = jSONWriter.c();
                        bg a3 = jSONWriter.a((Class) cls3);
                        if (c2) {
                            c2 = !du.d(cls3);
                        }
                        bgVar = a3;
                        z = c2;
                        cls = cls3;
                    }
                    if (!z || (a2 = jSONWriter.a(i, obj3)) == null) {
                        bgVar.a(jSONWriter, obj3, Integer.valueOf(i), this.d, j);
                        if (z) {
                            jSONWriter.b(obj3);
                        }
                    } else {
                        jSONWriter.f(a2);
                        jSONWriter.b(obj3);
                    }
                    z2 = z;
                    bgVar2 = bgVar;
                    cls2 = cls;
                }
            }
            jSONWriter.k();
        }
    }

    @Override // com.alibaba.fastjson2.writer.dt, com.alibaba.fastjson2.writer.bg
    public void b(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        String a2;
        if (obj == null) {
            jSONWriter.p();
            return;
        }
        boolean c = jSONWriter.c();
        Object[] objArr = (Object[]) obj;
        if (jSONWriter.a(obj, type)) {
            jSONWriter.b(this.b, this.c);
        }
        jSONWriter.c(objArr.length);
        Class<?> cls = null;
        boolean z = c;
        bg bgVar = null;
        for (int i = 0; i < objArr.length; i++) {
            Object obj3 = objArr[i];
            if (obj3 == null) {
                jSONWriter.n();
            } else {
                Class<?> cls2 = obj3.getClass();
                if (cls2 != cls) {
                    z = jSONWriter.c();
                    bgVar = jSONWriter.a((Class) cls2);
                    if (z) {
                        z = !du.d(cls2);
                    }
                    cls = cls2;
                }
                if (!z || (a2 = jSONWriter.a(i, obj3)) == null) {
                    bgVar.b(jSONWriter, obj3, Integer.valueOf(i), this.d, 0L);
                    if (!z) {
                    }
                } else {
                    jSONWriter.f(a2);
                }
                jSONWriter.b(obj3);
            }
        }
    }
}
