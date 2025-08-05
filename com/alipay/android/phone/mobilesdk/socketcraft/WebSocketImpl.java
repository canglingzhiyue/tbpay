package com.alipay.android.phone.mobilesdk.socketcraft;

import com.alipay.android.phone.mobilesdk.socketcraft.WebSocket;
import com.alipay.android.phone.mobilesdk.socketcraft.drafts.Draft;
import com.alipay.android.phone.mobilesdk.socketcraft.drafts.Draft_10;
import com.alipay.android.phone.mobilesdk.socketcraft.drafts.Draft_17;
import com.alipay.android.phone.mobilesdk.socketcraft.drafts.Draft_75;
import com.alipay.android.phone.mobilesdk.socketcraft.drafts.Draft_76;
import com.alipay.android.phone.mobilesdk.socketcraft.exceptions.IncompleteHandshakeException;
import com.alipay.android.phone.mobilesdk.socketcraft.exceptions.InvalidDataException;
import com.alipay.android.phone.mobilesdk.socketcraft.exceptions.InvalidHandshakeException;
import com.alipay.android.phone.mobilesdk.socketcraft.exceptions.WebsocketNotConnectedException;
import com.alipay.android.phone.mobilesdk.socketcraft.framing.CloseFrame;
import com.alipay.android.phone.mobilesdk.socketcraft.framing.CloseFrameBuilder;
import com.alipay.android.phone.mobilesdk.socketcraft.framing.Framedata;
import com.alipay.android.phone.mobilesdk.socketcraft.handshake.ClientHandshake;
import com.alipay.android.phone.mobilesdk.socketcraft.handshake.ClientHandshakeBuilder;
import com.alipay.android.phone.mobilesdk.socketcraft.handshake.Handshakedata;
import com.alipay.android.phone.mobilesdk.socketcraft.platform.logcat.SCLogCatUtil;
import com.alipay.android.phone.mobilesdk.socketcraft.util.Charsetfunctions;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.channels.SelectionKey;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import tb.riy;

/* loaded from: classes3.dex */
public class WebSocketImpl implements WebSocket {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "WebSocketImpl";
    public static final List<Draft> defaultdraftlist;
    private volatile boolean b;
    private WebSocket.READYSTATE c;
    public ByteChannel channel;
    private final WebSocketListener d;
    private List<Draft> e;
    private Draft f;
    private WebSocket.Role g;
    private Framedata.Opcode h;
    private ByteBuffer i;
    public final BlockingQueue<ByteBuffer> inQueue;
    private ClientHandshake j;
    private String k;
    public SelectionKey key;
    private Integer l;
    private Boolean m;
    private String n;
    public final BlockingQueue<ByteBuffer> outQueue;

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ boolean f5100a = !WebSocketImpl.class.desiredAssertionStatus();
    public static int RCVBUF = 16384;
    public static boolean DEBUG = true;

    static {
        ArrayList arrayList = new ArrayList(4);
        defaultdraftlist = arrayList;
        arrayList.add(new Draft_17());
        defaultdraftlist.add(new Draft_10());
        defaultdraftlist.add(new Draft_76());
        defaultdraftlist.add(new Draft_75());
    }

    public WebSocketImpl(WebSocketListener webSocketListener, List<Draft> list) {
        this(webSocketListener, (Draft) null);
        this.g = WebSocket.Role.SERVER;
        if (list == null || list.isEmpty()) {
            this.e = defaultdraftlist;
        } else {
            this.e = list;
        }
    }

    public WebSocketImpl(WebSocketListener webSocketListener, Draft draft) {
        this.b = false;
        this.c = WebSocket.READYSTATE.NOT_YET_CONNECTED;
        this.f = null;
        this.h = null;
        this.i = ByteBuffer.allocate(0);
        this.j = null;
        this.k = null;
        this.l = null;
        this.m = null;
        this.n = null;
        if (webSocketListener == null || (draft == null && this.g == WebSocket.Role.SERVER)) {
            throw new IllegalArgumentException("parameters must not be null");
        }
        this.outQueue = new LinkedBlockingQueue();
        this.inQueue = new LinkedBlockingQueue();
        this.d = webSocketListener;
        this.g = WebSocket.Role.CLIENT;
        if (draft == null) {
            return;
        }
        this.f = draft.copyInstance();
    }

