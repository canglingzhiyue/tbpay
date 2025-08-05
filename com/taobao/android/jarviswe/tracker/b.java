package com.taobao.android.jarviswe.tracker;

import com.android.alibaba.ip.runtime.IpChange;
import com.tmall.android.dai.internal.util.LogUtil;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes5.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_DESTORY = "JT_Destroy";
    public static final String EVENT_ENTER = "JT_Enter";
    public static final String EVENT_UPDATE_STAY_TIME = "JT_UpdateStayTime";

    /* renamed from: a  reason: collision with root package name */
    private final a f12974a;

    static {
        kge.a(-638986992);
    }

    private b(a aVar) {
        this.f12974a = aVar;
    }

    public static a a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("11e9ea04", new Object[]{str}) : new a(str);
    }

    public Map a() {
        HashMap hashMap;
        Exception e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a014a89d", new Object[]{this});
        }
        try {
            hashMap = new HashMap();
            try {
                if (a.a(this.f12974a) != null) {
                    hashMap.put("pageName", a.a(this.f12974a));
                }
                if (a.b(this.f12974a) != null) {
                    hashMap.put("event", a.b(this.f12974a));
                }
                if (a.c(this.f12974a) != null) {
                    hashMap.put("arg1", a.c(this.f12974a));
                }
                if (a.d(this.f12974a) != null) {
                    hashMap.put("arg2", a.d(this.f12974a));
                }
                if (a.e(this.f12974a) != null) {
                    hashMap.put("arg3", a.e(this.f12974a));
                }
                if (a.f(this.f12974a) != null) {
                    hashMap.put("args", a.f(this.f12974a));
                }
                if (a.g(this.f12974a) != null) {
                    hashMap.put("pvID", a.g(this.f12974a));
                }
                if (!this.f12974a.f12975a.isEmpty()) {
                    hashMap.put("areaStayTime", this.f12974a.f12975a);
                }
                hashMap.put("currentUnixTime", Long.valueOf(a.h(this.f12974a)));
                hashMap.put("displayTime", Long.valueOf(a.i(this.f12974a)));
                hashMap.putAll(this.f12974a.b);
            } catch (Exception e2) {
                e = e2;
                LogUtil.e("JTEvent", "json err", e);
                return hashMap;
            }
        } catch (Exception e3) {
            hashMap = null;
            e = e3;
        }
        return hashMap;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : a.a(this.f12974a) != null ? a.a(this.f12974a) : "";
    }

    public String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : a.b(this.f12974a) != null ? a.b(this.f12974a) : "";
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            f.a(this);
        }
    }

    /* loaded from: classes5.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private String c;
        private String d;
        private String e;
        private String f;
        private String g;
        private String h;
        private String i;
        private long j;

        /* renamed from: a  reason: collision with root package name */
        public final Map<String, Long> f12975a = new HashMap();
        public final Map<String, Object> b = new HashMap();
        private long k = System.currentTimeMillis();

        static {
            kge.a(573742055);
        }

        public static /* synthetic */ String a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f4ff6726", new Object[]{aVar}) : aVar.c;
        }

        public static /* synthetic */ String b(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e88eeb67", new Object[]{aVar}) : aVar.d;
        }

        public static /* synthetic */ String c(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("dc1e6fa8", new Object[]{aVar}) : aVar.e;
        }

        public static /* synthetic */ String d(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("cfadf3e9", new Object[]{aVar}) : aVar.f;
        }

        public static /* synthetic */ String e(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c33d782a", new Object[]{aVar}) : aVar.g;
        }

        public static /* synthetic */ String f(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b6ccfc6b", new Object[]{aVar}) : aVar.h;
        }

        public static /* synthetic */ String g(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aa5c80ac", new Object[]{aVar}) : aVar.i;
        }

        public static /* synthetic */ long h(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a1a8b807", new Object[]{aVar})).longValue() : aVar.k;
        }

        public static /* synthetic */ long i(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5b2045a6", new Object[]{aVar})).longValue() : aVar.j;
        }

        public a(String str) {
            this.d = str;
        }

        public a a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("11e9ea04", new Object[]{this, str});
            }
            this.c = str;
            return this;
        }

        public a b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("5796e45", new Object[]{this, str});
            }
            this.h = str;
            return this;
        }

        public a c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("f908f286", new Object[]{this, str});
            }
            this.i = str;
            return this;
        }

        public a a(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("6e45432e", new Object[]{this, new Long(j)});
            }
            this.j = j;
            return this;
        }

        public a a(Map<String, Long> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("d9a428ef", new Object[]{this, map});
            }
            this.f12975a.clear();
            this.f12975a.putAll(map);
            return this;
        }

        public a a(String str, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("44b66560", new Object[]{this, str, obj});
            }
            this.b.put(str, obj);
            return this;
        }

        public b a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("ac602057", new Object[]{this}) : new b(this);
        }

        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            } else {
                a().d();
            }
        }
    }
}
