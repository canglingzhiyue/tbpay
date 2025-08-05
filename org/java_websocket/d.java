package org.java_websocket;

import java.io.IOException;
import java.io.PrintStream;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.channels.NotYetConnectedException;
import java.nio.channels.SelectionKey;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import org.java_websocket.WebSocket;
import org.java_websocket.drafts.Draft;
import org.java_websocket.exceptions.IncompleteHandshakeException;
import org.java_websocket.exceptions.InvalidDataException;
import org.java_websocket.exceptions.InvalidHandshakeException;
import org.java_websocket.exceptions.WebsocketNotConnectedException;
import org.java_websocket.framing.Framedata;
import tb.sbi;
import tb.sbj;
import tb.sbn;
import tb.sbp;
import tb.sbu;
import tb.sbx;

/* loaded from: classes9.dex */
public class d implements WebSocket {
    public final BlockingQueue<ByteBuffer> c;
    public final BlockingQueue<ByteBuffer> d;
    public SelectionKey e;
    public ByteChannel f;
    public volatile sbu.a g;
    private final e i;
    private volatile boolean j;
    private WebSocket.READYSTATE k;
    private List<Draft> l;
    private Draft m;
    private WebSocket.Role n;
    private ByteBuffer o;
    private sbi p;
    private String q;
    private Integer r;
    private Boolean s;
    private String t;
    private long u;
    private final Object v;
    private org.java_websocket.framing.g w;
    private Object x;
    static final /* synthetic */ boolean h = !d.class.desiredAssertionStatus();

    /* renamed from: a  reason: collision with root package name */
    public static int f25078a = 16384;
    public static boolean b = false;

    public d(e eVar, List<Draft> list) {
        this(eVar, (Draft) null);
        this.n = WebSocket.Role.SERVER;
        if (list != null && !list.isEmpty()) {
            this.l = list;
            return;
        }
        this.l = new ArrayList();
        this.l.add(new org.java_websocket.drafts.a());
    }

    public d(e eVar, Draft draft) {
        this.j = false;
        this.k = WebSocket.READYSTATE.NOT_YET_CONNECTED;
        this.m = null;
        this.o = ByteBuffer.allocate(0);
        this.p = null;
        this.q = null;
        this.r = null;
        this.s = null;
        this.t = null;
        this.u = System.currentTimeMillis();
        this.v = new Object();
        if (eVar == null || (draft == null && this.n == WebSocket.Role.SERVER)) {
            throw new IllegalArgumentException("parameters must not be null");
        }
        this.c = new LinkedBlockingQueue();
        this.d = new LinkedBlockingQueue();
        this.i = eVar;
        this.n = WebSocket.Role.CLIENT;
        if (draft == null) {
            return;
        }
        this.m = draft.c();
    }

    private ByteBuffer a(int i) {
        String str = i != 404 ? "500 Internal Server Error" : "404 WebSocket Upgrade Failure";
        return ByteBuffer.wrap(sbx.b("HTTP/1.1 " + str + "\r\nContent-Type: text/html\nServer: TooTallNate Java-WebSocket\r\nContent-Length: " + (str.length() + 48) + "\r\n\r\n<html><head></head><body><h1>" + str + "</h1></body></html>"));
    }

    private void a(RuntimeException runtimeException) {
        e(a(500));
        c(-1, runtimeException.getMessage(), false);
    }

    private void a(Collection<Framedata> collection) {
        if (isOpen()) {
            if (collection == null) {
                throw new IllegalArgumentException();
            }
            ArrayList arrayList = new ArrayList();
            for (Framedata framedata : collection) {
                if (b) {
                    PrintStream printStream = System.out;
                    printStream.println("send frame: " + framedata);
                }
                arrayList.add(this.m.a(framedata));
            }
            a((List<ByteBuffer>) arrayList);
            return;
        }
        throw new WebsocketNotConnectedException();
    }

    private void a(List<ByteBuffer> list) {
        synchronized (this.v) {
            for (ByteBuffer byteBuffer : list) {
                e(byteBuffer);
            }
        }
    }

    private void a(WebSocket.READYSTATE readystate) {
        this.k = readystate;
    }

