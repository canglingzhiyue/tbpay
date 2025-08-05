package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Type;
import java.util.List;
import tb.kge;

/* loaded from: classes2.dex */
public class bi<T> extends bt<T> {

    /* renamed from: a  reason: collision with root package name */
    public final FieldWriter f3041a;
    public final FieldWriter b;
    public final FieldWriter c;
    public final FieldWriter d;
    public final FieldWriter e;
    public final FieldWriter f;
    public final FieldWriter g;
    public final FieldWriter h;
    public final FieldWriter i;
    public final FieldWriter j;

    static {
        kge.a(-1881488309);
    }

    public bi(Class<T> cls, String str, String str2, long j, List<FieldWriter> list) {
        super(cls, str, str2, j, list);
        this.f3041a = list.get(0);
        this.b = list.get(1);
        this.c = list.get(2);
        this.d = list.get(3);
        this.e = list.get(4);
        this.f = list.get(5);
        this.g = list.get(6);
        this.h = list.get(7);
        this.i = list.get(8);
        this.j = list.get(9);
    }

    @Override // com.alibaba.fastjson2.writer.bt, com.alibaba.fastjson2.writer.bg
    public final FieldWriter a(long j) {
        if (j == this.f3041a.m) {
            return this.f3041a;
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
        if (j == this.f.m) {
            return this.f;
        }
        if (j == this.g.m) {
            return this.g;
        }
        if (j == this.h.m) {
            return this.h;
        }
        if (j == this.i.m) {
            return this.i;
        }
        if (j != this.j.m) {
            return null;
        }
        return this.j;
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
            this.f3041a.b(jSONWriter, (JSONWriter) obj);
            this.b.b(jSONWriter, (JSONWriter) obj);
            this.c.b(jSONWriter, (JSONWriter) obj);
            this.d.b(jSONWriter, (JSONWriter) obj);
            this.e.b(jSONWriter, (JSONWriter) obj);
            this.f.b(jSONWriter, (JSONWriter) obj);
            this.g.b(jSONWriter, (JSONWriter) obj);
            this.h.b(jSONWriter, (JSONWriter) obj);
            this.i.b(jSONWriter, (JSONWriter) obj);
            this.j.b(jSONWriter, (JSONWriter) obj);
            jSONWriter.i();
        }
    }
}
