package com.taobao.taobaoavsdk.cache.library;

import android.content.Context;
import android.content.SharedPreferences;
import mtopsdk.common.util.StringUtils;
import com.alibaba.evo.EVO;
import com.alibaba.ut.abtest.UTABTest;
import com.alibaba.ut.abtest.VariationSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.virtual_thread.face.VExecutors;
import com.taobao.media.MediaAdapteManager;
import com.taobao.media.MediaConstant;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.messagekit.base.network.AccsConnection;
import com.taobao.taobaoavsdk.AVSDKLog;
import com.taobao.taobaoavsdk.cache.library.k;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import tb.iga;
import tb.jyx;
import tb.kge;
import tb.oyy;
import tb.oyz;
import tb.oza;
import tb.ozd;
import tb.oze;

/* loaded from: classes8.dex */
public class i {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PROXY_HOST = "127.0.0.1";

    /* renamed from: a  reason: collision with root package name */
    private int f21321a;
    private final Object b;
    private ExecutorService c;
    private final Map<String, j> d;
    private final ServerSocket e;
    private final int f;
    private Thread g;
    private final com.taobao.taobaoavsdk.cache.library.c h;
    private boolean i;
    private Map<String, Integer> j;
    private final int k;

    static {
        kge.a(-868748885);
    }

