package com.taobao.trade.common.kit.utils;

import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes9.dex */
public final class i {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1119335299);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : Thread.currentThread() == Looper.getMainLooper().getThread();
    }
}
