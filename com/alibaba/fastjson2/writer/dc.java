package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.b;
import java.lang.reflect.Type;
import tb.kge;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class dc extends dt {

    /* renamed from: a  reason: collision with root package name */
    static final dc f3082a;
    static final byte[] b;
    static final long c;
    private final com.alibaba.fastjson2.function.d<Object, long[]> d;

    static {
        kge.a(1190715177);
        f3082a = new dc(null);
        b = b.CC.a("[J");
        c = com.alibaba.fastjson2.util.c.b("[J");
    }

    public dc(com.alibaba.fastjson2.function.d<Object, long[]> dVar) {
        this.d = dVar;
    }

    @Override // com.alibaba.fastjson2.writer.bg
    public void a(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            jSONWriter.n();
            return;
        }
        bg bgVar = null;
        if ((jSONWriter.b.f2940a.g & 4) != 0) {
            bgVar = jSONWriter.b.a(Long.class);
        }
        com.alibaba.fastjson2.function.d<Object, long[]> dVar = this.d;
        if (dVar != null) {
            obj = dVar.apply(obj);
        }
        long[] jArr = (long[]) obj;
        if (bgVar == null || bgVar == cx.f3077a) {
            jSONWriter.a(jArr);
            return;
        }
        jSONWriter.j();
        for (int i = 0; i < jArr.length; i++) {
            if (i != 0) {
                jSONWriter.l();
            }
            bgVar.a(jSONWriter, Long.valueOf(jArr[i]), Integer.valueOf(i), Long.TYPE, j);
        }
        jSONWriter.k();
    }

    @Override // com.alibaba.fastjson2.writer.dt, com.alibaba.fastjson2.writer.bg
    public void b(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            jSONWriter.n();
            return;
        }
        if (jSONWriter.a(obj, type)) {
            jSONWriter.b(b, c);
        }
        com.alibaba.fastjson2.function.d<Object, long[]> dVar = this.d;
        if (dVar != null) {
            obj = dVar.apply(obj);
        }
        jSONWriter.a((long[]) obj);
    }
}
