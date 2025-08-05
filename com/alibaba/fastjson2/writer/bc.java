package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Field;
import tb.kge;

/* loaded from: classes2.dex */
final class bc<T> extends FieldWriter<T> {
    static {
        kge.a(788548406);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public bc(String str, int i, long j, String str2, String str3, Field field) {
        super(str, i, j, str2, str3, String.class, String.class, field, null);
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public void a(JSONWriter jSONWriter, T t) {
        String str = (String) a((bc<T>) t);
        if (str == null) {
            jSONWriter.n();
            return;
        }
        if (this.u) {
            str = str.trim();
        }
        if (this.v) {
            jSONWriter.a(str);
        } else {
            jSONWriter.d(str);
        }
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public boolean b(JSONWriter jSONWriter, T t) {
        String str = (String) a((bc<T>) t);
        if (str == null) {
            long e = this.d | jSONWriter.e();
            if (((JSONWriter.Feature.WriteNulls.mask | JSONWriter.Feature.NullAsDefaultValue.mask | JSONWriter.Feature.WriteNullStringAsEmpty.mask) & e) == 0 || (JSONWriter.Feature.NotWriteDefaultValue.mask & e) != 0) {
                return false;
            }
            if ((e & (JSONWriter.Feature.NullAsDefaultValue.mask | JSONWriter.Feature.WriteNullStringAsEmpty.mask)) != 0) {
                a(jSONWriter);
                jSONWriter.d("");
                return true;
            }
        }
        if (this.u && str != null) {
            str = str.trim();
        }
        a(jSONWriter);
        if (this.t && jSONWriter.e) {
            jSONWriter.e(str);
        } else if (this.v) {
            jSONWriter.a(str);
        } else {
            jSONWriter.d(str);
        }
        return true;
    }
}