    @Deprecated
    public WebSocketImpl(WebSocketListener webSocketListener, Draft draft, Socket socket) {
        this(webSocketListener, draft);
    }

    @Deprecated
    public WebSocketImpl(WebSocketListener webSocketListener, List<Draft> list, Socket socket) {
        this(webSocketListener, list);
    }

    public void decode(ByteBuffer byteBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c0a20fc", new Object[]{this, byteBuffer});
        } else if (!f5100a && !byteBuffer.hasRemaining()) {
            throw new AssertionError();
        } else {
            if (DEBUG) {
                StringBuilder sb = new StringBuilder("process(");
                sb.append(byteBuffer.remaining());
                sb.append("): {");
                sb.append(byteBuffer.remaining() > 1000 ? "too big to display" : new String(byteBuffer.array(), byteBuffer.position(), byteBuffer.remaining()));
                sb.append(riy.BLOCK_END_STR);
                SCLogCatUtil.debug(TAG, sb.toString());
            }
            if (this.c != WebSocket.READYSTATE.NOT_YET_CONNECTED) {
                b(byteBuffer);
            } else if (a(byteBuffer)) {
                if (!f5100a && this.i.hasRemaining() == byteBuffer.hasRemaining() && byteBuffer.hasRemaining()) {
                    throw new AssertionError();
                }
                if (byteBuffer.hasRemaining()) {
                    b(byteBuffer);
                } else if (this.i.hasRemaining()) {
                    b(this.i);
                }
            }
            if (!f5100a && !isClosing() && !isFlushAndClose() && byteBuffer.hasRemaining()) {
                throw new AssertionError();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:87:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean a(java.nio.ByteBuffer r12) {
        /*
            Method dump skipped, instructions count: 497
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.phone.mobilesdk.socketcraft.WebSocketImpl.a(java.nio.ByteBuffer):boolean");
    }

    private void b(ByteBuffer byteBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f3e1d08", new Object[]{this, byteBuffer});
            return;
        }
        try {
        } catch (InvalidDataException e) {
            this.d.onWebsocketError(this, e);
            close(e);
            return;
        }
        for (Framedata framedata : this.f.translateFrame(byteBuffer)) {
            if (DEBUG) {
                SCLogCatUtil.debug(TAG, "matched frame: " + framedata);
            }
            Framedata.Opcode opcode = framedata.getOpcode();
            boolean isFin = framedata.isFin();
            if (opcode == Framedata.Opcode.CLOSING) {
                int i = 1005;
                String str = "";
                if (framedata instanceof CloseFrame) {
                    CloseFrame closeFrame = (CloseFrame) framedata;
                    i = closeFrame.getCloseCode();
                    str = closeFrame.getMessage();
                }
                if (this.c == WebSocket.READYSTATE.CLOSING) {
                    a(i, str, true);
                } else if (this.f.getCloseHandshakeType() == Draft.CloseHandshakeType.TWOWAY) {
                    c(i, str, true);
                } else {
                    b(i, str, false);
                }
            } else if (opcode == Framedata.Opcode.PING) {
                this.d.onWebsocketPing(this, framedata);
            } else if (opcode == Framedata.Opcode.PONG) {
                this.d.onWebsocketPong(this, framedata);
            } else {
                if (isFin && opcode != Framedata.Opcode.CONTINUOUS) {
                    if (this.h != null) {
                        throw new InvalidDataException(1002, "Continuous frame sequence not completed.");
                    }
                    if (opcode == Framedata.Opcode.TEXT) {
                        try {
                            this.d.onWebsocketMessage(this, Charsetfunctions.stringUtf8(framedata.getPayloadData()));
                        } catch (RuntimeException e2) {
                            this.d.onWebsocketError(this, e2);
                        }
                    } else if (opcode == Framedata.Opcode.BINARY) {
                        try {
                            this.d.onWebsocketMessage(this, framedata.getPayloadData());
                        } catch (RuntimeException e3) {
                            this.d.onWebsocketError(this, e3);
                        }
                    } else {
                        throw new InvalidDataException(1002, "non control or continious frame expected");
                    }
                    this.d.onWebsocketError(this, e);
                    close(e);
                    return;
                }
                if (opcode != Framedata.Opcode.CONTINUOUS) {
                    if (this.h != null) {
                        throw new InvalidDataException(1002, "Previous continuous frame sequence not completed.");
                    }
                    this.h = opcode;
                } else if (isFin) {
                    if (this.h == null) {
                        throw new InvalidDataException(1002, "Continuous frame sequence was not started.");
                    }
                    this.h = null;
                } else if (this.h == null) {
                    throw new InvalidDataException(1002, "Continuous frame sequence was not started.");
                }
                try {
                    this.d.onWebsocketMessageFragment(this, framedata);
                } catch (RuntimeException e4) {
                    this.d.onWebsocketError(this, e4);
                }
            }
        }
    }

    private void c(int i, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("595b4d1", new Object[]{this, new Integer(i), str, new Boolean(z)});
        } else if (this.c == WebSocket.READYSTATE.CLOSING || this.c == WebSocket.READYSTATE.CLOSED) {
        } else {
            if (this.c == WebSocket.READYSTATE.OPEN) {
                if (i == 1006) {
                    if (!f5100a && z) {
                        throw new AssertionError();
                    }
                    this.c = WebSocket.READYSTATE.CLOSING;
                    b(i, str, false);
                    return;
                }
                if (this.f.getCloseHandshakeType() != Draft.CloseHandshakeType.NONE) {
                    if (!z) {
                        try {
                            try {
                                this.d.onWebsocketCloseInitiated(this, i, str);
                            } catch (RuntimeException e) {
                                this.d.onWebsocketError(this, e);
                            }
                        } catch (InvalidDataException e2) {
                            this.d.onWebsocketError(this, e2);
                            b(1006, "generated frame is invalid", false);
                        }
                    }
                    sendFrame(new CloseFrameBuilder(i, str));
                }
                b(i, str, z);
            } else if (i == -3) {
                if (!f5100a && !z) {
                    throw new AssertionError();
                }
                b(-3, str, true);
            } else {
                b(-1, str, false);
            }
            if (i == 1002) {
                b(i, str, z);
            }
            this.c = WebSocket.READYSTATE.CLOSING;
            this.i = null;
        }
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.WebSocket
    public void close(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8eedf52e", new Object[]{this, new Integer(i), str});
        } else {
            c(i, str, false);
        }
    }

    public synchronized void a(int i, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd351acf", new Object[]{this, new Integer(i), str, new Boolean(z)});
        } else if (this.c == WebSocket.READYSTATE.CLOSED) {
        } else {
            if (this.key != null) {
                this.key.cancel();
            }
            if (this.channel != null) {
                try {
                    this.channel.close();
                } catch (IOException e) {
                    this.d.onWebsocketError(this, e);
                }
            }
            try {
                this.d.onWebsocketClose(this, i, str, z);
            } catch (RuntimeException e2) {
                this.d.onWebsocketError(this, e2);
            }
            if (this.f != null) {
                this.f.reset();
            }
            this.j = null;
            this.c = WebSocket.READYSTATE.CLOSED;
            this.outQueue.clear();
        }
    }

    public void a(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c119299", new Object[]{this, new Integer(i), new Boolean(z)});
        } else {
            a(i, "", z);
        }
    }

    public void closeConnection() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48183c7d", new Object[]{this});
        } else if (this.m == null) {
            throw new IllegalStateException("this method must be used in conjuction with flushAndClose");
        } else {
            a(this.l.intValue(), this.k, this.m.booleanValue());
        }
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.WebSocket
    public void closeConnection(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ed9f270", new Object[]{this, new Integer(i), str});
        } else {
            a(i, str, false);
        }
    }

    public synchronized void b(int i, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("816567d0", new Object[]{this, new Integer(i), str, new Boolean(z)});
        } else if (this.b) {
        } else {
            this.l = Integer.valueOf(i);
            this.k = str;
            this.m = Boolean.valueOf(z);
            this.b = true;
            this.d.onWriteDemand(this);
            try {
                this.d.onWebsocketClosing(this, i, str, z);
            } catch (RuntimeException e) {
                this.d.onWebsocketError(this, e);
            }
            if (this.f != null) {
                this.f.reset();
            }
            this.j = null;
        }
    }

    public void eot() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2b77891", new Object[]{this});
        } else if (getReadyState() == WebSocket.READYSTATE.NOT_YET_CONNECTED) {
            a(-1, true);
        } else if (this.b) {
            a(this.l.intValue(), this.k, this.m.booleanValue());
        } else if (this.f.getCloseHandshakeType() == Draft.CloseHandshakeType.NONE) {
            a(1000, true);
        } else if (this.f.getCloseHandshakeType() == Draft.CloseHandshakeType.ONEWAY && this.g != WebSocket.Role.SERVER) {
            a(1000, true);
        } else {
            a(1006, true);
        }
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.WebSocket
    public void close(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82499c64", new Object[]{this, new Integer(i)});
        } else {
            c(i, "", false);
        }
    }

    public void close(InvalidDataException invalidDataException) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d0c1206", new Object[]{this, invalidDataException});
        } else {
            c(invalidDataException.getCloseCode(), invalidDataException.getMessage(), false);
        }
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.WebSocket
    public void send(String str) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16953419", new Object[]{this, str});
        } else if (str == null) {
            throw new IllegalArgumentException("Cannot send 'null' data to a WebSocketImpl.");
        } else {
            Draft draft = this.f;
            if (this.g != WebSocket.Role.CLIENT) {
                z = false;
            }
            a(draft.createFrames(str, z));
        }
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.WebSocket
    public void send(ByteBuffer byteBuffer) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("652184a2", new Object[]{this, byteBuffer});
        } else if (byteBuffer == null) {
            throw new IllegalArgumentException("Cannot send 'null' data to a WebSocketImpl.");
        } else {
            Draft draft = this.f;
            if (this.g != WebSocket.Role.CLIENT) {
                z = false;
            }
            a(draft.createFrames(byteBuffer, z));
        }
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.WebSocket
    public void send(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d98afd16", new Object[]{this, bArr});
        } else {
            send(ByteBuffer.wrap(bArr));
        }
    }

    private void a(Collection<Framedata> collection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2847c19", new Object[]{this, collection});
        } else if (!isOpen()) {
            throw new WebsocketNotConnectedException();
        } else {
            for (Framedata framedata : collection) {
                sendFrame(framedata);
            }
        }
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.WebSocket
    public void sendFragmentedFrame(Framedata.Opcode opcode, ByteBuffer byteBuffer, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b4eab6", new Object[]{this, opcode, byteBuffer, new Boolean(z)});
        } else {
            a(this.f.continuousFrame(opcode, byteBuffer, z));
        }
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.WebSocket
    public void sendFrame(Framedata framedata) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8da45f7a", new Object[]{this, framedata});
            return;
        }
        if (DEBUG) {
            SCLogCatUtil.debug(TAG, "send frame: " + framedata);
        }
        d(this.f.createBinaryFrame(framedata));
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.WebSocket
    public boolean hasBufferedData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("955097ee", new Object[]{this})).booleanValue() : !this.outQueue.isEmpty();
    }

    private Draft.HandshakeState c(ByteBuffer byteBuffer) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (Draft.HandshakeState) ipChange.ipc$dispatch("75c9e55", new Object[]{this, byteBuffer});
        }
        byteBuffer.mark();
        if (byteBuffer.limit() > Draft.FLASH_POLICY_REQUEST.length) {
            return Draft.HandshakeState.NOT_MATCHED;
        }
        if (byteBuffer.limit() < Draft.FLASH_POLICY_REQUEST.length) {
            throw new IncompleteHandshakeException(Draft.FLASH_POLICY_REQUEST.length);
        }
        while (byteBuffer.hasRemaining()) {
            if (Draft.FLASH_POLICY_REQUEST[i] != byteBuffer.get()) {
                byteBuffer.reset();
                return Draft.HandshakeState.NOT_MATCHED;
            }
            i++;
        }
        return Draft.HandshakeState.MATCHED;
    }

    public void startHandshake(ClientHandshakeBuilder clientHandshakeBuilder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3edf49ad", new Object[]{this, clientHandshakeBuilder});
        } else if (!f5100a && this.c == WebSocket.READYSTATE.CONNECTING) {
            throw new AssertionError("shall only be called once");
        } else {
            this.j = this.f.postProcessHandshakeRequestAsClient(clientHandshakeBuilder);
            this.n = clientHandshakeBuilder.getResourceDescriptor();
            if (!f5100a && this.n == null) {
                throw new AssertionError();
            }
            try {
                this.d.onWebsocketHandshakeSentAsClient(this, this.j);
                a(this.f.createHandshake(this.j, this.g));
            } catch (InvalidDataException unused) {
                throw new InvalidHandshakeException("Handshake data rejected by client.");
            } catch (RuntimeException e) {
                this.d.onWebsocketError(this, e);
                throw new InvalidHandshakeException("rejected because of" + e);
            }
        }
    }

    private void d(ByteBuffer byteBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32f0c346", new Object[]{this, byteBuffer});
            return;
        }
        if (DEBUG) {
            StringBuilder sb = new StringBuilder("write(");
            sb.append(byteBuffer.remaining());
            sb.append("): {");
            sb.append(byteBuffer.remaining() > 1000 ? "too big to display" : new String(byteBuffer.array()));
            sb.append(riy.BLOCK_END_STR);
            SCLogCatUtil.debug(TAG, sb.toString());
        }
        this.outQueue.add(byteBuffer);
        this.d.onWriteDemand(this);
    }

    private void a(List<ByteBuffer> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
            return;
        }
        for (ByteBuffer byteBuffer : list) {
            d(byteBuffer);
        }
    }

    private void a(Handshakedata handshakedata) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6928a65f", new Object[]{this, handshakedata});
            return;
        }
        if (DEBUG) {
            SCLogCatUtil.debug(TAG, "open using draft: " + this.f.getClass().getSimpleName());
        }
        this.c = WebSocket.READYSTATE.OPEN;
        try {
            this.d.onWebsocketOpen(this, handshakedata);
        } catch (RuntimeException e) {
            this.d.onWebsocketError(this, e);
        }
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.WebSocket
    public boolean isConnecting() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f0376f0d", new Object[]{this})).booleanValue();
        }
        if (!f5100a && this.b && this.c != WebSocket.READYSTATE.CONNECTING) {
            throw new AssertionError();
        }
        return this.c == WebSocket.READYSTATE.CONNECTING;
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.WebSocket
    public boolean isOpen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b2911d1f", new Object[]{this})).booleanValue();
        }
        if (!f5100a && this.c == WebSocket.READYSTATE.OPEN && this.b) {
            throw new AssertionError();
        }
        return this.c == WebSocket.READYSTATE.OPEN;
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.WebSocket
    public boolean isClosing() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b7191b36", new Object[]{this})).booleanValue() : this.c == WebSocket.READYSTATE.CLOSING;
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.WebSocket
    public boolean isFlushAndClose() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3388386", new Object[]{this})).booleanValue() : this.b;
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.WebSocket
    public boolean isClosed() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6afccc1", new Object[]{this})).booleanValue() : this.c == WebSocket.READYSTATE.CLOSED;
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.WebSocket
    public WebSocket.READYSTATE getReadyState() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WebSocket.READYSTATE) ipChange.ipc$dispatch("f03d3500", new Object[]{this}) : this.c;
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue() : super.hashCode();
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this}) : super.toString();
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.WebSocket
    public InetSocketAddress getRemoteSocketAddress() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (InetSocketAddress) ipChange.ipc$dispatch("f283cf0b", new Object[]{this}) : this.d.getRemoteSocketAddress(this);
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.WebSocket
    public InetSocketAddress getLocalSocketAddress() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (InetSocketAddress) ipChange.ipc$dispatch("12ea2804", new Object[]{this}) : this.d.getLocalSocketAddress(this);
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.WebSocket
    public Draft getDraft() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Draft) ipChange.ipc$dispatch("b6ad590e", new Object[]{this}) : this.f;
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.WebSocket
    public void close() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
        } else {
            close(1000);
        }
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.WebSocket
    public String getResourceDescriptor() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2af5ecc6", new Object[]{this}) : this.n;
    }
}
