package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Field;
import java.util.Date;
import tb.kge;

/* loaded from: classes2.dex */
final class m<T> extends FieldWriterDate<T> {
    static {
        kge.a(467567865);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public m(String str, int i, long j, String str2, String str3, Field field) {
        super(str, i, j, str2, str3, Date.class, Date.class, field, null);
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public void a(JSONWriter jSONWriter, T t) {
        Date date = (Date) a((m<T>) t);
        if (date == null) {
            jSONWriter.n();
        } else {
            a(jSONWriter, false, date.getTime());
        }
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public boolean b(JSONWriter jSONWriter, T t) {
        Date date = (Date) a((m<T>) t);
        if (date != null) {
            b(jSONWriter, date.getTime());
            return true;
        } else if (((this.d | jSONWriter.e()) & JSONWriter.Feature.WriteNulls.mask) == 0) {
            return false;
        } else {
            a(jSONWriter);
            jSONWriter.n();
            return true;
        }
    }
}
