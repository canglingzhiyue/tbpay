package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Type;
import java.util.List;
import tb.kge;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class dj extends dt {

    /* renamed from: a  reason: collision with root package name */
    static final dj f3088a;

    static {
        kge.a(-1149823577);
        f3088a = new dj();
    }

    dj() {
    }

    @Override // com.alibaba.fastjson2.writer.bg
    public void a(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            jSONWriter.n();
            return;
        }
        List list = (List) obj;
        jSONWriter.j();
        for (int i = 0; i < list.size(); i++) {
            if (i != 0) {
                jSONWriter.l();
            }
            String str = (String) list.get(i);
            if (str == null) {
                jSONWriter.n();
            } else {
                jSONWriter.d(str);
            }
        }
        jSONWriter.k();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0022, code lost:
        if ((r5 instanceof java.lang.Class) != false) goto L20;
     */
    @Override // com.alibaba.fastjson2.writer.dt, com.alibaba.fastjson2.writer.bg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(com.alibaba.fastjson2.JSONWriter r2, java.lang.Object r3, java.lang.Object r4, java.lang.reflect.Type r5, long r6) {
        /*
            r1 = this;
            if (r3 != 0) goto L6
            r2.p()
            return
        L6:
            r4 = 0
            java.lang.reflect.ParameterizedType r0 = com.alibaba.fastjson2.util.TypeUtils.PARAM_TYPE_LIST_STR
            if (r5 != r0) goto Le
            java.lang.Class<java.util.List> r4 = java.util.List.class
            goto L25
        Le:
            boolean r0 = r5 instanceof java.lang.Class
            if (r0 == 0) goto L16
        L12:
            r4 = r5
            java.lang.Class r4 = (java.lang.Class) r4
            goto L25
        L16:
            boolean r0 = r5 instanceof java.lang.reflect.ParameterizedType
            if (r0 == 0) goto L25
            java.lang.reflect.ParameterizedType r5 = (java.lang.reflect.ParameterizedType) r5
            java.lang.reflect.Type r5 = r5.getRawType()
            boolean r0 = r5 instanceof java.lang.Class
            if (r0 == 0) goto L25
            goto L12
        L25:
            java.lang.Class r5 = r3.getClass()
            java.lang.Class<java.util.ArrayList> r0 = java.util.ArrayList.class
            if (r5 == r0) goto L40
            boolean r4 = r2.a(r3, r4, r6)
            if (r4 == 0) goto L40
            java.lang.Class r4 = com.alibaba.fastjson2.writer.dh.d
            if (r5 != r4) goto L39
            java.lang.Class<java.util.ArrayList> r5 = java.util.ArrayList.class
        L39:
            java.lang.String r4 = com.alibaba.fastjson2.util.TypeUtils.a(r5)
            r2.c(r4)
        L40:
            java.util.List r3 = (java.util.List) r3
            r2.a(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.writer.dj.b(com.alibaba.fastjson2.JSONWriter, java.lang.Object, java.lang.Object, java.lang.reflect.Type, long):void");
    }
}
