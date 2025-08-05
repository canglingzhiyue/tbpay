package com.xiaomi.push;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.alibaba.evo.internal.database.ExperimentDO;
import com.taobao.android.ultron.datamodel.imp.DMComponent;

/* loaded from: classes9.dex */
public class dn {

    /* renamed from: a  reason: collision with root package name */
    private static int f24425a = 0;

    /* renamed from: a  reason: collision with other field name */
    private static boolean f216a = true;

    private static int a(Context context) {
        if (f24425a <= 0) {
            f24425a = j.b(context);
        }
        return f24425a;
    }

    private static int a(boolean z) {
        return z ? 1 : 0;
    }

    /* renamed from: a  reason: collision with other method in class */
    private static SharedPreferences m1821a(Context context) {
        return context.getSharedPreferences("sp_power_stats", 0);
    }

    /* renamed from: a  reason: collision with other method in class */
    private static dl m1822a(Context context) {
        SharedPreferences m1821a = m1821a(context);
        dl dlVar = new dl();
        dlVar.a(m1821a.getInt("off_up_count", 0));
        dlVar.b(m1821a.getInt("off_down_count", 0));
        dlVar.c(m1821a.getInt("off_ping_count", 0));
        dlVar.d(m1821a.getInt("off_pong_count", 0));
        dlVar.a(m1821a.getLong("off_duration", 0L));
        dlVar.e(m1821a.getInt("on_up_count", 0));
        dlVar.f(m1821a.getInt("on_down_count", 0));
        dlVar.g(m1821a.getInt("on_ping_count", 0));
        dlVar.h(m1821a.getInt("on_pong_count", 0));
        dlVar.b(m1821a.getLong("on_duration", 0L));
        dlVar.c(m1821a.getLong("start_time", 0L));
        dlVar.d(m1821a.getLong(ExperimentDO.COLUMN_END_TIME, 0L));
        dlVar.i(m1821a.getInt("xmsf_vc", 0));
        dlVar.j(m1821a.getInt("android_vc", 0));
        return dlVar;
    }

    private static void a(Context context, long j, int i) {
        dk.a("upload");
        new dm().a(context, m1822a(context));
        b(context, j, i);
    }

    private static void a(Context context, long j, long j2, int i, int i2) {
        if (j > 0) {
            if (!m1823a(context) && i < 1073741823 && j2 - j < 86400000) {
                return;
            }
            m1821a(context).edit().putLong(ExperimentDO.COLUMN_END_TIME, j2).apply();
            a(context, j2, i2);
        }
    }

    public static void a(Context context, long j, boolean z) {
        ah.a(context).a(new Cdo(context, j, z));
    }

    private static void a(Context context, SharedPreferences sharedPreferences, long j, int i) {
        dk.a("recordInit");
        sharedPreferences.edit().putLong("start_time", j).putInt("current_screen_state", i).putLong("current_screen_state_start_time", j).putInt("xmsf_vc", a(context)).putInt("android_vc", Build.VERSION.SDK_INT).apply();
    }

    /* renamed from: a  reason: collision with other method in class */
    private static boolean m1823a(Context context) {
        boolean z = false;
        if (f216a) {
            f216a = false;
            SharedPreferences m1821a = m1821a(context);
            int i = m1821a.getInt("xmsf_vc", 0);
            int i2 = m1821a.getInt("android_vc", 0);
            if (i != 0 && i2 != 0 && (i != a(context) || i2 != Build.VERSION.SDK_INT)) {
                z = true;
            }
        }
        dk.a("isVcChanged = " + z);
        return z;
    }

    private static void b(Context context, long j, int i) {
        dk.a(DMComponent.RESET);
        m1821a(context).edit().clear().putLong("start_time", j).putInt("current_screen_state", i).putLong("current_screen_state_start_time", j).putInt("xmsf_vc", a(context)).putInt("android_vc", Build.VERSION.SDK_INT).apply();
    }

    public static void b(Context context, long j, boolean z) {
        ah.a(context).a(new dp(context, j, z));
    }

    public static void c(Context context, long j, boolean z) {
        ah.a(context).a(new dq(context, j, z));
    }

    public static void d(Context context, long j, boolean z) {
        ah.a(context).a(new dr(context, j, z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized void i(Context context, long j, boolean z) {
        int i;
        SharedPreferences.Editor putInt;
        synchronized (dn.class) {
            dk.a("recordSendMsg start");
            int a2 = a(z);
            SharedPreferences m1821a = m1821a(context);
            long j2 = m1821a.getLong("start_time", 0L);
            if (j2 <= 0) {
                a(context, m1821a, j, a2);
            }
            if (a2 == 1) {
                i = m1821a.getInt("on_up_count", 0) + 1;
                putInt = m1821a.edit().putInt("on_up_count", i);
            } else {
                i = m1821a.getInt("off_up_count", 0) + 1;
                putInt = m1821a.edit().putInt("off_up_count", i);
            }
            putInt.apply();
            a(context, j2, j, i, a2);
            dk.a("recordSendMsg complete");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized void j(Context context, long j, boolean z) {
        int i;
        SharedPreferences.Editor putInt;
        synchronized (dn.class) {
            dk.a("recordReceiveMsg start");
            int a2 = a(z);
            SharedPreferences m1821a = m1821a(context);
            long j2 = m1821a.getLong("start_time", 0L);
            if (j2 <= 0) {
                a(context, m1821a, j, a2);
            }
            if (a2 == 1) {
                i = m1821a.getInt("on_down_count", 0) + 1;
                putInt = m1821a.edit().putInt("on_down_count", i);
            } else {
                i = m1821a.getInt("off_down_count", 0) + 1;
                putInt = m1821a.edit().putInt("off_down_count", i);
            }
            putInt.apply();
            a(context, j2, j, i, a2);
            dk.a("recordReceiveMsg complete");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized void k(Context context, long j, boolean z) {
        int i;
        SharedPreferences.Editor putInt;
        synchronized (dn.class) {
            dk.a("recordPing start");
            int a2 = a(z);
            SharedPreferences m1821a = m1821a(context);
            long j2 = m1821a.getLong("start_time", 0L);
            if (j2 <= 0) {
                a(context, m1821a, j, a2);
            }
            if (a2 == 1) {
                i = m1821a.getInt("on_ping_count", 0) + 1;
                putInt = m1821a.edit().putInt("on_ping_count", i);
            } else {
                i = m1821a.getInt("off_ping_count", 0) + 1;
                putInt = m1821a.edit().putInt("off_ping_count", i);
            }
            putInt.apply();
            a(context, j2, j, i, a2);
            dk.a("recordPing complete");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized void l(Context context, long j, boolean z) {
        int i;
        SharedPreferences.Editor putInt;
        synchronized (dn.class) {
            dk.a("recordPong start");
            int a2 = a(z);
            SharedPreferences m1821a = m1821a(context);
            long j2 = m1821a.getLong("start_time", 0L);
            if (j2 <= 0) {
                a(context, m1821a, j, a2);
            }
            if (a2 == 1) {
                i = m1821a.getInt("on_pong_count", 0) + 1;
                putInt = m1821a.edit().putInt("on_pong_count", i);
            } else {
                i = m1821a.getInt("off_pong_count", 0) + 1;
                putInt = m1821a.edit().putInt("off_pong_count", i);
            }
            putInt.apply();
            a(context, j2, j, i, a2);
            dk.a("recordPong complete");
        }
    }
}
