package com.vivo.push.util;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import mtopsdk.common.util.StringUtils;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes9.dex */
public final class ag {

    /* renamed from: a  reason: collision with root package name */
    private static String[] f24258a = {"com.vivo.push.sdk.RegistrationReceiver", "com.vivo.push.sdk.service.PushService", "com.vivo.push.sdk.service.CommonJobService"};
    private static String[] b = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE", "android.permission.WRITE_SETTINGS", "android.permission.VIBRATE", "android.permission.ACCESS_WIFI_STATE", "android.permission.WAKE_LOCK", "com.bbk.account.permission.READ_ACCOUNTINFO", "android.permission.AUTHENTICATE_ACCOUNTS", "android.permission.MOUNT_UNMOUNT_FILESYSTEMS", "android.permission.GET_TASKS"};
    private static String[] c = {"com.vivo.push.sdk.service.CommandService", "com.vivo.push.sdk.service.CommonJobService"};
    private static String[] d = {"com.vivo.push.sdk.RegistrationReceiver"};
    private static String[] e = new String[0];
    private static Map<String, Bundle> f = new ConcurrentHashMap();

    public static long a(Context context) {
        String a2 = aa.a(context);
        if (StringUtils.isEmpty(a2)) {
            u.a("Utility", "systemPushPkgName is null");
            return -1L;
        }
        return a(context, a2);
    }

