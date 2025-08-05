package com.xiaomi.push.service;

import android.app.Notification;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.provider.Settings;
import android.support.v4.app.NotificationCompat;
import android.text.TextUtils;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

/* loaded from: classes9.dex */
public class ax {

    /* renamed from: a  reason: collision with other field name */
    private static final String[] f941a = {"com.mi.globalbrowser", "com.android.browser"};

    /* renamed from: a  reason: collision with other field name */
    private static String f940a = null;

    /* renamed from: a  reason: collision with root package name */
    public static final a<String, String, String> f24654a = new a<>("setSound", "canSound", "canSound");
    public static final a<String, String, String> b = new a<>("setVibrate", "canVibrate", "canVibrate");
    public static final a<String, String, String> c = new a<>("setLights", "canLights", "canLights");
    public static final a<String, String, String> d = new a<>("setShowOnKeyguard", "canShowOnKeyguard", "canShowOnKeyguard");
    public static final a<String, String, String> e = new a<>("setFloat", "canFloat", "canShowFloat");
    public static final a<String, String, String> f = new a<>("setShowBadge", "canShowBadge", "canShowBadge");

    /* loaded from: classes9.dex */
    public static class a<F, S, T> {

        /* renamed from: a  reason: collision with root package name */
        F f24655a;
        S b;
        T c;

        private a(F f, S s, T t) {
            this.f24655a = f;
            this.b = s;
            this.c = t;
        }
    }

