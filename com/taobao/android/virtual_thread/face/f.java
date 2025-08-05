package com.taobao.android.virtual_thread.face;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes6.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1264215066);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        VExecutors.setThreadPoolFactory(new StubThreadPoolFactory());
        VExecutors.setCurrentThreadGetter($$Lambda$SA5kIvR_ZJq9jllKDm41Q_0pCpI.INSTANCE);
        VExecutors.setThreadLocalFactory(new d());
    }
}
