package com.xiaomi.push.service;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import mtopsdk.common.util.StringUtils;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.xiaomi.push.fd;
import com.xiaomi.push.gf;
import com.xiaomi.push.hb;
import com.xiaomi.push.he;
import com.xiaomi.push.hg;
import com.xiaomi.push.hh;
import com.xiaomi.push.hv;
import com.xiaomi.push.ic;
import com.xiaomi.push.im;
import com.xiaomi.push.ip;
import com.xiaomi.push.is;
import com.xiaomi.push.iy;
import com.xiaomi.push.jb;
import com.xiaomi.push.jm;
import com.xiaomi.push.service.al;
import com.xiaomi.push.service.bf;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes9.dex */
public class z {
    public static Intent a(byte[] bArr, long j) {
        iy a2 = a(bArr);
        if (a2 == null) {
            return null;
        }
        Intent intent = new Intent("com.xiaomi.mipush.RECEIVE_MESSAGE");
        intent.putExtra("mipush_payload", bArr);
        intent.putExtra("mrt", Long.toString(j));
        intent.setPackage(a2.f665b);
        return intent;
    }

    public static iy a(Context context, iy iyVar) {
        return a(context, iyVar, (Map<String, String>) null);
    }

    public static iy a(Context context, iy iyVar, Map<String, String> map) {
        is isVar = new is();
        isVar.b(iyVar.m2103a());
        ip m2102a = iyVar.m2102a();
        if (m2102a != null) {
            isVar.a(m2102a.m2068a());
            isVar.a(m2102a.m2066a());
            if (!StringUtils.isEmpty(m2102a.m2073b())) {
                isVar.c(m2102a.m2073b());
            }
        }
        isVar.a(jm.m2179a(context, iyVar));
        iy a2 = ai.a(iyVar.b(), iyVar.m2103a(), isVar, ic.AckMessage);
        ip m2102a2 = iyVar.m2102a();
        if (m2102a2 != null) {
            m2102a2 = bs.a(m2102a2.m2067a());
        }
        m2102a2.a("mat", Long.toString(System.currentTimeMillis()));
        m2102a2.a(ErrorType.CRASH, String.valueOf(jm.a(context, iyVar)));
        if (map != null) {
            try {
                if (map.size() > 0) {
                    for (String str : map.keySet()) {
                        m2102a2.a(str, map.get(str));
                    }
                }
            } catch (Throwable unused) {
            }
        }
        a2.a(m2102a2);
        return a2;
    }

    public static iy a(byte[] bArr) {
        iy iyVar = new iy();
        try {
            jm.a(iyVar, bArr);
            return iyVar;
        } catch (Throwable th) {
            com.xiaomi.channel.commonutils.logger.b.a(th);
            return null;
        }
    }

    public static void a(Context context, iy iyVar, byte[] bArr) {
        try {
            al.c m2271a = al.m2271a(context, iyVar, bArr);
            if (m2271a.f24641a > 0 && !StringUtils.isEmpty(m2271a.f923a)) {
                hv.a(context, m2271a.f923a, m2271a.f24641a, true, false, System.currentTimeMillis());
            }
            if (!com.xiaomi.push.j.m2118a(context) || !ah.a(context, iyVar, m2271a.f924a)) {
                b(context, iyVar, bArr);
                return;
            }
            ah.m2266a(context, iyVar);
            com.xiaomi.channel.commonutils.logger.b.m1616a("consume this broadcast by tts");
        } catch (Exception e) {
            com.xiaomi.channel.commonutils.logger.b.m1616a("notify push msg error " + e);
            e.printStackTrace();
        }
    }

    private static void a(XMPushService xMPushService, iy iyVar) {
        xMPushService.a(new aa(4, xMPushService, iyVar));
    }

    private static void a(XMPushService xMPushService, iy iyVar, jb jbVar) {
        xMPushService.a(new ag(4, jbVar, iyVar, xMPushService));
    }

    private static void a(XMPushService xMPushService, iy iyVar, String str) {
        xMPushService.a(new ae(4, xMPushService, iyVar, str));
    }

    private static void a(XMPushService xMPushService, iy iyVar, String str, String str2) {
        xMPushService.a(new af(4, xMPushService, iyVar, str, str2));
    }

