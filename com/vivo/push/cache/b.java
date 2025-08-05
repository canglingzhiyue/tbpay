package com.vivo.push.cache;

import android.content.Context;
import com.vivo.push.util.u;
import java.lang.reflect.Method;

/* loaded from: classes9.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static volatile b f24176a;
    private d b;

    private b() {
    }

    public static synchronized b a() {
        b bVar;
        synchronized (b.class) {
            if (f24176a == null) {
                f24176a = new b();
            }
            bVar = f24176a;
        }
        return bVar;
    }

    public final d a(Context context) {
        d dVar = this.b;
        if (dVar != null) {
            return dVar;
        }
        try {
            Method method = Class.forName("com.vivo.push.cache.ClientConfigManagerImpl").getMethod("getInstance", Context.class);
            u.d("ConfigManagerFactory", "createConfig success is ".concat("com.vivo.push.cache.ClientConfigManagerImpl"));
            this.b = (d) method.invoke(null, context);
            return this.b;
        } catch (Exception e) {
            e.printStackTrace();
            u.b("ConfigManagerFactory", "createConfig error", e);
            return null;
        }
    }
}
