package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.b;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import tb.kge;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class bv extends dt {
    public static final bv DECIMAL_ARRAY;
    public static final bv DOUBLE_ARRAY;
    public static final bv FLOAT_ARRAY;

    /* renamed from: a  reason: collision with root package name */
    final byte[] f3053a;
    final long b;
    final Class c;
    volatile bg d;
    public final DecimalFormat e;
    public boolean f;

    static {
        kge.a(-1993892631);
        FLOAT_ARRAY = new bv(Float.class, null);
        DOUBLE_ARRAY = new bv(Double.class, null);
        DECIMAL_ARRAY = new bv(BigDecimal.class, null);
    }

    public bv(Class cls, DecimalFormat decimalFormat) {
        this.c = cls;
        this.e = decimalFormat;
        String str = '[' + TypeUtils.a(cls);
        this.f3053a = b.CC.a(str);
        this.b = com.alibaba.fastjson2.util.c.b(str);
        this.f = !du.d(cls);
    }

    @Override // com.alibaba.fastjson2.writer.bg
    public void a(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        String a2;
        if (jSONWriter.e) {
            b(jSONWriter, obj, obj2, type, j);
        } else if (obj == null) {
            jSONWriter.p();
        } else {
            boolean c = jSONWriter.c();
            if (c) {
                c = this.f;
            }
            Object[] objArr = (Object[]) obj;
            jSONWriter.j();
            for (int i = 0; i < objArr.length; i++) {
                if (i != 0) {
                    jSONWriter.l();
                }
                Object obj3 = objArr[i];
                if (obj3 == null) {
                    jSONWriter.n();
                } else {
                    bg b = b(jSONWriter);
                    if (!c || (a2 = jSONWriter.a(i, obj3)) == null) {
                        b.a(jSONWriter, obj3, Integer.valueOf(i), this.c, j);
                        if (!c) {
                        }
                    } else {
                        jSONWriter.f(a2);
                    }
                    jSONWriter.b(obj3);
                }
            }
            jSONWriter.k();
        }
    }

    public bg b(JSONWriter jSONWriter) {
        bg a2;
        bg bgVar = this.d;
        if (bgVar == null) {
            Class cls = this.c;
            if (cls == Float.class) {
                DecimalFormat decimalFormat = this.e;
                if (decimalFormat != null) {
                    bgVar = new ct(decimalFormat);
                    this.d = bgVar;
                } else {
                    a2 = ct.f3073a;
                    bgVar = a2;
                    this.d = bgVar;
                }
            } else if (cls == Double.class) {
                DecimalFormat decimalFormat2 = this.e;
                if (decimalFormat2 != null) {
                    bgVar = new cq(decimalFormat2);
                    this.d = bgVar;
                } else {
                    a2 = cq.f3070a;
                    bgVar = a2;
                    this.d = bgVar;
                }
            } else {
                if (cls == BigDecimal.class) {
                    DecimalFormat decimalFormat3 = this.e;
                    if (decimalFormat3 != null) {
                        bgVar = new cg(decimalFormat3, null);
                        this.d = bgVar;
                    } else {
                        a2 = cg.f3062a;
                    }
                } else {
                    a2 = jSONWriter.a(cls);
                }
                bgVar = a2;
                this.d = bgVar;
            }
        }
        return bgVar;
    }

    @Override // com.alibaba.fastjson2.writer.dt, com.alibaba.fastjson2.writer.bg
    public void b(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        String a2;
        if (obj == null) {
            jSONWriter.p();
            return;
        }
        boolean c = jSONWriter.c();
        if (c) {
            c = this.f;
        }
        Object[] objArr = (Object[]) obj;
        if (jSONWriter.a(obj, type)) {
            jSONWriter.b(this.f3053a, this.b);
        }
        jSONWriter.c(objArr.length);
        for (int i = 0; i < objArr.length; i++) {
            Object obj3 = objArr[i];
            if (obj3 == null) {
                jSONWriter.n();
            } else {
                bg b = b(jSONWriter);
                if (!c || (a2 = jSONWriter.a(i, obj3)) == null) {
                    b.b(jSONWriter, obj3, Integer.valueOf(i), this.c, 0L);
                    if (!c) {
                    }
                } else {
                    jSONWriter.f(a2);
                }
                jSONWriter.b(obj3);
            }
        }
    }
}
