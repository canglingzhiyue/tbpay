package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Type;
import tb.kge;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class cm extends dt {

    /* renamed from: a  reason: collision with root package name */
    static final cm f3067a;

    static {
        kge.a(607322988);
        f3067a = new cm();
    }

    cm() {
    }

    @Override // com.alibaba.fastjson2.writer.bg
    public void a(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            jSONWriter.n();
        } else {
            jSONWriter.d(((Class) obj).getName());
        }
    }

    @Override // com.alibaba.fastjson2.writer.dt, com.alibaba.fastjson2.writer.bg
    public void b(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            jSONWriter.n();
            return;
        }
        if (jSONWriter.a(obj, type, j)) {
            jSONWriter.c("java.lang.Class");
        }
        jSONWriter.d(((Class) obj).getName());
    }
}
