package com.taobao.android.riverlogger.inspector;

import anet.channel.util.HttpConstant;
import com.alipay.android.phone.mobilesdk.socketcraft.WebSocket;
import com.alipay.android.phone.mobilesdk.socketcraft.WebSocketAdapter;
import com.alipay.android.phone.mobilesdk.socketcraft.WebSocketImpl;
import com.alipay.android.phone.mobilesdk.socketcraft.drafts.Draft;
import com.alipay.android.phone.mobilesdk.socketcraft.drafts.Draft_17;
import com.alipay.android.phone.mobilesdk.socketcraft.handshake.HandshakeImpl1Client;
import com.alipay.android.phone.mobilesdk.socketcraft.handshake.Handshakedata;
import com.alipay.android.phone.mobilesdk.socketcraft.platform.ssl.SSLExtensionsFactory;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketException;
import java.net.URI;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import tb.kge;

/* loaded from: classes6.dex */
public class k extends WebSocketAdapter implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final Draft f14920a;
    private static SSLSocketFactory b;
    private static final AtomicInteger l;
    private final URI c;
    private final n d;
    private final SSLSocketFactory e;
    private final WebSocketImpl f;
    private final ConcurrentLinkedQueue<String> g = new ConcurrentLinkedQueue<>();
    private final ConcurrentLinkedQueue<String> h = new ConcurrentLinkedQueue<>();
    private final Thread i;
    private Socket j;
    private OutputStream k;

    public static /* synthetic */ Object ipc$super(k kVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.WebSocketListener
    public void onWebsocketCloseInitiated(WebSocket webSocket, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d89a5b2", new Object[]{this, webSocket, new Integer(i), str});
        }
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.WebSocketListener
    public void onWebsocketClosing(WebSocket webSocket, int i, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a62f934", new Object[]{this, webSocket, new Integer(i), str, new Boolean(z)});
        }
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.WebSocketListener
    public void onWebsocketMessage(WebSocket webSocket, ByteBuffer byteBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b116f92", new Object[]{this, webSocket, byteBuffer});
        }
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.WebSocketListener
    public void onWriteDemand(WebSocket webSocket) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d67db8b", new Object[]{this, webSocket});
        }
    }

    public static /* synthetic */ WebSocketImpl a(k kVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WebSocketImpl) ipChange.ipc$dispatch("f34fa9a5", new Object[]{kVar}) : kVar.f;
    }

    public static /* synthetic */ void b(k kVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e53834b", new Object[]{kVar});
        } else {
            kVar.f();
        }
    }

    public static /* synthetic */ OutputStream c(k kVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (OutputStream) ipChange.ipc$dispatch("6f5f37c", new Object[]{kVar}) : kVar.k;
    }

    static {
        kge.a(-426373272);
        kge.a(-1390502639);
        f14920a = new Draft_17();
        l = new AtomicInteger();
    }

    public k(URI uri, n nVar) {
        this.c = uri;
        this.d = nVar;
        if ("wss".equals(uri.getScheme())) {
            this.e = b();
        } else {
            this.e = null;
        }
        this.f = new WebSocketImpl(this, f14920a);
        int incrementAndGet = l.incrementAndGet();
        new Thread(this, "RVLWebSocket.Read_" + incrementAndGet).start();
        Runnable runnable = new Runnable() { // from class: com.taobao.android.riverlogger.inspector.k.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                while (!Thread.interrupted()) {
                    try {
                        ByteBuffer poll = k.a(k.this).outQueue.poll();
                        if (poll == null) {
                            k.b(k.this);
                            poll = k.a(k.this).outQueue.take();
                        }
                        k.c(k.this).write(poll.array(), 0, poll.limit());
                        k.c(k.this).flush();
                    } catch (IOException unused) {
                        k.a(k.this).eot();
                        return;
                    } catch (InterruptedException unused2) {
                        return;
                    }
                }
            }
        };
        this.i = new Thread(runnable, "RVLWebSocket.Write_" + incrementAndGet);
        this.i.start();
    }

    private static SSLSocketFactory b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SSLSocketFactory) ipChange.ipc$dispatch("2606ffe3", new Object[0]);
        }
        if (b == null) {
            try {
                TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                trustManagerFactory.init((KeyStore) null);
                TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
                if (trustManagers.length != 1 || !(trustManagers[0] instanceof X509TrustManager)) {
                    throw new IllegalStateException("Unexpected default trust managers: " + Arrays.toString(trustManagers));
                }
                SSLContext sSLContext = SSLContext.getInstance("SSL");
                sSLContext.init(null, new TrustManager[]{(X509TrustManager) trustManagers[0]}, null);
                b = sSLContext.getSocketFactory();
            } catch (KeyManagementException | KeyStoreException | NoSuchAlgorithmException e) {
                e.printStackTrace();
            }
        }
        return b;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.i == null) {
        } else {
            this.f.close(1000);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        int read;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        try {
            if (this.j == null) {
                this.j = new Socket();
            } else if (this.j.isClosed()) {
                throw new SocketException("Socket is closed");
            }
            if (!this.j.isBound()) {
                c();
            }
            InputStream inputStream = this.j.getInputStream();
            this.k = this.j.getOutputStream();
            e();
            byte[] bArr = new byte[WebSocketImpl.RCVBUF];
            while (!this.f.isClosed() && !this.f.isClosing() && (read = inputStream.read(bArr)) != -1) {
                try {
                    this.f.decode(ByteBuffer.wrap(bArr, 0, read));
                } catch (IOException unused) {
                    this.f.eot();
                    return;
                } catch (RuntimeException e) {
                    onWebsocketError(null, e);
                    this.f.closeConnection(1006, e.getMessage());
                    return;
                }
            }
            this.f.eot();
        } catch (Exception e2) {
            onWebsocketError(this.f, e2);
            this.f.closeConnection(-1, e2.getMessage());
        }
    }

    private void c() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        InetAddress[] allByName = InetAddress.getAllByName(this.c.getHost());
        if (allByName == null || allByName.length <= 0) {
            throw new UnknownHostException("Unknown host : " + this.c.getHost());
        }
        this.j.connect(new InetSocketAddress(allByName[0], d()), 5000);
        SSLSocketFactory sSLSocketFactory = this.e;
        if (sSLSocketFactory == null) {
            return;
        }
        SSLSocket sSLSocket = (SSLSocket) sSLSocketFactory.createSocket(this.j, this.c.getHost(), d(), true);
        SSLExtensionsFactory.getInstance().enableTlsExtensions(sSLSocket, this.c.getHost());
        sSLSocket.startHandshake();
        this.j = sSLSocket;
    }

    private int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue();
        }
        int port = this.c.getPort();
        if (port != -1) {
            return port;
        }
        String scheme = this.c.getScheme();
        if (scheme.equals("wss")) {
            return 443;
        }
        if (scheme.equals("ws")) {
            return 80;
        }
        throw new RuntimeException("Unkonow scheme" + scheme);
    }

    private void e() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        String path = this.c.getPath();
        String query = this.c.getQuery();
        if (path == null || path.length() == 0) {
            path = "/";
        }
        if (query != null) {
            path = path + "?" + query;
        }
        int d = d();
        StringBuilder sb = new StringBuilder();
        sb.append(this.c.getHost());
        if (d != 80) {
            str = ":" + d;
        } else {
            str = "";
        }
        sb.append(str);
        String sb2 = sb.toString();
        HandshakeImpl1Client handshakeImpl1Client = new HandshakeImpl1Client();
        handshakeImpl1Client.setResourceDescriptor(path);
        handshakeImpl1Client.put(HttpConstant.HOST, sb2);
        this.f.startHandshake(handshakeImpl1Client);
    }

    public void a(String str, MessagePriority messagePriority) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16c3e794", new Object[]{this, str, messagePriority});
        } else if (messagePriority == MessagePriority.Normal) {
            if (this.f.isOpen()) {
                this.f.send(str);
            } else {
                this.g.add(str);
            }
        } else {
            this.h.add(str);
            if (!this.f.isOpen()) {
                return;
            }
            f();
        }
    }

    private void f() {
        String poll;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else if (this.f.outQueue.size() > 0 || !this.f.isOpen() || (poll = this.h.poll()) == null) {
        } else {
            this.f.send(poll);
        }
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.WebSocketListener
    public void onWebsocketMessage(WebSocket webSocket, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50f6af29", new Object[]{this, webSocket, str});
        } else if (str == null || str.length() <= 0) {
        } else {
            this.d.a(str);
        }
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.WebSocketListener
    public void onWebsocketOpen(WebSocket webSocket, Handshakedata handshakedata) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58c91ca9", new Object[]{this, webSocket, handshakedata});
            return;
        }
        while (true) {
            String poll = this.g.poll();
            if (poll != null) {
                this.f.send(poll);
            } else {
                f();
                this.d.a();
                return;
            }
        }
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.WebSocketListener
    public void onWebsocketClose(WebSocket webSocket, int i, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("405de5b7", new Object[]{this, webSocket, new Integer(i), str, new Boolean(z)});
            return;
        }
        this.i.interrupt();
        try {
            if (this.j != null) {
                this.j.close();
            }
        } catch (IOException e) {
            onWebsocketError(webSocket, e);
        }
        this.d.a(i, str);
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.WebSocketListener
    public void onWebsocketError(WebSocket webSocket, Exception exc) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f48cd726", new Object[]{this, webSocket, exc});
        } else {
            this.d.b(exc.getMessage());
        }
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.WebSocketListener
    public InetSocketAddress getLocalSocketAddress(WebSocket webSocket) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InetSocketAddress) ipChange.ipc$dispatch("f6d73acb", new Object[]{this, webSocket});
        }
        Socket socket = this.j;
        if (socket == null) {
            return null;
        }
        return (InetSocketAddress) socket.getLocalSocketAddress();
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.WebSocketListener
    public InetSocketAddress getRemoteSocketAddress(WebSocket webSocket) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InetSocketAddress) ipChange.ipc$dispatch("82babb12", new Object[]{this, webSocket});
        }
        Socket socket = this.j;
        if (socket == null) {
            return null;
        }
        return (InetSocketAddress) socket.getRemoteSocketAddress();
    }
}
