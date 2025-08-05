package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Type;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.kge;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class ca extends dt {

    /* renamed from: a  reason: collision with root package name */
    static final ca f3056a;

    static {
        kge.a(791354737);
        f3056a = new ca();
    }

    ca() {
    }

    @Override // com.alibaba.fastjson2.writer.bg
    public void a(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            jSONWriter.r();
        } else {
            jSONWriter.b(((AtomicBoolean) obj).get());
        }
    }
}
