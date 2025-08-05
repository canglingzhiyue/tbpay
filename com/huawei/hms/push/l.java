package com.huawei.hms.push;

import android.app.AlarmManager;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.hms.android.HwBuildEx;
import com.huawei.hms.support.api.push.TransActivity;
import com.huawei.hms.support.log.HMSLog;

/* loaded from: classes4.dex */
public class l {

    /* renamed from: a  reason: collision with root package name */
    private static int f7524a;

    private static Notification a(Context context, m mVar, int[] iArr) {
        Notification.Builder builder = new Notification.Builder(context);
        if (h.a(mVar) == i.STYLE_BIGTEXT) {
            h.a(builder, mVar.g(), mVar);
        }
        f.a(context, builder, mVar);
        b(mVar, builder);
        d(mVar, builder);
        a(context, mVar, builder);
        a(builder);
        a(mVar, builder);
        c(mVar, builder);
        builder.setContentIntent(c(context, mVar, iArr));
        builder.setDeleteIntent(b(context, mVar, iArr));
        if (Build.VERSION.SDK_INT >= 26) {
            builder.setChannelId("HwPushChannelID");
        }
        b(context, builder, mVar);
        a(context, builder, mVar);
        return builder.build();
    }

    private static Intent a(Context context, m mVar, int[] iArr, String str, int i) {
        Intent intent = new Intent("com.huawei.intent.action.PUSH_DELAY_NOTIFY");
        intent.putExtra("selfshow_info", mVar.o()).putExtra("selfshow_token", mVar.y()).putExtra("selfshow_event_id", str).putExtra("selfshow_notify_id", iArr[0]).putExtra("selfshow_auto_clear_id", iArr[3]).setPackage(context.getPackageName()).setFlags(i);
        return intent;
    }

    private static void a(Notification.Builder builder) {
        builder.setShowWhen(true);
        builder.setWhen(System.currentTimeMillis());
    }

    private static void a(Context context, Notification.Builder builder, m mVar) {
        if (HwBuildEx.VERSION.EMUI_SDK_INT < 11 || !d.a(context)) {
            return;
        }
        Bundle bundle = new Bundle();
        String k = mVar.k();
        HMSLog.i("PushSelfShowLog", "the package name of notification is:" + k);
        if (!TextUtils.isEmpty(k)) {
            String a2 = d.a(context, k);
            HMSLog.i("PushSelfShowLog", "the app name is:" + a2);
            if (a2 != null) {
                bundle.putCharSequence("android.extraAppName", a2);
            }
        }
        builder.setExtras(bundle);
    }

    private static void a(Context context, Intent intent, long j, int i) {
        try {
            HMSLog.d("PushSelfShowLog", "enter setDelayAlarm(interval:" + j + "ms.");
            AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
            if (alarmManager == null) {
                return;
            }
            alarmManager.set(0, System.currentTimeMillis() + j, com.android.taobao.aop.a.b(context, i, intent, d.b()));
        } catch (Exception e) {
            HMSLog.w("PushSelfShowLog", "set DelayAlarm error." + e.toString());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x015a A[Catch: all -> 0x0199, TryCatch #0 {, blocks: (B:5:0x0005, B:7:0x000b, B:9:0x0029, B:10:0x0046, B:12:0x0051, B:14:0x005b, B:15:0x0078, B:17:0x007f, B:18:0x00be, B:21:0x0110, B:24:0x0150, B:26:0x015a, B:27:0x015e, B:30:0x016a, B:32:0x0170, B:33:0x0184, B:19:0x00c3, B:20:0x00cf), top: B:41:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0170 A[Catch: all -> 0x0199, TryCatch #0 {, blocks: (B:5:0x0005, B:7:0x000b, B:9:0x0029, B:10:0x0046, B:12:0x0051, B:14:0x005b, B:15:0x0078, B:17:0x007f, B:18:0x00be, B:21:0x0110, B:24:0x0150, B:26:0x015a, B:27:0x015e, B:30:0x016a, B:32:0x0170, B:33:0x0184, B:19:0x00c3, B:20:0x00cf), top: B:41:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static synchronized void a(android.content.Context r9, com.huawei.hms.push.m r10) {
        /*
            Method dump skipped, instructions count: 414
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.push.l.a(android.content.Context, com.huawei.hms.push.m):void");
    }

    private static void a(Context context, m mVar, Notification.Builder builder) {
        Bitmap a2 = f.a(context, mVar);
        if (a2 != null) {
            builder.setLargeIcon(a2);
        }
    }

    private static void a(m mVar, Notification.Builder builder) {
        boolean z = true;
        if (mVar.e() != 1) {
            z = false;
        }
        builder.setAutoCancel(z);
        builder.setOngoing(false);
    }

    private static boolean a() {
        return Build.VERSION.SDK_INT >= 30;
    }

    private static boolean a(m mVar) {
        if (mVar != null) {
            return TextUtils.isEmpty(mVar.u()) && TextUtils.isEmpty(mVar.j());
        }
        return true;
    }

    private static PendingIntent b(Context context, m mVar, int[] iArr) {
        return com.android.taobao.aop.a.b(context, iArr[2], a(context, mVar, iArr, "2", 268435456), d.b());
    }

    private static void b(Context context, Notification.Builder builder, m mVar) {
        if ("com.huawei.android.pushagent".equals(context.getPackageName())) {
            Bundle bundle = new Bundle();
            String k = mVar.k();
            if (TextUtils.isEmpty(k)) {
                return;
            }
            bundle.putString("hw_origin_sender_package_name", k);
            builder.setExtras(bundle);
        }
    }

    private static void b(m mVar, Notification.Builder builder) {
        String t = mVar.t();
        if (!TextUtils.isEmpty(t)) {
            builder.setSubText(t);
        }
    }

    private static PendingIntent c(Context context, m mVar, int[] iArr) {
        Intent a2 = a(context, mVar, iArr, "1", 268435456);
        if (a()) {
            a2.setClass(context, TransActivity.class);
            a2.setFlags(268468224);
            return com.android.taobao.aop.a.a(context, iArr[1], a2, d.b());
        }
        return com.android.taobao.aop.a.b(context, iArr[1], a2, d.b());
    }

    private static void c(m mVar, Notification.Builder builder) {
        builder.setTicker(mVar.x());
    }

    private static void d(Context context, m mVar, int[] iArr) {
        HMSLog.i("PushSelfShowLog", "setAutoClear time is: " + mVar.f());
        if (mVar.f() <= 0) {
            return;
        }
        a(context, a(context, mVar, iArr, "-1", 32), mVar.f(), iArr[3]);
    }

    private static void d(m mVar, Notification.Builder builder) {
        String u = mVar.u();
        String j = mVar.j();
        if (TextUtils.isEmpty(j)) {
            builder.setContentText(u);
            return;
        }
        builder.setContentText(j);
        if (TextUtils.isEmpty(u)) {
            return;
        }
        builder.setContentTitle(u);
    }
}
