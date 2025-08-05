package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.b;
import java.lang.reflect.Type;
import tb.kge;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class cy extends dt {

    /* renamed from: a  reason: collision with root package name */
    static final cy f3078a;
    static final byte[] b;
    static final long c;

    static {
        kge.a(1305070327);
        f3078a = new cy();
        b = b.CC.a("[Integer");
        c = com.alibaba.fastjson2.util.c.b("[Integer");
    }

    cy() {
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
        Integer[] numArr = (Integer[]) obj;
        jSONWriter.j();
        for (int i = 0; i < numArr.length; i++) {
            if (i != 0) {
                jSONWriter.l();
            }
            Integer num = numArr[i];
            if (num == null) {
                jSONWriter.n();
            } else {
                jSONWriter.d(num.intValue());
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
        Integer[] numArr = (Integer[]) obj;
        jSONWriter.c(numArr.length);
        for (Integer num : numArr) {
            if (num == null) {
                jSONWriter.n();
            } else {
                jSONWriter.d(num.intValue());
            }
        }
    }
}
