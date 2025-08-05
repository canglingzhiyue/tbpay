package com.xiaomi.push;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.taobao.accs.utl.BaseMonitor;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* loaded from: classes9.dex */
public class de {

    /* renamed from: a  reason: collision with root package name */
    private static int f24417a;

    private static int a(Context context) {
        if (f24417a <= 0) {
            f24417a = j.b(context);
        }
        return f24417a;
    }

    private static int a(boolean z) {
        return z ? 1 : 0;
    }

    /* renamed from: a  reason: collision with other method in class */
    private static SharedPreferences m1812a(Context context) {
        return context.getSharedPreferences("sp_disconnect_stats", 0);
    }

    private static String a(String str, int i) {
        return a(str, String.valueOf(i));
    }

    private static String a(String str, long j) {
        return a(str, String.valueOf(j));
    }

    private static String a(String str, String str2) {
        if (str2 == null || str2.length() == 0) {
            str2 = "null";
        }
        if (str == null || str.length() <= 0) {
            return str2;
        }
        return str + ";" + str2;
    }

    /* renamed from: a  reason: collision with other method in class */
    private static List<dc> m1813a(Context context) {
        String str;
        SharedPreferences m1812a = m1812a(context);
        String[] a2 = a(m1812a.getString("host", null));
        if (a2 == null || a2.length <= 0) {
            str = "DisconnectStatsSP Cached hosts data is empty,drop.";
        } else {
            String[] a3 = a(m1812a.getString("network_state", null));
            String[] a4 = a(m1812a.getString("reason", null));
            String[] a5 = a(m1812a.getString(BaseMonitor.COUNT_PING_INTERVAL, null));
            String[] a6 = a(m1812a.getString("network_type", null));
            String[] a7 = a(m1812a.getString("wifi_digest", null));
            String[] a8 = a(m1812a.getString("connected_network_type", null));
            String[] a9 = a(m1812a.getString("disconnect_time", null));
            String[] a10 = a(m1812a.getString("connected_time", null));
            String[] a11 = a(m1812a.getString("xmsf_vc", null));
            String[] a12 = a(m1812a.getString("android_vc", null));
            if (a3 != null && a4 != null && a5 != null && a6 != null && a7 != null && a8 != null && a9 != null && a10 != null && a11 != null && a12 != null && a2.length == a3.length && a2.length == a4.length && a2.length == a5.length && a2.length == a6.length && a2.length == a7.length && a2.length == a8.length && a2.length == a9.length && a2.length == a10.length && a2.length == a11.length && a2.length == a12.length) {
                ArrayList arrayList = new ArrayList(a2.length);
                int i = 0;
                while (i < a2.length) {
                    dc dcVar = new dc();
                    dcVar.a(1);
                    dcVar.a(a2[i]);
                    dcVar.b(s.a(a3[i], -1));
                    dcVar.c(s.a(a4[i], -1));
                    String[] strArr = a2;
                    String[] strArr2 = a4;
                    dcVar.a(s.a(a5[i], -1L));
                    dcVar.d(s.a(a6[i], -1));
                    dcVar.b(a7[i]);
                    dcVar.e(s.a(a8[i], -1));
                    long a13 = s.a(a9[i], -1L);
                    long a14 = s.a(a10[i], -1L);
                    dcVar.b(a14 - a13);
                    dcVar.c(a13);
                    dcVar.d(a14);
                    dcVar.f(s.a(a11[i], -1));
                    dcVar.g(s.a(a12[i], -1));
                    arrayList.add(dcVar);
                    i++;
                    a2 = strArr;
                    a6 = a6;
                    a3 = a3;
                    a4 = strArr2;
                    a5 = a5;
                    a7 = a7;
                }
                return arrayList;
            }
            str = "DisconnectStatsSP Cached data incorrect,drop.";
        }
        com.xiaomi.channel.commonutils.logger.b.m1616a(str);
        return null;
    }

    /* renamed from: a  reason: collision with other method in class */
    private static void m1814a(Context context) {
        db.a("upload");
        new dd().a(context, m1813a(context));
        b(context);
    }

    public static void a(Context context, long j) {
        ah.a(context).a(new dg(context, j));
    }

