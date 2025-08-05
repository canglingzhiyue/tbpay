package com.alibaba.fastjson2.writer;

import java.lang.reflect.Method;
import tb.kge;

/* loaded from: classes2.dex */
final class am<T> extends al<T> {
    final com.alibaba.fastjson2.function.d<T, Byte> z;

    static {
        kge.a(-1388248096);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public am(String str, int i, long j, String str2, String str3, Method method, com.alibaba.fastjson2.function.d<T, Byte> dVar) {
        super(str, i, j, str2, str3, Byte.class, null, method);
        this.z = dVar;
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public Object a(T t) {
        return this.z.apply(t);
    }
}
