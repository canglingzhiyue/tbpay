package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicLong;
import tb.kge;

/* loaded from: classes2.dex */
final class k<T> extends d<T> {
    static {
        kge.a(1168794364);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public k(String str, Class cls, int i, Method method) {
        super(str, cls, cls, i, 0L, null, null, null, method, null);
    }

    @Override // com.alibaba.fastjson2.reader.d
    public void a(T t, Object obj) {
        if (obj == null) {
            return;
        }
        try {
            ((AtomicLong) this.g.invoke(t, new Object[0])).set(((Number) obj).longValue());
        } catch (Exception e) {
            throw new JSONException("set " + this.b + " error", e);
        }
    }

    @Override // com.alibaba.fastjson2.reader.d
    public Object b(JSONReader jSONReader) {
        long Y = jSONReader.Y();
        if (jSONReader.aH()) {
            return null;
        }
        return new AtomicLong(Y);
    }

    @Override // com.alibaba.fastjson2.reader.d
    public void b(JSONReader jSONReader, T t) {
        a((k<T>) t, jSONReader.Z());
    }

    @Override // com.alibaba.fastjson2.reader.d
    public boolean c() {
        return true;
    }
}
