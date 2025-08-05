package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader;
import java.lang.reflect.Field;
import tb.kge;

/* loaded from: classes2.dex */
final class ax<T> extends bk<T> {
    static {
        kge.a(-604430938);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ax(String str, Class cls, int i, long j, String str2, long[] jArr, Field field) {
        super(str, cls, cls, i, j, str2, jArr, field);
    }

    @Override // com.alibaba.fastjson2.reader.bj, com.alibaba.fastjson2.reader.d
    public void b(JSONReader jSONReader, T t) {
        if (jSONReader.aF()) {
            return;
        }
        try {
            long[] jArr = (long[]) this.h.get(t);
            if (!jSONReader.q()) {
                return;
            }
            int i = 0;
            while (!jSONReader.r()) {
                long Y = jSONReader.Y();
                if (jArr != null && i < jArr.length) {
                    jArr[i] = Y;
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
