package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.b;
import java.lang.reflect.Type;
import tb.kge;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class dn extends dt {

    /* renamed from: a  reason: collision with root package name */
    static final byte[] f3092a;
    static final long b;
    static final dn c;

    static {
        kge.a(1529452476);
        f3092a = b.CC.a("[String");
        b = com.alibaba.fastjson2.util.c.b("[String");
        c = new dn();
    }

    dn() {
    }

    @Override // com.alibaba.fastjson2.writer.bg
    public void a(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            jSONWriter.p();
        } else {
            jSONWriter.a((String[]) obj);
        }
    }

    @Override // com.alibaba.fastjson2.writer.dt, com.alibaba.fastjson2.writer.bg
    public void b(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            jSONWriter.p();
            return;
        }
        if (jSONWriter.a(obj, type, j)) {
            jSONWriter.b(f3092a, b);
        }
        String[] strArr = (String[]) obj;
        jSONWriter.c(strArr.length);
        for (String str : strArr) {
            if (str == null) {
                if (jSONWriter.b(JSONWriter.Feature.NullAsDefaultValue.mask | JSONWriter.Feature.WriteNullStringAsEmpty.mask)) {
                    str = "";
                } else {
                    jSONWriter.n();
                }
            }
            jSONWriter.d(str);
        }
    }
}
