package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;
import java.io.PrintStream;
import java.lang.Thread;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.channels.CancelledKeyException;
import java.nio.channels.SelectableChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.java_websocket.WebSocket;
import org.java_websocket.d;
import org.java_websocket.drafts.Draft;
import org.java_websocket.exceptions.InvalidDataException;
import org.java_websocket.exceptions.WebsocketNotConnectedException;
import org.java_websocket.f;
import org.java_websocket.framing.Framedata;

/* loaded from: classes9.dex */
public abstract class sbu extends org.java_websocket.a implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public List<a> b;
    private final Collection<WebSocket> d;
    private final InetSocketAddress e;
    private ServerSocketChannel f;
    private Selector g;
    private List<Draft> h;
    private Thread i;
    private final AtomicBoolean j;
    private List<d> k;
    private BlockingQueue<ByteBuffer> l;
    private int m;
    private final AtomicInteger n;
    private f o;
    public static final /* synthetic */ boolean c = !sbu.class.desiredAssertionStatus();

    /* renamed from: a  reason: collision with root package name */
    public static int f33461a = Runtime.getRuntime().availableProcessors();

    public static /* synthetic */ Object ipc$super(sbu sbuVar, String str, Object... objArr) {
        if (str.hashCode() == -50634503) {
            return super.onWebsocketHandshakeReceivedAsServer((WebSocket) objArr[0], (Draft) objArr[1], (sbi) objArr[2]);
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public abstract void a();

    public abstract void a(WebSocket webSocket, int i, String str, boolean z);

    public abstract void a(WebSocket webSocket, Exception exc);

    public abstract void a(WebSocket webSocket, String str);

    public abstract void a(WebSocket webSocket, sbi sbiVar);

    public boolean a(SelectionKey selectionKey) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4e11b111", new Object[]{this, selectionKey})).booleanValue();
        }
        return true;
    }

    @Override // org.java_websocket.e
    public void onWebsocketCloseInitiated(WebSocket webSocket, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("751320c9", new Object[]{this, webSocket, new Integer(i), str});
        }
    }

    @Override // org.java_websocket.e
    public void onWebsocketClosing(WebSocket webSocket, int i, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0d6ffd", new Object[]{this, webSocket, new Integer(i), str, new Boolean(z)});
        }
    }

    @Override // org.java_websocket.e
    public final void onWebsocketMessage(WebSocket webSocket, ByteBuffer byteBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51fda2e9", new Object[]{this, webSocket, byteBuffer});
        }
    }

    @Override // org.java_websocket.c
    @Deprecated
    public void onWebsocketMessageFragment(WebSocket webSocket, Framedata framedata) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dcb7ccf", new Object[]{this, webSocket, framedata});
        }
    }

    public static /* synthetic */ void a(sbu sbuVar, ByteBuffer byteBuffer) throws InterruptedException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3d1b77f", new Object[]{sbuVar, byteBuffer});
        } else {
            sbuVar.a(byteBuffer);
        }
    }

    public static /* synthetic */ void a(sbu sbuVar, WebSocket webSocket, Exception exc) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8b222d2", new Object[]{sbuVar, webSocket, exc});
        } else {
            sbuVar.b(webSocket, exc);
        }
    }

    public sbu() {
        this(new InetSocketAddress(80), f33461a, null);
    }

    public sbu(InetSocketAddress inetSocketAddress, List<Draft> list) {
        this(inetSocketAddress, f33461a, list);
    }

    public sbu(InetSocketAddress inetSocketAddress, int i, List<Draft> list) {
        this(inetSocketAddress, i, list, new HashSet());
    }

    public sbu(InetSocketAddress inetSocketAddress, int i, List<Draft> list, Collection<WebSocket> collection) {
        this.j = new AtomicBoolean(false);
        this.m = 0;
        this.n = new AtomicInteger(0);
        this.o = new sbt();
        if (inetSocketAddress == null || i <= 0 || collection == null) {
            throw new IllegalArgumentException("address and connectionscontainer must not be null and you need at least 1 decoder");
        }
        if (list == null) {
            this.h = Collections.emptyList();
        } else {
            this.h = list;
        }
        this.e = inetSocketAddress;
        this.d = collection;
        setTcpNoDelay(false);
        setReuseAddr(false);
        this.k = new LinkedList();
        this.b = new ArrayList(i);
        this.l = new LinkedBlockingQueue();
        for (int i2 = 0; i2 < i; i2++) {
            a aVar = new a();
            this.b.add(aVar);
            aVar.start();
        }
    }

    public void a(int i) throws InterruptedException {
        ArrayList<WebSocket> arrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else if (this.j.compareAndSet(false, true)) {
            synchronized (this.d) {
                arrayList = new ArrayList(this.d);
            }
            for (WebSocket webSocket : arrayList) {
                webSocket.close(1001);
            }
            synchronized (this) {
                if (this.i != null && this.g != null) {
                    this.g.wakeup();
                    this.i.join(i);
                }
            }
        }
    }

    public void b() throws IOException, InterruptedException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            a(0);
        }
    }

    @Override // org.java_websocket.a
    public Collection<WebSocket> getConnections() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Collection) ipChange.ipc$dispatch("cc248f61", new Object[]{this}) : Collections.unmodifiableCollection(new ArrayList(this.d));
    }

    /* JADX WARN: Removed duplicated region for block: B:133:0x0232 A[Catch: all -> 0x02a3, RuntimeException -> 0x02a5, TRY_ENTER, TryCatch #5 {RuntimeException -> 0x02a5, blocks: (B:17:0x0083, B:20:0x008d, B:23:0x0096, B:25:0x009f, B:27:0x00a7, B:28:0x00a9, B:30:0x00b5, B:32:0x00bb, B:33:0x00c1, B:35:0x00c7, B:37:0x00cd, B:39:0x00d3, B:40:0x00d8, B:42:0x00e0, B:43:0x0101, B:46:0x0114, B:48:0x0118, B:49:0x011d, B:50:0x0124, B:52:0x012a, B:53:0x0131, B:56:0x013b, B:57:0x013e, B:59:0x0148, B:61:0x0150, B:63:0x0156, B:65:0x0167, B:67:0x0171, B:75:0x0185, B:77:0x018b, B:78:0x0191, B:80:0x0199, B:82:0x019f, B:133:0x0232, B:134:0x0235, B:68:0x0177, B:69:0x017b, B:72:0x0180, B:73:0x0183, B:92:0x01b3, B:94:0x01bb, B:95:0x01c3, B:96:0x01cb, B:98:0x01d1, B:99:0x01d6, B:101:0x01dc, B:102:0x01e5, B:105:0x01eb, B:106:0x01ee), top: B:225:0x0083, outer: #0 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void run() {
        /*
            Method dump skipped, instructions count: 824
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.sbu.run():void");
    }

    public void a(WebSocket webSocket) throws InterruptedException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa59390a", new Object[]{this, webSocket});
        } else if (this.n.get() >= (this.b.size() * 2) + 1) {
        } else {
            this.n.incrementAndGet();
            this.l.put(c());
        }
    }

    public ByteBuffer c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ByteBuffer) ipChange.ipc$dispatch("3d7fafab", new Object[]{this}) : ByteBuffer.allocate(d.f25078a);
    }

    public void a(d dVar) throws InterruptedException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1468384d", new Object[]{this, dVar});
            return;
        }
        if (dVar.g == null) {
            List<a> list = this.b;
            dVar.g = list.get(this.m % list.size());
            this.m++;
        }
        dVar.g.a(dVar);
    }

    private ByteBuffer d() throws InterruptedException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ByteBuffer) ipChange.ipc$dispatch("c1affcac", new Object[]{this}) : this.l.take();
    }

    private void a(ByteBuffer byteBuffer) throws InterruptedException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d64c9e9", new Object[]{this, byteBuffer});
        } else if (this.l.size() > this.n.intValue()) {
        } else {
            this.l.put(byteBuffer);
        }
    }

    private void a(SelectionKey selectionKey, WebSocket webSocket, IOException iOException) {
        SelectableChannel channel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b4eca5", new Object[]{this, selectionKey, webSocket, iOException});
        } else if (webSocket != null) {
            webSocket.closeConnection(1006, iOException.getMessage());
        } else if (selectionKey == null || (channel = selectionKey.channel()) == null || !channel.isOpen()) {
        } else {
            try {
                channel.close();
            } catch (IOException unused) {
            }
            if (!d.b) {
                return;
            }
            PrintStream printStream = System.out;
            printStream.println("Connection closed because of " + iOException);
        }
    }

    private void b(WebSocket webSocket, Exception exc) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76b2f29b", new Object[]{this, webSocket, exc});
            return;
        }
        a(webSocket, exc);
        List<a> list = this.b;
        if (list != null) {
            for (a aVar : list) {
                aVar.interrupt();
            }
        }
        Thread thread = this.i;
        if (thread != null) {
            thread.interrupt();
        }
        try {
            b();
        } catch (IOException e) {
            a((WebSocket) null, e);
        } catch (InterruptedException e2) {
            Thread.currentThread().interrupt();
            a((WebSocket) null, e2);
        }
    }

    @Override // org.java_websocket.e
    public final void onWebsocketMessage(WebSocket webSocket, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14641332", new Object[]{this, webSocket, str});
        } else {
            a(webSocket, str);
        }
    }

    @Override // org.java_websocket.e
    public final void onWebsocketOpen(WebSocket webSocket, sbn sbnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2775ba8c", new Object[]{this, webSocket, sbnVar});
        } else if (!c(webSocket)) {
        } else {
            a(webSocket, (sbi) sbnVar);
        }
    }

    @Override // org.java_websocket.e
    public final void onWebsocketClose(WebSocket webSocket, int i, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("271d2f00", new Object[]{this, webSocket, new Integer(i), str, new Boolean(z)});
            return;
        }
        this.g.wakeup();
        if (!b(webSocket)) {
            return;
        }
        a(webSocket, i, str, z);
    }

    public boolean b(WebSocket webSocket) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1131f8cf", new Object[]{this, webSocket})).booleanValue();
        }
        synchronized (this.d) {
            if (this.d.contains(webSocket)) {
                z = this.d.remove(webSocket);
            } else if (d.b) {
                PrintStream printStream = System.out;
                printStream.println("Removing connection which is not in the connections collection! Possible no handshake recieved! " + webSocket);
            }
        }
        if (this.j.get() && this.d.size() == 0) {
            this.i.interrupt();
        }
        return z;
    }

    @Override // org.java_websocket.c, org.java_websocket.e
    public sbq onWebsocketHandshakeReceivedAsServer(WebSocket webSocket, Draft draft, sbi sbiVar) throws InvalidDataException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (sbq) ipChange.ipc$dispatch("fcfb60f9", new Object[]{this, webSocket, draft, sbiVar}) : super.onWebsocketHandshakeReceivedAsServer(webSocket, draft, sbiVar);
    }

    public boolean c(WebSocket webSocket) {
        boolean add;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("780ab890", new Object[]{this, webSocket})).booleanValue();
        }
        if (!this.j.get()) {
            synchronized (this.d) {
                add = this.d.add(webSocket);
                if (!c && !add) {
                    throw new AssertionError();
                }
            }
            return add;
        }
        webSocket.close(1001);
        return true;
    }

    @Override // org.java_websocket.e
    public final void onWebsocketError(WebSocket webSocket, Exception exc) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("812ffefd", new Object[]{this, webSocket, exc});
        } else {
            a(webSocket, exc);
        }
    }

    @Override // org.java_websocket.e
    public final void onWriteDemand(WebSocket webSocket) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe48f9d4", new Object[]{this, webSocket});
            return;
        }
        d dVar = (d) webSocket;
        try {
            dVar.e.interestOps(5);
        } catch (CancelledKeyException unused) {
            dVar.c.clear();
        }
        this.g.wakeup();
    }

    private Socket d(WebSocket webSocket) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Socket) ipChange.ipc$dispatch("53bbd66c", new Object[]{this, webSocket}) : ((SocketChannel) ((d) webSocket).e.channel()).socket();
    }

    @Override // org.java_websocket.e
    public InetSocketAddress getLocalSocketAddress(WebSocket webSocket) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (InetSocketAddress) ipChange.ipc$dispatch("20fd5b62", new Object[]{this, webSocket}) : (InetSocketAddress) d(webSocket).getLocalSocketAddress();
    }

    @Override // org.java_websocket.e
    public InetSocketAddress getRemoteSocketAddress(WebSocket webSocket) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (InetSocketAddress) ipChange.ipc$dispatch("dbd63c29", new Object[]{this, webSocket}) : (InetSocketAddress) d(webSocket).getRemoteSocketAddress();
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            a(str, this.d);
        }
    }

    public void a(String str, Collection<WebSocket> collection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fa00863", new Object[]{this, str, collection});
        } else if (str == null || collection == null) {
            throw new IllegalArgumentException();
        } else {
            HashMap hashMap = new HashMap();
            synchronized (collection) {
                for (WebSocket webSocket : collection) {
                    if (webSocket != null) {
                        Draft draft = webSocket.getDraft();
                        if (!hashMap.containsKey(draft)) {
                            hashMap.put(draft, draft.a(str, false));
                        }
                        try {
                            webSocket.sendFrame((Collection) hashMap.get(draft));
                        } catch (WebsocketNotConnectedException unused) {
                        }
                    }
                }
            }
        }
    }

    /* loaded from: classes9.dex */
    public class a extends Thread {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ boolean f33462a = !sbu.class.desiredAssertionStatus();
        private BlockingQueue<d> c = new LinkedBlockingQueue();

        public a() {
            setName("WebSocketWorker-" + getId());
            setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: tb.sbu.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Thread.UncaughtExceptionHandler
                public void uncaughtException(Thread thread, Throwable th) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("ca89fd43", new Object[]{this, thread, th});
                        return;
                    }
                    PrintStream printStream = System.err;
                    printStream.print("Uncaught exception in thread \"" + thread.getName() + "\":");
                    th.printStackTrace(System.err);
                }
            });
        }

        public void a(d dVar) throws InterruptedException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1468384d", new Object[]{this, dVar});
            } else {
                this.c.put(dVar);
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            d dVar;
            RuntimeException e;
            sbu sbuVar;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            d dVar2 = null;
            while (true) {
                try {
                    try {
                        dVar = this.c.take();
                        try {
                            ByteBuffer poll = dVar.d.poll();
                            if (!f33462a && poll == null) {
                                break;
                            }
                            try {
                                try {
                                    dVar.a(poll);
                                    sbuVar = sbu.this;
                                } catch (Exception e2) {
                                    PrintStream printStream = System.err;
                                    printStream.println("Error while reading from remote connection: " + e2);
                                    e2.printStackTrace();
                                    sbuVar = sbu.this;
                                }
                                sbu.a(sbuVar, poll);
                                dVar2 = dVar;
                            } catch (Throwable th) {
                                sbu.a(sbu.this, poll);
                                throw th;
                            }
                        } catch (RuntimeException e3) {
                            e = e3;
                            sbu.a(sbu.this, dVar, e);
                            return;
                        }
                    } catch (InterruptedException unused) {
                        return;
                    }
                } catch (RuntimeException e4) {
                    dVar = dVar2;
                    e = e4;
                }
            }
            throw new AssertionError();
        }
    }
}
