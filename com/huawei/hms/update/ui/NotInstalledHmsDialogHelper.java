package com.huawei.hms.update.ui;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.pm.PackageManager;
import mtopsdk.common.util.StringUtils;
import android.util.AndroidException;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.Checker;
import com.huawei.hms.utils.ResourceLoaderUtil;
import com.huawei.hms.utils.UIUtil;

/* loaded from: classes4.dex */
public class NotInstalledHmsDialogHelper {
    private static String a(Context context, String str) {
        String str2;
        if (context == null) {
            str2 = "In getAppName, context is null.";
        } else {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                str2 = "In getAppName, Failed to get 'PackageManager' instance.";
            } else {
                try {
                    if (StringUtils.isEmpty(str)) {
                        str = context.getPackageName();
                    }
                    CharSequence applicationLabel = packageManager.getApplicationLabel(packageManager.getApplicationInfo(str, 128));
                    return applicationLabel == null ? "" : applicationLabel.toString();
                } catch (AndroidException | RuntimeException unused) {
                    str2 = "In getAppName, Failed to get app name.";
                }
            }
        }
        HMSLog.e("NotInstalledHmsDialogHelper", str2);
        return "";
    }

    private static void a(Context context) {
        if (ResourceLoaderUtil.getmContext() == null) {
            ResourceLoaderUtil.setmContext(context.getApplicationContext());
        }
    }

    public static String getAppName(Activity activity) {
        return a(activity, activity.getPackageName());
    }

    public static int getConfirmResId(Activity activity) {
        Checker.checkNonNull(activity, "activity must not be null");
        a(activity);
        return ResourceLoaderUtil.getStringId("hms_confirm");
    }

    public static AlertDialog.Builder getDialogBuilder(Activity activity) {
        Checker.checkNonNull(activity, "activity must not be null");
        a(activity);
        return new AlertDialog.Builder(activity, UIUtil.getDialogThemeId(activity)).setMessage(activity.getString(ResourceLoaderUtil.getStringId("hms_apk_not_installed_hints"), new Object[]{a(activity, activity.getPackageName())}));
    }
}
