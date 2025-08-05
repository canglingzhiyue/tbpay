package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Type;
import java.util.List;
import tb.kge;

/* loaded from: classes2.dex */
public class bp<T> extends bt<T> {

    /* renamed from: a  reason: collision with root package name */
    public final FieldWriter f3048a;
    public final FieldWriter b;
    public final FieldWriter c;
    public final FieldWriter d;
    public final FieldWriter e;
    public final FieldWriter f;

    static {
        kge.a(1878969482);
    }

    public bp(Class<T> cls, String str, String str2, long j, List<FieldWriter> list) {
        super(cls, str, str2, j, list);
        this.f3048a = list.get(0);
        this.b = list.get(1);
        this.c = list.get(2);
        this.d = list.get(3);
        this.e = list.get(4);
        this.f = list.get(5);
    }

    @Override // com.alibaba.fastjson2.writer.bt, com.alibaba.fastjson2.writer.bg
    public final FieldWriter a(long j) {
        if (j == this.f3048a.m) {
            return this.f3048a;
        }
        if (j == this.b.m) {
            return this.b;
        }
        if (j == this.c.m) {
            return this.c;
        }
        if (j == this.d.m) {
            return this.d;
        }
        if (j == this.e.m) {
            return this.e;
        }
        if (j != this.f.m) {
            return null;
        }
        return this.f;
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
            d(jSONWriter, obj, obj2, type, this.C | j);
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
            this.f3048a.b(jSONWriter, (JSONWriter) obj);
            this.b.b(jSONWriter, (JSONWriter) obj);
            this.c.b(jSONWriter, (JSONWriter) obj);
            this.d.b(jSONWriter, (JSONWriter) obj);
            this.e.b(jSONWriter, (JSONWriter) obj);
            this.f.b(jSONWriter, (JSONWriter) obj);
            jSONWriter.i();
        }
    }
}
