package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.launcher.task.ScheduleTask;
import com.taobao.android.virtual_thread.face.VExecutors;
import com.taobao.android.virtual_thread.face.h;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public final class rhe implements rhf {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final Map<String, Future<?>> b = new ConcurrentHashMap();

    /* renamed from: a  reason: collision with root package name */
    private final ScheduledExecutorService f33155a = VExecutors.newScheduledThreadPool(1, new h() { // from class: tb.rhe.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.android.virtual_thread.face.h
        public String newThreadName() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("57dab4a4", new Object[]{this}) : "FluidBackgroundScheduler";
        }
    });

    static {
        kge.a(-462937150);
        kge.a(-1389886184);
    }

    @Override // tb.rhf
    public void a(ScheduleTask scheduleTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ec118ca", new Object[]{this, scheduleTask});
        } else {
            this.b.put(scheduleTask.i(), this.f33155a.schedule(scheduleTask, scheduleTask.m(), TimeUnit.MILLISECONDS));
        }
    }

    @Override // tb.rhf
    public void b(ScheduleTask scheduleTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebae2fe9", new Object[]{this, scheduleTask});
            return;
        }
        Future<?> remove = this.b.remove(scheduleTask.i());
        if (remove == null) {
            return;
        }
        remove.cancel(true);
    }

    @Override // tb.rhf
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.f33155a.shutdownNow();
        }
    }
}
