package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import tb.kge;

/* loaded from: classes2.dex */
final class at<T> extends bj<T> {
    static {
        kge.a(1244425015);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public at(String str, Type type, Class cls, int i, long j, String str2, Integer num, Method method) {
        super(str, type, cls, i, j, str2, null, num, method, null, null);
    }

    @Override // com.alibaba.fastjson2.reader.bj, com.alibaba.fastjson2.reader.d
    public void a(JSONReader jSONReader, T t) {
        try {
            this.g.invoke(t, Integer.valueOf(jSONReader.R()));
        } catch (Exception e) {
            throw new JSONException(jSONReader.d("set " + this.b + " error"), e);
        }
    }

    @Override // com.alibaba.fastjson2.reader.bj, com.alibaba.fastjson2.reader.d
    public void a(T t, long j) {
        try {
            this.g.invoke(t, Integer.valueOf((int) j));
        } catch (Exception e) {
            throw new JSONException("set " + this.b + " error", e);
        }
    }

    @Override // com.alibaba.fastjson2.reader.bj, com.alibaba.fastjson2.reader.d
    public void a(T t, Object obj) {
        try {
            this.g.invoke(t, Integer.valueOf(TypeUtils.l(obj)));
        } catch (Exception e) {
            throw new JSONException("set " + this.b + " error", e);
        }
    }

    @Override // com.alibaba.fastjson2.reader.bj, com.alibaba.fastjson2.reader.d
    public Object b(JSONReader jSONReader) {
        return Integer.valueOf(jSONReader.R());
    }

    @Override // com.alibaba.fastjson2.reader.bj, com.alibaba.fastjson2.reader.d
    public void b(JSONReader jSONReader, T t) {
        try {
            this.g.invoke(t, Integer.valueOf(jSONReader.R()));
        } catch (Exception e) {
            throw new JSONException(jSONReader.d("set " + this.b + " error"), e);
        }
    }
}
