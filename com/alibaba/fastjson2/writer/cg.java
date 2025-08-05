package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import tb.kge;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class cg extends dt {

    /* renamed from: a  reason: collision with root package name */
    static final cg f3062a;
    final com.alibaba.fastjson2.function.d<Object, BigDecimal> b;
    private final DecimalFormat c;

    static {
        kge.a(1345211581);
        f3062a = new cg(null, null);
    }

    public cg(DecimalFormat decimalFormat, com.alibaba.fastjson2.function.d<Object, BigDecimal> dVar) {
        this.c = decimalFormat;
        this.b = dVar;
    }

    @Override // com.alibaba.fastjson2.writer.bg
    public void a(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        com.alibaba.fastjson2.function.d<Object, BigDecimal> dVar = this.b;
        if (dVar != null && obj != null) {
            obj = dVar.apply(obj);
        }
        jSONWriter.a((BigDecimal) obj, j, this.c);
    }

    @Override // com.alibaba.fastjson2.writer.dt
    public com.alibaba.fastjson2.function.d b() {
        return this.b;
    }

    @Override // com.alibaba.fastjson2.writer.dt, com.alibaba.fastjson2.writer.bg
    public void b(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        com.alibaba.fastjson2.function.d<Object, BigDecimal> dVar = this.b;
        if (dVar != null && obj != null) {
            obj = dVar.apply(obj);
        }
        jSONWriter.a((BigDecimal) obj, j, this.c);
    }
}
