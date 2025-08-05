package com.alipay.mobile.common.amnet.service.util;

import com.alipay.mobile.common.amnet.api.AmnetEnvHelper;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.MiscUtils;
import com.alipay.mobile.common.transport.utils.NetworkAsyncTaskExecutor;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class HoldOnTask {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f5386a;
    private boolean b;

    public static /* synthetic */ String access$000(HoldOnTask holdOnTask) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6b8ba7e4", new Object[]{holdOnTask}) : holdOnTask.f5386a;
    }

    public HoldOnTask(String str) {
        this.b = false;
        this.f5386a = str;
    }

    public HoldOnTask(String str, boolean z) {
        this.b = false;
        this.f5386a = str;
        this.b = z;
    }

    public HoldOnTask() {
        this.b = false;
        this.f5386a = "HoldOnTask";
    }

    public void execute(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1afb0dfa", new Object[]{this, runnable});
            return;
        }
        try {
            if (PushIpcHelper.hasRegister()) {
                runnable.run();
            } else if (!MiscUtils.isAtFrontDesk(AmnetEnvHelper.getAppContext()) && !MiscUtils.isMainProcessRuning(AmnetEnvHelper.getAppContext())) {
                LogCatUtil.warn(this.f5386a, "wallet isn't at front,shouldn't come here");
            } else if (this.b) {
                NetworkAsyncTaskExecutor.execute(a(runnable));
            } else {
                NetworkAsyncTaskExecutor.executeLowPri(a(runnable));
            }
        } catch (Throwable th) {
            LogCatUtil.error(this.f5386a, "HoldOnTask", th);
        }
    }

    private Runnable a(final Runnable runnable) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Runnable) ipChange.ipc$dispatch("efaaecee", new Object[]{this, runnable}) : new Runnable() { // from class: com.alipay.mobile.common.amnet.service.util.HoldOnTask.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                LogCatUtil.warn(HoldOnTask.access$000(HoldOnTask.this), "No bundler register.  waiting!");
                if (!PushIpcHelper.waitBinded()) {
                    return;
                }
                runnable.run();
            }
        };
    }
}
