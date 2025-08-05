package com.xiaomi.push.service;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import com.xiaomi.push.cs;
import com.xiaomi.push.el;
import com.xiaomi.push.em;
import com.xiaomi.push.ft;
import com.xiaomi.push.gb;
import com.xiaomi.push.gd;
import com.xiaomi.push.gq;
import com.xiaomi.push.hs;
import com.xiaomi.push.service.bw;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes9.dex */
public class bk extends bw.a implements cs.a {

    /* renamed from: a  reason: collision with root package name */
    private long f24671a;

    /* renamed from: a  reason: collision with other field name */
    private XMPushService f966a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes9.dex */
    public static class a implements cs.b {
        a() {
        }

        @Override // com.xiaomi.push.cs.b
        public String a(String str) {
            Uri.Builder buildUpon = Uri.parse(str).buildUpon();
            buildUpon.appendQueryParameter("sdkver", String.valueOf(48));
            buildUpon.appendQueryParameter("osver", String.valueOf(Build.VERSION.SDK_INT));
            buildUpon.appendQueryParameter("os", hs.a(Build.MODEL + ":" + Build.VERSION.INCREMENTAL));
            buildUpon.appendQueryParameter("mi", String.valueOf(com.xiaomi.push.r.a()));
            String builder = buildUpon.toString();
            com.xiaomi.channel.commonutils.logger.b.c("fetch bucket from : " + builder);
            URL url = new URL(builder);
            int port = url.getPort() == -1 ? 80 : url.getPort();
            try {
                long currentTimeMillis = System.currentTimeMillis();
                String a2 = com.xiaomi.push.bg.a(com.xiaomi.push.r.m2212a(), url);
                long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                gd.a(url.getHost() + ":" + port, (int) currentTimeMillis2, null);
                return a2;
            } catch (IOException e) {
                gd.a(url.getHost() + ":" + port, -1, e);
                throw e;
            }
        }
    }

    /* loaded from: classes9.dex */
    static class b extends com.xiaomi.push.cs {
        protected b(Context context, com.xiaomi.push.cr crVar, cs.b bVar, String str) {
            super(context, crVar, bVar, str);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xiaomi.push.cs
        public String a(ArrayList<String> arrayList, String str, String str2, boolean z) {
            try {
                if (gb.m1954a().m1959a()) {
                    str2 = bw.m2320a();
                }
                return super.a(arrayList, str, str2, z);
            } catch (IOException e) {
                gd.a(0, ft.GSLB_ERR.a(), 1, null, com.xiaomi.push.bg.c(f24406a) ? 1 : 0);
                throw e;
            }
        }
    }

    bk(XMPushService xMPushService) {
        this.f966a = xMPushService;
    }

    public static void a(XMPushService xMPushService) {
        bk bkVar = new bk(xMPushService);
        bw.a().a(bkVar);
        synchronized (com.xiaomi.push.cs.class) {
            com.xiaomi.push.cs.a(bkVar);
            com.xiaomi.push.cs.a(xMPushService, null, new a(), "0", "push", "2.2");
        }
    }

    @Override // com.xiaomi.push.cs.a
    public com.xiaomi.push.cs a(Context context, com.xiaomi.push.cr crVar, cs.b bVar, String str) {
        return new b(context, crVar, bVar, str);
    }

    @Override // com.xiaomi.push.service.bw.a
    public void a(el.a aVar) {
    }

    @Override // com.xiaomi.push.service.bw.a
    public void a(em.b bVar) {
        com.xiaomi.push.co b2;
        if (!bVar.mo1912b() || !bVar.mo1910a() || System.currentTimeMillis() - this.f24671a <= 3600000) {
            return;
        }
        com.xiaomi.channel.commonutils.logger.b.m1616a("fetch bucket :" + bVar.mo1910a());
        this.f24671a = System.currentTimeMillis();
        com.xiaomi.push.cs a2 = com.xiaomi.push.cs.a();
        a2.m1793a();
        a2.m1796b();
        gq m2236a = this.f966a.m2236a();
        if (m2236a == null || (b2 = a2.b(m2236a.m1984a().c())) == null) {
            return;
        }
        ArrayList<String> m1780a = b2.m1780a();
        boolean z = true;
        Iterator<String> it = m1780a.iterator();
        while (true) {
            if (it.hasNext()) {
                if (it.next().equals(m2236a.m1985a())) {
                    z = false;
                    break;
                }
            } else {
                break;
            }
        }
        if (!z || m1780a.isEmpty()) {
            return;
        }
        com.xiaomi.channel.commonutils.logger.b.m1616a("bucket changed, force reconnect");
        this.f966a.a(0, (Exception) null);
        this.f966a.a(false);
    }
}
