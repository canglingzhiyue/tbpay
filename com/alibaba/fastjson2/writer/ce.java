package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Type;
import java.util.concurrent.atomic.AtomicLongArray;
import tb.kge;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class ce extends dt {

    /* renamed from: a  reason: collision with root package name */
    static final ce f3060a;

    static {
        kge.a(-1675367354);
        f3060a = new ce();
    }

    ce() {
    }

    @Override // com.alibaba.fastjson2.writer.bg
    public void a(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            jSONWriter.p();
            return;
        }
        AtomicLongArray atomicLongArray = (AtomicLongArray) obj;
        jSONWriter.j();
        for (int i = 0; i < atomicLongArray.length(); i++) {
            if (i != 0) {
                jSONWriter.l();
            }
            jSONWriter.e(atomicLongArray.get(i));
        }
        jSONWriter.k();
    }

    @Override // com.alibaba.fastjson2.writer.dt, com.alibaba.fastjson2.writer.bg
    public void b(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            jSONWriter.p();
            return;
        }
        AtomicLongArray atomicLongArray = (AtomicLongArray) obj;
        jSONWriter.c(atomicLongArray.length());
        for (int i = 0; i < atomicLongArray.length(); i++) {
            jSONWriter.e(atomicLongArray.get(i));
        }
    }
}
