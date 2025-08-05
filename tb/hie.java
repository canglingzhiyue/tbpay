package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.template.download.e;
import com.taobao.android.dinamicx.template.download.j;
import com.taobao.android.virtual_thread.face.VExecutors;
import com.taobao.android.virtual_thread.face.h;
import java.util.Comparator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes5.dex */
public class hie implements j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final AtomicLong f28685a = new AtomicLong(0);
    private static final h b = new h() { // from class: tb.hie.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final AtomicInteger f28686a = new AtomicInteger(1);

        @Override // com.taobao.android.virtual_thread.face.h
        public String newThreadName() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("57dab4a4", new Object[]{this});
            }
            return "download#" + this.f28686a.getAndIncrement();
        }
    };
    private static final Comparator c = new Comparator() { // from class: tb.hie.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("6a9be197", new Object[]{this, obj, obj2})).intValue();
            }
            if (!(obj instanceof e) || !(obj2 instanceof e)) {
                return 0;
            }
            e eVar = (e) obj;
            e eVar2 = (e) obj2;
            int i = eVar.f11933a - eVar2.f11933a;
            return i == 0 ? (int) (eVar.b - eVar2.b) : i;
        }
    };
    private static final Comparator d = new Comparator() { // from class: tb.hie.3
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("6a9be197", new Object[]{this, obj, obj2})).intValue();
            }
            if (!(obj instanceof e) || !(obj2 instanceof e)) {
                return 0;
            }
            e eVar = (e) obj;
            e eVar2 = (e) obj2;
            int i = eVar.f11933a - eVar2.f11933a;
            return i == 0 ? (int) (eVar2.b - eVar.b) : i;
        }
    };

    @Override // com.taobao.android.dinamicx.template.download.j
    public ThreadPoolExecutor a(int i, boolean z, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThreadPoolExecutor) ipChange.ipc$dispatch("20ef1c03", new Object[]{this, new Integer(i), new Boolean(z), str});
        }
        return a(i, 8, 3L, TimeUnit.SECONDS, new PriorityBlockingQueue(512, z ? c : d), new h() { // from class: tb.hie.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.virtual_thread.face.h
            public String newThreadName() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("57dab4a4", new Object[]{this}) : str;
            }
        });
    }

    @Override // com.taobao.android.dinamicx.template.download.j
    public ThreadPoolExecutor a(int i, boolean z, final String str, final int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThreadPoolExecutor) ipChange.ipc$dispatch("f4a12220", new Object[]{this, new Integer(i), new Boolean(z), str, new Integer(i2)});
        }
        return a(i, 8, 3L, TimeUnit.SECONDS, new PriorityBlockingQueue(512, z ? c : d), new h() { // from class: tb.hie.5
            public static volatile transient /* synthetic */ IpChange $ipChange;
            private final AtomicInteger d;

            {
                this.d = new AtomicInteger(i2);
            }

            @Override // com.taobao.android.virtual_thread.face.h
            public String newThreadName() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (String) ipChange2.ipc$dispatch("57dab4a4", new Object[]{this});
                }
                return str + this.d.getAndIncrement();
            }
        });
    }

    public ThreadPoolExecutor a(int i, int i2, long j, TimeUnit timeUnit, BlockingQueue blockingQueue, h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThreadPoolExecutor) ipChange.ipc$dispatch("cb3b6ca2", new Object[]{this, new Integer(i), new Integer(i2), new Long(j), timeUnit, blockingQueue, hVar});
        }
        ExecutorService a2 = VExecutors.getThreadPoolFactory().a(i, i2, j, timeUnit, blockingQueue, hVar, new ThreadPoolExecutor.AbortPolicy());
        try {
            fuw.d("virtualThread", "Create-Virtual_Thread");
            ((ThreadPoolExecutor) a2).setKeepAliveTime(j, timeUnit);
            ((ThreadPoolExecutor) a2).allowCoreThreadTimeOut(true);
        } catch (Throwable unused) {
        }
        return (ThreadPoolExecutor) a2;
    }
}
