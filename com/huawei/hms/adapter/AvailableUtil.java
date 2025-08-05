package com.huawei.hms.adapter;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.AndroidException;
import com.alipay.mobile.common.logging.util.perf.Constants;
import com.huawei.hms.support.log.HMSLog;

/* loaded from: classes4.dex */
public class AvailableUtil {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f7327a = new Object();
    private static boolean b = false;
    private static boolean c = false;

    public static boolean isInstallerLibExist(Context context) {
        StringBuilder sb;
        String str;
        String str2;
        String str3;
        Bundle bundle;
        Object obj;
        if (b) {
            sb = new StringBuilder();
            str = "installerInit exist: ";
        } else {
            synchronized (f7327a) {
                if (!b) {
                    boolean z = false;
                    PackageManager packageManager = context.getPackageManager();
                    if (packageManager == null) {
                        HMSLog.e("AvailableUtil", "In isAvailableLibExist, Failed to get 'PackageManager' instance.");
                        try {
                            Class.forName("com.huawei.hms.update.manager.UpdateManager");
                        } catch (ClassNotFoundException unused) {
                            str2 = "AvailableUtil";
                            str3 = "In isInstallerLibExist, Failed to find class UpdateManager.";
                            HMSLog.e(str2, str3);
                            c = z;
                            b = true;
                            sb = new StringBuilder();
                            str = "available exist: ";
                            sb.append(str);
                            sb.append(c);
                            HMSLog.i("AvailableUtil", sb.toString());
                            return c;
                        }
                    } else {
                        try {
                            ApplicationInfo applicationInfo = packageManager.getPackageInfo(context.getPackageName(), 128).applicationInfo;
                            if (applicationInfo != null && (bundle = applicationInfo.metaData) != null && (obj = bundle.get("availableHMSCoreInstaller")) != null && String.valueOf(obj).equalsIgnoreCase(Constants.VAL_YES)) {
                                HMSLog.i("AvailableUtil", "available exist: true");
                            }
                        } catch (AndroidException unused2) {
                            str2 = "AvailableUtil";
                            str3 = "In isInstallerLibExist, Failed to read meta data for the availableHMSCoreInstaller.";
                            HMSLog.e(str2, str3);
                        } catch (RuntimeException e) {
                            HMSLog.e("AvailableUtil", "In isInstallerLibExist, Failed to read meta data for the availableHMSCoreInstaller.", e);
                        }
                        c = z;
                        b = true;
                    }
                    z = true;
                    c = z;
                    b = true;
                }
            }
            sb = new StringBuilder();
            str = "available exist: ";
        }
        sb.append(str);
        sb.append(c);
        HMSLog.i("AvailableUtil", sb.toString());
        return c;
    }
}
