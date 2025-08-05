package com.alipay.android.phone.mobilesdk.socketcraft.api;

import com.alipay.android.phone.mobilesdk.socketcraft.client.WebSocketClient;
import com.alipay.android.phone.mobilesdk.socketcraft.drafts.Draft;
import com.alipay.android.phone.mobilesdk.socketcraft.drafts.Draft_17;
import com.alipay.android.phone.mobilesdk.socketcraft.framing.Framedata;
import com.alipay.android.phone.mobilesdk.socketcraft.handshake.ServerHandshake;
import com.alipay.android.phone.mobilesdk.socketcraft.monitor.DataflowMonitorModel;
import com.alipay.android.phone.mobilesdk.socketcraft.monitor.MonitorHelper;
import com.alipay.android.phone.mobilesdk.socketcraft.platform.logcat.SCLogCatUtil;
import com.alipay.android.phone.mobilesdk.socketcraft.platform.threadpool.SCNetworkAsyncTaskUtil;
import com.alipay.android.phone.mobilesdk.socketcraft.util.Charsetfunctions;
import com.alipay.android.phone.mobilesdk.socketcraft.util.WsMessageConstants;
import com.alipay.mobile.common.logging.util.perf.Constants;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.net.URI;
import java.nio.ByteBuffer;
import java.util.Map;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes3.dex */
public class DefaultWebSocketClient extends WebSocketClient {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DEFAULT_CONNECTION_TIMEOUT = 60000;
    public static final int MIN_CONNECTION_TIMEOUT = 4000;
    private WebSocketCallback c;
    private Framedata d;
    private String e;
    private long f;
    private ScheduledFuture<?> g;
    private WebSocketContext h;
    private MonitorHelper i;
    private boolean j;

    /* loaded from: classes3.dex */
    public class SCConnectionTimerRunnable implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private DefaultWebSocketClient b;
        public WebSocketCallback webSocketCallback;

