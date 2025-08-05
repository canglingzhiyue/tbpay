package com.taobao.accs.sync.queue;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Comparator;
import java.util.concurrent.PriorityBlockingQueue;
import tb.dch;
import tb.dcl;
import tb.kge;

/* loaded from: classes.dex */
public abstract class BaseQueue extends PriorityBlockingQueue<dch> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int DEFAULT_INITIAL_CAPACITY = 64;
    private static final String TAG = "BaseQueue";
    public volatile dch mLast;
    public final int minSeq;

    static {
        kge.a(1328427192);
    }

    public static /* synthetic */ Object ipc$super(BaseQueue baseQueue, String str, Object... objArr) {
        if (str.hashCode() == 1107930627) {
            return new Boolean(super.offer((BaseQueue) objArr[0]));
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public BaseQueue(int i, Comparator<? super dch> comparator) {
        super(64, comparator);
        this.minSeq = i;
    }

    @Override // java.util.concurrent.PriorityBlockingQueue, java.util.Queue, java.util.concurrent.BlockingQueue
    public boolean offer(dch dchVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7f42e3ee", new Object[]{this, dchVar})).booleanValue();
        }
        int f = dchVar.f();
        int i = this.minSeq;
        if (f <= i) {
            dcl.a(TAG, "offer failed", "lastSeq", Integer.valueOf(i), "message", dchVar);
            return false;
        } else if (size() >= 1000) {
            dcl.a(TAG, "offer.overflow", "size", 1000);
            return false;
        } else if (contains(dchVar)) {
            dcl.a(TAG, "offer.exist", "message", dchVar);
            return false;
        } else {
            this.mLast = dchVar;
            return super.offer((BaseQueue) dchVar);
        }
    }

    public boolean isNext(dch dchVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("82b3e74f", new Object[]{this, dchVar})).booleanValue() : (dchVar == null || this.mLast == null || comparator().compare(dchVar, this.mLast) != 1) ? false : true;
    }
}
