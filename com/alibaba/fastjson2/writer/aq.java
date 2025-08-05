package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.List;
import tb.kge;

/* loaded from: classes2.dex */
final class aq<T> extends ap<T> {
    static {
        kge.a(-507651575);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public aq(String str, Type type, int i, long j, String str2, String str3, Type type2, Class cls, Field field) {
        super(str, type, i, j, str2, str3, type2, cls, field, null);
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public void a(JSONWriter jSONWriter, T t) {
        String a2;
        List list = (List) a((aq<T>) t);
        if (list == null) {
            jSONWriter.n();
            return;
        }
        boolean c = jSONWriter.c();
        if (c && (a2 = jSONWriter.a(this.f3039a, list)) != null) {
            jSONWriter.f(a2);
            jSONWriter.b((Object) list);
            return;
        }
        a(jSONWriter, false, list);
        if (!c) {
            return;
        }
        jSONWriter.b((Object) list);
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public boolean b(JSONWriter jSONWriter, T t) {
        List<String> list = (List) a((aq<T>) t);
        JSONWriter.a aVar = jSONWriter.b;
        if (list == null) {
            if (((this.d | aVar.a()) & (JSONWriter.Feature.WriteNulls.mask | JSONWriter.Feature.NullAsDefaultValue.mask | JSONWriter.Feature.WriteNullListAsEmpty.mask)) == 0) {
                return false;
            }
            a(jSONWriter);
            jSONWriter.p();
            return true;
        }
        String a2 = jSONWriter.a(this, list);
        if (a2 != null) {
            a(jSONWriter);
            jSONWriter.f(a2);
            jSONWriter.b((Object) list);
            return true;
        }
        if (this.z == String.class) {
            b(jSONWriter, true, list);
        } else {
            a(jSONWriter, true, (List) list);
        }
        jSONWriter.b((Object) list);
        return true;
    }
}
