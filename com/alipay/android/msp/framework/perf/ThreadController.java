package com.alipay.android.msp.framework.perf;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class ThreadController {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CASHIER_SCHEME_PAY = "CASHIER_SCHEME_PAY";
    public static final String CASHIER_SERVICE_PAY = "CASHIER_SERVICE_PAY";
    public static final String CASHIER_SIGN = "CASHIER_SIGN";
    public static final String CASHIER_START_PAY = "CASHIER_START_PAY";
    public static final String CASHIER_TRANS_ACTIVITY = "CASHIER_TRANS_ACTIVITY";

    public static void end(String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f35fdfd", new Object[]{strArr});
        }
    }

    public static void endWithOutScheme(String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f81381a6", new Object[]{strArr});
        }
    }

    public static void start(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a37a973", new Object[]{str});
        }
    }

    public static void startWithOutScheme(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed1f5f7c", new Object[]{str});
        }
    }
}