    private void a(sbn sbnVar) {
        if (b) {
            PrintStream printStream = System.out;
            printStream.println("open using draft: " + this.m);
        }
        a(WebSocket.READYSTATE.OPEN);
        try {
            this.i.onWebsocketOpen(this, sbnVar);
        } catch (RuntimeException e) {
            this.i.onWebsocketError(this, e);
        }
    }

    private void b(InvalidDataException invalidDataException) {
        e(a(404));
        c(invalidDataException.getCloseCode(), invalidDataException.getMessage(), false);
    }

    private boolean c(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2;
        sbn d;
        if (this.o.capacity() == 0) {
            byteBuffer2 = byteBuffer;
        } else {
            if (this.o.remaining() < byteBuffer.remaining()) {
                ByteBuffer allocate = ByteBuffer.allocate(this.o.capacity() + byteBuffer.remaining());
                this.o.flip();
                allocate.put(this.o);
                this.o = allocate;
            }
            this.o.put(byteBuffer);
            this.o.flip();
            byteBuffer2 = this.o;
        }
        byteBuffer2.mark();
        try {
            try {
            } catch (InvalidHandshakeException e) {
                a(e);
            }
        } catch (IncompleteHandshakeException e2) {
            if (this.o.capacity() == 0) {
                byteBuffer2.reset();
                int preferedSize = e2.getPreferedSize();
                if (preferedSize == 0) {
                    preferedSize = byteBuffer2.capacity() + 16;
                } else if (!h && e2.getPreferedSize() < byteBuffer2.remaining()) {
                    throw new AssertionError();
                }
                this.o = ByteBuffer.allocate(preferedSize);
                this.o.put(byteBuffer);
            } else {
                ByteBuffer byteBuffer3 = this.o;
                byteBuffer3.position(byteBuffer3.limit());
                ByteBuffer byteBuffer4 = this.o;
                byteBuffer4.limit(byteBuffer4.capacity());
            }
        }
        if (this.n != WebSocket.Role.SERVER) {
            if (this.n == WebSocket.Role.CLIENT) {
                this.m.a(this.n);
                sbn d2 = this.m.d(byteBuffer2);
                if (!(d2 instanceof sbp)) {
                    c(1002, "wrong http function", false);
                    return false;
                }
                sbp sbpVar = (sbp) d2;
                if (this.m.a(this.p, sbpVar) == Draft.HandshakeState.MATCHED) {
                    try {
                        this.i.onWebsocketHandshakeReceivedAsClient(this, this.p, sbpVar);
                        a((sbn) sbpVar);
                        return true;
                    } catch (RuntimeException e3) {
                        this.i.onWebsocketError(this, e3);
                        c(-1, e3.getMessage(), false);
                        return false;
                    } catch (InvalidDataException e4) {
                        c(e4.getCloseCode(), e4.getMessage(), false);
                        return false;
                    }
                }
                a(1002, "draft " + this.m + " refuses handshake");
            }
            return false;
        } else if (this.m != null) {
            sbn d3 = this.m.d(byteBuffer2);
            if (!(d3 instanceof sbi)) {
                c(1002, "wrong http function", false);
                return false;
            }
            sbi sbiVar = (sbi) d3;
            if (this.m.a(sbiVar) == Draft.HandshakeState.MATCHED) {
                a((sbn) sbiVar);
                return true;
            }
            a(1002, "the handshake did finaly not match");
            return false;
        } else {
            for (Draft draft : this.l) {
                Draft c = draft.c();
                try {
                    c.a(this.n);
                    byteBuffer2.reset();
                    d = c.d(byteBuffer2);
                } catch (InvalidHandshakeException unused) {
                }
                if (!(d instanceof sbi)) {
                    b(new InvalidDataException(1002, "wrong http function"));
                    return false;
                }
                sbi sbiVar2 = (sbi) d;
                if (c.a(sbiVar2) == Draft.HandshakeState.MATCHED) {
                    this.t = sbiVar2.a();
                    try {
                        a(c.a(c.a(sbiVar2, this.i.onWebsocketHandshakeReceivedAsServer(this, c, sbiVar2)), this.n));
                        this.m = c;
                        a((sbn) sbiVar2);
                        return true;
                    } catch (RuntimeException e5) {
                        this.i.onWebsocketError(this, e5);
                        a(e5);
                        return false;
                    } catch (InvalidDataException e6) {
                        b(e6);
                        return false;
                    }
                }
            }
            if (this.m == null) {
                b(new InvalidDataException(1002, "no draft matches"));
            }
            return false;
        }
    }

