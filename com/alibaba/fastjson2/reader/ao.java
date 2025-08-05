package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Field;
import tb.kge;

/* loaded from: classes2.dex */
final class ao<T> extends d<T> {
    static {
        kge.a(1438129727);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ao(String str, Class cls, int i, long j, String str2, Integer num, Field field) {
        super(str, cls, cls, i, j, str2, null, num, null, field);
    }

    @Override // com.alibaba.fastjson2.reader.d
    public void a(T t, double d) {
        a((ao<T>) t, Integer.valueOf((int) d));
    }

    @Override // com.alibaba.fastjson2.reader.d
    public void a(T t, float f) {
        a((ao<T>) t, Integer.valueOf((int) f));
    }

    @Override // com.alibaba.fastjson2.reader.d
    public void a(T t, Object obj) {
        Integer g = TypeUtils.g(obj);
        if (obj != null || (this.e & JSONReader.Feature.IgnoreSetNullValue.mask) == 0) {
            try {
                this.h.set(t, g);
            } catch (Exception e) {
                throw new JSONException("set " + this.b + " error", e);
            }
        }
    }

    @Override // com.alibaba.fastjson2.reader.d
    public Object b(JSONReader jSONReader) {
        return jSONReader.T();
    }

    @Override // com.alibaba.fastjson2.reader.d
    public void b(JSONReader jSONReader, T t) {
        try {
            this.h.set(t, jSONReader.T());
        } catch (Exception e) {
            throw new JSONException(jSONReader.d("set " + this.b + " error"), e);
        }
    }
}
