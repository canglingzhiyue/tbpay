package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Type;
import java.util.List;
import tb.kge;

/* loaded from: classes2.dex */
public class bh<T> extends bt<T> {

    /* renamed from: a  reason: collision with root package name */
    public final FieldWriter f3040a;

    static {
        kge.a(1878969477);
    }

    public bh(Class<T> cls, String str, String str2, long j, List<FieldWriter> list) {
        super(cls, str, str2, j, list);
        this.f3040a = list.get(0);
    }

    @Override // com.alibaba.fastjson2.writer.bt, com.alibaba.fastjson2.writer.bg
    public final FieldWriter a(long j) {
        if (j == this.f3040a.m) {
            return this.f3040a;
        }
        return null;
    }

    @Override // com.alibaba.fastjson2.writer.bt, com.alibaba.fastjson2.writer.bg
    public void a(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        long e = this.C | j | jSONWriter.e();
        if (jSONWriter.e) {
            if ((e & JSONWriter.Feature.BeanToArray.mask) != 0) {
                c(jSONWriter, obj, obj2, type, j);
            } else {
                b(jSONWriter, obj, obj2, type, j);
            }
        } else if ((JSONWriter.Feature.BeanToArray.mask & e) != 0) {
            d(jSONWriter, obj, obj2, type, j);
        } else {
            if (!this.G) {
                if ((JSONWriter.Feature.ErrorOnNoneSerializable.mask & e) != 0) {
                    b();
                    return;
                } else if ((e & JSONWriter.Feature.IgnoreNoneSerializable.mask) != 0) {
                    jSONWriter.n();
                    return;
                }
            }
            if (a(jSONWriter)) {
                e(jSONWriter, obj, obj2, type, 0L);
                return;
            }
            jSONWriter.h();
            if (((this.C | j) & JSONWriter.Feature.WriteClassName.mask) != 0 || jSONWriter.a(obj, j)) {
                c(jSONWriter);
            }
            this.f3040a.b(jSONWriter, (JSONWriter) obj);
            jSONWriter.i();
        }
    }
}
