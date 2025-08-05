package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Type;
import java.util.concurrent.atomic.AtomicIntegerArray;
import tb.kge;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class cc extends dt {

    /* renamed from: a  reason: collision with root package name */
    static final cc f3058a;

    static {
        kge.a(-678310894);
        f3058a = new cc();
    }

    cc() {
    }

    @Override // com.alibaba.fastjson2.writer.bg
    public void a(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            jSONWriter.p();
            return;
        }
        AtomicIntegerArray atomicIntegerArray = (AtomicIntegerArray) obj;
        jSONWriter.j();
        for (int i = 0; i < atomicIntegerArray.length(); i++) {
            if (i != 0) {
                jSONWriter.l();
            }
            jSONWriter.d(atomicIntegerArray.get(i));
        }
        jSONWriter.k();
    }

    @Override // com.alibaba.fastjson2.writer.dt, com.alibaba.fastjson2.writer.bg
    public void b(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            jSONWriter.p();
            return;
        }
        AtomicIntegerArray atomicIntegerArray = (AtomicIntegerArray) obj;
        jSONWriter.c(atomicIntegerArray.length());
        for (int i = 0; i < atomicIntegerArray.length(); i++) {
            jSONWriter.d(atomicIntegerArray.get(i));
        }
    }
}
