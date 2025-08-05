package com.alibaba.ut.abtest.internal.util;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes.dex */
public final class m {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-473814333);
    }

    public static long a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c5c", new Object[0])).longValue();
        }
        try {
            return com.alibaba.analytics.core.logbuilder.g.a().c();
        } catch (Throwable th) {
            b.a("ServerClock.now", th);
            return System.currentTimeMillis();
        }
    }
}
