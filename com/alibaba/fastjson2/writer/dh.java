package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.b;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import tb.kge;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class dh extends dt {

    /* renamed from: a  reason: collision with root package name */
    static final dh f3086a;
    static final dh b;
    static final dh c;
    static final Class d;
    static final String e;
    static final byte[] f;
    static final long g;
    final Class h;
    final Type i;
    final Class j;
    final Type k;
    final long l;
    final boolean m;
    volatile bg n;

    static {
        kge.a(-1504163798);
        f3086a = new dh(null, null, null, null, 0L);
        b = new dh(JSONArray.class, null, null, null, 0L);
        Class e2 = JSONFactory.e();
        c = e2 == null ? null : new dh(e2, null, null, null, 0L);
        d = new ArrayList().subList(0, 0).getClass();
        String a2 = TypeUtils.a(ArrayList.class);
        e = a2;
        f = b.CC.a(a2);
        g = com.alibaba.fastjson2.util.c.b(e);
    }

    public dh(Class cls, Type type, Class cls2, Type type2, long j) {
        this.h = cls;
        this.i = type;
        this.j = cls2;
        this.k = type2;
        this.l = j;
        this.m = cls2 != null && !du.d(cls2);
    }

    /* JADX WARN: Removed duplicated region for block: B:91:0x0181  */
    @Override // com.alibaba.fastjson2.writer.bg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(com.alibaba.fastjson2.JSONWriter r22, java.lang.Object r23, java.lang.Object r24, java.lang.reflect.Type r25, long r26) {
        /*
            Method dump skipped, instructions count: 451
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.writer.dh.a(com.alibaba.fastjson2.JSONWriter, java.lang.Object, java.lang.Object, java.lang.reflect.Type, long):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0158, code lost:
        if (r16 == false) goto L69;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007b  */
    @Override // com.alibaba.fastjson2.writer.dt, com.alibaba.fastjson2.writer.bg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(com.alibaba.fastjson2.JSONWriter r20, java.lang.Object r21, java.lang.Object r22, java.lang.reflect.Type r23, long r24) {
        /*
            Method dump skipped, instructions count: 361
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.writer.dh.b(com.alibaba.fastjson2.JSONWriter, java.lang.Object, java.lang.Object, java.lang.reflect.Type, long):void");
    }

    @Override // com.alibaba.fastjson2.writer.dt, com.alibaba.fastjson2.writer.bg
    public void c(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            jSONWriter.p();
            return;
        }
        List list = (List) obj;
        jSONWriter.c(list.size());
        Class<?> cls = null;
        bg bgVar = null;
        for (int i = 0; i < list.size(); i++) {
            Object obj3 = list.get(i);
            if (obj3 == null) {
                jSONWriter.n();
            } else {
                Class<?> cls2 = obj3.getClass();
                if (cls2 != cls) {
                    bgVar = jSONWriter.a((Class) cls2);
                    cls = cls2;
                }
                bgVar.c(jSONWriter, obj3, Integer.valueOf(i), this.k, this.l | j);
            }
        }
    }
}
