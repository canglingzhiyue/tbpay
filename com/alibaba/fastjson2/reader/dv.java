package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader;
import java.lang.reflect.Type;
import java.util.AbstractMap;
import java.util.Map;
import tb.kge;
import tb.riy;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class dv extends em {

    /* renamed from: a  reason: collision with root package name */
    final Type f3003a;
    final Type b;
    volatile bu c;
    volatile bu d;

    static {
        kge.a(164814850);
    }

    public dv(Type type, Type type2) {
        super(Map.Entry.class);
        this.f3003a = type;
        this.b = type2;
    }

    @Override // com.alibaba.fastjson2.reader.bu
    public Object a(JSONReader jSONReader, Type type, Object obj, long j) {
        Object a2;
        jSONReader.n();
        Object aM = jSONReader.aM();
        jSONReader.a(riy.CONDITION_IF_MIDDLE);
        if (this.b == null) {
            a2 = jSONReader.aM();
        } else {
            if (this.d == null) {
                this.d = jSONReader.a(this.b);
            }
            a2 = this.d.a(jSONReader, type, obj, j);
        }
        jSONReader.p();
        jSONReader.s();
        return new AbstractMap.SimpleEntry(aM, a2);
    }

    @Override // com.alibaba.fastjson2.reader.em, com.alibaba.fastjson2.reader.bu
    public Object b(JSONReader jSONReader, Type type, Object obj, long j) {
        Object a2;
        Object a3;
        int t = jSONReader.t();
        if (t != 2) {
            throw new JSONException(jSONReader.d("entryCnt must be 2, but " + t));
        }
        if (this.f3003a == null) {
            a2 = jSONReader.aM();
        } else {
            if (this.c == null) {
                this.c = jSONReader.a(this.f3003a);
            }
            a2 = this.c.a(jSONReader, type, obj, j);
        }
        if (this.b == null) {
            a3 = jSONReader.aM();
        } else {
            if (this.d == null) {
                this.d = jSONReader.a(this.b);
            }
            a3 = this.d.a(jSONReader, type, obj, j);
        }
        return new AbstractMap.SimpleEntry(a2, a3);
    }
}
