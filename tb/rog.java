package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.uploader.implement.d;
import java.util.LinkedList;
import java.util.List;
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

/* loaded from: classes9.dex */
public class rog implements SessionCb, SessionExtraCb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private d f33262a;
    private SpdyAgent b;
    private SpdySession c;
    private final Context d;
    private final rok e;
    private volatile a f;
    private volatile String g = "DISCONNECTED";
    private List<b> h = new LinkedList();
    private final int i = hashCode();
    private roi j = new roi();

    /* loaded from: classes9.dex */
    public interface a {
        void a();

        void a(int i);

        void a(int i, int i2);

        void a(byte[] bArr, int i);

        void b(int i);
    }

    /* loaded from: classes9.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public byte[] f33265a;
        public int b;
        public int c;

        public b(byte[] bArr, int i, int i2) {
            this.f33265a = bArr;
            this.b = i;
            this.c = i2;
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append(hashCode());
            sb.append(" WaitingData{ length=");
            sb.append(this.b);
            sb.append(", sendSequence=");
            sb.append(this.c);
            sb.append(riy.BLOCK_END_STR);
            return sb.toString();
        }
    }

    @Override // org.android.spdy.SessionCb
    public void bioPingRecvCallback(SpdySession spdySession, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b6dabda", new Object[]{this, spdySession, new Integer(i)});
        }
    }

    @Override // org.android.spdy.SessionCb
    public void spdyPingRecvCallback(SpdySession spdySession, long j, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1c4fe4d", new Object[]{this, spdySession, new Long(j), obj});
        }
    }

    public static /* synthetic */ Context a(rog rogVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("709bbdc6", new Object[]{rogVar}) : rogVar.d;
    }

    public static /* synthetic */ d b(rog rogVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("43834511", new Object[]{rogVar}) : rogVar.f33262a;
    }

    public rog(d dVar, rok rokVar) {
        this.f33262a = dVar;
        this.d = dVar.c;
        this.e = rokVar;
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47876571", new Object[]{this, aVar});
        } else {
            this.f = aVar;
        }
    }

    public void a() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (!c()) {
            if (!com.uploader.implement.a.a(8)) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(this.i);
            sb.append(" CustomizedSession already connected,mSession:");
            SpdySession spdySession = this.c;
            sb.append(spdySession != null ? Integer.valueOf(spdySession.hashCode()) : "");
            com.uploader.implement.a.a(8, "CustomizedSession", sb.toString());
        } else {
            try {
                this.g = "CONNECTING";
                if (this.e.a()) {
                    i = 20;
                } else {
                    i = this.e.f ? SpdyProtocol.SSSL_0RTT_CUSTOM : 16;
                }
                this.j.f33267a = this.e.f33257a;
                this.j.b = this.e.b;
                this.j.c = this.e.g;
                SessionInfo sessionInfo = new SessionInfo(this.e.f33257a, this.e.b, Integer.toString(this.i), null, 0, null, this, i);
                sessionInfo.setConnectionTimeoutMs(10000);
                if (this.e.a() && com.uploader.implement.b.e()) {
                    sessionInfo.setXquicLossDetect(true);
                }
                if (this.e.a()) {
                    sessionInfo.setCertHost("arup-gateway.m.taobao.com");
                    int d = com.uploader.implement.b.d();
                    if (d < 0) {
                        sessionInfo.setXquicCongControl(2);
                    } else {
                        sessionInfo.setXquicCongControl(d);
                    }
                } else if (this.e.f) {
                    if (2 == this.f33262a.b.a().f24057a) {
                        sessionInfo.setPubKeySeqNum(0);
                    } else {
                        sessionInfo.setPubKeySeqNum(6);
                    }
                }
                if (this.b == null) {
                    d();
                }
                this.c = this.b.createSession(sessionInfo);
                if (!com.uploader.implement.a.a(4)) {
                    return;
                }
                com.uploader.implement.a.a(4, "CustomizedSession", this.i + " CustomizedSession createSession,mSession:" + this.c.hashCode() + " getRefCount:" + this.c.getRefCount());
            } catch (SpdyErrorException e) {
                this.g = "CONNECTFAILED";
                if (com.uploader.implement.a.a(16)) {
                    com.uploader.implement.a.a(16, "CustomizedSession", this.i + "CustomizedSession connect failed", e);
                }
                a(e.SpdyErrorGetCode());
            }
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        SpdySession spdySession = this.c;
        if (spdySession != null) {
            spdySession.closeSession();
            if (com.uploader.implement.a.a(4)) {
                com.uploader.implement.a.a(4, "CustomizedSession", this.i + " CustomizedSession closeSession,session:" + this.c.hashCode());
            }
        }
        this.g = "DISCONNECTED";
    }

    public void a(int i, byte[] bArr, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1099a1", new Object[]{this, new Integer(i), bArr, new Integer(i2)});
            return;
        }
        try {
            if (c()) {
                if (!com.uploader.implement.a.a(16)) {
                    return;
                }
                StringBuilder sb = new StringBuilder(64);
                sb.append(this.i);
                sb.append(" send failed, needConnect and return, sequence:");
                sb.append(i);
                sb.append(", length=");
                sb.append(i2);
                sb.append(", mSession:");
                sb.append(this.c != null ? Integer.valueOf(this.c.hashCode()) : "");
                com.uploader.implement.a.a(16, "CustomizedSession", sb.toString());
                return;
            }
            this.c.sendCustomControlFrame(i, -1, -1, i2, bArr);
            if (com.uploader.implement.a.a(4)) {
                StringBuilder sb2 = new StringBuilder(64);
                sb2.append(this.i);
                sb2.append(" send sendCustomControlFrame. sequence=");
                sb2.append(i);
                sb2.append(", length=");
                sb2.append(i2);
                sb2.append(", mSession:");
                sb2.append(this.c.hashCode());
                com.uploader.implement.a.a(4, "CustomizedSession", sb2.toString());
            }
            if (this.f == null) {
                return;
            }
            this.f.b(i);
        } catch (SpdyErrorException e) {
            int SpdyErrorGetCode = e.SpdyErrorGetCode();
            if (-3848 == SpdyErrorGetCode) {
                a(new b(bArr, i2, i));
                return;
            }
            if (com.uploader.implement.a.a(16)) {
                com.uploader.implement.a.a(16, "CustomizedSession", this.i + " send sendCustomControlFrame failed", e);
            }
            if (this.f == null) {
                return;
            }
            this.f.a(i, SpdyErrorGetCode);
        }
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        try {
            SpdyAgent.enableDebug = false;
            this.b = SpdyAgent.getInstance(this.d, SpdyVersion.SPDY3, SpdySessionKind.NONE_SESSION);
            if (this.e.a()) {
                this.b.InitializeSecurityStuff();
            }
            if (this.e.f && !this.e.a()) {
                this.b.setAccsSslCallback(new AccsSSLCallback() { // from class: tb.rog.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // org.android.spdy.AccsSSLCallback
                    public byte[] getSSLPublicKey(int i, byte[] bArr) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return (byte[]) ipChange2.ipc$dispatch("13408d1a", new Object[]{this, new Integer(i), bArr});
                        }
                        try {
                            return rog.b(rog.this).b.decrypt(rog.a(rog.this), SpdyProtocol.TNET_PUBKEY_SG_KEY, bArr);
                        } catch (Exception e) {
                            if (!com.uploader.implement.a.a(16)) {
                                return null;
                            }
                            com.uploader.implement.a.a(16, "CustomizedSession", "call config.decrypt error.", e);
                            return null;
                        }
                    }
                });
            }
            if (!com.uploader.implement.a.a(4)) {
                return;
            }
            com.uploader.implement.a.a(4, "CustomizedSession", this.i + " initSpdyAgent");
        } catch (Exception e) {
            if (!com.uploader.implement.a.a(16)) {
                return;
            }
            com.uploader.implement.a.a(16, "CustomizedSession", this.i + " init SpdyAgent failed.", e);
        }
    }

    @Override // org.android.spdy.SessionCb
    public void spdySessionConnectCB(SpdySession spdySession, SuperviseConnectInfo superviseConnectInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d2bcf0e", new Object[]{this, spdySession, superviseConnectInfo});
            return;
        }
        this.g = "CONNECTED";
        if (com.uploader.implement.a.a(4)) {
            com.uploader.implement.a.a(4, "CustomizedSession", this.i + " CustomizedSession spdySessionConnectCB,session:" + spdySession.hashCode() + ", sessionInfo:" + spdySession.getConnectInfoOnConnected());
        }
        if (this.f != null) {
            this.f.a();
        }
        this.j.d = 1;
        if (this.e.a() && superviseConnectInfo != null) {
            this.j.f = superviseConnectInfo.scid;
            this.j.g = superviseConnectInfo.dcid;
            this.j.h = superviseConnectInfo.congControlKind;
        }
        e();
    }

    @Override // org.android.spdy.SessionCb
    public void spdyCustomControlFrameRecvCallback(SpdySession spdySession, Object obj, int i, int i2, int i3, int i4, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1cc5fc5", new Object[]{this, spdySession, obj, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), bArr});
        } else if (this.f == null) {
        } else {
            this.f.a(bArr, i4);
        }
    }

    @Override // org.android.spdy.SessionCb
    public void spdyCustomControlFrameFailCallback(SpdySession spdySession, Object obj, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7576ccd6", new Object[]{this, spdySession, obj, new Integer(i), new Integer(i2)});
        } else if (!com.uploader.implement.a.a(4)) {
        } else {
            com.uploader.implement.a.a(4, "CustomizedSession", this.i + " CustomizedSession spdyCustomControlFrameFailCallback, session:" + spdySession.hashCode() + ", id:" + i + ", error:" + i2);
        }
    }

    @Override // org.android.spdy.SessionCb
    public void spdySessionFailedError(SpdySession spdySession, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30d5bd4", new Object[]{this, spdySession, new Integer(i), obj});
            return;
        }
        if (spdySession != null) {
            spdySession.cleanUp();
        }
        this.g = "CONNECTFAILED";
        roi roiVar = this.j;
        roiVar.d = 0;
        roiVar.e = i;
        roiVar.a();
        if (com.uploader.implement.a.a(4)) {
            com.uploader.implement.a.a(4, "CustomizedSession", this.i + " CustomizedSession spdySessionFailedError,session:" + spdySession + ", error:" + i);
        }
        a(i);
    }

    @Override // org.android.spdy.SessionCb
    public void spdySessionCloseCallback(SpdySession spdySession, Object obj, SuperviseConnectInfo superviseConnectInfo, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f76348e5", new Object[]{this, spdySession, obj, superviseConnectInfo, new Integer(i)});
            return;
        }
        if (spdySession != null) {
            try {
                spdySession.cleanUp();
                spdySession.clearAllStreamCb();
            } catch (Throwable unused) {
            }
        }
        this.g = "DISCONNECTED";
        if (com.uploader.implement.a.a(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.i);
            sb.append(" CustomizedSession spdySessionCloseCallback,session:");
            sb.append(spdySession != null ? Integer.valueOf(spdySession.hashCode()) : "");
            sb.append(", error:");
            sb.append(i);
            sb.append(", sessionInfo:");
            sb.append(spdySession.getConnectInfoOnDisConnected());
            com.uploader.implement.a.a(2, "CustomizedSession", sb.toString());
        }
        a(i);
        if (this.j.e == 0) {
            this.j.e = i;
        }
        if (superviseConnectInfo != null) {
            this.j.l = superviseConnectInfo.reused_counter;
            this.j.k = superviseConnectInfo.keepalive_period_second;
            try {
                if (this.e.a()) {
                    this.j.i = superviseConnectInfo.xqc0RttStatus;
                    this.j.n = superviseConnectInfo.retransmissionRate;
                    this.j.o = superviseConnectInfo.lossRate;
                    this.j.p = superviseConnectInfo.tlpCount;
                    this.j.q = superviseConnectInfo.rtoCount;
                    this.j.r = superviseConnectInfo.srtt;
                    this.j.m = superviseConnectInfo.sendCount;
                }
            } catch (Exception unused2) {
            }
        }
        this.j.a();
    }

    @Override // org.android.spdy.SessionCb
    public byte[] getSSLMeta(SpdySession spdySession) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("c9362ffe", new Object[]{this, spdySession});
        }
        try {
            return this.f33262a.b.getSslTicket(this.d, "ARUP_SSL_TICKET_KEY");
        } catch (Exception e) {
            if (!com.uploader.implement.a.a(16)) {
                return null;
            }
            com.uploader.implement.a.a(16, "CustomizedSession", "CustomizedSession call config.getSslTicket error.", e);
            return null;
        }
    }

    @Override // org.android.spdy.SessionCb
    public int putSSLMeta(SpdySession spdySession, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8ce64c60", new Object[]{this, spdySession, bArr})).intValue();
        }
        try {
            return this.f33262a.b.putSslTicket(this.d, "ARUP_SSL_TICKET_KEY", bArr);
        } catch (Exception e) {
            if (!com.uploader.implement.a.a(16)) {
                return -1;
            }
            com.uploader.implement.a.a(16, "CustomizedSession", "CustomizedSession call config.putSslTicket error.", e);
            return -1;
        }
    }

    @Override // org.android.spdy.SessionExtraCb
    public void spdySessionOnWritable(SpdySession spdySession, Object obj, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f5c8a40", new Object[]{this, spdySession, obj, new Integer(i)});
            return;
        }
        if (com.uploader.implement.a.a(8)) {
            com.uploader.implement.a.a(8, "CustomizedSession", this.i + " CustomizedSession spdySessionOnWritable session:" + spdySession.hashCode() + ",size:" + i);
        }
        e();
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        String str = this.g;
        return !"CONNECTED".equals(str) && !"CONNECTING".equals(str);
    }

    private void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        synchronized (this.h) {
            this.h.clear();
        }
        if (com.uploader.implement.a.a(8)) {
            com.uploader.implement.a.a(8, "CustomizedSession", this.i + " CustomizedSession onClose, error:" + i);
        }
        if (this.f == null) {
            return;
        }
        this.f.a(i);
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        synchronized (this.h) {
            if (this.h.isEmpty()) {
                return;
            }
            final b remove = this.h.remove(0);
            if (remove == null) {
                return;
            }
            rpa.a(new Runnable() { // from class: tb.rog.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        rog.this.a(remove.c, remove.f33265a, remove.b);
                    }
                }
            });
        }
    }

    private void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4787d9d0", new Object[]{this, bVar});
            return;
        }
        synchronized (this.h) {
            this.h.add(bVar);
            if (com.uploader.implement.a.a(8)) {
                StringBuilder sb = new StringBuilder(64);
                sb.append(this.i);
                sb.append(" [addWaitingData] ");
                sb.append(bVar);
                sb.append(", mSession:");
                sb.append(this.c != null ? Integer.valueOf(this.c.hashCode()) : "");
                com.uploader.implement.a.a(8, "CustomizedSession", sb.toString());
            }
        }
    }
}
