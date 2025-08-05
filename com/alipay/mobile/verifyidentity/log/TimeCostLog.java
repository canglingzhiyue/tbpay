package com.alipay.mobile.verifyidentity.log;

import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class TimeCostLog {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static String TC_KEY = "VI_TIME_COST";

    public static void log(String str, String str2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d355145", new Object[]{str, str2, new Long(j)});
            return;
        }
        VerifyLogCat.i(str + "_" + TC_KEY, str2 + (SystemClock.elapsedRealtime() - j));
    }
}
