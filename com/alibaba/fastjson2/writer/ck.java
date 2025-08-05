package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.b;
import java.lang.reflect.Type;
import tb.kge;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class ck extends dt {

    /* renamed from: a  reason: collision with root package name */
    static final ck f3065a;
    static final byte[] b;
    static final long c;
    private final com.alibaba.fastjson2.function.d<Object, char[]> d;

    static {
        kge.a(-1283292182);
        f3065a = new ck(null);
        b = b.CC.a("[C");
        c = com.alibaba.fastjson2.util.c.b("[C");
    }

    public ck(com.alibaba.fastjson2.function.d<Object, char[]> dVar) {
        this.d = dVar;
    }

    @Override // com.alibaba.fastjson2.writer.bg
    public void a(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        com.alibaba.fastjson2.function.d<Object, char[]> dVar = this.d;
        if (dVar != null && obj != null) {
            obj = dVar.apply(obj);
        }
        char[] cArr = (char[]) obj;
        if (jSONWriter.d) {
            jSONWriter.b(cArr, 0, cArr.length);
        } else {
            jSONWriter.d(new String(cArr));
        }
    }

    @Override // com.alibaba.fastjson2.writer.dt, com.alibaba.fastjson2.writer.bg
    public void b(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        if (jSONWriter.a(obj, type, j)) {
            jSONWriter.b(b, c);
        }
        com.alibaba.fastjson2.function.d<Object, char[]> dVar = this.d;
        if (dVar != null && obj != null) {
            obj = dVar.apply(obj);
        }
        char[] cArr = (char[]) obj;
        jSONWriter.b(cArr, 0, cArr.length);
    }
}
