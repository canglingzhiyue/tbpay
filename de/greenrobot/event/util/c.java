package de.greenrobot.event.util;

import java.util.Map;

/* loaded from: classes9.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    public final Map<Class<? extends Throwable>, Integer> f24786a;

    public Integer a(Throwable th) {
        Throwable th2 = th;
        int i = 20;
        do {
            Integer b = b(th2);
            if (b == null) {
                th2 = th2.getCause();
                i--;
                if (i <= 0 || th2 == th) {
                    break;
                }
            } else {
                return b;
            }
        } while (th2 != null);
        String str = de.greenrobot.event.c.f24768a;
        String str2 = "No specific message ressource ID found for " + th;
        return null;
    }

    protected Integer b(Throwable th) {
        Class<?> cls = th.getClass();
        Integer num = this.f24786a.get(cls);
        if (num == null) {
            Class<? extends Throwable> cls2 = null;
            for (Map.Entry<Class<? extends Throwable>, Integer> entry : this.f24786a.entrySet()) {
                Class<? extends Throwable> key = entry.getKey();
                if (key.isAssignableFrom(cls) && (cls2 == null || cls2.isAssignableFrom(key))) {
                    num = entry.getValue();
                    cls2 = key;
                }
            }
        }
        return num;
    }
}