    private void d(ByteBuffer byteBuffer) {
        try {
            for (Framedata framedata : this.m.c(byteBuffer)) {
                if (b) {
                    PrintStream printStream = System.out;
                    printStream.println("matched frame: " + framedata);
                }
                this.m.a(this, framedata);
            }
        } catch (InvalidDataException e) {
            this.i.onWebsocketError(this, e);
            a(e);
        }
    }

    private void e(ByteBuffer byteBuffer) {
        if (b) {
            PrintStream printStream = System.out;
            StringBuilder sb = new StringBuilder();
            sb.append("write(");
            sb.append(byteBuffer.remaining());
            sb.append("): {");
            sb.append(byteBuffer.remaining() > 1000 ? "too big to display" : new String(byteBuffer.array()));
            sb.append('}');
            printStream.println(sb.toString());
        }
        this.c.add(byteBuffer);
        this.i.onWriteDemand(this);
    }

    public void a() {
        if (this.s != null) {
            b(this.r.intValue(), this.q, this.s.booleanValue());
            return;
        }
        throw new IllegalStateException("this method must be used in conjuction with flushAndClose");
    }

    public void a(int i, String str) {
        a(i, str, false);
    }

    public synchronized void a(int i, String str, boolean z) {
        if (g() == WebSocket.READYSTATE.CLOSING || this.k == WebSocket.READYSTATE.CLOSED) {
            return;
        }
        if (g() != WebSocket.READYSTATE.OPEN) {
            if (i == -3) {
                if (!h && !z) {
                    throw new AssertionError();
                }
                c(-3, str, true);
            } else if (i != 1002) {
                c(-1, str, false);
            }
            a(WebSocket.READYSTATE.CLOSING);
            this.o = null;
        } else if (i == 1006) {
            if (!h && z) {
                throw new AssertionError();
            }
            a(WebSocket.READYSTATE.CLOSING);
            c(i, str, false);
            return;
        } else if (this.m.b() != Draft.CloseHandshakeType.NONE) {
            if (!z) {
                try {
                    try {
                        this.i.onWebsocketCloseInitiated(this, i, str);
                    } catch (InvalidDataException e) {
                        this.i.onWebsocketError(this, e);
                        c(1006, "generated frame is invalid", false);
                    }
                } catch (RuntimeException e2) {
                    this.i.onWebsocketError(this, e2);
                }
            }
            if (isOpen()) {
                org.java_websocket.framing.b bVar = new org.java_websocket.framing.b();
                bVar.a(str);
                bVar.a(i);
                bVar.c();
                sendFrame(bVar);
            }
        }
        c(i, str, z);
        a(WebSocket.READYSTATE.CLOSING);
        this.o = null;
    }

    protected void a(int i, boolean z) {
        b(i, "", z);
    }

