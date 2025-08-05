package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Date;
import java.util.List;
import tb.kge;

/* loaded from: classes2.dex */
abstract class ap<T> extends FieldWriter<T> {
    final Class A;
    final boolean B;
    bg C;
    bg D;
    final Type z;

    static {
        kge.a(251041137);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ap(String str, Type type, int i, long j, String str2, String str3, Type type2, Class cls, Field field, Method method) {
        super(str, i, j, str2, str3, type2, cls, field, method);
        bg bgVar;
        this.z = type == null ? Object.class : type;
        if (this.z instanceof Class) {
            this.A = (Class) type;
            Class cls2 = this.A;
            if (cls2 != null) {
                if (Enum.class.isAssignableFrom(cls2)) {
                    bgVar = new di(cls, this.A, j);
                } else {
                    Class cls3 = this.A;
                    if (cls3 == String.class) {
                        bgVar = dj.f3088a;
                    } else {
                        this.C = new dh(cls, type2, cls3, type, j);
                    }
                }
                this.C = bgVar;
            }
        } else {
            this.A = TypeUtils.b(type);
        }
        Class cls4 = this.A;
        this.B = cls4 != null && du.d(cls4);
        if (str2 == null || this.A != Date.class) {
            return;
        }
        this.D = new cp(str2, null);
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public bg a(JSONWriter jSONWriter, Class cls) {
        bg bgVar = this.C;
        if (bgVar == null || !this.c.isAssignableFrom(cls)) {
            if (bgVar != null || cls != this.c) {
                return jSONWriter.a(cls);
            }
            bg a2 = jSONWriter.a(cls);
            this.C = a2;
            return a2;
        }
        return bgVar;
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public bg a(JSONWriter jSONWriter, Type type) {
        if (type == null || type == this.z) {
            bg bgVar = this.D;
            if (bgVar != null) {
                return bgVar;
            }
            if (this.f != null) {
                if (type == Double.class) {
                    cq cqVar = new cq(new DecimalFormat(this.f));
                    this.D = cqVar;
                    return cqVar;
                } else if (type == Float.class) {
                    ct ctVar = new ct(new DecimalFormat(this.f));
                    this.D = ctVar;
                    return ctVar;
                } else if (type == BigDecimal.class) {
                    cg cgVar = new cg(new DecimalFormat(this.f), null);
                    this.D = cgVar;
                    return cgVar;
                }
            }
            bg a2 = jSONWriter.a(this.z, this.A);
            this.D = a2;
            return a2;
        }
        return jSONWriter.a(type, (Class) TypeUtils.e(type));
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x009a, code lost:
        if (r15 != false) goto L37;
     */
    @Override // com.alibaba.fastjson2.writer.FieldWriter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(com.alibaba.fastjson2.JSONWriter r19, boolean r20, java.util.List r21) {
        /*
            r18 = this;
            r0 = r18
            r8 = r19
            boolean r1 = r8.e
            if (r1 == 0) goto Lc
            r18.c(r19, r20, r21)
            return
        Lc:
            long r1 = r0.d
            long r9 = r8.c(r1)
            com.alibaba.fastjson2.JSONWriter$Feature r1 = com.alibaba.fastjson2.JSONWriter.Feature.NotWriteEmptyArray
            long r1 = r1.mask
            long r1 = r1 & r9
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L26
            boolean r1 = r21.isEmpty()
            if (r1 == 0) goto L26
            if (r20 == 0) goto L26
            return
        L26:
            com.alibaba.fastjson2.JSONWriter$Feature r1 = com.alibaba.fastjson2.JSONWriter.Feature.ReferenceDetection
            long r1 = r1.mask
            long r1 = r1 & r9
            r5 = 0
            r11 = 1
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 == 0) goto L33
            r1 = 1
            goto L34
        L33:
            r1 = 0
        L34:
            if (r20 == 0) goto L39
            r18.a(r19)
        L39:
            r19.j()
            r2 = 0
            r3 = r1
            r1 = r2
            r12 = 0
        L40:
            int r4 = r21.size()
            if (r12 >= r4) goto La7
            if (r12 == 0) goto L4b
            r19.l()
        L4b:
            r13 = r21
            java.lang.Object r14 = r13.get(r12)
            if (r14 != 0) goto L57
            r19.n()
            goto La4
        L57:
            java.lang.Class r4 = r14.getClass()
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            if (r4 != r5) goto L65
            java.lang.String r14 = (java.lang.String) r14
            r8.d(r14)
            goto La4
        L65:
            if (r4 != r2) goto L6d
            r16 = r1
            r17 = r2
            r15 = r3
            goto L82
        L6d:
            boolean r1 = r19.c()
            com.alibaba.fastjson2.writer.bg r2 = r0.a(r8, r4)
            if (r1 == 0) goto L7c
            boolean r1 = com.alibaba.fastjson2.writer.du.d(r4)
            r1 = r1 ^ r11
        L7c:
            r3 = r1
            r16 = r2
            r15 = r3
            r17 = r4
        L82:
            if (r15 == 0) goto L8e
            java.lang.String r1 = r8.a(r12, r14)
            if (r1 == 0) goto L8e
            r8.f(r1)
            goto L9c
        L8e:
            r4 = 0
            java.lang.reflect.Type r5 = r0.z
            r1 = r16
            r2 = r19
            r3 = r14
            r6 = r9
            r1.a(r2, r3, r4, r5, r6)
            if (r15 == 0) goto L9f
        L9c:
            r8.b(r14)
        L9f:
            r3 = r15
            r1 = r16
            r2 = r17
        La4:
            int r12 = r12 + 1
            goto L40
        La7:
            r19.k()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.writer.ap.a(com.alibaba.fastjson2.JSONWriter, boolean, java.util.List):void");
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public void b(JSONWriter jSONWriter, boolean z, List<String> list) {
        if (z) {
            a(jSONWriter);
        }
        if (jSONWriter.e && jSONWriter.a((Object) list, this.c)) {
            jSONWriter.c(TypeUtils.a((Class) list.getClass()));
        }
        jSONWriter.a(list);
    }

    public final void c(JSONWriter jSONWriter, boolean z, List list) {
        bg bgVar;
        Class<?> cls;
        boolean z2;
        Object obj;
        String a2;
        bg a3;
        long c = jSONWriter.c(this.d);
        boolean z3 = (JSONWriter.Feature.BeanToArray.mask & c) != 0;
        if ((JSONWriter.Feature.NotWriteEmptyArray.mask & c) == 0 || !list.isEmpty() || !z) {
            boolean z4 = (JSONWriter.Feature.ReferenceDetection.mask & c) != 0;
            if (z) {
                a(jSONWriter);
            }
            int size = list.size();
            if (jSONWriter.a((Object) list, this.c)) {
                jSONWriter.c(TypeUtils.a((Class) list.getClass()));
            }
            jSONWriter.c(size);
            Class<?> cls2 = null;
            boolean z5 = z4;
            bg bgVar2 = null;
            for (int i = 0; i < size; i++) {
                Object obj2 = list.get(i);
                if (obj2 == null) {
                    jSONWriter.n();
                } else {
                    Class<?> cls3 = obj2.getClass();
                    if (cls3 != cls2) {
                        boolean c2 = jSONWriter.c();
                        if (cls3 != this.z || (a3 = this.D) == null) {
                            a3 = a(jSONWriter, (Type) cls3);
                        }
                        if (c2) {
                            c2 = !(cls3 == this.A ? this.B : du.d(cls3));
                        }
                        bgVar = a3;
                        z2 = c2;
                        cls = cls3;
                    } else {
                        bgVar = bgVar2;
                        cls = cls2;
                        z2 = z5;
                    }
                    if (!z2 || (a2 = jSONWriter.a(i, obj2)) == null) {
                        if (z3) {
                            obj = obj2;
                            bgVar.c(jSONWriter, obj2, Integer.valueOf(i), this.z, c);
                        } else {
                            obj = obj2;
                            bgVar.b(jSONWriter, obj, Integer.valueOf(i), this.z, c);
                        }
                        if (z2) {
                            jSONWriter.b(obj);
                        }
                    } else {
                        jSONWriter.f(a2);
                        jSONWriter.b(obj2);
                    }
                    bgVar2 = bgVar;
                    z5 = z2;
                    cls2 = cls;
                }
            }
        }
    }
}
