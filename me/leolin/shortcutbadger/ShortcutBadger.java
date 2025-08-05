package me.leolin.shortcutbadger;

import android.app.Notification;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.util.Log;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import me.leolin.shortcutbadger.impl.AdwHomeBadger;
import me.leolin.shortcutbadger.impl.ApexHomeBadger;
import me.leolin.shortcutbadger.impl.AsusHomeBadger;
import me.leolin.shortcutbadger.impl.DefaultBadger;
import me.leolin.shortcutbadger.impl.EverythingMeHomeBadger;
import me.leolin.shortcutbadger.impl.HuaweiHomeBadger;
import me.leolin.shortcutbadger.impl.NewHtcHomeBadger;
import me.leolin.shortcutbadger.impl.NovaHomeBadger;
import me.leolin.shortcutbadger.impl.OPPOHomeBader;
import me.leolin.shortcutbadger.impl.SamsungHomeBadger;
import me.leolin.shortcutbadger.impl.SonyHomeBadger;
import me.leolin.shortcutbadger.impl.VivoHomeBadger;
import me.leolin.shortcutbadger.impl.ZTEHomeBadger;
import me.leolin.shortcutbadger.impl.ZukHomeBadger;

/* loaded from: classes9.dex */
public final class ShortcutBadger {
    private static final String LOG_TAG = "ShortcutBadger";
    private static final int SUPPORTED_CHECK_ATTEMPTS = 3;

    /* renamed from: a  reason: collision with root package name */
    private static final List<Class<? extends b>> f24990a = new LinkedList();
    private static final Object b = new Object();
    private static b c;
    private static ComponentName d;
    private static volatile Boolean sIsBadgeCounterSupported;

    static {
        f24990a.add(AdwHomeBadger.class);
        f24990a.add(ApexHomeBadger.class);
        f24990a.add(DefaultBadger.class);
        f24990a.add(NewHtcHomeBadger.class);
        f24990a.add(NovaHomeBadger.class);
        f24990a.add(SonyHomeBadger.class);
        f24990a.add(AsusHomeBadger.class);
        f24990a.add(HuaweiHomeBadger.class);
        f24990a.add(OPPOHomeBader.class);
        f24990a.add(SamsungHomeBadger.class);
        f24990a.add(ZukHomeBadger.class);
        f24990a.add(VivoHomeBadger.class);
        f24990a.add(ZTEHomeBadger.class);
        f24990a.add(EverythingMeHomeBadger.class);
    }

    private ShortcutBadger() {
    }

    public static void a(Context context, int i) throws ShortcutBadgeException {
        if (c != null || a(context)) {
            try {
                c.a(context, d, i);
                return;
            } catch (Exception e) {
                throw new ShortcutBadgeException("Unable to execute badge", e);
            }
        }
        throw new ShortcutBadgeException("No default launcher available");
    }

    private static boolean a(Context context) {
        b bVar;
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
        if (launchIntentForPackage == null) {
            Log.e(LOG_TAG, "Unable to find launch intent for package " + context.getPackageName());
            return false;
        }
        d = launchIntentForPackage.getComponent();
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.HOME");
        for (ResolveInfo resolveInfo : context.getPackageManager().queryIntentActivities(intent, 65536)) {
            String str = resolveInfo.activityInfo.packageName;
            Iterator<Class<? extends b>> it = f24990a.iterator();
            while (true) {
                if (it.hasNext()) {
                    try {
                        bVar = it.next().newInstance();
                    } catch (Exception unused) {
                        bVar = null;
                    }
                    if (bVar != null && bVar.a().contains(str)) {
                        c = bVar;
                        break;
                    }
                }
            }
        }
        if (c != null) {
            return true;
        }
        c = Build.MANUFACTURER.equalsIgnoreCase("ZUK") ? new ZukHomeBadger() : Build.MANUFACTURER.equalsIgnoreCase("OPPO") ? new OPPOHomeBader() : Build.MANUFACTURER.equalsIgnoreCase("VIVO") ? new VivoHomeBadger() : Build.MANUFACTURER.equalsIgnoreCase("ZTE") ? new ZTEHomeBadger() : new DefaultBadger();
        return true;
    }

    public static boolean applyCount(Context context, int i) {
        try {
            a(context, i);
            return true;
        } catch (ShortcutBadgeException unused) {
            return false;
        }
    }

    public static void applyNotification(Context context, Notification notification, int i) {
        if (Build.MANUFACTURER.equalsIgnoreCase("Xiaomi")) {
            try {
                Object obj = notification.getClass().getDeclaredField("extraNotification").get(notification);
                obj.getClass().getDeclaredMethod("setMessageCount", Integer.TYPE).invoke(obj, Integer.valueOf(i));
            } catch (Exception unused) {
            }
        }
    }

    public static boolean isBadgeCounterSupported(Context context) {
        if (sIsBadgeCounterSupported == null) {
            synchronized (b) {
                if (sIsBadgeCounterSupported == null) {
                    String str = null;
                    for (int i = 0; i < 3; i++) {
                        try {
                            String str2 = "Checking if platform supports badge counters, attempt " + String.format("%d/%d.", Integer.valueOf(i + 1), 3);
                        } catch (Exception e) {
                            str = e.getMessage();
                        }
                        if (a(context)) {
                            c.a(context, d, 0);
                            sIsBadgeCounterSupported = true;
                            break;
                        }
                        str = "Failed to initialize the badge counter.";
                    }
                    if (sIsBadgeCounterSupported == null) {
                        String str3 = "Badge counter seems not supported for this platform: " + str;
                        sIsBadgeCounterSupported = false;
                    }
                }
            }
        }
        return sIsBadgeCounterSupported.booleanValue();
    }

    public static boolean removeCount(Context context) {
        return applyCount(context, 0);
    }

    public static void removeCountOrThrow(Context context) throws ShortcutBadgeException {
        a(context, 0);
    }
}
