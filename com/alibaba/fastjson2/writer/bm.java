package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Type;
import java.util.List;
import tb.kge;

/* loaded from: classes2.dex */
public class bm<T> extends bt<T> {

    /* renamed from: a  reason: collision with root package name */
    public final FieldWriter f3045a;
    public final FieldWriter b;
    public final FieldWriter c;

    static {
        kge.a(1878969479);
    }

    public bm(Class<T> cls, String str, String str2, long j, List<FieldWriter> list) {
        super(cls, str, str2, j, list);
        this.f3045a = list.get(0);
        this.b = list.get(1);
        this.c = list.get(2);
    }

    @Override // com.alibaba.fastjson2.writer.bt, com.alibaba.fastjson2.writer.bg
    public final FieldWriter a(long j) {
        if (j == this.f3045a.m) {
            return this.f3045a;
        }
        if (j == this.b.m) {
            return this.b;
        }
        if (j != this.c.m) {
            return null;
        }
        return this.c;
    }

    @Override // com.alibaba.fastjson2.writer.bt, com.alibaba.fastjson2.writer.bg
    public void a(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        long e = this.C | j | jSONWriter.e();
        boolean z = (JSONWriter.Feature.BeanToArray.mask & e) != 0;
        if (jSONWriter.e) {
            if (z) {
                c(jSONWriter, obj, obj2, type, j);
            } else {
                b(jSONWriter, obj, obj2, type, j);
            }
        } else if (z) {
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
            this.f3045a.b(jSONWriter, (JSONWriter) obj);
            this.b.b(jSONWriter, (JSONWriter) obj);
            this.c.b(jSONWriter, (JSONWriter) obj);
            jSONWriter.i();
        }
    }
}
