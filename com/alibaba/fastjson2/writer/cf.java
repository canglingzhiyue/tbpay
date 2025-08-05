package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Type;
import java.util.concurrent.atomic.AtomicReference;
import tb.kge;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class cf extends dt {

    /* renamed from: a  reason: collision with root package name */
    static final cf f3061a;
    final Class b;

    static {
        kge.a(1594081876);
        f3061a = new cf(null);
    }

    public cf(Class cls) {
        this.b = cls;
    }

    @Override // com.alibaba.fastjson2.writer.bg
    public void a(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            jSONWriter.n();
            return;
        }
        Object obj3 = ((AtomicReference) obj).get();
        if (obj3 == null) {
            jSONWriter.n();
        }
        jSONWriter.f(obj3);
    }

    @Override // com.alibaba.fastjson2.writer.dt, com.alibaba.fastjson2.writer.bg
    public void b(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            jSONWriter.n();
            return;
        }
        Object obj3 = ((AtomicReference) obj).get();
        if (obj3 == null) {
            jSONWriter.n();
        }
        jSONWriter.f(obj3);
    }
}
