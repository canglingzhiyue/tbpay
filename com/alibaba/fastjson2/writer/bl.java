package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Type;
import java.util.List;
import tb.kge;

/* loaded from: classes2.dex */
public class bl<T> extends bt<T> {

    /* renamed from: a  reason: collision with root package name */
    public final FieldWriter f3044a;
    public final FieldWriter b;

    static {
        kge.a(1878969478);
    }

    public bl(Class<T> cls, String str, String str2, long j, List<FieldWriter> list) {
        super(cls, str, str2, j, list);
        this.f3044a = list.get(0);
        this.b = list.get(1);
    }

    @Override // com.alibaba.fastjson2.writer.bt, com.alibaba.fastjson2.writer.bg
    public final FieldWriter a(long j) {
        if (j == this.f3044a.m) {
            return this.f3044a;
        }
        if (j != this.b.m) {
            return null;
        }
        return this.b;
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
            this.f3044a.b(jSONWriter, (JSONWriter) obj);
            this.b.b(jSONWriter, (JSONWriter) obj);
            jSONWriter.i();
        }
    }
}
