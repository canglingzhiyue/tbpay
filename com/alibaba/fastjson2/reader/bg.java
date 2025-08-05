package com.alibaba.fastjson2.reader;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Locale;
import tb.kge;

/* loaded from: classes2.dex */
final class bg<T> extends bf<T, Object> {
    final long x;

    static {
        kge.a(-2081197638);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public bg(String str, Type type, Class cls, Type type2, Class cls2, int i, long j, String str2, Locale locale, Collection collection, Field field) {
        super(str, type, cls, type2, cls2, i, j, str2, locale, collection, null, field, null);
        this.x = com.alibaba.fastjson2.util.e.UNSAFE.objectFieldOffset(field);
    }

    @Override // com.alibaba.fastjson2.reader.bj, com.alibaba.fastjson2.reader.d
    public void a(Object obj, Object obj2) {
        com.alibaba.fastjson2.util.e.UNSAFE.putObject(obj, this.x, obj2);
    }
}
