package com.alibaba.ability.env;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.monitor.MUSMonitor;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.collections.ai;
import kotlin.j;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.als;
import tb.alt;
import tb.bfy;
import tb.kge;

/* loaded from: classes2.dex */
public final class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final C0049a Companion;
    private static final bfy l;
    private static String m;

    /* renamed from: a  reason: collision with root package name */
    private Map<String, String> f1823a;
    private String b;
    private Long c;
    private Long d;
    private Long e;
    private Long f;
    private Long g;
    private Long h;
    private Long i;
    private Long j;
    private boolean k;
    private final Map<String, String> n = new LinkedHashMap();

    /* loaded from: classes2.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                C0049a.a(a.Companion, a.this);
            }
        }
    }

    public static final /* synthetic */ Long a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Long) ipChange.ipc$dispatch("3d98c1b5", new Object[]{aVar}) : aVar.c;
    }

    public static final /* synthetic */ void a(a aVar, Long l2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6746839f", new Object[]{aVar, l2});
        } else {
            aVar.d = l2;
        }
    }

    public static final /* synthetic */ void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else {
            m = str;
        }
    }

    public static final /* synthetic */ Long b(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Long) ipChange.ipc$dispatch("b312e7f6", new Object[]{aVar}) : aVar.d;
    }

    public static final /* synthetic */ void b(a aVar, Long l2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a111257e", new Object[]{aVar, l2});
        } else {
            aVar.c = l2;
        }
    }

    public static final /* synthetic */ Map c(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("1f02d0d3", new Object[]{aVar});
        }
        Map<String, String> map = aVar.f1823a;
        if (map == null) {
            q.b("dimensions");
        }
        return map;
    }

    public static final /* synthetic */ Long d(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Long) ipChange.ipc$dispatch("9e073478", new Object[]{aVar}) : aVar.e;
    }

    public static final /* synthetic */ Long e(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Long) ipChange.ipc$dispatch("13815ab9", new Object[]{aVar}) : aVar.f;
    }

    public static final /* synthetic */ Long f(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Long) ipChange.ipc$dispatch("88fb80fa", new Object[]{aVar}) : aVar.g;
    }

    public static final /* synthetic */ Long g(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Long) ipChange.ipc$dispatch("fe75a73b", new Object[]{aVar}) : aVar.h;
    }

    public static final /* synthetic */ Long h(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Long) ipChange.ipc$dispatch("73efcd7c", new Object[]{aVar}) : aVar.i;
    }

    public static final /* synthetic */ Long i(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Long) ipChange.ipc$dispatch("e969f3bd", new Object[]{aVar}) : aVar.j;
    }

    public static final /* synthetic */ bfy i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bfy) ipChange.ipc$dispatch("4c8fea01", new Object[0]) : l;
    }

    public static final /* synthetic */ String j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6aaa74cf", new Object[0]) : m;
    }

    public static final /* synthetic */ Map j(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("3147b02c", new Object[]{aVar}) : aVar.n;
    }

    public final String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.b;
    }

    public final void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.k = z;
        }
    }

    public final boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.k;
    }

    /* renamed from: com.alibaba.ability.env.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0049a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: com.alibaba.ability.env.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class RunnableC0050a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ JSONArray f1824a;
            public final /* synthetic */ ConcurrentHashMap b;

            public RunnableC0050a(JSONArray jSONArray, ConcurrentHashMap concurrentHashMap) {
                this.f1824a = jSONArray;
                this.b = concurrentHashMap;
            }

            @Override // java.lang.Runnable
            public final void run() {
                JSONObject jSONObject;
                String string;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                for (Object obj : this.f1824a) {
                    if ((obj instanceof JSONObject) && (string = (jSONObject = (JSONObject) obj).getString("traceID")) != null) {
                        a aVar = (a) this.b.remove(string);
                        Long l = jSONObject.getLong("startTime");
                        Long l2 = jSONObject.getLong("endTime");
                        if (aVar != null && l != null && l2 != null && !aVar.b()) {
                            a.b(aVar, l);
                            a.a(aVar, l2);
                            C0049a.a(a.Companion, aVar);
                        }
                    }
                }
            }
        }

        static {
            kge.a(1653942854);
        }

        private C0049a() {
        }

        public /* synthetic */ C0049a(o oVar) {
            this();
        }

        public static final /* synthetic */ void a(C0049a c0049a, a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("aa093365", new Object[]{c0049a, aVar});
            } else {
                c0049a.a(aVar);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:37:0x0102 A[Catch: ClassNotFoundException | NoClassDefFoundError | NoSuchMethodError | NoSuchMethodException -> 0x0223, TryCatch #0 {ClassNotFoundException | NoClassDefFoundError | NoSuchMethodError | NoSuchMethodException -> 0x0223, blocks: (B:6:0x0023, B:11:0x0034, B:22:0x0054, B:24:0x006f, B:25:0x0088, B:26:0x009c, B:28:0x00a2, B:29:0x00bb, B:31:0x00c8, B:33:0x00d4, B:35:0x00fc, B:37:0x0102, B:39:0x010e, B:40:0x012c, B:42:0x0132, B:44:0x013e, B:45:0x015c, B:47:0x0162, B:49:0x016e, B:50:0x018c, B:51:0x01ca, B:53:0x01d0, B:54:0x01fa, B:13:0x003e, B:21:0x0051), top: B:57:0x0023 }] */
        /* JADX WARN: Removed duplicated region for block: B:42:0x0132 A[Catch: ClassNotFoundException | NoClassDefFoundError | NoSuchMethodError | NoSuchMethodException -> 0x0223, TryCatch #0 {ClassNotFoundException | NoClassDefFoundError | NoSuchMethodError | NoSuchMethodException -> 0x0223, blocks: (B:6:0x0023, B:11:0x0034, B:22:0x0054, B:24:0x006f, B:25:0x0088, B:26:0x009c, B:28:0x00a2, B:29:0x00bb, B:31:0x00c8, B:33:0x00d4, B:35:0x00fc, B:37:0x0102, B:39:0x010e, B:40:0x012c, B:42:0x0132, B:44:0x013e, B:45:0x015c, B:47:0x0162, B:49:0x016e, B:50:0x018c, B:51:0x01ca, B:53:0x01d0, B:54:0x01fa, B:13:0x003e, B:21:0x0051), top: B:57:0x0023 }] */
        /* JADX WARN: Removed duplicated region for block: B:47:0x0162 A[Catch: ClassNotFoundException | NoClassDefFoundError | NoSuchMethodError | NoSuchMethodException -> 0x0223, TryCatch #0 {ClassNotFoundException | NoClassDefFoundError | NoSuchMethodError | NoSuchMethodException -> 0x0223, blocks: (B:6:0x0023, B:11:0x0034, B:22:0x0054, B:24:0x006f, B:25:0x0088, B:26:0x009c, B:28:0x00a2, B:29:0x00bb, B:31:0x00c8, B:33:0x00d4, B:35:0x00fc, B:37:0x0102, B:39:0x010e, B:40:0x012c, B:42:0x0132, B:44:0x013e, B:45:0x015c, B:47:0x0162, B:49:0x016e, B:50:0x018c, B:51:0x01ca, B:53:0x01d0, B:54:0x01fa, B:13:0x003e, B:21:0x0051), top: B:57:0x0023 }] */
        /* JADX WARN: Removed duplicated region for block: B:53:0x01d0 A[Catch: ClassNotFoundException | NoClassDefFoundError | NoSuchMethodError | NoSuchMethodException -> 0x0223, LOOP:1: B:51:0x01ca->B:53:0x01d0, LOOP_END, TryCatch #0 {ClassNotFoundException | NoClassDefFoundError | NoSuchMethodError | NoSuchMethodException -> 0x0223, blocks: (B:6:0x0023, B:11:0x0034, B:22:0x0054, B:24:0x006f, B:25:0x0088, B:26:0x009c, B:28:0x00a2, B:29:0x00bb, B:31:0x00c8, B:33:0x00d4, B:35:0x00fc, B:37:0x0102, B:39:0x010e, B:40:0x012c, B:42:0x0132, B:44:0x013e, B:45:0x015c, B:47:0x0162, B:49:0x016e, B:50:0x018c, B:51:0x01ca, B:53:0x01d0, B:54:0x01fa, B:13:0x003e, B:21:0x0051), top: B:57:0x0023 }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final void a(com.alibaba.ability.env.a r28) {
            /*
                Method dump skipped, instructions count: 548
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ability.env.a.C0049a.a(com.alibaba.ability.env.a):void");
        }

        public final void a(JSONArray tracerList, ConcurrentHashMap<String, a> tracerCache) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e54b4d60", new Object[]{this, tracerList, tracerCache});
                return;
            }
            q.d(tracerList, "tracerList");
            q.d(tracerCache, "tracerCache");
            bfy.a(a.i(), new RunnableC0050a(tracerList, tracerCache), 0L, null, 6, null);
        }
    }

    static {
        kge.a(-310754178);
        Companion = new C0049a(null);
        l = new bfy("mega_perf_stat", 1);
        m = "";
    }

    public final a a(String ability, String api, Map<String, ? extends Object> map, als context, String callType) {
        String str;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("1c01f9d3", new Object[]{this, ability, api, map, context, callType});
        }
        q.d(ability, "ability");
        q.d(api, "api");
        q.d(context, "context");
        q.d(callType, "callType");
        alt b2 = context.b();
        if (b2 == null || (str = b2.e()) == null) {
            str = "unknown";
        }
        if (map != null) {
            try {
                Object obj = map.get("__mega_context__");
                if (!(obj instanceof JSONObject)) {
                    obj = null;
                }
                JSONObject jSONObject = (JSONObject) obj;
                Object obj2 = jSONObject != null ? jSONObject.get("trace") : null;
                if (obj2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.alibaba.fastjson.JSONObject");
                }
                JSONObject jSONObject2 = (JSONObject) obj2;
                if (jSONObject2 != null) {
                    String string = jSONObject2.getString("traceId");
                    if (string == null) {
                        string = jSONObject2.getString("traceID");
                    }
                    this.b = string;
                    this.c = jSONObject2.getLong("startTime");
                }
            } catch (Exception unused) {
                this.c = this.e;
                this.b = null;
            }
        } else {
            a aVar = this;
            aVar.c = aVar.e;
            aVar.b = null;
        }
        Pair[] pairArr = new Pair[5];
        pairArr[0] = j.a("namespace", str);
        pairArr[1] = j.a("callType", callType);
        pairArr[2] = j.a(MUSMonitor.MODULE_DIM_ABILITY, ability);
        pairArr[3] = j.a("api", api);
        if (this.b == null) {
            z = false;
        }
        pairArr[4] = j.a("isFullTrace", String.valueOf(z));
        this.f1823a = ai.b(pairArr);
        return this;
    }

    public final void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
            return;
        }
        this.d = Long.valueOf(j);
        if (this.c == null || this.d == null || this.k) {
            return;
        }
        bfy.a(l, new b(), 0L, null, 6, null);
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            this.e = Long.valueOf(System.currentTimeMillis());
        }
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        this.f = Long.valueOf(currentTimeMillis);
        if (this.b != null) {
            return;
        }
        a(currentTimeMillis);
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else {
            this.g = Long.valueOf(System.currentTimeMillis());
        }
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else {
            this.h = Long.valueOf(System.currentTimeMillis());
        }
    }

    public final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else {
            this.i = Long.valueOf(System.currentTimeMillis());
        }
    }

    public final void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else {
            this.j = Long.valueOf(System.currentTimeMillis());
        }
    }
}
