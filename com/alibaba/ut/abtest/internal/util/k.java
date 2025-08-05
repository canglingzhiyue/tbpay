package com.alibaba.ut.abtest.internal.util;

import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;
import tb.cex;
import tb.kge;

/* loaded from: classes.dex */
public final class k {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static volatile k f4201a;
    private final SharedPreferences b = cex.a().c().getSharedPreferences("ut-ab", 0);

    static {
        kge.a(-1994245328);
    }

    private k() {
    }

    public static synchronized k b() {
        synchronized (k.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (k) ipChange.ipc$dispatch("4c253a77", new Object[0]);
            }
            if (f4201a == null) {
                synchronized (k.class) {
                    if (f4201a == null) {
                        f4201a = new k();
                    }
                }
            }
            return f4201a;
        }
    }

    public SharedPreferences a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SharedPreferences) ipChange.ipc$dispatch("3f11033c", new Object[]{this}) : this.b;
    }

    public String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{this, str, str2});
        }
        try {
            return this.b.getString(str, str2);
        } catch (Exception e) {
            b.a("Preferences.getString", e);
            return str2;
        }
    }

    public void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{this, str, str2});
            return;
        }
        try {
            this.b.edit().putString(str, str2).commit();
        } catch (Exception e) {
            b.a("Preferences.putString", e);
        }
    }

    public void c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f277e37e", new Object[]{this, str, str2});
            return;
        }
        try {
            this.b.edit().putString(str, str2).apply();
        } catch (Exception e) {
            b.a("Preferences.putStringAsync", e);
        }
    }

    public long a(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8123b0c6", new Object[]{this, str, new Long(j)})).longValue();
        }
        try {
            return this.b.getLong(str, j);
        } catch (Exception e) {
            b.a("Preferences.getLong", e);
            return j;
        }
    }

    public void b(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d253fb1", new Object[]{this, str, new Long(j)});
            return;
        }
        try {
            this.b.edit().putLong(str, j).commit();
        } catch (Exception e) {
            b.a("Preferences.putLong", e);
        }
    }

    public void c(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7926ce90", new Object[]{this, str, new Long(j)});
            return;
        }
        try {
            this.b.edit().putLong(str, j).apply();
        } catch (Exception e) {
            b.a("Preferences.putLongAsync", e);
        }
    }
}
