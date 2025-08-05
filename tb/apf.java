package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ScheduledFuture;
import tb.aqg;

/* loaded from: classes.dex */
public class apf implements aqg.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static apf f25494a;
    private static int g;
    private static final Object h;
    private static final Object i;
    private List<com.alibaba.analytics.core.model.a> c = new CopyOnWriteArrayList();
    private List<apc> d = Collections.synchronizedList(new ArrayList());
    private ScheduledFuture e = null;
    private Runnable f = new Runnable() { // from class: tb.apf.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                apf.this.b();
            }
        }
    };
    private apd b = new ape(aob.a().k());

    @Override // tb.aqg.a
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        }
    }

    public static /* synthetic */ int a(apf apfVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e074a954", new Object[]{apfVar})).intValue() : apfVar.f();
    }

    public static /* synthetic */ int a(apf apfVar, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("2e20f5b5", new Object[]{apfVar, new Integer(i2)})).intValue() : apfVar.b(i2);
    }

    public static /* synthetic */ apd b(apf apfVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (apd) ipChange.ipc$dispatch("f3252cef", new Object[]{apfVar}) : apfVar.b;
    }

    static {
        kge.a(59340775);
        kge.a(1945812401);
        f25494a = new apf();
        g = 0;
        h = new Object();
        i = new Object();
    }

    private apf() {
        aqe.a().a(new a());
        aqg.a(this);
    }

    public static apf a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (apf) ipChange.ipc$dispatch("f026de7", new Object[0]) : f25494a;
    }

    public void a(com.alibaba.analytics.core.model.a aVar) {
        int size;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3084a2", new Object[]{this, aVar});
            return;
        }
        if (apr.a()) {
            apr.d("LogStoreMgr", "Log", aVar.a());
        }
        synchronized (i) {
            this.c.add(aVar);
            size = this.c.size();
        }
        if (size >= 45 || aob.a().B()) {
            this.e = aqe.a().a(null, this.f, 0L);
        } else {
            ScheduledFuture scheduledFuture = this.e;
            if (scheduledFuture == null || scheduledFuture.isDone()) {
                this.e = aqe.a().a(this.e, this.f, 5000L);
            }
        }
        synchronized (h) {
            int i2 = g + 1;
            g = i2;
            if (i2 > 5000) {
                g = 0;
                aqe.a().a(new b());
            }
        }
    }

    public void b(com.alibaba.analytics.core.model.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96d0afa3", new Object[]{this, aVar});
            return;
        }
        a(aVar);
        b();
    }

    public int a(List<com.alibaba.analytics.core.model.a> list) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c705294c", new Object[]{this, list})).intValue() : this.b.b(list);
    }

    public void b(List<com.alibaba.analytics.core.model.a> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d39e1eda", new Object[]{this, list});
        } else {
            this.b.c(list);
        }
    }

    public List<com.alibaba.analytics.core.model.a> a(int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("87fd354c", new Object[]{this, new Integer(i2)}) : this.b.a(i2);
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        ArrayList arrayList = null;
        try {
            synchronized (i) {
                if (this.c.size() > 0) {
                    arrayList = new ArrayList(this.c);
                    this.c.clear();
                }
            }
            if (arrayList == null || arrayList.size() <= 0) {
                return;
            }
            this.b.a(arrayList);
            a(1, arrayList.size());
        } catch (Throwable unused) {
        }
    }

    public long c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5e", new Object[]{this})).longValue() : this.b.a();
    }

    public void a(apc apcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0734c44", new Object[]{this, apcVar});
        } else {
            this.d.add(apcVar);
        }
    }

    public void b(apc apcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cef652c5", new Object[]{this, apcVar});
        } else {
            this.d.remove(apcVar);
        }
    }

    private void a(int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i2), new Integer(i3)});
            return;
        }
        for (int i4 = 0; i4 < this.d.size(); i4++) {
            apc apcVar = this.d.get(i4);
            if (apcVar != null) {
                if (i2 == 1) {
                    apcVar.a(i3, c());
                } else if (i2 == 2) {
                    c();
                }
            }
        }
    }

    private int f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5b2e1e0", new Object[]{this})).intValue();
        }
        apr.c();
        Calendar calendar = Calendar.getInstance();
        calendar.add(5, -3);
        return this.b.a("time", String.valueOf(calendar.getTimeInMillis()));
    }

    private int b(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a9d66c2d", new Object[]{this, new Integer(i2)})).intValue();
        }
        apr.b("LogStoreMgr", "clearOldLogByCount", Integer.valueOf(i2 > 9000 ? this.b.b((i2 - 9000) + 1000) : 0));
        return i2;
    }

    @Override // tb.aqg.a
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        apr.b("LogStoreMgr", "onBackground", true);
        this.e = aqe.a().a(null, this.f, 0L);
    }

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1240534383);
            kge.a(-1390502639);
        }

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            apr.c();
            apf.a(apf.this);
            int a2 = apf.b(apf.this).a();
            if (a2 <= 9000) {
                return;
            }
            apf.a(apf.this, a2);
        }
    }

    /* loaded from: classes2.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1298723299);
            kge.a(-1390502639);
        }

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            apr.b("LogStoreMgr", "CleanLogTask");
            int a2 = apf.b(apf.this).a();
            if (a2 <= 9000) {
                return;
            }
            apf.a(apf.this, a2);
        }
    }
}
