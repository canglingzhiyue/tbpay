package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Type;
import tb.kge;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class da extends dt {

    /* renamed from: a  reason: collision with root package name */
    static final da f3080a;
    final Class b;

    static {
        kge.a(612940001);
        f3080a = new da(null);
    }

    public da(Class cls) {
        this.b = cls;
    }

    @Override // com.alibaba.fastjson2.writer.bg
    public void a(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            jSONWriter.q();
            return;
        }
        long longValue = ((Number) obj).longValue();
        jSONWriter.e(longValue);
        if (longValue < -2147483648L || longValue > 2147483647L || (JSONWriter.Feature.WriteClassName.mask & j) == 0) {
            return;
        }
        long e = jSONWriter.e();
        if ((JSONWriter.Feature.WriteClassName.mask & e) != 0) {
            return;
        }
        if ((e & (JSONWriter.Feature.WriteNonStringValueAsString.mask | JSONWriter.Feature.WriteLongAsString.mask)) != 0) {
            return;
        }
        jSONWriter.c(com.taobao.tao.image.d.LEVEL_L);
    }

    @Override // com.alibaba.fastjson2.writer.dt, com.alibaba.fastjson2.writer.bg
    public void b(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            jSONWriter.q();
        } else {
            jSONWriter.e(((Long) obj).longValue());
        }
    }
}
