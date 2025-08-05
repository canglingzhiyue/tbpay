package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader;
import java.lang.reflect.Field;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.kge;

/* loaded from: classes2.dex */
final class f<T> extends d<T> {
    static {
        kge.a(2062206514);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(String str, Class cls, int i, String str2, AtomicBoolean atomicBoolean, Field field) {
        super(str, cls, cls, i, 0L, str2, null, atomicBoolean, null, field);
    }

    @Override // com.alibaba.fastjson2.reader.d
    public void a(T t, Object obj) {
        if (obj == null) {
            return;
        }
        try {
            AtomicBoolean atomicBoolean = (AtomicBoolean) this.h.get(t);
            if (obj instanceof AtomicBoolean) {
                obj = Boolean.valueOf(((AtomicBoolean) obj).get());
            }
            atomicBoolean.set(((Boolean) obj).booleanValue());
        } catch (Exception e) {
            throw new JSONException("set " + this.b + " error", e);
        }
    }

    @Override // com.alibaba.fastjson2.reader.d
    public Object b(JSONReader jSONReader) {
        return jSONReader.aK();
    }

    @Override // com.alibaba.fastjson2.reader.d
    public void b(JSONReader jSONReader, T t) {
        a((f<T>) t, jSONReader.aK());
    }

    @Override // com.alibaba.fastjson2.reader.d
    public boolean c() {
        return true;
    }
}
