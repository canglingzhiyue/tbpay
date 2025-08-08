package android.taobao.windvane.export.network;

import android.os.SystemClock;
import mtopsdk.common.util.StringUtils;
import android.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import tb.kge;

/* loaded from: classes2.dex */
public class Request {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final AtomicInteger f1589a;
    private final String b;
    private final String c;
    private final List<Pair<String, Long>> d;
    private Map<String, String> e;
    private int f;
    private final boolean g;
    private final c h;
    private volatile l i;
    private final m j;
    private final Map<String, String> k;
    private final int l;

    /* loaded from: classes2.dex */
    public @interface METHOD {
        public static final String GET = "GET";
        public static final String POST = "POST";
    }

    /* loaded from: classes2.dex */
    public @interface ResourceType {
        public static final int DOCUMENT = 0;
        public static final int IMAGE = 1;
    }

    /* loaded from: classes2.dex */
    public @interface StageName {
        public static final String DOCUMENT_NETWORK_TTFB = "documentNetworkTTFB";
        public static final String DOCUMENT_PREFETCH_CONSUME = "documentPrefetchHitTime";
        public static final String DOCUMENT_REQUEST_END = "documentRequestEnd";
        public static final String DOCUMENT_REQUEST_SENT = "documentRequestSent";
        public static final String DOCUMENT_REQUEST_START = "documentRequestStart";
        public static final String DOCUMENT_TTFB = "documentTTFB";
    }

    static {
        kge.a(-28854281);
        f1589a = new AtomicInteger(0);
    }

    private Request(a aVar) {
        this.d = new ArrayList();
        this.k = new HashMap();
        this.b = a.a(aVar);
        this.c = a.b(aVar);
        this.e = a.c(aVar);
        this.g = aVar.f1590a;
        if (a.d(aVar) != null) {
            this.h = a.d(aVar);
        } else {
            this.h = new android.taobao.windvane.export.network.a();
        }
        this.j = a.e(aVar);
        this.l = a.f(aVar);
    }

    public Request(Request request) {
        this.d = new ArrayList();
        this.k = new HashMap();
        this.b = request.b;
        this.c = request.c;
        this.e = request.e;
        this.i = request.i;
        this.g = request.e();
        this.h = request.h;
        this.j = request.j;
        this.l = request.l;
        this.f = g();
    }

    private static int g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5c0f961", new Object[0])).intValue() : f1589a.getAndAdd(1);
    }

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.b;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.c;
    }

    public Map<String, String> c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("3b696c1f", new Object[]{this}) : this.e;
    }

    public int d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue() : this.f;
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue() : this.g;
    }

    public c f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("60a7e32d", new Object[]{this}) : this.h;
    }

    public m i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (m) ipChange.ipc$dispatch("8d0e8d40", new Object[]{this}) : this.j;
    }

    public int j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5eb3fe4", new Object[]{this})).intValue() : this.l;
    }

    public String k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f1302f6e", new Object[]{this});
        }
        int i = this.l;
        return i != 0 ? i != 1 ? "unknown" : "image" : "document";
    }

    public boolean a(l lVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f50597e7", new Object[]{this, lVar})).booleanValue();
        }
        if (this.i == null) {
            synchronized (this) {
                if (this.i == null) {
                    this.i = lVar;
                    try {
                        for (Pair<String, Long> pair : this.d) {
                            if (pair != null) {
                                lVar.recordStage((String) pair.first, ((Long) pair.second).longValue());
                            }
                        }
                        this.d.clear();
                        for (Map.Entry<String, String> entry : this.k.entrySet()) {
                            if (entry != null) {
                                lVar.recordProperty(entry.getKey(), entry.getValue());
                            }
                        }
                        this.k.clear();
                    } catch (Exception unused) {
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else if (str == null || str2 == null) {
        } else {
            h();
            if (this.e.containsKey(str)) {
                return;
            }
            this.e.put(str, str2);
        }
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        synchronized (this) {
            try {
                l lVar = this.i;
                if (lVar == null) {
                    this.d.add(new Pair<>(str, Long.valueOf(uptimeMillis)));
                } else {
                    lVar.recordStage(str, uptimeMillis);
                }
            } catch (Exception unused) {
            }
        }
    }

    public void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{this, str, str2});
            return;
        }
        synchronized (this) {
            try {
                l lVar = this.i;
                if (lVar == null) {
                    this.k.put(str, str2);
                } else {
                    lVar.recordProperty(str, str2);
                }
            } catch (Exception unused) {
            }
        }
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else if (this.e != null) {
        } else {
            this.e = new HashMap();
        }
    }

    /* loaded from: classes2.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private String b;
        private String c;
        private Map<String, String> d;
        private c e;
        private m f;

        /* renamed from: a  reason: collision with root package name */
        public boolean f1590a = false;
        private int g = 0;

        static {
            kge.a(-850483250);
        }

        public static /* synthetic */ String a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1673051d", new Object[]{aVar}) : aVar.b;
        }

        public static /* synthetic */ String b(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("98bdb9fc", new Object[]{aVar}) : aVar.c;
        }

        public static /* synthetic */ Map c(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("f28939da", new Object[]{aVar}) : aVar.d;
        }

        public static /* synthetic */ c d(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("2ddb7794", new Object[]{aVar}) : aVar.e;
        }

        public static /* synthetic */ m e(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (m) ipChange.ipc$dispatch("e5d40a9", new Object[]{aVar}) : aVar.f;
        }

        public static /* synthetic */ int f(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("9a9c3c1b", new Object[]{aVar})).intValue() : aVar.g;
        }

        public a a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("20e6ec9f", new Object[]{this, str});
            }
            this.b = str;
            return this;
        }

        public a b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("a331a17e", new Object[]{this, str});
            }
            this.c = str;
            return this;
        }

        public a a(Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("733d4614", new Object[]{this, map});
            }
            this.d = map;
            return this;
        }

        public a a(m mVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("3c998e8f", new Object[]{this, mVar});
            }
            this.f = mVar;
            return this;
        }

        public a a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("f4d5e8a5", new Object[]{this, new Boolean(z)});
            }
            this.f1590a = z;
            return this;
        }

        public a a(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("b84e9f85", new Object[]{this, cVar});
            }
            this.e = cVar;
            return this;
        }

        public a a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("e973a856", new Object[]{this, new Integer(i)});
            }
            this.g = i;
            return this;
        }

        public Request a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Request) ipChange.ipc$dispatch("2474cb06", new Object[]{this});
            }
            if (this.b == null) {
                throw new IllegalStateException("url = null");
            }
            if (StringUtils.isEmpty(this.c)) {
                this.c = "GET";
            }
            if (this.d == null) {
                this.d = new HashMap();
            }
            return new Request(this);
        }
    }
}
