package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.preload.core.task.PreloadTaskEntity;
import com.taobao.android.preload.e;
import com.taobao.android.preload.f;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

/* loaded from: classes6.dex */
public class icm implements icl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Deque<com.taobao.android.preload.core.task.a> f28905a = new ArrayDeque();
    private a b;

    /* loaded from: classes6.dex */
    public interface a {
        com.taobao.android.preload.core.task.a a();
    }

    public synchronized Deque<com.taobao.android.preload.core.task.a> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Deque) ipChange.ipc$dispatch("de6b1059", new Object[]{this});
        }
        return this.f28905a;
    }

    @Override // tb.icl
    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("300f1e48", new Object[]{this, aVar});
        } else {
            this.b = aVar;
        }
    }

    @Override // tb.icl
    public synchronized boolean a(PreloadTaskEntity.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4adfeb00", new Object[]{this, aVar})).booleanValue();
        }
        for (com.taobao.android.preload.core.task.a aVar2 : a()) {
            if (aVar2.a().isContainsItem(aVar)) {
                return true;
            }
        }
        return false;
    }

    @Override // tb.icl
    public synchronized void a(com.taobao.android.preload.core.task.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45b4a749", new Object[]{this, aVar});
            return;
        }
        if (this.f28905a.size() < 2) {
            this.f28905a.add(aVar);
            aVar.b();
            if (jqm.a()) {
                String a2 = e.a("TaskExecutor");
                f.b(a2, "进入执行任务队列：" + aVar.a().toString());
            }
        }
    }

    @Override // tb.icl
    public synchronized void b(com.taobao.android.preload.core.task.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e05569ca", new Object[]{this, aVar});
        } else {
            a(this.f28905a, aVar);
        }
    }

    private void a(Deque<com.taobao.android.preload.core.task.a> deque, com.taobao.android.preload.core.task.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e13a5ffa", new Object[]{this, deque, aVar});
        } else if (!deque.remove(aVar)) {
            f.b(e.a("TaskExecutor"), "任务删除出错");
        } else {
            if (jqm.a()) {
                String a2 = e.a("TaskExecutor");
                f.b(a2, "任务执行结束：" + aVar.a().toString());
                Iterator<com.taobao.android.preload.core.task.a> it = this.f28905a.iterator();
                while (it.hasNext()) {
                    String a3 = e.a("TaskExecutor");
                    f.b(a3, "运行中的任务：" + it.next().a().toString());
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
            while (this.f28905a.size() < 2) {
                a aVar = this.b;
                if (aVar == null) {
                    f.b(e.a("TaskExecutor"), "promoteTaskCallback为空");
                    return;
                }
                com.taobao.android.preload.core.task.a a2 = aVar.a();
                if (a2 == null) {
                    f.b(e.a("TaskExecutor"), "准备队列中没有可执行的任务");
                    return;
                }
                this.f28905a.add(a2);
                a2.b();
                if (jqm.a()) {
                    String a3 = e.a("TaskExecutor");
                    f.b(a3, "从准备任务队列取出一个任务进入执行队列：" + a2.a().toString());
                }
            }
        }
    }

    private boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.f28905a.size() >= 2;
    }
}
