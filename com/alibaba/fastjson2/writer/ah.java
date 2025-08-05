package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import tb.kge;

/* loaded from: classes2.dex */
abstract class ah<T> extends FieldWriter<T> {
    final boolean z;

    static {
        kge.a(-810281862);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ah(String str, int i, long j, String str2, String str3, Class cls, Field field, Method method) {
        super(str, i, j, str2, str3, cls, cls, field, method);
        this.z = (JSONWriter.Feature.BrowserCompatible.mask & j) != 0;
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public final void a(JSONWriter jSONWriter, long j) {
        boolean z = ((jSONWriter.e() | this.d) & (JSONWriter.Feature.WriteNonStringValueAsString.mask | JSONWriter.Feature.WriteLongAsString.mask)) != 0;
        a(jSONWriter);
        if (!z) {
            z = this.z && !jSONWriter.e && (j > 9007199254740991L || j < -9007199254740991L);
        }
        if (z) {
            jSONWriter.d(Long.toString(j));
        } else {
            jSONWriter.e(j);
        }
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public void a(JSONWriter jSONWriter, T t) {
        Long l = (Long) a((ah<T>) t);
        if (l == null) {
            jSONWriter.n();
        } else {
            jSONWriter.e(l.longValue());
        }
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public boolean b(JSONWriter jSONWriter, T t) {
        try {
            Long l = (Long) a((ah<T>) t);
            if (l != null) {
                a(jSONWriter, l.longValue());
                return true;
            } else if (((this.d | jSONWriter.e()) & (JSONWriter.Feature.WriteNulls.mask | JSONWriter.Feature.NullAsDefaultValue.mask | JSONWriter.Feature.WriteNullNumberAsZero.mask)) == 0) {
                return false;
            } else {
                a(jSONWriter);
                jSONWriter.t();
                return true;
            }
        } catch (RuntimeException e) {
            if (!jSONWriter.f()) {
                throw e;
            }
            return false;
        }
    }
}
