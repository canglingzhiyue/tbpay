package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.b;
import java.lang.reflect.Type;
import java.text.DecimalFormat;
import tb.kge;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class cr extends dt {

    /* renamed from: a  reason: collision with root package name */
    static final cr f3071a;
    static final byte[] b;
    static final long c;
    final DecimalFormat d;
    private final com.alibaba.fastjson2.function.d<Object, double[]> e = null;

    static {
        kge.a(-689480795);
        f3071a = new cr(null);
        b = b.CC.a("[D");
        c = com.alibaba.fastjson2.util.c.b("[D");
    }

    public cr(DecimalFormat decimalFormat) {
        this.d = decimalFormat;
    }

    @Override // com.alibaba.fastjson2.writer.bg
    public void a(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        com.alibaba.fastjson2.function.d<Object, double[]> dVar = this.e;
        if (dVar != null && obj != null) {
            obj = dVar.apply(obj);
        }
        double[] dArr = (double[]) obj;
        DecimalFormat decimalFormat = this.d;
        if (decimalFormat == null) {
            jSONWriter.a(dArr);
        } else {
            jSONWriter.a(dArr, decimalFormat);
        }
    }

    @Override // com.alibaba.fastjson2.writer.dt, com.alibaba.fastjson2.writer.bg
    public void b(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        if (jSONWriter.a(obj, type)) {
            jSONWriter.b(b, c);
        }
        com.alibaba.fastjson2.function.d<Object, double[]> dVar = this.e;
        if (dVar != null && obj != null) {
            obj = dVar.apply(obj);
        }
        jSONWriter.a((double[]) obj);
    }
}
