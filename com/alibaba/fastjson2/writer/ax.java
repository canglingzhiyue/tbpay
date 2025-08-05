package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import tb.kge;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class ax<T> extends FieldWriter<T> {
    final Class A;
    bg B;
    final Type z;

    static {
        kge.a(-653465112);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ax(String str, Type type, int i, long j, String str2, String str3, Type type2, Class cls, Method method) {
        super(str, i, j, str2, str3, type2, cls, null, method);
        this.z = type;
        this.A = type instanceof Class ? (Class) type : TypeUtils.b(type);
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public bg a(JSONWriter jSONWriter, Type type) {
        if (type == null || type == this.z) {
            bg bgVar = this.B;
            if (bgVar != null) {
                return bgVar;
            }
            if (type == Float[].class) {
                return this.g != null ? new bv(Float.class, this.g) : bv.FLOAT_ARRAY;
            } else if (type == Double[].class) {
                return this.g != null ? new bv(Double.class, this.g) : bv.DOUBLE_ARRAY;
            } else if (type == BigDecimal[].class) {
                return this.g != null ? new bv(BigDecimal.class, this.g) : bv.DECIMAL_ARRAY;
            } else if (type == Float.class) {
                return this.g != null ? new ct(this.g) : ct.f3073a;
            } else if (type == Double.class) {
                return this.g != null ? new cq(this.g) : cq.f3070a;
            } else if (type == BigDecimal.class) {
                return this.g != null ? new cg(this.g, null) : cg.f3062a;
            } else {
                bg a2 = jSONWriter.a(this.z, this.A);
                this.B = a2;
                return a2;
            }
        }
        return jSONWriter.a(type, (Class) null);
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public Object a(Object obj) {
        try {
            return this.j.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
            throw new JSONException("field.get error, " + this.f3039a, e);
        }
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public void a(JSONWriter jSONWriter, T t) {
        Object[] objArr = (Object[]) a(t);
        if (objArr == null) {
            jSONWriter.n();
        } else {
            a(jSONWriter, false, objArr);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x007d, code lost:
        if (r15 != false) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(com.alibaba.fastjson2.JSONWriter r18, boolean r19, java.lang.Object[] r20) {
        /*
            r17 = this;
            r0 = r17
            r8 = r18
            r9 = r20
            if (r19 == 0) goto Lb
            r17.a(r18)
        Lb:
            boolean r10 = r18.c()
            if (r10 == 0) goto L1d
            java.lang.String r1 = r0.f3039a
            java.lang.String r1 = r8.a(r1, r9)
            if (r1 == 0) goto L1d
            r8.f(r1)
            return
        L1d:
            boolean r1 = r8.e
            r2 = 0
            r3 = 0
            if (r1 == 0) goto L8f
            java.lang.Class r1 = r20.getClass()
            java.lang.Class r4 = r0.c
            if (r1 == r4) goto L32
            java.lang.String r1 = com.alibaba.fastjson2.util.TypeUtils.a(r1)
            r8.c(r1)
        L32:
            int r11 = r9.length
            r8.c(r11)
            r2 = r3
            r1 = r10
            r12 = 0
        L39:
            if (r12 >= r11) goto L89
            r13 = r9[r12]
            if (r13 != 0) goto L43
            r18.n()
            goto L86
        L43:
            java.lang.Class r4 = r13.getClass()
            if (r4 == r3) goto L5e
            boolean r1 = r18.c()
            com.alibaba.fastjson2.writer.bg r2 = r0.a(r8, r4)
            if (r1 == 0) goto L59
            boolean r1 = com.alibaba.fastjson2.writer.du.d(r4)
            r1 = r1 ^ 1
        L59:
            r15 = r1
            r14 = r2
            r16 = r4
            goto L62
        L5e:
            r15 = r1
            r14 = r2
            r16 = r3
        L62:
            if (r15 == 0) goto L6e
            java.lang.String r1 = r8.a(r12, r13)
            if (r1 == 0) goto L6e
            r8.f(r1)
            goto L7f
        L6e:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r12)
            java.lang.reflect.Type r5 = r0.z
            long r6 = r0.d
            r1 = r14
            r2 = r18
            r3 = r13
            r1.b(r2, r3, r4, r5, r6)
            if (r15 == 0) goto L82
        L7f:
            r8.b(r13)
        L82:
            r2 = r14
            r1 = r15
            r3 = r16
        L86:
            int r12 = r12 + 1
            goto L39
        L89:
            if (r10 == 0) goto L8e
            r8.b(r9)
        L8e:
            return
        L8f:
            r18.j()
            r1 = r3
        L93:
            int r4 = r9.length
            if (r2 >= r4) goto Lb5
            if (r2 == 0) goto L9b
            r18.l()
        L9b:
            r4 = r9[r2]
            if (r4 != 0) goto La3
            r18.n()
            goto Lb2
        La3:
            java.lang.Class r5 = r4.getClass()
            if (r5 != r3) goto Laa
            goto Laf
        Laa:
            com.alibaba.fastjson2.writer.bg r1 = r0.a(r8, r5)
            r3 = r5
        Laf:
            r1.a(r8, r4)
        Lb2:
            int r2 = r2 + 1
            goto L93
        Lb5:
            r18.k()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.writer.ax.a(com.alibaba.fastjson2.JSONWriter, boolean, java.lang.Object[]):void");
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public boolean b(JSONWriter jSONWriter, T t) {
        Object[] objArr = (Object[]) a(t);
        if (objArr != null) {
            a(jSONWriter, true, objArr);
            return true;
        } else if (((this.d | jSONWriter.e()) & (JSONWriter.Feature.WriteNulls.mask | JSONWriter.Feature.NullAsDefaultValue.mask | JSONWriter.Feature.WriteNullListAsEmpty.mask)) == 0) {
            return false;
        } else {
            a(jSONWriter);
            jSONWriter.p();
            return true;
        }
    }
}
