package com.alibaba.fastjson2.writer;

import tb.kge;

/* loaded from: classes2.dex */
public class dv {

    /* renamed from: a  reason: collision with root package name */
    static bx f3098a;

    static {
        kge.a(1878969543);
        f3098a = bx.INSTANCE;
    }

    public static <T> FieldWriter a(String str, com.alibaba.fastjson2.function.g<T> gVar) {
        return f3098a.a(str, gVar);
    }

    public static <T, V> FieldWriter a(String str, Class<V> cls, com.alibaba.fastjson2.function.d<T, V> dVar) {
        return f3098a.a(str, cls, dVar);
    }

    public static bg a(Class cls, FieldWriter... fieldWriterArr) {
        return f3098a.a(cls, fieldWriterArr);
    }
}
