package com.xiaomi.push.service;

import android.content.Context;
import android.content.Intent;
import android.os.Message;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.xiaomi.push.gf;
import com.xiaomi.push.hf;
import com.xiaomi.push.hg;
import com.xiaomi.push.hh;
import com.xiaomi.push.hj;
import com.xiaomi.push.service.bf;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes9.dex */
public class k {

    /* renamed from: a  reason: collision with root package name */
    private z f24713a = new z();

    public static String a(bf.b bVar) {
        StringBuilder sb;
        String str;
        if (!"9".equals(bVar.g)) {
            sb = new StringBuilder();
            sb.append(bVar.f957a);
            str = ".permission.MIPUSH_RECEIVE";
        } else {
            sb = new StringBuilder();
            sb.append(bVar.f957a);
            str = ".permission.MIMC_RECEIVE";
        }
        sb.append(str);
        return sb.toString();
    }

    private static void a(Context context, Intent intent, bf.b bVar) {
        if ("com.xiaomi.xmsf".equals(context.getPackageName())) {
            context.sendBroadcast(intent);
        } else {
            context.sendBroadcast(intent, a(bVar));
        }
    }

    bf.b a(gf gfVar) {
        Collection<bf.b> m2303a = bf.a().m2303a(Integer.toString(gfVar.a()));
        if (m2303a.isEmpty()) {
            return null;
        }
        Iterator<bf.b> it = m2303a.iterator();
        if (m2303a.size() == 1) {
            return it.next();
        }
        String g = gfVar.g();
        while (it.hasNext()) {
            bf.b next = it.next();
            if (TextUtils.equals(g, next.f960b)) {
                return next;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    com.xiaomi.push.service.bf.b a(com.xiaomi.push.hh r6) {
        /*
            r5 = this;
            com.xiaomi.push.service.bf r0 = com.xiaomi.push.service.bf.a()
            java.lang.String r1 = r6.k()
            java.util.Collection r0 = r0.m2303a(r1)
            boolean r1 = r0.isEmpty()
            r2 = 0
            if (r1 == 0) goto L14
            return r2
        L14:
            java.util.Iterator r1 = r0.iterator()
            int r0 = r0.size()
            r3 = 1
            if (r0 != r3) goto L26
            java.lang.Object r6 = r1.next()
            com.xiaomi.push.service.bf$b r6 = (com.xiaomi.push.service.bf.b) r6
            return r6
        L26:
            java.lang.String r0 = r6.m()
            java.lang.String r6 = r6.l()
        L2e:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L4b
            java.lang.Object r3 = r1.next()
            com.xiaomi.push.service.bf$b r3 = (com.xiaomi.push.service.bf.b) r3
            java.lang.String r4 = r3.f960b
            boolean r4 = android.text.TextUtils.equals(r0, r4)
            if (r4 != 0) goto L4a
            java.lang.String r4 = r3.f960b
            boolean r4 = android.text.TextUtils.equals(r6, r4)
            if (r4 == 0) goto L2e
        L4a:
            return r3
        L4b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.k.a(com.xiaomi.push.hh):com.xiaomi.push.service.bf$b");
    }

    public void a(Context context) {
        Intent intent = new Intent();
        intent.setAction("com.xiaomi.push.service_started");
        if (com.xiaomi.push.j.m2122c()) {
            intent.addFlags(16777216);
        }
        com.xiaomi.channel.commonutils.logger.b.m1616a("[Bcst] send ***.push.service_started broadcast to inform push service has started.");
        context.sendBroadcast(intent);
    }

    public void a(Context context, bf.b bVar, int i) {
        if (!"5".equalsIgnoreCase(bVar.g)) {
            Intent intent = new Intent();
            intent.setAction("com.xiaomi.push.channel_closed");
            intent.setPackage(bVar.f957a);
            intent.putExtra(bj.u, bVar.g);
            intent.putExtra("ext_reason", i);
            intent.putExtra(bj.r, bVar.f960b);
            intent.putExtra(bj.I, bVar.i);
            if (bVar.f951a == null || !"9".equals(bVar.g)) {
                com.xiaomi.channel.commonutils.logger.b.m1616a(String.format("[Bcst] notify channel closed. %s,%s,%d", bVar.g, bVar.f957a, Integer.valueOf(i)));
                a(context, intent, bVar);
                return;
            }
            try {
                bVar.f951a.send(Message.obtain(null, 17, intent));
            } catch (RemoteException unused) {
                bVar.f951a = null;
                com.xiaomi.channel.commonutils.logger.b.m1616a("peer may died: " + bVar.f960b.substring(bVar.f960b.lastIndexOf(64)));
            }
        }
    }

    public void a(Context context, bf.b bVar, String str, String str2) {
        if (bVar == null) {
            com.xiaomi.channel.commonutils.logger.b.d("error while notify kick by server!");
        } else if ("5".equalsIgnoreCase(bVar.g)) {
            com.xiaomi.channel.commonutils.logger.b.d("mipush kicked by server");
        } else {
            Intent intent = new Intent();
            intent.setAction("com.xiaomi.push.kicked");
            intent.setPackage(bVar.f957a);
            intent.putExtra("ext_kick_type", str);
            intent.putExtra("ext_kick_reason", str2);
            intent.putExtra("ext_chid", bVar.g);
            intent.putExtra(bj.r, bVar.f960b);
            intent.putExtra(bj.I, bVar.i);
            com.xiaomi.channel.commonutils.logger.b.m1616a(String.format("[Bcst] notify packet(blob) arrival. %s,%s,%s", bVar.g, bVar.f957a, str2));
            a(context, intent, bVar);
        }
    }

    public void a(Context context, bf.b bVar, boolean z, int i, String str) {
        if ("5".equalsIgnoreCase(bVar.g)) {
            this.f24713a.a(context, bVar, z, i, str);
            return;
        }
        Intent intent = new Intent();
        intent.setAction("com.xiaomi.push.channel_opened");
        intent.setPackage(bVar.f957a);
        intent.putExtra("ext_succeeded", z);
        if (!z) {
            intent.putExtra("ext_reason", i);
        }
        if (!TextUtils.isEmpty(str)) {
            intent.putExtra("ext_reason_msg", str);
        }
        intent.putExtra("ext_chid", bVar.g);
        intent.putExtra(bj.r, bVar.f960b);
        intent.putExtra(bj.I, bVar.i);
        com.xiaomi.channel.commonutils.logger.b.m1616a(String.format("[Bcst] notify channel open result. %s,%s,%b,%d", bVar.g, bVar.f957a, Boolean.valueOf(z), Integer.valueOf(i)));
        a(context, intent, bVar);
    }

    public void a(XMPushService xMPushService, String str, gf gfVar) {
        bf.b a2 = a(gfVar);
        if (a2 == null) {
            com.xiaomi.channel.commonutils.logger.b.d("error while notify channel closed! channel " + str + " not registered");
        } else if ("5".equalsIgnoreCase(str)) {
            this.f24713a.a(xMPushService, gfVar, a2);
        } else {
            String str2 = a2.f957a;
            Intent intent = new Intent();
            intent.setAction("com.xiaomi.push.new_msg");
            intent.setPackage(str2);
            intent.putExtra("ext_rcv_timestamp", SystemClock.elapsedRealtime());
            intent.putExtra("ext_chid", str);
            intent.putExtra("ext_raw_packet", gfVar.m1967a(a2.h));
            intent.putExtra(bj.I, a2.i);
            intent.putExtra(bj.A, a2.h);
            if (e.a(gfVar)) {
                intent.putExtra("ext_downward_pkt_id", gfVar.e());
            }
            if (a2.f951a != null) {
                try {
                    a2.f951a.send(Message.obtain(null, 17, intent));
                    com.xiaomi.channel.commonutils.logger.b.m1616a("message was sent by messenger for chid=" + str);
                    return;
                } catch (RemoteException unused) {
                    a2.f951a = null;
                    com.xiaomi.channel.commonutils.logger.b.m1616a("peer may died: " + a2.f960b.substring(a2.f960b.lastIndexOf(64)));
                }
            }
            if ("com.xiaomi.xmsf".equals(str2)) {
                return;
            }
            com.xiaomi.channel.commonutils.logger.b.m1616a(String.format("[Bcst] notify packet(blob) arrival. %s,%s,%s", a2.g, a2.f957a, gfVar.e()));
            if (e.a(gfVar)) {
                bq.a().a(gfVar.e(), SystemClock.elapsedRealtime());
            }
            a(xMPushService, intent, a2);
        }
    }

    public void a(XMPushService xMPushService, String str, hh hhVar) {
        String str2;
        bf.b a2 = a(hhVar);
        if (a2 == null) {
            com.xiaomi.channel.commonutils.logger.b.d("error while notify channel closed! channel " + str + " not registered");
        } else if ("5".equalsIgnoreCase(str)) {
            this.f24713a.a(xMPushService, hhVar, a2);
        } else {
            String str3 = a2.f957a;
            if (hhVar instanceof hg) {
                str2 = "com.xiaomi.push.new_msg";
            } else if (hhVar instanceof hf) {
                str2 = "com.xiaomi.push.new_iq";
            } else if (!(hhVar instanceof hj)) {
                com.xiaomi.channel.commonutils.logger.b.d("unknown packet type, drop it");
                return;
            } else {
                str2 = "com.xiaomi.push.new_pres";
            }
            Intent intent = new Intent();
            intent.setAction(str2);
            intent.setPackage(str3);
            intent.putExtra("ext_chid", str);
            intent.putExtra("ext_packet", hhVar.mo2009a());
            intent.putExtra(bj.I, a2.i);
            intent.putExtra(bj.A, a2.h);
            com.xiaomi.channel.commonutils.logger.b.m1616a(String.format("[Bcst] notify packet arrival. %s,%s,%s", a2.g, a2.f957a, hhVar.j()));
            if ("3".equalsIgnoreCase(str)) {
                intent.putExtra(bj.v, hhVar.f469a);
                intent.putExtra(bj.w, System.currentTimeMillis());
            }
            a(xMPushService, intent, a2);
        }
    }
}
