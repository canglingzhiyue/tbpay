package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.function.Supplier;
import tb.kge;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class en<T> extends cb<T> {
    static {
        kge.a(1774493166);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public en(Class cls, Supplier<T> supplier, String str, Class[] clsArr, String[] strArr, Class cls2, d... dVarArr) {
        super(cls, str, null, JSONReader.Feature.SupportAutoType.mask, supplier, null, clsArr, strArr, cls2, dVarArr);
    }

    @Override // com.alibaba.fastjson2.reader.cb, com.alibaba.fastjson2.reader.cc, com.alibaba.fastjson2.reader.bu
    public T a(long j) {
        if (this.G == null) {
            return null;
        }
        return this.G.get();
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01b2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01ae  */
    @Override // com.alibaba.fastjson2.reader.cc, com.alibaba.fastjson2.reader.bu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public T a(com.alibaba.fastjson2.JSONReader r25, java.lang.reflect.Type r26, java.lang.Object r27, long r28) {
        /*
            Method dump skipped, instructions count: 545
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.reader.en.a(com.alibaba.fastjson2.JSONReader, java.lang.reflect.Type, java.lang.Object, long):java.lang.Object");
    }
}
