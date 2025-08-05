package com.alibaba.fastjson2.writer;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import tb.kge;

/* loaded from: classes2.dex */
final class t extends s {
    final com.alibaba.fastjson2.function.d H;

    static {
        kge.a(308020920);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public t(String str, int i, long j, String str2, String str3, Type type, Class cls, Method method, com.alibaba.fastjson2.function.d dVar) {
        super(str, i, j, str2, str3, type, cls, null, method);
        this.H = dVar;
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public Object a(Object obj) {
        return this.H.apply(obj);
    }
}
