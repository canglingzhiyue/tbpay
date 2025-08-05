package com.taobao.android.weex.bridge;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexInstanceImpl;
import com.taobao.android.weex_framework.util.g;
import java.io.Serializable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import tb.jvz;
import tb.jwd;
import tb.kge;

/* loaded from: classes6.dex */
public class WeexPlatformThreadBridge implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static Handler sMainHandler;

    private static native void nativeCallJob(long j, long j2);

    public static void preloadClass() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13781df6", new Object[0]);
        } else {
            b.c();
        }
    }

    /* loaded from: classes6.dex */
    public static abstract class a implements Runnable {
        public volatile boolean e;

        static {
            kge.a(1218050307);
            kge.a(-1390502639);
        }

        private a() {
            this.e = false;
        }
    }

    /* loaded from: classes6.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final jvz b;
        public final Handler c;

        /* renamed from: a  reason: collision with root package name */
        public volatile boolean f15854a = false;
        private final AtomicInteger d = new AtomicInteger(0);
        private final ConcurrentHashMap<Integer, a> e = new ConcurrentHashMap<>();

        static {
            kge.a(-2106056457);
        }

        public static void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5889b6a", new Object[0]);
            }
        }

        public b(boolean z) {
            if (z) {
                this.b = jwd.c().d();
            } else {
                this.b = jwd.c().a();
            }
            this.c = new Handler(this.b.getLooper());
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            this.f15854a = true;
            jwd.c().a(this.b);
        }

        public synchronized int a(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("5d11e75d", new Object[]{this, aVar})).intValue();
            }
            int b = b();
            while (this.e.contains(Integer.valueOf(b))) {
                b = b();
            }
            this.e.put(Integer.valueOf(b), aVar);
            return b;
        }

        public synchronized a a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("567edf1d", new Object[]{this, new Integer(i)});
            }
            return this.e.remove(Integer.valueOf(i));
        }

        private int b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue();
            }
            int incrementAndGet = this.d.incrementAndGet();
            return incrementAndGet == 0 ? this.d.incrementAndGet() : incrementAndGet;
        }
    }

    static {
        kge.a(-371175662);
        kge.a(1028243835);
        sMainHandler = new Handler(Looper.getMainLooper());
    }

    public static void postMainTaskDelay(final long j, final long j2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929f8077", new Object[]{new Long(j), new Long(j2), new Integer(i)});
        } else {
            sMainHandler.postDelayed(new Runnable() { // from class: com.taobao.android.weex.bridge.WeexPlatformThreadBridge.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        WeexPlatformThreadBridge.callJob(j, j2);
                    }
                }
            }, i);
        }
    }

    public static void postAsyncTask(final long j, final long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb7d53e8", new Object[]{new Long(j), new Long(j2)});
        } else {
            AsyncTask.THREAD_POOL_EXECUTOR.execute(new Runnable() { // from class: com.taobao.android.weex.bridge.WeexPlatformThreadBridge.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        WeexPlatformThreadBridge.callJob(j, j2);
                    }
                }
            });
        }
    }

    public static void postJSTaskDelay(Object obj, final long j, final long j2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebda798b", new Object[]{obj, new Long(j), new Long(j2), new Integer(i)});
        } else {
            ((b) obj).c.postDelayed(new Runnable() { // from class: com.taobao.android.weex.bridge.WeexPlatformThreadBridge.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        WeexPlatformThreadBridge.callJob(j, j2);
                    }
                }
            }, i);
        }
    }

    public static int postJSTaskRepeat(Object obj, final long j, final long j2, final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c8f498ca", new Object[]{obj, new Long(j), new Long(j2), new Integer(i)})).intValue();
        }
        final b bVar = (b) obj;
        a aVar = new a() { // from class: com.taobao.android.weex.bridge.WeexPlatformThreadBridge.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (b.this.f15854a || this.e) {
                } else {
                    b.this.c.postDelayed(this, i);
                    WeexPlatformThreadBridge.callJob(j, j2);
                }
            }
        };
        int a2 = bVar.a(aVar);
        bVar.c.postDelayed(aVar, i);
        return a2;
    }

    public static boolean cancelJSTask(Object obj, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("13f5a05c", new Object[]{obj, new Integer(i)})).booleanValue();
        }
        b bVar = (b) obj;
        a a2 = bVar.a(i);
        if (a2 == null) {
            return false;
        }
        a2.e = true;
        bVar.c.removeCallbacks(a2);
        return true;
    }

    public static Object ensureJSThread(WeexInstanceImpl weexInstanceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("40cafb1c", new Object[]{weexInstanceImpl});
        }
        b bVar = new b(weexInstanceImpl.getInstanceConfig().e());
        weexInstanceImpl.bindJSThread(bVar.c);
        return bVar;
    }

    public static void releaseJSThread(Object obj, WeexInstanceImpl weexInstanceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e0e5c7b", new Object[]{obj, weexInstanceImpl});
            return;
        }
        b bVar = (b) obj;
        bVar.a();
        bVar.f15854a = true;
    }

    public static void callJob(long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7dd4e086", new Object[]{new Long(j), new Long(j2)});
            return;
        }
        try {
            nativeCallJob(j, j2);
        } catch (UnsatisfiedLinkError e) {
            g.a(e);
        }
    }
}
