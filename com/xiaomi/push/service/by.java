package com.xiaomi.push.service;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes9.dex */
public final class by implements aq {

    /* renamed from: a  reason: collision with root package name */
    private static volatile by f24684a;

    /* renamed from: a  reason: collision with other field name */
    private long f979a;

    /* renamed from: a  reason: collision with other field name */
    Context f980a;

    /* renamed from: a  reason: collision with other field name */
    private SharedPreferences f981a;

    /* renamed from: a  reason: collision with other field name */
    private volatile boolean f983a = false;

    /* renamed from: a  reason: collision with other field name */
    private ConcurrentHashMap<String, a> f982a = new ConcurrentHashMap<>();

    /* loaded from: classes9.dex */
    public static abstract class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        long f24685a;

        /* renamed from: a  reason: collision with other field name */
        String f984a;

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(String str, long j) {
            this.f984a = str;
            this.f24685a = j;
        }

        abstract void a(by byVar);

        @Override // java.lang.Runnable
        public void run() {
            if (by.f24684a != null) {
                Context context = by.f24684a.f980a;
                if (!com.xiaomi.push.bg.d(context)) {
                    return;
                }
                long currentTimeMillis = System.currentTimeMillis();
                SharedPreferences sharedPreferences = by.f24684a.f981a;
                if (currentTimeMillis - sharedPreferences.getLong(":ts-" + this.f984a, 0L) <= this.f24685a && !com.xiaomi.push.ae.a(context)) {
                    return;
                }
                SharedPreferences.Editor edit = by.f24684a.f981a.edit();
                com.xiaomi.push.p.a(edit.putLong(":ts-" + this.f984a, System.currentTimeMillis()));
                a(by.f24684a);
            }
        }
    }

    private by(Context context) {
        this.f980a = context.getApplicationContext();
        this.f981a = context.getSharedPreferences("sync", 0);
    }

    public static by a(Context context) {
        if (f24684a == null) {
            synchronized (by.class) {
                if (f24684a == null) {
                    f24684a = new by(context);
                }
            }
        }
        return f24684a;
    }

    public String a(String str, String str2) {
        SharedPreferences sharedPreferences = this.f981a;
        return sharedPreferences.getString(str + ":" + str2, "");
    }

    @Override // com.xiaomi.push.service.aq
    /* renamed from: a  reason: collision with other method in class */
    public void mo2327a() {
        if (this.f983a) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.f979a < 3600000) {
            return;
        }
        this.f979a = currentTimeMillis;
        this.f983a = true;
        com.xiaomi.push.ah.a(this.f980a).a(new bz(this), (int) (Math.random() * 10.0d));
    }

    public void a(a aVar) {
        if (this.f982a.putIfAbsent(aVar.f984a, aVar) == null) {
            com.xiaomi.push.ah.a(this.f980a).a(aVar, ((int) (Math.random() * 30.0d)) + 10);
        }
    }

    public void a(String str, String str2, String str3) {
        SharedPreferences.Editor edit = f24684a.f981a.edit();
        com.xiaomi.push.p.a(edit.putString(str + ":" + str2, str3));
    }
}
