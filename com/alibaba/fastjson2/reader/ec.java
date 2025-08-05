package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.JSONReader;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Map;
import tb.kge;

/* loaded from: classes2.dex */
public final class ec extends em {
    public static final ec INSTANCE;

    static {
        kge.a(-1783133749);
        INSTANCE = new ec();
    }

    public ec() {
        super(Object.class);
    }

    @Override // com.alibaba.fastjson2.reader.em, com.alibaba.fastjson2.reader.bu
    public Object a(long j) {
        return new JSONObject();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0127  */
    @Override // com.alibaba.fastjson2.reader.bu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(com.alibaba.fastjson2.JSONReader r24, java.lang.reflect.Type r25, java.lang.Object r26, long r27) {
        /*
            Method dump skipped, instructions count: 714
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.reader.ec.a(com.alibaba.fastjson2.JSONReader, java.lang.reflect.Type, java.lang.Object, long):java.lang.Object");
    }

    @Override // com.alibaba.fastjson2.reader.em, com.alibaba.fastjson2.reader.bu
    public Object a(Map map, long j) {
        ObjectReaderProvider objectReaderProvider = JSONFactory.defaultObjectReaderProvider;
        Object obj = map.get(d());
        if (obj instanceof String) {
            String str = (String) obj;
            long b = com.alibaba.fastjson2.util.c.b(str);
            bu buVar = null;
            if ((JSONReader.Feature.SupportAutoType.mask & j) != 0) {
                buVar = a(objectReaderProvider, b);
            }
            if (buVar != null || (buVar = objectReaderProvider.a(str, bm_(), c() | j)) != null) {
                return buVar != this ? buVar.a(map, j) : map;
            }
            throw new JSONException("No suitable ObjectReader found for" + str);
        }
        return map;
    }

    @Override // com.alibaba.fastjson2.reader.em, com.alibaba.fastjson2.reader.bu
    public Object b(JSONReader jSONReader, Type type, Object obj, long j) {
        bu a2;
        byte c = jSONReader.c();
        if (c < 73 || c > 125) {
            if (c == -110 && (a2 = jSONReader.a(Object.class, 0L, j)) != null) {
                return a2.b(jSONReader, type, obj, j);
            }
            if (c != -81) {
                return jSONReader.aM();
            }
            jSONReader.D();
            return null;
        }
        return jSONReader.az();
    }

    @Override // com.alibaba.fastjson2.reader.em, com.alibaba.fastjson2.reader.bu
    public Object b(Collection collection) {
        return collection;
    }

    @Override // com.alibaba.fastjson2.reader.em, com.alibaba.fastjson2.reader.bu
    public /* bridge */ /* synthetic */ Class bm_() {
        return super.bm_();
    }
}
