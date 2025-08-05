package com.alibaba.fastjson2.writer;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicLongArray;
import java.util.concurrent.atomic.AtomicReferenceArray;
import tb.kge;

/* loaded from: classes2.dex */
final class az<T> extends FieldWriterObject<T> {
    final com.alibaba.fastjson2.function.d E;
    final boolean F;

    static {
        kge.a(-1768145610);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public az(String str, int i, long j, String str2, String str3, Type type, Class cls, Method method, com.alibaba.fastjson2.function.d dVar) {
        super(str, i, j, str2, str3, type, cls, null, method);
        this.E = dVar;
        this.F = cls == AtomicIntegerArray.class || cls == AtomicLongArray.class || cls == AtomicReferenceArray.class || cls.isArray();
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public Object a(Object obj) {
        return this.E.apply(obj);
    }
}