    private static void a(Context context, String str, int i, long j, int i2, long j2, int i3, String str2, int i4) {
        db.a(String.format(Locale.US, "recordDisconnectInfo host=%s, netState=%d, currentTimeMillis=%d, reason=%d, pingInterval=%d, netType=%d, wifiDigest=%s, connectedNetType=%d", str, Integer.valueOf(i), Long.valueOf(j), Integer.valueOf(i2), Long.valueOf(j2), Integer.valueOf(i3), str2, Integer.valueOf(i4)));
        SharedPreferences m1812a = m1812a(context);
        String string = m1812a.getString("host", null);
        String string2 = m1812a.getString("network_state", null);
        String string3 = m1812a.getString("reason", null);
        String string4 = m1812a.getString(BaseMonitor.COUNT_PING_INTERVAL, null);
        String string5 = m1812a.getString("network_type", null);
        String string6 = m1812a.getString("wifi_digest", null);
        String string7 = m1812a.getString("connected_network_type", null);
        String string8 = m1812a.getString("disconnect_time", null);
        String string9 = m1812a.getString("xmsf_vc", null);
        String string10 = m1812a.getString("android_vc", null);
        String a2 = a(string, str);
        String a3 = a(string2, i);
        String a4 = a(string3, i2);
        String a5 = a(string4, j2);
        String a6 = a(string5, i3);
        String a7 = a(string6, str2);
        String a8 = a(string7, i4);
        String a9 = a(string8, j);
        m1812a.edit().putString("host", a2).putString("network_state", a3).putString("reason", a4).putString(BaseMonitor.COUNT_PING_INTERVAL, a5).putString("network_type", a6).putString("wifi_digest", a7).putString("connected_network_type", a8).putString("disconnect_time", a9).putString("xmsf_vc", a(string9, a(context))).putString("android_vc", a(string10, Build.VERSION.SDK_INT)).apply();
    }

    public static void a(Context context, String str, boolean z, long j, int i, long j2, int i2, String str2, int i3) {
        ah.a(context).a(new df(context, str, z, j, i, j2, i2, str2, i3));
    }

    private static String[] a(String str) {
        if (str == null || str.length() <= 0) {
            return null;
        }
        return str.split(";");
    }

    private static void b(Context context) {
        db.a("resetAfterUpload");
        m1812a(context).edit().putString("host", null).putString("network_state", null).putString("reason", null).putString(BaseMonitor.COUNT_PING_INTERVAL, null).putString("network_type", null).putString("wifi_digest", null).putString("connected_network_type", null).putString("disconnect_time", null).putString("connected_time", null).putLong("last_discnt_time", 0L).putInt("discnt_count", 0).putInt("cnt_count", 0).putString("xmsf_vc", null).putString("android_vc", null).apply();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized void c(Context context, long j) {
        synchronized (de.class) {
            SharedPreferences m1812a = m1812a(context);
            long j2 = m1812a.getLong("start_time_for_day", 0L);
            if (j2 == 0) {
                m1812a.edit().putLong("start_time_for_day", j).putLong("last_discnt_time", 0L).putInt("discnt_count_in_day", 0).putInt("discnt_count", 0).putInt("cnt_count", 0).apply();
                return;
            }
            int i = m1812a.getInt("discnt_count", 0);
            int i2 = m1812a.getInt("cnt_count", 0);
            if (i > i2) {
                m1812a.edit().putInt("cnt_count", i2 + 1).putString("connected_time", a(m1812a.getString("connected_time", null), j)).apply();
            }
            if (j - j2 >= 86400000) {
                m1812a.edit().putLong("start_time_for_day", j).putInt("discnt_count_in_day", 0).apply();
                m1814a(context);
                return;
            }
            if (i >= 10) {
                m1814a(context);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized void c(Context context, String str, boolean z, long j, int i, long j2, int i2, String str2, int i3) {
        synchronized (de.class) {
            SharedPreferences m1812a = m1812a(context);
            long j3 = m1812a.getLong("start_time_for_day", 0L);
            if (j3 == 0) {
                db.a("recordDisconnection not initialized");
            } else if (j - m1812a.getLong("last_discnt_time", 0L) < 60000) {
                db.a("recordDisconnection anti-shake");
            } else {
                if (j - j3 < 86400000) {
                    int i4 = m1812a.getInt("discnt_count_in_day", 0);
                    if (i4 > 100) {
                        db.a("recordDisconnection count > 100 in 24H cycle,abandon.");
                        return;
                    } else {
                        m1812a.edit().putInt("discnt_count_in_day", i4 + 1).apply();
                    }
                } else {
                    db.a("recordDisconnection with the current time exceeds 24H cycle, go on.");
                }
                int i5 = m1812a.getInt("discnt_count", 0);
                if (i5 == m1812a.getInt("cnt_count", 0)) {
                    a(context, str, a(z), j, i, j2, i2, str2, i3);
                    m1812a.edit().putLong("last_discnt_time", j).putInt("discnt_count", i5 + 1).apply();
                }
                db.a("recordDisconnection complete");
            }
        }
    }
}
