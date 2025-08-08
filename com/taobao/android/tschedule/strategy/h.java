package com.taobao.android.tschedule.strategy;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tschedule.d;
import com.taobao.android.tschedule.strategy.ABTest;
import com.taobao.android.tschedule.strategy.b;
import com.taobao.android.tschedule.task.RenderScheduleTask;
import com.taobao.android.tschedule.taskcontext.RenderTaskContext;
import com.taobao.android.tscheduleprotocol.RenderScheduleProtocol;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.jkq;
import tb.jmc;
import tb.jmh;
import tb.jmi;
import tb.kge;

/* loaded from: classes6.dex */
public class h implements d.a, b.a, com.taobao.android.tscheduleprotocol.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, Float> f15673a;
    private final e b;
    private final AtomicBoolean c;
    private final boolean d;
    private final AtomicBoolean e;
    private int f;
    private float g;
    private Pair<Boolean, String> h;
    private final b i;

    /* loaded from: classes6.dex */
    public static final class a {
        public static final h instance;

        static {
            kge.a(-385730967);
            instance = new h();
        }
    }

    static {
        kge.a(-2144488273);
        kge.a(-2096165210);
        kge.a(-1319442798);
        kge.a(-565723104);
    }

    private h() {
        this.f15673a = new HashMap();
        this.c = new AtomicBoolean(false);
        this.d = com.taobao.android.launcher.common.h.a(".schedule_strategy_on");
        this.e = new AtomicBoolean(false);
        this.f = 1;
        this.g = 0.7f;
        this.h = Pair.create(false, null);
        this.b = new f();
        this.i = new b();
        this.i.a(this);
    }

    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
        } else if (!this.c.compareAndSet(false, true)) {
        } else {
            this.b.a(context);
            com.taobao.android.tscheduleprotocol.c.a(this);
            com.taobao.android.tschedule.d.a(this);
        }
    }

    @Override // com.taobao.android.tschedule.d.a
    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        jkq.a("ScheduleStrategy", "onPreRenderVersionChanged, old=" + str + ", new=" + str2);
        this.b.a();
    }

    @Override // com.taobao.android.tscheduleprotocol.b
    public int a(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("20476506", new Object[]{this, str, map})).intValue();
        }
        this.h = c(str, map);
        if (((Boolean) this.h.first).booleanValue()) {
            this.e.compareAndSet(false, true);
        }
        return 0;
    }

    @Override // com.taobao.android.tscheduleprotocol.b
    public int a(String str, Map<String, String> map, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ee015622", new Object[]{this, str, map, obj})).intValue();
        }
        if (!this.e.compareAndSet(true, false)) {
            return 0;
        }
        try {
            return ABTest.a((String) this.h.second) ? 0 : 2;
        } catch (ABTest.NoABExpException unused) {
            return 4;
        } finally {
            jmc.a("downgrade", "", "1", "TSchedule", "pageEntered", b(str, map));
        }
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : !this.d && !jmh.a("is_strategy_on", false);
    }

    private Map<String, String> b(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("77c63467", new Object[]{this, str, map});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("source", str);
        if (map != null && map.containsKey("fullUrl")) {
            hashMap.put("sourceExtra", map.get("fullUrl"));
        }
        return hashMap;
    }

    private Pair<Boolean, String> c(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("2797fe5b", new Object[]{this, str, map});
        }
        jmc.a("downgrade", "", "1", "TSchedule", "pageEnter", b(str, map));
        if (a()) {
            return Pair.create(false, null);
        }
        List<Pair<String, RenderScheduleTask>> a2 = i.a(i.a(), str);
        if (a2.size() > 0) {
            for (Pair<String, RenderScheduleTask> pair : a2) {
                if (jmi.a(str, map, ((RenderTaskContext) ((RenderScheduleTask) pair.second).taskContext).params.spmVerifyValue) && this.b.a(((RenderScheduleTask) pair.second).taskKey, (String) pair.first)) {
                    return Pair.create(true, ((RenderScheduleTask) pair.second).taskKey);
                }
            }
        }
        return Pair.create(false, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        String a2 = com.taobao.android.launcher.common.h.a(".schedule_strategy_weights", (String) null);
        if (a2 == null) {
            a2 = jmh.a("weight_params_each_day", "");
        }
        try {
            this.g = Float.parseFloat(jmh.a("min_prerender_score", "0.7"));
        } catch (Throwable unused) {
        }
        try {
            this.f = Integer.parseInt(jmh.a("min_first_day_prerender_count", "1"));
        } catch (Throwable unused2) {
        }
        if (a2 != null && a2.length() > 0) {
            String[] split = a2.trim().split(",");
            ArrayList arrayList = new ArrayList(split.length);
            for (String str : split) {
                try {
                    arrayList.add(Float.valueOf(Float.parseFloat(str)));
                } catch (Throwable th) {
                    jkq.a("ScheduleStrategy", "parse config error: " + a2, th);
                }
            }
            this.f15673a.clear();
            Date date = new Date();
            int size = arrayList.size();
            for (int i = 1; i <= size; i++) {
                this.f15673a.put(g.a(g.a(date, -i)), arrayList.get(i - 1));
            }
            ArrayList arrayList2 = new ArrayList(this.f15673a.keySet());
            arrayList2.add(g.a(date));
            this.b.a(arrayList2);
            return;
        }
        jkq.a("ScheduleStrategy", "parse weights config error");
    }

    public String b() {
        d a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this});
        }
        if (a()) {
            return null;
        }
        c();
        String a3 = g.a();
        boolean a4 = this.b.a(a3);
        if (a4) {
            a2 = d();
        } else {
            a2 = a(a3);
        }
        if (a2 != null && !StringUtils.isEmpty(a2.b)) {
            this.i.a(a2);
        }
        String a5 = d.a(a2);
        boolean a6 = ABTest.a(100);
        HashMap hashMap = new HashMap();
        hashMap.put("hasHistory", String.valueOf(a4));
        hashMap.put("isGrayOpen", String.valueOf(a6));
        hashMap.put("bizName", a5);
        jmc.a("downgrade", "", "1", "TSchedule", "Arbitrate", hashMap);
        if (!a6) {
            return null;
        }
        return a5;
    }

    @Override // com.taobao.android.tschedule.strategy.b.a
    public void a(final d dVar, final d dVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11a224a8", new Object[]{this, dVar, dVar2});
        } else {
            com.taobao.android.tschedule.i.b().b(new Runnable() { // from class: com.taobao.android.tschedule.strategy.h.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    jkq.a("ScheduleStrategy", "onHistoryChanged, previous=" + dVar.b + ", current=" + dVar2.b);
                    RenderScheduleProtocol a2 = com.taobao.android.tschedule.protocol.b.a().a(dVar.c);
                    if (a2 != null) {
                        a2.clearPreloadedInstances();
                    }
                    com.taobao.android.tschedule.g.c(dVar.b);
                }
            });
        }
    }

    private d a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("a63392a4", new Object[]{this, str});
        }
        HashMap hashMap = new HashMap();
        List<k> b = this.b.b(str);
        for (k kVar : b) {
            List<Pair<String, RenderScheduleTask>> a2 = i.a(i.a(), kVar.f15675a);
            if (a2.size() > 0) {
                for (Pair<String, RenderScheduleTask> pair : a2) {
                    hashMap.put(((RenderScheduleTask) pair.second).taskKey, new c(((RenderScheduleTask) pair.second).taskKey, ((RenderTaskContext) ((RenderScheduleTask) pair.second).taskContext).bizCode, (hashMap.containsKey(((RenderScheduleTask) pair.second).taskKey) ? ((c) hashMap.get(((RenderScheduleTask) pair.second).taskKey)).f15670a : 0) + kVar.b));
                }
            }
        }
        if (b.isEmpty()) {
            List<RenderScheduleTask> a3 = i.a();
            if (a3.size() == 1) {
                RenderScheduleTask renderScheduleTask = a3.get(0);
                hashMap.put(renderScheduleTask.taskKey, new c(renderScheduleTask.taskKey, ((RenderTaskContext) renderScheduleTask.taskContext).bizCode, 0));
            }
        }
        if (hashMap.values().size() <= 0) {
            return null;
        }
        c cVar = (c) Collections.max(hashMap.values());
        jkq.a("ScheduleStrategy", "arbitrateNoHistory, max is " + cVar);
        if (cVar.f15670a < this.f) {
            return null;
        }
        return cVar;
    }

    private d d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("79050c5d", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, Float> entry : this.f15673a.entrySet()) {
            float floatValue = entry.getValue().floatValue();
            for (k kVar : this.b.b(entry.getKey())) {
                List<Pair<String, RenderScheduleTask>> a2 = i.a(i.a(), kVar.f15675a);
                if (a2.size() > 0) {
                    for (Pair<String, RenderScheduleTask> pair : a2) {
                        float f = 0.0f;
                        if (hashMap.containsKey(((RenderScheduleTask) pair.second).taskKey)) {
                            f = ((com.taobao.android.tschedule.strategy.a) hashMap.get(((RenderScheduleTask) pair.second).taskKey)).f15668a;
                        }
                        hashMap.put(((RenderScheduleTask) pair.second).taskKey, new com.taobao.android.tschedule.strategy.a(((RenderScheduleTask) pair.second).taskKey, ((RenderTaskContext) ((RenderScheduleTask) pair.second).taskContext).bizCode, f + (kVar.b * floatValue)));
                    }
                }
            }
        }
        if (hashMap.values().size() <= 0) {
            return null;
        }
        com.taobao.android.tschedule.strategy.a aVar = (com.taobao.android.tschedule.strategy.a) Collections.max(hashMap.values());
        jkq.a("ScheduleStrategy", "arbitrateHistory, max is " + aVar);
        if (Float.compare(aVar.f15668a, this.g) < 0) {
            return null;
        }
        return aVar;
    }
}
