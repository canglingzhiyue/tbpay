package com.vivo.push.e;

import android.content.Context;
import com.vivo.push.util.ContextDelegate;

/* loaded from: classes9.dex */
public final class b {
    private static volatile b c;

    /* renamed from: a  reason: collision with root package name */
    private a f24188a;
    private Context b;

    private b() {
    }

    public static synchronized b a() {
        b bVar;
        synchronized (b.class) {
            if (c == null) {
                c = new b();
            }
            bVar = c;
        }
        return bVar;
    }

    public final synchronized a a(Context context) {
        if (this.f24188a != null) {
            return this.f24188a;
        } else if (context == null) {
            return null;
        } else {
            if (this.f24188a == null) {
                this.b = ContextDelegate.getContext(context.getApplicationContext());
                this.f24188a = new c(this.b);
            }
            return this.f24188a;
        }
    }
}
