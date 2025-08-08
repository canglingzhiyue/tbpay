package com.xiaomi.push.service;

import android.content.Context;
import android.content.SharedPreferences;
import mtopsdk.common.util.StringUtils;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes9.dex */
public class w {

    /* renamed from: a  reason: collision with root package name */
    private static w f24728a;

    /* renamed from: a  reason: collision with other field name */
    private Context f1030a;

    /* renamed from: a  reason: collision with other field name */
    private List<String> f1031a = new ArrayList();
    private final List<String> b = new ArrayList();
    private final List<String> c = new ArrayList();

    private w(Context context) {
        String[] split;
        String[] split2;
        String[] split3;
        this.f1030a = context.getApplicationContext();
        if (this.f1030a == null) {
            this.f1030a = context;
        }
        SharedPreferences sharedPreferences = this.f1030a.getSharedPreferences("mipush_app_info", 0);
        for (String str : sharedPreferences.getString("unregistered_pkg_names", "").split(",")) {
            if (StringUtils.isEmpty(str)) {
                this.f1031a.add(str);
            }
        }
        for (String str2 : sharedPreferences.getString("disable_push_pkg_names", "").split(",")) {
            if (!StringUtils.isEmpty(str2)) {
                this.b.add(str2);
            }
        }
        for (String str3 : sharedPreferences.getString("disable_push_pkg_names_cache", "").split(",")) {
            if (!StringUtils.isEmpty(str3)) {
                this.c.add(str3);
            }
        }
    }

    public static w a(Context context) {
        if (f24728a == null) {
            f24728a = new w(context);
        }
        return f24728a;
    }

    public void a(String str) {
        synchronized (this.f1031a) {
            if (!this.f1031a.contains(str)) {
                this.f1031a.add(str);
                this.f1030a.getSharedPreferences("mipush_app_info", 0).edit().putString("unregistered_pkg_names", com.xiaomi.push.bm.a(this.f1031a, ",")).commit();
            }
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m2364a(String str) {
        boolean contains;
        synchronized (this.f1031a) {
            contains = this.f1031a.contains(str);
        }
        return contains;
    }

    public void b(String str) {
        synchronized (this.b) {
            if (!this.b.contains(str)) {
                this.b.add(str);
                this.f1030a.getSharedPreferences("mipush_app_info", 0).edit().putString("disable_push_pkg_names", com.xiaomi.push.bm.a(this.b, ",")).commit();
            }
        }
    }

    /* renamed from: b  reason: collision with other method in class */
    public boolean m2365b(String str) {
        boolean contains;
        synchronized (this.b) {
            contains = this.b.contains(str);
        }
        return contains;
    }

    public void c(String str) {
        synchronized (this.c) {
            if (!this.c.contains(str)) {
                this.c.add(str);
                this.f1030a.getSharedPreferences("mipush_app_info", 0).edit().putString("disable_push_pkg_names_cache", com.xiaomi.push.bm.a(this.c, ",")).commit();
            }
        }
    }

    /* renamed from: c  reason: collision with other method in class */
    public boolean m2366c(String str) {
        boolean contains;
        synchronized (this.c) {
            contains = this.c.contains(str);
        }
        return contains;
    }

    public void d(String str) {
        synchronized (this.f1031a) {
            if (this.f1031a.contains(str)) {
                this.f1031a.remove(str);
                this.f1030a.getSharedPreferences("mipush_app_info", 0).edit().putString("unregistered_pkg_names", com.xiaomi.push.bm.a(this.f1031a, ",")).commit();
            }
        }
    }

    public void e(String str) {
        synchronized (this.b) {
            if (this.b.contains(str)) {
                this.b.remove(str);
                this.f1030a.getSharedPreferences("mipush_app_info", 0).edit().putString("disable_push_pkg_names", com.xiaomi.push.bm.a(this.b, ",")).commit();
            }
        }
    }

    public void f(String str) {
        synchronized (this.c) {
            if (this.c.contains(str)) {
                this.c.remove(str);
                this.f1030a.getSharedPreferences("mipush_app_info", 0).edit().putString("disable_push_pkg_names_cache", com.xiaomi.push.bm.a(this.c, ",")).commit();
            }
        }
    }
}
