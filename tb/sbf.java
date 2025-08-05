package tb;

import anet.channel.util.HttpConstant;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.URI;
import java.nio.ByteBuffer;
import java.nio.channels.NotYetConnectedException;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLException;
import org.java_websocket.WebSocket;
import org.java_websocket.d;
import org.java_websocket.drafts.Draft;
import org.java_websocket.exceptions.InvalidHandshakeException;
import org.java_websocket.framing.Framedata;

/* loaded from: classes9.dex */
public abstract class sbf extends org.java_websocket.a implements Runnable, WebSocket {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private CountDownLatch closeLatch;
    private CountDownLatch connectLatch;
    private Thread connectReadThread;
    private int connectTimeout;
    private Draft draft;
    private d engine;
    private Map<String, String> headers;
    private OutputStream ostream;
    private Proxy proxy;
    private Socket socket;
    public URI uri;
    private Thread writeThread;

    public static /* synthetic */ Object ipc$super(sbf sbfVar, String str, Object... objArr) {
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

    public abstract void onError(Exception exc);

    @Deprecated
    public void onFragment(Framedata framedata) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3cb89cd", new Object[]{this, framedata});
        }
    }

    public abstract void onMessage(String str);

    public void onMessage(ByteBuffer byteBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29e36702", new Object[]{this, byteBuffer});
        }
    }

    public abstract void onOpen(sbp sbpVar);

    @Override // org.java_websocket.e
    public final void onWriteDemand(WebSocket webSocket) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe48f9d4", new Object[]{this, webSocket});
        }
    }

    public static /* synthetic */ d access$100(sbf sbfVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("35d050ca", new Object[]{sbfVar}) : sbfVar.engine;
    }

    public static /* synthetic */ OutputStream access$200(sbf sbfVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (OutputStream) ipChange.ipc$dispatch("6d539c76", new Object[]{sbfVar}) : sbfVar.ostream;
    }

    public static /* synthetic */ void access$300(sbf sbfVar, IOException iOException) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7486cbc1", new Object[]{sbfVar, iOException});
        } else {
            sbfVar.handleIOException(iOException);
        }
    }

    public static /* synthetic */ void access$400(sbf sbfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3756094", new Object[]{sbfVar});
        } else {
            sbfVar.closeSocket();
        }
    }

    public static /* synthetic */ Thread access$502(sbf sbfVar, Thread thread) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Thread) ipChange.ipc$dispatch("bd66817f", new Object[]{sbfVar, thread});
        }
        sbfVar.writeThread = thread;
        return thread;
    }

    public sbf(URI uri) {
        this(uri, new org.java_websocket.drafts.a());
    }

    public sbf(URI uri, Draft draft) {
        this(uri, draft, null, 0);
    }

    public sbf(URI uri, Map<String, String> map) {
        this(uri, new org.java_websocket.drafts.a(), map);
    }

    public sbf(URI uri, Draft draft, Map<String, String> map) {
        this(uri, draft, map, 0);
    }

    public sbf(URI uri, Draft draft, Map<String, String> map, int i) {
        this.uri = null;
        this.engine = null;
        this.socket = null;
        this.proxy = Proxy.NO_PROXY;
        this.connectLatch = new CountDownLatch(1);
        this.closeLatch = new CountDownLatch(1);
        this.connectTimeout = 0;
        if (uri != null) {
            if (draft == null) {
                throw new IllegalArgumentException("null as draft is permitted for `WebSocketServer` only!");
            }
            this.uri = uri;
            this.draft = draft;
            this.headers = map;
            this.connectTimeout = i;
            setTcpNoDelay(false);
            setReuseAddr(false);
            this.engine = new d(this, draft);
            return;
        }
        throw new IllegalArgumentException();
    }

    public URI getURI() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (URI) ipChange.ipc$dispatch("8e1ee1b", new Object[]{this}) : this.uri;
    }

    @Override // org.java_websocket.WebSocket
    public Draft getDraft() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Draft) ipChange.ipc$dispatch("56954f65", new Object[]{this}) : this.draft;
    }

    public Socket getSocket() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Socket) ipChange.ipc$dispatch("d1f9228f", new Object[]{this}) : this.socket;
    }

    public void reconnect() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a61e9c5e", new Object[]{this});
            return;
        }
        reset();
        connect();
    }

    public boolean reconnectBlocking() throws InterruptedException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("26147337", new Object[]{this})).booleanValue();
        }
        reset();
        return connectBlocking();
    }

    private void reset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
            return;
        }
        Thread currentThread = Thread.currentThread();
        if (currentThread == this.writeThread || currentThread == this.connectReadThread) {
            throw new IllegalStateException("You cannot initialize a reconnect out of the websocket thread. Use reconnect in another thread to insure a successful cleanup.");
        }
        try {
            closeBlocking();
            if (this.writeThread != null) {
                this.writeThread.interrupt();
                this.writeThread = null;
            }
            if (this.connectReadThread != null) {
                this.connectReadThread.interrupt();
                this.connectReadThread = null;
            }
            this.draft.a();
            if (this.socket != null) {
                this.socket.close();
                this.socket = null;
            }
            this.connectLatch = new CountDownLatch(1);
            this.closeLatch = new CountDownLatch(1);
            this.engine = new d(this, this.draft);
        } catch (Exception e) {
            onError(e);
            this.engine.closeConnection(1006, e.getMessage());
        }
    }

    public void connect() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66af7871", new Object[]{this});
        } else if (this.connectReadThread != null) {
            throw new IllegalStateException("WebSocketClient objects are not reuseable");
        } else {
            this.connectReadThread = new Thread(this);
            Thread thread = this.connectReadThread;
            thread.setName("WebSocketConnectReadThread-" + this.connectReadThread.getId());
            this.connectReadThread.start();
        }
    }

    public boolean connectBlocking() throws InterruptedException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("271d8c4a", new Object[]{this})).booleanValue();
        }
        connect();
        this.connectLatch.await();
        return this.engine.isOpen();
    }

    public boolean connectBlocking(long j, TimeUnit timeUnit) throws InterruptedException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b6fa013e", new Object[]{this, new Long(j), timeUnit})).booleanValue();
        }
        connect();
        return this.connectLatch.await(j, timeUnit) && this.engine.isOpen();
    }

    public void close() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
        } else if (this.writeThread == null) {
        } else {
            this.engine.close(1000);
        }
    }

    public void closeBlocking() throws InterruptedException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf49cc54", new Object[]{this});
            return;
        }
        close();
        this.closeLatch.await();
    }

    @Override // org.java_websocket.WebSocket
    public void send(String str) throws NotYetConnectedException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16953419", new Object[]{this, str});
        } else {
            this.engine.send(str);
        }
    }

    public void send(byte[] bArr) throws NotYetConnectedException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d98afd16", new Object[]{this, bArr});
        } else {
            this.engine.a(bArr);
        }
    }

    public <T> T getAttachment() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("c2c41a12", new Object[]{this}) : (T) this.engine.l();
    }

    public <T> void setAttachment(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24c04608", new Object[]{this, t});
        } else {
            this.engine.a((d) t);
        }
    }

    @Override // org.java_websocket.a
    public Collection<WebSocket> getConnections() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Collection) ipChange.ipc$dispatch("cc248f61", new Object[]{this}) : Collections.singletonList(this.engine);
    }

    public void sendPing() throws NotYetConnectedException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff9428a1", new Object[]{this});
        } else {
            this.engine.c();
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z;
        int read;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        try {
            if (this.socket == null) {
                this.socket = new Socket(this.proxy);
                z = true;
            } else if (this.socket.isClosed()) {
                throw new IOException();
            } else {
                z = false;
            }
            this.socket.setTcpNoDelay(isTcpNoDelay());
            this.socket.setReuseAddress(isReuseAddr());
            if (!this.socket.isBound()) {
                this.socket.connect(new InetSocketAddress(this.uri.getHost(), getPort()), this.connectTimeout);
            }
            if (z && "wss".equals(this.uri.getScheme())) {
                SSLContext sSLContext = SSLContext.getInstance("TLS");
                sSLContext.init(null, null, null);
                this.socket = sSLContext.getSocketFactory().createSocket(this.socket, this.uri.getHost(), getPort(), true);
            }
            InputStream inputStream = this.socket.getInputStream();
            this.ostream = this.socket.getOutputStream();
            sendHandshake();
            this.writeThread = new Thread(new a());
            this.writeThread.start();
            byte[] bArr = new byte[d.f25078a];
            while (!isClosing() && !isClosed() && (read = inputStream.read(bArr)) != -1) {
                try {
                    this.engine.a(ByteBuffer.wrap(bArr, 0, read));
                } catch (IOException e) {
                    handleIOException(e);
                } catch (RuntimeException e2) {
                    onError(e2);
                    this.engine.closeConnection(1006, e2.getMessage());
                }
            }
            this.engine.b();
            this.connectReadThread = null;
        } catch (Exception e3) {
            onWebsocketError(this.engine, e3);
            this.engine.closeConnection(-1, e3.getMessage());
        }
    }

    private int getPort() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a73231f1", new Object[]{this})).intValue();
        }
        int port = this.uri.getPort();
        if (port != -1) {
            return port;
        }
        String scheme = this.uri.getScheme();
        if ("wss".equals(scheme)) {
            return 443;
        }
        if ("ws".equals(scheme)) {
            return 80;
        }
        throw new IllegalArgumentException("unknown scheme: " + scheme);
    }

    private void sendHandshake() throws InvalidHandshakeException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d940a56", new Object[]{this});
            return;
        }
        String rawPath = this.uri.getRawPath();
        String rawQuery = this.uri.getRawQuery();
        if (rawPath == null || rawPath.length() == 0) {
            rawPath = "/";
        }
        if (rawQuery != null) {
            rawPath = rawPath + riy.CONDITION_IF + rawQuery;
        }
        int port = getPort();
        StringBuilder sb = new StringBuilder();
        sb.append(this.uri.getHost());
        sb.append((port == 80 || port == 443) ? "" : ":" + port);
        String sb2 = sb.toString();
        sbl sblVar = new sbl();
        sblVar.a(rawPath);
        sblVar.a(HttpConstant.HOST, sb2);
        Map<String, String> map = this.headers;
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                sblVar.a(entry.getKey(), entry.getValue());
            }
        }
        this.engine.a((sbj) sblVar);
    }

    public WebSocket.READYSTATE getReadyState() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WebSocket.READYSTATE) ipChange.ipc$dispatch("bf1383d7", new Object[]{this}) : this.engine.g();
    }

    @Override // org.java_websocket.e
    public final void onWebsocketMessage(WebSocket webSocket, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14641332", new Object[]{this, webSocket, str});
        } else {
            onMessage(str);
        }
    }

    @Override // org.java_websocket.e
    public final void onWebsocketMessage(WebSocket webSocket, ByteBuffer byteBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51fda2e9", new Object[]{this, webSocket, byteBuffer});
        } else {
            onMessage(byteBuffer);
        }
    }

    @Override // org.java_websocket.c
    public void onWebsocketMessageFragment(WebSocket webSocket, Framedata framedata) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dcb7ccf", new Object[]{this, webSocket, framedata});
        } else {
            onFragment(framedata);
        }
    }

    @Override // org.java_websocket.e
    public final void onWebsocketOpen(WebSocket webSocket, sbn sbnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2775ba8c", new Object[]{this, webSocket, sbnVar});
            return;
        }
        startConnectionLostTimer();
        onOpen((sbp) sbnVar);
        this.connectLatch.countDown();
    }

    @Override // org.java_websocket.e
    public final void onWebsocketClose(WebSocket webSocket, int i, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("271d2f00", new Object[]{this, webSocket, new Integer(i), str, new Boolean(z)});
            return;
        }
        stopConnectionLostTimer();
        Thread thread = this.writeThread;
        if (thread != null) {
            thread.interrupt();
        }
        onClose(i, str, z);
        this.connectLatch.countDown();
        this.closeLatch.countDown();
    }

    @Override // org.java_websocket.e
    public final void onWebsocketError(WebSocket webSocket, Exception exc) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("812ffefd", new Object[]{this, webSocket, exc});
        } else {
            onError(exc);
        }
    }

    @Override // org.java_websocket.e
    public void onWebsocketCloseInitiated(WebSocket webSocket, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("751320c9", new Object[]{this, webSocket, new Integer(i), str});
        } else {
            onCloseInitiated(i, str);
        }
    }

    @Override // org.java_websocket.e
    public void onWebsocketClosing(WebSocket webSocket, int i, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0d6ffd", new Object[]{this, webSocket, new Integer(i), str, new Boolean(z)});
        } else {
            onClosing(i, str, z);
        }
    }

    public WebSocket getConnection() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WebSocket) ipChange.ipc$dispatch("d5b1c77d", new Object[]{this}) : this.engine;
    }

    @Override // org.java_websocket.e
    public InetSocketAddress getLocalSocketAddress(WebSocket webSocket) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InetSocketAddress) ipChange.ipc$dispatch("20fd5b62", new Object[]{this, webSocket});
        }
        Socket socket = this.socket;
        if (socket == null) {
            return null;
        }
        return (InetSocketAddress) socket.getLocalSocketAddress();
    }

    @Override // org.java_websocket.e
    public InetSocketAddress getRemoteSocketAddress(WebSocket webSocket) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InetSocketAddress) ipChange.ipc$dispatch("dbd63c29", new Object[]{this, webSocket});
        }
        Socket socket = this.socket;
        if (socket == null) {
            return null;
        }
        return (InetSocketAddress) socket.getRemoteSocketAddress();
    }

    /* loaded from: classes9.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Thread currentThread = Thread.currentThread();
            currentThread.setName("WebSocketWriteThread-" + Thread.currentThread().getId());
            while (true) {
                try {
                    try {
                        if (Thread.interrupted()) {
                            break;
                        }
                        ByteBuffer take = sbf.access$100(sbf.this).c.take();
                        sbf.access$200(sbf.this).write(take.array(), 0, take.limit());
                        sbf.access$200(sbf.this).flush();
                    } catch (IOException e) {
                        sbf.access$300(sbf.this, e);
                        return;
                    } finally {
                        sbf.access$400(sbf.this);
                        sbf.access$502(sbf.this, null);
                    }
                } catch (InterruptedException unused) {
                    for (ByteBuffer byteBuffer : sbf.access$100(sbf.this).c) {
                        sbf.access$200(sbf.this).write(byteBuffer.array(), 0, byteBuffer.limit());
                        sbf.access$200(sbf.this).flush();
                    }
                }
            }
        }
    }

    private void closeSocket() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fdf5692", new Object[]{this});
            return;
        }
        try {
            if (this.socket == null) {
                return;
            }
            this.socket.close();
        } catch (IOException e) {
            onWebsocketError(this, e);
        }
    }

    public void setProxy(Proxy proxy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd032e53", new Object[]{this, proxy});
        } else if (proxy == null) {
            throw new IllegalArgumentException();
        } else {
            this.proxy = proxy;
        }
    }

    public void setSocket(Socket socket) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2bd1933", new Object[]{this, socket});
        } else if (this.socket != null) {
            throw new IllegalStateException("socket has already been set");
        } else {
            this.socket = socket;
        }
    }

    public void sendFragmentedFrame(Framedata.Opcode opcode, ByteBuffer byteBuffer, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5c5e78d", new Object[]{this, opcode, byteBuffer, new Boolean(z)});
        } else {
            this.engine.a(opcode, byteBuffer, z);
        }
    }

    @Override // org.java_websocket.WebSocket
    public boolean isOpen() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b2911d1f", new Object[]{this})).booleanValue() : this.engine.isOpen();
    }

    public boolean isFlushAndClose() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3388386", new Object[]{this})).booleanValue() : this.engine.f();
    }

    @Override // org.java_websocket.WebSocket
    public boolean isClosed() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6afccc1", new Object[]{this})).booleanValue() : this.engine.isClosed();
    }

    @Override // org.java_websocket.WebSocket
    public boolean isClosing() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b7191b36", new Object[]{this})).booleanValue() : this.engine.isClosing();
    }

    @Deprecated
    public boolean isConnecting() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f0376f0d", new Object[]{this})).booleanValue() : this.engine.e();
    }

    public boolean hasBufferedData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("955097ee", new Object[]{this})).booleanValue() : this.engine.d();
    }

    @Override // org.java_websocket.WebSocket
    public void close(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82499c64", new Object[]{this, new Integer(i)});
        } else {
            this.engine.h();
        }
    }

    public void close(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8eedf52e", new Object[]{this, new Integer(i), str});
        } else {
            this.engine.a(i, str);
        }
    }

    @Override // org.java_websocket.WebSocket
    public void closeConnection(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ed9f270", new Object[]{this, new Integer(i), str});
        } else {
            this.engine.closeConnection(i, str);
        }
    }

    public void send(ByteBuffer byteBuffer) throws IllegalArgumentException, NotYetConnectedException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("652184a2", new Object[]{this, byteBuffer});
        } else {
            this.engine.b(byteBuffer);
        }
    }

    @Override // org.java_websocket.WebSocket
    public void sendFrame(Framedata framedata) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15aeafc3", new Object[]{this, framedata});
        } else {
            this.engine.sendFrame(framedata);
        }
    }

    @Override // org.java_websocket.WebSocket
    public void sendFrame(Collection<Framedata> collection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("830be57d", new Object[]{this, collection});
        } else {
            this.engine.sendFrame(collection);
        }
    }

    @Override // org.java_websocket.WebSocket
    public InetSocketAddress getLocalSocketAddress() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (InetSocketAddress) ipChange.ipc$dispatch("12ea2804", new Object[]{this}) : this.engine.getLocalSocketAddress();
    }

    @Override // org.java_websocket.WebSocket
    public InetSocketAddress getRemoteSocketAddress() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (InetSocketAddress) ipChange.ipc$dispatch("f283cf0b", new Object[]{this}) : this.engine.getRemoteSocketAddress();
    }

    public String getResourceDescriptor() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2af5ecc6", new Object[]{this}) : this.uri.getPath();
    }

    private void handleIOException(IOException iOException) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89d2f28c", new Object[]{this, iOException});
            return;
        }
        if (iOException instanceof SSLException) {
            onError(iOException);
        }
        this.engine.b();
    }
}
