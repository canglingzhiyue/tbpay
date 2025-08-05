package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Field;
import java.math.BigInteger;
import tb.kge;

/* loaded from: classes2.dex */
final class q<T> extends d<T> {
    static {
        kge.a(-1147880407);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public q(String str, Class cls, int i, long j, String str2, BigInteger bigInteger, Field field) {
        super(str, cls, cls, i, j, str2, null, bigInteger, null, field);
    }

    @Override // com.alibaba.fastjson2.reader.d
    public void a(T t, int i) {
        try {
            this.h.set(t, BigInteger.valueOf(i));
        } catch (Exception e) {
            throw new JSONException("set " + this.b + " error", e);
        }
    }

    @Override // com.alibaba.fastjson2.reader.d
    public void a(T t, long j) {
        try {
            this.h.set(t, BigInteger.valueOf(j));
        } catch (Exception e) {
            throw new JSONException("set " + this.b + " error", e);
        }
    }

    @Override // com.alibaba.fastjson2.reader.d
    public void a(T t, Object obj) {
        try {
            this.h.set(t, TypeUtils.d(obj));
        } catch (Exception e) {
            throw new JSONException("set " + this.b + " error", e);
        }
    }

    @Override // com.alibaba.fastjson2.reader.d
    public Object b(JSONReader jSONReader) {
        return jSONReader.af();
    }

    @Override // com.alibaba.fastjson2.reader.d
    public void b(JSONReader jSONReader, T t) {
        try {
            this.h.set(t, jSONReader.af());
        } catch (Exception e) {
            throw new JSONException(jSONReader.d("set " + this.b + " error"), e);
        }
    }
}
