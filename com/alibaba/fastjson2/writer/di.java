package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Type;
import java.util.List;
import tb.kge;

/* loaded from: classes2.dex */
final class di extends dt {

    /* renamed from: a  reason: collision with root package name */
    final Class f3087a;
    final Class b;
    final long c;

    static {
        kge.a(-1285215157);
    }

    public di(Class cls, Class cls2, long j) {
        this.f3087a = cls;
        this.b = cls2;
        this.c = j;
    }

    @Override // com.alibaba.fastjson2.writer.bg
    public void a(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            jSONWriter.n();
            return;
        }
        List list = (List) obj;
        jSONWriter.j();
        for (int i = 0; i < list.size(); i++) {
            if (i != 0) {
                jSONWriter.l();
            }
            String str = (String) list.get(i);
            if (str == null) {
                jSONWriter.n();
            } else {
                jSONWriter.d(str);
            }
        }
        jSONWriter.k();
    }

    @Override // com.alibaba.fastjson2.writer.dt, com.alibaba.fastjson2.writer.bg
    public void b(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            jSONWriter.n();
            return;
        }
        Class<?> cls = obj.getClass();
        if (jSONWriter.d(obj) && this.f3087a != cls) {
            jSONWriter.c(TypeUtils.a((Class) cls));
        }
        List list = (List) obj;
        int size = list.size();
        jSONWriter.c(size);
        boolean a2 = jSONWriter.a(JSONWriter.Feature.WriteEnumUsingToString);
        for (int i = 0; i < size; i++) {
            Enum r4 = (Enum) list.get(i);
            Class<?> cls2 = r4.getClass();
            if (cls2 != this.b) {
                jSONWriter.a((Class) cls2).b(jSONWriter, r4, null, this.b, this.c | j);
            } else {
                jSONWriter.d(a2 ? r4.toString() : r4.name());
            }
        }
        jSONWriter.k();
    }
}
