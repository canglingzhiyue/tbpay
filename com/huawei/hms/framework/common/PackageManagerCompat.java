package com.huawei.hms.framework.common;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import mtopsdk.common.util.StringUtils;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class PackageManagerCompat {
    private static final String TAG = "PackageUtils";
    private static final String VERSION = "6.0.2.300";
    private static String sAppVersion = "";

    public static String getAppPackageName(Context context) {
        if (ContextHolder.getAppContext() != null) {
            context = ContextHolder.getAppContext();
        }
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            return "";
        }
        try {
            return packageManager.getPackageInfo(context.getPackageName(), 16384).packageName;
        } catch (PackageManager.NameNotFoundException | RuntimeException unused) {
            Logger.w("PackageUtils", "Failed to get Package managers Package Info");
            return "";
        }
    }

    public static String getAppVersion(Context context) {
        if (!StringUtils.isEmpty(sAppVersion)) {
            return sAppVersion;
        }
        if (ContextHolder.getAppContext() != null) {
            context = ContextHolder.getAppContext();
        }
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            return sAppVersion;
        }
        try {
            sAppVersion = String.valueOf(packageManager.getPackageInfo(context.getPackageName(), 16384).versionCode);
        } catch (PackageManager.NameNotFoundException | RuntimeException unused) {
            Logger.w("PackageUtils", "Failed to get Package managers Package Info");
        }
        return sAppVersion;
    }

    private static Bundle getBundleFromApp(Context context) {
        PackageManager packageManager;
        Bundle bundle = Bundle.EMPTY;
        if (ContextHolder.getAppContext() != null) {
            context = ContextHolder.getAppContext();
        }
        if (context == null || (packageManager = context.getPackageManager()) == null) {
            return bundle;
        }
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128);
            return (applicationInfo == null || applicationInfo.metaData == null) ? bundle : applicationInfo.metaData;
        } catch (PackageManager.NameNotFoundException | RuntimeException e) {
            Logger.w("PackageUtils", "NameNotFoundException:", e);
            return bundle;
        }
    }

    private static Bundle getBundleFromKit(Context context) {
        String str;
        if (ContextHolder.getKitContext() != null) {
            context = ContextHolder.getKitContext();
        }
        if (context == null) {
            str = "the kitContext is null";
        } else if (context.getApplicationInfo() != null) {
            Bundle bundle = context.getApplicationInfo().metaData;
            return bundle == null ? Bundle.EMPTY : bundle;
        } else {
            str = "the kit applicationInfo is null";
        }
        Logger.v("PackageUtils", str);
        return Bundle.EMPTY;
    }

    private static Bundle getBundleFromKitOrAPP(Context context) {
        Bundle bundleFromKit = getBundleFromKit(context);
        return (bundleFromKit == null || bundleFromKit.isEmpty()) ? getBundleFromApp(context) : bundleFromKit;
    }

    public static String getMetaDataFromApp(Context context, String str, String str2) {
        Bundle bundleFromApp = getBundleFromApp(context);
        return bundleFromApp != null ? bundleFromApp.getString(str, str2) : str2;
    }

    public static String getMetaDataFromKit(Context context, String str, String str2) {
        try {
            Bundle bundleFromKit = getBundleFromKit(context);
            return bundleFromKit == null ? str2 : bundleFromKit.getString(str, str2);
        } catch (RuntimeException unused) {
            Logger.v("PackageUtils", "the kit metaData is runtimeException");
            return str2;
        }
    }

    public static String getMetaDataFromKitOrApp(Context context, String str, String str2) {
        return getBundleFromKitOrAPP(context).getString(str, str2);
    }

    public static Map<String, String> getMetaDataMapFromKitOrApp(Context context, String str) {
        HashMap hashMap = new HashMap();
        Bundle bundleFromKitOrAPP = getBundleFromKitOrAPP(context);
        for (String str2 : getBundleFromKitOrAPP(context).keySet()) {
            if (str2.startsWith(str)) {
                String string = bundleFromKitOrAPP.getString(str2);
                if (!StringUtils.isEmpty(string)) {
                    hashMap.put(str2.substring(str.length()), string);
                }
            }
        }
        return hashMap;
    }
}
