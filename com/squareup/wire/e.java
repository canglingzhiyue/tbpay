package com.squareup.wire;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes4.dex */
final class e {

    /* renamed from: a  reason: collision with root package name */
    private final Map<Class<? extends ExtendableMessage>, Map<Integer, c<?, ?>>> f8129a = new LinkedHashMap();
    private final Map<Class<? extends ExtendableMessage>, Map<String, c<?, ?>>> b = new LinkedHashMap();

    public <T extends ExtendableMessage<?>, E> c<T, E> a(Class<T> cls, int i) {
        Map<Integer, c<?, ?>> map = this.f8129a.get(cls);
        if (map == null) {
            return null;
        }
        return (c<T, E>) map.get(Integer.valueOf(i));
    }

    public <T extends ExtendableMessage<?>, E> void a(c<T, E> cVar) {
        Class<T> a2 = cVar.a();
        Map<Integer, c<?, ?>> map = this.f8129a.get(a2);
        Map<String, c<?, ?>> map2 = this.b.get(a2);
        if (map == null) {
            map = new LinkedHashMap<>();
            map2 = new LinkedHashMap<>();
            this.f8129a.put(a2, map);
            this.b.put(a2, map2);
        }
        map.put(Integer.valueOf(cVar.e()), cVar);
        map2.put(cVar.d(), cVar);
    }
}
