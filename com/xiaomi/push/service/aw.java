package com.xiaomi.push.service;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import android.service.notification.StatusBarNotification;
import mtopsdk.common.util.StringUtils;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.xiaomi.push.ih;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.WeakHashMap;
import tb.riy;

/* loaded from: classes9.dex */
public class aw {

    /* renamed from: a  reason: collision with root package name */
    private static Context f24653a;

    /* renamed from: a  reason: collision with other field name */
    private static Object f936a;

    /* renamed from: a  reason: collision with other field name */
    private static WeakHashMap<Integer, aw> f937a = new WeakHashMap<>();

    /* renamed from: a  reason: collision with other field name */
    private static boolean f938a;

    /* renamed from: a  reason: collision with other field name */
    private String f939a;
    private String b;

    private aw(String str) {
        this.f939a = str;
    }

    private static int a(String str) {
        if (Build.VERSION.SDK_INT >= 24) {
            try {
                return f24653a.getPackageManager().getPackageUid(str, 0);
            } catch (Exception unused) {
                return -1;
            }
        }
        return -1;
    }

    private static NotificationManager a() {
        return (NotificationManager) f24653a.getSystemService(RemoteMessageConst.NOTIFICATION);
    }

    public static aw a(Context context, String str) {
        a(context);
        int hashCode = str.hashCode();
        aw awVar = f937a.get(Integer.valueOf(hashCode));
        if (awVar == null) {
            aw awVar2 = new aw(str);
            f937a.put(Integer.valueOf(hashCode), awVar2);
            return awVar2;
        }
        return awVar;
    }

    private static <T> T a(Object obj) {
        if (obj != null) {
            try {
                return (T) obj.getClass().getMethod("getList", new Class[0]).invoke(obj, new Object[0]);
            } catch (Exception unused) {
                return null;
            }
        }
        return null;
    }

    private static Object a(List list) {
        return Class.forName("android.content.pm.ParceledListSlice").getConstructor(List.class).newInstance(list);
    }

    public static String a(String str, String str2) {
        if (!StringUtils.isEmpty(str)) {
            String a2 = a("mipush|%s|%s", str2, "");
            return str.startsWith(a2) ? a("mipush_%s_%s", str2, str.replace(a2, "")) : str;
        }
        return str;
    }

    private static String a(String str, String str2, String str3) {
        return StringUtils.isEmpty(str) ? "" : String.format(str, str2, str3);
    }

