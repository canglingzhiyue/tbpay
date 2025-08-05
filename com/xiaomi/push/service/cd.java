package com.xiaomi.push.service;

import android.app.Notification;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import com.alibaba.idst.nls.nlsclientsdk.requests.Constant;
import com.xiaomi.push.ah;
import com.xiaomi.push.ff;
import java.util.List;
import java.util.Map;

/* loaded from: classes9.dex */
public class cd {
    private static int a(Map<String, String> map) {
        return Math.max(0, com.xiaomi.push.s.a(map.get("notification_top_period"), 0));
    }

    private static Notification a(Notification notification, int i, String str, aw awVar) {
        if (notification != null) {
            if (!str.equals(notification.extras.getString(Constant.PROP_MESSAGE_ID))) {
                return null;
            }
            return notification;
        }
        List<StatusBarNotification> m2297b = awVar.m2297b();
        if (m2297b == null) {
            return null;
        }
        for (StatusBarNotification statusBarNotification : m2297b) {
            Notification notification2 = statusBarNotification.getNotification();
            String string = notification2.extras.getString(Constant.PROP_MESSAGE_ID);
            if (i == statusBarNotification.getId() && str.equals(string)) {
                return notification2;
            }
        }
        return null;
    }

    private static ah.a a(Context context, String str, int i, String str2, Notification notification) {
        return new ce(i, str2, context, str, notification);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a  reason: collision with other method in class */
    public static void m2329a(Context context, String str, int i, String str2, Notification notification) {
        if (!com.xiaomi.push.j.m2118a(context) || notification == null || !notification.extras.getBoolean("mipush_n_top_flag", false)) {
            return;
        }
        c(context, str, i, str2, notification);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Context context, Map<String, String> map, ff ffVar, long j) {
        if (map == null || ffVar == null || !com.xiaomi.push.j.m2118a(context) || !m2330a(map)) {
            return;
        }
        int a2 = a(map);
        int b = b(map);
        if (a2 <= 0 || b > a2) {
            com.xiaomi.channel.commonutils.logger.b.d("set top notification failed - period:" + a2 + " frequency:" + b);
            return;
        }
        ffVar.setPriority(2);
        Bundle bundle = new Bundle();
        bundle.putLong("mipush_org_when", j);
        bundle.putBoolean("mipush_n_top_flag", true);
        if (b > 0) {
            bundle.putInt("mipush_n_top_fre", b);
        }
        bundle.putInt("mipush_n_top_prd", a2);
        ffVar.addExtras(bundle);
    }

    /* renamed from: a  reason: collision with other method in class */
    private static boolean m2330a(Map<String, String> map) {
        String str = map.get("notification_top_repeat");
        if (!TextUtils.isEmpty(str)) {
            boolean parseBoolean = Boolean.parseBoolean(str);
            com.xiaomi.channel.commonutils.logger.b.c("top notification' repeat is " + parseBoolean);
            return parseBoolean;
        }
        return false;
    }

    private static int b(Map<String, String> map) {
        return Math.max(0, com.xiaomi.push.s.a(map.get("notification_top_frequency"), 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String b(int i, String str) {
        return "n_top_update_" + i + "_" + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(Context context, String str, int i, String str2, Notification notification) {
        aw a2;
        Notification a3;
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || Build.VERSION.SDK_INT < 26 || (a3 = a(notification, i, str2, (a2 = aw.a(context, str)))) == null) {
            return;
        }
        boolean z = notification != null;
        if (a3.getGroupAlertBehavior() != 1) {
            com.xiaomi.push.bh.a((Object) a3, "mGroupAlertBehavior", (Object) 1);
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j = a3.extras.getLong("mipush_org_when", 0L);
        int i2 = a3.extras.getInt("mipush_n_top_fre", 0);
        int i3 = a3.extras.getInt("mipush_n_top_prd", 0);
        if (i3 <= 0 || i3 < i2) {
            return;
        }
        long j2 = (i3 * 1000) + j;
        int min = (j >= currentTimeMillis || currentTimeMillis >= j2) ? 0 : i2 > 0 ? (int) Math.min((j2 - currentTimeMillis) / 1000, i2) : i3;
        if (!z) {
            if (min > 0) {
                a3.when = currentTimeMillis;
                com.xiaomi.channel.commonutils.logger.b.m1616a("update top notification: " + str2);
                a2.a(i, a3);
            } else {
                Notification.Builder recoverBuilder = Notification.Builder.recoverBuilder(context, a3);
                recoverBuilder.setPriority(0);
                recoverBuilder.setWhen(currentTimeMillis);
                Bundle extras = recoverBuilder.getExtras();
                if (extras != null) {
                    extras.remove("mipush_n_top_flag");
                    extras.remove("mipush_org_when");
                    extras.remove("mipush_n_top_fre");
                    extras.remove("mipush_n_top_prd");
                    recoverBuilder.setExtras(extras);
                }
                com.xiaomi.channel.commonutils.logger.b.m1616a("update top notification to common: " + str2);
                a2.a(i, recoverBuilder.build());
            }
        }
        if (min <= 0) {
            return;
        }
        com.xiaomi.channel.commonutils.logger.b.m1616a("schedule top notification next update delay: " + min);
        com.xiaomi.push.ah.a(context).m1699a(b(i, str2));
        com.xiaomi.push.ah.a(context).b(a(context, str, i, str2, (Notification) null), min);
    }
}
