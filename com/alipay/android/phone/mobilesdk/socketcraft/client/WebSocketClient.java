package com.alipay.android.phone.mobilesdk.socketcraft.client;

import anet.channel.util.HttpConstant;
import com.alipay.android.phone.mobilesdk.socketcraft.WebSocket;
import com.alipay.android.phone.mobilesdk.socketcraft.WebSocketAdapter;
import com.alipay.android.phone.mobilesdk.socketcraft.WebSocketImpl;
import com.alipay.android.phone.mobilesdk.socketcraft.drafts.Draft;
import com.alipay.android.phone.mobilesdk.socketcraft.drafts.Draft_17;
import com.alipay.android.phone.mobilesdk.socketcraft.framing.Framedata;
import com.alipay.android.phone.mobilesdk.socketcraft.handshake.HandshakeImpl1Client;
import com.alipay.android.phone.mobilesdk.socketcraft.handshake.Handshakedata;
import com.alipay.android.phone.mobilesdk.socketcraft.handshake.ServerHandshake;
import com.alipay.android.phone.mobilesdk.socketcraft.platform.logcat.SCLogCatUtil;
import com.alipay.android.phone.mobilesdk.socketcraft.platform.ssl.SSLExtensionsFactory;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.URI;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes3.dex */
public abstract class WebSocketClient extends WebSocketAdapter implements WebSocket, Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final /* synthetic */ boolean b = !WebSocketClient.class.desiredAssertionStatus();

    /* renamed from: a  reason: collision with root package name */
    public URI f5104a;
    private WebSocketImpl c;
    private Socket d;
    private InputStream e;
    private OutputStream f;
    private Proxy g;
    private Thread h;
    private Draft i;
    private Map<String, String> j;
    private CountDownLatch k;
    private CountDownLatch l;
    private int m;
    private SSLSocketFactory n;

    public static /* synthetic */ Object ipc$super(WebSocketClient webSocketClient, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public abstract void onClose(int i, String str, boolean z);

    public void onCloseInitiated(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c9f8454", new Object[]{this, new Integer(i), str});
        }
    }

    public void onClosing(int i, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("528da944", new Object[]{this, new Integer(i), str, new Boolean(z)});
        }
    }

    public void onDns(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f324c49", new Object[]{this, str, new Long(j)});
        }
    }

    public abstract void onError(Exception exc);

    public void onFragment(Framedata framedata) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef752684", new Object[]{this, framedata});
        }
    }

    public abstract void onMessage(String str);

    public void onMessage(ByteBuffer byteBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29e36702", new Object[]{this, byteBuffer});
        }
    }

    public abstract void onOpen(ServerHandshake serverHandshake);

    public void onSSLHandshake(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("180eb693", new Object[]{this, new Long(j)});
        }
    }

    public void onTcpConnect(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3713a44b", new Object[]{this, str, new Long(j)});
        }
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.WebSocketListener
    public final void onWriteDemand(WebSocket webSocket) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d67db8b", new Object[]{this, webSocket});
        }
    }

    public void onWsHandshake(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("685f4781", new Object[]{this, new Long(j)});
        }
    }

    public static /* synthetic */ WebSocketImpl a(WebSocketClient webSocketClient) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WebSocketImpl) ipChange.ipc$dispatch("4caeb535", new Object[]{webSocketClient}) : webSocketClient.c;
    }

    public static /* synthetic */ OutputStream b(WebSocketClient webSocketClient) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (OutputStream) ipChange.ipc$dispatch("6a41cf", new Object[]{webSocketClient}) : webSocketClient.f;
    }

    public WebSocketClient(URI uri) {
        this(uri, new Draft_17());
    }

    public WebSocketClient(URI uri, Draft draft) {
        this(uri, draft, null, 0);
    }

    public WebSocketClient(URI uri, Draft draft, Map<String, String> map, int i) {
        this.f5104a = null;
        this.c = null;
        this.d = null;
        this.g = Proxy.NO_PROXY;
        this.k = new CountDownLatch(1);
        this.l = new CountDownLatch(1);
        this.m = 0;
        if (uri != null) {
            if (draft == null) {
                throw new IllegalArgumentException("null as draft is permitted for `WebSocketServer` only!");
            }
            this.f5104a = uri;
            this.i = draft;
            this.j = map;
            this.m = i;
            this.c = new WebSocketImpl(this, draft);
            return;
        }
        throw new IllegalArgumentException();
    }

    public URI getURI() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (URI) ipChange.ipc$dispatch("8e1ee1b", new Object[]{this}) : this.f5104a;
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.WebSocket
    public Draft getDraft() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Draft) ipChange.ipc$dispatch("b6ad590e", new Object[]{this}) : this.i;
    }

    public void connect() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66af7871", new Object[]{this});
        } else if (this.h != null) {
            throw new IllegalStateException("WebSocketClient objects are not reuseable");
        } else {
            this.h = new Thread(this);
            this.h.start();
        }
    }

    public boolean connectBlocking() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("271d8c4a", new Object[]{this})).booleanValue();
        }
        connect();
        this.k.await();
        return this.c.isOpen();
    }

    public void close() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
        } else if (this.h == null) {
        } else {
            this.c.close(1000);
        }
    }

    public void closeBlocking() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf49cc54", new Object[]{this});
            return;
        }
        close();
        this.l.await();
    }

    public void send(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16953419", new Object[]{this, str});
        } else {
            this.c.send(str);
        }
    }

    public void send(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d98afd16", new Object[]{this, bArr});
        } else {
            this.c.send(bArr);
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
            if (this.d == null) {
                this.d = new Socket(this.g);
            } else if (this.d.isClosed()) {
                throw new SocketException("Socket is closed");
            }
            if (!this.d.isBound()) {
                a();
            }
            this.e = this.d.getInputStream();
            this.f = this.d.getOutputStream();
            long currentTimeMillis = System.currentTimeMillis();
            c();
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            onWsHandshake(currentTimeMillis2);
            SCLogCatUtil.info("WebSocketClient", "WebSocketHandshark timing: " + currentTimeMillis2);
            this.h = new Thread(new WebsocketWriteThread());
            this.h.start();
            byte[] bArr = new byte[WebSocketImpl.RCVBUF];
            while (!isClosed() && !isClosing() && (read = this.e.read(bArr)) != -1) {
                try {
                    this.c.decode(ByteBuffer.wrap(bArr, 0, read));
                } catch (IOException unused) {
                    this.c.eot();
                } catch (RuntimeException e) {
                    onError(e);
                    this.c.closeConnection(1006, e.getMessage());
                }
            }
            this.c.eot();
            if (!b && !this.d.isClosed()) {
                throw new AssertionError();
            }
        } catch (Exception e2) {
            onWebsocketError(this.c, e2);
            this.c.closeConnection(-1, e2.getMessage());
        }
    }

    private void a() {
        String str = " null ";
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        try {
            InetAddress[] allByName = InetAddress.getAllByName(this.f5104a.getHost());
            if (allByName == null || allByName.length <= 0) {
                throw new UnknownHostException("Unknown host : " + this.f5104a.getHost());
            }
            InetAddress inetAddress = allByName[0];
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            if (inetAddress != null) {
                str = inetAddress.getHostAddress();
            }
            onDns(str, currentTimeMillis2);
            SCLogCatUtil.info("WebSocketClient", "DNS timing: " + currentTimeMillis2 + ", ip: " + str);
            long currentTimeMillis3 = System.currentTimeMillis();
            try {
                this.d.connect(new InetSocketAddress(inetAddress, b()), this.m);
                long currentTimeMillis4 = System.currentTimeMillis() - currentTimeMillis3;
                String hostAddress = inetAddress.getHostAddress();
                onTcpConnect(hostAddress, currentTimeMillis4);
                SCLogCatUtil.info("WebSocketClient", "Connection timing: " + currentTimeMillis4 + ", ip: " + hostAddress);
                SSLSocketFactory sSLSocketFactory = this.n;
                if (sSLSocketFactory == null) {
                    return;
                }
                SSLSocket sSLSocket = (SSLSocket) sSLSocketFactory.createSocket(this.d, this.f5104a.getHost(), b(), true);
                SSLExtensionsFactory.getInstance().enableTlsExtensions(sSLSocket, this.f5104a.getHost());
                long currentTimeMillis5 = System.currentTimeMillis();
                try {
                    sSLSocket.startHandshake();
                    long currentTimeMillis6 = System.currentTimeMillis() - currentTimeMillis5;
                    onSSLHandshake(currentTimeMillis6);
                    SCLogCatUtil.info("WebSocketClient", "SSL timing: " + currentTimeMillis6 + ", ip: " + inetAddress.getHostAddress());
                    this.d = sSLSocket;
                } catch (Throwable th) {
                    long currentTimeMillis7 = System.currentTimeMillis() - currentTimeMillis5;
                    onSSLHandshake(currentTimeMillis7);
                    SCLogCatUtil.info("WebSocketClient", "SSL timing: " + currentTimeMillis7 + ", ip: " + inetAddress.getHostAddress());
                    throw th;
                }
            } catch (Throwable th2) {
                long currentTimeMillis8 = System.currentTimeMillis() - currentTimeMillis3;
                String hostAddress2 = inetAddress.getHostAddress();
                onTcpConnect(hostAddress2, currentTimeMillis8);
                SCLogCatUtil.info("WebSocketClient", "Connection timing: " + currentTimeMillis8 + ", ip: " + hostAddress2);
                throw th2;
            }
        } catch (Throwable th3) {
            long currentTimeMillis9 = System.currentTimeMillis() - currentTimeMillis;
            onDns(str, currentTimeMillis9);
            SCLogCatUtil.info("WebSocketClient", "DNS timing: " + currentTimeMillis9 + ", ip: " + str);
            throw th3;
        }
    }

    private int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue();
        }
        int port = this.f5104a.getPort();
        if (port != -1) {
            return port;
        }
        String scheme = this.f5104a.getScheme();
        if (scheme.equals("wss")) {
            return 443;
        }
        if (scheme.equals("ws")) {
            return 80;
        }
        throw new RuntimeException("unkonow scheme" + scheme);
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        String path = this.f5104a.getPath();
        String query = this.f5104a.getQuery();
        if (path == null || path.length() == 0) {
            path = "/";
        }
        if (query != null) {
            path = path + "?" + query;
        }
        int b2 = b();
        StringBuilder sb = new StringBuilder();
        sb.append(this.f5104a.getHost());
        sb.append(b2 != 80 ? ":" + b2 : "");
        String sb2 = sb.toString();
        HandshakeImpl1Client handshakeImpl1Client = new HandshakeImpl1Client();
        handshakeImpl1Client.setResourceDescriptor(path);
        handshakeImpl1Client.put(HttpConstant.HOST, sb2);
        Map<String, String> map = this.j;
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                handshakeImpl1Client.put(entry.getKey(), entry.getValue());
            }
        }
        this.c.startHandshake(handshakeImpl1Client);
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.WebSocket
    public WebSocket.READYSTATE getReadyState() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WebSocket.READYSTATE) ipChange.ipc$dispatch("f03d3500", new Object[]{this}) : this.c.getReadyState();
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.WebSocketListener
    public final void onWebsocketMessage(WebSocket webSocket, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50f6af29", new Object[]{this, webSocket, str});
        } else {
            onMessage(str);
        }
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.WebSocketListener
    public final void onWebsocketMessage(WebSocket webSocket, ByteBuffer byteBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b116f92", new Object[]{this, webSocket, byteBuffer});
        } else {
            onMessage(byteBuffer);
        }
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.WebSocketAdapter, com.alipay.android.phone.mobilesdk.socketcraft.WebSocketListener
    public void onWebsocketMessageFragment(WebSocket webSocket, Framedata framedata) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69ae0c7d", new Object[]{this, webSocket, framedata});
        } else {
            onFragment(framedata);
        }
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.WebSocketListener
    public final void onWebsocketOpen(WebSocket webSocket, Handshakedata handshakedata) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58c91ca9", new Object[]{this, webSocket, handshakedata});
            return;
        }
        this.k.countDown();
        onOpen((ServerHandshake) handshakedata);
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.WebSocketListener
    public final void onWebsocketClose(WebSocket webSocket, int i, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("405de5b7", new Object[]{this, webSocket, new Integer(i), str, new Boolean(z)});
            return;
        }
        this.k.countDown();
        this.l.countDown();
        Thread thread = this.h;
        if (thread != null) {
            thread.interrupt();
        }
        try {
            if (this.d != null) {
                this.d.close();
            }
        } catch (IOException e) {
            onWebsocketError(this, e);
        }
        onClose(i, str, z);
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.WebSocketListener
    public final void onWebsocketError(WebSocket webSocket, Exception exc) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f48cd726", new Object[]{this, webSocket, exc});
        } else {
            onError(exc);
        }
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.WebSocketListener
    public void onWebsocketCloseInitiated(WebSocket webSocket, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d89a5b2", new Object[]{this, webSocket, new Integer(i), str});
        } else {
            onCloseInitiated(i, str);
        }
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.WebSocketListener
    public void onWebsocketClosing(WebSocket webSocket, int i, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a62f934", new Object[]{this, webSocket, new Integer(i), str, new Boolean(z)});
        } else {
            onClosing(i, str, z);
        }
    }

    public WebSocket getConnection() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WebSocket) ipChange.ipc$dispatch("34185df4", new Object[]{this}) : this.c;
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.WebSocketListener
    public InetSocketAddress getLocalSocketAddress(WebSocket webSocket) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InetSocketAddress) ipChange.ipc$dispatch("f6d73acb", new Object[]{this, webSocket});
        }
        Socket socket = this.d;
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
        Socket socket = this.d;
        if (socket == null) {
            return null;
        }
        return (InetSocketAddress) socket.getRemoteSocketAddress();
    }

    /* loaded from: classes3.dex */
    public class WebsocketWriteThread implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private WebsocketWriteThread() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Thread.currentThread().setName("WebsocketWriteThread");
            while (!Thread.interrupted()) {
                try {
                    ByteBuffer take = WebSocketClient.a(WebSocketClient.this).outQueue.take();
                    WebSocketClient.b(WebSocketClient.this).write(take.array(), 0, take.limit());
                    WebSocketClient.b(WebSocketClient.this).flush();
                } catch (IOException unused) {
                    WebSocketClient.a(WebSocketClient.this).eot();
                    return;
                } catch (InterruptedException unused2) {
                    return;
                }
            }
        }
    }

    public void setProxy(Proxy proxy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd032e53", new Object[]{this, proxy});
        } else if (proxy == null) {
            throw new IllegalArgumentException();
        } else {
            this.g = proxy;
        }
    }

    public void setSocket(Socket socket) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2bd1933", new Object[]{this, socket});
        } else if (this.d != null) {
            throw new IllegalStateException("socket has already been set");
        } else {
            this.d = socket;
        }
    }

    public void setSslSocketFactory(SSLSocketFactory sSLSocketFactory) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f41164a", new Object[]{this, sSLSocketFactory});
        } else {
            this.n = sSLSocketFactory;
        }
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.WebSocket
    public void sendFragmentedFrame(Framedata.Opcode opcode, ByteBuffer byteBuffer, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b4eab6", new Object[]{this, opcode, byteBuffer, new Boolean(z)});
        } else {
            this.c.sendFragmentedFrame(opcode, byteBuffer, z);
        }
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.WebSocket
    public boolean isOpen() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b2911d1f", new Object[]{this})).booleanValue() : this.c.isOpen();
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.WebSocket
    public boolean isFlushAndClose() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3388386", new Object[]{this})).booleanValue() : this.c.isFlushAndClose();
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.WebSocket
    public boolean isClosed() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6afccc1", new Object[]{this})).booleanValue() : this.c.isClosed();
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.WebSocket
    public boolean isClosing() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b7191b36", new Object[]{this})).booleanValue() : this.c.isClosing();
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.WebSocket
    public boolean isConnecting() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f0376f0d", new Object[]{this})).booleanValue() : this.c.isConnecting();
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.WebSocket
    public boolean hasBufferedData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("955097ee", new Object[]{this})).booleanValue() : this.c.hasBufferedData();
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.WebSocket
    public void close(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82499c64", new Object[]{this, new Integer(i)});
        } else {
            this.c.close();
        }
    }

    public void close(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8eedf52e", new Object[]{this, new Integer(i), str});
        } else {
            this.c.close(i, str);
        }
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.WebSocket
    public void closeConnection(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ed9f270", new Object[]{this, new Integer(i), str});
        } else {
            this.c.closeConnection(i, str);
        }
    }

    public void send(ByteBuffer byteBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("652184a2", new Object[]{this, byteBuffer});
        } else {
            this.c.send(byteBuffer);
        }
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.WebSocket
    public void sendFrame(Framedata framedata) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8da45f7a", new Object[]{this, framedata});
        } else {
            this.c.sendFrame(framedata);
        }
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.WebSocket
    public InetSocketAddress getLocalSocketAddress() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (InetSocketAddress) ipChange.ipc$dispatch("12ea2804", new Object[]{this}) : this.c.getLocalSocketAddress();
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.WebSocket
    public InetSocketAddress getRemoteSocketAddress() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (InetSocketAddress) ipChange.ipc$dispatch("f283cf0b", new Object[]{this}) : this.c.getRemoteSocketAddress();
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.WebSocket
    public String getResourceDescriptor() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2af5ecc6", new Object[]{this}) : this.f5104a.getPath();
    }
}
