package com.taobao.android.tbabilitykit;

import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.ability.result.ExecutingResult;
import com.alibaba.ability.result.FinishResult;
import com.alibaba.ability.result.a$a;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTTracker;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.ai;
import kotlin.collections.p;
import tb.aln;
import tb.als;
import tb.kge;

/* loaded from: classes6.dex */
public final class t implements com.alibaba.ability.b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String API_GET_PAGE_NAME = "getPageName";
    public static final String API_SUBSCRIBE = "subscribe";
    public static final String API_UNSUBSCRIBE = "unsubscribe";
    public static final a Companion;

    /* renamed from: a  reason: collision with root package name */
    private aln f15356a;
    private u c;
    private AtomicBoolean b = new AtomicBoolean(false);
    private final Map<String, Map<String, List<String>>> d = new LinkedHashMap();

    /* loaded from: classes6.dex */
    public static final class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ int b;
        public final /* synthetic */ aln c;

        public c(int i, aln alnVar) {
            this.b = i;
            this.c = alnVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            com.ut.mini.l lVar = com.ut.mini.l.getInstance();
            kotlin.jvm.internal.q.b(lVar, "UTPageHitHelper.getInstance()");
            String currentPageName = lVar.getCurrentPageName();
            if (currentPageName == null) {
                t.a(t.this, this.b + 1, this.c, 50L);
            } else {
                this.c.a(new FinishResult(new JSONObject(ai.b(kotlin.j.a("pageName", currentPageName))), null, 2, null));
            }
        }
    }

    /* loaded from: classes6.dex */
    public static final class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ List b;

        public d(List list) {
            this.b = list;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Set<Map.Entry<String, Object>> entrySet;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            List list = this.b;
            ArrayList<Map> arrayList = new ArrayList(p.a((Iterable) list, 10));
            for (Object obj : list) {
                if (!(obj instanceof Map)) {
                    obj = null;
                }
                arrayList.add((Map) obj);
            }
            for (Map map : arrayList) {
                String a2 = com.alibaba.ability.e.a(map, "pageName", "");
                if (a2 == null) {
                    a2 = "";
                }
                Map<String, Object> a3 = com.alibaba.ability.e.a(map, "arg1AndKeys");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (a3 != null && (entrySet = a3.entrySet()) != null) {
                    Set<Map.Entry<String, Object>> set = entrySet;
                    ArrayList arrayList2 = new ArrayList(p.a(set, 10));
                    Iterator<T> it = set.iterator();
                    while (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        Object value = entry.getValue();
                        if (!(value instanceof List)) {
                            value = null;
                        }
                        List list2 = (List) value;
                        if (list2 == null) {
                            list2 = p.a();
                        }
                        arrayList2.add((List) linkedHashMap.put(entry.getKey(), list2));
                    }
                }
                if (!kotlin.jvm.internal.q.a((Object) a2, (Object) "")) {
                    t.a(t.this).put(a2, linkedHashMap);
                }
            }
            com.ut.mini.module.trackerlistener.b.getInstance().registerListener(t.c(t.this));
        }
    }

    static {
        kge.a(-706204557);
        kge.a(-948502777);
        Companion = new a(null);
    }

    public static final /* synthetic */ Map a(t tVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("b9c1713c", new Object[]{tVar}) : tVar.d;
    }

    public static final /* synthetic */ void a(t tVar, int i, aln alnVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccf6855b", new Object[]{tVar, new Integer(i), alnVar, new Long(j)});
        } else {
            tVar.a(i, alnVar, j);
        }
    }

    public static final /* synthetic */ aln b(t tVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (aln) ipChange.ipc$dispatch("66e4a25d", new Object[]{tVar}) : tVar.f15356a;
    }

    public static final /* synthetic */ u c(t tVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (u) ipChange.ipc$dispatch("884d4d43", new Object[]{tVar}) : tVar.c;
    }

    /* loaded from: classes6.dex */
    public static final class a {
        static {
            kge.a(1122853883);
        }

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.o oVar) {
            this();
        }
    }

    @Override // com.alibaba.ability.b
    public ExecuteResult execute(String api, als context, Map<String, ? extends Object> params, aln callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("a38490db", new Object[]{this, api, context, params, callback});
        }
        kotlin.jvm.internal.q.d(api, "api");
        kotlin.jvm.internal.q.d(context, "context");
        kotlin.jvm.internal.q.d(params, "params");
        kotlin.jvm.internal.q.d(callback, "callback");
        int hashCode = api.hashCode();
        if (hashCode != -1357795536) {
            if (hashCode == 514841930) {
                if (api.equals("subscribe")) {
                    List<? extends Object> b2 = com.alibaba.ability.e.b(params, "utTrackers");
                    if (b2 == null || b2.isEmpty()) {
                        callback.a(a$a.Companion.b("The param utTrackers is error, please check it."));
                    } else {
                        a(callback, b2);
                    }
                    return null;
                }
            } else if (hashCode == 583281361 && api.equals("unsubscribe")) {
                if (this.b.compareAndSet(true, false)) {
                    a();
                    return new FinishResult(new JSONObject(ai.b(kotlin.j.a("success", true))), null, 2, null);
                }
                return new ErrorResult("1001", "Please invoke ut.track first", (Map) null, 4, (kotlin.jvm.internal.o) null);
            }
        } else if (api.equals(API_GET_PAGE_NAME)) {
            a(0, callback, -1L);
            return null;
        }
        return a$a.Companion.a("Api not found");
    }

    private final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        com.ut.mini.module.trackerlistener.b.getInstance().unregisterListener(this.c);
        this.c = null;
        this.f15356a = null;
        this.d.clear();
    }

    private final void a(int i, aln alnVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b86953c", new Object[]{this, new Integer(i), alnVar, new Long(j)});
        } else if (i >= 20) {
            alnVar.a(new ErrorResult("1003", "The utTracker.getPageName is timeout, please try again.", (Map) null, 4, (kotlin.jvm.internal.o) null));
        } else {
            com.alibaba.ability.e.a(new c(i, alnVar), j);
        }
    }

    private final void a(aln alnVar, List<? extends Object> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1f93146", new Object[]{this, alnVar, list});
        } else if (this.b.compareAndSet(false, true)) {
            this.f15356a = alnVar;
            this.c = new u(new b(this));
            com.alibaba.ability.e.c((Runnable) new d(list));
        } else {
            alnVar.a(new ErrorResult("1002", "A tracker already exists", (Map) null, 4, (kotlin.jvm.internal.o) null));
        }
    }

    /* loaded from: classes6.dex */
    public static final class b implements f {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference<t> f15357a;

        /* loaded from: classes6.dex */
        public static final class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public final /* synthetic */ Map b;
            public final /* synthetic */ String c;
            public final /* synthetic */ String d;

            public a(Map map, String str, String str2) {
                this.b = map;
                this.c = str;
                this.d = str2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                String str;
                String str2;
                String str3;
                Map a2;
                Map map;
                List<String> list;
                String str4;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                Map map2 = this.b;
                if (map2 == null || (str = (String) map2.get("ARG2")) == null) {
                    str = "";
                }
                Map map3 = this.b;
                if (map3 == null || (str2 = (String) map3.get("ARG3")) == null) {
                    str2 = "";
                }
                Map map4 = this.b;
                if (map4 == null || (str3 = (String) map4.get("EVENTID")) == null) {
                    str3 = "";
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("ARG1", this.c);
                linkedHashMap.put("ARG2", str);
                linkedHashMap.put("ARG3", str2);
                linkedHashMap.put("EVENTID", str3);
                linkedHashMap.put("PAGE", this.d);
                t tVar = (t) b.a(b.this).get();
                if (tVar != null && (a2 = t.a(tVar)) != null && (map = (Map) a2.get(this.d)) != null && (list = (List) map.get(this.c)) != null) {
                    for (String str5 : list) {
                        Map map5 = this.b;
                        if (map5 == null || (str4 = (String) map5.get(str5)) == null) {
                            str4 = "";
                        }
                        linkedHashMap.put(str5, str4);
                    }
                }
                final JSONObject jSONObject = new JSONObject(ai.b(kotlin.j.a("pageName", this.d), kotlin.j.a("utData", new JSONObject(linkedHashMap))));
                com.alibaba.ability.e.a(new Runnable() { // from class: com.taobao.android.tbabilitykit.t.b.a.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public final void run() {
                        aln b;
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        t tVar2 = (t) b.a(b.this).get();
                        if (tVar2 == null || (b = t.b(tVar2)) == null) {
                            return;
                        }
                        b.a(new ExecutingResult(jSONObject, "onUTTrigger"));
                    }
                }, 0L, 2, null);
            }
        }

        static {
            kge.a(-311892668);
            kge.a(-1563492582);
        }

        public b(t ability) {
            kotlin.jvm.internal.q.d(ability, "ability");
            this.f15357a = new WeakReference<>(ability);
        }

        public static final /* synthetic */ WeakReference a(b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (WeakReference) ipChange.ipc$dispatch("80bb5357", new Object[]{bVar}) : bVar.f15357a;
        }

        @Override // com.taobao.android.tbabilitykit.f
        public void a(UTTracker uTTracker, Map<String, String> map) {
            String str;
            Map a2;
            Map map2;
            Set keySet;
            String str2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4fa7964f", new Object[]{this, uTTracker, map});
                return;
            }
            String str3 = "";
            if (map == null || (str = map.get("ARG1")) == null) {
                str = str3;
            }
            if (map != null && (str2 = map.get("PAGE")) != null) {
                str3 = str2;
            }
            t tVar = this.f15357a.get();
            if (tVar == null || (a2 = t.a(tVar)) == null || (map2 = (Map) a2.get(str3)) == null || (keySet = map2.keySet()) == null || !keySet.contains(str)) {
                return;
            }
            com.alibaba.ability.e.c((Runnable) new a(map, str, str3));
        }
    }

    public void finalize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a35321a5", new Object[]{this});
            return;
        }
        super.finalize();
        try {
            if (!this.b.compareAndSet(true, false)) {
                return;
            }
            a();
        } catch (Throwable unused) {
        }
    }
}
