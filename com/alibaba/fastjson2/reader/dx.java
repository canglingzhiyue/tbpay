package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class dx extends dy {
    static {
        kge.a(1220573825);
    }

    public dx(Class cls, Class cls2, long j) {
        super(cls, cls2, null, String.class, j, null);
    }

    @Override // com.alibaba.fastjson2.reader.dy, com.alibaba.fastjson2.reader.bu
    public Object a(JSONReader jSONReader, Type type, Object obj, long j) {
        Object put;
        if (jSONReader.w) {
            return b(jSONReader, type, obj, j);
        }
        if (!jSONReader.n()) {
            if (jSONReader.a() == '[') {
                jSONReader.D();
                if (jSONReader.a() == '{') {
                    Object a2 = a(jSONReader, String.class, obj, j);
                    if (jSONReader.r()) {
                        jSONReader.s();
                        return a2;
                    }
                }
                throw new JSONException(jSONReader.d("expect '{', but '['"));
            } else if (jSONReader.o()) {
                return null;
            }
        }
        long j2 = jSONReader.f2934a.p | j;
        Map hashMap = this.b == HashMap.class ? new HashMap() : (Map) a(j2);
        int i = 0;
        while (!jSONReader.p()) {
            String I = jSONReader.I();
            String az = jSONReader.az();
            if ((i != 0 || (JSONReader.Feature.SupportAutoType.mask & j2) == 0 || !I.equals(d())) && ((az != null || (JSONReader.Feature.IgnoreNullPropertyValue.mask & j2) == 0) && (put = hashMap.put(I, az)) != null && (JSONReader.Feature.DuplicateKeyValueAsArray.mask & j2) != 0)) {
                if (put instanceof Collection) {
                    ((Collection) put).add(az);
                    hashMap.put(I, put);
                } else {
                    hashMap.put(I, JSONArray.of(put, (Object) az));
                }
            }
            i++;
        }
        jSONReader.s();
        return hashMap;
    }
}
