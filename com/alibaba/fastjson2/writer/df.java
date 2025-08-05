package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.b;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.zip.GZIPOutputStream;
import tb.kge;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class df extends dt {

    /* renamed from: a  reason: collision with root package name */
    static final df f3085a;
    static final byte[] b;
    static final long c;
    private final com.alibaba.fastjson2.function.d<Object, byte[]> d;

    static {
        kge.a(1814440701);
        f3085a = new df(null);
        b = b.CC.a("[B");
        c = com.alibaba.fastjson2.util.c.b("[B");
    }

    public df(com.alibaba.fastjson2.function.d<Object, byte[]> dVar) {
        this.d = dVar;
    }

    @Override // com.alibaba.fastjson2.writer.bg
    public void a(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            jSONWriter.p();
            return;
        }
        com.alibaba.fastjson2.function.d<Object, byte[]> dVar = this.d;
        if (dVar != null) {
            obj = dVar.apply(obj);
        }
        byte[] bArr = (byte[]) obj;
        String c2 = jSONWriter.b.c();
        GZIPOutputStream gZIPOutputStream = null;
        if ("millis".equals(c2)) {
            c2 = null;
        }
        if ("gzip".equals(c2) || "gzip,base64".equals(c2)) {
            try {
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    gZIPOutputStream = bArr.length < 512 ? new GZIPOutputStream(byteArrayOutputStream, bArr.length) : new GZIPOutputStream(byteArrayOutputStream);
                    gZIPOutputStream.write(bArr);
                    gZIPOutputStream.finish();
                    bArr = byteArrayOutputStream.toByteArray();
                } catch (IOException e) {
                    throw new JSONException("write gzipBytes error", e);
                }
            } finally {
                com.alibaba.fastjson2.util.d.a(gZIPOutputStream);
            }
        }
        if ("base64".equals(c2) || "gzip,base64".equals(c2) || (jSONWriter.c(j) & JSONWriter.Feature.WriteByteArrayAsBase64.mask) != 0) {
            jSONWriter.b(bArr);
            return;
        }
        jSONWriter.j();
        for (int i = 0; i < bArr.length; i++) {
            if (i != 0) {
                jSONWriter.l();
            }
            jSONWriter.d((int) bArr[i]);
        }
        jSONWriter.k();
    }

    @Override // com.alibaba.fastjson2.writer.dt, com.alibaba.fastjson2.writer.bg
    public void b(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        if (jSONWriter.a(obj, type)) {
            if (obj == byte[].class) {
                jSONWriter.b(b, c);
            } else {
                jSONWriter.c(obj.getClass().getName());
            }
        }
        com.alibaba.fastjson2.function.d<Object, byte[]> dVar = this.d;
        if (dVar != null && obj != null) {
            obj = dVar.apply(obj);
        }
        jSONWriter.a((byte[]) obj);
    }
}
