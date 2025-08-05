package tb;

import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.job.core.p;
import com.taobao.android.job.core.task.e;
import com.taobao.android.launcher.bootstrap.tao.ability.dispatch.Dispatchers;
import com.taobao.android.launcher.bootstrap.tao.h;
import java.util.Collection;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;

/* loaded from: classes5.dex */
public class jzl<T, R> implements p<T, R> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private long c = 0;
    private long d = -1;
    private long e = -1;
    private int f = 0;

    /* renamed from: a  reason: collision with root package name */
    private final Queue<e<T, R>> f29885a = new LinkedBlockingDeque(1);
    private final boolean b = guc.a(null, "ngNextPollingEnabled");

    @Override // com.taobao.android.job.core.p
    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.b;
    }

    @Override // com.taobao.android.job.core.p
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        Dispatchers.a("CurrentStage", str);
        Dispatchers.a("EnterStage_" + str, String.valueOf(SystemClock.uptimeMillis()));
    }

    @Override // com.taobao.android.job.core.p
    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        Dispatchers.a("CurrentStage", str + "Leave");
        Dispatchers.a("LeaveStage_" + str, String.valueOf(SystemClock.uptimeMillis()));
    }

    @Override // com.taobao.android.job.core.p
    public void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
            return;
        }
        this.d = SystemClock.uptimeMillis();
        this.e = this.d;
        this.c = j;
    }

    @Override // com.taobao.android.job.core.p
    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        if (this.e == -1) {
            return false;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        if (uptimeMillis - this.e < this.c) {
            return false;
        }
        this.e = uptimeMillis;
        this.f++;
        return true;
    }

    public long d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("596b2df", new Object[]{this})).longValue();
        }
        long j = this.e;
        if (j != -1) {
            return j - this.d;
        }
        return 0L;
    }

    @Override // com.taobao.android.job.core.p
    public boolean a(e<T, R> eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8abeed95", new Object[]{this, eVar})).booleanValue() : this.f29885a.offer(eVar);
    }

    @Override // com.taobao.android.job.core.p
    public e<T, R> e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("e27b1713", new Object[]{this}) : this.f29885a.poll();
    }

    @Override // com.taobao.android.job.core.p
    public void b(e<T, R> eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("175f1892", new Object[]{this, eVar});
        } else {
            this.f29885a.offer(eVar);
        }
    }

    @Override // com.taobao.android.job.core.p
    public void a(ExecutorService executorService, Collection<T> collection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7339095e", new Object[]{this, executorService, collection});
            return;
        }
        long d = d();
        h.b("SchedulerDeffer", "{ timeoutCount=" + this.f + ", elapsedTimeMillis=" + d + "ms, taskPollStatus=" + executorService + ", processingTasks=" + collection + " }");
        StringBuilder sb = new StringBuilder();
        sb.append(d);
        sb.append("ms");
        Dispatchers.a("ElapsedTimeMillis", sb.toString());
        Dispatchers.a("PendingTasks", collection.toString());
        Dispatchers.a("SchedulerPool", executorService.toString());
        Dispatchers.a("TimeoutCount", String.valueOf(this.f));
    }
}
