package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.b;
import java.lang.reflect.Type;
import tb.kge;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class ch extends dt {

    /* renamed from: a  reason: collision with root package name */
    static final ch f3063a;
    static final byte[] b;
    static final long c;
    private final com.alibaba.fastjson2.function.d<Object, boolean[]> d;

    static {
        kge.a(1167377022);
        f3063a = new ch(null);
        b = b.CC.a("[Z");
        c = com.alibaba.fastjson2.util.c.b("[Z");
    }

    public ch(com.alibaba.fastjson2.function.d<Object, boolean[]> dVar) {
        this.d = dVar;
    }

    @Override // com.alibaba.fastjson2.writer.bg
    public void a(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        com.alibaba.fastjson2.function.d<Object, boolean[]> dVar = this.d;
        if (dVar != null && obj != null) {
            obj = dVar.apply(obj);
        }
        jSONWriter.a((boolean[]) obj);
    }

    @Override // com.alibaba.fastjson2.writer.dt, com.alibaba.fastjson2.writer.bg
    public void b(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        if (jSONWriter.a(obj, type, j)) {
            jSONWriter.b(b, c);
        }
        com.alibaba.fastjson2.function.d<Object, boolean[]> dVar = this.d;
        if (dVar != null && obj != null) {
            obj = dVar.apply(obj);
        }
        jSONWriter.a((boolean[]) obj);
    }
}
