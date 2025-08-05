package com.taobao.tao.recommend3.tracelog;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import tb.kge;

/* loaded from: classes.dex */
public abstract class e implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-2064937342);
        kge.a(-1390502639);
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        try {
            a();
        } catch (Throwable th) {
            TLog.loge("home", "GlobalTrace", "process runnable error", th);
        }
    }
}
