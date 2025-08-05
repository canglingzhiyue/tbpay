package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;

/* loaded from: classes9.dex */
public class COSPushHelper {

    /* renamed from: a  reason: collision with root package name */
    private static long f24291a = 0;

    /* renamed from: a  reason: collision with other field name */
    private static volatile boolean f24a = false;

    public static void convertMessage(Intent intent) {
        i.a(intent);
    }

    public static void doInNetworkChange(Context context) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (getNeedRegister()) {
            long j = f24291a;
            if (j > 0 && j + 300000 > elapsedRealtime) {
                return;
            }
            f24291a = elapsedRealtime;
            registerCOSAssemblePush(context);
        }
    }

    public static boolean getNeedRegister() {
        return f24a;
    }

    public static boolean hasNetwork(Context context) {
        return i.m1688a(context);
    }

    public static void onNotificationMessageCome(Context context, String str) {
    }

    public static void onPassThoughMessageCome(Context context, String str) {
    }

    public static void registerCOSAssemblePush(Context context) {
        AbstractPushManager a2 = f.a(context).a(e.ASSEMBLE_PUSH_COS);
        if (a2 != null) {
            com.xiaomi.channel.commonutils.logger.b.m1616a("ASSEMBLE_PUSH :  register cos when network change!");
            a2.register();
        }
    }

    public static synchronized void setNeedRegister(boolean z) {
        synchronized (COSPushHelper.class) {
            f24a = z;
        }
    }

    public static void uploadToken(Context context, String str) {
        i.m1687a(context, e.ASSEMBLE_PUSH_COS, str);
    }
}
