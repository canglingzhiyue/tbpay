package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.b;
import java.lang.reflect.Type;
import java.text.DecimalFormat;
import tb.kge;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class cu extends dt {

    /* renamed from: a  reason: collision with root package name */
    static final cu f3074a;
    static final byte[] b;
    static final long c;
    private final DecimalFormat d;
    private final com.alibaba.fastjson2.function.d<Object, float[]> e;

    static {
        kge.a(1361011672);
        f3074a = new cu(null, null);
        b = b.CC.a("[F");
        c = com.alibaba.fastjson2.util.c.b("[F");
    }

    public cu(com.alibaba.fastjson2.function.d<Object, float[]> dVar, DecimalFormat decimalFormat) {
        this.e = dVar;
        this.d = decimalFormat;
    }

    public cu(DecimalFormat decimalFormat) {
        this.d = decimalFormat;
        this.e = null;
    }

    @Override // com.alibaba.fastjson2.writer.bg
    public void a(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        com.alibaba.fastjson2.function.d<Object, float[]> dVar = this.e;
        if (dVar != null && obj != null) {
            obj = dVar.apply(obj);
        }
        float[] fArr = (float[]) obj;
        DecimalFormat decimalFormat = this.d;
        if (decimalFormat == null) {
            jSONWriter.a(fArr);
        } else {
            jSONWriter.a(fArr, decimalFormat);
        }
    }

    @Override // com.alibaba.fastjson2.writer.dt, com.alibaba.fastjson2.writer.bg
    public void b(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        if (jSONWriter.a(obj, type)) {
            jSONWriter.b(b, c);
        }
        com.alibaba.fastjson2.function.d<Object, float[]> dVar = this.e;
        if (dVar != null && obj != null) {
            obj = dVar.apply(obj);
        }
        jSONWriter.a((float[]) obj);
    }
}
