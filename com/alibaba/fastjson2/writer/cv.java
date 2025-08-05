package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Type;
import tb.kge;

/* loaded from: classes2.dex */
final class cv extends dt {

    /* renamed from: a  reason: collision with root package name */
    static final cv f3075a;

    static {
        kge.a(612939848);
        f3075a = new cv();
    }

    cv() {
    }

    @Override // com.alibaba.fastjson2.writer.bg
    public void a(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            jSONWriter.q();
            return;
        }
        jSONWriter.d((int) ((Short) obj).shortValue());
        if (((jSONWriter.e() | j) & JSONWriter.Feature.WriteClassName.mask) == 0 || type == Short.class || type == Short.TYPE) {
            return;
        }
        jSONWriter.c('S');
    }

    @Override // com.alibaba.fastjson2.writer.dt, com.alibaba.fastjson2.writer.bg
    public void b(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            jSONWriter.q();
        } else {
            jSONWriter.a(((Short) obj).shortValue());
        }
    }
}
