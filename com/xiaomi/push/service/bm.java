package com.xiaomi.push.service;

import android.content.Context;
import android.net.Uri;
import android.provider.Settings;

/* loaded from: classes9.dex */
public class bm {

    /* renamed from: a  reason: collision with root package name */
    private static bm f24672a;

    /* renamed from: a  reason: collision with other field name */
    private int f967a = 0;

    /* renamed from: a  reason: collision with other field name */
    private Context f968a;

    private bm(Context context) {
        this.f968a = context.getApplicationContext();
    }

    public static bm a(Context context) {
        if (f24672a == null) {
            f24672a = new bm(context);
        }
        return f24672a;
    }

    public int a() {
        int i = this.f967a;
        if (i != 0) {
            return i;
        }
        try {
            this.f967a = Settings.Global.getInt(this.f968a.getContentResolver(), "device_provisioned", 0);
        } catch (Exception unused) {
        }
        return this.f967a;
    }

    /* renamed from: a  reason: collision with other method in class */
    public Uri m2313a() {
        return Settings.Global.getUriFor("device_provisioned");
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m2314a() {
        return com.xiaomi.push.aa.f87a.contains("xmsf") || com.xiaomi.push.aa.f87a.contains("xiaomi") || com.xiaomi.push.aa.f87a.contains("miui");
    }
}
