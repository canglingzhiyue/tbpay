package com.vivo.push.f;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes9.dex */
public final class j extends com.vivo.push.s {
    /* JADX INFO: Access modifiers changed from: package-private */
    public j(com.vivo.push.v vVar) {
        super(vVar);
    }

    public static boolean a(Context context) {
        Intent intent = new Intent("com.vivo.pushservice.action.PUSH_SERVICE");
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(intent, 576);
        if (queryIntentServices == null || queryIntentServices.size() <= 0) {
            com.vivo.push.util.u.a("OnChangePushStatusTask", "enableService error: can not find push service.");
            return false;
        }
        PackageManager packageManager = context.getPackageManager();
        ComponentName componentName = new ComponentName(context, queryIntentServices.get(0).serviceInfo.name);
        if (packageManager.getComponentEnabledSetting(componentName) == 1) {
            com.vivo.push.util.u.d("OnChangePushStatusTask", "push service has enabled");
            return false;
        }
        packageManager.setComponentEnabledSetting(componentName, 1, 1);
        com.vivo.push.util.u.d("OnChangePushStatusTask", "enableService push service.");
        return true;
    }

    public static boolean b(Context context) {
        Intent intent = new Intent("com.vivo.pushservice.action.PUSH_SERVICE");
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(intent, 576);
        if (queryIntentServices == null || queryIntentServices.size() <= 0) {
            com.vivo.push.util.u.a("OnChangePushStatusTask", "disableService error: can not find push service.");
            return false;
        }
        PackageManager packageManager = context.getPackageManager();
        ComponentName componentName = new ComponentName(context, queryIntentServices.get(0).serviceInfo.name);
        if (packageManager.getComponentEnabledSetting(componentName) == 2) {
            com.vivo.push.util.u.d("OnChangePushStatusTask", "push service has disabled");
            return false;
        }
        packageManager.setComponentEnabledSetting(componentName, 2, 1);
        com.vivo.push.util.u.d("OnChangePushStatusTask", "disableService push service.");
        return true;
    }

    private static List<ResolveInfo> c(Context context) {
        List<ResolveInfo> list;
        Intent intent = new Intent("com.vivo.pushservice.action.RECEIVE");
        intent.setPackage(context.getPackageName());
        try {
            list = context.getPackageManager().queryBroadcastReceivers(intent, 576);
        } catch (Exception unused) {
            list = null;
        }
        if (list == null || list.size() <= 0) {
            Intent intent2 = new Intent("com.vivo.pushclient.action.RECEIVE");
            intent2.setPackage(context.getPackageName());
            try {
                return context.getPackageManager().queryBroadcastReceivers(intent2, 576);
            } catch (Exception unused2) {
                return list;
            }
        }
        return list;
    }

    @Override // com.vivo.push.s
    protected final void a(com.vivo.push.v vVar) {
        if (this.f24241a.getPackageName().equals(com.vivo.push.util.aa.a(this.f24241a))) {
            return;
        }
        com.vivo.push.b.j jVar = (com.vivo.push.b.j) vVar;
        int d = jVar.d();
        int e = jVar.e();
        com.vivo.push.util.u.d("OnChangePushStatusTask", "OnChangePushStatusTask serviceStatus is " + d + " ; receiverStatus is " + e);
        if (d == 2) {
            b(this.f24241a);
        } else if (d == 1) {
            a(this.f24241a);
        } else if (d == 0) {
            Context context = this.f24241a;
            Intent intent = new Intent("com.vivo.pushservice.action.PUSH_SERVICE");
            intent.setPackage(context.getPackageName());
            List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(intent, 576);
            if (queryIntentServices == null || queryIntentServices.size() <= 0) {
                com.vivo.push.util.u.a("OnChangePushStatusTask", "defaultService error: can not find push service.");
            } else {
                PackageManager packageManager = context.getPackageManager();
                ComponentName componentName = new ComponentName(context, queryIntentServices.get(0).serviceInfo.name);
                if (packageManager.getComponentEnabledSetting(componentName) != 0) {
                    packageManager.setComponentEnabledSetting(componentName, 0, 1);
                    com.vivo.push.util.u.d("OnChangePushStatusTask", "defaultService push service.");
                } else {
                    com.vivo.push.util.u.d("OnChangePushStatusTask", "push service has defaulted");
                }
            }
        }
        if (e == 2) {
            Context context2 = this.f24241a;
            List<ResolveInfo> c = c(context2);
            if (c == null || c.size() <= 0) {
                com.vivo.push.util.u.a("OnChangePushStatusTask", "disableReceiver error: can not find push service.");
                return;
            }
            String str = c.get(0).activityInfo.name;
            if (TextUtils.isEmpty(str)) {
                com.vivo.push.util.u.d("OnChangePushStatusTask", "disableReceiver error: className is null. ");
                return;
            }
            PackageManager packageManager2 = context2.getPackageManager();
            ComponentName componentName2 = new ComponentName(context2, str);
            if (packageManager2.getComponentEnabledSetting(componentName2) == 2) {
                com.vivo.push.util.u.d("OnChangePushStatusTask", "push service has disableReceiver ");
                return;
            }
            packageManager2.setComponentEnabledSetting(componentName2, 2, 1);
            com.vivo.push.util.u.d("OnChangePushStatusTask", "push service disableReceiver ");
        } else if (e == 1) {
            Context context3 = this.f24241a;
            List<ResolveInfo> c2 = c(context3);
            if (c2 == null || c2.size() <= 0) {
                com.vivo.push.util.u.a("OnChangePushStatusTask", "enableReceiver error: can not find push service.");
                return;
            }
            String str2 = c2.get(0).activityInfo.name;
            if (TextUtils.isEmpty(str2)) {
                com.vivo.push.util.u.d("OnChangePushStatusTask", "enableReceiver error: className is null. ");
                return;
            }
            PackageManager packageManager3 = context3.getPackageManager();
            ComponentName componentName3 = new ComponentName(context3, str2);
            if (packageManager3.getComponentEnabledSetting(componentName3) == 1) {
                com.vivo.push.util.u.d("OnChangePushStatusTask", "push service has enableReceiver ");
                return;
            }
            packageManager3.setComponentEnabledSetting(componentName3, 1, 1);
            com.vivo.push.util.u.d("OnChangePushStatusTask", "push service enableReceiver ");
        } else if (e != 0) {
        } else {
            Context context4 = this.f24241a;
            List<ResolveInfo> c3 = c(context4);
            if (c3 == null || c3.size() <= 0) {
                com.vivo.push.util.u.a("OnChangePushStatusTask", "defaultReceiver error: can not find push service.");
                return;
            }
            String str3 = c3.get(0).activityInfo.name;
            if (TextUtils.isEmpty(str3)) {
                com.vivo.push.util.u.d("OnChangePushStatusTask", "defaultReceiver error: className is null. ");
                return;
            }
            PackageManager packageManager4 = context4.getPackageManager();
            ComponentName componentName4 = new ComponentName(context4, str3);
            if (packageManager4.getComponentEnabledSetting(componentName4) == 0) {
                com.vivo.push.util.u.d("OnChangePushStatusTask", "push service has defaulted");
                return;
            }
            packageManager4.setComponentEnabledSetting(componentName4, 0, 1);
            com.vivo.push.util.u.d("OnChangePushStatusTask", "push service defaultReceiver ");
        }
    }
}
