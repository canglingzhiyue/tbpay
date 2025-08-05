package tb;

import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.ace.b;
import com.taobao.android.searchbaseframe.ace.model.JsonRpcRequest;
import com.taobao.android.searchbaseframe.ace.model.JsonRpcResponse;
import com.taobao.android.searchbaseframe.util.i;
import com.taobao.android.searchbaseframe.util.k;
import com.taobao.search.rainbow.a;
import java.net.BindException;
import java.util.Map;
import java.util.concurrent.Future;
import org.java_websocket.WebSocket;

/* loaded from: classes6.dex */
public class ims implements imr<JsonRpcRequest, JsonRpcResponse> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final imp d;
    private Thread f;
    private HandlerThread g;
    private Handler h;
    private imq i;
    private volatile boolean j;

    /* renamed from: a  reason: collision with root package name */
    private int f29159a = 63232;
    private WebSocket b = null;
    private WebSocket c = null;
    private final ina e = new ina(this);

    static {
        kge.a(667006617);
        kge.a(1078392025);
    }

    public static /* synthetic */ imp a(ims imsVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (imp) ipChange.ipc$dispatch("f8274771", new Object[]{imsVar}) : imsVar.d;
    }

    public static /* synthetic */ imq a(ims imsVar, imq imqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (imq) ipChange.ipc$dispatch("38c013ad", new Object[]{imsVar, imqVar});
        }
        imsVar.i = imqVar;
        return imqVar;
    }

    public static /* synthetic */ boolean a(ims imsVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d0ebb74f", new Object[]{imsVar, new Boolean(z)})).booleanValue();
        }
        imsVar.j = z;
        return z;
    }

    public static /* synthetic */ ina b(ims imsVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ina) ipChange.ipc$dispatch("dfc91fc0", new Object[]{imsVar}) : imsVar.e;
    }

    public static /* synthetic */ int c(ims imsVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("cafd1d9e", new Object[]{imsVar})).intValue() : imsVar.f29159a;
    }

    public static /* synthetic */ imq d(ims imsVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (imq) ipChange.ipc$dispatch("af0ccaad", new Object[]{imsVar}) : imsVar.i;
    }

    public ims(imp impVar) {
        this.d = impVar;
    }

    @Override // tb.imr
    public WebSocket a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WebSocket) ipChange.ipc$dispatch("98732390", new Object[]{this});
        }
        WebSocket webSocket = this.b;
        if (webSocket != null) {
            if (webSocket.isOpen()) {
                return this.b;
            }
            this.b = null;
        }
        WebSocket webSocket2 = this.c;
        if (webSocket2 != null) {
            if (webSocket2.isOpen()) {
                return this.c;
            }
            this.c = null;
        }
        return null;
    }

    @Override // tb.imr
    public void a(WebSocket webSocket) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa59390a", new Object[]{this, webSocket});
            return;
        }
        k.d("ConnectionManager", "onConnect", new Object[0]);
        if (c(webSocket)) {
            e(webSocket);
        } else {
            d(webSocket);
        }
        b(webSocket);
    }

    private void b(WebSocket webSocket) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1131f8cb", new Object[]{this, webSocket});
            return;
        }
        a(webSocket, b.c().toString());
        Map<String, String> e = a.e();
        if (e == null) {
            return;
        }
        JsonRpcRequest obtainMessage = JsonRpcRequest.obtainMessage("notify.ABTest");
        obtainMessage.setParams((JSON) JSON.toJSON(e));
        imp.a().b(obtainMessage);
    }

    private boolean c(WebSocket webSocket) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("780ab890", new Object[]{this, webSocket})).booleanValue() : TextUtils.equals(webSocket.getLocalSocketAddress().getHostName(), webSocket.getRemoteSocketAddress().getHostName());
    }

    private void d(WebSocket webSocket) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dee3784d", new Object[]{this, webSocket});
            return;
        }
        WebSocket webSocket2 = this.b;
        if (webSocket2 != null) {
            a(webSocket2, JsonRpcRequest.obtainMessage("connection.close").toString());
        }
        this.b = webSocket;
    }

    private void e(WebSocket webSocket) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45bc380e", new Object[]{this, webSocket});
            return;
        }
        WebSocket webSocket2 = this.c;
        if (webSocket2 != null) {
            a(webSocket2, JsonRpcRequest.obtainMessage("connection.close").toString());
        }
        this.c = webSocket;
    }

    @Override // tb.imr
    public void a(WebSocket webSocket, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27c288c3", new Object[]{this, webSocket, new Integer(i), str});
            return;
        }
        k.d("ConnectionManager", "onDisconnect: " + str, new Object[0]);
        if (webSocket == this.c) {
            this.c = null;
        } else if (webSocket != this.b) {
        } else {
            this.b = null;
        }
    }

    @Override // tb.imr
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        if (this.g == null) {
            this.g = new HandlerThread("ace-sender");
            this.g.start();
            this.h = new Handler(this.g.getLooper());
        }
        this.j = true;
    }

    @Override // tb.imr
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (this.j) {
        } else {
            Thread thread = this.f;
            if (thread != null) {
                thread.interrupt();
            }
            this.f = new Thread(new Runnable() { // from class: tb.ims.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    ims imsVar = ims.this;
                    imp a2 = ims.a(imsVar);
                    ims imsVar2 = ims.this;
                    ims.a(imsVar, new imq(a2, imsVar2, ims.b(imsVar2), ims.c(ims.this)));
                    ims.d(ims.this).run();
                    try {
                        ims.d(ims.this).b();
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                    ims.a(ims.this, false);
                }
            }, "ace-server");
            this.f.start();
        }
    }

    @Override // tb.imr
    public void a(WebSocket webSocket, Exception exc) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("757c9fbc", new Object[]{this, webSocket, exc});
        } else if (!(exc instanceof BindException)) {
        } else {
            this.f29159a++;
            c();
        }
    }

    @Override // tb.imr
    public Future<JsonRpcResponse> a(JsonRpcRequest jsonRpcRequest) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Future) ipChange.ipc$dispatch("b82237fd", new Object[]{this, jsonRpcRequest}) : this.e.a((ina) jsonRpcRequest);
    }

    @Override // tb.imr
    public void b(final JsonRpcRequest jsonRpcRequest) {
        Handler handler;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b46d7106", new Object[]{this, jsonRpcRequest});
        } else if (!this.j || (handler = this.h) == null) {
        } else {
            handler.post(new i() { // from class: tb.ims.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.searchbaseframe.util.i
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        ims.d(ims.this).a(JSON.toJSONString(jsonRpcRequest));
                    }
                }
            });
        }
    }

    @Override // tb.imr
    public boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : this.j;
    }

    @Override // tb.imr
    public boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue() : this.b != null;
    }

    @Override // tb.imr
    public int f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5b2e1e0", new Object[]{this})).intValue() : this.f29159a;
    }

    @Override // tb.imr
    public void a(final WebSocket webSocket, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a149f454", new Object[]{this, webSocket, str});
        } else {
            this.h.post(new Runnable() { // from class: tb.ims.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    int i = 0;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (webSocket.isClosing() || webSocket.isClosed()) {
                    } else {
                        while (!webSocket.isOpen()) {
                            int i2 = i + 1;
                            if (i < 5) {
                                try {
                                    Thread.sleep(20L);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                i = i2;
                            }
                        }
                        try {
                            webSocket.send(str);
                        } catch (Throwable unused) {
                        }
                    }
                }
            });
        }
    }
}
