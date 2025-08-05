package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicInteger;
import tb.kge;

/* loaded from: classes2.dex */
class i<T> extends d<T> {
    static {
        kge.a(520772355);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(String str, Class cls, int i, Method method) {
        super(str, cls, cls, i, 0L, null, null, null, method, null);
    }

    @Override // com.alibaba.fastjson2.reader.d
    public void a(T t, Object obj) {
        if (obj == null) {
            return;
        }
        try {
            ((AtomicInteger) this.g.invoke(t, new Object[0])).set(((Number) obj).intValue());
        } catch (Exception e) {
            throw new JSONException("set " + this.b + " error", e);
        }
    }

    @Override // com.alibaba.fastjson2.reader.d
    public Object b(JSONReader jSONReader) {
        int R = jSONReader.R();
        if (jSONReader.aH()) {
            return null;
        }
        return new AtomicInteger(R);
    }

    @Override // com.alibaba.fastjson2.reader.d
    public void b(JSONReader jSONReader, T t) {
        a((i<T>) t, jSONReader.T());
    }

    @Override // com.alibaba.fastjson2.reader.d
    public boolean c() {
        return true;
    }
}
