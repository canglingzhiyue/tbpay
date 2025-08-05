package tb;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.support.v4.content.FileProvider;
import android.text.TextUtils;
import com.alibaba.poplayer.utils.c;
import com.alibaba.poplayer.utils.h;
import com.alibaba.security.realidentity.e2;
import com.alibaba.ut.abtest.UTABTest;
import com.alibaba.ut.abtest.Variation;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.api.Login;
import com.ut.device.UTDevice;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public class nkt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1062185903);
    }

    public static boolean a(Application application) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("75c56f7b", new Object[]{application})).booleanValue();
        }
        if (application == null) {
            return false;
        }
        if (application.getResources() != null) {
            String string = application.getResources().getString(application.getResources().getIdentifier("ttid", "string", application.getPackageName()));
            c.a("ApkUpdateUtils.isGPChannel.ttid=%s", string);
            z = "212200".equals(string);
        } else {
            z = false;
        }
        boolean equalsIgnoreCase = "google".equalsIgnoreCase(Build.BRAND);
        c.a("ApkUpdateUtils.isGPChannel.isGPTTID=%s.isGPDevice=%s", Boolean.valueOf(z), Boolean.valueOf(equalsIgnoreCase));
        return z || equalsIgnoreCase;
    }

    public static boolean b(Application application) {
        boolean z;
        boolean z2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("76721b1a", new Object[]{application})).booleanValue();
        }
        if (application == null) {
            return false;
        }
        String packageName = application.getPackageName();
        boolean k = mre.a().k();
        if (!TextUtils.isEmpty(packageName)) {
            List<ResolveInfo> queryIntentActivities = application.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + packageName)), 65536);
            if (queryIntentActivities != null) {
                Iterator<ResolveInfo> it = queryIntentActivities.iterator();
                z2 = false;
                while (true) {
                    if (!it.hasNext()) {
                        z = false;
                        break;
                    }
                    ResolveInfo next = it.next();
                    if ((next.activityInfo.applicationInfo.flags & 1) != 0) {
                        if (k && "com.android.vending".equals(next.activityInfo.packageName)) {
                            z = true;
                            z2 = true;
                            break;
                        }
                        z2 = true;
                    }
                }
                c.a("ApkUpdateUtils.checkMarket.hasValidMarket=%s.hasGPMarket=%s", Boolean.valueOf(z2), Boolean.valueOf(z));
                return !z2 && !z;
            }
        }
        z = false;
        z2 = false;
        c.a("ApkUpdateUtils.checkMarket.hasValidMarket=%s.hasGPMarket=%s", Boolean.valueOf(z2), Boolean.valueOf(z));
        if (!z2) {
        }
    }

    public static String a(String str, String str2) {
        Variation variation;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{str, str2});
        }
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && (variation = UTABTest.activate("ApkUpdater", str).getVariation(str2)) != null) {
                return variation.getValueAsString("");
            }
        } catch (Throwable th) {
            c.a("ApkUpdateUtils.getABValue.error.", th);
        }
        return "";
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue();
        }
        try {
            if (!TextUtils.isEmpty(str)) {
                if (str.matches("[0-9]+(\\.[0-9]+){2}")) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public static int b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("65d7b870", new Object[]{str, str2})).intValue();
        }
        try {
            int a2 = new h(str).a(new h(str2));
            c.a("AppVersionUtils.versionCompare.newVersion=%s.curVersion=%s.Result=%s", str, str2, Integer.valueOf(a2));
            return a2;
        } catch (Throwable th) {
            c.a("AppVersionUtils.versionCompare.error.", th);
            return e2.f3386a;
        }
    }

    public static String a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bbc5dc40", new Object[]{context});
        }
        File externalCacheDir = context.getExternalCacheDir();
        if (externalCacheDir == null) {
            externalCacheDir = context.getCacheDir();
        }
        return externalCacheDir.getAbsolutePath();
    }

    public static Intent a(Context context, File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("5ed2d55c", new Object[]{context, file});
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        if (Build.VERSION.SDK_INT >= 24) {
            Uri uriForFile = FileProvider.getUriForFile(context, "com.taobao.taobao.update.provider", file);
            intent.addFlags(1);
            intent.addFlags(268435456);
            intent.setDataAndType(uriForFile, "application/vnd.android.package-archive");
        } else {
            intent.addFlags(268435456);
            intent.setDataAndType(Uri.fromFile(file), "application/vnd.android.package-archive");
        }
        return intent;
    }

    public static boolean b(Context context) {
        PackageInfo packageInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9eca1003", new Object[]{context})).booleanValue();
        }
        try {
            if ("vivo".equals(Build.BRAND.toLowerCase()) && (packageInfo = context.getPackageManager().getPackageInfo("com.bbk.appstore", 0)) != null) {
                return packageInfo.versionCode >= 3100;
            }
        } catch (Throwable th) {
            c.a("enableJumpStoreVIVO.error", th);
        }
        return false;
    }

    public static void c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f76bb9e", new Object[]{context});
            return;
        }
        try {
            if (!mre.a().j()) {
                return;
            }
            boolean a2 = bzx.a(context);
            HashMap hashMap = new HashMap();
            hashMap.put("floatPermission", String.valueOf(a2));
            hashMap.put("systemLevel", String.valueOf(Build.VERSION.SDK_INT));
            hashMap.put("brand", String.valueOf(Build.BRAND));
            hashMap.put("model", String.valueOf(Build.MODEL));
            hashMap.put("userId", String.valueOf(Login.getUserId()));
            hashMap.put("utdid", String.valueOf(UTDevice.getUtdid(context)));
            UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder("Page_ApkUpdate", 19999, "floatPermission", String.valueOf(a2), String.valueOf(Build.VERSION.SDK_INT), hashMap).build());
        } catch (Throwable th) {
            c.a("floatWindowPermissionCheck", th);
        }
    }
}
