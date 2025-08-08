package com.alipay.mobile.verifyidentity.sentry;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alipay.mobile.alertsentry.Sentry;
import com.alipay.mobile.alertsentry.trace.TraceFactory;
import com.alipay.mobile.verifyidentity.engine.MicroModuleContext;
import com.alipay.mobile.verifyidentity.log.VerifyLogCat;
import com.alipay.mobile.verifyidentity.utils.ReportHelper;
import com.alipay.mobile.verifyidentity.utils.task.AsyncTaskExecutor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.weex.common.Constants;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class SentryHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static volatile long f6067a = 0;
    private static String b = "";
    private static final HashMap<String, String> c = new HashMap<>();
    private static final HashMap<String, String> d = new HashMap<>();

    public static String a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8a5b32dc", new Object[]{obj});
        }
        if (obj == null) {
            return "";
        }
        try {
            return JSON.toJSONString(obj);
        } catch (Throwable th) {
            VerifyLogCat.e("Sentry", th);
            return "";
        }
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : "Y".equalsIgnoreCase(ReportHelper.getReportFlag("sentry_enable")) && b();
    }

    private static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue();
        }
        try {
            String config = OrangeConfig.getInstance().getConfig("VerifyIdentityConfig", "closeSentry", "");
            VerifyLogCat.d("Sentry", "VerifyIdentityConfig.closeSentry = " + config);
            return !"Y".equalsIgnoreCase(config);
        } catch (Throwable th) {
            VerifyLogCat.e("Sentry", th);
            return false;
        }
    }

    private static int c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("88097ea7", new Object[]{str})).intValue();
        }
        if (StringUtils.isEmpty(str)) {
            return 0;
        }
        try {
            return Integer.parseInt(ReportHelper.getReportFlag("sentry_" + str));
        } catch (Throwable unused) {
            return 0;
        }
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else {
            b = str;
        }
    }

    public static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{str});
            return;
        }
        TraceFactory.a(str);
        b = "";
        long c2 = c("delay");
        if (c2 <= 0) {
            return;
        }
        long c3 = c(Constants.Name.INTERVAL);
        if (c3 <= 0) {
            return;
        }
        if (f6067a <= 0) {
            f6067a = System.currentTimeMillis();
        } else if (System.currentTimeMillis() - f6067a < c3) {
            return;
        }
        final Context context = MicroModuleContext.getInstance().getContext();
        if (context == null) {
            return;
        }
        AsyncTaskExecutor.getInstance().schedule(new Runnable() { // from class: com.alipay.mobile.verifyidentity.sentry.SentryHelper.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    Sentry.a(context);
                }
            }
        }, "SentryMakeDecisionThread", c2, TimeUnit.MILLISECONDS);
    }
}
