package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.performance.l;
import com.taobao.android.detail.core.performance.preload.core.task.PreloadTaskEntity;
import com.taobao.android.detail.core.utils.i;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

/* loaded from: classes4.dex */
public class eix implements eiw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Deque<com.taobao.android.detail.core.performance.preload.core.task.a> f27335a = new ArrayDeque();
    private a b;

    /* loaded from: classes4.dex */
    public interface a {
        com.taobao.android.detail.core.performance.preload.core.task.a a();
    }

    static {
        kge.a(-1458955346);
        kge.a(1050223883);
    }

    public eix() {
        emu.a("com.taobao.android.detail.core.performance.preload.core.executor.TaskExecutor");
    }

    public synchronized Deque<com.taobao.android.detail.core.performance.preload.core.task.a> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Deque) ipChange.ipc$dispatch("de6b1059", new Object[]{this});
        }
        return this.f27335a;
    }

    @Override // tb.eiw
    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0b51d27", new Object[]{this, aVar});
        } else {
            this.b = aVar;
        }
    }

    @Override // tb.eiw
    public synchronized boolean a(PreloadTaskEntity.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c83d3c31", new Object[]{this, aVar})).booleanValue();
        }
        for (com.taobao.android.detail.core.performance.preload.core.task.a aVar2 : a()) {
            if (aVar2.a().isContainsItem(aVar)) {
                return true;
            }
        }
        return false;
    }

    @Override // tb.eiw
    public synchronized void a(com.taobao.android.detail.core.performance.preload.core.task.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("562192ba", new Object[]{this, aVar});
            return;
        }
        if (this.f27335a.size() < 2) {
            this.f27335a.add(aVar);
            aVar.b();
            if (jqm.a()) {
                String a2 = l.a("TaskExecutor");
                i.c(a2, "进入执行任务队列：" + aVar.a().toString());
            }
        }
    }

    @Override // tb.eiw
    public synchronized void b(com.taobao.android.detail.core.performance.preload.core.task.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4773223b", new Object[]{this, aVar});
        } else {
            a(this.f27335a, aVar);
        }
    }

    private void a(Deque<com.taobao.android.detail.core.performance.preload.core.task.a> deque, com.taobao.android.detail.core.performance.preload.core.task.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f64886b", new Object[]{this, deque, aVar});
        } else if (!deque.remove(aVar)) {
            i.c(l.a("TaskExecutor"), "任务删除出错");
        } else {
            if (jqm.a()) {
                String a2 = l.a("TaskExecutor");
                i.c(a2, "任务执行结束：" + aVar.a().toString());
                Iterator<com.taobao.android.detail.core.performance.preload.core.task.a> it = this.f27335a.iterator();
                while (it.hasNext()) {
                    String a3 = l.a("TaskExecutor");
                    i.c(a3, "运行中的任务：" + it.next().a().toString());
                }
            }
            b();
        }
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (c()) {
        } else {
            while (this.f27335a.size() < 2) {
                a aVar = this.b;
                if (aVar == null) {
                    i.c(l.a("TaskExecutor"), "promoteTaskCallback为空");
                    return;
                }
                com.taobao.android.detail.core.performance.preload.core.task.a a2 = aVar.a();
                if (a2 == null) {
                    i.c(l.a("TaskExecutor"), "准备队列中没有可执行的任务");
                    return;
                }
                this.f27335a.add(a2);
                a2.b();
                if (jqm.a()) {
                    String a3 = l.a("TaskExecutor");
                    i.c(a3, "从准备任务队列取出一个任务进入执行队列：" + a2.a().toString());
                }
            }
        }
    }

    private boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.f27335a.size() >= 2;
    }
}
