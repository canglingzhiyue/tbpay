package com.alipay.android.app.helper;

import android.content.Context;
import com.alipay.android.app.safepaylogv2.api.StatisticCollector;
import com.alipay.android.msp.framework.helper.GlobalHelper;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.alipay.android.msp.framework.tid.TidStorage;
import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class ChannelHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static boolean isInitialized = false;

    public static String requestChannel(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d16c72c9", new Object[]{context, str});
        }
        try {
            synchronized (ChannelHelper.class) {
                GlobalHelper.getInstance().init(context);
                if (!isInitialized) {
                    isInitialized = true;
                    PhoneCashierMspEngine.getMspBase().loadProperties(context);
                }
            }
            if (TidStorage.getInstance(context).isTidAvailable()) {
                return a(context, true, str);
            }
            StatisticCollector.addError(StatisticCollector.GLOBAL_AGENT, ErrorType.DEFAULT, "TidAvailablefalse", "isTidAvailable=false time=0002");
            return "";
        } catch (Exception e) {
            LogUtil.printExceptionStackTrace(e);
            return "";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String a(android.content.Context r10, boolean r11, java.lang.String r12) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 310
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.app.helper.ChannelHelper.a(android.content.Context, boolean, java.lang.String):java.lang.String");
    }
}