    public static long a(Context context, String str) {
        Object a2 = a(context, str, "com.vivo.push.sdk_version");
        if (a2 == null) {
            a2 = a(context, str, "sdk_version");
        }
        if (a2 == null) {
            u.a("Utility", "getSdkVersionCode sdk version is null");
            return -1L;
        }
        try {
            return Long.parseLong(a2.toString());
        } catch (Exception e2) {
            e2.printStackTrace();
            u.a("Utility", "getSdkVersionCode error ", e2);
            return -1L;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0085 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.database.Cursor a(android.net.Uri r12, java.lang.String r13, java.lang.String[] r14, android.content.Context r15) {
        /*
            java.lang.String r0 = "close"
            r1 = 24
            r2 = 0
            java.lang.String r3 = "Utility"
            if (r15 != 0) goto Lf
            java.lang.String r12 = "context is null"
            com.vivo.push.util.u.a(r3, r12)     // Catch: java.lang.Throwable -> L68 java.lang.Exception -> L6b
            return r2
        Lf:
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L68 java.lang.Exception -> L6b
            if (r4 < r1) goto L2f
            android.content.ContentResolver r4 = r15.getContentResolver()     // Catch: java.lang.Throwable -> L68 java.lang.Exception -> L6b
            android.content.ContentProviderClient r4 = r4.acquireUnstableContentProviderClient(r12)     // Catch: java.lang.Throwable -> L68 java.lang.Exception -> L6b
            if (r4 == 0) goto L2d
            java.lang.String r5 = "client is null"
            com.vivo.push.util.u.a(r3, r5)     // Catch: java.lang.Exception -> L41 java.lang.Throwable -> L82
            r7 = 0
            r10 = 0
            r5 = r4
            r6 = r12
            r8 = r13
            r9 = r14
            android.database.Cursor r5 = r5.query(r6, r7, r8, r9, r10)     // Catch: java.lang.Exception -> L41 java.lang.Throwable -> L82
            goto L31
        L2d:
            r5 = r2
            goto L31
        L2f:
            r4 = r2
            r5 = r4
        L31:
            if (r5 != 0) goto L43
            android.content.ContentResolver r6 = r15.getContentResolver()     // Catch: java.lang.Exception -> L41 java.lang.Throwable -> L82
            r8 = 0
            r11 = 0
            r7 = r12
            r9 = r13
            r10 = r14
            android.database.Cursor r5 = r6.query(r7, r8, r9, r10, r11)     // Catch: java.lang.Exception -> L41 java.lang.Throwable -> L82
            goto L43
        L41:
            r12 = move-exception
            goto L6d
        L43:
            if (r5 != 0) goto L59
            java.lang.String r12 = "cursor is null"
            com.vivo.push.util.u.a(r3, r12)     // Catch: java.lang.Exception -> L41 java.lang.Throwable -> L82
            if (r4 == 0) goto L58
            int r12 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L54
            if (r12 < r1) goto L58
            r4.close()     // Catch: java.lang.Exception -> L54
            goto L58
        L54:
            r12 = move-exception
            com.vivo.push.util.u.a(r3, r0, r12)
        L58:
            return r2
        L59:
            if (r4 == 0) goto L67
            int r12 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L63
            if (r12 < r1) goto L67
            r4.close()     // Catch: java.lang.Exception -> L63
            goto L67
        L63:
            r12 = move-exception
            com.vivo.push.util.u.a(r3, r0, r12)
        L67:
            return r5
        L68:
            r12 = move-exception
            r4 = r2
            goto L83
        L6b:
            r12 = move-exception
            r4 = r2
        L6d:
            java.lang.String r13 = "queryContentResolver"
            com.vivo.push.util.u.a(r3, r13, r12)     // Catch: java.lang.Throwable -> L82
            if (r4 == 0) goto L81
            int r12 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L7d
            if (r12 < r1) goto L81
            r4.close()     // Catch: java.lang.Exception -> L7d
            goto L81
        L7d:
            r12 = move-exception
            com.vivo.push.util.u.a(r3, r0, r12)
        L81:
            return r2
        L82:
            r12 = move-exception
        L83:
            if (r4 == 0) goto L91
            int r13 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L8d
            if (r13 < r1) goto L91
            r4.close()     // Catch: java.lang.Exception -> L8d
            goto L91
        L8d:
            r13 = move-exception
            com.vivo.push.util.u.a(r3, r0, r13)
        L91:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vivo.push.util.ag.a(android.net.Uri, java.lang.String, java.lang.String[], android.content.Context):android.database.Cursor");
    }

    public static Object a(Context context, String str, String str2) {
        Bundle bundle;
        Bundle bundle2 = null;
        if (context == null || str2 == null || StringUtils.isEmpty(str)) {
            return null;
        }
        try {
            Object obj = (f == null || f.size() <= 0 || (bundle = f.get(str)) == null) ? null : bundle.get(str2);
            if (obj != null) {
                return obj;
            }
            try {
                ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(str, 128);
                if (applicationInfo != null) {
                    bundle2 = applicationInfo.metaData;
                }
                Object obj2 = bundle2 != null ? bundle2.get(str2) : obj;
                try {
                    if (f.size() > 300) {
                        return obj2;
                    }
                    f.put(str, bundle2);
                    return obj2;
                } catch (Exception e2) {
                    bundle2 = obj2;
                    e = e2;
                    u.a("Utility", "getMetaValue::".concat(String.valueOf(e)));
                    return bundle2;
                }
            } catch (Exception e3) {
                e = e3;
                bundle2 = obj;
            }
        } catch (Exception e4) {
            e = e4;
        }
    }

    public static Object a(String str, String str2) throws Exception {
        Class<?> cls = Class.forName(str);
        return cls.getField(str2).get(cls);
    }

    public static void a(Context context, Intent intent) {
        String a2 = aa.a(context);
        String stringExtra = intent.getStringExtra("client_pkgname");
        if (StringUtils.isEmpty(a2)) {
            u.a("Utility", "illegality abe adapter : push pkg is null");
        } else if (StringUtils.isEmpty(stringExtra)) {
            u.a("Utility", "illegality abe adapter : src pkg is null");
        } else if (a2.equals(context.getPackageName())) {
            u.a("Utility", "illegality abe adapter : abe is not pushservice");
        } else if (a2.equals(stringExtra)) {
            u.a("Utility", "illegality abe adapter : pushPkg = " + a2 + " ; srcPkg = " + stringExtra);
        } else {
            u.d("Utility", "proxy to core : intent pkg : " + intent.getPackage() + " ; src pkg : " + stringExtra + " ; push pkg : " + a2);
            intent.setPackage(a2);
            intent.setClassName(a2, "com.vivo.push.sdk.service.PushService");
            context.startService(intent);
        }
    }

    private static void a(Context context, String str, String str2, boolean z) throws VivoPushException {
        Intent intent = new Intent(str);
        intent.setPackage(context.getPackageName());
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                throw new VivoPushException("localPackageManager is null");
            }
            if (z) {
                List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 576);
                if (queryBroadcastReceivers == null || queryBroadcastReceivers.size() <= 0) {
                    throw new VivoPushException("checkModule " + intent + " has no receivers");
                }
                for (ResolveInfo resolveInfo : queryBroadcastReceivers) {
                    if (str2.equals(resolveInfo.activityInfo.name)) {
                        return;
                    }
                }
                throw new VivoPushException(str2 + " is missing");
            }
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 576);
            if (queryIntentServices == null || queryIntentServices.size() <= 0) {
                throw new VivoPushException("checkModule " + intent + " has no services");
            }
            for (ResolveInfo resolveInfo2 : queryIntentServices) {
                if (str2.equals(resolveInfo2.serviceInfo.name)) {
                    if (resolveInfo2.serviceInfo.exported) {
                        return;
                    }
                    throw new VivoPushException(resolveInfo2.serviceInfo.name + " exported is false");
                }
            }
            throw new VivoPushException(str2 + " is missing");
        } catch (Exception e2) {
            u.a("Utility", "error  " + e2.getMessage());
            throw new VivoPushException("checkModule error" + e2.getMessage());
        }
    }

    private static void a(ComponentInfo componentInfo, String str) throws VivoPushException {
        if (componentInfo.applicationInfo.packageName.equals(str)) {
            return;
        }
        for (String str2 : f24258a) {
            if (str2.equals(componentInfo.name) && !componentInfo.processName.contains(":pushservice")) {
                throw new VivoPushException("module : " + componentInfo.name + " process :" + componentInfo.processName + "  check process fail");
            }
        }
    }

    private static void a(String str, ComponentInfo[] componentInfoArr, String str2) throws VivoPushException {
        for (ComponentInfo componentInfo : componentInfoArr) {
            if (str.equals(componentInfo.name)) {
                if (componentInfo.enabled) {
                    a(componentInfo, str2);
                    return;
                }
                throw new VivoPushException(componentInfo.name + " module Push-SDK need is illegitmacy !");
            }
        }
        throw new VivoPushException(str + " module Push-SDK need is not exist");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v0, types: [android.content.ContentProviderClient, android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean a(android.content.Context r17, java.lang.String r18, java.lang.String r19, long r20) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vivo.push.util.ag.a(android.content.Context, java.lang.String, java.lang.String, long):boolean");
    }

    public static boolean a(Context context, String str, boolean z) {
        Cursor a2;
        Cursor cursor = null;
        try {
        } catch (Exception e2) {
            u.a("Utility", "close", e2);
        }
        try {
            try {
                Uri uri = com.vivo.push.x.e;
                String[] strArr = new String[2];
                strArr[0] = str;
                strArr[1] = z ? "1" : "0";
                a2 = a(uri, "appPkgName = ? and agreePrivacyStatement = ? ", strArr, context);
            } catch (Exception e3) {
                u.a("Utility", "syncAgreePrivacyStatement", e3);
                if (0 != 0) {
                    cursor.close();
                }
            }
            if (a2 == null) {
                u.a("Utility", "cursor is null");
                if (a2 != null) {
                    try {
                        a2.close();
                    } catch (Exception e4) {
                        u.a("Utility", "close", e4);
                    }
                }
                return false;
            } else if (!a2.moveToFirst()) {
                if (a2 != null) {
                    a2.close();
                }
                return false;
            } else {
                boolean parseBoolean = Boolean.parseBoolean(a2.getString(a2.getColumnIndex("agreePrivacyStatement")));
                if (a2 != null) {
                    try {
                        a2.close();
                    } catch (Exception e5) {
                        u.a("Utility", "close", e5);
                    }
                }
                return parseBoolean;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                try {
                    cursor.close();
                } catch (Exception e6) {
                    u.a("Utility", "close", e6);
                }
            }
            throw th;
        }
    }

    public static String b(Context context, String str) {
        Object a2 = a(context, str, "verification_status");
        return a2 != null ? a2.toString() : "";
    }

    public static String b(String str, String str2) {
        String str3;
        try {
            str3 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, str);
        } catch (Exception e2) {
            e2.printStackTrace();
            str3 = str2;
        }
        return (str3 == null || str3.length() == 0) ? str2 : str3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00fd, code lost:
        r12 = r12 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void b(android.content.Context r20) throws com.vivo.push.util.VivoPushException {
        /*
            Method dump skipped, instructions count: 505
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vivo.push.util.ag.b(android.content.Context):void");
    }

    public static int c(Context context, String str) {
        if (context == null || StringUtils.isEmpty(str)) {
            u.a("Utility", "getClientSdkVersionCode() error, context is null or pkgName is empty");
            return 0;
        }
        int a2 = (int) a(context, str);
        return a2 <= 0 ? g(context, str) : a2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00b0, code lost:
        if (android.os.Build.VERSION.SDK_INT >= 24) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b2, code lost:
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00cd, code lost:
        if (android.os.Build.VERSION.SDK_INT >= 24) goto L48;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c6 A[Catch: Exception -> 0x00d0, TRY_ENTER, TryCatch #1 {Exception -> 0x00d0, blocks: (B:45:0x00a9, B:47:0x00ae, B:49:0x00b2, B:59:0x00c6, B:61:0x00cb), top: B:79:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00cb A[Catch: Exception -> 0x00d0, TRY_LEAVE, TryCatch #1 {Exception -> 0x00d0, blocks: (B:45:0x00a9, B:47:0x00ae, B:49:0x00b2, B:59:0x00c6, B:61:0x00cb), top: B:79:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v0, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r12v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.security.PublicKey c(android.content.Context r12) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vivo.push.util.ag.c(android.content.Context):java.security.PublicKey");
    }

    private static void d(Context context, String str) throws VivoPushException {
        try {
            if (context.getPackageManager() == null) {
                throw new VivoPushException("localPackageManager is null");
            }
            ServiceInfo[] serviceInfoArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 4).services;
            if (serviceInfoArr == null) {
                throw new VivoPushException("serviceInfos is null");
            }
            for (String str2 : c) {
                a(str2, serviceInfoArr, str);
            }
        } catch (Exception e2) {
            throw new VivoPushException("error " + e2.getMessage());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00fa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v0, types: [android.content.ContentProviderClient, android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean d(android.content.Context r20) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vivo.push.util.ag.d(android.content.Context):boolean");
    }

    private static void e(Context context, String str) throws VivoPushException {
        if (e.length <= 0) {
            return;
        }
        try {
            if (context.getPackageManager() == null) {
                throw new VivoPushException("localPackageManager is null");
            }
            ActivityInfo[] activityInfoArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 1).activities;
            if (activityInfoArr == null) {
                throw new VivoPushException("activityInfos is null");
            }
            for (String str2 : e) {
                a(str2, activityInfoArr, str);
            }
        } catch (Exception e2) {
            throw new VivoPushException("error " + e2.getMessage());
        }
    }

    private static void f(Context context, String str) throws VivoPushException {
        try {
            if (context.getPackageManager() == null) {
                throw new VivoPushException("localPackageManager is null");
            }
            ActivityInfo[] activityInfoArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 2).receivers;
            if (activityInfoArr == null) {
                throw new VivoPushException("receivers is null");
            }
            for (String str2 : d) {
                a(str2, activityInfoArr, str);
            }
        } catch (Exception e2) {
            throw new VivoPushException(e2.getMessage());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0032 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0033 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int g(android.content.Context r3, java.lang.String r4) {
        /*
            java.lang.String r0 = "Utility"
            r1 = 0
            if (r3 == 0) goto L47
            boolean r2 = android.text.StringUtils.isEmpty(r4)
            if (r2 == 0) goto Lc
            goto L47
        Lc:
            java.lang.String r2 = "sdk_version_vivo"
            java.lang.Object r3 = a(r3, r4, r2)
            boolean r4 = r3 instanceof java.lang.String
            if (r4 == 0) goto L1c
            java.lang.String r3 = (java.lang.String) r3
        L19:
            r4 = r3
            r3 = 0
            goto L30
        L1c:
            boolean r4 = r3 instanceof java.lang.Integer
            if (r4 == 0) goto L29
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            java.lang.String r4 = ""
            goto L30
        L29:
            if (r3 == 0) goto L46
            java.lang.String r3 = r3.toString()
            goto L19
        L30:
            if (r3 <= 0) goto L33
            return r3
        L33:
            int r1 = java.lang.Integer.parseInt(r4)     // Catch: java.lang.Exception -> L38
            goto L46
        L38:
            r3 = move-exception
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r4 = "getClientSdkVersion: "
            java.lang.String r3 = r4.concat(r3)
            com.vivo.push.util.u.a(r0, r3)
        L46:
            return r1
        L47:
            java.lang.String r3 = "getClientSdkVersion() error, context is null or pkgName is empty"
            com.vivo.push.util.u.a(r0, r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vivo.push.util.ag.g(android.content.Context, java.lang.String):int");
    }
}
