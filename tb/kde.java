package tb;

import android.content.Context;
import anet.channel.util.ALog;
import anetwork.channel.Header;
import anetwork.channel.Request;
import anetwork.channel.Response;
import anetwork.channel.aidl.NetworkResponse;
import anetwork.channel.entity.RequestImpl;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.aws.a.b;
import com.taobao.login4android.constants.LoginConstants;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Collections;
import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import mtopsdk.network.impl.ResponseProtocolType;
import org.android.spdy.SessionCb;
import org.android.spdy.SessionExtraCb;
import org.android.spdy.SessionInfo;
import org.android.spdy.SpdyAgent;
import org.android.spdy.SpdyErrorException;
import org.android.spdy.SpdySession;
import org.android.spdy.SpdySessionKind;
import org.android.spdy.SpdyVersion;
import org.android.spdy.SuperviseConnectInfo;

/* loaded from: classes6.dex */
public class kde implements SessionCb, SessionExtraCb, kcs {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final String f29967a;
    private static final ThreadFactory b;
    private static final BlockingQueue<Runnable> c;
    private static final Executor d;
    private Context f;
    private RequestImpl g;
    private kdf h;
    private SpdyAgent i;
    private SessionInfo j;
    private SpdySession k;
    private StringBuilder l;
    private volatile int n;
    private boolean o;
    private int p;
    private String m = kdg.a();
    private final Queue<ByteBuffer> e = new ArrayDeque();

