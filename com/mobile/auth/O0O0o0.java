package com.mobile.auth;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

/* loaded from: classes4.dex */
public class O0O0o0 {
    public static byte[] O000000o(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        if (context.getPackageName().equalsIgnoreCase(str)) {
            try {
                PackageInfo packageInfo = packageManager.getPackageInfo(context.getPackageName(), 64);
                if (packageInfo.packageName.equals(str)) {
                    return packageInfo.signatures[0].toByteArray();
                }
            } catch (PackageManager.NameNotFoundException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
