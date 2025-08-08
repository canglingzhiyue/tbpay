package com.xiaomi.push.service;

import android.app.Notification;
import android.app.NotificationChannel;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import mtopsdk.common.util.StringUtils;
import com.xiaomi.push.ih;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes9.dex */
public class at {

    /* renamed from: a  reason: collision with root package name */
    private static at f24647a = new at();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes9.dex */
    public class a {

        /* renamed from: a  reason: collision with other field name */
        List<b> f931a;
        List<b> b;

        private a() {
            this.f931a = new ArrayList();
            this.b = new ArrayList();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes9.dex */
    public class b {

        /* renamed from: a  reason: collision with root package name */
        int f24649a;

        /* renamed from: a  reason: collision with other field name */
        Notification f932a;

        public b(int i, Notification notification) {
            this.f24649a = i;
            this.f932a = notification;
        }

        public String toString() {
            return "id:" + this.f24649a;
        }
    }

    private at() {
    }

    private int a(String str, String str2) {
        return ("GroupSummary" + str + str2).hashCode();
    }

    public static at a() {
        return f24647a;
    }

    private String a(Notification notification) {
        if (notification == null || notification.extras == null) {
            return null;
        }
        return notification.extras.getString("push_src_group_name");
    }

    private List<StatusBarNotification> a(aw awVar) {
        List<StatusBarNotification> m2297b = awVar != null ? awVar.m2297b() : null;
        if (m2297b == null || m2297b.size() == 0) {
            return null;
        }
        return m2297b;
    }

    private void a(Context context, int i, Notification notification, boolean z) {
        Notification notification2;
        String str;
        String c = ax.c(notification);
        if (StringUtils.isEmpty(c)) {
            str = "group auto not extract pkg from notification:" + i;
        } else {
            List<StatusBarNotification> a2 = a(aw.a(context, c));
            if (a2 != null) {
                String b2 = b(notification);
                HashMap hashMap = new HashMap();
                for (StatusBarNotification statusBarNotification : a2) {
                    if (statusBarNotification.getNotification() != null && statusBarNotification.getId() != i) {
                        a(hashMap, statusBarNotification);
                    }
                }
                for (Map.Entry<String, a> entry : hashMap.entrySet()) {
                    String key = entry.getKey();
                    if (!StringUtils.isEmpty(key)) {
                        a value = entry.getValue();
                        if (z && key.equals(b2) && !m2286b(notification)) {
                            (m2285a(notification) ? value.b : value.f931a).add(new b(i, notification));
                        }
                        int size = value.f931a.size();
                        if (value.b.size() <= 0) {
                            if (z && size >= 2) {
                                notification2 = value.f931a.get(0).f932a;
                                a(context, c, key, notification2);
                            }
                        } else if (size <= 0) {
                            a(context, c, key);
                        } else if (az.a(context).a(ih.NotificationGroupUpdateTimeSwitch.a(), false) && (notification2 = value.b.get(0).f932a) != null) {
                            notification2.when = System.currentTimeMillis();
                            a(context, c, key, notification2);
                        }
                    }
                }
                return;
            }
            str = "group auto not get notifications";
        }
        com.xiaomi.channel.commonutils.logger.b.m1616a(str);
    }

    private void a(Context context, String str, String str2) {
        com.xiaomi.channel.commonutils.logger.b.b("group cancel summary:" + str2);
        aw.a(context, str).a(a(str, str2));
    }

    private void a(Context context, String str, String str2, Notification notification) {
        Notification.Builder defaults;
        try {
            if (StringUtils.isEmpty(str2)) {
                com.xiaomi.channel.commonutils.logger.b.m1616a("group show summary group is null");
                return;
            }
            int a2 = ax.a(context, str);
            if (a2 == 0) {
                com.xiaomi.channel.commonutils.logger.b.m1616a("group show summary not get icon from " + str);
                return;
            }
            aw a3 = aw.a(context, str);
            if (Build.VERSION.SDK_INT >= 26) {
                String b2 = a3.b(notification.getChannelId(), "groupSummary");
                NotificationChannel m2291a = a3.m2291a(b2);
                if ("groupSummary".equals(b2) && m2291a == null) {
                    a3.a(new NotificationChannel(b2, "group_summary", 3));
                }
                defaults = new Notification.Builder(context, b2);
            } else {
                defaults = new Notification.Builder(context).setPriority(0).setDefaults(-1);
            }
            ax.a(defaults, true);
            Notification build = defaults.setContentTitle("GroupSummary").setContentText("GroupSummary").setSmallIcon(Icon.createWithResource(str, a2)).setAutoCancel(true).setGroup(str2).setGroupSummary(true).build();
            if (!com.xiaomi.push.j.m2122c() && "com.xiaomi.xmsf".equals(context.getPackageName())) {
                ax.m2298a(build, str);
            }
            int a4 = a(str, str2);
            a3.a(a4, build);
            com.xiaomi.channel.commonutils.logger.b.b("group show summary notify:" + a4);
        } catch (Exception e) {
            com.xiaomi.channel.commonutils.logger.b.m1616a("group show summary error " + e);
        }
    }

    private void a(Map<String, a> map, StatusBarNotification statusBarNotification) {
        String b2 = b(statusBarNotification.getNotification());
        a aVar = map.get(b2);
        if (aVar == null) {
            aVar = new a();
            map.put(b2, aVar);
        }
        (m2285a(statusBarNotification.getNotification()) ? aVar.b : aVar.f931a).add(new b(statusBarNotification.getId(), statusBarNotification.getNotification()));
    }

    /* renamed from: a  reason: collision with other method in class */
    private boolean m2284a() {
        return Build.VERSION.SDK_INT >= 24;
    }

    /* renamed from: a  reason: collision with other method in class */
    private boolean m2285a(Notification notification) {
        if (notification != null) {
            Object a2 = com.xiaomi.push.bh.a((Object) notification, "isGroupSummary", (Object[]) null);
            if (!(a2 instanceof Boolean)) {
                return false;
            }
            return ((Boolean) a2).booleanValue();
        }
        return false;
    }

    private boolean a(Context context) {
        if (b(context) && aw.m2289a(context)) {
            return az.a(context).a(ih.LatestNotificationNotIntoGroupSwitch.a(), false);
        }
        return false;
    }

    private String b(Notification notification) {
        if (notification == null) {
            return null;
        }
        return m2286b(notification) ? a(notification) : notification.getGroup();
    }

    private void b(Context context, int i, Notification notification) {
        String str;
        String c = ax.c(notification);
        if (StringUtils.isEmpty(c)) {
            str = "group restore not extract pkg from notification:" + i;
        } else {
            aw a2 = aw.a(context, c);
            List<StatusBarNotification> a3 = a(a2);
            if (a3 != null) {
                for (StatusBarNotification statusBarNotification : a3) {
                    Notification notification2 = statusBarNotification.getNotification();
                    if (notification2 != null && m2286b(notification2) && statusBarNotification.getId() != i) {
                        Notification.Builder recoverBuilder = Notification.Builder.recoverBuilder(context, statusBarNotification.getNotification());
                        recoverBuilder.setGroup(a(notification2));
                        ax.a(recoverBuilder, m2285a(notification2));
                        a2.a(statusBarNotification.getId(), recoverBuilder.build());
                        com.xiaomi.channel.commonutils.logger.b.b("group restore notification:" + statusBarNotification.getId());
                    }
                }
                return;
            }
            str = "group restore not get notifications";
        }
        com.xiaomi.channel.commonutils.logger.b.m1616a(str);
    }

    /* renamed from: b  reason: collision with other method in class */
    private boolean m2286b(Notification notification) {
        if (notification == null || notification.getGroup() == null || notification.extras == null) {
            return false;
        }
        long j = notification.extras.getLong("push_src_group_time");
        return notification.getGroup().equals(String.format("pushmask_%s_%s", Long.valueOf(j), a(notification)));
    }

    private boolean b(Context context) {
        return az.a(context).a(ih.NotificationAutoGroupSwitch.a(), true);
    }

    public String a(Context context, Notification.Builder builder, String str) {
        if (!m2284a() || !a(context)) {
            return str;
        }
        long currentTimeMillis = System.currentTimeMillis();
        Bundle extras = builder.getExtras();
        extras.putString("push_src_group_name", str);
        extras.putLong("push_src_group_time", currentTimeMillis);
        return String.format("pushmask_%s_%s", Long.valueOf(currentTimeMillis), str);
    }

    public void a(Context context, int i, Notification notification) {
        if (!m2284a()) {
            return;
        }
        if (a(context)) {
            try {
                b(context, i, notification);
            } catch (Exception e) {
                com.xiaomi.channel.commonutils.logger.b.m1616a("group notify handle restore error " + e);
            }
        }
        if (!b(context)) {
            return;
        }
        try {
            a(context, i, notification, true);
        } catch (Exception e2) {
            com.xiaomi.channel.commonutils.logger.b.m1616a("group notify handle auto error " + e2);
        }
    }
}
