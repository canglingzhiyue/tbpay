package com.taobao.message.kit.threadpool;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.virtual_thread.face.VExecutors;
import com.taobao.message.kit.threadpool.Coordinator;
import com.taobao.message.uikit.util.ApplicationUtil;
import com.taobao.tao.log.TLog;
import tb.kge;

@Deprecated
/* loaded from: classes7.dex */
public abstract class BaseRunnable implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "BaseRunnable";
    private boolean isTerminal;
    private long mDelayInMillis;

    static {
        kge.a(448420387);
        kge.a(-1390502639);
    }

    public abstract void execute();

    public BaseRunnable() {
        this.mDelayInMillis = 0L;
        this.isTerminal = false;
    }

    public BaseRunnable(long j) {
        this.mDelayInMillis = 0L;
        this.isTerminal = false;
        this.mDelayInMillis = j;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
        } else if (this.isTerminal) {
        } else {
            try {
                if (this.mDelayInMillis > 0) {
                    try {
                        Thread.sleep(this.mDelayInMillis);
                    } catch (InterruptedException e) {
                        TLog.loge("AmpRunnable", Log.getStackTraceString(e));
                    }
                }
                execute();
            } catch (Exception e2) {
                if (ApplicationUtil.isDebug()) {
                    throw e2;
                }
                TLog.loge("AmpRunnable", Log.getStackTraceString(e2));
                if (Coordinator.getExceptionListener() != null) {
                    Coordinator.getExceptionListener().onException(e2);
                }
            }
            if (!ApplicationUtil.isDebug()) {
                return;
            }
            TLog.logd(TAG, "end " + VExecutors.currentThread().getName() + ":" + getClass().getName());
        }
    }

    private void publishRunnableInit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("504c8f03", new Object[]{this});
        } else {
            Coordinator.threadSubscribersIterate(new Coordinator.Action<CoordinatorThreadSubscriber>() { // from class: com.taobao.message.kit.threadpool.BaseRunnable.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.message.kit.threadpool.Coordinator.Action
                public void action(CoordinatorThreadSubscriber coordinatorThreadSubscriber) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("4bf2dfd7", new Object[]{this, coordinatorThreadSubscriber});
                    } else {
                        coordinatorThreadSubscriber.runnableInit(BaseRunnable.this);
                    }
                }
            });
        }
    }

    private void publishBeforeExecute() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47944f2e", new Object[]{this});
        } else {
            Coordinator.threadSubscribersIterate(new Coordinator.Action<CoordinatorThreadSubscriber>() { // from class: com.taobao.message.kit.threadpool.BaseRunnable.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.message.kit.threadpool.Coordinator.Action
                public void action(CoordinatorThreadSubscriber coordinatorThreadSubscriber) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("4bf2dfd7", new Object[]{this, coordinatorThreadSubscriber});
                    } else {
                        coordinatorThreadSubscriber.beforeExecute(BaseRunnable.this);
                    }
                }
            });
        }
    }

    public void terminal() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26677903", new Object[]{this});
        } else {
            this.isTerminal = true;
        }
    }
}
