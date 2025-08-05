package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Type;
import java.util.UUID;
import tb.kge;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class dq extends dt {

    /* renamed from: a  reason: collision with root package name */
    static final dq f3095a;

    static {
        kge.a(-1503916249);
        f3095a = new dq();
    }

    dq() {
    }

    @Override // com.alibaba.fastjson2.writer.bg
    public void a(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            jSONWriter.n();
        } else {
            jSONWriter.a((UUID) obj);
        }
    }

    @Override // com.alibaba.fastjson2.writer.dt, com.alibaba.fastjson2.writer.bg
    public void b(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            jSONWriter.n();
        } else {
            jSONWriter.a((UUID) obj);
        }
    }
}
