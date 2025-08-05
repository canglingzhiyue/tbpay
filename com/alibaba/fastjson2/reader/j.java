package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Method;
import java.util.List;
import java.util.concurrent.atomic.AtomicLongArray;
import tb.kge;

/* loaded from: classes2.dex */
final class j<T> extends d<T> {
    static {
        kge.a(-1842495615);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(String str, Class cls, int i, Method method) {
        super(str, cls, cls, i, 0L, null, null, null, method, null);
    }

    @Override // com.alibaba.fastjson2.reader.d
    public void a(T t, Object obj) {
        if (obj == null) {
            return;
        }
        try {
            int i = 0;
            AtomicLongArray atomicLongArray = (AtomicLongArray) this.g.invoke(t, new Object[0]);
            if (obj instanceof AtomicLongArray) {
                AtomicLongArray atomicLongArray2 = (AtomicLongArray) obj;
                while (i < atomicLongArray2.length()) {
                    atomicLongArray.set(i, atomicLongArray2.get(i));
                    i++;
                }
                return;
            }
            List list = (List) obj;
            while (i < list.size()) {
                atomicLongArray.set(i, TypeUtils.l(list.get(i)));
                i++;
            }
        } catch (Exception e) {
            throw new JSONException("set " + this.b + " error", e);
        }
    }

    @Override // com.alibaba.fastjson2.reader.d
    public Object b(JSONReader jSONReader) {
        if (jSONReader.g()) {
            return null;
        }
        return jSONReader.c(Long.class);
    }

    @Override // com.alibaba.fastjson2.reader.d
    public void b(JSONReader jSONReader, T t) {
        if (jSONReader.aF()) {
            return;
        }
        try {
            int i = 0;
            AtomicLongArray atomicLongArray = (AtomicLongArray) this.g.invoke(t, new Object[0]);
            if (!jSONReader.q()) {
                return;
            }
            while (!jSONReader.r()) {
                long Y = jSONReader.Y();
                if (atomicLongArray != null && i < atomicLongArray.length()) {
                    atomicLongArray.set(i, Y);
                }
                i++;
            }
        } catch (Exception e) {
            throw new JSONException(jSONReader.d("set " + this.b + " error"), e);
        }
    }

    @Override // com.alibaba.fastjson2.reader.d
    public boolean c() {
        return true;
    }
}
