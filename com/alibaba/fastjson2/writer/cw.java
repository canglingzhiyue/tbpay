package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.b;
import java.lang.reflect.Type;
import tb.kge;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class cw extends dt {

    /* renamed from: a  reason: collision with root package name */
    static final cw f3076a;
    static final byte[] b;
    static final long c;
    private final com.alibaba.fastjson2.function.d<Object, short[]> d;

    static {
        kge.a(1246366160);
        f3076a = new cw(null);
        b = b.CC.a("[S");
        c = com.alibaba.fastjson2.util.c.b("[S");
    }

    public cw(com.alibaba.fastjson2.function.d<Object, short[]> dVar) {
        this.d = dVar;
    }

    @Override // com.alibaba.fastjson2.writer.bg
    public void a(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            jSONWriter.n();
            return;
        }
        com.alibaba.fastjson2.function.d<Object, short[]> dVar = this.d;
        if (dVar != null) {
            obj = dVar.apply(obj);
        }
        short[] sArr = (short[]) obj;
        jSONWriter.j();
        for (int i = 0; i < sArr.length; i++) {
            if (i != 0) {
                jSONWriter.l();
            }
            jSONWriter.d((int) sArr[i]);
        }
        jSONWriter.k();
    }

    @Override // com.alibaba.fastjson2.writer.dt, com.alibaba.fastjson2.writer.bg
    public void b(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        if (jSONWriter.a(obj, type)) {
            jSONWriter.b(b, c);
        }
        com.alibaba.fastjson2.function.d<Object, short[]> dVar = this.d;
        if (dVar != null && obj != null) {
            obj = dVar.apply(obj);
        }
        short[] sArr = (short[]) obj;
        jSONWriter.c(sArr.length);
        for (short s : sArr) {
            jSONWriter.d((int) s);
        }
    }
}
