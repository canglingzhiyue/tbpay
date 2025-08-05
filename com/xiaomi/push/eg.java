package com.xiaomi.push;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import com.alipay.security.mobile.cache.AuthenticatorCache;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.xiaomi.push.ah;

/* loaded from: classes9.dex */
public class eg {

    /* renamed from: a  reason: collision with root package name */
    private static volatile eg f24444a;

    /* renamed from: a  reason: collision with other field name */
    private Context f254a;

    /* renamed from: a  reason: collision with other field name */
    private a f255a;

    /* loaded from: classes9.dex */
    public interface a {
        void a();
    }

    private eg(Context context) {
        this.f254a = context;
    }

    public static int a(int i) {
        return Math.max(60, i);
    }

    public static eg a(Context context) {
        if (f24444a == null) {
            synchronized (eg.class) {
                if (f24444a == null) {
                    f24444a = new eg(context);
                }
            }
        }
        return f24444a;
    }

    private void a(com.xiaomi.push.service.az azVar, ah ahVar, boolean z) {
        if (azVar.a(ih.UploadSwitch.a(), true)) {
            ek ekVar = new ek(this.f254a);
            if (z) {
                ahVar.a((ah.a) ekVar, a(azVar.a(ih.UploadFrequency.a(), RemoteMessageConst.DEFAULT_TTL)));
            } else {
                ahVar.m1698a((ah.a) ekVar);
            }
        }
    }

    private boolean a() {
        try {
            ((Application) (this.f254a instanceof Application ? this.f254a : this.f254a.getApplicationContext())).registerActivityLifecycleCallbacks(new ea(this.f254a, String.valueOf(System.currentTimeMillis() / 1000)));
            return true;
        } catch (Exception e) {
            com.xiaomi.channel.commonutils.logger.b.a(e);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        a aVar;
        ah a2 = ah.a(this.f254a);
        com.xiaomi.push.service.az a3 = com.xiaomi.push.service.az.a(this.f254a);
        SharedPreferences sharedPreferences = this.f254a.getSharedPreferences("mipush_extra", 0);
        long currentTimeMillis = System.currentTimeMillis();
        long j = sharedPreferences.getLong("first_try_ts", currentTimeMillis);
        if (j == currentTimeMillis) {
            sharedPreferences.edit().putLong("first_try_ts", currentTimeMillis).commit();
        }
        if (Math.abs(currentTimeMillis - j) < AuthenticatorCache.MAX_CACHE_TIME) {
            return;
        }
        a(a3, a2, false);
        if (a3.a(ih.StorageCollectionSwitch.a(), true)) {
            int a4 = a(a3.a(ih.StorageCollectionFrequency.a(), RemoteMessageConst.DEFAULT_TTL));
            a2.a(new ej(this.f254a, a4), a4, 0);
        }
        if (j.m2118a(this.f254a) && (aVar = this.f255a) != null) {
            aVar.a();
        }
        if (a3.a(ih.ActivityTSSwitch.a(), false)) {
            a();
        }
        a(a3, a2, true);
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m1835a() {
        ah.a(this.f254a).a(new eh(this));
    }
}
