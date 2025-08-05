package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.b;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import tb.kge;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class bz extends dt {

    /* renamed from: a  reason: collision with root package name */
    static final bz f3055a;
    static final byte[] b;

    static {
        kge.a(680514728);
        f3055a = new bz();
        b = b.CC.a("[BigDecimal");
    }

    bz() {
    }

    @Override // com.alibaba.fastjson2.writer.bg
    public void a(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            if (!jSONWriter.b(JSONWriter.Feature.NullAsDefaultValue.mask | JSONWriter.Feature.WriteNullListAsEmpty.mask)) {
                jSONWriter.n();
                return;
            }
            jSONWriter.j();
            jSONWriter.k();
            return;
        }
        BigDecimal[] bigDecimalArr = (BigDecimal[]) obj;
        jSONWriter.j();
        for (int i = 0; i < bigDecimalArr.length; i++) {
            if (i != 0) {
                jSONWriter.l();
            }
            jSONWriter.a(bigDecimalArr[i], 0L, (DecimalFormat) null);
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
            jSONWriter.b(b, -2138534155605614069L);
        }
        BigDecimal[] bigDecimalArr = (BigDecimal[]) obj;
        jSONWriter.c(bigDecimalArr.length);
        for (BigDecimal bigDecimal : bigDecimalArr) {
            jSONWriter.a(bigDecimal, 0L, (DecimalFormat) null);
        }
    }
}
