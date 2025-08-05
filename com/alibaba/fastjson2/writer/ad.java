package com.alibaba.fastjson2.writer;

import java.lang.reflect.Method;
import tb.kge;

/* loaded from: classes2.dex */
final class ad<T> extends ac<T> {
    final com.alibaba.fastjson2.function.d<T, Integer> A;

    static {
        kge.a(-249027201);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ad(String str, int i, long j, String str2, String str3, Method method, com.alibaba.fastjson2.function.d<T, Integer> dVar) {
        super(str, i, j, str2, str3, Integer.class, Integer.class, null, method);
        this.A = dVar;
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public Object a(T t) {
        return this.A.apply(t);
    }
}
