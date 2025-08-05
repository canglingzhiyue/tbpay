package com.alibaba.fastjson2.writer;

import java.lang.reflect.Method;
import tb.kge;

/* loaded from: classes2.dex */
final class z<T> extends y<T> {
    final com.alibaba.fastjson2.function.d<T, Short> z;

    static {
        kge.a(-302591419);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public z(String str, int i, long j, String str2, String str3, Method method, com.alibaba.fastjson2.function.d<T, Short> dVar) {
        super(str, i, j, str2, str3, Short.class, null, method);
        this.z = dVar;
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public Object a(T t) {
        return this.z.apply(t);
    }
}
