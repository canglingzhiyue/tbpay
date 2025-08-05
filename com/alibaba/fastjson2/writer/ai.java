package com.alibaba.fastjson2.writer;

import java.lang.reflect.Method;
import tb.kge;

/* loaded from: classes2.dex */
final class ai<T> extends ah<T> {
    final com.alibaba.fastjson2.function.d<T, Long> A;

    static {
        kge.a(-161292706);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ai(String str, int i, long j, String str2, String str3, Method method, com.alibaba.fastjson2.function.d<T, Long> dVar) {
        super(str, i, j, str2, str3, Long.class, null, method);
        this.A = dVar;
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public Object a(T t) {
        return this.A.apply(t);
    }
}
