package com.vivo.push.util;

import android.app.ActivityManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.text.TextUtils;
import com.vivo.push.model.InsideNotificationItem;
import com.vivo.push.model.NotifyArriveCallbackByUser;
import java.util.List;
import java.util.Map;

/* loaded from: classes9.dex */
public final class i extends b {
    private int e = 0;

    private int a(Intent intent) {
        if (intent.resolveActivityInfo(this.c.getPackageManager(), 65536) == null) {
            u.a("AndroidTwelveNotifyClickIntentParam", "activity is null  ");
            u.c(this.c, " 跳转参数对应的Activity找不到 通知不展示   2162");
            return 2162;
        }
        return 0;
    }

    private int a(Intent intent, String str) {
        int a2 = a(intent);
        u.d("AndroidTwelveNotifyClickIntentParam", "checkSkipContentParameterLegal canfindactivity code : ".concat(String.valueOf(a2)));
        if (a2 != 0) {
            return a2;
        }
        int b = b(intent, str);
        u.d("AndroidTwelveNotifyClickIntentParam", "checkSkipContentParameterLegal packagefit code : ".concat(String.valueOf(b)));
        if (b == 0) {
            return 0;
        }
        return b;
    }

    private static Intent a(Intent intent, Map<String, String> map) {
        if (map != null && map.entrySet() != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (entry != null && entry.getKey() != null) {
                    intent.putExtra(entry.getKey(), entry.getValue());
                }
            }
        }
        return intent;
    }

    private Intent a(String str, String str2, InsideNotificationItem insideNotificationItem, Context context) {
        try {
            Intent parseUri = Intent.parseUri(str, 1);
            parseUri.setSelector(null);
            parseUri.setPackage(str2);
            parseUri.setFlags(335544320);
            a(parseUri, insideNotificationItem.getParams());
            int a2 = a(parseUri, str2);
            if (a2 <= 0) {
                return parseUri;
            }
            this.e = a2;
            u.c(context, " 落地页未找到，通知不展示：  " + this.e);
            return null;
        } catch (Exception e) {
            u.a("AndroidTwelveNotifyClickIntentParam", "sendFakeNoticeToClient open activity error : ".concat(String.valueOf(str)), e);
            this.e = 2158;
            return null;
        }
    }

    private static Intent a(Map<String, String> map, String str, Context context) {
        Intent intent = new Intent();
        intent.setPackage(str);
        try {
            List<ActivityManager.RunningTaskInfo> runningTasks = ((ActivityManager) context.getSystemService("activity")).getRunningTasks(50);
            if (runningTasks != null) {
                for (ActivityManager.RunningTaskInfo runningTaskInfo : runningTasks) {
                    ComponentName componentName = runningTaskInfo.topActivity;
                    if (componentName.getPackageName().equals(str)) {
                        u.d("AndroidTwelveNotifyClickIntentParam", "sendFakeNoticeToClient topClassName=" + componentName.getClassName());
                        intent.setComponent(componentName);
                        intent.setFlags(335544320);
                        a(intent, map);
                        return intent;
                    }
                }
            }
        } catch (Exception e) {
            u.a("AndroidTwelveNotifyClickIntentParam", "sendFakeNoticeToClient ActivityManager", e);
        }
        try {
            intent = context.getPackageManager().getLaunchIntentForPackage(str);
            if (intent != null) {
                intent.setFlags(335544320);
                a(intent, map);
            } else {
                u.a("AndroidTwelveNotifyClickIntentParam", "sendFakeNoticeToClient LaunchIntent is null");
            }
        } catch (Exception e2) {
            u.a("AndroidTwelveNotifyClickIntentParam", "sendFakeNoticeToClient LaunchIntent Exception" + e2.getMessage());
        }
        return intent;
    }

    private int b(Intent intent, String str) {
        String sb;
        if (intent == null || TextUtils.isEmpty(str)) {
            StringBuilder sb2 = new StringBuilder("checkSkipContentPackageFit intent = : ");
            Object obj = intent;
            if (intent == null) {
                obj = "";
            }
            sb2.append(obj);
            sb2.append(" mPkgName = ");
            sb2.append(str);
            sb = sb2.toString();
        } else {
            try {
                String packageName = intent.getComponent() != null ? intent.getComponent().getPackageName() : intent.getPackage();
                if (TextUtils.isEmpty(packageName) || TextUtils.equals(str, packageName)) {
                    return 0;
                }
                u.d("AndroidTwelveNotifyClickIntentParam", "activity component error : local pkgName is " + str + "; but remote pkgName is " + packageName);
                u.a(this.c, " 跳转参数对应的包名不是当前应用包名    local pkgName is " + str + "; but remote pkgName is " + packageName + " code =2813");
                return 2813;
            } catch (Exception e) {
                sb = "checkSkipContentPackage open activity error :  error " + e.getMessage();
            }
        }
        u.a("AndroidTwelveNotifyClickIntentParam", sb);
        return 2158;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00e3 A[Catch: Exception -> 0x015d, TryCatch #0 {Exception -> 0x015d, blocks: (B:3:0x0005, B:5:0x000b, B:8:0x0013, B:17:0x003d, B:43:0x0125, B:45:0x013d, B:19:0x0048, B:20:0x0065, B:22:0x0082, B:28:0x00a4, B:29:0x00b7, B:30:0x00c1, B:32:0x00cb, B:34:0x00d7, B:39:0x00e3, B:40:0x010a, B:41:0x011b, B:46:0x0154, B:23:0x0087, B:25:0x00a0), top: B:51:0x0005, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010a A[Catch: Exception -> 0x015d, TryCatch #0 {Exception -> 0x015d, blocks: (B:3:0x0005, B:5:0x000b, B:8:0x0013, B:17:0x003d, B:43:0x0125, B:45:0x013d, B:19:0x0048, B:20:0x0065, B:22:0x0082, B:28:0x00a4, B:29:0x00b7, B:30:0x00c1, B:32:0x00cb, B:34:0x00d7, B:39:0x00e3, B:40:0x010a, B:41:0x011b, B:46:0x0154, B:23:0x0087, B:25:0x00a0), top: B:51:0x0005, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private android.content.Intent b(android.content.Context r9, com.vivo.push.model.InsideNotificationItem r10, com.vivo.push.model.NotifyArriveCallbackByUser r11) {
        /*
            Method dump skipped, instructions count: 375
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vivo.push.util.i.b(android.content.Context, com.vivo.push.model.InsideNotificationItem, com.vivo.push.model.NotifyArriveCallbackByUser):android.content.Intent");
    }

    private static Intent b(Intent intent, Map<String, String> map) {
        if (map != null && map.entrySet() != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (entry != null && entry.getKey() != null && !intent.hasExtra(entry.getKey())) {
                    intent.putExtra(entry.getKey(), entry.getValue());
                }
            }
        }
        return intent;
    }

    @Override // com.vivo.push.util.b
    protected final int a() {
        return this.e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.vivo.push.util.b
    public final PendingIntent a(Context context, Intent intent) {
        return com.android.taobao.aop.a.a(context, (int) SystemClock.uptimeMillis(), intent, 201326592);
    }

    @Override // com.vivo.push.util.b
    protected final Intent a(Context context, InsideNotificationItem insideNotificationItem, NotifyArriveCallbackByUser notifyArriveCallbackByUser) {
        return b(context, insideNotificationItem, notifyArriveCallbackByUser);
    }
}
