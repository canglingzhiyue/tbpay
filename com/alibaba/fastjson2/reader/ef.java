package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONReader;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;
import tb.kge;

/* loaded from: classes2.dex */
public final class ef extends em {
    public static final long HASH_TYPE;

    /* renamed from: a  reason: collision with root package name */
    static final ef f3011a;

    static {
        kge.a(2095175100);
        f3011a = new ef();
        HASH_TYPE = com.alibaba.fastjson2.util.c.b("[String");
    }

    ef() {
        super(Long[].class);
    }

    @Override // com.alibaba.fastjson2.reader.bu
    public Object a(JSONReader jSONReader, Type type, Object obj, long j) {
        return jSONReader.aC();
    }

    @Override // com.alibaba.fastjson2.reader.em, com.alibaba.fastjson2.reader.bu
    public Object b(JSONReader jSONReader, Type type, Object obj, long j) {
        return jSONReader.aC();
    }

    @Override // com.alibaba.fastjson2.reader.em, com.alibaba.fastjson2.reader.bu
    public Object b(Collection collection) {
        String[] strArr = new String[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            strArr[i] = next == null ? null : next instanceof String ? (String) next : next.toString();
            i++;
        }
        return strArr;
    }

    @Override // com.alibaba.fastjson2.reader.em, com.alibaba.fastjson2.reader.bu
    public /* bridge */ /* synthetic */ Class bm_() {
        return super.bm_();
    }
}
