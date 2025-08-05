package tb;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.service.notification.StatusBarNotification;
import com.heytap.msp.push.notification.PushNotification;
import com.huawei.hms.push.constant.RemoteMessageConst;

/* loaded from: classes4.dex */
public class cvl {
    static {
        kge.a(265605029);
    }

    public static Notification a(Context context, String str, PushNotification.Builder builder) {
        Notification.Builder builder2 = new Notification.Builder(context);
        if (Build.VERSION.SDK_INT >= 26) {
            builder2.setChannelId(cvi.DEFAULT_NOTIFICATION_CHANNEL_ID);
        }
        if (Build.VERSION.SDK_INT >= 20) {
            builder2.setGroup(str);
            builder2.setGroupSummary(true);
        }
        if (a(builder2, builder)) {
            return builder2.build();
        }
        return null;
    }

    public static NotificationManager a(Context context) {
        if (context != null) {
            try {
                return (NotificationManager) context.getSystemService(RemoteMessageConst.NOTIFICATION);
            } catch (Throwable unused) {
                return null;
            }
        }
        return null;
    }

    private static boolean a(Notification.Builder builder, PushNotification.Builder builder2) {
        int iconRes = builder2.getIconRes();
        int iconLevel = builder2.getIconLevel();
        Icon icon = builder2.getIcon();
        if (icon != null && Build.VERSION.SDK_INT >= 23) {
            builder.setSmallIcon(icon);
            return true;
        } else if (iconRes != 0 && iconLevel != 0) {
            builder.setSmallIcon(iconRes, iconLevel);
            return true;
        } else if (iconRes == 0) {
            return false;
        } else {
            builder.setSmallIcon(iconRes);
            return true;
        }
    }

    public static boolean a(NotificationManager notificationManager, String str, int i) {
        StatusBarNotification[] a2 = a(notificationManager, str);
        if (a2 != null && a2.length != 0) {
            for (StatusBarNotification statusBarNotification : a2) {
                if (statusBarNotification.getId() == i) {
                    return true;
                }
            }
        }
        return false;
    }

    public static StatusBarNotification[] a(NotificationManager notificationManager, String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            return notificationManager.getActiveNotifications();
        }
        return null;
    }
}
