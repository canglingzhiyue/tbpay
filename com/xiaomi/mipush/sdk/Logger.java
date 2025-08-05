package com.xiaomi.mipush.sdk;

import android.content.Context;
import com.xiaomi.channel.commonutils.logger.LoggerInterface;
import com.xiaomi.push.dx;
import com.xiaomi.push.dy;
import java.io.File;

/* loaded from: classes9.dex */
public class Logger {
    private static boolean sDisablePushLog = false;
    private static LoggerInterface sUserLogger;

    public static void disablePushFileLog(Context context) {
        sDisablePushLog = true;
        setPushLog(context);
    }

    public static void enablePushFileLog(Context context) {
        sDisablePushLog = false;
        setPushLog(context);
    }

    @Deprecated
    public static File getLogFile(String str) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static LoggerInterface getUserLogger() {
        return sUserLogger;
    }

    private static boolean hasWritePermission(Context context) {
        try {
            String[] strArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions;
            if (strArr != null) {
                for (String str : strArr) {
                    if ("android.permission.WRITE_EXTERNAL_STORAGE".equals(str)) {
                        return true;
                    }
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static void setLogger(Context context, LoggerInterface loggerInterface) {
        sUserLogger = loggerInterface;
        setPushLog(context);
    }

    public static void setPushLog(Context context) {
        boolean z = false;
        boolean z2 = sUserLogger != null;
        if (sDisablePushLog) {
            z2 = false;
        } else if (hasWritePermission(context)) {
            z = true;
        }
        dy dyVar = null;
        LoggerInterface loggerInterface = z2 ? sUserLogger : null;
        if (z) {
            dyVar = dy.a(context);
        }
        com.xiaomi.channel.commonutils.logger.b.a(new dx(loggerInterface, dyVar));
    }

    @Deprecated
    public static void uploadLogFile(Context context, boolean z) {
    }
}
