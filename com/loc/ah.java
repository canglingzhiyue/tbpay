package com.loc;

import android.content.Context;

/* loaded from: classes4.dex */
public class ah {

    /* renamed from: a  reason: collision with root package name */
    private static ah f7651a;
    private final Context b;
    private final String c = ao.a(x.c("RYW1hcF9kZXZpY2VfYWRpdQ"));

    private ah(Context context) {
        this.b = context.getApplicationContext();
    }

    public static ah a(Context context) {
        if (f7651a == null) {
            synchronized (ah.class) {
                if (f7651a == null) {
                    f7651a = new ah(context);
                }
            }
        }
        return f7651a;
    }

    public final synchronized void a() {
        try {
            if (o.c() == null) {
                o.a(al.a());
            }
        } catch (Throwable unused) {
        }
    }

    public final void a(String str) {
        ai.a(this.b).a(this.c);
        ai.a(this.b).b(str);
    }
}