    @Override // org.android.spdy.SessionCb
    public void bioPingRecvCallback(SpdySession spdySession, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b6dabda", new Object[]{this, spdySession, new Integer(i)});
        }
    }

    @Override // org.android.spdy.SessionCb
    public int putSSLMeta(SpdySession spdySession, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8ce64c60", new Object[]{this, spdySession, bArr})).intValue();
        }
        return 0;
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

    public static /* synthetic */ Context a(kde kdeVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("c3d22c24", new Object[]{kdeVar}) : kdeVar.f;
    }

    public static /* synthetic */ SessionInfo a(kde kdeVar, SessionInfo sessionInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SessionInfo) ipChange.ipc$dispatch("3550138a", new Object[]{kdeVar, sessionInfo});
        }
        kdeVar.j = sessionInfo;
        return sessionInfo;
    }

    public static /* synthetic */ SpdyAgent a(kde kdeVar, SpdyAgent spdyAgent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SpdyAgent) ipChange.ipc$dispatch("276554aa", new Object[]{kdeVar, spdyAgent});
        }
        kdeVar.i = spdyAgent;
        return spdyAgent;
    }

    public static /* synthetic */ SpdySession a(kde kdeVar, SpdySession spdySession) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SpdySession) ipChange.ipc$dispatch("f6fa578a", new Object[]{kdeVar, spdySession});
        }
        kdeVar.k = spdySession;
        return spdySession;
    }

    public static /* synthetic */ void a(kde kdeVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a970757", new Object[]{kdeVar, new Integer(i)});
        } else {
            kdeVar.a(i);
        }
    }

    public static /* synthetic */ void a(kde kdeVar, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("632fa961", new Object[]{kdeVar, new Integer(i), str});
        } else {
            kdeVar.a(i, str);
        }
    }

    public static /* synthetic */ void a(kde kdeVar, ByteBuffer byteBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9f707a5", new Object[]{kdeVar, byteBuffer});
        } else {
            kdeVar.a(byteBuffer);
        }
    }

    public static /* synthetic */ boolean a(kde kdeVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2a97472c", new Object[]{kdeVar, new Boolean(z)})).booleanValue();
        }
        kdeVar.o = z;
        return z;
    }

    public static /* synthetic */ boolean a(kde kdeVar, byte[] bArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("28526af7", new Object[]{kdeVar, bArr})).booleanValue() : kdeVar.a(bArr);
    }

    public static /* synthetic */ RequestImpl b(kde kdeVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RequestImpl) ipChange.ipc$dispatch("6c90a64d", new Object[]{kdeVar}) : kdeVar.g;
    }

    public static /* synthetic */ void b(kde kdeVar, ByteBuffer byteBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1716cbc4", new Object[]{kdeVar, byteBuffer});
        } else {
            kdeVar.b(byteBuffer);
        }
    }

    public static /* synthetic */ SessionInfo c(kde kdeVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SessionInfo) ipChange.ipc$dispatch("f9834905", new Object[]{kdeVar}) : kdeVar.j;
    }

    public static /* synthetic */ SpdyAgent d(kde kdeVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SpdyAgent) ipChange.ipc$dispatch("8289535", new Object[]{kdeVar}) : kdeVar.i;
    }

    public static /* synthetic */ StringBuilder e(kde kdeVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (StringBuilder) ipChange.ipc$dispatch("103bc34b", new Object[]{kdeVar}) : kdeVar.l;
    }

    public static /* synthetic */ String f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("50938a53", new Object[0]) : f29967a;
    }

    public static /* synthetic */ SpdySession f(kde kdeVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SpdySession) ipChange.ipc$dispatch("ab515642", new Object[]{kdeVar}) : kdeVar.k;
    }

    public static /* synthetic */ kdf g(kde kdeVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (kdf) ipChange.ipc$dispatch("d9388987", new Object[]{kdeVar}) : kdeVar.h;
    }

    public static /* synthetic */ boolean h(kde kdeVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7670beb7", new Object[]{kdeVar})).booleanValue() : kdeVar.o;
    }

    public static /* synthetic */ int i(kde kdeVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("64f3c527", new Object[]{kdeVar})).intValue() : kdeVar.p;
    }

    public static /* synthetic */ Queue j(kde kdeVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Queue) ipChange.ipc$dispatch("3bfa3955", new Object[]{kdeVar}) : kdeVar.e;
    }

    static {
        kge.a(2060902173);
        kge.a(-1525897401);
        kge.a(-1245751677);
        kge.a(1071662315);
        f29967a = kde.class.getSimpleName();
        b = new ThreadFactory() { // from class: tb.kde.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            private final AtomicInteger f29968a = new AtomicInteger(1);

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
                }
                return new Thread(runnable, "WebSocketImpl:" + this.f29968a.getAndIncrement());
            }
        };
        c = new LinkedBlockingQueue(128);
        d = new ThreadPoolExecutor(1, 1, 10L, TimeUnit.SECONDS, c, b);
    }

    public kde(Context context, Request request, kdf kdfVar) {
        this.f = context;
        this.h = kdfVar;
        this.g = (RequestImpl) request;
        e();
    }

    @Override // tb.kcr
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        a(1000, "client call for close…", false);
        return true;
    }

    @Override // tb.kcr
    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue() : str != null && b(kct.a().a(str, true));
    }

    @Override // tb.kcr
    public int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : this.n;
    }

    public void a(kcw kcwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0d5a859", new Object[]{this, kcwVar});
        } else {
            a(Collections.singletonList(kcwVar));
        }
    }

    public void a(Collection<kcw> collection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2847c19", new Object[]{this, collection});
        } else {
            b(collection);
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        synchronized (this) {
            if (this.n != 4 && this.n != 0) {
                return;
            }
            a(1);
            d.execute(new Runnable() { // from class: tb.kde.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    int port;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        kde.a(kde.this, SpdyAgent.getInstance(kde.a(kde.this), SpdyVersion.SPDY3, SpdySessionKind.NONE_SESSION));
                        kde kdeVar = kde.this;
                        String host = kde.b(kde.this).getURI().getHost();
                        if (kde.b(kde.this).getURI().getPort() == -1) {
                            if (!"https".equals(kde.b(kde.this).getURI().getScheme()) && !"wss".equals(kde.b(kde.this).getURI().getScheme())) {
                                port = 80;
                            }
                            port = 443;
                        } else {
                            port = kde.b(kde.this).getURI().getPort();
                        }
                        kde.a(kdeVar, new SessionInfo(host, port, null, null, 0, null, kde.this, 16));
                        kde.c(kde.this).setConnectionTimeoutMs(10000);
                        kde.a(kde.this, kde.d(kde.this).createSession(kde.c(kde.this)));
                        kde.f(kde.this).sendCustomControlFrame(-1, -1, -1, kde.e(kde.this).length(), kde.e(kde.this).toString().getBytes());
                    } catch (Exception e) {
                        ALog.e(kde.f(), "connect execute error", null, e, new Object[0]);
                        kde.a(kde.this, 4);
                        kde.g(kde.this).a(kde.this, e, (Response) null);
                    }
                }
            });
        }
    }

    public void a(final int i, final String str, final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd351acf", new Object[]{this, new Integer(i), str, new Boolean(z)});
            return;
        }
        ALog.d(f29967a, str, null, new Object[0]);
        synchronized (this) {
            if (this.n != 3 && this.n != 4) {
                final boolean z2 = this.n == 2;
                a(3);
                d.execute(new Runnable() { // from class: tb.kde.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else if (z2) {
                            if (!z) {
                                kcz kczVar = new kcz();
                                kczVar.a(str);
                                kczVar.b(i);
                                kczVar.a();
                                kde.this.a(kczVar);
                            }
                            kde.g(kde.this);
                            kde.a(kde.this, i, str);
                        } else {
                            int i2 = i;
                            if (i2 == -3) {
                                kde.a(kde.this, -3, str);
                            } else if (i2 == 1002) {
                                kde.a(kde.this, i2, str);
                            } else {
                                kde.a(kde.this, -1, str);
                            }
                        }
                    }
                });
            }
        }
    }

    @Override // org.android.spdy.SessionCb
    public void spdySessionConnectCB(SpdySession spdySession, SuperviseConnectInfo superviseConnectInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d2bcf0e", new Object[]{this, spdySession, superviseConnectInfo});
        } else {
            ALog.d(f29967a, "session connect", null, new Object[0]);
        }
    }

    @Override // org.android.spdy.SessionCb
    public void spdyCustomControlFrameRecvCallback(SpdySession spdySession, Object obj, int i, int i2, int i3, int i4, final byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1cc5fc5", new Object[]{this, spdySession, obj, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), bArr});
            return;
        }
        ALog.d(f29967a, "session recv", null, new Object[0]);
        d.execute(new Runnable() { // from class: tb.kde.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (kde.h(kde.this)) {
                    kde.a(kde.this, ByteBuffer.wrap(bArr));
                } else {
                    byte[] a2 = kdg.a(bArr);
                    byte[] b2 = kdg.b(bArr);
                    if (b2 == null) {
                        kde kdeVar = kde.this;
                        kdeVar.a(1006, new String(bArr) + "\nthe server's shake hands response not correct, can't open websocket session", false);
                        return;
                    }
                    kde kdeVar2 = kde.this;
                    kde.a(kdeVar2, kde.a(kdeVar2, b2));
                    if (!kde.h(kde.this)) {
                        kde kdeVar3 = kde.this;
                        kdeVar3.a(1006, new String(b2) + "\nthe server's shake hands response not correct, can't open websocket session", false);
                        return;
                    }
                    NetworkResponse networkResponse = new NetworkResponse();
                    networkResponse.setBytedata(b2);
                    networkResponse.setStatusCode(kde.i(kde.this));
                    kde.a(kde.this, 2);
                    kde.g(kde.this).a(kde.this, networkResponse);
                    if (a2 == null) {
                        return;
                    }
                    kde.a(kde.this, ByteBuffer.wrap(a2));
                }
            }
        });
    }

    @Override // org.android.spdy.SessionCb
    public void spdySessionFailedError(SpdySession spdySession, final int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30d5bd4", new Object[]{this, spdySession, new Integer(i), obj});
            return;
        }
        ALog.d(f29967a, "session failed error", null, new Object[0]);
        d.execute(new Runnable() { // from class: tb.kde.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                kde.a(kde.this, i, "session failed error");
                NetworkResponse networkResponse = new NetworkResponse();
                SpdyErrorException spdyErrorException = new SpdyErrorException("create session fail with error code: " + i, i);
                networkResponse.setStatusCode(i);
                networkResponse.setError(spdyErrorException);
                kde.g(kde.this).a(kde.this, spdyErrorException, networkResponse);
            }
        });
    }

    @Override // org.android.spdy.SessionCb
    public void spdySessionCloseCallback(SpdySession spdySession, Object obj, SuperviseConnectInfo superviseConnectInfo, final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f76348e5", new Object[]{this, spdySession, obj, superviseConnectInfo, new Integer(i)});
            return;
        }
        ALog.d(f29967a, "session close with call back", null, new Object[0]);
        d.execute(new Runnable() { // from class: tb.kde.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    kde.a(kde.this, i, "session close with call back");
                }
            }
        });
    }

    @Override // org.android.spdy.SessionCb
    public byte[] getSSLMeta(SpdySession spdySession) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("c9362ffe", new Object[]{this, spdySession}) : new byte[0];
    }

    @Override // org.android.spdy.SessionExtraCb
    public void spdySessionOnWritable(SpdySession spdySession, Object obj, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f5c8a40", new Object[]{this, spdySession, obj, new Integer(i)});
            return;
        }
        ALog.d(f29967a, "session on writable", null, new Object[0]);
        d.execute(new Runnable() { // from class: tb.kde.7
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                synchronized (kde.j(kde.this)) {
                    while (kde.j(kde.this).peek() != null) {
                        kde.b(kde.this, (ByteBuffer) kde.j(kde.this).poll());
                    }
                }
            }
        });
    }

    public void b(kcw kcwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df58aeda", new Object[]{this, kcwVar});
        } else {
            a(new kdc((kdb) kcwVar));
        }
    }

    public void c(kcw kcwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cddbb55b", new Object[]{this, kcwVar});
        } else {
            a(new kdb());
        }
    }

    public kdf d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (kdf) ipChange.ipc$dispatch("261bbcae", new Object[]{this}) : this.h;
    }

    public void a(kdf kdfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0dc058b", new Object[]{this, kdfVar});
        } else {
            this.h = kdfVar;
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        this.l = new StringBuilder(128);
        String rawPath = this.g.getURI().getRawPath();
        String rawQuery = this.g.getURI().getRawQuery();
        if (rawPath == null || rawPath.length() == 0) {
            rawPath = "/";
        }
        if (rawQuery != null) {
            rawPath = rawPath + riy.CONDITION_IF + rawQuery;
        }
        this.l.append("GET ");
        this.l.append(rawPath);
        this.l.append(" HTTP/1.1\r\n");
        this.l.append("Host: ");
        this.l.append(this.g.getURI().getHost());
        if (this.g.getURI().getPort() != -1) {
            this.l.append(":");
            this.l.append(this.g.getURI().getPort());
        }
        this.l.append("\r\n");
        if (this.g.getHeaders() != null && !this.g.getHeaders().isEmpty()) {
            for (Header header : this.g.getHeaders()) {
                this.l.append(header.getName());
                this.l.append(ResponseProtocolType.COMMENT);
                this.l.append(header.getValue());
                this.l.append("\r\n");
            }
        }
        this.l.append("Upgrade: websocket\r\n");
        this.l.append("Connection: Upgrade\r\n");
        this.l.append("Sec-WebSocket-Key: ");
        this.l.append(this.m);
        this.l.append("\r\n");
        this.l.append("Sec-WebSocket-Version: 13\r\n\r\n");
    }

    private void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.n = i;
        }
    }

    private void a(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20f12ca5", new Object[]{this, new Integer(i), str});
        } else if (this.n == 4) {
        } else {
            this.o = false;
            synchronized (this.e) {
                this.e.clear();
            }
            SpdySession spdySession = this.k;
            if (spdySession != null) {
                spdySession.closeSession();
                this.k = null;
            }
            if (this.i != null) {
                this.i = null;
            }
            kct.a().b();
            a(4);
            this.h.a(this, i, str);
        }
    }

    private boolean b(Collection<kcw> collection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bd58cde", new Object[]{this, collection})).booleanValue();
        }
        if (this.n != 2 || collection == null) {
            return false;
        }
        for (kcw kcwVar : collection) {
            try {
                b(kct.a().a(kcwVar));
            } catch (RuntimeException e) {
                ALog.e(f29967a, "create frame error", null, e, new Object[0]);
                return false;
            }
        }
        return true;
    }

    private void a(ByteBuffer byteBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d64c9e9", new Object[]{this, byteBuffer});
            return;
        }
        try {
            for (kcw kcwVar : kct.a().b(byteBuffer)) {
                kct.a().a(this, kcwVar);
            }
        } catch (b e) {
            a(e.getCloseCode(), e.getMessage(), false);
        }
    }

    private boolean a(byte[] bArr) {
        String[] split;
        int indexOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c196733", new Object[]{this, bArr})).booleanValue();
        }
        String str = new String(bArr, Charset.forName("utf-8"));
        this.p = 0;
        if (str.startsWith("HTTP/1.") && (indexOf = str.indexOf(32)) > 0) {
            int i = indexOf + 1;
            int indexOf2 = str.indexOf(32, i);
            if (indexOf2 < 0) {
                indexOf2 = str.length();
            }
            try {
                this.p = Integer.parseInt(str.substring(i, indexOf2));
            } catch (NumberFormatException unused) {
                this.p = -1;
            }
        }
        if (this.p == 101) {
            try {
                String str2 = "";
                String str3 = str2;
                String str4 = str3;
                for (String str5 : str.split("\r\n")) {
                    if (str5.startsWith("Upgrade: ")) {
                        str2 = str5.replace("Upgrade: ", "").toLowerCase();
                    } else if (str5.startsWith("Connection: ")) {
                        str3 = str5.replace("Connection: ", "").toLowerCase();
                    } else if (str5.startsWith("Sec-WebSocket-Accept: ")) {
                        str4 = str5.replace("Sec-WebSocket-Accept: ", "");
                    }
                }
                if (str2.equals("websocket") && str3.equals(LoginConstants.LOGIN_UPGRADE) && str4.equals(kdg.a(this.m))) {
                    return true;
                }
            } catch (Exception e) {
                ALog.e(f29967a, "parse response error", null, e, new Object[0]);
            }
        }
        return false;
    }

    private void b(ByteBuffer byteBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f3e1d08", new Object[]{this, byteBuffer});
        } else if (this.n != 2) {
        } else {
            try {
                if (this.k == null || this.k.sendCustomControlFrame(-1, -1, -1, byteBuffer.limit(), byteBuffer.array()) != -3848) {
                    return;
                }
                synchronized (this.e) {
                    this.e.add(byteBuffer);
                }
            } catch (Exception e) {
                ALog.e(f29967a, "send frame from queue error", null, e, new Object[0]);
            }
        }
    }
}
