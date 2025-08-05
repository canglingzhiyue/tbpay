package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Type;
import tb.kge;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class dm extends dt {

    /* renamed from: a  reason: collision with root package name */
    static dm f3091a;

    static {
        kge.a(2113094813);
        f3091a = new dm();
    }

    dm() {
    }

    @Override // com.alibaba.fastjson2.writer.bg
    public void a(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        jSONWriter.d((String) obj);
    }

    @Override // com.alibaba.fastjson2.writer.dt, com.alibaba.fastjson2.writer.bg
    public void b(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        jSONWriter.d((String) obj);
    }
}
