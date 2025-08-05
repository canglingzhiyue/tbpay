package com.taobao.accs.sync.queue;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Comparator;
import tb.dch;
import tb.dcl;
import tb.kge;

/* loaded from: classes.dex */
public class SyncQueue extends BaseQueue {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "SyncQueue";
    private int curSeq;

    static {
        kge.a(-655561938);
    }

    public static /* synthetic */ Object ipc$super(SyncQueue syncQueue, String str, Object... objArr) {
        if (str.hashCode() == 2135090158) {
            return new Boolean(super.offer((dch) objArr[0]));
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public SyncQueue(int i, Comparator<dch> comparator) {
        super(i, comparator);
        this.curSeq = i;
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
        this.curSeq = dchVar.f();
        return true;
    }

    public void incrementSeq() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20661af7", new Object[]{this});
            return;
        }
        int i = this.curSeq + 1;
        this.curSeq = i;
        dcl.a(TAG, "incrementSeq", "curIndex", Integer.valueOf(i));
    }

    public int getCurSeq() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4580beef", new Object[]{this})).intValue() : this.curSeq;
    }

    @Override // com.taobao.accs.sync.queue.BaseQueue
    public boolean isNext(dch dchVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("82b3e74f", new Object[]{this, dchVar})).booleanValue() : dchVar.f() - this.curSeq == 1;
    }
}
