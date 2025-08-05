package com.taobao.android.detail.ttdetail.request.preload;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayDeque;
import java.util.Deque;
import tb.kge;

/* loaded from: classes5.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Deque<e> f10794a = new ArrayDeque();
    private a b;

    /* loaded from: classes5.dex */
    public interface a {
        e getPromoteTask();
    }

    static {
        kge.a(1788873864);
    }

    public synchronized boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        for (e eVar : this.f10794a) {
            if (eVar.a(str)) {
                return true;
            }
        }
        return false;
    }

    public synchronized void a(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a899a3ab", new Object[]{this, eVar});
        } else if (eVar == null) {
        } else {
            if (this.f10794a.size() >= 2) {
                return;
            }
            com.taobao.android.detail.ttdetail.utils.i.a("PreloadTaskExecutor", "进入执行任务队列");
            this.f10794a.add(eVar);
            eVar.a();
        }
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e94935ad", new Object[]{this, aVar});
        } else {
            this.b = aVar;
        }
    }

    public synchronized void b(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b94f706c", new Object[]{this, eVar});
        } else if (!this.f10794a.remove(eVar)) {
            com.taobao.android.detail.ttdetail.utils.i.a("PreloadTaskExecutor", "任务删除出错");
        } else {
            while (this.f10794a.size() < 2) {
                if (this.b == null) {
                    return;
                }
                e promoteTask = this.b.getPromoteTask();
                if (promoteTask == null) {
                    com.taobao.android.detail.ttdetail.utils.i.a("PreloadTaskExecutor", "准备队列中没有可执行的任务");
                    return;
                }
                com.taobao.android.detail.ttdetail.utils.i.a("PreloadTaskExecutor", "从准备队列中获取任务并执行");
                this.f10794a.add(promoteTask);
                promoteTask.a();
            }
        }
    }

    public synchronized boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        return this.f10794a.size() >= 2;
    }
}
