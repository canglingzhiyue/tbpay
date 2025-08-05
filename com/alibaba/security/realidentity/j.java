package com.alibaba.security.realidentity;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public final class j {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static final String f3447a = "PackageUtils";

    public static String a(Context context) {
        PackageManager packageManager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bbc5dc40", new Object[]{context});
        }
        PackageInfo packageInfo = null;
        try {
            packageManager = context.getPackageManager();
        } catch (Exception e) {
            if (a.a()) {
                a.a(f3447a, e);
            }
        }
        if (packageManager == null) {
            return null;
        }
        packageInfo = packageManager.getPackageInfo(context.getPackageName(), 0);
        return packageInfo != null ? packageInfo.versionName : "";
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003e A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String b(android.content.Context r3) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.alibaba.security.realidentity.j.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            if (r1 == 0) goto L15
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r3
            java.lang.String r3 = "31400281"
            java.lang.Object r3 = r0.ipc$dispatch(r3, r1)
            java.lang.String r3 = (java.lang.String) r3
            return r3
        L15:
            r0 = 0
            android.content.pm.PackageManager r1 = r3.getPackageManager()     // Catch: java.lang.Exception -> L28
            if (r1 != 0) goto L1d
            return r0
        L1d:
            java.lang.String r3 = r3.getPackageName()     // Catch: java.lang.Exception -> L26
            android.content.pm.ApplicationInfo r0 = r1.getApplicationInfo(r3, r2)     // Catch: java.lang.Exception -> L26
            goto L35
        L26:
            r3 = move-exception
            goto L2a
        L28:
            r3 = move-exception
            r1 = r0
        L2a:
            boolean r2 = com.alibaba.security.realidentity.a.a()
            if (r2 == 0) goto L35
            java.lang.String r2 = "PackageUtils"
            com.alibaba.security.realidentity.a.a(r2, r3)
        L35:
            if (r0 == 0) goto L3e
            java.lang.CharSequence r3 = r1.getApplicationLabel(r0)
            java.lang.String r3 = (java.lang.String) r3
            goto L40
        L3e:
            java.lang.String r3 = ""
        L40:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.security.realidentity.j.b(android.content.Context):java.lang.String");
    }

    public static String c(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a6ba28c2", new Object[]{context}) : context == null ? "" : context.getPackageName();
    }

    public static boolean d(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a0236741", new Object[]{context})).booleanValue() : (context.getApplicationInfo().flags & 2) != 0;
    }
}