    /* JADX WARN: Removed duplicated region for block: B:140:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x03a9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(com.xiaomi.push.service.XMPushService r19, java.lang.String r20, byte[] r21, android.content.Intent r22) {
        /*
            Method dump skipped, instructions count: 1210
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.z.a(com.xiaomi.push.service.XMPushService, java.lang.String, byte[], android.content.Intent):void");
    }

    private static void a(XMPushService xMPushService, byte[] bArr, long j) {
        a(xMPushService, bArr, j, (Map<String, String>) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(com.xiaomi.push.service.XMPushService r19, byte[] r20, long r21, java.util.Map<java.lang.String, java.lang.String> r23) {
        /*
            Method dump skipped, instructions count: 657
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.z.a(com.xiaomi.push.service.XMPushService, byte[], long, java.util.Map):void");
    }

    private static boolean a(Context context, Intent intent) {
        try {
            List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 32);
            if (queryBroadcastReceivers == null) {
                return false;
            }
            return !queryBroadcastReceivers.isEmpty();
        } catch (Exception unused) {
            return true;
        }
    }

    private static boolean a(Context context, String str) {
        Intent intent = new Intent("com.xiaomi.mipush.miui.CLICK_MESSAGE");
        intent.setPackage(str);
        Intent intent2 = new Intent("com.xiaomi.mipush.miui.RECEIVE_MESSAGE");
        intent2.setPackage(str);
        PackageManager packageManager = context.getPackageManager();
        try {
            List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 32);
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 32);
            if (!queryBroadcastReceivers.isEmpty()) {
                return true;
            }
            return !queryIntentServices.isEmpty();
        } catch (Exception e) {
            com.xiaomi.channel.commonutils.logger.b.a(e);
            return false;
        }
    }

    public static boolean a(Context context, String str, byte[] bArr) {
        if (com.xiaomi.push.g.m1949a(context, str)) {
            Intent intent = new Intent("com.xiaomi.mipush.MESSAGE_ARRIVED");
            intent.putExtra("mipush_payload", bArr);
            intent.setPackage(str);
            try {
                if (context.getPackageManager().queryBroadcastReceivers(intent, 0).isEmpty()) {
                    return false;
                }
                com.xiaomi.channel.commonutils.logger.b.m1616a("broadcast message arrived.");
                context.sendBroadcast(intent, ai.a(str));
                return true;
            } catch (Exception e) {
                com.xiaomi.channel.commonutils.logger.b.m1616a("meet error when broadcast message arrived. " + e);
                return false;
            }
        }
        return false;
    }

    private static boolean a(iy iyVar) {
        return "com.xiaomi.xmsf".equals(iyVar.f665b) && iyVar.m2102a() != null && iyVar.m2102a().m2069a() != null && iyVar.m2102a().m2069a().containsKey("miui_package_name");
    }

    private static boolean a(XMPushService xMPushService, String str, iy iyVar, ip ipVar) {
        boolean z = true;
        if (ipVar != null && ipVar.m2069a() != null && ipVar.m2069a().containsKey("__check_alive") && ipVar.m2069a().containsKey("__awake")) {
            jb jbVar = new jb();
            jbVar.b(iyVar.m2103a());
            jbVar.d(str);
            jbVar.c(im.AwakeSystemApp.f538a);
            jbVar.a(ipVar.m2068a());
            jbVar.f678a = new HashMap();
            boolean m1949a = com.xiaomi.push.g.m1949a(xMPushService.getApplicationContext(), str);
            jbVar.f678a.put("app_running", Boolean.toString(m1949a));
            if (!m1949a) {
                boolean parseBoolean = Boolean.parseBoolean(ipVar.m2069a().get("__awake"));
                jbVar.f678a.put("awaked", Boolean.toString(parseBoolean));
                if (!parseBoolean) {
                    z = false;
                }
            }
            try {
                ai.a(xMPushService, ai.a(iyVar.b(), iyVar.m2103a(), jbVar, ic.Notification));
            } catch (hb e) {
                com.xiaomi.channel.commonutils.logger.b.a(e);
            }
        }
        return z;
    }

    private static void b(Context context, iy iyVar, byte[] bArr) {
        if (al.m2275a(iyVar)) {
            return;
        }
        String a2 = al.a(iyVar);
        if (StringUtils.isEmpty(a2) || a(context, a2, bArr)) {
            return;
        }
        fd.a(context).b(a2, al.b(iyVar), iyVar.m2102a().m2068a(), "1");
    }

    private static void b(XMPushService xMPushService, iy iyVar) {
        xMPushService.a(new ab(4, xMPushService, iyVar));
    }

    private static boolean b(iy iyVar) {
        Map<String, String> m2069a = iyVar.m2102a().m2069a();
        return m2069a != null && m2069a.containsKey("notify_effect");
    }

    private static void c(XMPushService xMPushService, iy iyVar) {
        xMPushService.a(new ac(4, xMPushService, iyVar));
    }

    private static boolean c(iy iyVar) {
        if (iyVar.m2102a() == null || iyVar.m2102a().m2069a() == null) {
            return false;
        }
        return "1".equals(iyVar.m2102a().m2069a().get("obslete_ads_message"));
    }

    private static void d(XMPushService xMPushService, iy iyVar) {
        xMPushService.a(new ad(4, xMPushService, iyVar));
    }

    public void a(Context context, bf.b bVar, boolean z, int i, String str) {
        u m2360a;
        if (z || (m2360a = v.m2360a(context)) == null || !"token-expired".equals(str)) {
            return;
        }
        v.a(context, m2360a.f, m2360a.d, m2360a.e);
    }

    public void a(XMPushService xMPushService, gf gfVar, bf.b bVar) {
        try {
            byte[] m1967a = gfVar.m1967a(bVar.h);
            HashMap hashMap = null;
            if (e.b(gfVar)) {
                hashMap = new HashMap();
                hashMap.put("t_im", String.valueOf(gfVar.m1968b()));
                hashMap.put("t_rt", String.valueOf(gfVar.m1961a()));
            }
            a(xMPushService, m1967a, gfVar.c(), hashMap);
        } catch (IllegalArgumentException e) {
            com.xiaomi.channel.commonutils.logger.b.a(e);
        }
    }

    public void a(XMPushService xMPushService, hh hhVar, bf.b bVar) {
        if (!(hhVar instanceof hg)) {
            com.xiaomi.channel.commonutils.logger.b.m1616a("not a mipush message");
            return;
        }
        hg hgVar = (hg) hhVar;
        he a2 = hgVar.a("s");
        if (a2 == null) {
            return;
        }
        try {
            a(xMPushService, bo.a(bo.a(bVar.h, hgVar.j()), a2.c()), hv.a(hhVar.m2007a()));
        } catch (IllegalArgumentException e) {
            com.xiaomi.channel.commonutils.logger.b.a(e);
        }
    }
}
