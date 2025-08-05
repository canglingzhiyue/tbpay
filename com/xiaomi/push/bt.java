package com.xiaomi.push;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes9.dex */
public class bt {

    /* renamed from: a  reason: collision with root package name */
    private static volatile bt f24382a;

    /* renamed from: a  reason: collision with other field name */
    private Context f143a;

    private bt(Context context) {
        this.f143a = context;
    }

    public static bt a(Context context) {
        if (f24382a == null) {
            synchronized (bt.class) {
                if (f24382a == null) {
                    f24382a = new bt(context);
                }
            }
        }
        return f24382a;
    }

    public synchronized long a(String str, String str2, long j) {
        try {
        } catch (Throwable unused) {
            return j;
        }
        return this.f143a.getSharedPreferences(str, 4).getLong(str2, j);
    }

    public synchronized String a(String str, String str2, String str3) {
        try {
        } catch (Throwable unused) {
            return str3;
        }
        return this.f143a.getSharedPreferences(str, 4).getString(str2, str3);
    }

    /* renamed from: a  reason: collision with other method in class */
    public synchronized void m1748a(String str, String str2, long j) {
        SharedPreferences.Editor edit = this.f143a.getSharedPreferences(str, 4).edit();
        edit.putLong(str2, j);
        edit.commit();
    }

    /* renamed from: a  reason: collision with other method in class */
    public synchronized void m1749a(String str, String str2, String str3) {
        SharedPreferences.Editor edit = this.f143a.getSharedPreferences(str, 4).edit();
        edit.putString(str2, str3);
        edit.commit();
    }
}
