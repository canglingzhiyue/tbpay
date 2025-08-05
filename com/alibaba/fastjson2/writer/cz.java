package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.b;
import java.lang.reflect.Type;
import tb.kge;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class cz extends dt {

    /* renamed from: a  reason: collision with root package name */
    static final cz f3079a;
    static final byte[] b;
    static final long c;
    private final com.alibaba.fastjson2.function.d<Object, int[]> d;

    static {
        kge.a(102402442);
        f3079a = new cz(null);
        b = b.CC.a("[I");
        c = com.alibaba.fastjson2.util.c.b("[I");
    }

    public cz(com.alibaba.fastjson2.function.d<Object, int[]> dVar) {
        this.d = dVar;
    }

    @Override // com.alibaba.fastjson2.writer.bg
    public void a(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            jSONWriter.n();
            return;
        }
        com.alibaba.fastjson2.function.d<Object, int[]> dVar = this.d;
        if (dVar != null) {
            obj = dVar.apply(obj);
        }
        jSONWriter.a((int[]) obj);
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
        com.alibaba.fastjson2.function.d<Object, int[]> dVar = this.d;
        if (dVar != null) {
            obj = dVar.apply(obj);
        }
        jSONWriter.a((int[]) obj);
    }
}
