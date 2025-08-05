package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Type;
import java.text.DecimalFormat;
import tb.kge;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class ct extends dt {

    /* renamed from: a  reason: collision with root package name */
    static final ct f3073a;
    private final DecimalFormat b;

    static {
        kge.a(610106448);
        f3073a = new ct(null);
    }

    public ct(DecimalFormat decimalFormat) {
        this.b = decimalFormat;
    }

    @Override // com.alibaba.fastjson2.writer.bg
    public void a(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            jSONWriter.n();
            return;
        }
        DecimalFormat decimalFormat = this.b;
        if (decimalFormat != null) {
            jSONWriter.a(decimalFormat.format(obj));
            return;
        }
        jSONWriter.a(((Float) obj).floatValue());
        if (((jSONWriter.e() | j) & JSONWriter.Feature.WriteClassName.mask) == 0 || type == Float.class || type == Float.TYPE) {
            return;
        }
        jSONWriter.c('F');
    }

    @Override // com.alibaba.fastjson2.writer.dt, com.alibaba.fastjson2.writer.bg
    public void b(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            jSONWriter.n();
        } else {
            jSONWriter.a(((Float) obj).floatValue());
        }
    }
}
