package com.xiaomi.push.service;

import mtopsdk.common.util.StringUtils;
import com.ali.user.mobile.rpc.ApiConstants;
import com.xiaomi.push.du;
import com.xiaomi.push.em;
import com.xiaomi.push.ft;
import com.xiaomi.push.gd;
import com.xiaomi.push.gf;
import com.xiaomi.push.gr;
import com.xiaomi.push.he;
import com.xiaomi.push.hf;
import com.xiaomi.push.hg;
import com.xiaomi.push.hh;
import com.xiaomi.push.hv;
import com.xiaomi.push.service.bf;
import java.util.Date;

/* loaded from: classes9.dex */
public class bd {

    /* renamed from: a  reason: collision with root package name */
    private XMPushService f24660a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bd(XMPushService xMPushService) {
        this.f24660a = xMPushService;
    }

    private void a(he heVar) {
        String c = heVar.c();
        if (!StringUtils.isEmpty(c)) {
            String[] split = c.split(";");
            com.xiaomi.push.co a2 = com.xiaomi.push.cs.a().a(gr.a(), false);
            if (a2 == null || split.length <= 0) {
                return;
            }
            a2.a(split);
            this.f24660a.a(20, (Exception) null);
            this.f24660a.a(true);
        }
    }

    private void b(hh hhVar) {
        bf.b a2;
        String l = hhVar.l();
        String k = hhVar.k();
        if (StringUtils.isEmpty(l) || StringUtils.isEmpty(k) || (a2 = bf.a().a(k, l)) == null) {
            return;
        }
        hv.a(this.f24660a, a2.f957a, hv.a(hhVar.m2007a()), true, true, System.currentTimeMillis());
    }

    private void c(gf gfVar) {
        bf.b a2;
        String g = gfVar.g();
        String num = Integer.toString(gfVar.a());
        if (StringUtils.isEmpty(g) || StringUtils.isEmpty(num) || (a2 = bf.a().a(num, g)) == null) {
            return;
        }
        hv.a(this.f24660a, a2.f957a, gfVar.c(), true, true, System.currentTimeMillis());
    }

    public void a(gf gfVar) {
        if (5 != gfVar.a()) {
            c(gfVar);
        }
        try {
            b(gfVar);
        } catch (Exception e) {
            com.xiaomi.channel.commonutils.logger.b.a("handle Blob chid = " + gfVar.a() + " cmd = " + gfVar.m1962a() + " packetid = " + gfVar.e() + " failure ", e);
        }
    }

    public void a(hh hhVar) {
        if (!"5".equals(hhVar.k())) {
            b(hhVar);
        }
        String k = hhVar.k();
        if (StringUtils.isEmpty(k)) {
            k = "1";
            hhVar.l(k);
        }
        if (k.equals("0")) {
            com.xiaomi.channel.commonutils.logger.b.m1616a("Received wrong packet with chid = 0 : " + hhVar.m2007a());
        }
        if (hhVar instanceof hf) {
            he a2 = hhVar.a("kick");
            if (a2 != null) {
                String l = hhVar.l();
                String a3 = a2.a("type");
                String a4 = a2.a("reason");
                com.xiaomi.channel.commonutils.logger.b.m1616a("kicked by server, chid=" + k + " res=" + bf.b.a(l) + " type=" + a3 + " reason=" + a4);
                if (!"wait".equals(a3)) {
                    this.f24660a.a(k, l, 3, a4, a3);
                    bf.a().m2307a(k, l);
                    return;
                }
                bf.b a5 = bf.a().a(k, l);
                if (a5 == null) {
                    return;
                }
                this.f24660a.a(a5);
                a5.a(bf.c.unbind, 3, 0, a4, a3);
                return;
            }
        } else if (hhVar instanceof hg) {
            hg hgVar = (hg) hhVar;
            if ("redir".equals(hgVar.b())) {
                he a6 = hgVar.a("hosts");
                if (a6 == null) {
                    return;
                }
                a(a6);
                return;
            }
        }
        this.f24660a.m2241b().a(this.f24660a, k, hhVar);
    }

