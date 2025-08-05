package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Type;
import java.util.List;
import tb.kge;

/* loaded from: classes2.dex */
public class by extends bt<Exception> {
    static {
        kge.a(-1867962237);
    }

    public by(Class cls, long j, List<FieldWriter> list) {
        super(cls, null, null, j, list);
    }

    @Override // com.alibaba.fastjson2.writer.bt, com.alibaba.fastjson2.writer.bg
    public void a(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        if (jSONWriter.e) {
            b(jSONWriter, obj, obj2, type, j);
        } else if (a(jSONWriter)) {
            b(jSONWriter, obj);
        } else {
            jSONWriter.h();
            if ((jSONWriter.c(j) & (JSONWriter.Feature.WriteClassName.mask | JSONWriter.Feature.WriteThrowableClassName.mask)) != 0) {
                c(jSONWriter);
            }
            int size = this.s.size();
            for (int i = 0; i < size; i++) {
                this.s.get(i).b(jSONWriter, (JSONWriter) obj);
            }
            jSONWriter.i();
        }
    }

    @Override // com.alibaba.fastjson2.writer.bt, com.alibaba.fastjson2.writer.bg
    public void b(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        b(jSONWriter);
        int size = this.s.size();
        jSONWriter.h();
        for (int i = 0; i < size; i++) {
            this.s.get(i).b(jSONWriter, (JSONWriter) obj);
        }
        jSONWriter.i();
    }
}
