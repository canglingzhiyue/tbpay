package com.alipay.mobile.intelligentdecision.log;

import com.alipay.mobile.intelligentdecision.CommonUtils;
import com.alipay.mobile.intelligentdecision.DecisionContext;
import com.alipay.mobile.verifyidentity.log.VITraceLogger;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class DecisionLogcat {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static String f5727a = "";
    private static boolean b = false;

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
            return;
        }
        f5727a = str;
        b = CommonUtils.a(DecisionContext.getInstance().getContext());
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
        } else if (!b) {
        } else {
            VITraceLogger vITraceLogger = VITraceLogger.getInstance();
            vITraceLogger.error(f5727a + "," + str, str2);
        }
    }

    public static void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{str, str2});
        } else if (!b) {
        } else {
            VITraceLogger vITraceLogger = VITraceLogger.getInstance();
            vITraceLogger.info(f5727a + "," + str, str2);
        }
    }
}
