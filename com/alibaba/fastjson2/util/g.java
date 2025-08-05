package com.alibaba.fastjson2.util;

import java.lang.reflect.Type;
import java.util.Map;
import tb.kge;

/* loaded from: classes2.dex */
public final class g<T extends Map> implements Type {

    /* renamed from: a  reason: collision with root package name */
    public final Class<T> f3034a;
    private final Map<String, Type> b;

    static {
        kge.a(121259395);
        kge.a(1338869568);
    }

    public Type a(String str) {
        return this.b.get(str);
    }
}
