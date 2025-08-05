package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Field;
import tb.kge;

/* loaded from: classes2.dex */
final class bd<T> extends d<T> {
    static {
        kge.a(-1030499643);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public bd(String str, Class cls, int i, long j, String str2, Byte b, Field field) {
        super(str, cls, cls, i, j, str2, null, b, null, field);
    }

    @Override // com.alibaba.fastjson2.reader.d
    public void a(T t, int i) {
        try {
            this.h.setByte(t, (byte) i);
        } catch (Exception e) {
            throw new JSONException("set " + this.b + " error", e);
        }
    }

    @Override // com.alibaba.fastjson2.reader.d
    public void a(T t, long j) {
        try {
            this.h.setByte(t, (byte) j);
        } catch (Exception e) {
            throw new JSONException("set " + this.b + " error", e);
        }
    }

    @Override // com.alibaba.fastjson2.reader.d
    public void a(T t, Object obj) {
        try {
            this.h.setByte(t, TypeUtils.i(obj));
        } catch (Exception e) {
            throw new JSONException("set " + this.b + " error", e);
        }
    }

    @Override // com.alibaba.fastjson2.reader.d
    public Object b(JSONReader jSONReader) {
        return Byte.valueOf((byte) jSONReader.R());
    }

    @Override // com.alibaba.fastjson2.reader.d
    public void b(JSONReader jSONReader, T t) {
        try {
            this.h.setByte(t, (byte) jSONReader.R());
        } catch (Exception e) {
            throw new JSONException(jSONReader.d("set " + this.b + " error"), e);
        }
    }
}
