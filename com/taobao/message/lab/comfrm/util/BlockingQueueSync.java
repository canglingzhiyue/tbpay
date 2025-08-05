package com.taobao.message.lab.comfrm.util;

import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;
import tb.kge;

/* loaded from: classes7.dex */
public class BlockingQueueSync {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final LinkedBlockingDeque<Runnable> mDeque = new LinkedBlockingDeque<>();
    private volatile boolean isFinish = false;
    private volatile boolean noUse = false;

    static {
        kge.a(-1451961668);
    }

    public static /* synthetic */ boolean access$002(BlockingQueueSync blockingQueueSync, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4724d76c", new Object[]{blockingQueueSync, new Boolean(z)})).booleanValue();
        }
        blockingQueueSync.isFinish = z;
        return z;
    }

    public boolean await(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("52f16f8b", new Object[]{this, new Long(j)})).booleanValue();
        }
        TraceUtil.beginSection("BlockingQueueSync");
        while (!this.isFinish && j >= 0) {
            long uptimeMillis = SystemClock.uptimeMillis();
            try {
                Runnable poll = this.mDeque.poll(j, TimeUnit.MILLISECONDS);
                if (poll != null) {
                    Logger.e("BlockingQueueSync", "preRun|" + poll.getClass().getName());
                    TraceUtil.beginSection("PreRun");
                    poll.run();
                    TraceUtil.endTrace();
                } else {
                    Logger.e("BlockingQueueSync", "poll null");
                }
            } catch (InterruptedException e) {
                try {
                    Thread.sleep(0L);
                } catch (InterruptedException e2) {
                    e2.printStackTrace();
                }
                e.printStackTrace();
            }
            j -= SystemClock.uptimeMillis() - uptimeMillis;
        }
        try {
            Runnable poll2 = this.mDeque.poll(0L, TimeUnit.MILLISECONDS);
            if (poll2 != null) {
                Logger.e("BlockingQueueSync", "preRun|end|" + poll2.getClass().getName());
                poll2.run();
            } else {
                Logger.e("BlockingQueueSync", "poll null|end|");
            }
        } catch (InterruptedException e3) {
            e3.printStackTrace();
        }
        boolean z = this.isFinish;
        this.isFinish = true;
        this.mDeque.clear();
        TraceUtil.endTrace();
        return z;
    }

    public void put(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bef11b94", new Object[]{this, runnable});
        } else if (this.isFinish) {
        } else {
            TraceUtil.beginSection("BlockingQueueSync-put");
            try {
                Logger.e("BlockingQueueSync", "put");
                this.mDeque.put(runnable);
                if (this.noUse) {
                    this.mDeque.clear();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            TraceUtil.endTrace();
        }
    }

    public void finish(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a86ec6e4", new Object[]{this, str});
            return;
        }
        Logger.e("BlockingQueueSync", "finish");
        TraceUtil.beginSection("BlockingQueueSync-finish-" + str);
        try {
            this.isFinish = true;
            this.mDeque.put(new Runnable() { // from class: com.taobao.message.lab.comfrm.util.BlockingQueueSync.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    Logger.e("BlockingQueueSync", "finish|isFinish=true");
                    BlockingQueueSync.access$002(BlockingQueueSync.this, true);
                }
            });
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        TraceUtil.endTrace();
    }

    public void noUse() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a5ded8d", new Object[]{this});
            return;
        }
        Logger.e("BlockingQueueSync", "onUse");
        TraceUtil.beginSection("BlockingQueueSync-noUse");
        this.isFinish = true;
        this.noUse = true;
        this.mDeque.clear();
        TraceUtil.endTrace();
    }
}
