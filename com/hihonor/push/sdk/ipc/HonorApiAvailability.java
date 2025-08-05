package com.hihonor.push.sdk.ipc;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import com.hihonor.push.sdk.e;
import java.util.Iterator;
import java.util.List;
import tb.cwp;

/* loaded from: classes4.dex */
public class HonorApiAvailability {

    /* loaded from: classes4.dex */
    public enum PackageStates {
        ENABLED,
        DISABLED,
        NOT_INSTALLED
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int a(android.content.Context r4) {
        /*
            if (r4 == 0) goto L68
            tb.cwp r0 = b(r4)
            java.lang.String r1 = r0.a()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "service package name is "
            r2.append(r3)
            r2.append(r1)
            r2.toString()
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto L23
        L20:
            com.hihonor.push.sdk.ipc.HonorApiAvailability$PackageStates r4 = com.hihonor.push.sdk.ipc.HonorApiAvailability.PackageStates.NOT_INSTALLED
            goto L35
        L23:
            android.content.pm.PackageManager r4 = r4.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L20
            r2 = 0
            android.content.pm.ApplicationInfo r4 = r4.getApplicationInfo(r1, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L20
            boolean r4 = r4.enabled     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L20
            if (r4 == 0) goto L33
            com.hihonor.push.sdk.ipc.HonorApiAvailability$PackageStates r4 = com.hihonor.push.sdk.ipc.HonorApiAvailability.PackageStates.ENABLED     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L20
            goto L35
        L33:
            com.hihonor.push.sdk.ipc.HonorApiAvailability$PackageStates r4 = com.hihonor.push.sdk.ipc.HonorApiAvailability.PackageStates.DISABLED     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L20
        L35:
            com.hihonor.push.sdk.ipc.HonorApiAvailability$PackageStates r2 = com.hihonor.push.sdk.ipc.HonorApiAvailability.PackageStates.NOT_INSTALLED
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L41
            r4 = 8002008(0x7a19d8, float:1.1213202E-38)
            return r4
        L41:
            com.hihonor.push.sdk.ipc.HonorApiAvailability$PackageStates r2 = com.hihonor.push.sdk.ipc.HonorApiAvailability.PackageStates.DISABLED
            boolean r4 = r2.equals(r4)
            if (r4 == 0) goto L4d
            r4 = 8002007(0x7a19d7, float:1.12132E-38)
            return r4
        L4d:
            java.lang.String r4 = "android"
            boolean r4 = android.text.TextUtils.equals(r1, r4)
            if (r4 == 0) goto L64
            java.lang.String r4 = r0.b()
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L64
            com.hihonor.push.sdk.internal.HonorPushErrorEnum r4 = com.hihonor.push.sdk.internal.HonorPushErrorEnum.SUCCESS
            int r4 = r4.statusCode
            return r4
        L64:
            r4 = 8002006(0x7a19d6, float:1.1213199E-38)
            return r4
        L68:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException
            java.lang.String r0 = "context must not be null."
            r4.<init>(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hihonor.push.sdk.ipc.HonorApiAvailability.a(android.content.Context):int");
    }

    public static cwp b(Context context) {
        cwp cwpVar = new cwp();
        Intent intent = new Intent();
        intent.setComponent(new ComponentName("android", "com.hihonor.android.pushagentproxy.HiPushService"));
        List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(intent, 128);
        if (queryIntentServices.size() > 0) {
            Iterator<ResolveInfo> it = queryIntentServices.iterator();
            if (it.hasNext()) {
                ResolveInfo next = it.next();
                String str = next.serviceInfo.applicationInfo.packageName;
                String a2 = e.a(context, str);
                cwpVar.a(str);
                cwpVar.c(next.serviceInfo.name);
                cwpVar.b(a2);
            }
        }
        return cwpVar;
    }
}