        public SCConnectionTimerRunnable(DefaultWebSocketClient defaultWebSocketClient, WebSocketCallback webSocketCallback) {
            this.b = defaultWebSocketClient;
            this.webSocketCallback = webSocketCallback;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            SCLogCatUtil.error("SCConnectionTimerRunnable", "connect response time out");
            try {
                DefaultWebSocketClient.this.onError(WsMessageConstants.MSG_CONNECTION_TIME_OUT);
            } catch (Throwable th) {
                SCLogCatUtil.error("SCConnectionTimerRunnable", "onSocketError error", th);
            }
            try {
                this.b.close();
            } catch (Throwable th2) {
                SCLogCatUtil.error("SCConnectionTimerRunnable", "close socket error", th2);
            }
        }
    }

    public static /* synthetic */ Object ipc$super(DefaultWebSocketClient defaultWebSocketClient, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1897007826:
                super.close(((Number) objArr[0]).intValue(), (String) objArr[1]);
                return null;
            case -645202666:
                super.send((byte[]) objArr[0]);
                return null;
            case -483678593:
                super.close();
                return null;
            case 378876953:
                super.send((String) objArr[0]);
                return null;
            case 656247882:
                return new Boolean(super.connectBlocking());
            case 1696695458:
                super.send((ByteBuffer) objArr[0]);
                return null;
            case 1722775665:
                super.connect();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public DefaultWebSocketClient(URI uri, Draft draft, Map<String, String> map, int i, WebSocketCallback webSocketCallback, WebSocketContext webSocketContext) {
        super(uri, draft, map, i);
        this.j = false;
        this.c = webSocketCallback;
        this.e = uri.toString();
        this.h = webSocketContext;
        if (i > 4000) {
            this.f = i;
        } else {
            this.f = Constants.STARTUP_TIME_LEVEL_1;
        }
        this.i = new MonitorHelper(this);
    }

    public DefaultWebSocketClient(URI uri, Draft draft, Map<String, String> map, int i, WebSocketCallback webSocketCallback) {
        this(uri, draft, map, i, webSocketCallback, new BasicWebSocketContext());
    }

    public DefaultWebSocketClient(URI uri, Map<String, String> map, WebSocketCallback webSocketCallback) {
        this(uri, new Draft_17(), map, 60000, webSocketCallback);
    }

    public DefaultWebSocketClient(URI uri, Map<String, String> map, WebSocketCallback webSocketCallback, WebSocketContext webSocketContext) {
        this(uri, new Draft_17(), map, 60000, webSocketCallback, webSocketContext);
    }

    public void connectBlockingWithSSL() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f013302e", new Object[]{this});
            return;
        }
        setSslSocketFactory((SSLSocketFactory) SSLSocketFactory.getDefault());
        connectBlocking();
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.client.WebSocketClient
    public boolean connectBlocking() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("271d8c4a", new Object[]{this})).booleanValue();
        }
        c();
        return super.connectBlocking();
    }

    public void connectWithSSL() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43924da3", new Object[]{this});
            return;
        }
        setSslSocketFactory((SSLSocketFactory) SSLSocketFactory.getDefault());
        connect();
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.client.WebSocketClient
    public void connect() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66af7871", new Object[]{this});
            return;
        }
        c();
        super.connect();
        a();
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.client.WebSocketClient, com.alipay.android.phone.mobilesdk.socketcraft.WebSocket
    public void send(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16953419", new Object[]{this, str});
        } else if (str == null) {
            SCLogCatUtil.warn("WebSocketClient", "[send] text is null");
        } else {
            if (str.length() <= 0) {
                SCLogCatUtil.warn("WebSocketClient", "[send] text is empty, but continue send.");
            }
            super.send(str);
            this.i.recordMonitorOfSndMsg(str.length());
            this.i.noteTraficConsume(new DataflowMonitorModel(this.e, getBizUniqId(), "send", str.length(), 0));
        }
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.client.WebSocketClient, com.alipay.android.phone.mobilesdk.socketcraft.WebSocket
    public void send(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d98afd16", new Object[]{this, bArr});
        } else if (bArr == null || bArr.length <= 0) {
            SCLogCatUtil.warn("WebSocketClient", "[send] byte[] is null or length <= 0.");
        } else {
            super.send(bArr);
            this.i.recordMonitorOfSndMsg(bArr.length);
            this.i.noteTraficConsume(new DataflowMonitorModel(this.e, getBizUniqId(), "send", bArr.length, 0));
        }
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.client.WebSocketClient, com.alipay.android.phone.mobilesdk.socketcraft.WebSocket
    public void send(ByteBuffer byteBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("652184a2", new Object[]{this, byteBuffer});
        } else if (byteBuffer == null || byteBuffer.array().length <= 0) {
            SCLogCatUtil.warn("WebSocketClient", "[send] ByteBuffer is null or length <= 0.");
        } else {
            super.send(byteBuffer);
            this.i.recordMonitorOfSndMsg(byteBuffer.array().length);
            this.i.noteTraficConsume(new DataflowMonitorModel(this.e, getBizUniqId(), "send", byteBuffer.array().length, 0));
        }
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.client.WebSocketClient
    public void onDns(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f324c49", new Object[]{this, str, new Long(j)});
            return;
        }
        this.i.recordDnsTime(j);
        this.i.recordTargetHost(str);
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.client.WebSocketClient
    public void onTcpConnect(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3713a44b", new Object[]{this, str, new Long(j)});
            return;
        }
        this.i.recordTcpTime(j);
        this.i.recordTargetHost(str);
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.client.WebSocketClient
    public void onSSLHandshake(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("180eb693", new Object[]{this, new Long(j)});
        } else {
            this.i.recordSSLTime(j);
        }
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.client.WebSocketClient
    public void onWsHandshake(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("685f4781", new Object[]{this, new Long(j)});
            return;
        }
        SCLogCatUtil.info("WebSocketClient", "onWsHandshake cost: " + j);
        this.i.recordWsHsTime(j);
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.client.WebSocketClient
    public void onOpen(ServerHandshake serverHandshake) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db2ef614", new Object[]{this, serverHandshake});
            return;
        }
        d();
        b();
        SCLogCatUtil.info("WebSocketClient", String.format("onOpen. url is %s , state: opened", this.e));
        this.c.onSocketOpen();
        this.i.noteTraficConsume(new DataflowMonitorModel(this.e, getBizUniqId(), "connect", this.e.length() + WSContextConstant.HANDSHAKE_SEND_SIZE, WSContextConstant.HANDSHAKE_RECEIVE_SIZE));
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.client.WebSocketClient
    public void onMessage(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6056db9", new Object[]{this, str});
            return;
        }
        Object[] objArr = new Object[2];
        objArr[0] = this.e;
        objArr[1] = Integer.valueOf(str != null ? str.length() : -1);
        SCLogCatUtil.info("WebSocketClient", String.format("onMessage. url is %s ,socket onmessage length :%d", objArr));
        if (str == null || str.length() <= 0) {
            return;
        }
        this.c.onSocketMessage(str);
        this.i.recordMonitorOfRecvMsg(str.length());
        this.i.noteTraficConsume(new DataflowMonitorModel(this.e, getBizUniqId(), "receive", 0, str.length()));
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.client.WebSocketClient
    public void onMessage(ByteBuffer byteBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29e36702", new Object[]{this, byteBuffer});
            return;
        }
        Object[] objArr = new Object[2];
        objArr[0] = this.e;
        objArr[1] = Integer.valueOf(byteBuffer != null ? byteBuffer.position() : -1);
        SCLogCatUtil.info("WebSocketClient", String.format("onMessage. url is %s , socket onMessage buffer length : %d", objArr));
        if (byteBuffer == null) {
            return;
        }
        this.c.onSocketMessage(byteBuffer);
        this.i.recordMonitorOfRecvMsg(byteBuffer.position());
        this.i.noteTraficConsume(new DataflowMonitorModel(this.e, getBizUniqId(), "receive", 0, byteBuffer.array().length));
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.client.WebSocketClient
    public void onClose(int i, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ff565c7", new Object[]{this, new Integer(i), str, new Boolean(z)});
            return;
        }
        b();
        SCLogCatUtil.info("WebSocketClient", String.format("onClose. url is %s ,state: closed ,reason: %s, errCode = %d, remote = %s", this.e, str, Integer.valueOf(i), Boolean.toString(z)));
        if (!this.j && (i == -1 || i == -2 || i == -3)) {
            onError(str);
        } else {
            this.c.onSocketClose();
        }
        this.i.printDisconnMonitorLog();
        this.i.noteTraficConsume(new DataflowMonitorModel(this.e, getBizUniqId(), "close", 0, 0));
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.client.WebSocketClient
    public void onError(Exception exc) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b14ba516", new Object[]{this, exc});
            return;
        }
        SCLogCatUtil.error("WebSocketClient", String.format("onError. url is %s ,error is %s", this.e, exc.toString()), exc);
        onSocketError("exception: " + exc.getMessage());
    }

    public void onError(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac367d3a", new Object[]{this, str});
            return;
        }
        SCLogCatUtil.error("WebSocketClient", String.format("onError. url is %s ,error is %s", this.e, str));
        onSocketError(str);
    }

    public void onSocketError(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7adf907", new Object[]{this, str});
            return;
        }
        this.c.onSocketError(str);
        this.i.printErrorMonitorLog("1", str);
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.client.WebSocketClient
    public void onFragment(Framedata framedata) {
        Framedata framedata2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef752684", new Object[]{this, framedata});
        } else if (framedata.getOpcode() != Framedata.Opcode.CONTINUOUS && !framedata.isFin()) {
            this.d = framedata;
        } else if (framedata.getOpcode() != Framedata.Opcode.CONTINUOUS || (framedata2 = this.d) == null) {
        } else {
            if (framedata2.getPayloadData().position() > 10485760) {
                SCLogCatUtil.warn("WebSocketClient", "onFragment. Pending frame exploded");
                onError(new RuntimeException(WsMessageConstants.MSG_PENDING_FRAME_EXPLODED));
                close();
                this.d = null;
                return;
            }
            try {
                this.d.append(framedata);
            } catch (Throwable th) {
                SCLogCatUtil.warn("WebSocketClient", "onFragment. append frame err. ", th);
            }
            if (!framedata.isFin()) {
                return;
            }
            if (this.d.getOpcode() == Framedata.Opcode.BINARY) {
                onMessage(this.d.getPayloadData());
            } else if (this.d.getOpcode() == Framedata.Opcode.TEXT) {
                try {
                    String stringUtf8 = Charsetfunctions.stringUtf8(this.d.getPayloadData());
                    if (stringUtf8 == null) {
                        stringUtf8 = "";
                    }
                    onMessage(stringUtf8);
                } catch (Throwable th2) {
                    SCLogCatUtil.warn("WebSocketClient", "onFragment. ByteBuffer to String err ", th2);
                }
            }
            this.d = null;
        }
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.client.WebSocketClient, com.alipay.android.phone.mobilesdk.socketcraft.WebSocket
    public void close() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
            return;
        }
        try {
            SCLogCatUtil.info("WebSocketClient", "close. try to close socket");
            this.j = true;
            super.close();
        } catch (Throwable th) {
            SCLogCatUtil.error("WebSocketClient", "send err. ", th);
        }
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.client.WebSocketClient, com.alipay.android.phone.mobilesdk.socketcraft.WebSocket
    public void close(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8eedf52e", new Object[]{this, new Integer(i), str});
            return;
        }
        try {
            SCLogCatUtil.info("WebSocketClient", "close. try to close socket");
            this.j = true;
            super.close(i, str);
        } catch (Throwable th) {
            SCLogCatUtil.error("WebSocketClient", "send err. ", th);
        }
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        b();
        this.g = SCNetworkAsyncTaskUtil.schedule(new SCConnectionTimerRunnable(this, this.c), this.f, TimeUnit.MILLISECONDS);
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        try {
            SCLogCatUtil.info("WebSocketClient", "cancelTimeoutScheduleFuture. try to stop connectTimer");
            if (this.g == null) {
                return;
            }
            this.g.cancel(true);
            this.g = null;
        } catch (Throwable th) {
            SCLogCatUtil.error("WebSocketClient", "cancelTimeoutScheduleFuture. Cancel old timeoutScheduleFuture error", th);
        }
    }

    public WebSocketContext getWebSocketContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WebSocketContext) ipChange.ipc$dispatch("34474a68", new Object[]{this});
        }
        WebSocketContext webSocketContext = this.h;
        if (webSocketContext != null) {
            return webSocketContext;
        }
        synchronized (this) {
            if (this.h != null) {
                return this.h;
            }
            this.h = new BasicWebSocketContext();
            return this.h;
        }
    }

    public void setWebSocketContext(WebSocketContext webSocketContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2998482", new Object[]{this, webSocketContext});
        } else {
            this.h = webSocketContext;
        }
    }

    public WebSocketCallback getWebSocketCallback() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WebSocketCallback) ipChange.ipc$dispatch("8ba7afc2", new Object[]{this}) : this.c;
    }

    public String getUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("de8f0660", new Object[]{this}) : this.e;
    }

    public String getBizUniqId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6bafc5e0", new Object[]{this});
        }
        Object attribute = getWebSocketContext().getAttribute(WSContextConstant.BIZ_UNIQUE_ID);
        return (attribute == null || !(attribute instanceof String)) ? "unkown" : String.valueOf(attribute);
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        SCLogCatUtil.info("WebSocketClient", "enter beforeConnect");
        this.i.recordStartConnAllTime();
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        SCLogCatUtil.info("WebSocketClient", "enter afterConnect");
        this.i.recordConnectedTime();
        this.i.printConnMonitorLog();
    }
}
