package com.alibaba.ability.impl.websocket;

import android.text.TextUtils;
import android.util.Base64;
import com.alibaba.ability.e;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.ability.result.FinishResult;
import com.alibaba.ability.result.a$a;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.container.shopLoft.b;
import com.alipay.android.phone.mobilesdk.socketcraft.api.BasicWebSocketContext;
import com.alipay.android.phone.mobilesdk.socketcraft.api.DefaultWebSocketClient;
import com.alipay.android.phone.mobilesdk.socketcraft.api.WebSocketCallback;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.ai;
import kotlin.j;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.text.d;
import kotlin.text.n;
import tb.alm;
import tb.aln;
import tb.als;
import tb.hsu;
import tb.kge;

/* loaded from: classes2.dex */
public final class WebSocketAbility extends alm {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String API_CLOSE = "close";
    public static final String API_CONNECT = "connect";
    public static final String API_SEND = "send";
    public static final a Companion;
    public static final String DEF_SOCKET_TASK_ID = "SingleSocket";

    /* renamed from: a  reason: collision with root package name */
    private Map<String, c> f1968a = new LinkedHashMap();

    static {
        kge.a(2051709140);
        Companion = new a(null);
    }

    public static /* synthetic */ Object ipc$super(WebSocketAbility webSocketAbility, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    /* loaded from: classes2.dex */
    public static final class a {
        static {
            kge.a(987794204);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0098  */
    @Override // com.alibaba.ability.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.alibaba.ability.result.ExecuteResult execute(java.lang.String r7, tb.als r8, java.util.Map<java.lang.String, ? extends java.lang.Object> r9, tb.aln r10) {
        /*
            r6 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.alibaba.ability.impl.websocket.WebSocketAbility.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L21
            r1 = 5
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r6
            r2 = 1
            r1[r2] = r7
            r7 = 2
            r1[r7] = r8
            r7 = 3
            r1[r7] = r9
            r7 = 4
            r1[r7] = r10
            java.lang.String r7 = "a38490db"
            java.lang.Object r7 = r0.ipc$dispatch(r7, r1)
            com.alibaba.ability.result.ExecuteResult r7 = (com.alibaba.ability.result.ExecuteResult) r7
            return r7
        L21:
            java.lang.String r0 = "api"
            kotlin.jvm.internal.q.d(r7, r0)
            java.lang.String r0 = "context"
            kotlin.jvm.internal.q.d(r8, r0)
            java.lang.String r0 = "params"
            kotlin.jvm.internal.q.d(r9, r0)
            java.lang.String r0 = "callback"
            kotlin.jvm.internal.q.d(r10, r0)
            int r0 = r7.hashCode()     // Catch: java.lang.Throwable -> L8f
            r1 = 3526536(0x35cf88, float:4.94173E-39)
            if (r0 == r1) goto L63
            r1 = 94756344(0x5a5ddf8, float:1.5598064E-35)
            if (r0 == r1) goto L56
            r1 = 951351530(0x38b478ea, float:8.605591E-5)
            if (r0 == r1) goto L49
            goto L70
        L49:
            java.lang.String r0 = "connect"
            boolean r0 = r7.equals(r0)     // Catch: java.lang.Throwable -> L8f
            if (r0 == 0) goto L70
            com.alibaba.ability.result.ExecuteResult r7 = r6.a(r8, r9, r10)     // Catch: java.lang.Throwable -> L8f
            goto La7
        L56:
            java.lang.String r0 = "close"
            boolean r0 = r7.equals(r0)     // Catch: java.lang.Throwable -> L8f
            if (r0 == 0) goto L70
            com.alibaba.ability.result.ExecuteResult r7 = r6.c(r8, r9, r10)     // Catch: java.lang.Throwable -> L8f
            goto La7
        L63:
            java.lang.String r0 = "send"
            boolean r0 = r7.equals(r0)     // Catch: java.lang.Throwable -> L8f
            if (r0 == 0) goto L70
            com.alibaba.ability.result.ExecuteResult r7 = r6.b(r8, r9, r10)     // Catch: java.lang.Throwable -> L8f
            goto La7
        L70:
            com.alibaba.ability.result.a$a$a r8 = com.alibaba.ability.result.a$a.Companion     // Catch: java.lang.Throwable -> L8f
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8f
            r9.<init>()     // Catch: java.lang.Throwable -> L8f
            java.lang.String r10 = "api "
            r9.append(r10)     // Catch: java.lang.Throwable -> L8f
            r9.append(r7)     // Catch: java.lang.Throwable -> L8f
            java.lang.String r7 = " not found"
            r9.append(r7)     // Catch: java.lang.Throwable -> L8f
            java.lang.String r7 = r9.toString()     // Catch: java.lang.Throwable -> L8f
            com.alibaba.ability.result.ErrorResult r7 = r8.a(r7)     // Catch: java.lang.Throwable -> L8f
            com.alibaba.ability.result.ExecuteResult r7 = (com.alibaba.ability.result.ExecuteResult) r7     // Catch: java.lang.Throwable -> L8f
            goto La7
        L8f:
            r7 = move-exception
            com.alibaba.ability.result.ErrorResult r8 = new com.alibaba.ability.result.ErrorResult
            java.lang.String r7 = r7.getMessage()
            if (r7 != 0) goto L9a
            java.lang.String r7 = ""
        L9a:
            r2 = r7
            r3 = 0
            r4 = 4
            r5 = 0
            java.lang.String r1 = "500"
            r0 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            r7 = r8
            com.alibaba.ability.result.ExecuteResult r7 = (com.alibaba.ability.result.ExecuteResult) r7
        La7:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ability.impl.websocket.WebSocketAbility.execute(java.lang.String, tb.als, java.util.Map, tb.aln):com.alibaba.ability.result.ExecuteResult");
    }

    private final ExecuteResult a(als alsVar, Map<String, ? extends Object> map, aln alnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("e3d9aefd", new Object[]{this, alsVar, map, alnVar});
        }
        String a2 = a(alsVar);
        q.a((Object) a2);
        a(a2);
        String a3 = e.a(map, "url", "");
        if (TextUtils.isEmpty(a3)) {
            alnVar.a(a$a.Companion.b("url为空"));
            return null;
        }
        try {
            URI uri = new URI(hsu.a(a3, (JSONObject) e.a(map, "data")));
            String scheme = uri.getScheme();
            q.b(scheme, "uri.scheme");
            if (TextUtils.isEmpty(scheme)) {
                alnVar.a((ExecuteResult) a$a.Companion.b("scheme 为空"));
                return null;
            } else if (!n.a("ws", scheme, true) && !n.a("wss", scheme, true)) {
                alnVar.a(a$a.Companion.b("URL必须以ws或者wss开头"));
                return null;
            } else {
                Map<String, String> a4 = a(e.a(map, "headers"));
                b bVar = new b(alnVar);
                DefaultWebSocketClient defaultWebSocketClient = new DefaultWebSocketClient(uri, a4, bVar, new BasicWebSocketContext());
                this.f1968a.put(a2, new c(a2, defaultWebSocketClient, bVar));
                if (n.a("ws", scheme, true)) {
                    defaultWebSocketClient.connect();
                } else {
                    defaultWebSocketClient.connectWithSSL();
                }
                return null;
            }
        } catch (URISyntaxException unused) {
            alnVar.a(a$a.Companion.b("无法识别的URL格式"));
            return null;
        }
    }

    private final Map<String, String> a(Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("4fc7ad92", new Object[]{this, map});
        }
        HashMap hashMap = new HashMap();
        if (map == null || map.isEmpty()) {
            return hashMap;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            if (TextUtils.isEmpty(entry.getKey()) || entry.getValue() != null) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            hashMap.put(entry2.getKey(), String.valueOf(entry2.getValue()));
        }
        return hashMap;
    }

    private final ExecuteResult b(als alsVar, Map<String, ? extends Object> map, aln alnVar) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("e4a82d7e", new Object[]{this, alsVar, map, alnVar});
        }
        c cVar = this.f1968a.get(a(alsVar));
        if (cVar == null) {
            alnVar.a(a$a.Companion.b("网络连接没有打开，无法发送消息网络连接没有打开，无法发送消息"));
            return null;
        }
        String a2 = e.a(map, "data", "");
        Boolean a3 = e.a(map, "isBuffer", (Boolean) false);
        String str = a2;
        if (str == null || str.length() == 0) {
            z = true;
        }
        if (z) {
            alnVar.a(a$a.Companion.b("发送数据 data为空"));
            return null;
        } else if (!cVar.a().isOpen()) {
            alnVar.a(new ErrorResult("onSocketError", "没有建连成功之前无法发送消息", (Map) null, 4, (o) null));
            return null;
        } else {
            if (q.a((Object) a3, (Object) true)) {
                q.a((Object) a2);
                Charset forName = Charset.forName("utf-8");
                q.b(forName, "Charset.forName(charsetName)");
                if (a2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                byte[] bytes = a2.getBytes(forName);
                q.b(bytes, "(this as java.lang.String).getBytes(charset)");
                cVar.a().send(ByteBuffer.wrap(Base64.decode(bytes, 2)));
            } else {
                cVar.a().send(a2);
            }
            alnVar.a((ExecuteResult) new FinishResult(new JSONObject(), "onSuccess"));
            return null;
        }
    }

    private final ExecuteResult c(als alsVar, Map<String, ? extends Object> map, aln alnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("e576abff", new Object[]{this, alsVar, map, alnVar});
        }
        String a2 = a(alsVar);
        q.a((Object) a2);
        a(a2);
        return null;
    }

    private final String a(als alsVar) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3280a670", new Object[]{this, alsVar});
        }
        String a2 = alsVar.a();
        if (a2 != null && a2.length() != 0) {
            z = false;
        }
        return z ? DEF_SOCKET_TASK_ID : alsVar.a();
    }

    @Override // tb.alm
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        Map<String, c> map = this.f1968a;
        for (c cVar : map.values()) {
            try {
                if (cVar.a().isOpen()) {
                    cVar.a().close();
                }
            } catch (Throwable unused) {
            }
        }
        map.clear();
    }

    private final void a(String str) {
        DefaultWebSocketClient a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        c cVar = this.f1968a.get(str);
        if (cVar == null || (a2 = cVar.a()) == null) {
            return;
        }
        if (a2.isOpen()) {
            a2.close();
        }
        this.f1968a.remove(str);
    }

    /* loaded from: classes2.dex */
    public static final class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private String f1970a;
        private DefaultWebSocketClient b;
        private b c;

        static {
            kge.a(1777028771);
        }

        public c(String socketTaskId, DefaultWebSocketClient client, b callback) {
            q.d(socketTaskId, "socketTaskId");
            q.d(client, "client");
            q.d(callback, "callback");
            this.f1970a = socketTaskId;
            this.b = client;
            this.c = callback;
        }

        public final DefaultWebSocketClient a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (DefaultWebSocketClient) ipChange.ipc$dispatch("1d557962", new Object[]{this}) : this.b;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b implements WebSocketCallback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private aln f1969a;

        static {
            kge.a(-1338825974);
        }

        public b(aln callback) {
            q.d(callback, "callback");
            this.f1969a = callback;
        }

        @Override // com.alipay.android.phone.mobilesdk.socketcraft.api.WebSocketCallback
        public void onSocketOpen() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bb387e23", new Object[]{this});
            } else {
                this.f1969a.a((ExecuteResult) new FinishResult(new JSONObject(), "onOpen"));
            }
        }

        @Override // com.alipay.android.phone.mobilesdk.socketcraft.api.WebSocketCallback
        public void onSocketClose() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("35ada86d", new Object[]{this});
            } else {
                this.f1969a.a((ExecuteResult) new FinishResult(new JSONObject(), "onClose"));
            }
        }

        @Override // com.alipay.android.phone.mobilesdk.socketcraft.api.WebSocketCallback
        public void onSocketMessage(ByteBuffer byteBuffer) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e2b24355", new Object[]{this, byteBuffer});
                return;
            }
            Pair[] pairArr = new Pair[2];
            if (byteBuffer != null) {
                byte[] encode = Base64.encode(byteBuffer.array(), 2);
                q.b(encode, "Base64.encode(it.array(), Base64.NO_WRAP)");
                str = new String(encode, d.UTF_8);
            } else {
                str = null;
            }
            pairArr[0] = j.a("data", str);
            pairArr[1] = j.a("isBuffer", true);
            this.f1969a.a((ExecuteResult) new FinishResult(new JSONObject(ai.b(pairArr)), b.c.EVENT_ON_MESSAGE));
        }

        @Override // com.alipay.android.phone.mobilesdk.socketcraft.api.WebSocketCallback
        public void onSocketMessage(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("118d2a46", new Object[]{this, str});
            } else {
                this.f1969a.a((ExecuteResult) new FinishResult(new JSONObject(ai.b(j.a("data", str), j.a("isBuffer", false))), b.c.EVENT_ON_MESSAGE));
            }
        }

        @Override // com.alipay.android.phone.mobilesdk.socketcraft.api.WebSocketCallback
        public void onSocketError(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c7adf907", new Object[]{this, str});
                return;
            }
            if (str == null) {
                str = "未知错误";
            }
            this.f1969a.a(new ErrorResult("onSocketError", str, (Map) null, 4, (o) null));
        }
    }
}
