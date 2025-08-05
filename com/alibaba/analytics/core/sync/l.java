package com.alibaba.analytics.core.sync;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import org.android.spdy.AccsSSLCallback;
import org.android.spdy.SessionCb;
import org.android.spdy.SessionExtraCb;
import org.android.spdy.SessionInfo;
import org.android.spdy.SpdyAgent;
import org.android.spdy.SpdyErrorException;
import org.android.spdy.SpdyProtocol;
import org.android.spdy.SpdySession;
import org.android.spdy.SpdySessionKind;
import org.android.spdy.SpdyVersion;
import org.android.spdy.SuperviseConnectInfo;
import tb.aob;
import tb.apj;
import tb.apr;
import tb.aqi;
import tb.kge;

/* loaded from: classes.dex */
public class l {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static int f2105a;
    private static final Object b;
    private static final Object c;
    private static int d;
    private static int e;
    private static SpdySession f;
    private static ByteArrayOutputStream g;
    private static long h;
    private static long i;
    private static byte[] j;
    private static boolean k;
    private static boolean l;

    public static /* synthetic */ int a(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a821938e", new Object[]{new Integer(i2)})).intValue();
        }
        d = i2;
        return i2;
    }

    public static /* synthetic */ long a(long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a8219750", new Object[]{new Long(j2)})).longValue();
        }
        i = j2;
        return j2;
    }

    public static /* synthetic */ ByteArrayOutputStream a(ByteArrayOutputStream byteArrayOutputStream) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ByteArrayOutputStream) ipChange.ipc$dispatch("7ebfb29e", new Object[]{byteArrayOutputStream});
        }
        g = byteArrayOutputStream;
        return byteArrayOutputStream;
    }

    public static /* synthetic */ void a(SpdySession spdySession) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b3a35a5", new Object[]{spdySession});
        } else {
            c(spdySession);
        }
    }

    public static /* synthetic */ long b(long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a9d66fef", new Object[]{new Long(j2)})).longValue();
        }
        h = j2;
        return j2;
    }

    public static /* synthetic */ long b(byte[] bArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("90ffa264", new Object[]{bArr})).longValue() : c(bArr);
    }

    public static /* synthetic */ SpdySession b(SpdySession spdySession) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SpdySession) ipChange.ipc$dispatch("eea94aad", new Object[]{spdySession});
        }
        f = spdySession;
        return spdySession;
    }

    public static /* synthetic */ SpdySession d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SpdySession) ipChange.ipc$dispatch("126fd748", new Object[0]) : f;
    }

    public static /* synthetic */ ByteArrayOutputStream e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ByteArrayOutputStream) ipChange.ipc$dispatch("67c51e27", new Object[0]) : g;
    }

    public static /* synthetic */ long f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5b2e1e1", new Object[0])).longValue() : i;
    }

    public static /* synthetic */ long g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5c0f962", new Object[0])).longValue() : h;
    }

    public static /* synthetic */ int h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5cf10e2", new Object[0])).intValue() : d;
    }

    public static /* synthetic */ void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[0]);
        } else {
            l();
        }
    }

    public static /* synthetic */ void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[0]);
        } else {
            m();
        }
    }

    public static /* synthetic */ Object k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("fe6d5200", new Object[0]) : c;
    }

    static {
        kge.a(1182938553);
        f2105a = 0;
        b = new Object();
        c = new Object();
        d = -1;
        e = 0;
        f = null;
        g = null;
        h = 0L;
        i = 0L;
        j = null;
        k = true;
        l = false;
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : f == null && (k || aob.a().g());
    }

    public static b a(byte[] bArr) {
        long currentTimeMillis;
        SessionInfo sessionInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("5fca81cc", new Object[]{bArr});
        }
        apr.c();
        b bVar = new b();
        synchronized (c) {
            j = bArr;
            e = 0;
            bVar.d = j.length;
        }
        synchronized (b) {
            if (g != null) {
                try {
                    g.close();
                } catch (IOException unused) {
                }
            }
            g = null;
            h = 0L;
            i = 0L;
            long currentTimeMillis2 = System.currentTimeMillis();
            d = -1;
            try {
                if (a()) {
                    SpdyAgent spdyAgent = SpdyAgent.getInstance(aob.a().k(), SpdyVersion.SPDY3, SpdySessionKind.NONE_SESSION);
                    if (k.a().b()) {
                        spdyAgent.setAccsSslCallback(new AccsSSLCallback() { // from class: com.alibaba.analytics.core.sync.l.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // org.android.spdy.AccsSSLCallback
                            public byte[] getSSLPublicKey(int i2, byte[] bArr2) {
                                IpChange ipChange2 = $ipChange;
                                return ipChange2 instanceof IpChange ? (byte[]) ipChange2.ipc$dispatch("13408d1a", new Object[]{this, new Integer(i2), bArr2}) : k.a().a(16, SpdyProtocol.TNET_PUBKEY_SG_KEY, bArr2);
                            }
                        });
                    }
                    h b2 = j.a().b();
                    String a2 = b2.a();
                    int b3 = b2.b();
                    apr.b("TnetUtil", "host", a2, "port", Integer.valueOf(b3));
                    SessionInfo sessionInfo2 = new SessionInfo(a2, b3, null, null, 0, null, new a(a2), SpdyProtocol.SSSL_0RTT_CUSTOM);
                    if (k.a().b()) {
                        sessionInfo = sessionInfo2;
                        sessionInfo.setPubKeySeqNum(8);
                    } else {
                        sessionInfo = sessionInfo2;
                        sessionInfo.setPubKeySeqNum(9);
                    }
                    sessionInfo.setConnectionTimeoutMs(10000);
                    synchronized (c) {
                        long currentTimeMillis3 = System.currentTimeMillis();
                        f = spdyAgent.createSession(sessionInfo);
                        bVar.b = System.currentTimeMillis() - currentTimeMillis3;
                        l = false;
                    }
                    apr.b("TnetUtil", "createSession");
                    b.wait(60000L);
                } else if (f != null && (!k || aob.a().g())) {
                    c(f);
                    b.wait(60000L);
                } else {
                    l();
                }
            } catch (Exception e2) {
                l();
                apr.e("TnetUtil", "CreateSession Exception", e2);
            }
            currentTimeMillis = System.currentTimeMillis() - currentTimeMillis2;
            if (currentTimeMillis >= 60000) {
                l();
                apr.c("TnetUtil", "WAIT_TIMEOUT");
            }
        }
        com.alibaba.analytics.core.sync.a.a(e);
        synchronized (c) {
            j = null;
            e = 0;
        }
        bVar.f2097a = d;
        bVar.c = currentTimeMillis;
        bVar.e = com.alibaba.analytics.core.sync.a.f2096a;
        com.alibaba.analytics.core.sync.a.f2096a = null;
        f2105a = d;
        apr.b("TnetUtil", "PostData isSuccess", Boolean.valueOf(bVar.a()), "errCode", Integer.valueOf(bVar.f2097a), "rt", Long.valueOf(bVar.c));
        return bVar;
    }

    private static void c(SpdySession spdySession) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ebb527", new Object[]{spdySession});
            return;
        }
        synchronized (c) {
            while (spdySession == f && f != null && j != null && j.length > e) {
                try {
                    if (j.length - e > 131072) {
                        spdySession.sendCustomControlFrame(-1, -1, -1, 131072, apj.b(j, e, 131072));
                        e += 131072;
                    } else {
                        int length = j.length - e;
                        if (length > 0) {
                            spdySession.sendCustomControlFrame(-1, -1, -1, length, apj.b(j, e, length));
                            e += length;
                        }
                    }
                } catch (SpdyErrorException e2) {
                    apr.e("TnetUtil", "SpdyErrorException", e2);
                    if (e2.SpdyErrorGetCode() != -3848) {
                        d = e2.SpdyErrorGetCode();
                        l();
                    }
                    return;
                }
            }
        }
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
            return;
        }
        apr.c();
        synchronized (c) {
            if (f != null) {
                f.closeSession();
            }
            k = true;
            f = null;
            com.alibaba.analytics.core.sync.a.c();
            aqi.a();
        }
        m();
    }

    private static void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[0]);
            return;
        }
        apr.c();
        synchronized (c) {
            if (f != null) {
                f.closeSession();
            }
            f = null;
            com.alibaba.analytics.core.sync.a.c();
            aqi.a();
        }
        m();
    }

    private static void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[0]);
            return;
        }
        synchronized (b) {
            b.notifyAll();
        }
    }

    /* loaded from: classes.dex */
    public static class a implements SessionCb, SessionExtraCb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private byte[] f2106a;
        private String b;

        static {
            kge.a(1497005899);
            kge.a(-1245751677);
            kge.a(1071662315);
        }

        @Override // org.android.spdy.SessionCb
        public void bioPingRecvCallback(SpdySession spdySession, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8b6dabda", new Object[]{this, spdySession, new Integer(i)});
            }
        }

        @Override // org.android.spdy.SessionCb
        public void spdyCustomControlFrameFailCallback(SpdySession spdySession, Object obj, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7576ccd6", new Object[]{this, spdySession, obj, new Integer(i), new Integer(i2)});
            }
        }

        @Override // org.android.spdy.SessionCb
        public void spdyPingRecvCallback(SpdySession spdySession, long j, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f1c4fe4d", new Object[]{this, spdySession, new Long(j), obj});
            }
        }

        public a(String str) {
            this.b = "accs_ssl_key2_" + str;
        }

        @Override // org.android.spdy.SessionCb
        public void spdySessionConnectCB(SpdySession spdySession, SuperviseConnectInfo superviseConnectInfo) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9d2bcf0e", new Object[]{this, spdySession, superviseConnectInfo});
            } else if (spdySession != l.d()) {
            } else {
                l.a(spdySession);
            }
        }

        @Override // org.android.spdy.SessionCb
        public void spdyCustomControlFrameRecvCallback(SpdySession spdySession, Object obj, int i, int i2, int i3, int i4, byte[] bArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a1cc5fc5", new Object[]{this, spdySession, obj, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), bArr});
            } else if (spdySession != l.d()) {
                apr.c("TnetUtil", "[spdyCustomControlFrameRecvCallback] session != spdySessionUT");
            } else {
                if (l.e() == null) {
                    l.a(new ByteArrayOutputStream(1024));
                    l.a(l.b(bArr));
                }
                if (l.f() != -1) {
                    try {
                        l.e().write(bArr);
                    } catch (IOException unused) {
                    }
                    l.b(l.g() + bArr.length);
                    if (l.f() != l.g() - 8) {
                        return;
                    }
                    try {
                        l.e().flush();
                    } catch (IOException unused2) {
                    }
                    byte[] byteArray = l.e().toByteArray();
                    try {
                        l.e().close();
                    } catch (IOException unused3) {
                    }
                    l.a(com.alibaba.analytics.core.sync.a.a(byteArray));
                    if (l.h() != 0) {
                        l.i();
                    }
                    l.j();
                    return;
                }
                l.a(-1);
                l.i();
                l.j();
            }
        }

        @Override // org.android.spdy.SessionCb
        public void spdySessionFailedError(SpdySession spdySession, int i, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("30d5bd4", new Object[]{this, spdySession, new Integer(i), obj});
            } else if (spdySession != l.d()) {
            } else {
                l.a(i);
                l.i();
            }
        }

        @Override // org.android.spdy.SessionCb
        public void spdySessionCloseCallback(SpdySession spdySession, Object obj, SuperviseConnectInfo superviseConnectInfo, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f76348e5", new Object[]{this, spdySession, obj, superviseConnectInfo, new Integer(i)});
            } else if (spdySession != l.d()) {
            } else {
                l.a(i);
                if (com.alibaba.analytics.core.config.d.a()) {
                    synchronized (l.k()) {
                        l.b((SpdySession) null);
                    }
                    return;
                }
                l.i();
            }
        }

        @Override // org.android.spdy.SessionCb
        public byte[] getSSLMeta(SpdySession spdySession) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (byte[]) ipChange.ipc$dispatch("c9362ffe", new Object[]{this, spdySession});
            }
            if (k.a().b()) {
                byte[] a2 = k.a().a(this.b);
                return a2 != null ? a2 : new byte[0];
            }
            return this.f2106a;
        }

        @Override // org.android.spdy.SessionCb
        public int putSSLMeta(SpdySession spdySession, byte[] bArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("8ce64c60", new Object[]{this, spdySession, bArr})).intValue();
            }
            if (k.a().b()) {
                return a(bArr);
            }
            this.f2106a = bArr;
            return 0;
        }

        @Override // org.android.spdy.SessionExtraCb
        public void spdySessionOnWritable(SpdySession spdySession, Object obj, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4f5c8a40", new Object[]{this, spdySession, obj, new Integer(i)});
            } else if (spdySession != l.d()) {
            } else {
                l.a(spdySession);
            }
        }

        private int a(byte[] bArr) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5c196722", new Object[]{this, bArr})).intValue() : (bArr == null || k.a().a(this.b, bArr) == 0) ? -1 : 0;
        }
    }

    private static long c(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c5e5dda5", new Object[]{bArr})).longValue();
        }
        if (bArr != null && bArr.length >= 12) {
            return apj.a(bArr, 1, 3);
        }
        return -1L;
    }

    public static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[0]);
            return;
        }
        synchronized (c) {
            if (f == null) {
                aqi.a();
                com.alibaba.analytics.core.sync.a.b();
                k = true;
            } else {
                k = false;
            }
        }
    }
}
