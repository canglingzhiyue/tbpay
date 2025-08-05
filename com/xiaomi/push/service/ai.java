package com.xiaomi.push.service;

import android.content.Context;
import android.os.Messenger;
import android.text.TextUtils;
import com.xiaomi.mipush.sdk.ErrorCode;
import com.xiaomi.push.di;
import com.xiaomi.push.gf;
import com.xiaomi.push.gq;
import com.xiaomi.push.hb;
import com.xiaomi.push.hh;
import com.xiaomi.push.ic;
import com.xiaomi.push.im;
import com.xiaomi.push.ir;
import com.xiaomi.push.iy;
import com.xiaomi.push.jb;
import com.xiaomi.push.jm;
import com.xiaomi.push.jn;
import com.xiaomi.push.js;
import com.xiaomi.push.service.bf;
import java.nio.ByteBuffer;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes9.dex */
public final class ai {
    static gf a(XMPushService xMPushService, byte[] bArr) {
        iy iyVar = new iy();
        try {
            jm.a(iyVar, bArr);
            return a(v.m2360a((Context) xMPushService), xMPushService, iyVar);
        } catch (js e) {
            com.xiaomi.channel.commonutils.logger.b.a(e);
            return null;
        }
    }

    static gf a(u uVar, Context context, iy iyVar) {
        try {
            gf gfVar = new gf();
            gfVar.a(5);
            gfVar.c(uVar.f1028a);
            gfVar.b(a(iyVar));
            gfVar.a("SECMSG", "message");
            String str = uVar.f1028a;
            iyVar.f660a.f587a = str.substring(0, str.indexOf("@"));
            iyVar.f660a.f591c = str.substring(str.indexOf("/") + 1);
            gfVar.a(jm.a(iyVar), uVar.c);
            gfVar.a((short) 1);
            com.xiaomi.channel.commonutils.logger.b.m1616a("try send mi push message. packagename:" + iyVar.f665b + " action:" + iyVar.f658a);
            return gfVar;
        } catch (NullPointerException e) {
            com.xiaomi.channel.commonutils.logger.b.a(e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static iy a(String str, String str2) {
        jb jbVar = new jb();
        jbVar.b(str2);
        jbVar.c("package uninstalled");
        jbVar.a(hh.i());
        jbVar.a(false);
        return a(str, str2, jbVar, ic.Notification);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T extends jn<T, ?>> iy a(String str, String str2, T t, ic icVar) {
        return a(str, str2, t, icVar, true);
    }

    private static <T extends jn<T, ?>> iy a(String str, String str2, T t, ic icVar, boolean z) {
        byte[] a2 = jm.a(t);
        iy iyVar = new iy();
        ir irVar = new ir();
        irVar.f586a = 5L;
        irVar.f587a = "fakeid";
        iyVar.a(irVar);
        iyVar.a(ByteBuffer.wrap(a2));
        iyVar.a(icVar);
        iyVar.b(z);
        iyVar.b(str);
        iyVar.a(false);
        iyVar.a(str2);
        return iyVar;
    }

    private static String a(iy iyVar) {
        if (iyVar.f659a != null && iyVar.f659a.f577b != null) {
            String str = iyVar.f659a.f577b.get("ext_traffic_source_pkg");
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
        }
        return iyVar.f665b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(String str) {
        return str + ".permission.MIPUSH_RECEIVE";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(XMPushService xMPushService) {
        u m2360a = v.m2360a(xMPushService.getApplicationContext());
        if (m2360a != null) {
            bf.b a2 = v.m2360a(xMPushService.getApplicationContext()).a(xMPushService);
            com.xiaomi.channel.commonutils.logger.b.m1616a("prepare account. " + a2.f957a);
            a(xMPushService, a2);
            bf.a().a(a2);
            a(xMPushService, m2360a, 172800);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(XMPushService xMPushService, iy iyVar) {
        di.a(iyVar.b(), xMPushService.getApplicationContext(), iyVar, -1);
        gq m2236a = xMPushService.m2236a();
        if (m2236a != null) {
            if (!m2236a.m1987a()) {
                throw new hb("Don't support XMPP connection.");
            }
            gf a2 = a(v.m2360a((Context) xMPushService), xMPushService, iyVar);
            if (a2 == null) {
                return;
            }
            m2236a.b(a2);
            return;
        }
        throw new hb("try send msg while connection is null.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(XMPushService xMPushService, bf.b bVar) {
        bVar.a((Messenger) null);
        bVar.a(new ak(xMPushService));
    }

    private static void a(XMPushService xMPushService, u uVar, int i) {
        by.a(xMPushService).a(new aj("MSAID", i, xMPushService, uVar));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(XMPushService xMPushService, String str, byte[] bArr) {
        di.a(str, xMPushService.getApplicationContext(), bArr);
        gq m2236a = xMPushService.m2236a();
        if (m2236a != null) {
            if (!m2236a.m1987a()) {
                throw new hb("Don't support XMPP connection.");
            }
            gf a2 = a(xMPushService, bArr);
            if (a2 != null) {
                m2236a.b(a2);
                return;
            } else {
                y.a(xMPushService, str, bArr, ErrorCode.ERROR_INVALID_PAYLOAD, "not a valid message");
                return;
            }
        }
        throw new hb("try send msg while connection is null.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static iy b(String str, String str2) {
        jb jbVar = new jb();
        jbVar.b(str2);
        jbVar.c(im.AppDataCleared.f538a);
        jbVar.a(bc.a());
        jbVar.a(false);
        return a(str, str2, jbVar, ic.Notification);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T extends jn<T, ?>> iy b(String str, String str2, T t, ic icVar) {
        return a(str, str2, t, icVar, false);
    }
}
