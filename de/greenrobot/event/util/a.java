package de.greenrobot.event.util;

import android.content.res.Resources;

/* loaded from: classes9.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    final Resources f24784a;
    final int b;
    final int c;
    final c d;
    de.greenrobot.event.c e;
    boolean f;
    String g;
    int h;
    Class<?> i;

    public int a(Throwable th) {
        Integer a2 = this.d.a(th);
        if (a2 != null) {
            return a2.intValue();
        }
        String str = de.greenrobot.event.c.f24768a;
        String str2 = "No specific message ressource ID found for " + th;
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public de.greenrobot.event.c a() {
        de.greenrobot.event.c cVar = this.e;
        return cVar != null ? cVar : de.greenrobot.event.c.a();
    }
}
