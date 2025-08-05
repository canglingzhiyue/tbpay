package com.alipay.android.msp.framework.statisticsv2.collector;

import android.os.Looper;
import com.alipay.android.msp.framework.statisticsv2.Grammar;
import com.alipay.android.msp.framework.taskscheduler.TaskHelper;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class DeviceCollector {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static String asyncCollectData(final String str, final IAsyncCollectorCallback iAsyncCollectorCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cdeed7c2", new Object[]{str, iAsyncCollectorCallback});
        }
        String str2 = Grammar.ATTR_DEFAULT_VALUE;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            TaskHelper.execute(new Runnable() { // from class: com.alipay.android.msp.framework.statisticsv2.collector.DeviceCollector.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        if (IAsyncCollectorCallback.this == null) {
                            return;
                        }
                        IAsyncCollectorCallback.this.reCheck(str);
                    } catch (Throwable th) {
                        LogUtil.printExceptionStackTrace(th);
                    }
                }
            });
            return str2;
        }
        return a(str);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0057, code lost:
        if (r8.equals("country") != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String a(java.lang.String r8) {
        /*
            Method dump skipped, instructions count: 468
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.msp.framework.statisticsv2.collector.DeviceCollector.a(java.lang.String):java.lang.String");
    }
}
