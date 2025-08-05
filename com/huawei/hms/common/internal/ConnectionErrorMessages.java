package com.huawei.hms.common.internal;

import android.app.Activity;
import android.content.Context;
import com.huawei.hms.adapter.AvailableUtil;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.ResourceLoaderUtil;
import com.huawei.hms.utils.Util;

/* loaded from: classes4.dex */
public class ConnectionErrorMessages {
    private static boolean a(Context context) {
        return context != null && Util.isAvailableLibExist(context) && AvailableUtil.isInstallerLibExist(context);
    }

    public static String getErrorDialogButtonMessage(Activity activity, int i) {
        String str;
        if (ResourceLoaderUtil.getmContext() == null) {
            ResourceLoaderUtil.setmContext(activity.getApplicationContext());
        }
        if (i != 1) {
            if (i == 2 && a(activity)) {
                str = "hms_update";
            }
            return ResourceLoaderUtil.getString("hms_confirm");
        } else if (!a(activity)) {
            return ResourceLoaderUtil.getString("hms_confirm");
        } else {
            str = "hms_install";
        }
        return ResourceLoaderUtil.getString(str);
    }

    public static String getErrorMessage(Activity activity, int i) {
        if (activity == null) {
            return null;
        }
        if (ResourceLoaderUtil.getmContext() == null) {
            ResourceLoaderUtil.setmContext(activity.getApplicationContext());
        }
        if (i != 1 && i != 2) {
            return null;
        }
        return a(activity) ? ResourceLoaderUtil.getString("hms_update_title") : activity.getString(ResourceLoaderUtil.getStringId("hms_apk_not_installed_hints"), new Object[]{Util.getAppName(activity, activity.getPackageName())});
    }

    public static String getErrorTitle(Activity activity, int i) {
        String str;
        String str2;
        if (ResourceLoaderUtil.getmContext() == null) {
            ResourceLoaderUtil.setmContext(activity.getApplicationContext());
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 9) {
                        str2 = "Unexpected error code " + i;
                    } else {
                        str2 = "Huawei Mobile Services is invalid. Cannot recover.";
                    }
                    HMSLog.e("HuaweiApiAvailability", str2);
                    return null;
                }
                str = "hms_bindfaildlg_message";
            } else if (!a(activity)) {
                return null;
            } else {
                str = "hms_update_message";
            }
        } else if (!a(activity)) {
            return null;
        } else {
            str = "hms_install_message";
        }
        return ResourceLoaderUtil.getString(str);
    }
}
