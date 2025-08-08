package com.taobao.rxm.schedule;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.PriorityBlockingQueue;
import tb.qol;
import tb.riy;

/* loaded from: classes.dex */
public class CentralSchedulerQueue extends PriorityBlockingQueue<Runnable> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ACT_BE_QUEUED = 3;
    public static final int ACT_BE_REJECTED = 2;
    public static final int ACT_TO_EXECUTE = 1;
    private final c mExecutorStateInspector;
    private final int mNormalCapacity;
    private final int mPatienceCapacity;

    public static /* synthetic */ Object ipc$super(CentralSchedulerQueue centralSchedulerQueue, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode != 845773819) {
            if (hashCode != 1107930627) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }
            return new Boolean(super.offer((CentralSchedulerQueue) objArr[0]));
        }
        return new Integer(super.size());
    }

    public CentralSchedulerQueue(c cVar, int i, int i2) {
        this.mExecutorStateInspector = cVar;
        this.mNormalCapacity = i;
        this.mPatienceCapacity = i2;
    }

    @Override // java.util.concurrent.PriorityBlockingQueue, java.util.Queue, java.util.concurrent.BlockingQueue
    public boolean offer(Runnable runnable) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("38bdabe5", new Object[]{this, runnable})).booleanValue() : moveIn((g) runnable, true) == 3;
    }

    @Override // java.util.concurrent.PriorityBlockingQueue, java.util.AbstractCollection, java.util.Collection
    public int size() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("32697bfb", new Object[]{this})).intValue();
        }
        try {
            return super.size();
        } catch (IllegalMonitorStateException unused) {
            return 0;
        }
    }

    public boolean reachPatienceCapacity() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3761e8e9", new Object[]{this})).booleanValue() : size() >= this.mPatienceCapacity;
    }

    public synchronized int moveIn(g gVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("63a4644d", new Object[]{this, gVar, new Boolean(z)})).intValue();
        } else if (z && this.mExecutorStateInspector.d()) {
            return 1;
        } else {
            int size = size();
            if (size >= this.mPatienceCapacity) {
                qol.h("RxSysLog", "SOX current size(%d) of central queue exceeded max patience(%d)!", Integer.valueOf(size), Integer.valueOf(this.mPatienceCapacity));
                String a2 = this.mExecutorStateInspector.a();
                if (!StringUtils.isEmpty(a2)) {
                    String replace = a2.replace(riy.MOD, "%%");
                    qol.h("RxSysLog", "SOX detail:" + replace, new Object[0]);
                }
                return 2;
            } else if (size >= this.mNormalCapacity && gVar.e()) {
                return 2;
            } else {
                if (!z) {
                    return 1;
                }
                try {
                    if (super.offer((CentralSchedulerQueue) gVar)) {
                        return 3;
                    }
                } catch (IllegalMonitorStateException unused) {
                }
                return gVar.e() ? 2 : 1;
            }
        }
    }
}
