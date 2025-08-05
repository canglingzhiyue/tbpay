package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Type;
import tb.kge;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class co extends em {

    /* renamed from: a  reason: collision with root package name */
    static final co f2971a;
    static final long b;

    static {
        kge.a(208781676);
        f2971a = new co();
        b = com.alibaba.fastjson2.util.c.b("java.lang.Class");
    }

    co() {
        super(Class.class);
    }

    @Override // com.alibaba.fastjson2.reader.bu
    public Object a(JSONReader jSONReader, Type type, Object obj, long j) {
        long E = jSONReader.E();
        JSONReader.c cVar = jSONReader.f2934a;
        JSONReader.a a2 = cVar.a();
        if (a2 != null) {
            Class<?> a3 = a2.a(E, Class.class, j);
            if (a3 == null) {
                a3 = a2.a(jSONReader.aG(), Class.class, j);
            }
            if (a3 != null) {
                return a3;
            }
        }
        String aG = jSONReader.aG();
        if (!(((j | cVar.p) & JSONReader.Feature.SupportClassForName.mask) != 0)) {
            throw new JSONException(jSONReader.d("not support ClassForName : " + aG + ", you can config 'JSONReader.Feature.SupportClassForName'"));
        }
        Class a4 = TypeUtils.a(aG);
        if (a4 != null) {
            return a4;
        }
        Class<?> b2 = cVar.w.b(aG, (Class<?>) null, JSONReader.Feature.SupportAutoType.mask);
        if (b2 != null) {
            return b2;
        }
        throw new JSONException(jSONReader.d("class not found " + aG));
    }

    @Override // com.alibaba.fastjson2.reader.em, com.alibaba.fastjson2.reader.bu
    public Object b(JSONReader jSONReader, Type type, Object obj, long j) {
        if (!jSONReader.a((byte) -110) || jSONReader.F() == b) {
            return a(jSONReader, type, obj, j);
        }
        throw new JSONException(jSONReader.d("not support autoType : " + jSONReader.aG()));
    }
}
