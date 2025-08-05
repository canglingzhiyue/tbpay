package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.b;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Type;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
import tb.kge;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class cn extends dt {

    /* renamed from: a  reason: collision with root package name */
    static final cn f3068a;
    static final byte[] b;
    static final long c;
    static final byte[] d;
    static final long e;
    Type f;
    long g;

    static {
        kge.a(158756138);
        f3068a = new cn();
        b = b.CC.a(TypeUtils.a(LinkedHashSet.class));
        c = com.alibaba.fastjson2.util.c.b(TypeUtils.a(LinkedHashSet.class));
        d = b.CC.a(TypeUtils.a(TreeSet.class));
        e = com.alibaba.fastjson2.util.c.b(TypeUtils.a(TreeSet.class));
    }

    cn() {
    }

    @Override // com.alibaba.fastjson2.writer.bg
    public void a(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        bg a2;
        if (jSONWriter.e) {
            b(jSONWriter, obj, obj2, type, j);
        } else if (obj == null) {
            jSONWriter.n();
        } else {
            if ((obj instanceof Set) && jSONWriter.a(obj, this.g | j)) {
                jSONWriter.a(com.taobao.android.weex_framework.util.a.ATOM_Set);
            }
            jSONWriter.j();
            int i = 0;
            Class<?> cls = null;
            bg bgVar = null;
            for (Object obj3 : (Iterable) obj) {
                if (i != 0) {
                    jSONWriter.l();
                }
                if (obj3 == null) {
                    jSONWriter.n();
                    i++;
                } else {
                    Class<?> cls2 = obj3.getClass();
                    if (cls2 == cls) {
                        cls2 = cls;
                        a2 = bgVar;
                    } else {
                        a2 = jSONWriter.a((Class) cls2);
                    }
                    a2.a(jSONWriter, obj3, Integer.valueOf(i), this.f, this.g);
                    i++;
                    bgVar = a2;
                    cls = cls2;
                }
            }
            jSONWriter.k();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x00e5, code lost:
        if (r17 != false) goto L54;
     */
    @Override // com.alibaba.fastjson2.writer.dt, com.alibaba.fastjson2.writer.bg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(com.alibaba.fastjson2.JSONWriter r19, java.lang.Object r20, java.lang.Object r21, java.lang.reflect.Type r22, long r23) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.writer.cn.b(com.alibaba.fastjson2.JSONWriter, java.lang.Object, java.lang.Object, java.lang.reflect.Type, long):void");
    }
}
