package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.concurrent.atomic.AtomicReference;
import tb.kge;

/* loaded from: classes2.dex */
final class n<T> extends l<T> {
    static {
        kge.a(1196955088);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public n(String str, Type type, Class cls, int i, Method method) {
        super(str, type, cls, i, 0L, null, method, null);
    }

    @Override // com.alibaba.fastjson2.reader.d
    public void a(T t, Object obj) {
        if (obj == null) {
            return;
        }
        try {
            ((AtomicReference) this.g.invoke(t, new Object[0])).set(obj);
        } catch (Exception e) {
            throw new JSONException("set " + this.b + " error", e);
        }
    }

    @Override // com.alibaba.fastjson2.reader.d
    public boolean c() {
        return true;
    }
}
