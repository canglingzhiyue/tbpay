package com.xiaomi.push;

import mtopsdk.common.util.StringUtils;
import com.xiaomi.push.em;
import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.zip.Adler32;
import tb.riy;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes9.dex */
public class gh {

    /* renamed from: a  reason: collision with other field name */
    private gm f408a;

    /* renamed from: a  reason: collision with other field name */
    private InputStream f409a;

    /* renamed from: a  reason: collision with other field name */
    private volatile boolean f412a;

    /* renamed from: a  reason: collision with other field name */
    private byte[] f413a;

    /* renamed from: a  reason: collision with other field name */
    private ByteBuffer f410a = ByteBuffer.allocate(2048);
    private ByteBuffer b = ByteBuffer.allocate(4);

    /* renamed from: a  reason: collision with other field name */
    private Adler32 f411a = new Adler32();

    /* renamed from: a  reason: collision with root package name */
    private gk f24498a = new gk();

    /* JADX INFO: Access modifiers changed from: package-private */
    public gh(InputStream inputStream, gm gmVar) {
        this.f409a = new BufferedInputStream(inputStream);
        this.f408a = gmVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.nio.ByteBuffer a() {
        /*
            Method dump skipped, instructions count: 266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.gh.a():java.nio.ByteBuffer");
    }

    private void a(ByteBuffer byteBuffer, int i) {
        int position = byteBuffer.position();
        do {
            int read = this.f409a.read(byteBuffer.array(), position, i);
            if (read == -1) {
                throw new EOFException();
            }
            i -= read;
            position += read;
        } while (i > 0);
        byteBuffer.position(position);
    }

    private void c() {
        String str;
        StringBuilder sb;
        boolean z = false;
        this.f412a = false;
        gf m1973a = m1973a();
        if ("CONN".equals(m1973a.m1962a())) {
            em.f a2 = em.f.a(m1973a.m1966a());
            if (a2.mo1910a()) {
                this.f408a.a(a2.mo1910a());
                z = true;
            }
            if (a2.c()) {
                em.b mo1910a = a2.mo1910a();
                gf gfVar = new gf();
                gfVar.a("SYNC", "CONF");
                gfVar.a(mo1910a.mo1910a(), (String) null);
                this.f408a.a(gfVar);
            }
            com.xiaomi.channel.commonutils.logger.b.m1616a("[Slim] CONN: host = " + a2.mo1912b());
        }
        if (!z) {
            com.xiaomi.channel.commonutils.logger.b.m1616a("[Slim] Invalid CONN");
            throw new IOException("Invalid Connection");
        }
        this.f413a = this.f408a.mo1998a();
        while (!this.f412a) {
            gf m1973a2 = m1973a();
            long currentTimeMillis = System.currentTimeMillis();
            this.f408a.c();
            short m1964a = m1973a2.m1964a();
            if (m1964a != 1) {
                if (m1964a != 2) {
                    if (m1964a != 3) {
                        str = "[Slim] unknow blob type " + ((int) m1973a2.m1964a());
                        com.xiaomi.channel.commonutils.logger.b.m1616a(str);
                    } else {
                        try {
                            this.f408a.b(this.f24498a.a(m1973a2.m1966a(), this.f408a));
                        } catch (Exception e) {
                            e = e;
                            sb = new StringBuilder();
                            sb.append("[Slim] Parse packet from Blob chid=");
                            sb.append(m1973a2.a());
                            sb.append("; Id=");
                            sb.append(m1973a2.e());
                            sb.append(" failure:");
                            sb.append(e.getMessage());
                            str = sb.toString();
                            com.xiaomi.channel.commonutils.logger.b.m1616a(str);
                        }
                    }
                } else if ("SECMSG".equals(m1973a2.m1962a()) && ((m1973a2.a() == 2 || m1973a2.a() == 3) && StringUtils.isEmpty(m1973a2.m1969b()))) {
                    try {
                        hh a3 = this.f24498a.a(m1973a2.m1967a(com.xiaomi.push.service.bf.a().a(Integer.valueOf(m1973a2.a()).toString(), m1973a2.g()).h), this.f408a);
                        a3.f469a = currentTimeMillis;
                        this.f408a.b(a3);
                    } catch (Exception e2) {
                        e = e2;
                        sb = new StringBuilder();
                        sb.append("[Slim] Parse packet from Blob chid=");
                        sb.append(m1973a2.a());
                        sb.append("; Id=");
                        sb.append(m1973a2.e());
                        sb.append(" failure:");
                        sb.append(e.getMessage());
                        str = sb.toString();
                        com.xiaomi.channel.commonutils.logger.b.m1616a(str);
                    }
                }
            }
            this.f408a.a(m1973a2);
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    gf m1973a() {
        int i;
        try {
            ByteBuffer a2 = a();
            i = a2.position();
            try {
                a2.flip();
                a2.position(8);
                gf glVar = i == 8 ? new gl() : gf.a(a2.slice());
                com.xiaomi.channel.commonutils.logger.b.c("[Slim] Read {cmd=" + glVar.m1962a() + ";chid=" + glVar.a() + ";len=" + i + riy.BLOCK_END_STR);
                return glVar;
            } catch (IOException e) {
                e = e;
                if (i == 0) {
                    i = this.f410a.position();
                }
                StringBuilder sb = new StringBuilder();
                sb.append("[Slim] read Blob [");
                byte[] array = this.f410a.array();
                if (i > 128) {
                    i = 128;
                }
                sb.append(ae.a(array, 0, i));
                sb.append("] Err:");
                sb.append(e.getMessage());
                com.xiaomi.channel.commonutils.logger.b.m1616a(sb.toString());
                throw e;
            }
        } catch (IOException e2) {
            e = e2;
            i = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a  reason: collision with other method in class */
    public void m1974a() {
        try {
            c();
        } catch (IOException e) {
            if (!this.f412a) {
                throw e;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        this.f412a = true;
    }
}
