package com.taobao.android.trade.event;

import android.os.Looper;
import android.util.Log;
import android.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import tb.kge;

/* loaded from: classes6.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static String f15617a;
    public static final e c;
    private final Map<Integer, CopyOnWriteArrayList<p>> d;
    private final l e;
    private final b f;
    private final com.taobao.android.trade.event.a g;
    private final ExecutorService h;
    private final ThreadLocal<a> i;

    /* renamed from: com.taobao.android.trade.event.d$2  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class AnonymousClass2 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f15619a = new int[ThreadMode.values().length];

        static {
            try {
                f15619a[ThreadMode.CurrentThread.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15619a[ThreadMode.MainThread.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15619a[ThreadMode.BackgroundThread.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15619a[ThreadMode.AsyncThread.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* loaded from: classes6.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final List<Pair<Event, c>> f15620a = new ArrayList();
        public boolean b;
        public boolean c;
        public p d;
        public Object e;
        public boolean f;

        static {
            kge.a(-686734739);
        }
    }

    static {
        kge.a(360025948);
        f15617a = "EventCenter";
        c = new e();
    }

    public static e b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("7e1419ea", new Object[0]) : new e();
    }

    public d() {
        this(c);
    }

    public d(e eVar) {
        this.i = new ThreadLocal<a>() { // from class: com.taobao.android.trade.event.d.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r0v2, types: [com.taobao.android.trade.event.d$a, java.lang.Object] */
            @Override // java.lang.ThreadLocal
            public /* synthetic */ a initialValue() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ipChange.ipc$dispatch("2908671e", new Object[]{this}) : a();
            }

            public a a() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("f25697cf", new Object[]{this}) : new a();
            }
        };
        this.d = new HashMap();
        this.e = new l(this, Looper.getMainLooper(), 10);
        this.f = new b(this);
        this.g = new com.taobao.android.trade.event.a(this);
        this.h = eVar.f;
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        synchronized (this) {
            for (Integer num : new ArrayList(this.d.keySet())) {
                a(num.intValue());
            }
            this.d.clear();
        }
    }

    public void a(int i, j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("675411d3", new Object[]{this, new Integer(i), jVar});
        } else {
            a(i, jVar, (h) null);
        }
    }

    @Deprecated
    public void a(int i, j jVar, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cfa4ee", new Object[]{this, new Integer(i), jVar, gVar});
        } else if (jVar == null) {
        } else {
            synchronized (this) {
                CopyOnWriteArrayList<p> d = d(i);
                if (d == null) {
                    d = new CopyOnWriteArrayList<>();
                }
                Iterator<p> it = d.iterator();
                while (it.hasNext()) {
                    if (it.next().a() == jVar) {
                        return;
                    }
                }
                d.add(new p(i, jVar, gVar, false));
                this.d.put(Integer.valueOf(i), d);
            }
        }
    }

    public void a(int i, j jVar, h hVar) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d0194d", new Object[]{this, new Integer(i), jVar, hVar});
        } else if (jVar == null) {
        } else {
            synchronized (this) {
                CopyOnWriteArrayList<p> d = d(i);
                if (d == null) {
                    d = new CopyOnWriteArrayList<>();
                }
                Iterator<p> it = d.iterator();
                while (it.hasNext()) {
                    if (it.next().a() == jVar) {
                        return;
                    }
                }
                g b = hVar != null ? hVar.b() : null;
                if (hVar == null || !hVar.a()) {
                    z = false;
                }
                d.add(new p(i, jVar, b, z));
                this.d.put(Integer.valueOf(i), d);
            }
        }
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            b(i, null);
        }
    }

    public void b(int i, j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be7202b2", new Object[]{this, new Integer(i), jVar});
            return;
        }
        synchronized (this) {
            CopyOnWriteArrayList<p> d = d(i);
            if (d != null && !d.isEmpty()) {
                if (jVar == null) {
                    this.d.remove(Integer.valueOf(i));
                    for (p pVar : d) {
                        pVar.f15628a = false;
                    }
                    return;
                }
                int size = d.size();
                int i2 = 0;
                while (i2 < size) {
                    p pVar2 = d.get(i2);
                    if (pVar2.a() == jVar) {
                        pVar2.f15628a = false;
                        d.remove(i2);
                        i2--;
                        size--;
                    }
                    i2++;
                }
            }
        }
    }

    public boolean b(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a9d66c3e", new Object[]{this, new Integer(i)})).booleanValue() : this.d.containsKey(Integer.valueOf(i));
    }

    public void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i)});
        } else {
            a(new o(i), (c) null);
        }
    }

    public void a(Event event) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1e8a50", new Object[]{this, event});
        } else {
            a(event, (c) null);
        }
    }

    public void a(Event event, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49cfecaf", new Object[]{this, event, cVar});
        } else if (event == null) {
        } else {
            a aVar = this.i.get();
            List<Pair<Event, c>> list = aVar.f15620a;
            list.add(new Pair<>(event, cVar));
            if (aVar.b) {
                return;
            }
            aVar.c = Looper.getMainLooper() == Looper.myLooper();
            aVar.b = true;
            if (aVar.f) {
                throw new EventCenterException("Internal error. Abort state was not reset");
            }
            while (!list.isEmpty()) {
                try {
                    Pair<Event, c> remove = list.remove(0);
                    a((Event) remove.first, (c) remove.second, aVar);
                } finally {
                    aVar.b = false;
                    aVar.c = false;
                }
            }
        }
    }

    private void a(Event event, c cVar, a aVar) {
        CopyOnWriteArrayList<p> d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b812c90", new Object[]{this, event, cVar, aVar});
            return;
        }
        int eventId = event.getEventId();
        synchronized (this) {
            d = d(eventId);
        }
        if (d == null || d.isEmpty()) {
            return;
        }
        Iterator<p> it = d.iterator();
        while (it.hasNext()) {
            p next = it.next();
            aVar.e = event;
            aVar.d = next;
            try {
                a(next, event, cVar, aVar.c);
                if (aVar.f) {
                    return;
                }
            } finally {
                aVar.e = null;
                aVar.d = null;
                aVar.f = false;
            }
        }
    }

    private void a(p pVar, Event event, c cVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1e3df13", new Object[]{this, pVar, event, cVar, new Boolean(z)});
            return;
        }
        j a2 = pVar.a();
        if (a2 == null) {
            return;
        }
        g b = pVar.b();
        if (b != null && !b.filterEvent(event)) {
            return;
        }
        int i = AnonymousClass2.f15619a[a2.getThreadMode().ordinal()];
        if (i == 1) {
            a(pVar, event, cVar);
        } else if (i == 2) {
            if (z) {
                a(pVar, event, cVar);
            } else {
                this.e.a(pVar, event, cVar);
            }
        } else if (i != 3) {
            if (i != 4) {
                return;
            }
            this.g.a(pVar, event, cVar);
        } else if (z) {
            this.f.a(pVar, event, cVar);
        } else {
            a(pVar, event, cVar);
        }
    }

    private CopyOnWriteArrayList<p> d(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CopyOnWriteArrayList) ipChange.ipc$dispatch("3f056aa5", new Object[]{this, new Integer(i)}) : this.d.get(Integer.valueOf(i));
    }

    public void a(m mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f7bd47d", new Object[]{this, mVar});
            return;
        }
        Event event = mVar.f15625a;
        p pVar = mVar.b;
        c cVar = mVar.c;
        m.a(mVar);
        if (!pVar.f15628a) {
            return;
        }
        a(pVar, event, cVar);
    }

    public void a(p pVar, Event event, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecf6cfe1", new Object[]{this, pVar, event, cVar});
            return;
        }
        j a2 = pVar.a();
        if (a2 == null) {
            return;
        }
        try {
            i handleEvent = a2.handleEvent(event);
            if (cVar == null) {
                return;
            }
            cVar.a(handleEvent, a2);
        } catch (Throwable th) {
            Log.e(f15617a, "Handle event error", th);
            if (cVar == null) {
                return;
            }
            cVar.onEventException(a2);
        }
    }

    public ExecutorService d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ExecutorService) ipChange.ipc$dispatch("2942bf10", new Object[]{this}) : this.h;
    }
}
