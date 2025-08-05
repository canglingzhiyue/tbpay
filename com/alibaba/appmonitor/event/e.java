package com.alibaba.appmonitor.event;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.analytics.core.model.LogField;
import com.alibaba.analytics.core.network.NetworkUtil;
import com.alibaba.appmonitor.model.UTDimensionValueSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import tb.aob;
import tb.apr;
import tb.aqc;
import tb.aqe;
import tb.btm;
import tb.kge;

/* loaded from: classes.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static e c;
    private AtomicInteger d = new AtomicInteger(0);
    private AtomicInteger e = new AtomicInteger(0);
    private AtomicInteger f = new AtomicInteger(0);
    private SimpleDateFormat g = new SimpleDateFormat("yyyy-MM-dd");
    private Map<UTDimensionValueSet, com.alibaba.appmonitor.model.c> b = new ConcurrentHashMap();

    /* renamed from: a  reason: collision with root package name */
    private Map<String, c> f2882a = new ConcurrentHashMap();

    static {
        kge.a(553144258);
    }

    public static synchronized e a() {
        synchronized (e.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (e) ipChange.ipc$dispatch("27f8ca62", new Object[0]);
            }
            if (c == null) {
                c = new e();
            }
            return c;
        }
    }

    private e() {
    }

    private UTDimensionValueSet a(int i, Long l, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UTDimensionValueSet) ipChange.ipc$dispatch("cb9ee45a", new Object[]{this, new Integer(i), l, str, str2});
        }
        UTDimensionValueSet uTDimensionValueSet = (UTDimensionValueSet) com.alibaba.appmonitor.pool.a.a().a(UTDimensionValueSet.class, new Object[0]);
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            uTDimensionValueSet.setValue(LogField.ACCESS.toString(), str);
            uTDimensionValueSet.setValue(LogField.ACCESS_SUBTYPE.toString(), str2);
        } else {
            Context k = aob.a().k();
            uTDimensionValueSet.setValue(LogField.ACCESS.toString(), NetworkUtil.c(k));
            uTDimensionValueSet.setValue(LogField.ACCESS_SUBTYPE.toString(), NetworkUtil.d(k));
        }
        uTDimensionValueSet.setValue(LogField.USERID.toString(), aob.a().u());
        uTDimensionValueSet.setValue(LogField.USERNICK.toString(), aob.a().t());
        uTDimensionValueSet.setValue(LogField.EVENTID.toString(), String.valueOf(i));
        if (l == null) {
            l = Long.valueOf(System.currentTimeMillis() / 1000);
        }
        uTDimensionValueSet.setValue("commitDay", this.g.format(new Date(l.longValue() * 1000)));
        return uTDimensionValueSet;
    }

    public void a(int i, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1059b339", new Object[]{this, new Integer(i), str, str2, str3});
        } else {
            a(i, str, str2, str3, null, null, null);
        }
    }

    public void a(int i, String str, String str2, String str3, Long l, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bc328c", new Object[]{this, new Integer(i), str, str2, str3, l, str4, str5});
            return;
        }
        UTDimensionValueSet a2 = a(i, l, str4, str5);
        a aVar = (a) a(a2, str, str2, str3, a.class);
        if (aVar != null) {
            aVar.a(l);
        }
        if (aob.a().E()) {
            a aVar2 = (a) com.alibaba.appmonitor.pool.a.a().a(a.class, Integer.valueOf(i), str, str2, str3);
            aVar2.a(l);
            btm.a(a2, aVar2);
        }
        a(EventType.getEventType(i), this.d);
    }

    public void a(int i, String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a17d7fcd", new Object[]{this, new Integer(i), str, str2, str3, str4, str5});
        } else {
            a(i, str, str2, str3, str4, str5, null, null, null);
        }
    }

    public void a(int i, String str, String str2, String str3, String str4, String str5, Long l, String str6, String str7) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2c09d20", new Object[]{this, new Integer(i), str, str2, str3, str4, str5, l, str6, str7});
            return;
        }
        UTDimensionValueSet a2 = a(i, l, str6, str7);
        a aVar = (a) a(a2, str, str2, str3, a.class);
        if (aVar != null) {
            aVar.b(l);
            aVar.a(str4, str5);
        }
        if (aob.a().E()) {
            a aVar2 = (a) com.alibaba.appmonitor.pool.a.a().a(a.class, Integer.valueOf(i), str, str2, str3);
            aVar2.b(l);
            aVar2.a(str4, str5);
            btm.a(a2, aVar2);
        }
        a(EventType.getEventType(i), this.d);
    }

    public void a(int i, String str, String str2, String str3, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fadd1425", new Object[]{this, new Integer(i), str, str2, str3, new Double(d)});
        } else {
            a(i, str, str2, str3, d, (Long) null, (String) null, (String) null);
        }
    }

    public void a(int i, String str, String str2, String str3, double d, Long l, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f56b3578", new Object[]{this, new Integer(i), str, str2, str3, new Double(d), l, str4, str5});
            return;
        }
        UTDimensionValueSet a2 = a(i, l, str4, str5);
        b bVar = (b) a(a2, str, str2, str3, b.class);
        if (bVar != null) {
            bVar.a(d, l);
        }
        if (aob.a().E()) {
            b bVar2 = (b) com.alibaba.appmonitor.pool.a.a().a(b.class, Integer.valueOf(i), str, str2, str3);
            bVar2.a(d, l);
            btm.a(a2, bVar2);
        }
        a(EventType.getEventType(i), this.e);
    }

    public void a(int i, String str, String str2, MeasureValueSet measureValueSet, DimensionValueSet dimensionValueSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a72022c9", new Object[]{this, new Integer(i), str, str2, measureValueSet, dimensionValueSet});
        } else {
            a(i, str, str2, measureValueSet, dimensionValueSet, (Long) null, (String) null, (String) null);
        }
    }

    public void a(int i, String str, String str2, MeasureValueSet measureValueSet, DimensionValueSet dimensionValueSet, Long l, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c57cfa1c", new Object[]{this, new Integer(i), str, str2, measureValueSet, dimensionValueSet, l, str3, str4});
            return;
        }
        com.alibaba.appmonitor.model.a a2 = com.alibaba.appmonitor.model.b.a().a(str, str2);
        if (a2 != null) {
            if (a2.e() != null) {
                a2.e().setConstantValue(dimensionValueSet);
            }
            if (a2.h() != null) {
                a2.h().setConstantValue(measureValueSet);
            }
            UTDimensionValueSet a3 = a(i, l, str3, str4);
            f fVar = (f) a(a3, str, str2, (String) null, f.class);
            if (fVar != null) {
                fVar.a(dimensionValueSet, measureValueSet);
            }
            if (aob.a().E()) {
                f fVar2 = (f) com.alibaba.appmonitor.pool.a.a().a(f.class, Integer.valueOf(i), str, str2);
                fVar2.a(dimensionValueSet, measureValueSet);
                btm.a(a3, fVar2);
            }
            a(EventType.getEventType(i), this.f);
            return;
        }
        apr.e("metric is null,stat commit failed,please call AppMonitor.register() once before AppMonitor.STAT.commit()", new Object[0]);
    }

    public void a(Integer num, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3dec5ad", new Object[]{this, num, str, str2, str3});
            return;
        }
        String a2 = a(str, str2);
        if (a2 == null) {
            return;
        }
        a(a2, num, str, str2, str3);
    }

    public void a(String str, Integer num, String str2, String str3, String str4) {
        c cVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33ec5923", new Object[]{this, str, num, str2, str3, str4});
            return;
        }
        com.alibaba.appmonitor.model.a a2 = com.alibaba.appmonitor.model.b.a().a(str2, str3);
        if (a2 != null && a2.h() != null) {
            if (a2.h().getMeasure(str4) == null) {
                return;
            }
            synchronized (c.class) {
                cVar = this.f2882a.get(str);
                if (cVar == null) {
                    cVar = (c) com.alibaba.appmonitor.pool.a.a().a(c.class, num, str2, str3);
                    this.f2882a.put(str, cVar);
                }
            }
            cVar.a(str4);
            return;
        }
        apr.e("log discard!,metric is null,please call AppMonitor.register() once before Transaction.begin(measure)", new Object[0]);
    }

    public void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
            return;
        }
        String a2 = a(str, str2);
        if (a2 == null) {
            return;
        }
        a(a2, str3, true);
    }

    public void a(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dbad4d8", new Object[]{this, str, str2, new Boolean(z)});
            return;
        }
        c cVar = this.f2882a.get(str);
        if (cVar == null || !cVar.b(str2)) {
            return;
        }
        this.f2882a.remove(str);
        if (z) {
            b(cVar.e, cVar.f);
        }
        a(cVar.h, cVar.e, cVar.f, cVar.c(), cVar.d());
        com.alibaba.appmonitor.pool.a.a().a((com.alibaba.appmonitor.pool.a) cVar);
    }

    public void a(String str, Integer num, String str2, String str3, DimensionValueSet dimensionValueSet) {
        c cVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdfffe42", new Object[]{this, str, num, str2, str3, dimensionValueSet});
            return;
        }
        synchronized (c.class) {
            cVar = this.f2882a.get(str);
            if (cVar == null) {
                cVar = (c) com.alibaba.appmonitor.pool.a.a().a(c.class, num, str2, str3);
                this.f2882a.put(str, cVar);
            }
        }
        cVar.a(dimensionValueSet);
    }

    private String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{this, str, str2});
        }
        com.alibaba.appmonitor.model.a a2 = com.alibaba.appmonitor.model.b.a().a(str, str2);
        if (a2 == null) {
            return null;
        }
        return a2.a();
    }

    private void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{this, str, str2});
            return;
        }
        com.alibaba.appmonitor.model.a a2 = com.alibaba.appmonitor.model.b.a().a(str, str2);
        if (a2 == null) {
            return;
        }
        a2.b();
    }

    private d a(UTDimensionValueSet uTDimensionValueSet, String str, String str2, String str3, Class<? extends d> cls) {
        Integer eventId;
        com.alibaba.appmonitor.model.c cVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("822c6146", new Object[]{this, uTDimensionValueSet, str, str2, str3, cls});
        }
        if (!aqc.c(str) || !aqc.c(str2) || (eventId = uTDimensionValueSet.getEventId()) == null) {
            return null;
        }
        synchronized (this.b) {
            com.alibaba.appmonitor.model.c cVar2 = this.b.get(uTDimensionValueSet);
            if (cVar2 == null) {
                cVar2 = (com.alibaba.appmonitor.model.c) com.alibaba.appmonitor.pool.a.a().a(com.alibaba.appmonitor.model.c.class, new Object[0]);
                this.b.put(uTDimensionValueSet, cVar2);
                apr.b("EventRepo", "put in Map utDimensionValues", uTDimensionValueSet);
            }
            cVar = cVar2;
        }
        return cVar.a(eventId, str, str2, str3, cls);
    }

    private void a(EventType eventType, AtomicInteger atomicInteger) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("880a820d", new Object[]{this, eventType, atomicInteger});
        } else if (atomicInteger.incrementAndGet() < eventType.getTriggerCount()) {
        } else {
            apr.b("EventRepo", eventType.toString(), " event size exceed trigger count.");
            b(eventType.getEventId());
        }
    }

    public Map<UTDimensionValueSet, List<d>> a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("35efba90", new Object[]{this, new Integer(i)});
        }
        HashMap hashMap = new HashMap();
        synchronized (this.b) {
            Iterator<Map.Entry<UTDimensionValueSet, com.alibaba.appmonitor.model.c>> it = this.b.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<UTDimensionValueSet, com.alibaba.appmonitor.model.c> next = it.next();
                UTDimensionValueSet key = next.getKey();
                com.alibaba.appmonitor.model.c value = next.getValue();
                if (key.getEventId().intValue() == i) {
                    if (value != null) {
                        hashMap.put(key, value.a());
                    } else {
                        apr.b("error", "utDimensionValues", key);
                    }
                    it.remove();
                }
            }
        }
        c(i).set(0);
        return hashMap;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        ArrayList arrayList = new ArrayList(this.f2882a.keySet());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            String str = (String) arrayList.get(i);
            c cVar = this.f2882a.get(str);
            if (cVar != null && cVar.b()) {
                this.f2882a.remove(str);
            }
        }
    }

    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            return;
        }
        final Map<UTDimensionValueSet, List<d>> a2 = a(i);
        aqe.a().a(new Runnable() { // from class: com.alibaba.appmonitor.event.e.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    btm.a(a2);
                }
            }
        });
    }

    private AtomicInteger c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicInteger) ipChange.ipc$dispatch("7c4d2883", new Object[]{this, new Integer(i)});
        }
        if (65501 == i) {
            return this.d;
        }
        if (65502 == i) {
            return this.e;
        }
        if (65503 != i) {
            return null;
        }
        return this.f;
    }
}
