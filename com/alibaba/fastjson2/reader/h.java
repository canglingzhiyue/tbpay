package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Method;
import java.util.List;
import java.util.concurrent.atomic.AtomicIntegerArray;
import tb.kge;

/* loaded from: classes2.dex */
final class h<T> extends d<T> {
    static {
        kge.a(766256955);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(String str, Class cls, int i, Method method) {
        super(str, cls, cls, i, 0L, null, null, null, method, null);
    }

    @Override // com.alibaba.fastjson2.reader.d
    public void a(T t, Object obj) {
        if (obj == null) {
            return;
        }
        try {
            int i = 0;
            AtomicIntegerArray atomicIntegerArray = (AtomicIntegerArray) this.g.invoke(t, new Object[0]);
            if (obj instanceof AtomicIntegerArray) {
                AtomicIntegerArray atomicIntegerArray2 = (AtomicIntegerArray) obj;
                while (i < atomicIntegerArray2.length()) {
                    atomicIntegerArray.set(i, atomicIntegerArray2.get(i));
                    i++;
                }
                return;
            }
            List list = (List) obj;
            while (i < list.size()) {
                atomicIntegerArray.set(i, TypeUtils.l(list.get(i)));
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
        return jSONReader.c(Integer.class);
    }

    @Override // com.alibaba.fastjson2.reader.d
    public void b(JSONReader jSONReader, T t) {
        if (jSONReader.aF()) {
            return;
        }
        try {
            int i = 0;
            AtomicIntegerArray atomicIntegerArray = (AtomicIntegerArray) this.g.invoke(t, new Object[0]);
            if (!jSONReader.q()) {
                return;
            }
            while (!jSONReader.r()) {
                int R = jSONReader.R();
                if (atomicIntegerArray != null && i < atomicIntegerArray.length()) {
                    atomicIntegerArray.set(i, R);
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
