package com.xiaomi.push;

import android.os.Build;
import com.taobao.android.change.app.icon.core.Constrant;
import com.xiaomi.push.em;
import java.io.BufferedOutputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.Locale;
import java.util.TimeZone;
import java.util.zip.Adler32;
import tb.riy;

/* loaded from: classes9.dex */
public class gi {

    /* renamed from: a  reason: collision with root package name */
    private int f24499a;

    /* renamed from: a  reason: collision with other field name */
    private gm f414a;

    /* renamed from: a  reason: collision with other field name */
    private OutputStream f415a;

    /* renamed from: a  reason: collision with other field name */
    private byte[] f418a;
    private int b;

    /* renamed from: a  reason: collision with other field name */
    ByteBuffer f416a = ByteBuffer.allocate(2048);

    /* renamed from: b  reason: collision with other field name */
    private ByteBuffer f419b = ByteBuffer.allocate(4);

    /* renamed from: a  reason: collision with other field name */
    private Adler32 f417a = new Adler32();

    /* JADX INFO: Access modifiers changed from: package-private */
    public gi(OutputStream outputStream, gm gmVar) {
        this.f415a = new BufferedOutputStream(outputStream);
        this.f414a = gmVar;
        TimeZone timeZone = TimeZone.getDefault();
        this.f24499a = timeZone.getRawOffset() / 3600000;
        this.b = timeZone.useDaylightTime() ? 1 : 0;
    }

    public int a(gf gfVar) {
        int c = gfVar.c();
        if (c > 32768) {
            com.xiaomi.channel.commonutils.logger.b.m1616a("Blob size=" + c + " should be less than 32768 Drop blob chid=" + gfVar.a() + " id=" + gfVar.e());
            return 0;
        }
        this.f416a.clear();
        int i = c + 8 + 4;
        if (i > this.f416a.capacity() || this.f416a.capacity() > 4096) {
            this.f416a = ByteBuffer.allocate(i);
        }
        this.f416a.putShort((short) -15618);
        this.f416a.putShort((short) 5);
        this.f416a.putInt(c);
        int position = this.f416a.position();
        this.f416a = gfVar.mo1963a(this.f416a);
        if (!"CONN".equals(gfVar.m1962a())) {
            if (this.f418a == null) {
                this.f418a = this.f414a.mo1998a();
            }
            com.xiaomi.push.service.bo.a(this.f418a, this.f416a.array(), true, position, c);
        }
        this.f417a.reset();
        this.f417a.update(this.f416a.array(), 0, this.f416a.position());
        this.f419b.putInt(0, (int) this.f417a.getValue());
        this.f415a.write(this.f416a.array(), 0, this.f416a.position());
        this.f415a.write(this.f419b.array(), 0, 4);
        this.f415a.flush();
        int position2 = this.f416a.position() + 4;
        com.xiaomi.channel.commonutils.logger.b.c("[Slim] Wrote {cmd=" + gfVar.m1962a() + ";chid=" + gfVar.a() + ";len=" + position2 + riy.BLOCK_END_STR);
        return position2;
    }

    public void a() {
        em.e eVar = new em.e();
        eVar.a(106);
        eVar.a(Build.MODEL);
        eVar.b(r.m2213a());
        eVar.c(com.xiaomi.push.service.bw.m2320a());
        eVar.b(48);
        eVar.d(this.f414a.b());
        eVar.e(this.f414a.mo1998a());
        eVar.f(Locale.getDefault().toString());
        eVar.c(Build.VERSION.SDK_INT);
        eVar.d(g.a(this.f414a.mo1998a(), "com.xiaomi.xmsf"));
        byte[] m1994a = this.f414a.mo1998a().m1994a();
        if (m1994a != null) {
            eVar.a(em.b.a(m1994a));
        }
        gf gfVar = new gf();
        gfVar.a(0);
        gfVar.a("CONN", (String) null);
        gfVar.a(0L, "xiaomi.com", null);
        gfVar.a(eVar.mo1910a(), (String) null);
        a(gfVar);
        com.xiaomi.channel.commonutils.logger.b.m1616a("[slim] open conn: andver=" + Build.VERSION.SDK_INT + " sdk=48 tz=" + this.f24499a + ":" + this.b + " Model=" + Build.MODEL + " os=" + Build.VERSION.INCREMENTAL);
    }

    public void b() {
        gf gfVar = new gf();
        gfVar.a(Constrant.ChangeStatus.CLOSE, (String) null);
        a(gfVar);
        this.f415a.close();
    }
}