    public static int a(ContentResolver contentResolver) {
        try {
            return Settings.Global.getInt(contentResolver, "user_aggregate", 0);
        } catch (Exception e2) {
            com.xiaomi.channel.commonutils.logger.b.m1616a("get user aggregate failed, " + e2);
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(Context context, String str) {
        return com.xiaomi.push.g.b(context, str);
    }

    public static int a(Context context, String str, String str2, a<String, String, String> aVar) {
        if (aVar != null) {
            try {
                Bundle a2 = a(context, aVar.b, str, str2, (Bundle) null);
                if (a2 == null || !a2.containsKey(aVar.c)) {
                    return -1;
                }
                return a2.getBoolean(aVar.c) ? 1 : 0;
            } catch (Exception unused) {
                return -1;
            }
        }
        return -1;
    }

    private static Bundle a(Context context, String str, String str2, String str3, Bundle bundle) {
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            throw new IllegalArgumentException("call notification provider failed!");
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString("package", str2);
        if (!TextUtils.isEmpty(str3)) {
            bundle2.putString(com.taobao.android.livehome.plugin.atype.flexalocal.utils.d.BUNDLE_BUSINESS_ID, str3);
        }
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        return context.getContentResolver().call(Uri.parse("content://statusbar.notification"), str, (String) null, bundle2);
    }

    public static <T> T a(Notification notification, String str) {
        if (notification.extras != null) {
            try {
                return (T) notification.extras.get(str);
            } catch (Exception unused) {
                return null;
            }
        }
        return null;
    }

    public static <T> T a(Object obj, String str, T t) {
        T t2;
        try {
        } catch (Exception e2) {
            com.xiaomi.channel.commonutils.logger.b.m1616a("get value error " + e2);
        }
        if (obj instanceof Notification) {
            t2 = (T) a((Notification) obj, str);
        } else if (obj instanceof Map) {
            t2 = (T) ((Map) obj).get(str);
        } else if (obj instanceof Bundle) {
            t2 = (T) ((Bundle) obj).get(str);
        } else {
            com.xiaomi.channel.commonutils.logger.b.m1616a("not support get value from classType:" + obj);
            t2 = null;
        }
        return t2 == null ? t : t2;
    }

    public static String a(Notification notification) {
        CharSequence charSequence;
        if (notification.extras != null) {
            charSequence = notification.extras.getCharSequence(NotificationCompat.EXTRA_TITLE);
            if (TextUtils.isEmpty(charSequence)) {
                charSequence = notification.extras.getCharSequence(NotificationCompat.EXTRA_TITLE_BIG);
            }
            if (TextUtils.isEmpty(charSequence)) {
                charSequence = notification.extras.getCharSequence("mipush.customTitle");
            }
        } else {
            charSequence = null;
        }
        return charSequence != null ? charSequence.toString() : "";
    }

    public static String a(Object obj) {
        return (String) a(obj, "msg_busi_type", "");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Notification notification, int i) {
        try {
            if (notification.extras != null) {
                notification.extras.putInt("miui.messageCount", i);
            }
            Object a2 = com.xiaomi.push.bh.a(notification, "extraNotification");
            if (a2 == null) {
                return;
            }
            com.xiaomi.push.bh.a(a2, "setMessageCount", Integer.valueOf(i));
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Notification notification, int i, int i2) {
        if (notification != null) {
            if (notification.extras == null) {
                notification.extras = new Bundle();
            }
            notification.extras.putInt("is_priority", i);
            notification.extras.putInt("mipush_class", i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a  reason: collision with other method in class */
    public static void m2298a(Notification notification, String str) {
        try {
            if (notification.extras != null) {
                notification.extras.putString(HiAnalyticsConstant.BI_KEY_TARGET_PACKAGE, str);
            }
            Object a2 = com.xiaomi.push.bh.a(notification, "extraNotification");
            if (a2 == null) {
                return;
            }
            com.xiaomi.push.bh.a(a2, "setTargetPkg", str);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Notification notification, boolean z) {
        try {
            if (notification.extras != null) {
                notification.extras.putBoolean("miui.enableFloat", z);
            }
            Object a2 = com.xiaomi.push.bh.a(notification, "extraNotification");
            if (a2 == null) {
                return;
            }
            com.xiaomi.push.bh.a(a2, "setEnableFloat", Boolean.valueOf(z));
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Context context, String str, Intent intent) {
        if (intent == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str)) {
            arrayList.add(str);
        }
        arrayList.addAll(Arrays.asList(f941a));
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            String str2 = (String) arrayList.get(i);
            if (!TextUtils.isEmpty(str2)) {
                Intent intent2 = new Intent(intent);
                intent2.setPackage(str2);
                try {
                    if (context.getPackageManager().resolveActivity(intent2, 65536) != null) {
                        intent.setPackage(str2);
                        break;
                    }
                    continue;
                } catch (Exception e2) {
                    com.xiaomi.channel.commonutils.logger.b.m1616a("can't match url intent. " + e2);
                }
            }
        }
        intent.setPackage(intent.getPackage());
    }

    public static void a(Map<String, String> map, Bundle bundle, String str) {
        if (map == null || bundle == null || TextUtils.isEmpty(str)) {
            com.xiaomi.channel.commonutils.logger.b.m1616a("cp map to b fail:" + str);
        } else if (TextUtils.isEmpty(map.get(str))) {
            bundle.remove(str);
        } else {
            bundle.putString(str, map.get(str));
        }
    }

    public static boolean a(Notification.Builder builder, boolean z) {
        if (Build.VERSION.SDK_INT >= 26) {
            builder.setGroupAlertBehavior(z ? 2 : 1);
            return true;
        }
        com.xiaomi.channel.commonutils.logger.b.b("not support setGroupAlertBehavior");
        return false;
    }

    /* renamed from: a  reason: collision with other method in class */
    public static boolean m2299a(ContentResolver contentResolver) {
        int a2 = a(contentResolver);
        return a2 == 1 || a2 == 2;
    }

    public static boolean a(Context context, String str, String str2, a<String, String, String> aVar, boolean z) {
        if (aVar != null) {
            try {
                Bundle bundle = new Bundle();
                bundle.putBoolean(aVar.c, z);
                a(context, aVar.f24655a, str, str2, bundle);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public static boolean a(Map<String, String> map) {
        return Boolean.parseBoolean((String) a(map, "not_suppress", "true"));
    }

    /* renamed from: a  reason: collision with other method in class */
    public static Notification.Action[] m2300a(Notification notification) {
        Parcelable[] parcelableArray;
        if (notification.actions != null) {
            return notification.actions;
        }
        if (notification.extras != null && (parcelableArray = notification.extras.getParcelableArray("mipush.customActions")) != null) {
            return (Notification.Action[]) Arrays.copyOf(parcelableArray, parcelableArray.length, Notification.Action[].class);
        }
        return null;
    }

    public static String b(Notification notification) {
        CharSequence charSequence;
        if (notification.extras != null) {
            charSequence = notification.extras.getCharSequence(NotificationCompat.EXTRA_TEXT);
            if (TextUtils.isEmpty(charSequence) && Build.VERSION.SDK_INT >= 21) {
                charSequence = notification.extras.getCharSequence(NotificationCompat.EXTRA_BIG_TEXT);
            }
            if (TextUtils.isEmpty(charSequence)) {
                charSequence = notification.extras.getCharSequence("mipush.customContent");
            }
        } else {
            charSequence = null;
        }
        return charSequence != null ? charSequence.toString() : "";
    }

    public static void b(Notification notification, boolean z) {
        try {
            if (notification.extras != null) {
                notification.extras.putBoolean("miui.enableKeyguard", z);
            }
            Object a2 = com.xiaomi.push.bh.a(notification, "extraNotification");
            if (a2 == null) {
                return;
            }
            com.xiaomi.push.bh.a(a2, "setEnableKeyguard", Boolean.valueOf(z));
        } catch (Exception unused) {
        }
    }

    public static String c(Notification notification) {
        Object a2;
        String str = null;
        try {
            if (notification.extras != null) {
                str = notification.extras.getString(HiAnalyticsConstant.BI_KEY_TARGET_PACKAGE);
            }
            if (TextUtils.isEmpty(str) && (a2 = com.xiaomi.push.bh.a(notification, "extraNotification")) != null) {
                return (String) com.xiaomi.push.bh.a(a2, "getTargetPkg", new Object[0]);
            }
        } catch (Exception unused) {
        }
        return str;
    }
}
