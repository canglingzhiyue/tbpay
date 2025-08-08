package com.vivo.push.util;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import mtopsdk.common.util.StringUtils;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import tb.riy;

/* loaded from: classes9.dex */
public final class aa {

    /* renamed from: a  reason: collision with root package name */
    private static Boolean f24253a;
    private static String b;

    public static com.vivo.push.model.b a(Context context, o oVar) {
        String str;
        String str2;
        StringBuilder sb;
        com.vivo.push.model.b f;
        Context applicationContext = ContextDelegate.getContext(context).getApplicationContext();
        com.vivo.push.model.b c = c(applicationContext);
        if (c != null) {
            u.d("PushPackageUtils", "get system push info :".concat(String.valueOf(c)));
            return c;
        }
        List<String> a2 = oVar.a(applicationContext);
        com.vivo.push.model.b f2 = f(applicationContext, applicationContext.getPackageName());
        if (a2 == null || a2.size() <= 0) {
            if (f2 != null && f2.d()) {
                c = f2;
            }
            u.a("PushPackageUtils", "findAllPushPackages error: find no package!");
        } else {
            com.vivo.push.model.b bVar = null;
            String a3 = af.b(applicationContext).a("com.vivo.push.cur_pkg", null);
            if (StringUtils.isEmpty(a3) || !a(applicationContext, a3, "com.vivo.pushservice.action.METHOD") || (c = f(applicationContext, a3)) == null || !c.d()) {
                c = null;
            }
            if (f2 == null || !f2.d()) {
                f2 = null;
            }
            if (c == null) {
                c = null;
            }
            if (f2 != null && (c == null || (!f2.c() ? c.c() || f2.b() > c.b() : c.c() && f2.b() > c.b()))) {
                c = f2;
            }
            HashMap hashMap = new HashMap();
            if (c == null) {
                c = null;
            } else if (c.c()) {
                bVar = c;
                c = null;
            }
            int size = a2.size();
            for (int i = 0; i < size; i++) {
                String str3 = a2.get(i);
                if (!StringUtils.isEmpty(str3) && (f = f(applicationContext, str3)) != null) {
                    hashMap.put(str3, f);
                    if (f.d()) {
                        if (f.c()) {
                            if (bVar == null || f.b() > bVar.b()) {
                                bVar = f;
                            }
                        } else if (c == null || f.b() > c.b()) {
                            c = f;
                        }
                    }
                }
            }
            if (c == null) {
                u.d("PushPackageUtils", "findSuitablePushPackage, all push app in balck list.");
                c = bVar;
            }
        }
        if (c != null) {
            if (c.c()) {
                StringBuilder sb2 = new StringBuilder("查找最优包为:");
                sb2.append(c.a());
                sb2.append(riy.BRACKET_START_STR);
                sb2.append(c.b());
                str2 = ", Black)";
                sb2.append(str2);
                u.a(applicationContext, sb2.toString());
                sb = new StringBuilder("finSuitablePushPackage");
            } else {
                StringBuilder sb3 = new StringBuilder("查找最优包为:");
                sb3.append(c.a());
                sb3.append(riy.BRACKET_START_STR);
                sb3.append(c.b());
                str2 = riy.BRACKET_END_STR;
                sb3.append(str2);
                u.a(applicationContext, sb3.toString());
                sb = new StringBuilder("finSuitablePushPackage");
            }
            sb.append(c.a());
            sb.append(riy.BRACKET_START_STR);
            sb.append(c.b());
            sb.append(str2);
            str = sb.toString();
        } else {
            u.b(applicationContext, "查找最优包为空!");
            str = "finSuitablePushPackage is null";
        }
        u.d("PushPackageUtils", str);
        return c;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x013c A[Catch: Exception -> 0x0138, TryCatch #3 {Exception -> 0x0138, blocks: (B:104:0x0134, B:108:0x013c, B:110:0x0140), top: B:120:0x0134 }] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0134 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String a(android.content.Context r14) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vivo.push.util.aa.a(android.content.Context):java.lang.String");
    }

    private static boolean a(Context context, long j) {
        com.vivo.push.cache.d a2 = com.vivo.push.cache.b.a().a(context);
        if (a2 != null) {
            return a2.isInBlackList(j);
        }
        return false;
    }

    public static boolean a(Context context, String str) {
        if (!StringUtils.isEmpty(str) && context != null) {
            Intent intent = new Intent("com.vivo.pushservice.action.PUSH_SERVICE");
            intent.setPackage(str);
            PackageManager packageManager = context.getPackageManager();
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 576);
            if (queryIntentServices != null && queryIntentServices.size() > 0) {
                int size = queryIntentServices.size();
                boolean z = false;
                for (int i = 0; i < size; i++) {
                    ResolveInfo resolveInfo = queryIntentServices.get(i);
                    if (resolveInfo != null && resolveInfo.serviceInfo != null) {
                        String str2 = resolveInfo.serviceInfo.name;
                        boolean z2 = resolveInfo.serviceInfo.exported;
                        if ("com.vivo.push.sdk.service.PushService".equals(str2) && z2) {
                            boolean z3 = resolveInfo.serviceInfo.enabled;
                            int componentEnabledSetting = packageManager.getComponentEnabledSetting(new ComponentName(str, "com.vivo.push.sdk.service.PushService"));
                            boolean z4 = true;
                            if (componentEnabledSetting != 1 && (componentEnabledSetting != 0 || !z3)) {
                                z4 = false;
                            }
                            z = z4;
                        }
                    }
                }
                return z;
            }
            u.a("PushPackageUtils", "isEnablePush error: can not find push service.");
        }
        return false;
    }

