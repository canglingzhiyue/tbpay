package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Field;
import tb.kge;

/* loaded from: classes2.dex */
final class s<T> extends d<T> {
    static {
        kge.a(1679827613);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public s(String str, Class cls, int i, long j, String str2, Boolean bool, Field field) {
        super(str, cls, cls, i, j, str2, null, bool, null, field);
    }

    @Override // com.alibaba.fastjson2.reader.d
    public void a(T t, int i) {
        a((s<T>) t, TypeUtils.n(Integer.valueOf(i)));
    }

    @Override // com.alibaba.fastjson2.reader.d
    public void a(T t, Object obj) {
        try {
            this.h.set(t, TypeUtils.n(obj));
        } catch (Exception e) {
            throw new JSONException("set " + this.b + " error", e);
        }
    }

    @Override // com.alibaba.fastjson2.reader.d
    public void a(T t, boolean z) {
        a((s<T>) t, Boolean.valueOf(z));
    }

    @Override // com.alibaba.fastjson2.reader.d
    public Object b(JSONReader jSONReader) {
        return jSONReader.aK();
    }

    @Override // com.alibaba.fastjson2.reader.d
    public void b(JSONReader jSONReader, T t) {
        try {
            this.h.set(t, jSONReader.aK());
        } catch (Exception e) {
            throw new JSONException(jSONReader.d("set " + this.b + " error"), e);
        }
    }
}
