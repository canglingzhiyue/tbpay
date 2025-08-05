package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.xiaomi.mipush.sdk.b;
import com.xiaomi.push.BuildConfig;
import com.xiaomi.push.bm;
import com.xiaomi.push.fn;
import com.xiaomi.push.g;
import com.xiaomi.push.ic;
import com.xiaomi.push.im;
import com.xiaomi.push.ip;
import com.xiaomi.push.iq;
import com.xiaomi.push.is;
import com.xiaomi.push.jb;
import com.xiaomi.push.jc;
import com.xiaomi.push.jd;
import com.xiaomi.push.ji;
import com.xiaomi.push.jj;
import com.xiaomi.push.jm;
import com.xiaomi.push.service.bc;
import com.xiaomi.push.service.bs;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/* loaded from: classes9.dex */
public class MiPushClient4Hybrid {
    private static MiPushCallback sCallback;
    private static Map<String, b.a> dataMap = new HashMap();
    private static Map<String, Long> sRegisterTimeMap = new HashMap();

    /* loaded from: classes9.dex */
    public static class MiPushCallback {
        public void onCommandResult(String str, MiPushCommandMessage miPushCommandMessage) {
        }

        public void onReceiveRegisterResult(String str, MiPushCommandMessage miPushCommandMessage) {
        }

        public void onReceiveUnregisterResult(String str, MiPushCommandMessage miPushCommandMessage) {
        }
    }

    private static void addPullNotificationTime(Context context, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("mipush_extra", 0);
        sharedPreferences.edit().putLong("last_pull_notification_" + str, System.currentTimeMillis()).commit();
    }

    private static short getDeviceStatus(MiPushMessage miPushMessage, boolean z) {
        String str = miPushMessage.getExtra() == null ? "" : miPushMessage.getExtra().get(Constants.EXTRA_KEY_HYBRID_DEVICE_STATUS);
        int i = 0;
        if (!TextUtils.isEmpty(str)) {
            i = Integer.valueOf(str).intValue();
        }
        if (!z) {
            i = (i & (-4)) + g.b.NOT_ALLOWED.a();
        }
        return (short) i;
    }

    public static boolean isRegistered(Context context, String str) {
        return b.m1665a(context).a(str) != null;
    }

    public static void onReceiveRegisterResult(Context context, jd jdVar) {
        b.a aVar;
        String c = jdVar.c();
        if (jdVar.a() == 0 && (aVar = dataMap.get(c)) != null) {
            aVar.a(jdVar.f734e, jdVar.f735f);
            b.m1665a(context).a(c, aVar);
        }
        ArrayList arrayList = null;
        if (!TextUtils.isEmpty(jdVar.f734e)) {
            arrayList = new ArrayList();
            arrayList.add(jdVar.f734e);
        }
        MiPushCommandMessage generateCommandMessage = PushMessageHelper.generateCommandMessage(fn.COMMAND_REGISTER.f362a, arrayList, jdVar.f722a, jdVar.f733d, null, null);
        MiPushCallback miPushCallback = sCallback;
        if (miPushCallback != null) {
            miPushCallback.onReceiveRegisterResult(c, generateCommandMessage);
        }
    }

    public static void onReceiveUnregisterResult(Context context, jj jjVar) {
        MiPushCommandMessage generateCommandMessage = PushMessageHelper.generateCommandMessage(fn.COMMAND_UNREGISTER.f362a, null, jjVar.f800a, jjVar.f808d, null, null);
        String a2 = jjVar.a();
        MiPushCallback miPushCallback = sCallback;
        if (miPushCallback != null) {
            miPushCallback.onReceiveUnregisterResult(a2, generateCommandMessage);
        }
    }