    public void b(gf gfVar) {
        bf.c cVar;
        int i;
        int i2;
        String m1962a = gfVar.m1962a();
        if (gfVar.a() == 0) {
            if ("PING".equals(m1962a)) {
                byte[] m1966a = gfVar.m1966a();
                if (m1966a != null && m1966a.length > 0) {
                    em.j a2 = em.j.a(m1966a);
                    if (a2.mo1912b()) {
                        bw.a().a(a2.mo1910a());
                    }
                }
                if (!"com.xiaomi.xmsf".equals(this.f24660a.getPackageName())) {
                    this.f24660a.m2238a();
                }
                if ("1".equals(gfVar.e())) {
                    com.xiaomi.channel.commonutils.logger.b.m1616a("received a server ping");
                } else {
                    gd.b();
                }
                this.f24660a.m2242b();
                return;
            } else if (!"SYNC".equals(m1962a)) {
                if (!ApiConstants.ResultActionType.NOTIFY.equals(gfVar.m1962a())) {
                    return;
                }
                em.h a3 = em.h.a(gfVar.m1966a());
                com.xiaomi.channel.commonutils.logger.b.m1616a("notify by server err = " + a3.c() + " desc = " + a3.mo1910a());
                return;
            } else if ("CONF".equals(gfVar.m1969b())) {
                bw.a().a(em.b.a(gfVar.m1966a()));
                return;
            } else if (StringUtils.equals("U", gfVar.m1969b())) {
                em.k a4 = em.k.a(gfVar.m1966a());
                du.a(this.f24660a).a(a4.mo1910a(), a4.mo1912b(), new Date(a4.mo1910a()), new Date(a4.mo1912b()), a4.c() << 10, a4.e());
                gf gfVar2 = new gf();
                gfVar2.a(0);
                gfVar2.a(gfVar.m1962a(), "UCA");
                gfVar2.a(gfVar.e());
                XMPushService xMPushService = this.f24660a;
                xMPushService.a(new bu(xMPushService, gfVar2));
                return;
            } else if (!StringUtils.equals("P", gfVar.m1969b())) {
                return;
            } else {
                em.i a5 = em.i.a(gfVar.m1966a());
                gf gfVar3 = new gf();
                gfVar3.a(0);
                gfVar3.a(gfVar.m1962a(), "PCA");
                gfVar3.a(gfVar.e());
                em.i iVar = new em.i();
                if (a5.mo1910a()) {
                    iVar.a(a5.mo1910a());
                }
                gfVar3.a(iVar.mo1910a(), (String) null);
                XMPushService xMPushService2 = this.f24660a;
                xMPushService2.a(new bu(xMPushService2, gfVar3));
                com.xiaomi.channel.commonutils.logger.b.m1616a("ACK msgP: id = " + gfVar.e());
                return;
            }
        }
        String num = Integer.toString(gfVar.a());
        if ("SECMSG".equals(gfVar.m1962a())) {
            if (!gfVar.m1965a()) {
                this.f24660a.m2241b().a(this.f24660a, num, gfVar);
                return;
            }
            com.xiaomi.channel.commonutils.logger.b.m1616a("Recv SECMSG errCode = " + gfVar.b() + " errStr = " + gfVar.m1972c());
        } else if (!"BIND".equals(m1962a)) {
            if (!"KICK".equals(m1962a)) {
                return;
            }
            em.g a6 = em.g.a(gfVar.m1966a());
            String g = gfVar.g();
            String mo1910a = a6.mo1910a();
            String mo1912b = a6.mo1912b();
            com.xiaomi.channel.commonutils.logger.b.m1616a("kicked by server, chid=" + num + " res= " + bf.b.a(g) + " type=" + mo1910a + " reason=" + mo1912b);
            if (!"wait".equals(mo1910a)) {
                this.f24660a.a(num, g, 3, mo1912b, mo1910a);
                bf.a().m2307a(num, g);
                return;
            }
            bf.b a7 = bf.a().a(num, g);
            if (a7 == null) {
                return;
            }
            this.f24660a.a(a7);
            a7.a(bf.c.unbind, 3, 0, mo1912b, mo1910a);
        } else {
            em.d a8 = em.d.a(gfVar.m1966a());
            String g2 = gfVar.g();
            bf.b a9 = bf.a().a(num, g2);
            if (a9 == null) {
                return;
            }
            if (a8.mo1910a()) {
                com.xiaomi.channel.commonutils.logger.b.m1616a("SMACK: channel bind succeeded, chid=" + gfVar.a());
                a9.a(bf.c.binded, 1, 0, (String) null, (String) null);
                return;
            }
            String mo1910a2 = a8.mo1910a();
            if ("auth".equals(mo1910a2)) {
                if ("invalid-sig".equals(a8.mo1912b())) {
                    com.xiaomi.channel.commonutils.logger.b.m1616a("SMACK: bind error invalid-sig token = " + a9.c + " sec = " + a9.h);
                    gd.a(0, ft.BIND_INVALID_SIG.a(), 1, null, 0);
                }
                cVar = bf.c.unbind;
                i = 1;
                i2 = 5;
            } else if (!"cancel".equals(mo1910a2)) {
                if ("wait".equals(mo1910a2)) {
                    this.f24660a.a(a9);
                    a9.a(bf.c.unbind, 1, 7, a8.mo1912b(), mo1910a2);
                }
                com.xiaomi.channel.commonutils.logger.b.m1616a("SMACK: channel bind failed, chid=" + num + " reason=" + a8.mo1912b());
            } else {
                cVar = bf.c.unbind;
                i = 1;
                i2 = 7;
            }
            a9.a(cVar, i, i2, a8.mo1912b(), mo1910a2);
            bf.a().m2307a(num, g2);
            com.xiaomi.channel.commonutils.logger.b.m1616a("SMACK: channel bind failed, chid=" + num + " reason=" + a8.mo1912b());
        }
    }
}
