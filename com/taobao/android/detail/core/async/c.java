package com.taobao.android.detail.core.async;

import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.utils.i;
import java.lang.reflect.Field;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;
import tb.eap;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class c<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final ExecutorService d;
    private static boolean e;

    /* renamed from: a  reason: collision with root package name */
    private int f9376a;
    private int b;
    private Map<T, c<T>.a> c = new ConcurrentHashMap();

    public static /* synthetic */ Map a(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("7b84f301", new Object[]{cVar}) : cVar.c;
    }

    public static /* synthetic */ boolean a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821d370", new Object[]{new Boolean(z)})).booleanValue();
        }
        e = z;
        return z;
    }

    public static /* synthetic */ boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : e;
    }

    static {
        kge.a(-2063673864);
        e = false;
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: com.taobao.android.detail.core.async.c.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
                }
                Thread thread = new Thread(runnable);
                thread.setName("AsyncUIThread");
                return thread;
            }
        });
        d = newSingleThreadExecutor;
        newSingleThreadExecutor.submit(new Runnable() { // from class: com.taobao.android.detail.core.async.c.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                try {
                    Field declaredField = Looper.class.getDeclaredField("sThreadLocal");
                    declaredField.setAccessible(true);
                    Object obj = declaredField.get(Looper.getMainLooper());
                    if (obj instanceof ThreadLocal) {
                        ((ThreadLocal) obj).set(Looper.getMainLooper());
                    }
                    c.a(true);
                    i.c("DetailTime.AsyncUI", "hackLooper success");
                } catch (Exception e2) {
                    i.a("DetailTime.AsyncUI", "hackLooper", e2);
                }
            }
        });
        emu.a("com.taobao.android.detail.core.async.AsyncUI");
    }

    public eap a(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (eap) ipChange.ipc$dispatch("16ba52ee", new Object[]{this, t});
        }
        eap eapVar = null;
        c<T>.a aVar = this.c.get(t);
        if (aVar != null) {
            this.c.remove(t);
            eapVar = aVar.a();
        }
        this.b++;
        if (eapVar != null) {
            this.f9376a++;
            i.c("DetailTime.AsyncUI", "obtainViewHolder success:hitCount:" + this.f9376a + " obtainCount:" + this.b);
        } else {
            i.c("DetailTime.AsyncUI", "obtainViewHolder failure:hitCount:" + this.f9376a + " obtainCount:" + this.b);
        }
        return eapVar;
    }

    public void a(int i, final T t, final Callable<eap> callable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7194a7a", new Object[]{this, new Integer(i), t, callable});
            return;
        }
        c<T>.a aVar = new a();
        this.c.put(t, aVar);
        aVar.b = d.submit(new Runnable() { // from class: com.taobao.android.detail.core.async.c.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                a aVar2;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (!c.b()) {
                    i.c("DetailTime.AsyncUI", "asyncRenderViewHolder return as can not hackLooper");
                } else {
                    try {
                        eap eapVar = (eap) callable.call();
                        if (eapVar == null || eapVar.j() == null || (aVar2 = (a) c.a(c.this).get(t)) == null) {
                            return;
                        }
                        aVar2.a(eapVar);
                    } catch (Throwable th) {
                        i.a("DetailTime.AsyncUI", "asyncRenderViewHolder", th);
                    }
                }
            }
        });
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        try {
            for (c<T>.a aVar : this.c.values()) {
                if (!aVar.b.isDone()) {
                    aVar.b.cancel(true);
                }
            }
            this.c.clear();
        } catch (Throwable th) {
            i.a("DetailTime.AsyncUI", "cancelAll", th);
        }
    }

    /* loaded from: classes4.dex */
    public class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public volatile eap f9378a;
        public volatile Future b;

        static {
            kge.a(1373362716);
        }

        public a() {
        }

        public eap a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (eap) ipChange.ipc$dispatch("f04084a", new Object[]{this});
            }
            if (this.b != null && !this.b.isDone()) {
                this.b.cancel(true);
            }
            return this.f9378a;
        }

        public void a(eap eapVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e6793704", new Object[]{this, eapVar});
            } else {
                this.f9378a = eapVar;
            }
        }
    }
}
