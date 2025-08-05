package com.xiaomi.push;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;

/* loaded from: classes9.dex */
public class db {

    /* renamed from: a  reason: collision with root package name */
    private static int f24414a = -1;

    /* renamed from: a  reason: collision with other field name */
    private static dh f196a;

    /* renamed from: a  reason: collision with other field name */
    private static String f197a;

    private static int a(Context context) {
        String str;
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                b(null);
                return -1;
            } else if (activeNetworkInfo.getType() != 0) {
                if (activeNetworkInfo.getType() != 1 && activeNetworkInfo.getType() != 6) {
                    b(null);
                    return -1;
                }
                b("WIFI-ID-UNKNOWN");
                return 1;
            } else {
                String subtypeName = activeNetworkInfo.getSubtypeName();
                if (TextUtils.isEmpty(subtypeName) || "UNKNOWN".equalsIgnoreCase(subtypeName)) {
                    str = null;
                } else {
                    str = "M-" + subtypeName;
                }
                b(str);
                return 0;
            }
        } catch (Exception e) {
            com.xiaomi.channel.commonutils.logger.b.d("DisconnectStatsHelper getNetType occurred error: " + e.getMessage());
            b(null);
            return -1;
        }
    }

    private static synchronized String a() {
        String str;
        synchronized (db.class) {
            str = f197a;
        }
        return str;
    }

    /* renamed from: a  reason: collision with other method in class */
    public static void m1804a(Context context) {
        String str;
        if (!m1805a(context)) {
            str = "onReconnection shouldSampling = false";
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            f24414a = a(context);
            de.a(context, currentTimeMillis);
            str = "onReconnection connectedNetworkType = " + f24414a;
        }
        a(str);
    }

    public static void a(Context context, gq gqVar) {
        if (m1805a(context)) {
            if (f196a == null) {
                f196a = new dh(context);
            }
            gqVar.a(f196a);
            a("startStats");
        }
    }

    public static void a(Context context, String str) {
        if (!m1805a(context)) {
            a("onWifiChanged shouldSampling = false");
            return;
        }
        a("onWifiChanged wifiDigest = " + str);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        b("W-" + str);
    }

    public static void a(Context context, String str, int i) {
        String str2;
        if (!m1805a(context)) {
            str2 = "onDisconnection shouldSampling = false";
        } else {
            de.a(context, str, bg.c(context), System.currentTimeMillis(), i, com.xiaomi.push.service.p.a(context).m2344b(), a(context), a(), f24414a);
            str2 = "onDisconnection";
        }
        a(str2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(String str) {
        cy.a("Push-DiscntStats", str);
    }

    /* renamed from: a  reason: collision with other method in class */
    private static boolean m1805a(Context context) {
        return cy.a(context);
    }

    public static void b(Context context, gq gqVar) {
        dh dhVar = f196a;
        if (dhVar != null) {
            gqVar.b(dhVar);
            f196a = null;
            a("stopStats");
        }
    }

    private static synchronized void b(String str) {
        synchronized (db.class) {
            if (!"WIFI-ID-UNKNOWN".equals(str)) {
                f197a = str;
            } else if (f197a == null || !f197a.startsWith("W-")) {
                f197a = null;
            }
            a("updateNetId new networkId = " + str + ", finally netId = " + f197a);
        }
    }
}
