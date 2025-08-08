package com.alipay.android.msp.framework.statisticsv2.collector;

import mtopsdk.common.util.StringUtils;
import com.alipay.android.msp.core.context.MspContextManager;
import com.alipay.android.msp.core.context.MspTradeContext;
import com.alipay.android.msp.framework.statisticsv2.Grammar;
import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.android.msp.utils.ThreadSafeDateFormat;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Date;

/* loaded from: classes3.dex */
public class TimeCollector {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static String collectData(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ae92bc42", new Object[]{str, new Integer(i)});
        }
        String str2 = Grammar.ATTR_DEFAULT_VALUE;
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -1067401920) {
            if (hashCode == 3560141 && str.equals("time")) {
                c = 1;
            }
        } else if (str.equals("traceId")) {
            c = 0;
        }
        if (c == 0) {
            return a(i);
        }
        return c != 1 ? str2 : ThreadSafeDateFormat.format(new Date(), "yyyy-MM-dd HH:mm:ss:SSS");
    }

    private static String a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9064aa65", new Object[]{new Integer(i)});
        }
        String trId = PhoneCashierMspEngine.getMspWallet().getTrId();
        try {
            MspTradeContext tradeContextByBizId = MspContextManager.getInstance().getTradeContextByBizId(i);
            if (tradeContextByBizId == null) {
                return trId;
            }
            String apLinkToken = tradeContextByBizId.getApLinkToken();
            return !StringUtils.isEmpty(apLinkToken) ? apLinkToken : trId;
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
            return trId;
        }
    }
}
