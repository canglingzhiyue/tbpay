package com.xiaomi.push;

import android.os.SystemClock;
import mtopsdk.common.util.StringUtils;
import com.taobao.android.change.app.icon.core.Constrant;
import com.xiaomi.push.em;
import com.xiaomi.push.gq;
import com.xiaomi.push.service.XMPushService;
import com.xiaomi.push.service.bf;
import tb.riy;

/* loaded from: classes9.dex */
public class gm extends gx {

    /* renamed from: a  reason: collision with root package name */
    private gh f24503a;

    /* renamed from: a  reason: collision with other field name */
    private gi f424a;

    /* renamed from: a  reason: collision with other field name */
    private Thread f425a;

    /* renamed from: a  reason: collision with other field name */
    private byte[] f426a;

    public gm(XMPushService xMPushService, gr grVar) {
        super(xMPushService, grVar);
    }

    private gf a(boolean z) {
        gl glVar = new gl();
        if (z) {
            glVar.a("1");
        }
        byte[] m1960a = gd.m1960a();
        if (m1960a != null) {
            em.j jVar = new em.j();
            jVar.a(a.a(m1960a));
            glVar.a(jVar.mo1910a(), (String) null);
        }
        return glVar;
    }

    private void h() {
        try {
            this.f24503a = new gh(this.f454a.getInputStream(), this);
            this.f424a = new gi(this.f454a.getOutputStream(), this);
            this.f425a = new gn(this, "Blob Reader (" + this.b + riy.BRACKET_END_STR);
            this.f425a.start();
        } catch (Exception e) {
            throw new hb("Error to init reader and writer", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaomi.push.gx, com.xiaomi.push.gq
    /* renamed from: a */
    public synchronized void mo1998a() {
        h();
        this.f424a.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaomi.push.gx
    public synchronized void a(int i, Exception exc) {
        if (this.f24503a != null) {
            this.f24503a.b();
            this.f24503a = null;
        }
        if (this.f424a != null) {
            try {
                this.f424a.b();
            } catch (Exception e) {
                com.xiaomi.channel.commonutils.logger.b.d("SlimConnection shutdown cause exception: " + e);
            }
            this.f424a = null;
        }
        this.f426a = null;
        super.a(i, exc);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(gf gfVar) {
        if (gfVar == null) {
            return;
        }
        if (com.xiaomi.push.service.e.a(gfVar)) {
            gf gfVar2 = new gf();
            gfVar2.a(gfVar.a());
            gfVar2.a("SYNC", "ACK_RTT");
            gfVar2.a(gfVar.e());
            gfVar2.b(gfVar.m1968b());
            gfVar2.a(gfVar.m1971c());
            this.f439a.a(new com.xiaomi.push.service.bu(this.f439a, gfVar2));
        }
        if (gfVar.m1965a()) {
            com.xiaomi.channel.commonutils.logger.b.m1616a("[Slim] RCV blob chid=" + gfVar.a() + "; id=" + gfVar.e() + "; errCode=" + gfVar.b() + "; err=" + gfVar.m1972c());
        }
        if (gfVar.a() == 0) {
            if ("PING".equals(gfVar.m1962a())) {
                com.xiaomi.channel.commonutils.logger.b.m1616a("[Slim] RCV ping id=" + gfVar.e());
                g();
            } else if (Constrant.ChangeStatus.CLOSE.equals(gfVar.m1962a())) {
                c(13, null);
            }
        }
        for (gq.a aVar : this.f443a.values()) {
            aVar.a(gfVar);
        }
    }

    @Override // com.xiaomi.push.gq
    @Deprecated
    public void a(hh hhVar) {
        b(gf.a(hhVar, (String) null));
    }

    @Override // com.xiaomi.push.gq
    public synchronized void a(bf.b bVar) {
        ge.a(bVar, c(), this);
    }

    @Override // com.xiaomi.push.gq
    public synchronized void a(String str, String str2) {
        ge.a(str, str2, this);
    }

    @Override // com.xiaomi.push.gx
    /* renamed from: a  reason: collision with other method in class */
    protected void mo1978a(boolean z) {
        if (this.f424a != null) {
            gf a2 = a(z);
            com.xiaomi.channel.commonutils.logger.b.m1616a("[Slim] SND ping id=" + a2.e());
            b(a2);
            f();
            return;
        }
        throw new hb("The BlobWriter is null.");
    }

    @Override // com.xiaomi.push.gx, com.xiaomi.push.gq
    public void a(gf[] gfVarArr) {
        for (gf gfVar : gfVarArr) {
            b(gfVar);
        }
    }

    @Override // com.xiaomi.push.gx, com.xiaomi.push.gq
    /* renamed from: a  reason: collision with other method in class */
    public boolean mo1998a() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.xiaomi.push.gx, com.xiaomi.push.gq
    /* renamed from: a */
    public synchronized byte[] mo1998a() {
        if (this.f426a == null && !StringUtils.isEmpty(this.f440a)) {
            String m2320a = com.xiaomi.push.service.bw.m2320a();
            this.f426a = com.xiaomi.push.service.bo.a(this.f440a.getBytes(), (this.f440a.substring(this.f440a.length() / 2) + m2320a.substring(m2320a.length() / 2)).getBytes());
        }
        return this.f426a;
    }

    @Override // com.xiaomi.push.gq
    public void b(gf gfVar) {
        gi giVar = this.f424a;
        if (giVar != null) {
            try {
                int a2 = giVar.a(gfVar);
                this.d = SystemClock.elapsedRealtime();
                String f = gfVar.f();
                if (!StringUtils.isEmpty(f)) {
                    hv.a(this.f439a, f, a2, false, true, System.currentTimeMillis());
                }
                for (gq.a aVar : this.f446b.values()) {
                    aVar.a(gfVar);
                }
                return;
            } catch (Exception e) {
                throw new hb(e);
            }
        }
        throw new hb("the writer is null.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(hh hhVar) {
        if (hhVar == null) {
            return;
        }
        for (gq.a aVar : this.f443a.values()) {
            aVar.a(hhVar);
        }
    }
}
