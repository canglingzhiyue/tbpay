package com.taobao.tao.messagekit.base.monitor.monitorthread;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.messagekit.core.utils.MsgLog;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import tb.kge;
import tb.oma;
import tb.omb;

/* loaded from: classes8.dex */
public class MonitorTaskExecutor {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f20764a = "MonitorTaskExecutor";
    public MonitorProcessExecuteMode b = MonitorProcessExecuteMode.SINGLE_TASK;
    private LinkedBlockingDeque<oma> c = new LinkedBlockingDeque<>();
    private omb.a d = null;

    /* loaded from: classes8.dex */
    public enum MonitorProcessExecuteMode {
        MERGE_TASK,
        SINGLE_TASK
    }

    static {
        kge.a(1770725140);
    }

    private void a(BlockingQueue<oma> blockingQueue, oma omaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad8d51c0", new Object[]{this, blockingQueue, omaVar});
        } else if (blockingQueue == null || omaVar == null) {
            if (blockingQueue == null) {
                MsgLog.c(this.f20764a, "blockingQueue is null");
            }
            if (omaVar != null) {
                return;
            }
            MsgLog.c(this.f20764a, "current task is null");
        } else {
            oma peek = blockingQueue.peek();
            if (peek != null && peek.b() == omaVar.b()) {
                MsgLog.a(this.f20764a, "still have tasks in pool, continue take...; waiting to execute；current task type: ", Integer.valueOf(omaVar.b()), "| next task type: ", Integer.valueOf(peek.b()));
                return;
            }
            MsgLog.a(this.f20764a, "message process task start execute..., type=", Integer.valueOf(omaVar.b()));
            omaVar.d();
        }
    }

    public void a() {
        omb.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        while (true) {
            oma take = this.c.take();
            if (take == null || oma.SHUTDOWN_REQ.equals(take.aP_())) {
                return;
            }
            if (take instanceof omb.a) {
                omb.a aVar2 = (omb.a) take;
                omb.a aVar3 = this.d;
                if (aVar3 == null) {
                    this.d = aVar2;
                } else {
                    aVar2.a(aVar3);
                    aVar = this.d;
                    if (aVar != null && aVar.c()) {
                        this.d = null;
                    }
                }
            }
            a(take, this.c);
            aVar = this.d;
            if (aVar != null) {
                this.d = null;
            }
        }
    }

    public void a(oma omaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f82bf5b5", new Object[]{this, omaVar});
        } else {
            this.c.putFirst(omaVar);
        }
    }

    public void a(oma omaVar, BlockingQueue<oma> blockingQueue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e4daa40", new Object[]{this, omaVar, blockingQueue});
        } else if (this.b.equals(MonitorProcessExecuteMode.MERGE_TASK)) {
            a(blockingQueue, omaVar);
        } else {
            omaVar.d();
        }
    }

    public void b(oma omaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6aefc36", new Object[]{this, omaVar});
        } else {
            this.c.putLast(omaVar);
        }
    }
}