    public <T> void a(T t) {
        this.x = t;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0067, code lost:
        if (g() == org.java_websocket.WebSocket.READYSTATE.OPEN) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(java.nio.ByteBuffer r7) {
        /*
            r6 = this;
            boolean r0 = org.java_websocket.d.h
            if (r0 != 0) goto L11
            boolean r0 = r7.hasRemaining()
            if (r0 == 0) goto Lb
            goto L11
        Lb:
            java.lang.AssertionError r7 = new java.lang.AssertionError
            r7.<init>()
            throw r7
        L11:
            boolean r0 = org.java_websocket.d.b
            if (r0 == 0) goto L59
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "process("
            r1.append(r2)
            int r2 = r7.remaining()
            r1.append(r2)
            java.lang.String r2 = "): {"
            r1.append(r2)
            int r2 = r7.remaining()
            r3 = 1000(0x3e8, float:1.401E-42)
            if (r2 <= r3) goto L39
            java.lang.String r2 = "too big to display"
            goto L4a
        L39:
            java.lang.String r2 = new java.lang.String
            byte[] r3 = r7.array()
            int r4 = r7.position()
            int r5 = r7.remaining()
            r2.<init>(r3, r4, r5)
        L4a:
            r1.append(r2)
            r2 = 125(0x7d, float:1.75E-43)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.println(r1)
        L59:
            org.java_websocket.WebSocket$READYSTATE r0 = r6.g()
            org.java_websocket.WebSocket$READYSTATE r1 = org.java_websocket.WebSocket.READYSTATE.NOT_YET_CONNECTED
            if (r0 == r1) goto L6d
            org.java_websocket.WebSocket$READYSTATE r0 = r6.g()
            org.java_websocket.WebSocket$READYSTATE r1 = org.java_websocket.WebSocket.READYSTATE.OPEN
            if (r0 != r1) goto Lb0
        L69:
            r6.d(r7)
            goto Lb0
        L6d:
            boolean r0 = r6.c(r7)
            if (r0 == 0) goto Lb0
            boolean r0 = r6.isClosing()
            if (r0 != 0) goto Lb0
            boolean r0 = r6.isClosed()
            if (r0 != 0) goto Lb0
            boolean r0 = org.java_websocket.d.h
            if (r0 != 0) goto L9c
            java.nio.ByteBuffer r0 = r6.o
            boolean r0 = r0.hasRemaining()
            boolean r1 = r7.hasRemaining()
            if (r0 != r1) goto L9c
            boolean r0 = r7.hasRemaining()
            if (r0 != 0) goto L96
            goto L9c
        L96:
            java.lang.AssertionError r7 = new java.lang.AssertionError
            r7.<init>()
            throw r7
        L9c:
            boolean r0 = r7.hasRemaining()
            if (r0 == 0) goto La3
            goto L69
        La3:
            java.nio.ByteBuffer r0 = r6.o
            boolean r0 = r0.hasRemaining()
            if (r0 == 0) goto Lb0
            java.nio.ByteBuffer r0 = r6.o
            r6.d(r0)
        Lb0:
            boolean r0 = org.java_websocket.d.h
            if (r0 != 0) goto Lcd
            boolean r0 = r6.isClosing()
            if (r0 != 0) goto Lcd
            boolean r0 = r6.f()
            if (r0 != 0) goto Lcd
            boolean r7 = r7.hasRemaining()
            if (r7 != 0) goto Lc7
            goto Lcd
        Lc7:
            java.lang.AssertionError r7 = new java.lang.AssertionError
            r7.<init>()
            throw r7
        Lcd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.java_websocket.d.a(java.nio.ByteBuffer):void");
    }

    public void a(InvalidDataException invalidDataException) {
        a(invalidDataException.getCloseCode(), invalidDataException.getMessage(), false);
    }

    public void a(Framedata.Opcode opcode, ByteBuffer byteBuffer, boolean z) {
        a((Collection<Framedata>) this.m.a(opcode, byteBuffer, z));
    }

    public void a(sbj sbjVar) throws InvalidHandshakeException {
        this.p = this.m.a(sbjVar);
        this.t = sbjVar.a();
        if (h || this.t != null) {
            try {
                this.i.onWebsocketHandshakeSentAsClient(this, this.p);
                a(this.m.a(this.p, this.n));
                return;
            } catch (RuntimeException e) {
                this.i.onWebsocketError(this, e);
                throw new InvalidHandshakeException("rejected because of" + e);
            } catch (InvalidDataException unused) {
                throw new InvalidHandshakeException("Handshake data rejected by client.");
            }
        }
        throw new AssertionError();
    }

    public void a(byte[] bArr) throws IllegalArgumentException, WebsocketNotConnectedException {
        b(ByteBuffer.wrap(bArr));
    }

    public void b() {
        if (g() == WebSocket.READYSTATE.NOT_YET_CONNECTED) {
            a(-1, true);
        } else if (this.j) {
            b(this.r.intValue(), this.q, this.s.booleanValue());
        } else if (this.m.b() == Draft.CloseHandshakeType.NONE) {
            a(1000, true);
        } else if (this.m.b() != Draft.CloseHandshakeType.ONEWAY) {
            a(1006, true);
        } else if (this.n == WebSocket.Role.SERVER) {
            a(1006, true);
        } else {
            a(1000, true);
        }
    }

    public synchronized void b(int i, String str, boolean z) {
        if (g() == WebSocket.READYSTATE.CLOSED) {
            return;
        }
        if (g() == WebSocket.READYSTATE.OPEN && i == 1006) {
            a(WebSocket.READYSTATE.CLOSING);
        }
        if (this.e != null) {
            this.e.cancel();
        }
        if (this.f != null) {
            try {
                this.f.close();
            } catch (IOException e) {
                if (!e.getMessage().equals("Broken pipe")) {
                    this.i.onWebsocketError(this, e);
                } else if (b) {
                    System.out.println("Caught IOException: Broken pipe during closeConnection()");
                }
            }
        }
        try {
            this.i.onWebsocketClose(this, i, str, z);
        } catch (RuntimeException e2) {
            this.i.onWebsocketError(this, e2);
        }
        if (this.m != null) {
            this.m.a();
        }
        this.p = null;
        a(WebSocket.READYSTATE.CLOSED);
    }

    public void b(ByteBuffer byteBuffer) throws IllegalArgumentException, WebsocketNotConnectedException {
        if (byteBuffer != null) {
            a((Collection<Framedata>) this.m.a(byteBuffer, this.n == WebSocket.Role.CLIENT));
            return;
        }
        throw new IllegalArgumentException("Cannot send 'null' data to a WebSocketImpl.");
    }

    public void c() throws NotYetConnectedException {
        if (this.w == null) {
            this.w = new org.java_websocket.framing.g();
        }
        sendFrame(this.w);
    }

    public synchronized void c(int i, String str, boolean z) {
        if (this.j) {
            return;
        }
        this.r = Integer.valueOf(i);
        this.q = str;
        this.s = Boolean.valueOf(z);
        this.j = true;
        this.i.onWriteDemand(this);
        try {
            this.i.onWebsocketClosing(this, i, str, z);
        } catch (RuntimeException e) {
            this.i.onWebsocketError(this, e);
        }
        if (this.m != null) {
            this.m.a();
        }
        this.p = null;
    }

    @Override // org.java_websocket.WebSocket
    public void close(int i) {
        a(i, "", false);
    }

    @Override // org.java_websocket.WebSocket
    public void closeConnection(int i, String str) {
        b(i, str, false);
    }

    public boolean d() {
        return !this.c.isEmpty();
    }

    @Deprecated
    public boolean e() {
        if (h || !this.j || g() == WebSocket.READYSTATE.CONNECTING) {
            return g() == WebSocket.READYSTATE.CONNECTING;
        }
        throw new AssertionError();
    }

    public boolean f() {
        return this.j;
    }

    public WebSocket.READYSTATE g() {
        return this.k;
    }

    @Override // org.java_websocket.WebSocket
    public Draft getDraft() {
        return this.m;
    }

    @Override // org.java_websocket.WebSocket
    public InetSocketAddress getLocalSocketAddress() {
        return this.i.getLocalSocketAddress(this);
    }

    @Override // org.java_websocket.WebSocket
    public InetSocketAddress getRemoteSocketAddress() {
        return this.i.getRemoteSocketAddress(this);
    }

    public void h() {
        close(1000);
    }

    public int hashCode() {
        return super.hashCode();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long i() {
        return this.u;
    }

    @Override // org.java_websocket.WebSocket
    public boolean isClosed() {
        return g() == WebSocket.READYSTATE.CLOSED;
    }

    @Override // org.java_websocket.WebSocket
    public boolean isClosing() {
        return g() == WebSocket.READYSTATE.CLOSING;
    }

    @Override // org.java_websocket.WebSocket
    public boolean isOpen() {
        return g() == WebSocket.READYSTATE.OPEN;
    }

    public void j() {
        this.u = System.currentTimeMillis();
    }

    public e k() {
        return this.i;
    }

    public <T> T l() {
        return (T) this.x;
    }

    @Override // org.java_websocket.WebSocket
    public void send(String str) throws WebsocketNotConnectedException {
        if (str != null) {
            a((Collection<Framedata>) this.m.a(str, this.n == WebSocket.Role.CLIENT));
            return;
        }
        throw new IllegalArgumentException("Cannot send 'null' data to a WebSocketImpl.");
    }

    @Override // org.java_websocket.WebSocket
    public void sendFrame(Collection<Framedata> collection) {
        a(collection);
    }

    @Override // org.java_websocket.WebSocket
    public void sendFrame(Framedata framedata) {
        a((Collection<Framedata>) Collections.singletonList(framedata));
    }

    public String toString() {
        return super.toString();
    }
}
