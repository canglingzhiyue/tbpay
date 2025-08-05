package com.alipay.vi.android.phone.mrpc.core;

import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class ThreadUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static boolean checkMainThread() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a2e58f56", new Object[0])).booleanValue() : Looper.myLooper() != null && Looper.myLooper() == Looper.getMainLooper();
    }
}
