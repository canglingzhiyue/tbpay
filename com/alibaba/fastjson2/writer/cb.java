package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.b;
import java.lang.reflect.Type;
import java.util.concurrent.atomic.AtomicInteger;
import tb.kge;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class cb extends dt {

    /* renamed from: a  reason: collision with root package name */
    static final cb f3057a;
    static final byte[] b;
    final Class c;

    static {
        kge.a(-1610272121);
        f3057a = new cb(null);
        b = b.CC.a("AtomicInteger");
    }

    public cb(Class cls) {
        this.c = cls;
    }

    @Override // com.alibaba.fastjson2.writer.bg
    public void a(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            jSONWriter.q();
        } else {
            jSONWriter.d(((AtomicInteger) obj).intValue());
        }
    }

    @Override // com.alibaba.fastjson2.writer.dt, com.alibaba.fastjson2.writer.bg
    public void b(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            jSONWriter.q();
            return;
        }
        AtomicInteger atomicInteger = (AtomicInteger) obj;
        if (jSONWriter.a(atomicInteger, type)) {
            jSONWriter.b(b, 7576651708426282938L);
        }
        jSONWriter.d(atomicInteger.intValue());
    }
}
