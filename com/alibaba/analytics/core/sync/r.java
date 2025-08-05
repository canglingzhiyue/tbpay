package com.alibaba.analytics.core.sync;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes.dex */
public class r implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1378478828);
        kge.a(-1390502639);
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
        } else {
            q.a().a(q.MSGTYPE_INTERVAL);
        }
    }
}
