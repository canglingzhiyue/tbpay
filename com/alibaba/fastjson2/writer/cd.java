package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.b;
import java.lang.reflect.Type;
import java.util.concurrent.atomic.AtomicLong;
import tb.kge;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class cd extends dt {

    /* renamed from: a  reason: collision with root package name */
    static final cd f3059a;
    static final byte[] b;
    final Class c;

    static {
        kge.a(2038743507);
        f3059a = new cd(null);
        b = b.CC.a("AtomicLong");
    }

    public cd(Class cls) {
        this.c = cls;
    }

    @Override // com.alibaba.fastjson2.writer.bg
    public void a(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            jSONWriter.q();
        } else {
            jSONWriter.e(((Number) obj).longValue());
        }
    }

    @Override // com.alibaba.fastjson2.writer.dt, com.alibaba.fastjson2.writer.bg
    public void b(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            jSONWriter.q();
            return;
        }
        AtomicLong atomicLong = (AtomicLong) obj;
        if (jSONWriter.a(atomicLong, type)) {
            jSONWriter.b(b, -1591858996898070466L);
        }
        jSONWriter.e(atomicLong.longValue());
    }
}
