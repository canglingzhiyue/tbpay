package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import tb.kge;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class e<T> extends bj<T> {
    static {
        kge.a(1342816248);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(Type type, Class cls, int i, long j, String str, Method method) {
        super("$$any$$", type, cls, i, j, str, null, null, method, null, null);
    }

    @Override // com.alibaba.fastjson2.reader.bj, com.alibaba.fastjson2.reader.d
    public void a(T t, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.alibaba.fastjson2.reader.d
    public void a(Object obj, String str, Object obj2) {
        try {
            this.g.invoke(obj, str, obj2);
        } catch (Exception unused) {
            throw new JSONException("any set error");
        }
    }

    @Override // com.alibaba.fastjson2.reader.bj, com.alibaba.fastjson2.reader.d
    public void b(JSONReader jSONReader, T t) {
        throw new UnsupportedOperationException();
    }

    @Override // com.alibaba.fastjson2.reader.d
    public bu c(JSONReader jSONReader) {
        if (this.u != null) {
            return this.u;
        }
        bu a2 = jSONReader.a(this.d);
        this.u = a2;
        return a2;
    }

    @Override // com.alibaba.fastjson2.reader.bj, com.alibaba.fastjson2.reader.d
    public void c(JSONReader jSONReader, Object obj) {
        try {
            this.g.invoke(obj, jSONReader.J(), c(jSONReader).a(jSONReader, this.d, this.b, 0L));
        } catch (Exception e) {
            throw new JSONException(jSONReader.d("any set error"), e);
        }
    }

    @Override // com.alibaba.fastjson2.reader.d
    public boolean c() {
        return true;
    }
}
