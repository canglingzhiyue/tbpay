package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Type;
import tb.kge;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class dd extends dt {

    /* renamed from: a  reason: collision with root package name */
    static final dd f3083a;

    static {
        kge.a(-1504248395);
        f3083a = new dd();
    }

    dd() {
    }

    @Override // com.alibaba.fastjson2.writer.bg
    public void a(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            jSONWriter.q();
            return;
        }
        jSONWriter.d(((Number) obj).intValue());
        if (((jSONWriter.e() | j) & JSONWriter.Feature.WriteClassName.mask) == 0 || type == Byte.class || type == Byte.TYPE) {
            return;
        }
        jSONWriter.c('B');
    }

    @Override // com.alibaba.fastjson2.writer.dt, com.alibaba.fastjson2.writer.bg
    public void b(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            jSONWriter.q();
        } else {
            jSONWriter.b(((Byte) obj).byteValue());
        }
    }
}
