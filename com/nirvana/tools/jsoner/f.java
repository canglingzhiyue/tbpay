package com.nirvana.tools.jsoner;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes4.dex */
final class f {
    private ConcurrentHashMap<String, g> b = new ConcurrentHashMap<>();

    /* renamed from: a  reason: collision with root package name */
    List<Field> f8089a = new ArrayList();

    public f(Class cls) {
        while (!Object.class.equals(cls)) {
            Collections.addAll(this.f8089a, cls.getDeclaredFields());
            cls = cls.getSuperclass();
        }
        Iterator<Field> it = this.f8089a.iterator();
        while (it.hasNext()) {
            if (Modifier.isFinal(it.next().getModifiers())) {
                it.remove();
            }
        }
    }

    public final g a(String str) {
        return this.b.get(str);
    }

    public final void a(String str, g gVar) {
        this.b.put(str, gVar);
    }
}
