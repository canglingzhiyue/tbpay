package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Collections;
import tb.kge;

/* loaded from: classes2.dex */
final class x<T> extends bk<T> {
    static {
        kge.a(1126659883);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public x(String str, Type type, Class cls, int i, long j, String str2, Field field) {
        super(str, type, cls, i, j, str2, null, field);
    }

    @Override // com.alibaba.fastjson2.reader.bk, com.alibaba.fastjson2.reader.bj, com.alibaba.fastjson2.reader.d
    public void a(T t, Object obj) {
        if (obj == null) {
            return;
        }
        try {
            Collection collection = (Collection) this.h.get(t);
            if (collection == Collections.EMPTY_LIST || collection == Collections.EMPTY_SET || collection == null || collection.equals(obj)) {
                return;
            }
            String name = collection.getClass().getName();
            if ("java.util.Collections$UnmodifiableRandomAccessList".equals(name) || "java.util.Arrays$ArrayList".equals(name) || "java.util.Collections$SingletonList".equals(name)) {
                return;
            }
            collection.addAll((Collection) obj);
        } catch (Exception e) {
            throw new JSONException("set " + this.b + " error", e);
        }
    }

    @Override // com.alibaba.fastjson2.reader.bj, com.alibaba.fastjson2.reader.d
    public void b(JSONReader jSONReader, T t) {
        if (this.y == null) {
            this.y = jSONReader.f2934a.a(this.d);
        }
        a((x<T>) t, this.y.a(jSONReader, this.d, this.b, 0L));
    }

    @Override // com.alibaba.fastjson2.reader.d
    public boolean c() {
        return true;
    }
}
