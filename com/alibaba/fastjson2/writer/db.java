package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.b;
import java.lang.reflect.Type;
import tb.kge;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class db extends dt {

    /* renamed from: a  reason: collision with root package name */
    static final db f3081a;
    static final byte[] b;
    static final long c;

    static {
        kge.a(-270127624);
        f3081a = new db();
        b = b.CC.a("[Long");
        c = com.alibaba.fastjson2.util.c.b("[Long");
    }

    db() {
    }

    @Override // com.alibaba.fastjson2.writer.bg
    public void a(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            if (!jSONWriter.b(JSONWriter.Feature.NullAsDefaultValue.mask | JSONWriter.Feature.WriteNullListAsEmpty.mask)) {
                jSONWriter.n();
                return;
            }
            jSONWriter.j();
            jSONWriter.k();
            return;
        }
        Long[] lArr = (Long[]) obj;
        jSONWriter.j();
        for (int i = 0; i < lArr.length; i++) {
            if (i != 0) {
                jSONWriter.l();
            }
            Long l = lArr[i];
            if (l == null) {
                jSONWriter.n();
            } else {
                jSONWriter.e(l.longValue());
            }
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
        Long[] lArr = (Long[]) obj;
        jSONWriter.c(lArr.length);
        for (Long l : lArr) {
            if (l == null) {
                jSONWriter.n();
            } else {
                jSONWriter.e(l.longValue());
            }
        }
    }
}