    public static void registerPush(Context context, String str, String str2, String str3) {
        if (b.m1665a(context).m1670a(str2, str3, str)) {
            ArrayList arrayList = new ArrayList();
            b.a a2 = b.m1665a(context).a(str);
            if (a2 != null) {
                arrayList.add(a2.c);
                MiPushCommandMessage generateCommandMessage = PushMessageHelper.generateCommandMessage(fn.COMMAND_REGISTER.f362a, arrayList, 0L, null, null, null);
                MiPushCallback miPushCallback = sCallback;
                if (miPushCallback != null) {
                    miPushCallback.onReceiveRegisterResult(str, generateCommandMessage);
                }
            }
            if (!shouldPullNotification(context, str)) {
                return;
            }
            jb jbVar = new jb();
            jbVar.b(str2);
            jbVar.c(im.PullOfflineMessage.f538a);
            jbVar.a(bc.a());
            jbVar.a(false);
            ao.a(context).a(jbVar, ic.Notification, false, true, null, false, str, str2);
            com.xiaomi.channel.commonutils.logger.b.b("MiPushClient4Hybrid pull offline pass through message");
            addPullNotificationTime(context, str);
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (Math.abs(currentTimeMillis - (sRegisterTimeMap.get(str) != null ? sRegisterTimeMap.get(str).longValue() : 0L)) < 5000) {
            com.xiaomi.channel.commonutils.logger.b.m1616a("MiPushClient4Hybrid  Could not send register message within 5s repeatedly.");
            return;
        }
        sRegisterTimeMap.put(str, Long.valueOf(currentTimeMillis));
        String a3 = bm.a(6);
        b.a aVar = new b.a(context);
        aVar.c(str2, str3, a3);
        dataMap.put(str, aVar);
        jc jcVar = new jc();
        jcVar.a(bc.a());
        jcVar.b(str2);
        jcVar.e(str3);
        jcVar.d(str);
        jcVar.f(a3);
        jcVar.c(com.xiaomi.push.g.m1946a(context, context.getPackageName()));
        jcVar.b(com.xiaomi.push.g.a(context, context.getPackageName()));
        jcVar.h(BuildConfig.VERSION_NAME);
        jcVar.a(BuildConfig.VERSION_CODE);
        jcVar.a(iq.Init);
        if (!com.xiaomi.push.j.m2123d()) {
            String d = com.xiaomi.push.i.d(context);
            if (!TextUtils.isEmpty(d)) {
                jcVar.i(bm.a(d));
            }
        }
        int a4 = com.xiaomi.push.i.a();
        if (a4 >= 0) {
            jcVar.c(a4);
        }
        jb jbVar2 = new jb();
        jbVar2.c(im.HybridRegister.f538a);
        jbVar2.b(b.m1665a(context).m1666a());
        jbVar2.d(context.getPackageName());
        jbVar2.a(jm.a(jcVar));
        jbVar2.a(bc.a());
        ao.a(context).a((ao) jbVar2, ic.Notification, (ip) null);
    }

    public static void removeDuplicateCache(Context context, MiPushMessage miPushMessage) {
        String str = miPushMessage.getExtra() != null ? miPushMessage.getExtra().get("jobkey") : null;
        if (TextUtils.isEmpty(str)) {
            str = miPushMessage.getMessageId();
        }
        am.a(context, str);
    }

    public static void reportMessageArrived(Context context, MiPushMessage miPushMessage, boolean z) {
        if (miPushMessage == null || miPushMessage.getExtra() == null) {
            com.xiaomi.channel.commonutils.logger.b.m1616a("do not ack message, message is null");
            return;
        }
        try {
            is isVar = new is();
            isVar.b(b.m1665a(context).m1666a());
            isVar.a(miPushMessage.getMessageId());
            isVar.a(Long.valueOf(miPushMessage.getExtra().get(Constants.EXTRA_KEY_HYBRID_MESSAGE_TS)).longValue());
            isVar.a(getDeviceStatus(miPushMessage, z));
            if (!TextUtils.isEmpty(miPushMessage.getTopic())) {
                isVar.c(miPushMessage.getTopic());
            }
            ao.a(context).a((ao) isVar, ic.AckMessage, false, bs.a(PushMessageHelper.generateMessage(miPushMessage)));
            com.xiaomi.channel.commonutils.logger.b.b("MiPushClient4Hybrid ack mina message, messageId is " + miPushMessage.getMessageId());
        } catch (Throwable th) {
            try {
                com.xiaomi.channel.commonutils.logger.b.a(th);
            } finally {
                miPushMessage.getExtra().remove(Constants.EXTRA_KEY_HYBRID_MESSAGE_TS);
                miPushMessage.getExtra().remove(Constants.EXTRA_KEY_HYBRID_DEVICE_STATUS);
            }
        }
    }

    public static void reportMessageClicked(Context context, MiPushMessage miPushMessage) {
        MiPushClient.reportMessageClicked(context, miPushMessage);
    }

    public static void setCallback(MiPushCallback miPushCallback) {
        sCallback = miPushCallback;
    }

    private static boolean shouldPullNotification(Context context, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("mipush_extra", 0);
        StringBuilder sb = new StringBuilder();
        sb.append("last_pull_notification_");
        sb.append(str);
        return Math.abs(System.currentTimeMillis() - sharedPreferences.getLong(sb.toString(), -1L)) > 300000;
    }

    public static void unregisterPush(Context context, String str) {
        sRegisterTimeMap.remove(str);
        b.a a2 = b.m1665a(context).a(str);
        if (a2 == null) {
            return;
        }
        ji jiVar = new ji();
        jiVar.a(bc.a());
        jiVar.d(str);
        jiVar.b(a2.f68a);
        jiVar.c(a2.c);
        jiVar.e(a2.b);
        jb jbVar = new jb();
        jbVar.c(im.HybridUnregister.f538a);
        jbVar.b(b.m1665a(context).m1666a());
        jbVar.d(context.getPackageName());
        jbVar.a(jm.a(jiVar));
        jbVar.a(bc.a());
        ao.a(context).a((ao) jbVar, ic.Notification, (ip) null);
        b.m1665a(context).b(str);
    }

    public static void uploadClearMessageData(Context context, LinkedList<? extends Object> linkedList) {
        com.xiaomi.push.service.al.a(context, linkedList);
    }
}
