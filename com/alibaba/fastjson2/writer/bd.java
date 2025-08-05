package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Method;
import tb.aak;
import tb.kge;

/* loaded from: classes2.dex */
final class bd<T> extends FieldWriter<T> {
    final boolean A;
    final boolean B;
    final boolean C;
    final com.alibaba.fastjson2.function.d<T, String> z;

    static {
        kge.a(-113098488);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public bd(String str, int i, long j, String str2, String str3, Method method, com.alibaba.fastjson2.function.d<T, String> dVar) {
        super(str, i, j, str2, str3, String.class, String.class, null, method);
        this.z = dVar;
        this.A = com.taobao.android.weex_framework.util.a.ATOM_symbol.equals(str2);
        this.B = "trim".equals(str2);
        this.C = (j & aak.RAW_VALUE_MASK) != 0;
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public Object a(T t) {
        return this.z.apply(t);
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public void a(JSONWriter jSONWriter, T t) {
        String apply = this.z.apply(t);
        if (this.B && apply != null) {
            apply = apply.trim();
        }
        if (this.A && jSONWriter.e) {
            jSONWriter.e(apply);
        } else if (this.C) {
            jSONWriter.a(apply);
        } else {
            jSONWriter.d(apply);
        }
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public boolean b(JSONWriter jSONWriter, T t) {
        try {
            String apply = this.z.apply(t);
            if (apply == null && ((this.d | jSONWriter.e()) & (JSONWriter.Feature.WriteNulls.mask | JSONWriter.Feature.NullAsDefaultValue.mask | JSONWriter.Feature.WriteNullStringAsEmpty.mask)) == 0) {
                return false;
            }
            a(jSONWriter);
            if (apply == null && (this.d & (JSONWriter.Feature.NullAsDefaultValue.mask | JSONWriter.Feature.WriteNullStringAsEmpty.mask)) != 0) {
                jSONWriter.d("");
                return true;
            }
            if (this.B && apply != null) {
                apply = apply.trim();
            }
            if (this.A && jSONWriter.e) {
                jSONWriter.e(apply);
            } else if (this.C) {
                jSONWriter.a(apply);
            } else {
                jSONWriter.d(apply);
            }
            return true;
        } catch (RuntimeException e) {
            if ((jSONWriter.c(this.d) | JSONWriter.Feature.IgnoreNonFieldGetter.mask) == 0) {
                throw e;
            }
            return false;
        }
    }
}
