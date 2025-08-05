package tb;

import com.alibaba.analytics.core.config.f;
import com.alibaba.appmonitor.event.EventType;
import com.alibaba.appmonitor.event.e;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.framework.preload.cache.IDetailCache;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ScheduledFuture;
import tb.aqg;

/* loaded from: classes.dex */
public class btf implements f.a, aot, aqg.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static btf f26122a;
    private List<bte> b = Collections.synchronizedList(new ArrayList());
    private List<bte> c = Collections.synchronizedList(new ArrayList());
    private List<bte> d = Collections.synchronizedList(new ArrayList());
    private List<com.alibaba.appmonitor.model.a> e = Collections.synchronizedList(new ArrayList());
    private long f = -2;
    private ScheduledFuture g = null;
    private ScheduledFuture h = null;
    private Runnable i = new Runnable() { // from class: tb.btf.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                btf.this.b();
            }
        }
    };
    private Runnable j = new Runnable() { // from class: tb.btf.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                btf.a(btf.this);
            }
        }
    };

    /* renamed from: tb.btf$3  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass3 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f26125a = new int[EventType.values().length];

        static {
            try {
                f26125a[EventType.ALARM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f26125a[EventType.COUNTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f26125a[EventType.STAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Override // tb.aqg.a
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        }
    }

    public static /* synthetic */ void a(btf btfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e261e004", new Object[]{btfVar});
        } else {
            btfVar.c();
        }
    }

    public static /* synthetic */ void b(btf btfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0e4e685", new Object[]{btfVar});
        } else {
            btfVar.i();
        }
    }

    public static /* synthetic */ void c(btf btfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf67ed06", new Object[]{btfVar});
        } else {
            btfVar.h();
        }
    }

    public static /* synthetic */ void d(btf btfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adeaf387", new Object[]{btfVar});
        } else {
            btfVar.j();
        }
    }

    static {
        kge.a(-745234221);
        kge.a(1945812401);
        kge.a(-410959116);
        kge.a(-2114741388);
        f26122a = new btf();
    }

    private btf() {
        aqg.a(this);
        aos.a().a(this);
        f.a().a("offline_duration", this);
        aqe.a().a(new a());
        f();
    }

    public static btf a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (btf) ipChange.ipc$dispatch("f02f14a", new Object[0]) : f26122a;
    }

    public void a(EventType eventType, bte bteVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d63a8a", new Object[]{this, eventType, bteVar});
            return;
        }
        if (EventType.ALARM == eventType) {
            this.b.add(bteVar);
        } else if (EventType.COUNTER == eventType) {
            this.c.add(bteVar);
        } else if (EventType.STAT == eventType) {
            this.d.add(bteVar);
        }
        if (this.b.size() >= 100 || this.c.size() >= 100 || this.d.size() >= 100) {
            this.g = aqe.a().a(null, this.i, 0L);
            return;
        }
        ScheduledFuture scheduledFuture = this.g;
        if (scheduledFuture != null && (scheduledFuture == null || !scheduledFuture.isDone())) {
            return;
        }
        this.g = aqe.a().a(this.g, this.i, 30000L);
    }

    public void a(com.alibaba.appmonitor.model.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac7ec371", new Object[]{this, aVar});
            return;
        }
        if (aVar != null) {
            this.e.add(aVar);
        }
        if (this.e.size() >= 100) {
            this.g = aqe.a().a(null, this.i, 0L);
        } else {
            this.g = aqe.a().a(this.g, this.i, 30000L);
        }
    }

    public com.alibaba.appmonitor.model.a b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.alibaba.appmonitor.model.a) ipChange.ipc$dispatch("c39fb442", new Object[]{this, str, str2});
        }
        aoe G = aob.a().G();
        List<? extends aof> a2 = G.a(com.alibaba.appmonitor.model.a.class, "module=\"" + str + "\" and monitor_point=\"" + str2 + "\"", null, 1);
        if (a2 != null && a2.size() > 0) {
            return (com.alibaba.appmonitor.model.a) a2.get(0);
        }
        return null;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        apr.c();
        a(this.b);
        a(this.c);
        a(this.d);
        b(this.e);
    }

    private void a(List<?> list) {
        ArrayList arrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        } else if (list == null || list.size() <= 0) {
        } else {
            synchronized (list) {
                arrayList = new ArrayList(list);
                list.clear();
            }
            aob.a().G().a(arrayList);
        }
    }

    private void b(List<com.alibaba.appmonitor.model.a> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d39e1eda", new Object[]{this, list});
        } else if (list != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            synchronized (list) {
                for (int i = 0; i < list.size(); i++) {
                    com.alibaba.appmonitor.model.a aVar = list.get(i);
                    com.alibaba.appmonitor.model.a b = b(aVar.c(), aVar.d());
                    if (b != null) {
                        aVar.c = b.c;
                        arrayList.add(aVar);
                    } else {
                        arrayList2.add(aVar);
                    }
                }
                list.clear();
            }
            if (arrayList.size() > 0) {
                aob.a().G().c(arrayList);
            }
            if (arrayList2.size() <= 0) {
                return;
            }
            aob.a().G().a(arrayList2);
        }
    }

    public List<? extends bte> a(EventType eventType, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("a4fb4f31", new Object[]{this, eventType, new Integer(i)});
        }
        aoe G = aob.a().G();
        Class<? extends aof> a2 = a(eventType);
        return G.a(a2, "commit_time<" + ((System.currentTimeMillis() / 1000) - (g() / 1000)), "access,sub_access,module,monitor_point", i);
    }

    private Class<? extends aof> a(EventType eventType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("7a8246fa", new Object[]{this, eventType});
        }
        if (EventType.ALARM == eventType) {
            return btc.class;
        }
        if (EventType.COUNTER == eventType) {
            return btd.class;
        }
        if (EventType.STAT == eventType) {
            return btg.class;
        }
        return bte.class;
    }

    @Override // tb.aqg.a
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        apr.b("TempEventMgr", "onBackground", true);
        this.g = aqe.a().a(null, this.i, 0L);
    }

    private void c() {
        int i;
        IpChange ipChange = $ipChange;
        char c = 0;
        int i2 = 1;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        apr.c();
        EventType[] values = EventType.values();
        int length = values.length;
        int i3 = 0;
        while (i3 < length) {
            EventType eventType = values[i3];
            while (true) {
                List<? extends bte> a2 = a(eventType, 500);
                Object[] objArr = new Object[4];
                objArr[c] = "type";
                objArr[i2] = eventType;
                int i4 = 2;
                objArr[2] = "events.size()";
                objArr[3] = Integer.valueOf(a2.size());
                apr.b((String) null, objArr);
                if (a2.size() != 0) {
                    int i5 = 0;
                    while (i5 < a2.size()) {
                        int i6 = AnonymousClass3.f26125a[eventType.ordinal()];
                        if (i6 == i2) {
                            i = i3;
                            btc btcVar = (btc) a2.get(i5);
                            if (btcVar.a()) {
                                e.a().a(eventType.getEventId(), btcVar.f, btcVar.g, btcVar.d, Long.valueOf(btcVar.h), btcVar.i, btcVar.j);
                            } else {
                                e.a().a(eventType.getEventId(), btcVar.f, btcVar.g, btcVar.d, btcVar.f26120a, btcVar.b, Long.valueOf(btcVar.h), btcVar.i, btcVar.j);
                            }
                        } else if (i6 != i4) {
                            if (i6 == 3) {
                                btg btgVar = (btg) a2.get(i5);
                                e.a().a(eventType.getEventId(), btgVar.f, btgVar.g, btgVar.a(), btgVar.b());
                            }
                            i = i3;
                        } else {
                            btd btdVar = (btd) a2.get(i5);
                            i = i3;
                            e.a().a(eventType.getEventId(), btdVar.f, btdVar.g, btdVar.f26121a, btdVar.b, Long.valueOf(btdVar.h), btdVar.i, btdVar.j);
                        }
                        i5++;
                        i3 = i;
                        i2 = 1;
                        i4 = 2;
                    }
                    c(a2);
                    c = 0;
                    i2 = 1;
                }
            }
            i3++;
            c = 0;
            i2 = 1;
        }
    }

    private void c(List<? extends bte> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e037145b", new Object[]{this, list});
        } else {
            aob.a().G().b(list);
        }
    }

    @Override // tb.aot
    public void a(Thread thread, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85272dfc", new Object[]{this, thread, th});
            return;
        }
        apr.c();
        b();
    }

    @Override // com.alibaba.analytics.core.config.f.a
    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else if (!"offline_duration".equalsIgnoreCase(str)) {
        } else {
            f();
        }
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        long g = g();
        if (this.f == g) {
            return;
        }
        this.f = g;
        this.h = aqe.a().b(this.h, this.j, this.f);
    }

    private long g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5c0f962", new Object[]{this})).longValue();
        }
        int b = f.a().b("offline_duration");
        return b <= 0 ? IDetailCache.KEEP_MIN_HAS_CACHE_TIME : b <= 3600 ? 3600000 : b * 1000;
    }

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-214518213);
            kge.a(-1390502639);
        }

        private a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            btf.b(btf.this);
            btf.c(btf.this);
            btf.d(btf.this);
        }
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else {
            a(btd.class);
        }
    }

    private void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
        } else {
            a(btc.class);
        }
    }

    private void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
        } else {
            a(btg.class);
        }
    }

    private void a(Class<? extends aof> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20fa47d5", new Object[]{this, cls});
            return;
        }
        b(cls);
        if (aob.a().G().b(cls) <= 50000) {
            return;
        }
        a(cls, 10000);
    }

    private long a(Class<? extends aof> cls, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fe4f25c2", new Object[]{this, cls, new Integer(i)})).longValue();
        }
        String a2 = aob.a().G().a(cls);
        aoe G = aob.a().G();
        return G.a(cls, " _id in ( select _id from " + a2 + "  ORDER BY  _id ASC LIMIT " + i + " )", (String[]) null);
    }

    private int b(Class<? extends aof> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a7800267", new Object[]{this, cls})).intValue();
        }
        Calendar calendar = Calendar.getInstance();
        calendar.add(5, -7);
        aoe G = aob.a().G();
        return G.a(cls, "commit_time< " + (calendar.getTimeInMillis() / 1000), (String[]) null);
    }
}
