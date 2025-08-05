package de.greenrobot.event;

import android.os.Looper;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;

/* loaded from: classes9.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    public static String f24768a = "Event";
    static volatile c b;
    private static final d c = new d();
    private static final Map<Class<?>, List<Class<?>>> d = new HashMap();
    private final Map<Class<?>, CopyOnWriteArrayList<l>> e;
    private final Map<Object, List<Class<?>>> f;
    private final Map<Class<?>, Object> g;
    private final ThreadLocal<a> h;
    private final e i;
    private final b j;
    private final de.greenrobot.event.a k;
    private final k l;
    private final ExecutorService m;
    private final boolean n;
    private final boolean o;
    private final boolean p;
    private final boolean q;
    private final boolean r;
    private final boolean s;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: de.greenrobot.event.c$2  reason: invalid class name */
    /* loaded from: classes9.dex */
    public static /* synthetic */ class AnonymousClass2 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f24770a = new int[ThreadMode.values().length];

        static {
            try {
                f24770a[ThreadMode.PostThread.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24770a[ThreadMode.MainThread.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24770a[ThreadMode.BackgroundThread.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f24770a[ThreadMode.Async.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes9.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        final List<Object> f24771a = new ArrayList();
        boolean b;
        boolean c;
        l d;
        Object e;
        boolean f;

        a() {
        }
    }

    public c() {
        this(c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(d dVar) {
        this.h = new ThreadLocal<a>() { // from class: de.greenrobot.event.c.1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // java.lang.ThreadLocal
            /* renamed from: a */
            public a initialValue() {
                return new a();
            }
        };
        this.e = new HashMap();
        this.f = new HashMap();
        this.g = new ConcurrentHashMap();
        this.i = new e(this, Looper.getMainLooper(), 10);
        this.j = new b(this);
        this.k = new de.greenrobot.event.a(this);
        this.l = new k(dVar.h);
        this.o = dVar.f24772a;
        this.p = dVar.b;
        this.q = dVar.c;
        this.r = dVar.d;
        this.n = dVar.e;
        this.s = dVar.f;
        this.m = dVar.g;
    }

    public static c a() {
        if (b == null) {
            synchronized (c.class) {
                if (b == null) {
                    b = new c();
                }
            }
        }
        return b;
    }

    private List<Class<?>> a(Class<?> cls) {
        List<Class<?>> list;
        synchronized (d) {
            list = d.get(cls);
            if (list == null) {
                list = new ArrayList<>();
                for (Class<?> cls2 = cls; cls2 != null; cls2 = cls2.getSuperclass()) {
                    list.add(cls2);
                    a(list, cls2.getInterfaces());
                }
                d.put(cls, list);
            }
        }
        return list;
    }

    private void a(l lVar, Object obj, Throwable th) {
        if (!(obj instanceof i)) {
            if (this.n) {
                throw new EventBusException("Invoking subscriber failed", th);
            }
            if (this.o) {
                String str = f24768a;
                Log.e(str, "Could not dispatch event: " + obj.getClass() + " to subscribing class " + lVar.f24780a.getClass(), th);
            }
            if (!this.q) {
                return;
            }
            d(new i(this, th, obj, lVar.f24780a));
        } else if (!this.o) {
        } else {
            String str2 = f24768a;
            Log.e(str2, "SubscriberExceptionEvent subscriber " + lVar.f24780a.getClass() + " threw an exception", th);
            i iVar = (i) obj;
            String str3 = f24768a;
            Log.e(str3, "Initial event " + iVar.c + " caused exception in " + iVar.d, iVar.b);
        }
    }

    private void a(l lVar, Object obj, boolean z) {
        int i = AnonymousClass2.f24770a[lVar.b.b.ordinal()];
        if (i == 1) {
            a(lVar, obj);
        } else if (i == 2) {
            if (z) {
                a(lVar, obj);
            } else {
                this.i.a(lVar, obj);
            }
        } else if (i == 3) {
            if (z) {
                this.j.a(lVar, obj);
            } else {
                a(lVar, obj);
            }
        } else if (i == 4) {
            this.k.a(lVar, obj);
        } else {
            throw new IllegalStateException("Unknown thread mode: " + lVar.b.b);
        }
    }

    private void a(Object obj, a aVar) throws Error {
        boolean a2;
        Class<?> cls = obj.getClass();
        if (this.s) {
            List<Class<?>> a3 = a(cls);
            int size = a3.size();
            a2 = false;
            for (int i = 0; i < size; i++) {
                a2 |= a(obj, aVar, a3.get(i));
            }
        } else {
            a2 = a(obj, aVar, cls);
        }
        if (!a2) {
            if (this.p) {
                String str = "No subscribers registered for event " + cls;
            }
            if (!this.r || cls == f.class || cls == i.class) {
                return;
            }
            d(new f(this, obj));
        }
    }

    private void a(Object obj, j jVar, boolean z, int i) {
        Class<?> cls = jVar.c;
        CopyOnWriteArrayList<l> copyOnWriteArrayList = this.e.get(cls);
        l lVar = new l(obj, jVar, i);
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList<>();
            this.e.put(cls, copyOnWriteArrayList);
        } else if (copyOnWriteArrayList.contains(lVar)) {
            throw new EventBusException("Subscriber " + obj.getClass() + " already registered to event " + cls);
        }
        int size = copyOnWriteArrayList.size();
        for (int i2 = 0; i2 <= size; i2++) {
            if (i2 == size || lVar.c > copyOnWriteArrayList.get(i2).c) {
                copyOnWriteArrayList.add(i2, lVar);
                break;
            }
        }
        List<Class<?>> list = this.f.get(obj);
        if (list == null) {
            list = new ArrayList<>();
            this.f.put(obj, list);
        }
        list.add(cls);
        if (z) {
            if (!this.s) {
                b(lVar, this.g.get(cls));
                return;
            }
            for (Map.Entry<Class<?>, Object> entry : this.g.entrySet()) {
                if (cls.isAssignableFrom(entry.getKey())) {
                    b(lVar, entry.getValue());
                }
            }
        }
    }

    private void a(Object obj, Class<?> cls) {
        CopyOnWriteArrayList<l> copyOnWriteArrayList = this.e.get(cls);
        if (copyOnWriteArrayList != null) {
            int size = copyOnWriteArrayList.size();
            int i = 0;
            while (i < size) {
                l lVar = copyOnWriteArrayList.get(i);
                if (lVar.f24780a == obj) {
                    lVar.d = false;
                    copyOnWriteArrayList.remove(i);
                    i--;
                    size--;
                }
                i++;
            }
        }
    }

    private synchronized void a(Object obj, boolean z, int i) {
        for (j jVar : this.l.a(obj.getClass())) {
            a(obj, jVar, z, i);
        }
    }

    static void a(List<Class<?>> list, Class<?>[] clsArr) {
        for (Class<?> cls : clsArr) {
            if (!list.contains(cls)) {
                list.add(cls);
                a(list, cls.getInterfaces());
            }
        }
    }

    private boolean a(Object obj, a aVar, Class<?> cls) {
        CopyOnWriteArrayList<l> copyOnWriteArrayList;
        synchronized (this) {
            copyOnWriteArrayList = this.e.get(cls);
        }
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        Iterator<l> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            l next = it.next();
            aVar.e = obj;
            aVar.d = next;
            try {
                a(next, obj, aVar.c);
                if (aVar.f) {
                    return true;
                }
            } finally {
                aVar.e = null;
                aVar.d = null;
                aVar.f = false;
            }
        }
        return true;
    }

    public static d b() {
        return new d();
    }

    private void b(l lVar, Object obj) {
        if (obj != null) {
            a(lVar, obj, Looper.getMainLooper() == Looper.myLooper());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(g gVar) {
        Object obj = gVar.f24775a;
        l lVar = gVar.b;
        g.a(gVar);
        if (lVar.d) {
            a(lVar, obj);
        }
    }

    void a(l lVar, Object obj) {
        try {
            lVar.b.f24778a.invoke(lVar.f24780a, obj);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException("Unexpected exception", e);
        } catch (InvocationTargetException e2) {
            a(lVar, obj, e2.getCause());
        }
    }

    public void a(Object obj) {
        a(obj, false, 0);
    }

    public void a(Object obj, int i) {
        a(obj, false, i);
    }

    public synchronized boolean b(Object obj) {
        return this.f.containsKey(obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ExecutorService c() {
        return this.m;
    }

    public synchronized void c(Object obj) {
        List<Class<?>> list = this.f.get(obj);
        if (list != null) {
            for (Class<?> cls : list) {
                a(obj, cls);
            }
            this.f.remove(obj);
            return;
        }
        String str = "Subscriber to unregister was not registered before: " + obj.getClass();
    }

    public void d(Object obj) {
        a aVar = this.h.get();
        List<Object> list = aVar.f24771a;
        list.add(obj);
        if (!aVar.b) {
            aVar.c = Looper.getMainLooper() == Looper.myLooper();
            aVar.b = true;
            if (aVar.f) {
                throw new EventBusException("Internal error. Abort state was not reset");
            }
            while (!list.isEmpty()) {
                try {
                    a(list.remove(0), aVar);
                } finally {
                    aVar.b = false;
                    aVar.c = false;
                }
            }
        }
    }
}
