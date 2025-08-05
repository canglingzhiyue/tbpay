package tb;

import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.ability.result.FinishResult;
import com.alibaba.ability.result.InternalResult;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.monitor.MUSMonitor;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.collections.ai;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;

/* loaded from: classes2.dex */
public final class alu {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;
    private static final ReentrantReadWriteLock e;
    private static final Map<String, Map<String, com.alibaba.ability.b>> f;

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, com.alibaba.ability.b> f25428a;
    private boolean b;
    private AtomicBoolean c;
    private final alt d;
    private final ConcurrentHashMap<String, com.alibaba.ability.env.a> g;
    private boolean h;

    /* loaded from: classes2.dex */
    public static final class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ als d;
        public final /* synthetic */ Map e;
        public final /* synthetic */ alo f;
        public final /* synthetic */ com.alibaba.ability.builder.c g;
        public final /* synthetic */ int h;

        public c(String str, String str2, als alsVar, Map map, alo aloVar, com.alibaba.ability.builder.c cVar, int i) {
            this.b = str;
            this.c = str2;
            this.d = alsVar;
            this.e = map;
            this.f = aloVar;
            this.g = cVar;
            this.h = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.f.onCallback(alu.a(alu.this, this.b, this.c, this.d, this.e, this.f, this.g, this.h));
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ als d;
        public final /* synthetic */ Map e;
        public final /* synthetic */ alo f;
        public final /* synthetic */ com.alibaba.ability.builder.c g;
        public final /* synthetic */ int h;

        public d(String str, String str2, als alsVar, Map map, alo aloVar, com.alibaba.ability.builder.c cVar, int i) {
            this.b = str;
            this.c = str2;
            this.d = alsVar;
            this.e = map;
            this.f = aloVar;
            this.g = cVar;
            this.h = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.f.onCallback(alu.a(alu.this, this.b, this.c, this.d, this.e, this.f, this.g, this.h));
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ als d;
        public final /* synthetic */ Map e;
        public final /* synthetic */ alo f;
        public final /* synthetic */ com.alibaba.ability.builder.c g;
        public final /* synthetic */ int h;

        public e(String str, String str2, als alsVar, Map map, alo aloVar, com.alibaba.ability.builder.c cVar, int i) {
            this.b = str;
            this.c = str2;
            this.d = alsVar;
            this.e = map;
            this.f = aloVar;
            this.g = cVar;
            this.h = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.f.onCallback(alu.a(alu.this, this.b, this.c, this.d, this.e, this.f, this.g, this.h));
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class f implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ als d;
        public final /* synthetic */ Map e;
        public final /* synthetic */ alo f;
        public final /* synthetic */ com.alibaba.ability.builder.c g;
        public final /* synthetic */ int h;

        public f(String str, String str2, als alsVar, Map map, alo aloVar, com.alibaba.ability.builder.c cVar, int i) {
            this.b = str;
            this.c = str2;
            this.d = alsVar;
            this.e = map;
            this.f = aloVar;
            this.g = cVar;
            this.h = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.f.onCallback(alu.a(alu.this, this.b, this.c, this.d, this.e, this.f, this.g, this.h));
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class g implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Ref.ObjectRef b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;
        public final /* synthetic */ als e;
        public final /* synthetic */ Map f;
        public final /* synthetic */ alo g;
        public final /* synthetic */ com.alibaba.ability.builder.c h;
        public final /* synthetic */ CountDownLatch i;
        public final /* synthetic */ int j;

        public g(Ref.ObjectRef objectRef, String str, String str2, als alsVar, Map map, alo aloVar, com.alibaba.ability.builder.c cVar, int i, CountDownLatch countDownLatch) {
            this.b = objectRef;
            this.c = str;
            this.d = str2;
            this.e = alsVar;
            this.f = map;
            this.g = aloVar;
            this.h = cVar;
            this.j = i;
            this.i = countDownLatch;
        }

        /* JADX WARN: Type inference failed for: r1v2, types: [com.alibaba.ability.result.ExecuteResult, T] */
        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            this.b.element = alu.a(alu.this, this.c, this.d, this.e, this.f, this.g, this.h, this.j);
            this.i.countDown();
        }
    }

    /* loaded from: classes2.dex */
    public static final class h implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Map f25435a;

        public h(Map map) {
            this.f25435a = map;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            for (com.alibaba.ability.b bVar : this.f25435a.values()) {
                if (bVar instanceof alm) {
                    ((alm) bVar).onDestroy();
                }
            }
            com.alibaba.ability.utils.c cVar = com.alibaba.ability.utils.c.INSTANCE;
            String name = alu.this.getClass().getName();
            q.b(name, "this.javaClass.name");
            cVar.a(name, "AbilityHubAdapter 销毁，释放能力缓存资源");
        }
    }

    public alu(alt env) {
        q.d(env, "env");
        this.d = env;
        this.h = true;
        this.f25428a = new LinkedHashMap();
        this.g = new ConcurrentHashMap<>();
        this.c = new AtomicBoolean(false);
        com.alibaba.ability.d.a();
    }

    public static final /* synthetic */ com.alibaba.ability.b a(alu aluVar, String str, com.alibaba.ability.builder.c cVar, als alsVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.alibaba.ability.b) ipChange.ipc$dispatch("ef341e1d", new Object[]{aluVar, str, cVar, alsVar}) : aluVar.a(str, cVar, alsVar);
    }

