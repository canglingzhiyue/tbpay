package com.alipay.android.msp.perf;

import android.os.Process;
import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.mobile.common.logging.util.perf.Constants;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class CashierPerformanceHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void setCurrentThreadPriority(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb82e17", new Object[]{new Integer(i)});
        } else if (!Constants.VAL_YES.equals(PhoneCashierMspEngine.getMspWallet().getWalletConfig("cashier_per_set_threadpriority"))) {
        } else {
            try {
                LogUtil.record(2, "CashierPerformanceHelper:setCurrentThreadPriority ", " priority = ".concat(String.valueOf(i)));
                Process.setThreadPriority(i);
            } catch (Throwable unused) {
            }
        }
    }
}
