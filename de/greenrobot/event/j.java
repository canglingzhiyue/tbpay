package de.greenrobot.event;

import java.lang.reflect.Method;

/* loaded from: classes9.dex */
final class j {

    /* renamed from: a  reason: collision with root package name */
    final Method f24778a;
    final ThreadMode b;
    final Class<?> c;
    String d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(Method method, ThreadMode threadMode, Class<?> cls) {
        this.f24778a = method;
        this.b = threadMode;
        this.c = cls;
    }

    private synchronized void a() {
        if (this.d == null) {
            StringBuilder sb = new StringBuilder(64);
            sb.append(this.f24778a.getDeclaringClass().getName());
            sb.append('#');
            sb.append(this.f24778a.getName());
            sb.append('(');
            sb.append(this.c.getName());
            this.d = sb.toString();
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof j) {
            a();
            j jVar = (j) obj;
            jVar.a();
            return this.d.equals(jVar.d);
        }
        return false;
    }

    public int hashCode() {
        return this.f24778a.hashCode();
    }
}
