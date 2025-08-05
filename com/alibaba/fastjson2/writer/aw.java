package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import tb.kge;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class aw<T> extends FieldWriter<T> {
    final Class A;
    bg B;
    final Type z;

    static {
        kge.a(-1135817965);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public aw(String str, Type type, int i, long j, String str2, String str3, Type type2, Class cls, Field field) {
        super(str, i, j, str2, str3, type2, cls, field, null);
        this.z = type;
        this.A = type instanceof Class ? (Class) type : TypeUtils.b(type);
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public bg a(JSONWriter jSONWriter, Class cls) {
        return cls == String[].class ? dn.c : cls == Float[].class ? this.g != null ? new bv(Float.class, this.g) : bv.FLOAT_ARRAY : cls == Double[].class ? this.g != null ? new bv(Double.class, this.g) : bv.DOUBLE_ARRAY : cls == BigDecimal[].class ? this.g != null ? new bv(BigDecimal.class, this.g) : bv.DECIMAL_ARRAY : jSONWriter.a(cls);
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public bg a(JSONWriter jSONWriter, Type type) {
        if (type == null || type == this.z) {
            bg bgVar = this.B;
            if (bgVar != null) {
                return bgVar;
            }
            this.B = type == Double.class ? new cq(new DecimalFormat(this.f)) : type == Float.class ? new ct(new DecimalFormat(this.f)) : (type != BigDecimal.class || this.g == null) ? jSONWriter.a(this.z, this.A) : new cg(this.g, null);
            return this.B;
        }
        return jSONWriter.a(type, (Class) TypeUtils.e(type));
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public void a(JSONWriter jSONWriter, T t) {
        Object[] objArr = (Object[]) a((aw<T>) t);
        if (objArr == null) {
            jSONWriter.n();
        } else {
            a(jSONWriter, false, objArr);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x009e, code lost:
        if (r16 != false) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(com.alibaba.fastjson2.JSONWriter r19, boolean r20, java.lang.Object[] r21) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.writer.aw.a(com.alibaba.fastjson2.JSONWriter, boolean, java.lang.Object[]):void");
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public boolean b(JSONWriter jSONWriter, T t) {
        Object[] objArr = (Object[]) a((aw<T>) t);
        if (objArr != null) {
            a(jSONWriter, true, objArr);
            return true;
        } else if (((this.d | jSONWriter.e()) & (JSONWriter.Feature.WriteNulls.mask | JSONWriter.Feature.NullAsDefaultValue.mask | JSONWriter.Feature.WriteNullListAsEmpty.mask)) == 0) {
            return false;
        } else {
            a(jSONWriter);
            jSONWriter.p();
            return true;
        }
    }
}