    private static void a(Context context) {
        if (f24653a == null) {
            f24653a = context.getApplicationContext();
            NotificationManager a2 = a();
            Boolean bool = (Boolean) com.xiaomi.push.bh.a((Object) a2, "isSystemConditionProviderEnabled", "xmsf_fake_condition_provider_path");
            m2287a("fwk is support.init:" + bool);
            boolean booleanValue = bool != null ? bool.booleanValue() : false;
            f938a = booleanValue;
            if (!booleanValue) {
                return;
            }
            f936a = com.xiaomi.push.bh.a((Object) a2, "getService", new Object[0]);
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    static void m2287a(String str) {
        com.xiaomi.channel.commonutils.logger.b.m1616a("NMHelper:" + str);
    }

    /* renamed from: a  reason: collision with other method in class */
    private static boolean m2288a() {
        if (com.xiaomi.push.j.m2117a() && az.a(f24653a).a(ih.NotificationBelongToAppSwitch.a(), true)) {
            return f938a;
        }
        return false;
    }

    /* renamed from: a  reason: collision with other method in class */
    public static boolean m2289a(Context context) {
        a(context);
        return m2288a();
    }

    /* renamed from: a  reason: collision with other method in class */
    private StatusBarNotification[] m2290a() {
        if (com.xiaomi.push.j.m2118a(m2292a())) {
            try {
                Object a2 = com.xiaomi.push.bh.a(f936a, "getActiveNotifications", m2292a().getPackageName());
                if (!(a2 instanceof StatusBarNotification[])) {
                    return null;
                }
                return (StatusBarNotification[]) a2;
            } catch (Throwable th) {
                m2287a("getAllNotifications error " + th);
                return null;
            }
        }
        return null;
    }

    private String b(String str) {
        return a(m2288a() ? "mipush|%s|%s" : "mipush_%s_%s", this.f939a, str);
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0045 -> B:17:0x0046). Please submit an issue!!! */
    /* renamed from: a  reason: collision with other method in class */
    public NotificationChannel m2291a(String str) {
        try {
        } catch (Exception e) {
            m2287a("getNotificationChannel error" + e);
        }
        if (m2288a()) {
            List<NotificationChannel> m2295a = m2295a();
            if (m2295a != null) {
                for (NotificationChannel notificationChannel : m2295a) {
                    if (str.equals(notificationChannel.getId())) {
                        return notificationChannel;
                    }
                }
            }
            return null;
        }
        return a().getNotificationChannel(str);
    }

    /* renamed from: a  reason: collision with other method in class */
    public Context m2292a() {
        return f24653a;
    }

    /* renamed from: a  reason: collision with other method in class */
    public String m2293a() {
        return this.f939a;
    }

    /* renamed from: a  reason: collision with other method in class */
    public String m2294a(String str) {
        return StringUtils.isEmpty(str) ? b() : com.xiaomi.push.j.m2118a(m2292a()) ? b(str) : str;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:10:0x0038
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:82)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:48)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:40)
        */
    /* renamed from: a  reason: collision with other method in class */
    java.util.List<android.app.NotificationChannel> m2295a() {
        /*
            r9 = this;
            java.lang.String r0 = r9.f939a
            r1 = 0
            boolean r2 = m2288a()     // Catch: java.lang.Exception -> L7a
            if (r2 == 0) goto L3d
            int r2 = a(r0)     // Catch: java.lang.Exception -> L7a
            r3 = -1
            if (r2 == r3) goto L3b
            java.lang.Object r3 = com.xiaomi.push.service.aw.f936a     // Catch: java.lang.Exception -> L7a
            java.lang.String r4 = "getNotificationChannelsForPackage"
            r5 = 3
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.lang.Exception -> L7a
            r6 = 0
            r5[r6] = r0     // Catch: java.lang.Exception -> L7a
            r7 = 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Exception -> L7a
            r5[r7] = r2     // Catch: java.lang.Exception -> L7a
            r2 = 2
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)     // Catch: java.lang.Exception -> L7a
            r5[r2] = r6     // Catch: java.lang.Exception -> L7a
            java.lang.Object r2 = com.xiaomi.push.bh.a(r3, r4, r5)     // Catch: java.lang.Exception -> L7a
            java.lang.Object r2 = a(r2)     // Catch: java.lang.Exception -> L7a
            java.util.List r2 = (java.util.List) r2     // Catch: java.lang.Exception -> L7a
            java.lang.String r1 = "mipush|%s|%s"
            r8 = r2
            r2 = r1
            r1 = r8
            goto L47
        L38:
            r0 = move-exception
            r1 = r2
            goto L7b
        L3b:
            r2 = r1
            goto L47
        L3d:
            android.app.NotificationManager r2 = a()     // Catch: java.lang.Exception -> L7a
            java.util.List r1 = r2.getNotificationChannels()     // Catch: java.lang.Exception -> L7a
            java.lang.String r2 = "mipush_%s_%s"
        L47:
            boolean r3 = com.xiaomi.push.j.m2117a()     // Catch: java.lang.Exception -> L7a
            if (r3 == 0) goto L8f
            if (r1 == 0) goto L8f
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Exception -> L7a
            r3.<init>()     // Catch: java.lang.Exception -> L7a
            java.lang.String r4 = ""
            java.lang.String r0 = a(r2, r0, r4)     // Catch: java.lang.Exception -> L7a
            java.util.Iterator r2 = r1.iterator()     // Catch: java.lang.Exception -> L7a
        L5e:
            boolean r4 = r2.hasNext()     // Catch: java.lang.Exception -> L7a
            if (r4 == 0) goto L78
            java.lang.Object r4 = r2.next()     // Catch: java.lang.Exception -> L7a
            android.app.NotificationChannel r4 = (android.app.NotificationChannel) r4     // Catch: java.lang.Exception -> L7a
            java.lang.String r5 = r4.getId()     // Catch: java.lang.Exception -> L7a
            boolean r5 = r5.startsWith(r0)     // Catch: java.lang.Exception -> L7a
            if (r5 == 0) goto L5e
            r3.add(r4)     // Catch: java.lang.Exception -> L7a
            goto L5e
        L78:
            r1 = r3
            goto L8f
        L7a:
            r0 = move-exception
        L7b:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "getNotificationChannels error "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            m2287a(r0)
        L8f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.aw.m2295a():java.util.List");
    }

    public void a(int i) {
        String str = this.f939a;
        try {
            if (!m2288a()) {
                a().cancel(i);
                return;
            }
            int a2 = com.xiaomi.push.i.a();
            String packageName = m2292a().getPackageName();
            if (Build.VERSION.SDK_INT >= 30) {
                com.xiaomi.push.bh.b(f936a, "cancelNotificationWithTag", str, packageName, null, Integer.valueOf(i), Integer.valueOf(a2));
            } else {
                com.xiaomi.push.bh.b(f936a, "cancelNotificationWithTag", str, null, Integer.valueOf(i), Integer.valueOf(a2));
            }
            m2287a("cancel succ:" + i);
        } catch (Exception e) {
            m2287a("cancel error" + e);
        }
    }

    public void a(int i, Notification notification) {
        String str = this.f939a;
        NotificationManager a2 = a();
        try {
            int i2 = Build.VERSION.SDK_INT;
            if (!m2288a()) {
                a2.notify(i, notification);
                return;
            }
            if (i2 >= 19) {
                notification.extras.putString("xmsf_target_package", str);
            }
            if (i2 >= 29) {
                a2.notifyAsPackage(str, null, i, notification);
            } else {
                a2.notify(i, notification);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(NotificationChannel notificationChannel) {
        String str = this.f939a;
        try {
            if (!m2288a()) {
                a().createNotificationChannel(notificationChannel);
                return;
            }
            int a2 = a(str);
            if (a2 == -1) {
                return;
            }
            com.xiaomi.push.bh.b(f936a, "createNotificationChannelsForPackage", str, Integer.valueOf(a2), a(Arrays.asList(notificationChannel)));
        } catch (Exception e) {
            m2287a("createNotificationChannel error" + e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(NotificationChannel notificationChannel, boolean z) {
        String str = this.f939a;
        try {
            if (!z) {
                a(notificationChannel);
                return;
            }
            int a2 = a(str);
            if (a2 == -1) {
                return;
            }
            com.xiaomi.push.bh.b(f936a, "updateNotificationChannelForPackage", str, Integer.valueOf(a2), notificationChannel);
        } catch (Exception e) {
            m2287a("updateNotificationChannel error " + e);
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m2296a(String str) {
        if (!StringUtils.isEmpty(str)) {
            return str.startsWith(b(""));
        }
        return false;
    }

    String b() {
        if (StringUtils.isEmpty(this.b)) {
            this.b = b("default");
        }
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String b(String str, String str2) {
        return m2288a() ? str : str2;
    }

    /* renamed from: b  reason: collision with other method in class */
    public List<StatusBarNotification> m2297b() {
        String str = this.f939a;
        NotificationManager a2 = a();
        ArrayList arrayList = null;
        try {
            if (m2288a()) {
                int a3 = com.xiaomi.push.i.a();
                if (a3 != -1) {
                    return (List) a(com.xiaomi.push.bh.a(f936a, "getAppActiveNotifications", str, Integer.valueOf(a3)));
                }
            } else {
                StatusBarNotification[] activeNotifications = Build.VERSION.SDK_INT >= 23 ? a2.getActiveNotifications() : m2290a();
                if (activeNotifications != null && activeNotifications.length > 0) {
                    ArrayList arrayList2 = new ArrayList();
                    try {
                        for (StatusBarNotification statusBarNotification : activeNotifications) {
                            if (str.equals(ax.c(statusBarNotification.getNotification()))) {
                                arrayList2.add(statusBarNotification);
                            }
                        }
                        return arrayList2;
                    } catch (Throwable th) {
                        th = th;
                        arrayList = arrayList2;
                        m2287a("getActiveNotifications error " + th);
                        return arrayList;
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
        return arrayList;
    }

    public String toString() {
        return "NotificationManagerHelper{" + this.f939a + riy.BLOCK_END_STR;
    }
}