    public static final /* synthetic */ com.alibaba.ability.b a(alu aluVar, String str, als alsVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.alibaba.ability.b) ipChange.ipc$dispatch("1e5a1975", new Object[]{aluVar, str, alsVar}) : aluVar.c(str, alsVar);
    }

    public static final /* synthetic */ ExecuteResult a(alu aluVar, String str, String str2, als alsVar, Map map, alo aloVar, com.alibaba.ability.builder.c cVar, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ExecuteResult) ipChange.ipc$dispatch("757888d", new Object[]{aluVar, str, str2, alsVar, map, aloVar, cVar, new Integer(i)}) : aluVar.a(str, str2, alsVar, map, aloVar, cVar, i);
    }

    public static final /* synthetic */ FinishResult a(alu aluVar, String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FinishResult) ipChange.ipc$dispatch("60a78687", new Object[]{aluVar, str, str2, new Boolean(z)}) : aluVar.a(str, str2, z);
    }

    public static final /* synthetic */ AtomicBoolean a(alu aluVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicBoolean) ipChange.ipc$dispatch("35ac88ae", new Object[]{aluVar}) : aluVar.c;
    }

    public static final /* synthetic */ ConcurrentHashMap b(alu aluVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ConcurrentHashMap) ipChange.ipc$dispatch("9501dd97", new Object[]{aluVar}) : aluVar.g;
    }

    public static final /* synthetic */ boolean b(alu aluVar, String str, als alsVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("771645", new Object[]{aluVar, str, alsVar})).booleanValue() : aluVar.b(str, alsVar);
    }

    public static final /* synthetic */ boolean c(alu aluVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("bd4929f4", new Object[]{aluVar})).booleanValue() : aluVar.h;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public alu(alt env, boolean z) {
        this(env);
        q.d(env, "env");
        this.h = z;
    }

    public final void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.b = z;
        }
    }

    /* loaded from: classes2.dex */
    public static final class a {
        static {
            kge.a(-1309538228);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    static {
        kge.a(-1435643388);
        Companion = new a(null);
        e = new ReentrantReadWriteLock();
        f = new HashMap();
    }

    private final void a(als alsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0423430", new Object[]{this, alsVar});
            return;
        }
        if (alsVar.b() == null) {
            alsVar.a(this.d);
        }
        alsVar.f().a(this);
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [com.alibaba.ability.result.ExecuteResult, T] */
    /* JADX WARN: Type inference failed for: r0v5, types: [com.alibaba.ability.result.ExecuteResult, T] */
    /* JADX WARN: Type inference failed for: r1v15, types: [com.alibaba.ability.result.ExecuteResult, T] */
    public final ExecuteResult a(String name, String api, als context, Map<String, ? extends Object> map, alo callback) {
        Ref.ObjectRef objectRef;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("94fa9e92", new Object[]{this, name, api, context, map, callback});
        }
        q.d(name, "name");
        q.d(api, "api");
        q.d(context, "context");
        q.d(callback, "callback");
        com.alibaba.ability.utils.b.INSTANCE.a("AbilityHubAdapter#syncCall", name, api);
        com.alibaba.ability.utils.b.INSTANCE.a("AbilityHubAdapter#syncCall#performStart");
        context.h().c();
        a(context);
        context.h().a(name, api, map, context, "sync");
        String a2 = context.h().a();
        if (a2 != null) {
            this.g.put(a2, context.h());
        }
        com.alibaba.ability.utils.b.INSTANCE.a();
        com.alibaba.ability.builder.c a3 = a(name);
        com.alibaba.ability.utils.b.INSTANCE.a("AbilityHubAdapter#syncCall#getApiThreadMode");
        int a4 = a(a3, api, name);
        com.alibaba.ability.utils.b.INSTANCE.a();
        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        objectRef2.element = new InternalResult(2, null, null, 6, null);
        if (a4 == 1) {
            context.a("syncCallForceMain", true);
            CountDownLatch countDownLatch = new CountDownLatch(1);
            objectRef = objectRef2;
            com.alibaba.ability.e.a(new g(objectRef2, name, api, context, map, callback, a3, a4, countDownLatch), 0L, 2, null);
            try {
                countDownLatch.await();
            } catch (InterruptedException e2) {
                com.alibaba.ability.utils.c cVar = com.alibaba.ability.utils.c.INSTANCE;
                String name2 = getClass().getName();
                q.b(name2, "this.javaClass.name");
                cVar.a(name2, name + '.' + api + " 能力执行同步等待异常:" + kotlin.a.a(e2));
                StringBuilder sb = new StringBuilder();
                sb.append("能力执行同步等待异常。ability=");
                sb.append(name);
                sb.append(", api=");
                sb.append(api);
                objectRef.element = new ErrorResult(199, sb.toString(), (Map) null, 4, (o) null);
            }
        } else if (a4 == 2 || a4 == 3) {
            objectRef2.element = a(name, api, context, map, callback, a3, a4);
            objectRef = objectRef2;
        } else {
            objectRef = objectRef2;
        }
        context.h().d();
        com.alibaba.ability.utils.b.INSTANCE.a();
        return (ExecuteResult) objectRef.element;
    }

    private final ExecuteResult a(String str, String str2, als alsVar, Map<String, ? extends Object> map, alo aloVar, com.alibaba.ability.builder.c cVar, int i) {
        ExecuteResult a2;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("b2f1d107", new Object[]{this, str, str2, alsVar, map, aloVar, cVar, new Integer(i)});
        }
        com.alibaba.ability.utils.b.INSTANCE.a("AbilityHubAdapter#PrivateSyncCall", str, str2);
        String str3 = (String) alsVar.c("callType");
        if (str3 == null || str3.length() == 0) {
            z = true;
        }
        if (z) {
            alsVar.a("callType", "sync");
        }
        if (q.a((Object) str, (Object) MUSMonitor.MODULE_DIM_ABILITY) && (q.a((Object) str2, (Object) "finishTrace") || q.a((Object) str2, (Object) "batchFinishTrace"))) {
            alsVar.h().a(true);
            a2 = new b(cVar, this, i).a(str, str2, alsVar, map == null ? ai.a() : map, aloVar);
        } else {
            alsVar.h().e();
            a2 = com.alibaba.ability.middleware.g.Companion.a(com.alibaba.ability.middleware.h.a().a(str, this.d.e()), new b(cVar, this, i)).a(str, str2, alsVar, map == null ? ai.a() : map, aloVar);
            alsVar.h().f();
        }
        com.alibaba.ability.utils.b.INSTANCE.a();
        return a2 == null ? new InternalResult(2, null, null, 6, null) : a2;
    }

    public final void b(String name, String api, als context, Map<String, ? extends Object> map, alo callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2df5ebec", new Object[]{this, name, api, context, map, callback});
            return;
        }
        q.d(name, "name");
        q.d(api, "api");
        q.d(context, "context");
        q.d(callback, "callback");
        a(name, api, context, map, callback, false);
    }

    public final void a(String name, String api, als context, Map<String, ? extends Object> map, alo callback, boolean z) {
        IpChange ipChange = $ipChange;
        boolean z2 = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9bc5d67", new Object[]{this, name, api, context, map, callback, new Boolean(z)});
            return;
        }
        q.d(name, "name");
        q.d(api, "api");
        q.d(context, "context");
        q.d(callback, "callback");
        com.alibaba.ability.utils.b.INSTANCE.a("AbilityHubAdapter#asyncCall", name, api);
        context.h().c();
        a(context);
        context.h().a(name, api, map, context, "async");
        String a2 = context.h().a();
        if (a2 != null) {
            this.g.put(a2, context.h());
        }
        com.alibaba.ability.builder.c a3 = a(name);
        String str = (String) context.c("callType");
        if (str == null || str.length() == 0) {
            z2 = true;
        }
        if (z2) {
            context.a("callType", "async");
        }
        int a4 = a(a3, api, name);
        com.alibaba.ability.utils.c cVar = com.alibaba.ability.utils.c.INSTANCE;
        String name2 = getClass().getName();
        q.b(name2, "this.javaClass.name");
        StringBuilder sb = new StringBuilder();
        sb.append(name);
        sb.append('.');
        sb.append(api);
        sb.append(" 异步调用，");
        sb.append(z ? "不阻塞" : "阻塞");
        sb.append("当前线程");
        cVar.a(name2, sb.toString());
        if (z) {
            if (a4 == 1) {
                com.alibaba.ability.e.a(new d(name, api, context, map, callback, a3, a4), -1L);
            } else if (a4 == 2 || a4 == 3) {
                com.alibaba.ability.e.b((Runnable) new e(name, api, context, map, callback, a3, a4));
            }
            context.h().d();
        } else {
            if (a4 == 1) {
                com.alibaba.ability.e.a(new f(name, api, context, map, callback, a3, a4), 0L, 2, null);
            } else if (a4 == 2) {
                callback.onCallback(a(name, api, context, map, callback, a3, a4));
            } else if (a4 == 3) {
                com.alibaba.ability.e.a((Runnable) new c(name, api, context, map, callback, a3, a4));
            }
            context.h().d();
        }
        com.alibaba.ability.utils.b.INSTANCE.a();
    }

    /* loaded from: classes2.dex */
    public static final class b implements com.alibaba.ability.middleware.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final com.alibaba.ability.builder.c f25429a;
        private final alu b;
        private final int c;

        static {
            kge.a(1542643266);
            kge.a(1886473602);
        }

        public b(com.alibaba.ability.builder.c cVar, alu hubAdapter, int i) {
            q.d(hubAdapter, "hubAdapter");
            this.f25429a = cVar;
            this.b = hubAdapter;
            this.c = i;
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x00be A[Catch: all -> 0x03d7, TRY_ENTER, TryCatch #1 {all -> 0x03d7, blocks: (B:7:0x004b, B:9:0x005e, B:12:0x008d, B:15:0x0099, B:17:0x009d, B:20:0x00a8, B:24:0x00b6, B:27:0x00be, B:28:0x00d0, B:80:0x022a, B:81:0x0247, B:30:0x00d5, B:32:0x00dd, B:33:0x00ec, B:35:0x00f4, B:37:0x00fe, B:38:0x0107, B:41:0x0118, B:43:0x0126, B:44:0x012d, B:45:0x0137, B:47:0x013f, B:48:0x0151, B:50:0x0159, B:52:0x0163, B:53:0x016c, B:56:0x0178, B:58:0x017c, B:59:0x0187, B:60:0x0191, B:62:0x0199, B:64:0x019f, B:67:0x01b5, B:69:0x01bd, B:72:0x01d3, B:76:0x0205, B:77:0x0218, B:79:0x0220, B:84:0x0254, B:87:0x025a, B:88:0x027b, B:90:0x0281, B:93:0x02a7, B:98:0x02b0, B:100:0x02c5, B:103:0x02ec, B:105:0x02fd, B:109:0x0326, B:111:0x032e, B:117:0x036a, B:119:0x0380, B:121:0x038d, B:123:0x0393, B:124:0x03a0, B:120:0x0388, B:114:0x0344, B:116:0x034c), top: B:133:0x004b }] */
        /* JADX WARN: Removed duplicated region for block: B:84:0x0254 A[Catch: all -> 0x03d7, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x03d7, blocks: (B:7:0x004b, B:9:0x005e, B:12:0x008d, B:15:0x0099, B:17:0x009d, B:20:0x00a8, B:24:0x00b6, B:27:0x00be, B:28:0x00d0, B:80:0x022a, B:81:0x0247, B:30:0x00d5, B:32:0x00dd, B:33:0x00ec, B:35:0x00f4, B:37:0x00fe, B:38:0x0107, B:41:0x0118, B:43:0x0126, B:44:0x012d, B:45:0x0137, B:47:0x013f, B:48:0x0151, B:50:0x0159, B:52:0x0163, B:53:0x016c, B:56:0x0178, B:58:0x017c, B:59:0x0187, B:60:0x0191, B:62:0x0199, B:64:0x019f, B:67:0x01b5, B:69:0x01bd, B:72:0x01d3, B:76:0x0205, B:77:0x0218, B:79:0x0220, B:84:0x0254, B:87:0x025a, B:88:0x027b, B:90:0x0281, B:93:0x02a7, B:98:0x02b0, B:100:0x02c5, B:103:0x02ec, B:105:0x02fd, B:109:0x0326, B:111:0x032e, B:117:0x036a, B:119:0x0380, B:121:0x038d, B:123:0x0393, B:124:0x03a0, B:120:0x0388, B:114:0x0344, B:116:0x034c), top: B:133:0x004b }] */
        @Override // com.alibaba.ability.middleware.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public com.alibaba.ability.result.ExecuteResult a(java.lang.String r23, java.lang.String r24, tb.als r25, java.util.Map<java.lang.String, ? extends java.lang.Object> r26, tb.alo r27) {
            /*
                Method dump skipped, instructions count: 1016
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: tb.alu.b.a(java.lang.String, java.lang.String, tb.als, java.util.Map, tb.alo):com.alibaba.ability.result.ExecuteResult");
        }
    }

    private final String a(String str, als alsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4b4b3de6", new Object[]{this, str, alsVar});
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("||");
        sb.append(alsVar != null ? alsVar.a() : null);
        return sb.toString();
    }

    private final boolean b(String str, als alsVar) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3515723f", new Object[]{this, str, alsVar})).booleanValue();
        }
        if (this.c.get()) {
            return true;
        }
        ReentrantReadWriteLock reentrantReadWriteLock = e;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i2 = 0; i2 < readHoldCount; i2++) {
            readLock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            com.alibaba.ability.b remove = this.f25428a.remove(a(str, alsVar));
            if (remove == null) {
                remove = null;
            } else if (remove instanceof alm) {
                ((alm) remove).onDestroy();
            }
            if (remove == null) {
                z = false;
            }
            return z;
        } finally {
            while (i < readHoldCount) {
                readLock.lock();
                i++;
            }
            writeLock.unlock();
        }
    }

    private final com.alibaba.ability.b c(String str, als alsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.alibaba.ability.b) ipChange.ipc$dispatch("46122ff1", new Object[]{this, str, alsVar});
        }
        ReentrantReadWriteLock.ReadLock readLock = e.readLock();
        readLock.lock();
        try {
            return this.f25428a.get(a(str, alsVar));
        } finally {
            readLock.unlock();
        }
    }

    public final com.alibaba.ability.builder.c a(String name) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.alibaba.ability.builder.c) ipChange.ipc$dispatch("13b85e3a", new Object[]{this, name});
        }
        q.d(name, "name");
        if (!this.b) {
            return alv.a().a(name, this.d.e(), this.d.d());
        }
        com.alibaba.ability.builder.c a2 = alv.b().a(name, this.d.e(), this.d.d());
        return a2 == null ? alv.a().a(name, this.d.e(), this.d.d()) : a2;
    }

    public final boolean a(String name, String api) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{this, name, api})).booleanValue();
        }
        q.d(name, "name");
        q.d(api, "api");
        if (q.a((Object) name, (Object) MUSMonitor.MODULE_DIM_ABILITY) && (q.a((Object) api, (Object) "finishTrace") || q.a((Object) api, (Object) "batchFinishTrace"))) {
            return true;
        }
        com.alibaba.ability.builder.c a2 = a(name);
        if (api.length() == 0) {
            return a(this, name, a2, (als) null, 4, (Object) null) != null;
        } else if (a2 == null) {
            return false;
        } else {
            return a2.a(api);
        }
    }

    public static /* synthetic */ com.alibaba.ability.b a(alu aluVar, String str, com.alibaba.ability.builder.c cVar, als alsVar, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.alibaba.ability.b) ipChange.ipc$dispatch("69ea7cac", new Object[]{aluVar, str, cVar, alsVar, new Integer(i), obj});
        }
        if ((i & 4) != 0) {
            alsVar = null;
        }
        return aluVar.a(str, cVar, alsVar);
    }

    private final com.alibaba.ability.b a(String str, com.alibaba.ability.builder.c cVar, als alsVar) {
        String str2;
        Map<String, com.alibaba.ability.b> map;
        Map<String, com.alibaba.ability.b> map2;
        com.alibaba.ability.b bVar;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (com.alibaba.ability.b) ipChange.ipc$dispatch("5d597b63", new Object[]{this, str, cVar, alsVar});
        }
        if (this.c.get()) {
            return null;
        }
        String a2 = a(str, alsVar);
        ReentrantReadWriteLock.ReadLock readLock = e.readLock();
        readLock.lock();
        try {
            com.alibaba.ability.b bVar2 = this.f25428a.get(a2);
            if (bVar2 != null) {
                return bVar2;
            }
            if (cVar == null) {
                cVar = a(str);
            }
            if (cVar == null) {
                return null;
            }
            if (cVar.b() == 4) {
                return cVar.a();
            }
            int b2 = cVar.b();
            if (b2 != 1) {
                str2 = b2 != 2 ? null : this.d.e();
            } else {
                str2 = "";
            }
            if (str2 != null && (map2 = f.get(str2)) != null && (bVar = map2.get(str)) != null) {
                return bVar;
            }
            ReentrantReadWriteLock reentrantReadWriteLock = e;
            ReentrantReadWriteLock.ReadLock readLock2 = reentrantReadWriteLock.readLock();
            int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
            for (int i2 = 0; i2 < readHoldCount; i2++) {
                readLock2.unlock();
            }
            ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
            writeLock.lock();
            com.alibaba.ability.b bVar3 = this.f25428a.get(a2);
            if (bVar3 == null) {
                bVar3 = (str2 == null || (map = f.get(str2)) == null) ? null : map.get(str);
            }
            if (bVar3 != null) {
                while (i < readHoldCount) {
                    readLock2.lock();
                    i++;
                }
                writeLock.unlock();
                return bVar3;
            }
            com.alibaba.ability.b a3 = cVar.a();
            if (a3 == null) {
                while (i < readHoldCount) {
                    readLock2.lock();
                    i++;
                }
                writeLock.unlock();
                return null;
            }
            if (str2 != null) {
                if (f.get(str2) == null) {
                    f.put(str2, new LinkedHashMap());
                }
                Map<String, com.alibaba.ability.b> map3 = f.get(str2);
                if (map3 != null) {
                    map3.put(str, a3);
                }
            }
            this.f25428a.put(a2, a3);
            while (i < readHoldCount) {
                readLock2.lock();
                i++;
            }
            writeLock.unlock();
            return a3;
        } finally {
            readLock.unlock();
        }
    }

    private final FinishResult a(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        boolean z2 = false;
        if (ipChange instanceof IpChange) {
            return (FinishResult) ipChange.ipc$dispatch("c0ef7d4d", new Object[]{this, str, str2, new Boolean(z)});
        }
        if (z) {
            if (a(str) != null) {
                z2 = true;
            }
            com.alibaba.ability.utils.c cVar = com.alibaba.ability.utils.c.INSTANCE;
            String name = getClass().getName();
            q.b(name, "this.javaClass.name");
            cVar.a(name, "多实例 canIUseAbility 判断结果：" + z2);
        } else {
            z2 = a(str, str2);
            com.alibaba.ability.utils.c cVar2 = com.alibaba.ability.utils.c.INSTANCE;
            String name2 = getClass().getName();
            q.b(name2, "this.javaClass.name");
            cVar2.a(name2, "canIUseAbility 判断结果：" + z2);
        }
        return new FinishResult(null, z2 ? nom.VALUE_YES : "NO", 1, null);
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (!this.c.compareAndSet(false, true)) {
        } else {
            com.alibaba.ability.e.a(new h(ai.b(this.f25428a)), -1L);
        }
    }

    private final int a(com.alibaba.ability.builder.c cVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3b28f3b7", new Object[]{this, cVar, str, str2})).intValue();
        }
        if (cVar == null) {
            com.alibaba.ability.utils.c cVar2 = com.alibaba.ability.utils.c.INSTANCE;
            String name = getClass().getName();
            q.b(name, "this.javaClass.name");
            cVar2.a(name, "builder 为 null，" + str2 + '.' + str + " 线程模式为 any");
            return 2;
        } else if (b(str2, str)) {
            com.alibaba.ability.utils.c cVar3 = com.alibaba.ability.utils.c.INSTANCE;
            String name2 = getClass().getName();
            q.b(name2, "this.javaClass.name");
            cVar3.a(name2, str2 + '.' + str + " 为主线程白名单能力");
            return 1;
        } else {
            int b2 = cVar.b(str);
            com.alibaba.ability.utils.c cVar4 = com.alibaba.ability.utils.c.INSTANCE;
            String name3 = getClass().getName();
            q.b(name3, "this.javaClass.name");
            cVar4.a(name3, str2 + '.' + str + " 线程模式为 " + b2);
            return b2;
        }
    }

    public void finalize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a35321a5", new Object[]{this});
            return;
        }
        a();
        super.finalize();
    }

    private final boolean b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("65d7b881", new Object[]{this, str, str2})).booleanValue();
        }
        com.alibaba.ability.inject.c a2 = com.alibaba.ability.f.INSTANCE.a();
        if (a2 == null) {
            return false;
        }
        Set<String> c2 = a2.c();
        if (a2.b().contains(str)) {
            return true;
        }
        if (!c2.isEmpty()) {
            if (c2.contains(str + '.' + str2)) {
                return true;
            }
        }
        return false;
    }
}
