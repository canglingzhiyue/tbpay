package com.ap.zoloz.hummer.common;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes3.dex */
public abstract class TaskTracker {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public boolean isLive;
    public b mHummerContext;
    public e mIAlertManagerCallback;
    public g mITaskTrackerCallback;
    public TaskConfig mTaskConfig;

    static {
        kge.a(-679897947);
    }

    public abstract void forceQuit();

    public abstract void run(b bVar, TaskConfig taskConfig, g gVar);

    public void release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
            return;
        }
        this.isLive = false;
        b bVar = this.mHummerContext;
        if (bVar != null) {
            bVar.b();
            this.mHummerContext = null;
        }
        this.mITaskTrackerCallback = null;
        this.mIAlertManagerCallback = null;
    }
}
