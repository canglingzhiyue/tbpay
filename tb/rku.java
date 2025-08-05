package tb;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.tmall.android.dai.compute.DAIComputeService;
import com.tmall.android.dai.internal.util.g;
import com.tmall.android.dai.model.DAIModelTriggerType;
import com.tmall.android.dai.model.j;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;

/* loaded from: classes9.dex */
public class rku {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static rku b;

    /* renamed from: a  reason: collision with root package name */
    private boolean f33214a = false;
    private final List<a> c = new ArrayList();
    private volatile boolean d = false;

    static {
        kge.a(-1939010298);
    }

    public static /* synthetic */ rkt a(rku rkuVar, j jVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (rkt) ipChange.ipc$dispatch("bf66ac32", new Object[]{rkuVar, jVar}) : rkuVar.a(jVar);
    }

    public static /* synthetic */ boolean a(rku rkuVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("fd376800", new Object[]{rkuVar})).booleanValue() : rkuVar.e();
    }

    public static /* synthetic */ boolean a(rku rkuVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b64a5c", new Object[]{rkuVar, new Boolean(z)})).booleanValue();
        }
        rkuVar.f33214a = z;
        return z;
    }

    public static /* synthetic */ boolean b(rku rkuVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ebba6e81", new Object[]{rkuVar})).booleanValue() : rkuVar.f33214a;
    }

    private rku() {
    }

    public static rku a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rku) ipChange.ipc$dispatch("f0a1742", new Object[0]);
        }
        if (b == null) {
            synchronized (rku.class) {
                if (b == null) {
                    b = new rku();
                }
            }
        }
        return b;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        try {
            if (this.d) {
                Log.e("TimingTrigger", "already initialized ~");
                return;
            }
            this.d = true;
            this.f33214a = e();
            if (this.f33214a) {
                return;
            }
            c();
        } catch (Throwable unused) {
            Log.e("TimingTrigger", "something wrong when startTimingTask");
        }
    }

    public synchronized void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (this.d) {
            if (this.c != null && this.c.size() > 0) {
                for (a aVar : this.c) {
                    aVar.f33215a = true;
                }
                g.a(1003);
                this.c.clear();
            }
            if (this.f33214a) {
                return;
            }
            Set<j> a2 = rkq.d().m().a(DAIModelTriggerType.Timing);
            if (a2 != null && a2.size() > 0) {
                for (j jVar : a2) {
                    this.c.add(new a(jVar));
                }
                d();
            }
        }
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        try {
            if (this.c != null && this.c.size() > 0) {
                for (a aVar : this.c) {
                    rkt a2 = a(aVar.b);
                    if (a2 != null) {
                        long a3 = a(0, Integer.parseInt(a2.c) * 1000);
                        if (a2.d != null) {
                            a3 = a2.d.longValue() * 1000;
                        }
                        g.a(1003, aVar, a3);
                    }
                }
                return;
            }
            Log.e("TimingTrigger", "no task to be executed ~~");
        } catch (Throwable unused) {
            Log.e("TimingTrigger", "something wrong when onModelUpadated");
        }
    }

    public int a(int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5c1152bb", new Object[]{this, new Integer(i), new Integer(i2)})).intValue() : new Random().nextInt((i2 - i) + 1) + i;
    }

    private boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue();
        }
        this.f33214a = Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("EdgeComputingIsEnabled", "stopTTask", "false"));
        return this.f33214a;
    }

    /* loaded from: classes9.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public boolean f33215a = false;
        public j b;

        static {
            kge.a(-573341435);
            kge.a(-1390502639);
        }

        public a(j jVar) {
            this.b = jVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                if (this.f33215a) {
                    return;
                }
                rku.a(rku.this, rku.a(rku.this));
                if (rku.b(rku.this)) {
                    return;
                }
                if (rqk.getInstance().isInForeground()) {
                    rkq.d().m().a(this.b.f23725a, null, DAIComputeService.TaskPriority.NORMAL, null, this.b.c);
                }
                rkt a2 = rku.a(rku.this, this.b);
                if (!nom.VALUE_YES.equals(a2.b)) {
                    return;
                }
                g.a(1003, this, Integer.parseInt(a2.c) * 1000);
            } catch (Throwable unused) {
                Log.e("TimingTrigger", "something wrong when TimingRunnable.compute");
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private tb.rkt a(com.tmall.android.dai.model.j r4) {
        /*
            r3 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.rku.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L18
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r3
            r2 = 1
            r1[r2] = r4
            java.lang.String r4 = "c820ff9e"
            java.lang.Object r4 = r0.ipc$dispatch(r4, r1)
            tb.rkt r4 = (tb.rkt) r4
            return r4
        L18:
            r0 = 0
            com.tmall.android.dai.model.e r4 = r4.b     // Catch: java.lang.Exception -> L44
            tb.rkt r4 = (tb.rkt) r4     // Catch: java.lang.Exception -> L44
            if (r4 == 0) goto L44
            java.lang.String r1 = "YES"
            java.lang.String r2 = r4.b     // Catch: java.lang.Exception -> L44
            boolean r1 = r1.equalsIgnoreCase(r2)     // Catch: java.lang.Exception -> L44
            if (r1 == 0) goto L2d
            r1 = r0
            r0 = r4
            r4 = r1
            goto L46
        L2d:
            java.lang.String r1 = "NO"
            java.lang.String r2 = r4.b     // Catch: java.lang.Exception -> L44
            boolean r1 = r1.equalsIgnoreCase(r2)     // Catch: java.lang.Exception -> L44
            if (r1 == 0) goto L44
            java.lang.String r1 = r4.c     // Catch: java.lang.Throwable -> L42
            long r1 = java.lang.Long.parseLong(r1)     // Catch: java.lang.Throwable -> L42
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch: java.lang.Throwable -> L42
            goto L46
        L42:
            r1 = r0
            goto L46
        L44:
            r4 = r0
            r1 = r4
        L46:
            if (r0 == 0) goto L4d
            if (r1 == 0) goto L50
            r0.d = r1
            goto L50
        L4d:
            if (r4 == 0) goto L50
            goto L51
        L50:
            r4 = r0
        L51:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.rku.a(com.tmall.android.dai.model.j):tb.rkt");
    }
}
