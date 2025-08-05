package com.taobao.accs.sync.queue;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Comparator;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import tb.dch;
import tb.dci;
import tb.dcl;
import tb.kge;

/* loaded from: classes.dex */
public class PreQueue extends BaseQueue {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "PreQueue";
    private ScheduledFuture future;
    private b listener;
    private long timeoutInMill;

    static {
        kge.a(-1482829514);
    }

    public static /* synthetic */ Object ipc$super(PreQueue preQueue, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2102139057:
                return new Boolean(super.isNext((dch) objArr[0]));
            case -1272099756:
                super.clear();
                return null;
            case -340895956:
                return super.poll();
            case 2135090158:
                return new Boolean(super.offer((dch) objArr[0]));
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public static /* synthetic */ b access$000(PreQueue preQueue) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("d2ce9617", new Object[]{preQueue}) : preQueue.listener;
    }

    @Override // com.taobao.accs.sync.queue.BaseQueue
    public /* bridge */ /* synthetic */ boolean isNext(dch dchVar) {
        return super.isNext(dchVar);
    }

    public PreQueue(int i, Comparator<dch> comparator) {
        super(i, comparator);
        this.timeoutInMill = 30000L;
    }

    public void setTimeout(long j, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28a8c113", new Object[]{this, new Long(j), bVar});
            return;
        }
        dcl.a(TAG, "setTimeoutInMill = " + j + "ms", new Object[0]);
        if (j > 100) {
            this.timeoutInMill = j;
        }
        this.listener = bVar;
    }

    @Override // com.taobao.accs.sync.queue.BaseQueue, java.util.concurrent.PriorityBlockingQueue, java.util.Queue, java.util.concurrent.BlockingQueue
    public boolean offer(dch dchVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7f42e3ee", new Object[]{this, dchVar})).booleanValue();
        }
        if (!super.offer(dchVar)) {
            return false;
        }
        dcl.a(TAG, "offer", "msg", dchVar);
        updateTimeout();
        return true;
    }

    @Override // java.util.concurrent.PriorityBlockingQueue, java.util.Queue
    public dch poll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dch) ipChange.ipc$dispatch("42155c57", new Object[]{this});
        }
        dch dchVar = (dch) super.poll();
        updateTimeout();
        return dchVar;
    }

    public void updateTimeout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40be80df", new Object[]{this});
            return;
        }
        ScheduledFuture scheduledFuture = this.future;
        if (scheduledFuture != null) {
            try {
                scheduledFuture.cancel(false);
                this.future = null;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (isEmpty()) {
            return;
        }
        this.future = dci.a().schedule(new Runnable() { // from class: com.taobao.accs.sync.queue.PreQueue.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (PreQueue.access$000(PreQueue.this) == null) {
                } else {
                    PreQueue.access$000(PreQueue.this).a();
                }
            }
        }, this.timeoutInMill, TimeUnit.MILLISECONDS);
    }

    @Override // java.util.concurrent.PriorityBlockingQueue, java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public void clear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
            return;
        }
        super.clear();
        updateTimeout();
    }
}
