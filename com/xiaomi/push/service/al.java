package com.xiaomi.push.service;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import android.util.Pair;
import android.widget.RemoteViews;
import com.alibaba.idst.nls.nlsclientsdk.requests.Constant;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.uc.webview.base.cyclone.BSError;
import com.xiaomi.push.fd;
import com.xiaomi.push.fe;
import com.xiaomi.push.ff;
import com.xiaomi.push.fg;
import com.xiaomi.push.g;
import com.xiaomi.push.ic;
import com.xiaomi.push.ip;
import com.xiaomi.push.iy;
import com.xiaomi.push.service.av;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class al {

    /* renamed from: a  reason: collision with root package name */
    public static long f24638a;

    /* renamed from: a  reason: collision with other field name */
    private static volatile ar f917a;

    /* renamed from: a  reason: collision with other field name */
    private static final LinkedList<Pair<Integer, iy>> f918a = new LinkedList<>();

    /* renamed from: a  reason: collision with other field name */
    private static ExecutorService f919a = Executors.newCachedThreadPool();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes9.dex */
    public static class a implements Callable<Bitmap> {

        /* renamed from: a  reason: collision with root package name */
        private Context f24639a;

        /* renamed from: a  reason: collision with other field name */
        private String f920a;

        /* renamed from: a  reason: collision with other field name */
        private boolean f921a;

        public a(String str, Context context, boolean z) {
            this.f24639a = context;
            this.f920a = str;
            this.f921a = z;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Bitmap call() {
            if (TextUtils.isEmpty(this.f920a)) {
                com.xiaomi.channel.commonutils.logger.b.m1616a("Failed get online picture/icon resource cause picUrl is empty");
            } else if (!this.f920a.startsWith("http")) {
                Bitmap a2 = av.a(this.f24639a, this.f920a);
                if (a2 != null) {
                    return a2;
                }
                com.xiaomi.channel.commonutils.logger.b.m1616a("Failed get online picture/icon resource");
                return a2;
            } else {
                av.b a3 = av.a(this.f24639a, this.f920a, this.f921a);
                if (a3 != null) {
                    return a3.f935a;
                }
                com.xiaomi.channel.commonutils.logger.b.m1616a("Failed get online picture/icon resource");
            }
            return null;
        }
    }

    /* loaded from: classes9.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        long f24640a = 0;

        /* renamed from: a  reason: collision with other field name */
        Notification f922a;
    }

    /* loaded from: classes9.dex */
    public static class c {

        /* renamed from: a  reason: collision with other field name */
        public String f923a;

        /* renamed from: a  reason: collision with root package name */
        public long f24641a = 0;

        /* renamed from: a  reason: collision with other field name */
        public boolean f924a = false;
    }

    static int a(Context context, String str) {
        return context.getSharedPreferences("pref_notify_type", 0).getInt(str, Integer.MAX_VALUE);
    }

    private static int a(Context context, String str, String str2) {
        if (str.equals(context.getPackageName())) {
            return context.getResources().getIdentifier(str2, com.taobao.share.ui.engine.friend.a.CONTACTS_INFO_NOT_EMPTY_STATUS, str);
        }
        return 0;
    }

    private static int a(Context context, String str, Map<String, String> map, int i) {
        ComponentName a2;
        Intent b2 = b(context, str, map, i);
        if (b2 == null || (a2 = m.a(context, b2)) == null) {
            return 0;
        }
        return a2.hashCode();
    }

    private static int a(Map<String, String> map) {
        String str = map == null ? null : map.get("timeout");
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.parseInt(str);
            } catch (Exception unused) {
                return 0;
            }
        }
        return 0;
    }

    private static Notification a(Notification notification) {
        Object a2 = com.xiaomi.push.bh.a(notification, "extraNotification");
        if (a2 != null) {
            com.xiaomi.push.bh.a(a2, "setCustomizedIcon", true);
        }
        return notification;
    }

    private static PendingIntent a(Context context, iy iyVar, String str, byte[] bArr, int i) {
        return a(context, iyVar, str, bArr, i, 0, a(context, iyVar, str));
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.app.PendingIntent a(android.content.Context r16, com.xiaomi.push.iy r17, java.lang.String r18, byte[] r19, int r20, int r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 349
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.al.a(android.content.Context, com.xiaomi.push.iy, java.lang.String, byte[], int, int, boolean):android.app.PendingIntent");
    }

    private static PendingIntent a(Context context, String str, iy iyVar, byte[] bArr, int i, int i2) {
        Map<String, String> m2069a = iyVar.m2102a().m2069a();
        if (m2069a == null) {
            return null;
        }
        boolean a2 = a(context, iyVar, str);
        if (a2) {
            return a(context, iyVar, str, bArr, i, i2, a2);
        }
        Intent m2270a = m2270a(context, str, m2069a, i2);
        if (m2270a == null) {
            return null;
        }
        return com.android.taobao.aop.a.a(context, 0, m2270a, Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728);
    }

    public static ComponentName a(String str) {
        return new ComponentName(str, "com.xiaomi.mipush.sdk.NotificationClickedActivity");
    }

    /* renamed from: a  reason: collision with other method in class */
    public static Intent m2270a(Context context, String str, Map<String, String> map, int i) {
        if (m2280b(map)) {
            return a(context, str, map, String.format("cust_btn_%s_ne", Integer.valueOf(i)), String.format("cust_btn_%s_iu", Integer.valueOf(i)), String.format("cust_btn_%s_ic", Integer.valueOf(i)), String.format("cust_btn_%s_wu", Integer.valueOf(i)));
        }
        if (i == 1) {
            return a(context, str, map, "notification_style_button_left_notify_effect", "notification_style_button_left_intent_uri", "notification_style_button_left_intent_class", "notification_style_button_left_web_uri");
        }
        if (i == 2) {
            return a(context, str, map, "notification_style_button_mid_notify_effect", "notification_style_button_mid_intent_uri", "notification_style_button_mid_intent_class", "notification_style_button_mid_web_uri");
        }
        if (i == 3) {
            return a(context, str, map, "notification_style_button_right_notify_effect", "notification_style_button_right_intent_uri", "notification_style_button_right_intent_class", "notification_style_button_right_web_uri");
        }
        if (i == 4) {
            return a(context, str, map, "notification_colorful_button_notify_effect", "notification_colorful_button_intent_uri", "notification_colorful_button_intent_class", "notification_colorful_button_web_uri");
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0115  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.content.Intent a(android.content.Context r3, java.lang.String r4, java.util.Map<java.lang.String, java.lang.String> r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9) {
        /*
            Method dump skipped, instructions count: 366
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.al.a(android.content.Context, java.lang.String, java.util.Map, java.lang.String, java.lang.String, java.lang.String, java.lang.String):android.content.Intent");
    }

    private static Bitmap a(Context context, int i) {
        return a(context.getResources().getDrawable(i));
    }

    private static Bitmap a(Context context, String str, boolean z) {
        Future submit = f919a.submit(new a(str, context, z));
        try {
            try {
                Bitmap bitmap = (Bitmap) submit.get(180L, TimeUnit.SECONDS);
                return bitmap == null ? bitmap : bitmap;
            } catch (InterruptedException | ExecutionException | TimeoutException e) {
                com.xiaomi.channel.commonutils.logger.b.a(e);
                submit.cancel(true);
                return null;
            }
        } finally {
            submit.cancel(true);
        }
    }

    public static Bitmap a(Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int i = 1;
        if (intrinsicWidth <= 0) {
            intrinsicWidth = 1;
        }
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicHeight > 0) {
            i = intrinsicHeight;
        }
        Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, i, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return createBitmap;
    }

    private static RemoteViews a(Context context, iy iyVar, byte[] bArr) {
        ip m2102a = iyVar.m2102a();
        String a2 = a(iyVar);
        if (m2102a != null && m2102a.m2069a() != null) {
            Map<String, String> m2069a = m2102a.m2069a();
            String str = m2069a.get("layout_name");
            String str2 = m2069a.get("layout_value");
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                try {
                    Resources resourcesForApplication = context.getPackageManager().getResourcesForApplication(a2);
                    int identifier = resourcesForApplication.getIdentifier(str, "layout", a2);
                    if (identifier == 0) {
                        return null;
                    }
                    RemoteViews remoteViews = new RemoteViews(a2, identifier);
                    try {
                        JSONObject jSONObject = new JSONObject(str2);
                        if (jSONObject.has("text")) {
                            JSONObject jSONObject2 = jSONObject.getJSONObject("text");
                            Iterator<String> keys = jSONObject2.keys();
                            while (keys.hasNext()) {
                                String next = keys.next();
                                String string = jSONObject2.getString(next);
                                int identifier2 = resourcesForApplication.getIdentifier(next, "id", a2);
                                if (identifier2 > 0) {
                                    remoteViews.setTextViewText(identifier2, string);
                                }
                            }
                        }
                        if (jSONObject.has("image")) {
                            JSONObject jSONObject3 = jSONObject.getJSONObject("image");
                            Iterator<String> keys2 = jSONObject3.keys();
                            while (keys2.hasNext()) {
                                String next2 = keys2.next();
                                String string2 = jSONObject3.getString(next2);
                                int identifier3 = resourcesForApplication.getIdentifier(next2, "id", a2);
                                int identifier4 = resourcesForApplication.getIdentifier(string2, com.taobao.share.ui.engine.friend.a.CONTACTS_INFO_NOT_EMPTY_STATUS, a2);
                                if (identifier3 > 0) {
                                    remoteViews.setImageViewResource(identifier3, identifier4);
                                }
                            }
                        }
                        if (jSONObject.has("time")) {
                            JSONObject jSONObject4 = jSONObject.getJSONObject("time");
                            Iterator<String> keys3 = jSONObject4.keys();
                            while (keys3.hasNext()) {
                                String next3 = keys3.next();
                                String string3 = jSONObject4.getString(next3);
                                if (string3.length() == 0) {
                                    string3 = "yy-MM-dd hh:mm";
                                }
                                int identifier5 = resourcesForApplication.getIdentifier(next3, "id", a2);
                                if (identifier5 > 0) {
                                    remoteViews.setTextViewText(identifier5, new SimpleDateFormat(string3).format(new Date(System.currentTimeMillis())));
                                }
                            }
                        }
                        return remoteViews;
                    } catch (JSONException e) {
                        com.xiaomi.channel.commonutils.logger.b.a(e);
                        return null;
                    }
                } catch (PackageManager.NameNotFoundException e2) {
                    com.xiaomi.channel.commonutils.logger.b.a(e2);
                }
            }
        }
        return null;
    }

    private static ff a(Context context, iy iyVar, byte[] bArr, String str, int i) {
        PendingIntent a2;
        String a3 = a(iyVar);
        Map<String, String> m2069a = iyVar.m2102a().m2069a();
        String str2 = m2069a.get("notification_style_type");
        ff a4 = (!com.xiaomi.push.j.m2118a(context) || f917a == null) ? null : f917a.a(context, i, a3, m2069a);
        if (a4 != null) {
            a4.a(m2069a);
            return a4;
        } else if ("2".equals(str2)) {
            ff ffVar = new ff(context);
            Bitmap a5 = TextUtils.isEmpty(m2069a.get("notification_bigPic_uri")) ? null : a(context, m2069a.get("notification_bigPic_uri"), false);
            if (a5 == null) {
                com.xiaomi.channel.commonutils.logger.b.m1616a("can not get big picture.");
                return ffVar;
            }
            Notification.BigPictureStyle bigPictureStyle = new Notification.BigPictureStyle(ffVar);
            bigPictureStyle.bigPicture(a5);
            bigPictureStyle.setSummaryText(str);
            bigPictureStyle.bigLargeIcon((Bitmap) null);
            ffVar.setStyle(bigPictureStyle);
            return ffVar;
        } else if ("1".equals(str2)) {
            ff ffVar2 = new ff(context);
            ffVar2.setStyle(new Notification.BigTextStyle().bigText(str));
            return ffVar2;
        } else if ("4".equals(str2) && com.xiaomi.push.j.m2117a()) {
            fe feVar = new fe(context, a3);
            if (!TextUtils.isEmpty(m2069a.get("notification_banner_image_uri"))) {
                feVar.mo1922a(a(context, m2069a.get("notification_banner_image_uri"), false));
            }
            if (!TextUtils.isEmpty(m2069a.get("notification_banner_icon_uri"))) {
                feVar.b(a(context, m2069a.get("notification_banner_icon_uri"), false));
            }
            feVar.a(m2069a);
            return feVar;
        } else if (!"3".equals(str2) || !com.xiaomi.push.j.m2117a()) {
            return new ff(context);
        } else {
            fg fgVar = new fg(context, i, a3);
            if (!TextUtils.isEmpty(m2069a.get("notification_colorful_button_text")) && (a2 = a(context, a3, iyVar, bArr, i, 4)) != null) {
                fgVar.a(m2069a.get("notification_colorful_button_text"), a2).a(m2069a.get("notification_colorful_button_bg_color"));
            }
            if (!TextUtils.isEmpty(m2069a.get("notification_colorful_bg_color"))) {
                fgVar.b(m2069a.get("notification_colorful_bg_color"));
            } else if (!TextUtils.isEmpty(m2069a.get("notification_colorful_bg_image_uri"))) {
                fgVar.mo1922a(a(context, m2069a.get("notification_colorful_bg_image_uri"), false));
            }
            fgVar.a(m2069a);
            return fgVar;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x027c  */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v14 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.xiaomi.push.service.al.b a(android.content.Context r27, com.xiaomi.push.iy r28, byte[] r29, android.widget.RemoteViews r30, android.app.PendingIntent r31, int r32) {
        /*
            Method dump skipped, instructions count: 1144
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.al.a(android.content.Context, com.xiaomi.push.iy, byte[], android.widget.RemoteViews, android.app.PendingIntent, int):com.xiaomi.push.service.al$b");
    }

    /* renamed from: a  reason: collision with other method in class */
    public static c m2271a(Context context, iy iyVar, byte[] bArr) {
        int i;
        Map<String, String> map;
        String str;
        c cVar = new c();
        g.b a2 = com.xiaomi.push.g.a(context, a(iyVar), true);
        ip m2102a = iyVar.m2102a();
        String str2 = null;
        if (m2102a != null) {
            i = m2102a.c();
            map = m2102a.m2069a();
        } else {
            i = 0;
            map = null;
        }
        int b2 = com.xiaomi.push.s.b(a(iyVar), i);
        if (com.xiaomi.push.j.m2118a(context) && a2 == g.b.NOT_ALLOWED) {
            if (m2102a != null) {
                fd.a(context.getApplicationContext()).a(iyVar.b(), b(iyVar), m2102a.m2068a(), "10:" + a(iyVar));
            }
            str = "Do not notify because user block " + a(iyVar) + "‘s notification";
        } else if (!com.xiaomi.push.j.m2118a(context) || f917a == null || !f917a.m2282a(context, b2, a(iyVar), map)) {
            RemoteViews a3 = a(context, iyVar, bArr);
            PendingIntent a4 = a(context, iyVar, iyVar.b(), bArr, b2);
            if (a4 != null) {
                b a5 = a(context, iyVar, bArr, a3, a4, b2);
                cVar.f24641a = a5.f24640a;
                cVar.f923a = a(iyVar);
                Notification notification = a5.f922a;
                if (com.xiaomi.push.j.m2117a()) {
                    if (!TextUtils.isEmpty(m2102a.m2068a())) {
                        notification.extras.putString(Constant.PROP_MESSAGE_ID, m2102a.m2068a());
                    }
                    notification.extras.putString("local_paid", iyVar.m2103a());
                    ax.a(map, notification.extras, "msg_busi_type");
                    ax.a(map, notification.extras, "disable_notification_flags");
                    String str3 = m2102a.m2074b() == null ? null : m2102a.m2074b().get("score_info");
                    if (!TextUtils.isEmpty(str3)) {
                        notification.extras.putString("score_info", str3);
                    }
                    notification.extras.putString("pushUid", a(m2102a.f573a, "n_stats_expose"));
                    int i2 = -1;
                    if (c(iyVar)) {
                        i2 = 1000;
                    } else if (m2275a(iyVar)) {
                        i2 = 3000;
                    }
                    notification.extras.putString("eventMessageType", String.valueOf(i2));
                    notification.extras.putString(HiAnalyticsConstant.BI_KEY_TARGET_PACKAGE, a(iyVar));
                }
                String str4 = m2102a.m2069a() == null ? null : m2102a.m2069a().get("message_count");
                if (com.xiaomi.push.j.m2117a() && str4 != null) {
                    try {
                        ax.a(notification, Integer.parseInt(str4));
                    } catch (NumberFormatException e) {
                        if (m2102a != null) {
                            fd.a(context.getApplicationContext()).b(iyVar.b(), b(iyVar), m2102a.m2068a(), "8");
                        }
                        com.xiaomi.channel.commonutils.logger.b.d("fail to set message count. " + e);
                    }
                }
                String a6 = a(iyVar);
                ax.m2298a(notification, a6);
                aw a7 = aw.a(context, a6);
                if (com.xiaomi.push.j.m2118a(context) && f917a != null) {
                    f917a.a(iyVar, m2102a.m2069a(), b2, notification);
                }
                if (!com.xiaomi.push.j.m2118a(context) || f917a == null || !f917a.a(m2102a.m2069a(), b2, notification)) {
                    a7.a(b2, notification);
                    cVar.f924a = true;
                    com.xiaomi.channel.commonutils.logger.b.m1616a("notification: " + m2102a.m2068a() + " is notifyied");
                } else {
                    com.xiaomi.channel.commonutils.logger.b.b("consume this notificaiton by agent");
                }
                if (com.xiaomi.push.j.m2117a() && com.xiaomi.push.j.m2118a(context)) {
                    at.a().a(context, b2, notification);
                    cd.m2329a(context, a6, b2, m2102a.m2068a(), notification);
                }
                if (m2275a(iyVar)) {
                    fd.a(context.getApplicationContext()).a(iyVar.b(), b(iyVar), m2102a.m2068a(), 3002, null);
                }
                if (c(iyVar)) {
                    fd.a(context.getApplicationContext()).a(iyVar.b(), b(iyVar), m2102a.m2068a(), 1002, null);
                }
                if (Build.VERSION.SDK_INT < 26) {
                    if (m2102a != null) {
                        str2 = m2102a.m2068a();
                    }
                    com.xiaomi.push.ah a8 = com.xiaomi.push.ah.a(context);
                    int a9 = a(m2102a.m2069a());
                    if (a9 > 0 && !TextUtils.isEmpty(str2)) {
                        String str5 = "n_timeout_" + str2;
                        a8.m1699a(str5);
                        a8.b(new am(str5, a7, b2), a9);
                    }
                }
                Pair<Integer, iy> pair = new Pair<>(Integer.valueOf(b2), iyVar);
                synchronized (f918a) {
                    f918a.add(pair);
                    if (f918a.size() > 100) {
                        f918a.remove();
                    }
                }
                return cVar;
            }
            if (m2102a != null) {
                fd.a(context.getApplicationContext()).a(iyVar.b(), b(iyVar), m2102a.m2068a(), "11");
            }
            str = "The click PendingIntent is null. ";
        } else {
            if (m2102a != null) {
                fd.a(context.getApplicationContext()).a(iyVar.b(), b(iyVar), m2102a.m2068a(), "14:" + a(iyVar));
            }
            str = "Do not notify because card notification is canceled or sequence incorrect";
        }
        com.xiaomi.channel.commonutils.logger.b.m1616a(str);
        return cVar;
    }

    private static String a(Context context, String str, Map<String, String> map) {
        return (map == null || TextUtils.isEmpty(map.get("channel_name"))) ? com.xiaomi.push.g.m1950b(context, str) : map.get("channel_name");
    }

    public static String a(iy iyVar) {
        ip m2102a;
        if ("com.xiaomi.xmsf".equals(iyVar.f665b) && (m2102a = iyVar.m2102a()) != null && m2102a.m2069a() != null) {
            String str = m2102a.m2069a().get("miui_package_name");
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
        }
        return iyVar.f665b;
    }

    public static String a(Map<String, String> map, int i) {
        String format = i == 0 ? "notify_effect" : m2280b(map) ? String.format("cust_btn_%s_ne", Integer.valueOf(i)) : i == 1 ? "notification_style_button_left_notify_effect" : i == 2 ? "notification_style_button_mid_notify_effect" : i == 3 ? "notification_style_button_right_notify_effect" : i == 4 ? "notification_colorful_button_notify_effect" : null;
        if (map == null || format == null) {
            return null;
        }
        return map.get(format);
    }

    private static String a(Map<String, String> map, String str) {
        if (map != null) {
            return map.get(str);
        }
        return null;
    }

    private static void a(Context context, Intent intent, iy iyVar, ip ipVar, String str, int i) {
        if (iyVar == null || ipVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        String a2 = a(ipVar.m2069a(), i);
        if (TextUtils.isEmpty(a2)) {
            return;
        }
        if (!bj.f24670a.equals(a2) && !bj.b.equals(a2) && !bj.c.equals(a2)) {
            return;
        }
        intent.putExtra("messageId", str);
        intent.putExtra("local_paid", iyVar.f661a);
        if (!TextUtils.isEmpty(iyVar.f665b)) {
            intent.putExtra(HiAnalyticsConstant.BI_KEY_TARGET_PACKAGE, iyVar.f665b);
        }
        intent.putExtra("job_key", a(ipVar.m2069a(), "jobkey"));
        intent.putExtra(i + "_target_component", a(context, iyVar.f665b, ipVar.m2069a(), i));
    }

    /* renamed from: a  reason: collision with other method in class */
    public static void m2272a(Context context, String str) {
        a(context, str, -1);
    }

    public static void a(Context context, String str, int i) {
        a(context, str, i, -1);
    }

    public static void a(Context context, String str, int i, int i2) {
        int hashCode;
        if (context == null || TextUtils.isEmpty(str) || i < -1) {
            return;
        }
        aw a2 = aw.a(context, str);
        List<StatusBarNotification> m2297b = a2.m2297b();
        if (com.xiaomi.push.s.a(m2297b)) {
            return;
        }
        LinkedList linkedList = new LinkedList();
        boolean z = false;
        if (i == -1) {
            hashCode = 0;
            z = true;
        } else {
            hashCode = ((str.hashCode() / 10) * 10) + i;
        }
        Iterator<StatusBarNotification> it = m2297b.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            StatusBarNotification next = it.next();
            if (!TextUtils.isEmpty(String.valueOf(next.getId()))) {
                int id = next.getId();
                if (z) {
                    linkedList.add(next);
                    a2.a(id);
                } else if (hashCode == id) {
                    d.a(context, next, i2);
                    linkedList.add(next);
                    a2.a(id);
                    break;
                }
            }
        }
        a(context, linkedList);
    }

    private static void a(Context context, String str, ff ffVar, Map<String, String> map) {
        int a2 = a(context, str, "mipush_small_notification");
        int a3 = a(context, str, "mipush_notification");
        if (com.xiaomi.push.j.m2118a(context)) {
            if (a2 <= 0 || a3 <= 0) {
                b(context, str, ffVar, map);
                return;
            }
            ffVar.setSmallIcon(a2);
            ffVar.setLargeIcon(a(context, a3));
            return;
        }
        if (a2 > 0) {
            ffVar.setSmallIcon(a2);
        } else {
            b(context, str, ffVar, map);
        }
        if (a3 <= 0) {
            return;
        }
        ffVar.setLargeIcon(a(context, a3));
    }

    public static void a(Context context, String str, String str2, String str3) {
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return;
        }
        aw a2 = aw.a(context, str);
        List<StatusBarNotification> m2297b = a2.m2297b();
        if (com.xiaomi.push.s.a(m2297b)) {
            return;
        }
        LinkedList linkedList = new LinkedList();
        for (StatusBarNotification statusBarNotification : m2297b) {
            Notification notification = statusBarNotification.getNotification();
            if (notification != null && !TextUtils.isEmpty(String.valueOf(statusBarNotification.getId()))) {
                int id = statusBarNotification.getId();
                String a3 = ax.a(notification);
                String b2 = ax.b(notification);
                if (!TextUtils.isEmpty(a3) && !TextUtils.isEmpty(b2) && a(a3, str2) && a(b2, str3)) {
                    linkedList.add(statusBarNotification);
                    a2.a(id);
                }
            }
        }
        a(context, linkedList);
    }

    public static void a(Context context, LinkedList<? extends Object> linkedList) {
        if (linkedList == null || linkedList.size() <= 0) {
            return;
        }
        ca.a(context, "category_clear_notification", "clear_notification", linkedList.size(), "");
    }

    private static void a(Intent intent) {
        if (intent == null) {
            return;
        }
        int flags = intent.getFlags() & (-2) & (-3) & (-65);
        if (Build.VERSION.SDK_INT >= 21) {
            flags &= BSError.BSDIFF_PATCH_FAILED;
        }
        intent.setFlags(flags);
    }

    private static void a(ff ffVar, Context context, String str, iy iyVar, byte[] bArr, int i) {
        PendingIntent a2;
        PendingIntent a3;
        PendingIntent a4;
        PendingIntent a5;
        Map<String, String> m2069a = iyVar.m2102a().m2069a();
        if (TextUtils.equals("3", m2069a.get("notification_style_type")) || TextUtils.equals("4", m2069a.get("notification_style_type"))) {
            return;
        }
        if (m2280b(m2069a)) {
            for (int i2 = 1; i2 <= 3; i2++) {
                String str2 = m2069a.get(String.format("cust_btn_%s_n", Integer.valueOf(i2)));
                if (!TextUtils.isEmpty(str2) && (a5 = a(context, str, iyVar, bArr, i, i2)) != null) {
                    ffVar.addAction(0, str2, a5);
                }
            }
            return;
        }
        if (!TextUtils.isEmpty(m2069a.get("notification_style_button_left_name")) && (a4 = a(context, str, iyVar, bArr, i, 1)) != null) {
            ffVar.addAction(0, m2069a.get("notification_style_button_left_name"), a4);
        }
        if (!TextUtils.isEmpty(m2069a.get("notification_style_button_mid_name")) && (a3 = a(context, str, iyVar, bArr, i, 2)) != null) {
            ffVar.addAction(0, m2069a.get("notification_style_button_mid_name"), a3);
        }
        if (TextUtils.isEmpty(m2069a.get("notification_style_button_right_name")) || (a2 = a(context, str, iyVar, bArr, i, 3)) == null) {
            return;
        }
        ffVar.addAction(0, m2069a.get("notification_style_button_right_name"), a2);
    }

    private static boolean a(Context context, iy iyVar, String str) {
        if (iyVar != null && iyVar.m2102a() != null && iyVar.m2102a().m2069a() != null && !TextUtils.isEmpty(str)) {
            return Boolean.parseBoolean(iyVar.m2102a().m2069a().get("use_clicked_activity")) && m.a(context, a(str));
        }
        com.xiaomi.channel.commonutils.logger.b.m1616a("should clicked activity params are null.");
        return false;
    }

    /* renamed from: a  reason: collision with other method in class */
    public static boolean m2273a(Context context, String str) {
        return com.xiaomi.push.g.m1951b(context, str);
    }

    /* renamed from: a  reason: collision with other method in class */
    public static boolean m2274a(Context context, String str, boolean z) {
        return com.xiaomi.push.j.m2117a() && !z && m2273a(context, str);
    }

    private static boolean a(ip ipVar) {
        if (ipVar != null) {
            String m2068a = ipVar.m2068a();
            return !TextUtils.isEmpty(m2068a) && m2068a.length() == 22 && "satuigmo".indexOf(m2068a.charAt(0)) >= 0;
        }
        return false;
    }

    /* renamed from: a  reason: collision with other method in class */
    public static boolean m2275a(iy iyVar) {
        ip m2102a = iyVar.m2102a();
        return a(m2102a) && m2102a.l();
    }

    private static boolean a(String str, String str2) {
        return TextUtils.isEmpty(str) || str2.contains(str);
    }

    /* renamed from: a  reason: collision with other method in class */
    public static boolean m2276a(Map<String, String> map) {
        if (map == null || !map.containsKey("notify_foreground")) {
            return true;
        }
        return "1".equals(map.get("notify_foreground"));
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004f, code lost:
        if (android.text.TextUtils.isEmpty(r3) == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0072, code lost:
        if (android.text.TextUtils.isEmpty(r3) == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0074, code lost:
        r1 = r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String[] a(android.content.Context r3, com.xiaomi.push.ip r4) {
        /*
            java.lang.String r0 = r4.m2076c()
            java.lang.String r1 = r4.d()
            java.util.Map r4 = r4.m2069a()
            if (r4 == 0) goto L75
            android.content.res.Resources r2 = r3.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            int r2 = r2.widthPixels
            android.content.res.Resources r3 = r3.getResources()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            float r2 = (float) r2
            float r2 = r2 / r3
            r3 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 + r3
            java.lang.Float r3 = java.lang.Float.valueOf(r2)
            int r3 = r3.intValue()
            r2 = 320(0x140, float:4.48E-43)
            if (r3 > r2) goto L52
            java.lang.String r3 = "title_short"
            java.lang.Object r3 = r4.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            boolean r2 = android.text.TextUtils.isEmpty(r3)
            if (r2 != 0) goto L43
            r0 = r3
        L43:
            java.lang.String r3 = "description_short"
            java.lang.Object r3 = r4.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 != 0) goto L75
            goto L74
        L52:
            r2 = 360(0x168, float:5.04E-43)
            if (r3 <= r2) goto L75
            java.lang.String r3 = "title_long"
            java.lang.Object r3 = r4.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            boolean r2 = android.text.TextUtils.isEmpty(r3)
            if (r2 != 0) goto L66
            r0 = r3
        L66:
            java.lang.String r3 = "description_long"
            java.lang.Object r3 = r4.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 != 0) goto L75
        L74:
            r1 = r3
        L75:
            r3 = 2
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = 0
            r3[r4] = r0
            r4 = 1
            r3[r4] = r1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.al.a(android.content.Context, com.xiaomi.push.ip):java.lang.String[]");
    }

    private static int b(Context context, String str) {
        int a2 = a(context, str, "mipush_notification");
        int a3 = a(context, str, "mipush_small_notification");
        if (a2 <= 0) {
            a2 = a3 > 0 ? a3 : context.getApplicationInfo().icon;
        }
        return a2 == 0 ? context.getApplicationInfo().logo : a2;
    }

    private static int b(Map<String, String> map) {
        if (map != null) {
            String str = map.get("channel_importance");
            if (TextUtils.isEmpty(str)) {
                return 3;
            }
            try {
                com.xiaomi.channel.commonutils.logger.b.c("importance=" + str);
                return Integer.parseInt(str);
            } catch (Exception e) {
                com.xiaomi.channel.commonutils.logger.b.d("parsing channel importance error: " + e);
                return 3;
            }
        }
        return 3;
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x0151  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.content.Intent b(android.content.Context r5, java.lang.String r6, java.util.Map<java.lang.String, java.lang.String> r7, int r8) {
        /*
            Method dump skipped, instructions count: 429
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.al.b(android.content.Context, java.lang.String, java.util.Map, int):android.content.Intent");
    }

    public static String b(iy iyVar) {
        return m2275a(iyVar) ? "E100002" : c(iyVar) ? "E100000" : m2279b(iyVar) ? "E100001" : d(iyVar) ? "E100003" : "";
    }

    /* renamed from: b  reason: collision with other method in class */
    public static void m2277b(Context context, String str) {
        if (!com.xiaomi.push.j.m2118a(context) || f917a == null || TextUtils.isEmpty(str)) {
            return;
        }
        f917a.a(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(Context context, String str, int i) {
        context.getSharedPreferences("pref_notify_type", 0).edit().putInt(str, i).commit();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void b(android.content.Context r2, java.lang.String r3, com.xiaomi.push.ff r4, java.util.Map<java.lang.String, java.lang.String> r5) {
        /*
            boolean r0 = com.xiaomi.push.j.m2118a(r2)
            if (r0 != 0) goto L2c
            java.lang.String r0 = "fcm_icon_uri"
            java.lang.String r0 = a(r5, r0)
            java.lang.String r1 = "fcm_icon_color"
            java.lang.String r5 = a(r5, r1)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L2c
            boolean r1 = android.text.TextUtils.isEmpty(r5)
            if (r1 != 0) goto L2c
            int r0 = a(r2, r3, r0)
            if (r0 <= 0) goto L2c
            r1 = 1
            r4.setSmallIcon(r0)
            r4.m1924a(r5)
            goto L2d
        L2c:
            r1 = 0
        L2d:
            if (r1 != 0) goto L48
            int r5 = android.os.Build.VERSION.SDK_INT
            r0 = 23
            if (r5 < r0) goto L41
            int r2 = com.xiaomi.push.service.ax.a(r2, r3)
            android.graphics.drawable.Icon r2 = android.graphics.drawable.Icon.createWithResource(r3, r2)
            r4.setSmallIcon(r2)
            return
        L41:
            int r2 = b(r2, r3)
            r4.setSmallIcon(r2)
        L48:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.al.b(android.content.Context, java.lang.String, com.xiaomi.push.ff, java.util.Map):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b  reason: collision with other method in class */
    public static boolean m2278b(Context context, String str) {
        return context.getSharedPreferences("pref_notify_type", 0).contains(str);
    }

    /* renamed from: b  reason: collision with other method in class */
    public static boolean m2279b(iy iyVar) {
        ip m2102a = iyVar.m2102a();
        return a(m2102a) && m2102a.f575b == 1 && !m2275a(iyVar);
    }

    /* renamed from: b  reason: collision with other method in class */
    private static boolean m2280b(Map<String, String> map) {
        if (map == null) {
            com.xiaomi.channel.commonutils.logger.b.m1616a("meta extra is null");
            return false;
        }
        return "6".equals(map.get("notification_style_type"));
    }

    private static int c(Map<String, String> map) {
        if (map != null) {
            String str = map.get("notification_priority");
            if (TextUtils.isEmpty(str)) {
                return 0;
            }
            try {
                com.xiaomi.channel.commonutils.logger.b.c("priority=" + str);
                return Integer.parseInt(str);
            } catch (Exception e) {
                com.xiaomi.channel.commonutils.logger.b.d("parsing notification priority error: " + e);
                return 0;
            }
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(Context context, String str) {
        context.getSharedPreferences("pref_notify_type", 0).edit().remove(str).commit();
    }

    public static boolean c(iy iyVar) {
        ip m2102a = iyVar.m2102a();
        return a(m2102a) && m2102a.f575b == 0 && !m2275a(iyVar);
    }

    public static boolean d(iy iyVar) {
        return iyVar.a() == ic.Registration;
    }

    public static boolean e(iy iyVar) {
        return m2275a(iyVar) || c(iyVar) || m2279b(iyVar);
    }
}
