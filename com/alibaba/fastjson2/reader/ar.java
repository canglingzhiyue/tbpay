package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader;
import java.lang.reflect.Field;
import tb.kge;

/* loaded from: classes2.dex */
final class ar<T> extends bk<T> {
    static {
        kge.a(792068807);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ar(String str, Class cls, int i, long j, String str2, int[] iArr, Field field) {
        super(str, cls, cls, i, j, str2, iArr, field);
    }

    @Override // com.alibaba.fastjson2.reader.bj, com.alibaba.fastjson2.reader.d
    public void b(JSONReader jSONReader, T t) {
        if (jSONReader.aF()) {
            return;
        }
        try {
            int[] iArr = (int[]) this.h.get(t);
            if (!jSONReader.q()) {
                return;
            }
            int i = 0;
            while (!jSONReader.r()) {
                int R = jSONReader.R();
                if (iArr != null && i < iArr.length) {
                    iArr[i] = R;
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