    public static /* synthetic */ void a(i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82b19dda", new Object[]{iVar});
        } else {
            iVar.d();
        }
    }

    public static /* synthetic */ void a(i iVar, Socket socket) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d32db95", new Object[]{iVar, socket});
        } else {
            iVar.a(socket);
        }
    }

    public static /* synthetic */ void b(i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d52605b", new Object[]{iVar});
        } else {
            iVar.g();
        }
    }

    public static /* synthetic */ boolean c(i iVar) throws ProxyCacheException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b7f322e0", new Object[]{iVar})).booleanValue() : iVar.e();
    }

    public i(Context context) {
        this(a.a(new a(context)));
    }

    private i(com.taobao.taobaoavsdk.cache.library.c cVar) {
        this.f21321a = -1;
        this.b = new Object();
        this.d = new ConcurrentHashMap();
        this.g = null;
        this.j = new HashMap();
        this.k = AccsConnection.DATA_PACKAGE_MAX;
        this.c = com.taobao.taobaoavsdk.util.a.a(10, new com.taobao.android.virtual_thread.face.h() { // from class: com.taobao.taobaoavsdk.cache.library.i.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.virtual_thread.face.h
            public String newThreadName() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("57dab4a4", new Object[]{this}) : "http_proxy_cache_server_thread";
            }
        });
        this.h = (com.taobao.taobaoavsdk.cache.library.c) n.a(cVar);
        try {
            this.e = new ServerSocket(0, 10, InetAddress.getByName("127.0.0.1"));
            this.f = this.e.getLocalPort();
            CountDownLatch countDownLatch = new CountDownLatch(1);
            if (com.taobao.taobaoavsdk.util.b.a(OrangeConfig.getInstance().getConfig("DWInteractive", MediaConstant.ORANGE_CONTROL_USE_COMMON_THREADPOOL, "false"))) {
                com.taobao.taobaoavsdk.util.a.a().submit(new d(countDownLatch));
            } else {
                this.g = new Thread(new d(countDownLatch), "ServerWait");
                this.g.start();
            }
            this.f21321a = -2;
            countDownLatch.await();
            this.c.submit(new Runnable() { // from class: com.taobao.taobaoavsdk.cache.library.i.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        i.a(i.this);
                    }
                }
            });
        } catch (Throwable th) {
            this.f21321a = -3;
            this.c.shutdown();
            throw new IllegalStateException("Error starting local proxy server" + th.getMessage());
        }
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        int i = 0;
        int i2 = 70;
        while (i < 5) {
            try {
                this.i = ((Boolean) this.c.submit(new b()).get(i2, TimeUnit.MILLISECONDS)).booleanValue();
            } catch (InterruptedException | ExecutionException | TimeoutException unused) {
            }
            if (this.i) {
                this.f21321a = 0;
                return;
            }
            continue;
            i++;
            i2 <<= 1;
        }
        this.f21321a = -4;
        c();
    }

    private boolean e() throws ProxyCacheException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue();
        }
        String m = m("ping");
        k.a aVar = new k.a();
        aVar.a(m);
        aVar.a(Integer.MIN_VALUE);
        k a2 = aVar.a();
        try {
            try {
                byte[] bytes = "ping ok".getBytes();
                a2.a(0L, true);
                byte[] bArr = new byte[bytes.length];
                a2.a(bArr);
                boolean equals = Arrays.equals(bytes, bArr);
                try {
                    a2.c();
                } catch (ProxyCacheException e) {
                    AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "pingServer failed!" + e);
                }
                return equals;
            } catch (ProxyCacheException unused) {
                a2.c();
                return false;
            } catch (Throwable th) {
                try {
                    a2.c();
                } catch (ProxyCacheException e2) {
                    AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "pingServer failed!" + e2);
                }
                throw th;
            }
        } catch (ProxyCacheException e3) {
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "pingServer failed!" + e3);
            return false;
        }
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.i;
    }

    public int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : this.f21321a;
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        synchronized (this.b) {
            String a2 = this.h.b.a(str);
            if (this.d != null && this.d.containsKey(a2)) {
                j jVar = this.d.get(a2);
                this.d.remove(a2);
                if (jVar == null) {
                    return;
                }
                jVar.a();
            }
        }
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        synchronized (this.b) {
            if (this.d != null && this.d.containsKey(str)) {
                j jVar = this.d.get(str);
                this.d.remove(str);
                if (jVar == null) {
                    return;
                }
                jVar.a();
            }
        }
    }

    public String c(String str) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b82f346c", new Object[]{this, str});
        }
        if (this.i) {
            com.taobao.taobaoavsdk.cache.library.c cVar = this.h;
            boolean z2 = (cVar == null || cVar.f21317a == null) ? false : true;
            boolean z3 = z2 && this.h.f21317a.exists();
            if (z2 && !z3) {
                try {
                    new File(this.h.f21317a.getAbsolutePath()).mkdirs();
                } catch (Throwable unused) {
                }
                z3 = this.h.f21317a.exists();
            }
            if (!z3 || !this.h.f21317a.canWrite()) {
                z = false;
            }
            if (z) {
                return m(str);
            }
            this.i = false;
            if (!z3) {
                this.f21321a = -7;
            } else if (!z3) {
                this.f21321a = -8;
            }
        }
        return str;
    }

    private String m(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1f5a9d22", new Object[]{this, str}) : String.format("http://%s:%d/%s", "127.0.0.1", Integer.valueOf(this.f), p.c(str));
    }

    public boolean d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d23b17f9", new Object[]{this, str})).booleanValue();
        }
        File a2 = this.h.a(str);
        File parentFile = a2.getParentFile();
        File file = new File(parentFile, a2.getName() + oyz.TEMP_POSTFIX);
        return (file.exists() && file.length() > 0) || a2.exists();
    }

    public long p(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4c8e46f5", new Object[]{this, str})).longValue();
        }
        File a2 = this.h.a(str);
        File parentFile = a2.getParentFile();
        File file = new File(parentFile, a2.getName() + oyz.TEMP_POSTFIX);
        if (a2.exists()) {
            return a2.length();
        }
        if (!file.exists()) {
            return 0L;
        }
        return file.length();
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        f();
        Thread thread = this.g;
        if (thread != null) {
            thread.interrupt();
        }
        try {
            if (this.e.isClosed()) {
                return;
            }
            this.e.close();
        } catch (IOException unused) {
        }
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        synchronized (this.b) {
            for (j jVar : this.d.values()) {
                jVar.a();
            }
            this.d.clear();
        }
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        while (!VExecutors.currentThread().isInterrupted()) {
            try {
                Socket accept = this.e.accept();
                accept.setSendBufferSize(262144);
                accept.setTrafficClass(20);
                this.c.submit(new c(accept));
            } catch (IOException unused) {
                return;
            }
        }
    }

    private void a(Socket socket) {
        IpChange ipChange = $ipChange;
        try {
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("12993ac7", new Object[]{this, socket});
                return;
            }
            f a2 = f.a(socket.getInputStream());
            String str = a2.f21319a;
            if ("ping".equals(str)) {
                b(socket);
            } else if (a2.j) {
                n(str).a(a2, socket);
            } else {
                n(str).b(a2, socket);
            }
        } catch (Exception e) {
            com.taobao.taobaoavsdk.util.c.b(com.taobao.taobaoavsdk.util.c.a(e));
        } catch (ProxyCacheException e2) {
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, e2.toString());
        } catch (SocketException e3) {
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, e3.toString());
        } catch (IOException e4) {
            this.i = false;
            this.f21321a = -6;
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, e4.toString());
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, e4.toString());
        } finally {
            c(socket);
        }
    }

    private void b(Socket socket) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("991ef566", new Object[]{this, socket});
            return;
        }
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("HTTP/1.1 200 OK\n\n".getBytes());
        outputStream.write("ping ok".getBytes());
    }

    private j n(String str) throws ProxyCacheException {
        j jVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j) ipChange.ipc$dispatch("98791cc8", new Object[]{this, str});
        }
        synchronized (this.b) {
            String a2 = this.h.b.a(str);
            jVar = this.d.get(a2);
            if (jVar == null) {
                jVar = new j(str, this.h, this);
                this.d.put(a2, jVar);
            }
        }
        return jVar;
    }

    private void c(Socket socket) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fa4b005", new Object[]{this, socket});
            return;
        }
        d(socket);
        e(socket);
        f(socket);
    }

    private void d(Socket socket) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a62a6aa4", new Object[]{this, socket});
            return;
        }
        try {
            if (socket.isInputShutdown()) {
                return;
            }
            socket.shutdownInput();
        } catch (SocketException | IOException unused) {
        }
    }

    private void e(Socket socket) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2cb02543", new Object[]{this, socket});
            return;
        }
        try {
            if (!socket.isOutputShutdown()) {
                return;
            }
            socket.shutdownOutput();
        } catch (IOException unused) {
        }
    }

    private void f(Socket socket) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b335dfe2", new Object[]{this, socket});
            return;
        }
        try {
            if (socket.isClosed()) {
                return;
            }
            socket.close();
        } catch (IOException unused) {
        }
    }

    /* loaded from: classes8.dex */
    public final class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final CountDownLatch b;

        static {
            kge.a(-96473073);
            kge.a(-1390502639);
        }

        public d(CountDownLatch countDownLatch) {
            this.b = countDownLatch;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            this.b.countDown();
            i.b(i.this);
        }
    }

    /* loaded from: classes8.dex */
    public final class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final Socket b;

        static {
            kge.a(1680389763);
            kge.a(-1390502639);
        }

        public c(Socket socket) {
            this.b = socket;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                i.a(i.this, this.b);
            }
        }
    }

    /* loaded from: classes8.dex */
    public class b implements Callable<Boolean> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1267244739);
            kge.a(-119797776);
        }

        private b() {
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Boolean, java.lang.Object] */
        @Override // java.util.concurrent.Callable
        public /* synthetic */ Boolean call() throws Exception {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("6d249ded", new Object[]{this}) : a();
        }

        public Boolean a() throws Exception {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Boolean) ipChange.ipc$dispatch("5b7a33e5", new Object[]{this}) : Boolean.valueOf(i.c(i.this));
        }
    }

    public long e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1c6cb12a", new Object[]{this, str})).longValue();
        }
        n.a(str);
        synchronized (this.b) {
            try {
                try {
                    if (n(str) != null) {
                        return n(str).c();
                    }
                } catch (ProxyCacheException unused) {
                }
                return 0L;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Map<String, String> f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("2185406c", new Object[]{this, str});
        }
        n.a(str);
        synchronized (this.b) {
            try {
                try {
                    if (n(str) != null) {
                        return n(str).b();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            } catch (ProxyCacheException unused) {
            }
            return null;
        }
    }

    public long g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b0cfe3ac", new Object[]{this, str})).longValue();
        }
        n.a(str);
        synchronized (this.b) {
            try {
                try {
                    if (n(str) != null) {
                        return n(str).d();
                    }
                } catch (ProxyCacheException unused) {
                }
                return 0L;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public long h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fb017ced", new Object[]{this, str})).longValue();
        }
        n.a(str);
        synchronized (this.b) {
            try {
                try {
                    if (n(str) != null) {
                        return n(str).e();
                    }
                } catch (ProxyCacheException unused) {
                }
                return 0L;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public long q(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("96bfe036", new Object[]{this, str})).longValue();
        }
        AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "enter  getHeadRequestTime");
        n.a(str);
        synchronized (this.b) {
            try {
                try {
                    if (n(str) != null) {
                        return n(str).m();
                    }
                } catch (ProxyCacheException unused) {
                }
                return -2L;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public long i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4533162e", new Object[]{this, str})).longValue();
        }
        n.a(str);
        synchronized (this.b) {
            try {
                try {
                    if (n(str) != null) {
                        return n(str).f();
                    }
                } catch (ProxyCacheException unused) {
                }
                return 0L;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1a00ca85", new Object[]{this, str});
        }
        String str2 = "";
        synchronized (this.b) {
            try {
                if (n(str) != null) {
                    str2 = n(str).g();
                }
            } catch (ProxyCacheException unused) {
            }
        }
        if (!StringUtils.isEmpty(str2)) {
            String[] split = str2.split(",");
            for (String str3 : split) {
                String trim = str3.trim();
                if (trim != null && !trim.isEmpty()) {
                    String[] split2 = trim.split("=");
                    if (split2.length == 2 && "connType".equals(split2[0])) {
                        return split2[1];
                    }
                }
            }
        }
        return "";
    }

    private String o(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cd967ee0", new Object[]{this, str});
        }
        com.taobao.taobaoavsdk.cache.library.c cVar = this.h;
        if (cVar != null && cVar.b != null && !StringUtils.isEmpty(str)) {
            return this.h.b.a(str);
        }
        return null;
    }

    public int k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d99648af", new Object[]{this, str})).intValue();
        }
        int i = -1;
        String o = o(str);
        if (!StringUtils.isEmpty(o)) {
            synchronized (this) {
                if (this.j.size() >= 10240) {
                    i = -2;
                } else if (this.j.containsKey(o)) {
                    this.j.put(o, 1);
                    int intValue = this.j.get(o).intValue();
                    this.j.put(o, Integer.valueOf(intValue + 1));
                    i = intValue;
                } else {
                    i = 0;
                }
            }
        }
        return i;
    }

    public void l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23c7e1fd", new Object[]{this, str});
            return;
        }
        String o = o(str);
        if (StringUtils.isEmpty(o)) {
            return;
        }
        synchronized (this) {
            if (this.j.size() < 10240 && !this.j.containsKey(o)) {
                this.j.put(o, 1);
            }
        }
    }

    /* loaded from: classes8.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private File f21324a;
        private oza b = new ozd();
        private oyy c;

        static {
            kge.a(672394626);
        }

        public static /* synthetic */ com.taobao.taobaoavsdk.cache.library.c a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (com.taobao.taobaoavsdk.cache.library.c) ipChange.ipc$dispatch("c7a66731", new Object[]{aVar}) : aVar.b();
        }

        public a(Context context) {
            this.f21324a = StorageUtils.getIndividualCacheDirectory(context);
            this.c = new oze(a(context), 100);
        }

        public i a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (i) ipChange.ipc$dispatch("4b3420a0", new Object[]{this}) : new i(b());
        }

        private com.taobao.taobaoavsdk.cache.library.c b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (com.taobao.taobaoavsdk.cache.library.c) ipChange.ipc$dispatch("e208945", new Object[]{this}) : new com.taobao.taobaoavsdk.cache.library.c(this.f21324a, this.b, this.c);
        }

        private long a(Context context) {
            long j;
            IpChange ipChange = $ipChange;
            boolean z = true;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("9e1d6454", new Object[]{this, context})).longValue();
            }
            if (MediaAdapteManager.mConfigAdapter == null || !com.taobao.taobaoavsdk.util.b.a(MediaAdapteManager.mConfigAdapter.getConfig("", MediaConstant.ORANGE_ENABLE_LIMIT_CACHE_SIZE_ENABLE, "false"))) {
                z = false;
            }
            if (z) {
                try {
                    if (!EVO.isSwitchOpened(context, "switch_ab_video_cache_limit")) {
                        return 419430400L;
                    }
                    SharedPreferences sharedPreferences = context.getSharedPreferences(iga.CACHE_INFO_SP_NAME, 0);
                    long j2 = sharedPreferences.getLong("total_size", 0L);
                    long j3 = sharedPreferences.getLong("available_size", 0L);
                    VariationSet activate = UTABTest.activate("avCache_component", "avCacheLimit_module");
                    if (activate != null && activate.size() > 0) {
                        int valueAsInt = activate.getVariation("ab_device_rom_standard").getValueAsInt(64);
                        int valueAsInt2 = activate.getVariation("ab_available_size_standard").getValueAsInt(10);
                        int valueAsInt3 = activate.getVariation("ab_cache_device_rom_limit_size").getValueAsInt(300);
                        int valueAsInt4 = activate.getVariation("ab_cache_available_limit_size").getValueAsInt(200);
                        long j4 = (valueAsInt2 << 10) << 10;
                        long j5 = (j2 <= 0 || j2 > ((long) ((valueAsInt << 10) << 10))) ? 419430400L : (valueAsInt3 << 10) << 10;
                        if (j3 > 0 && j3 < j4) {
                            j5 = (valueAsInt4 << 10) << 10;
                        }
                        try {
                            HashMap hashMap = new HashMap(8);
                            hashMap.put("total", String.valueOf((j2 / 1024) / 1024));
                            hashMap.put("totalLimitStandard", String.valueOf(valueAsInt));
                            hashMap.put(jyx.a.POINT_NAME, String.valueOf((j3 / 1024) / 1024));
                            hashMap.put("availableLimitStandard", String.valueOf(valueAsInt2));
                            hashMap.put("maxSize", String.valueOf(j5));
                            UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder("", 19999, "storage_statistic", "", "", hashMap).build());
                            return j5;
                        } catch (Exception e) {
                            e = e;
                            j = j5;
                            e.printStackTrace();
                            return j;
                        }
                    }
                } catch (Exception e2) {
                    e = e2;
                    j = 419430400;
                }
            }
            return 419430400L;
        }
    }
}
