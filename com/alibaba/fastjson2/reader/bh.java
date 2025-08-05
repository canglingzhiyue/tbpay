package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.Map;
import tb.kge;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class bh<T> extends bk<T> {
    static {
        kge.a(-1738527117);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public bh(String str, Type type, Class cls, int i, long j, String str2, Field field) {
        super(str, type, cls, i, j, str2, null, field);
    }

    @Override // com.alibaba.fastjson2.reader.bk, com.alibaba.fastjson2.reader.bj, com.alibaba.fastjson2.reader.d
    public void a(T t, Object obj) {
        if (obj == null) {
            return;
        }
        try {
            Map map = (Map) this.h.get(t);
            if (map == Collections.EMPTY_MAP || map == null || "java.util.Collections$UnmodifiableMap".equals(map.getClass().getName())) {
                return;
            }
            map.putAll((Map) obj);
        } catch (Exception e) {
            throw new JSONException("set " + this.b + " error", e);
        }
    }

    @Override // com.alibaba.fastjson2.reader.d
    public void a(Object obj, String str, Object obj2) {
        try {
            ((Map) this.h.get(obj)).put(str, obj2);
        } catch (Exception unused) {
            throw new JSONException("set " + this.b + " error");
        }
    }

    @Override // com.alibaba.fastjson2.reader.bj, com.alibaba.fastjson2.reader.d
    public void b(JSONReader jSONReader, T t) {
        if (this.y == null) {
            this.y = jSONReader.f2934a.a(this.d);
        }
        a((bh<T>) t, jSONReader.w ? this.y.b(jSONReader, this.d, this.b, this.e) : this.y.a(jSONReader, this.d, this.b, this.e));
    }

    @Override // com.alibaba.fastjson2.reader.d
    public bu c(JSONReader jSONReader) {
        bu a2;
        if (this.u != null) {
            return this.u;
        }
        bu a3 = a(jSONReader);
        if (a3 instanceof du) {
            a2 = ee.f3010a;
        } else if (!(a3 instanceof dy)) {
            return ec.INSTANCE;
        } else {
            a2 = jSONReader.a(((dy) a3).d);
        }
        this.u = a2;
        return a2;
    }

    @Override // com.alibaba.fastjson2.reader.bj, com.alibaba.fastjson2.reader.d
    public void c(JSONReader jSONReader, Object obj) {
        try {
            Map map = (Map) this.h.get(obj);
            String J = jSONReader.J();
            map.put(J, c(jSONReader).a(jSONReader, (Type) null, J, 0L));
        } catch (Exception e) {
            throw new JSONException(jSONReader.d("set " + this.b + " error"), e);
        }
    }

    @Override // com.alibaba.fastjson2.reader.d
    public boolean c() {
        return true;
    }
}
