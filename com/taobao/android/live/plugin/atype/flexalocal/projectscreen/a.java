package com.taobao.android.live.plugin.atype.flexalocal.projectscreen;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.atomic.AtomicLong;
import tb.kge;

/* loaded from: classes6.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1733019611);
    }

    public static boolean a(AtomicLong atomicLong) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f4be6d88", new Object[]{atomicLong})).booleanValue();
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - atomicLong.get() > 1000) {
            z = true;
        }
        if (z) {
            atomicLong.set(currentTimeMillis);
        }
        return z;
    }
}
