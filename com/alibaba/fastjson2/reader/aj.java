package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Field;
import tb.kge;

/* loaded from: classes2.dex */
final class aj<T> extends d<T> {
    static {
        kge.a(-222361031);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public aj(String str, Class cls, int i, long j, String str2, Short sh, Field field) {
        super(str, cls, cls, i, j, str2, null, sh, null, field);
    }

    @Override // com.alibaba.fastjson2.reader.d
    public void a(T t, double d) {
        a((aj<T>) t, Short.valueOf((short) d));
    }

    @Override // com.alibaba.fastjson2.reader.d
    public void a(T t, float f) {
        a((aj<T>) t, Short.valueOf((short) f));
    }

    @Override // com.alibaba.fastjson2.reader.d
    public void a(T t, int i) {
        a((aj<T>) t, Short.valueOf((short) i));
    }

    @Override // com.alibaba.fastjson2.reader.d
    public void a(T t, long j) {
        a((aj<T>) t, Short.valueOf((short) j));
    }

    @Override // com.alibaba.fastjson2.reader.d
    public void a(T t, Object obj) {
        try {
            this.h.set(t, TypeUtils.j(obj));
        } catch (Exception e) {
            throw new JSONException("set " + this.b + " error", e);
        }
    }

    @Override // com.alibaba.fastjson2.reader.d
    public Object b(JSONReader jSONReader) {
        return Short.valueOf((short) jSONReader.R());
    }

    @Override // com.alibaba.fastjson2.reader.d
    public void b(JSONReader jSONReader, T t) {
        try {
            this.h.set(t, jSONReader.aH() ? null : Short.valueOf((short) jSONReader.R()));
        } catch (Exception e) {
            throw new JSONException(jSONReader.d("set " + this.b + " error"), e);
        }
    }
}
