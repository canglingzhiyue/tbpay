package com.alibaba.idst.nls.nlsclientsdk.transport.javawebsocket;

import android.util.Log;
import com.alibaba.idst.nls.nlsclientsdk.transport.Connection;
import com.alibaba.idst.nls.nlsclientsdk.transport.ConnectionListener;
import com.alibaba.idst.nls.nlsclientsdk.util.TimeStampLogUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.net.ConnectException;
import java.net.URI;
import java.nio.ByteBuffer;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.java_websocket.WebSocket;
import org.java_websocket.drafts.a;
import org.java_websocket.exceptions.InvalidDataException;
import tb.kge;
import tb.riy;
import tb.sbf;
import tb.sbi;
import tb.sbp;

/* loaded from: classes2.dex */
public class JWebSocketClient extends sbf implements Connection {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int CONNECTION_TIMEOUT = 2000;
    private static String TAG;
    private static CountDownLatch connectLatch;
    private static JWebSocketClient instance;
    private long afterConnect;
    private long beforeConnect;
    private ConnectionListener connectionListener;
    private long handSharkTime;
    private WebsocketStatus status;

    /* loaded from: classes2.dex */
    public enum WebsocketStatus {
        STATUS_INIT,
        STATUS_CONNECTED,
        STATUS_STOP,
        STATUS_FAILED,
        STATUS_CLOSED
    }

    public static /* synthetic */ Object ipc$super(JWebSocketClient jWebSocketClient, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -645202666:
                super.send((byte[]) objArr[0]);
                return null;
            case -483678593:
                super.close();
                return null;
            case 378876953:
                super.send((String) objArr[0]);
                return null;
            case 964359391:
                super.setConnectionLostTimeout(((Number) objArr[0]).intValue());
                return null;
            case 2111414762:
                super.setTcpNoDelay(((Boolean) objArr[0]).booleanValue());
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // com.alibaba.idst.nls.nlsclientsdk.transport.Connection
    public String getId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("81e05888", new Object[]{this});
        }
        return null;
    }

    static {
        kge.a(1778543585);
        kge.a(-1420821875);
        TAG = "AliSpeechSDK.Websocket";
    }

    private JWebSocketClient(URI uri, Map<String, String> map) {
        super(uri, new a(), map, 2000);
        super.setTcpNoDelay(true);
        super.setConnectionLostTimeout(2000);
    }

    public static JWebSocketClient getInstance(URI uri, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JWebSocketClient) ipChange.ipc$dispatch("a26aef13", new Object[]{uri, map});
        }
        if (instance == null) {
            instance = new JWebSocketClient(uri, map);
        }
        return instance;
    }

    public WebsocketStatus getStatus() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WebsocketStatus) ipChange.ipc$dispatch("42cf48c0", new Object[]{this}) : this.status;
    }

    public void setStatus(WebsocketStatus websocketStatus) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5faa1b4", new Object[]{this, websocketStatus});
        } else {
            this.status = websocketStatus;
        }
    }

    @Override // tb.sbf
    public void onOpen(sbp sbpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d36b9f", new Object[]{this, sbpVar});
            return;
        }
        String str = "onOpen time " + System.currentTimeMillis();
        this.status = WebsocketStatus.STATUS_CONNECTED;
        this.connectionListener.onOpen();
        TimeStampLogUtil.getInstance();
        TimeStampLogUtil.printLog("time_stamp_network_connected", null, null);
    }

    @Override // tb.sbf
    public void onMessage(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6056db9", new Object[]{this, str});
            return;
        }
        String str2 = "reponse message length " + str.length();
        this.connectionListener.onMessage(str);
    }

    @Override // tb.sbf
    public void onMessage(ByteBuffer byteBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29e36702", new Object[]{this, byteBuffer});
        } else {
            this.connectionListener.onMessage(byteBuffer);
        }
    }

    @Override // tb.sbf
    public void onClose(int i, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ff565c7", new Object[]{this, new Integer(i), str, new Boolean(z)});
        } else if (this.status == WebsocketStatus.STATUS_CLOSED) {
        } else {
            this.status = WebsocketStatus.STATUS_CLOSED;
            String str2 = "Jwebsocket close with " + i + " reason: " + str;
            this.connectionListener.onClose(i, str);
            setStatus(WebsocketStatus.STATUS_CLOSED);
            instance = null;
        }
    }

    @Override // tb.sbf
    public void onError(Exception exc) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b14ba516", new Object[]{this, exc});
            return;
        }
        if (this.status != WebsocketStatus.STATUS_CLOSED) {
            this.connectionListener.onError(exc);
        }
        this.status = WebsocketStatus.STATUS_FAILED;
        instance = null;
    }

    public Connection connect(ConnectionListener connectionListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Connection) ipChange.ipc$dispatch("1eef5299", new Object[]{this, connectionListener});
        }
        try {
            connectLatch = new CountDownLatch(1);
            this.beforeConnect = System.currentTimeMillis();
            String str = "before connection time " + this.beforeConnect;
            this.status = WebsocketStatus.STATUS_INIT;
            this.connectionListener = connectionListener;
            super.setConnectionLostTimeout(2000);
            connectBlocking();
            return this;
        } catch (InterruptedException e) {
            e.printStackTrace();
            close();
            connectionListener.onError(e);
            return null;
        }
    }

    @Override // org.java_websocket.c, org.java_websocket.e
    public void onWebsocketHandshakeReceivedAsClient(WebSocket webSocket, sbi sbiVar, sbp sbpVar) throws InvalidDataException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eaf74c9b", new Object[]{this, webSocket, sbiVar, sbpVar});
            return;
        }
        this.status = WebsocketStatus.STATUS_CONNECTED;
        connectLatch.countDown();
        String str = "response headers[sec-websocket-extensions]:{" + sbpVar.b("sec-websocket-extensions") + riy.BLOCK_END_STR;
    }

    @Override // com.alibaba.idst.nls.nlsclientsdk.transport.Connection
    public void sendText(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfff41a6", new Object[]{this, str});
            return;
        }
        if (connectLatch.getCount() > 0) {
            Boolean bool = false;
            try {
                bool = Boolean.valueOf(connectLatch.await(2000L, TimeUnit.MILLISECONDS));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (!bool.booleanValue()) {
                return;
            }
        }
        if (this.status != WebsocketStatus.STATUS_CONNECTED) {
            Log.e(TAG, new ConnectException("Network status error, current status is " + this.status).getMessage());
            return;
        }
        String str2 = "thread:{" + Thread.currentThread().getId() + "},send:{" + str + riy.BLOCK_END_STR;
        try {
            super.send(str);
        } catch (Exception e2) {
            this.connectionListener.onError(e2);
            String str3 = "could not send text frame: " + e2;
        }
    }

    @Override // com.alibaba.idst.nls.nlsclientsdk.transport.Connection
    public void sendBinary(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c79e5277", new Object[]{this, bArr});
        } else if (this.status != WebsocketStatus.STATUS_CONNECTED) {
            Log.e(TAG, new ConnectException("SendBinary, Network status error, current status is " + this.status).getMessage());
        } else {
            try {
                super.send(bArr);
            } catch (Exception e) {
                this.connectionListener.onError(e);
                String str = TAG;
                Log.e(str, "could not send binary frame" + e);
            }
        }
    }

    @Override // tb.sbf, com.alibaba.idst.nls.nlsclientsdk.transport.Connection
    public void close() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
        } else {
            super.close();
        }
    }

    public void shutdown() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b466fdd", new Object[]{this});
        } else {
            close();
        }
    }
}
