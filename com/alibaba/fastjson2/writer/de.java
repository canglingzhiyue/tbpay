package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.b;
import java.lang.reflect.Type;
import tb.kge;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class de extends dt {

    /* renamed from: a  reason: collision with root package name */
    static final de f3084a;
    static final byte[] b;
    static final long c;

    static {
        kge.a(-769274460);
        f3084a = new de();
        b = b.CC.a("[Byte");
        c = com.alibaba.fastjson2.util.c.b("[Byte");
    }

    de() {
    }

    @Override // com.alibaba.fastjson2.writer.bg
    public void a(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            jSONWriter.n();
            return;
        }
        Byte[] bArr = (Byte[]) obj;
        jSONWriter.j();
        for (int i = 0; i < bArr.length; i++) {
            if (i != 0) {
                jSONWriter.l();
            }
            Byte b2 = bArr[i];
            if (b2 == null) {
                jSONWriter.n();
            } else {
                jSONWriter.d((int) b2.byteValue());
            }
        }
        jSONWriter.k();
    }

    @Override // com.alibaba.fastjson2.writer.dt, com.alibaba.fastjson2.writer.bg
    public void b(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            jSONWriter.n();
            return;
        }
        if (jSONWriter.a(obj, type)) {
            jSONWriter.b(b, c);
        }
        Byte[] bArr = (Byte[]) obj;
        jSONWriter.c(bArr.length);
        for (Byte b2 : bArr) {
            if (b2 == null) {
                jSONWriter.n();
            } else {
                jSONWriter.d((int) b2.byteValue());
            }
        }
    }
}
