package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONReader;
import java.util.Locale;
import tb.kge;

/* loaded from: classes2.dex */
final class aw<T> extends bl<T> {
    static {
        kge.a(-128059181);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public aw(String str, Class cls, String str2, int i, long j, String str3, Locale locale, Object obj) {
        super(str, cls, cls, str2, i, j, str3, locale, obj);
    }

    @Override // com.alibaba.fastjson2.reader.bj, com.alibaba.fastjson2.reader.d
    public Object b(JSONReader jSONReader) {
        return jSONReader.Z();
    }
}