    private static boolean a(Context context, String str, String str2) {
        List<ResolveInfo> list;
        Intent intent = new Intent(str2);
        intent.setPackage(str);
        try {
            list = context.getPackageManager().queryBroadcastReceivers(intent, 576);
        } catch (Exception unused) {
            list = null;
        }
        return list != null && list.size() > 0;
    }

    public static int b(Context context, String str) {
        int i = a(context, str, "com.vivo.pushservice.action.RECEIVE") ? 0 : -1;
        if (a(context, str, "com.vivo.pushclient.action.RECEIVE")) {
            return 1;
        }
        return i;
    }

    public static boolean b(Context context) {
        ProviderInfo resolveContentProvider;
        Boolean bool = f24253a;
        if (bool != null) {
            return bool.booleanValue();
        }
        String str = null;
        if (context != null && !StringUtils.isEmpty("com.vivo.push.sdk.service.SystemPushConfig") && (resolveContentProvider = context.getPackageManager().resolveContentProvider("com.vivo.push.sdk.service.SystemPushConfig", 128)) != null) {
            str = resolveContentProvider.packageName;
        }
        Boolean valueOf = Boolean.valueOf("BCC35D4D3606F154F0402AB7634E8490C0B244C2675C3C6238986987024F0C02".equals(g(context, str)));
        f24253a = valueOf;
        return valueOf.booleanValue();
    }

    private static com.vivo.push.model.b c(Context context) {
        String a2 = a(context);
        ApplicationInfo applicationInfo = null;
        if (StringUtils.isEmpty(a2)) {
            return null;
        }
        com.vivo.push.model.b bVar = new com.vivo.push.model.b(a2);
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(a2, 128);
            if (packageInfo != null) {
                bVar.a(packageInfo.versionCode);
                bVar.a(packageInfo.versionName);
                applicationInfo = packageInfo.applicationInfo;
            }
            if (applicationInfo != null) {
                bVar.a(ag.a(context, a2));
            }
            bVar.a(a(context, bVar.b()));
            bVar.b(a(context, a2));
            return bVar;
        } catch (Exception e) {
            e.printStackTrace();
            u.b("PushPackageUtils", "PackageManager NameNotFoundException is null", e);
            return null;
        }
    }

    public static boolean c(Context context, String str) {
        return a(context, str, "com.vivo.pushclient.action.RECEIVE");
    }

    public static boolean d(Context context, String str) {
        return a(context, str, "com.vivo.pushservice.action.RECEIVE");
    }

    public static boolean e(Context context, String str) {
        return a(context, str, "com.vivo.pushservice.action.METHOD");
    }

    private static com.vivo.push.model.b f(Context context, String str) {
        ApplicationInfo applicationInfo;
        if (!StringUtils.isEmpty(str)) {
            if (a(context, str, "com.vivo.pushservice.action.METHOD") || a(context, str, "com.vivo.pushservice.action.RECEIVE")) {
                com.vivo.push.model.b bVar = new com.vivo.push.model.b(str);
                try {
                    PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 128);
                    if (packageInfo != null) {
                        bVar.a(packageInfo.versionCode);
                        bVar.a(packageInfo.versionName);
                        applicationInfo = packageInfo.applicationInfo;
                    } else {
                        applicationInfo = null;
                    }
                    if (applicationInfo != null) {
                        bVar.a(ag.a(context, str));
                    }
                    bVar.b(a(context, str));
                    bVar.a(a(context, bVar.b()));
                    return bVar;
                } catch (Exception e) {
                    u.a("PushPackageUtils", "getPushPackageInfo exception: ", e);
                }
            }
        }
        return null;
    }

    private static String g(Context context, String str) {
        if (!StringUtils.isEmpty(str) && context != null) {
            try {
                byte[] digest = MessageDigest.getInstance("SHA256").digest(context.getPackageManager().getPackageInfo(str, 64).signatures[0].toByteArray());
                StringBuffer stringBuffer = new StringBuffer();
                for (byte b2 : digest) {
                    String upperCase = Integer.toHexString(b2 & 255).toUpperCase(Locale.US);
                    if (upperCase.length() == 1) {
                        stringBuffer.append("0");
                    }
                    stringBuffer.append(upperCase);
                }
                return stringBuffer.toString();
            } catch (Exception e) {
                u.a("PushPackageUtils", " getSignatureSHA exception ".concat(String.valueOf(e)));
            }
        }
        return null;
    }
}
