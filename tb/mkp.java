package tb;

import android.app.Application;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.metrickit.context.c;
import com.taobao.monitor.performance.cpu.b;
import com.taobao.monitor.performance.cpu.e;
import com.taobao.monitor.performance.cpu.g;
import com.taobao.tao.log.TLog;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public class mkp extends mkg<mko> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    private final e f31071a;
    private final Handler b;
    private boolean c = false;
    private final int d = Process.myPid();

    /* loaded from: classes7.dex */
    public final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final long c;
        private final List<WeakReference<Thread>> e;
        private final mkf<mko> f;
        private final mko g;
        private int d = 0;
        private final long h = c.a(c.CONFIG_CPU_ABNORMAL_STACK_COUNT, 5);

        /* renamed from: a */
        public Map<String, List<StackTraceElement[]>> f31072a = new HashMap();

        public a(long j, List<WeakReference<Thread>> list, mkf<mko> mkfVar, mko mkoVar) {
            mkp.this = r3;
            this.c = j;
            this.e = list;
            this.f = mkfVar;
            this.g = mkoVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            if (this.h > this.d + 1) {
                mkp.a(mkp.this).postDelayed(this, this.c);
            }
            this.d++;
            Iterator<WeakReference<Thread>> it = this.e.iterator();
            while (it.hasNext()) {
                Thread thread = it.next().get();
                if (thread == null) {
                    it.remove();
                } else {
                    List<StackTraceElement[]> list = this.f31072a.get(thread.getName());
                    if (list == null) {
                        list = new ArrayList<>();
                        this.f31072a.put(thread.getName(), list);
                    }
                    list.add(thread.getStackTrace());
                }
            }
            if (this.h == this.d) {
                this.f.a(new mko(this.g, this.f31072a));
                mkp.a(mkp.this, false);
            }
            if (!this.e.isEmpty()) {
                return;
            }
            mkp.a(mkp.this).removeCallbacks(this);
            this.f.a(new mko(this.g, this.f31072a));
            mkp.a(mkp.this, false);
        }
    }

    public static /* synthetic */ void lambda$tBoMwbi59_O7wkaVg0eWpQgRhPw(mkp mkpVar, List list, mkf mkfVar, int i, Map map, long[] jArr, g gVar) {
        mkpVar.a(list, mkfVar, i, map, jArr, gVar);
    }

    @Override // tb.mkg, tb.mkh
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        }
    }

    public static /* synthetic */ Handler a(mkp mkpVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("ee26e00", new Object[]{mkpVar}) : mkpVar.b;
    }

    public static /* synthetic */ boolean a(mkp mkpVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a0f0ac92", new Object[]{mkpVar, new Boolean(z)})).booleanValue();
        }
        mkpVar.c = z;
        return z;
    }

    public mkp(Application application, Handler handler) {
        this.b = handler;
        this.f31071a = new e(application.getPackageName());
    }

    @Override // tb.mkg
    public Handler a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("b016d95e", new Object[]{this}) : this.b;
    }

    @Override // tb.mkg
    public void a(final int i, final Map<String, ?> map, final mkf<mko> mkfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2729eb72", new Object[]{this, new Integer(i), map, mkfVar});
        } else if (this.c) {
        } else {
            this.c = true;
            final long[] a2 = b.a();
            final g b = this.f31071a.b();
            final List<g> c = this.f31071a.c();
            this.b.postDelayed(new Runnable() { // from class: tb.-$$Lambda$mkp$tBoMwbi59_O7wkaVg0eWpQgRhPw
                @Override // java.lang.Runnable
                public final void run() {
                    mkp.lambda$tBoMwbi59_O7wkaVg0eWpQgRhPw(mkp.this, c, mkfVar, i, map, a2, b);
                }
            }, c.a(c.CONFIG_CPU_ABNORMAL_WATCH_INTERVAL, (long) orq.FRAME_CHECK_TIMEOUT));
        }
    }

    public /* synthetic */ void a(List list, mkf mkfVar, int i, Map map, long[] jArr, g gVar) {
        boolean z;
        List<g> list2;
        int i2;
        IpChange ipChange = $ipChange;
        int i3 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("101d53e8", new Object[]{this, list, mkfVar, new Integer(i), map, jArr, gVar});
            return;
        }
        long[] a2 = b.a();
        g b = this.f31071a.b();
        List<g> c = this.f31071a.c();
        List<g> a3 = e.a(list, c);
        Collections.sort(a3);
        List<g> subList = a3.subList(0, Math.min(a3.size(), (int) c.a(c.CONFIG_CPU_ABNORMAL_THREAD_COUNT, 3L)));
        try {
            ThreadGroup threadGroup = Looper.getMainLooper().getThread().getThreadGroup();
            if (threadGroup == null) {
                return;
            }
            while (threadGroup.getParent() != null) {
                threadGroup = threadGroup.getParent();
            }
            int activeCount = threadGroup.activeCount();
            Thread[] threadArr = new Thread[activeCount + (activeCount / 2)];
            int enumerate = threadGroup.enumerate(threadArr);
            ArrayList arrayList = new ArrayList();
            StackTraceElement[] stackTraceElementArr = null;
            Thread thread = null;
            int i4 = 0;
            while (i4 < subList.size()) {
                String str = subList.get(i4).d;
                long j = subList.get(i4).c;
                if (!StringUtils.isEmpty(str)) {
                    while (i3 < enumerate) {
                        Thread thread2 = threadArr[i3];
                        if (thread2 != null) {
                            list2 = subList;
                            String name = thread2.getName();
                            if (!StringUtils.isEmpty(name) && name.startsWith(str)) {
                                i2 = enumerate;
                                arrayList.add(new WeakReference(thread2));
                                if (thread2.isAlive() && (stackTraceElementArr == null || stackTraceElementArr.length == 0)) {
                                    stackTraceElementArr = thread2.getStackTrace();
                                    thread = thread2;
                                }
                                i4++;
                                subList = list2;
                                enumerate = i2;
                                i3 = 0;
                            }
                            i2 = enumerate;
                            if (j == this.d && thread2 == Looper.getMainLooper().getThread()) {
                                arrayList.add(new WeakReference(thread2));
                                if (thread2.isAlive()) {
                                    stackTraceElementArr = thread2.getStackTrace();
                                    thread = thread2;
                                }
                                i4++;
                                subList = list2;
                                enumerate = i2;
                                i3 = 0;
                            }
                        } else {
                            list2 = subList;
                            i2 = enumerate;
                        }
                        i3++;
                        subList = list2;
                        enumerate = i2;
                    }
                }
                list2 = subList;
                i2 = enumerate;
                i4++;
                subList = list2;
                enumerate = i2;
                i3 = 0;
            }
            mko mkoVar = new mko(i, map, jArr, a2, gVar, b, list, c, stackTraceElementArr, thread);
            long a4 = c.a(c.CONFIG_CPU_ABNORMAL_STACK_INTERVAL, 500L);
            z = false;
            try {
                this.b.postDelayed(new a(a4, arrayList, mkfVar, mkoVar), a4);
            } catch (Exception e) {
                e = e;
                e.printStackTrace();
                TLog.loge("MetricKit.CpuAbnormalCollector", "Cpu abnormal collect error: ", e);
                e.getMessage();
                this.c = z;
            }
        } catch (Exception e2) {
            e = e2;
            z = false;
        }
    }
}
