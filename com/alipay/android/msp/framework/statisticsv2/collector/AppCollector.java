package com.alipay.android.msp.framework.statisticsv2.collector;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.core.context.MspContextManager;
import com.alipay.android.msp.core.context.MspTradeContext;
import com.alipay.android.msp.framework.helper.GlobalHelper;
import com.alipay.android.msp.framework.statisticsv2.Grammar;
import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.IpChange;
import tb.rrv;

/* loaded from: classes3.dex */
public class AppCollector {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static String collectData(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ae92bc42", new Object[]{str, new Integer(i)});
        }
        String str2 = Grammar.ATTR_DEFAULT_VALUE;
        char c = 65535;
        switch (str.hashCode()) {
            case -1051830678:
                if (str.equals(rrv.PRODUCT_ID)) {
                    c = 2;
                    break;
                }
                break;
            case -794136500:
                if (str.equals("appName")) {
                    c = 0;
                    break;
                }
                break;
            case 653717774:
                if (str.equals("extAppInfo")) {
                    c = 3;
                    break;
                }
                break;
            case 1484112759:
                if (str.equals("appVersion")) {
                    c = 1;
                    break;
                }
                break;
            case 2022955529:
                if (str.equals("reserved1")) {
                    c = 4;
                    break;
                }
                break;
        }
        if (c == 0) {
            return GlobalHelper.getInstance().getPackageName();
        }
        if (c == 1) {
            return GlobalHelper.getInstance().getPackageVersion();
        }
        if (c == 2) {
            return PhoneCashierMspEngine.getMspWallet().getProductId();
        }
        if (c == 3) {
            return a(i);
        }
        return c != 4 ? str2 : Grammar.ATTR_DEFAULT_VALUE;
    }

    private static String a(int i) {
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9064aa65", new Object[]{new Integer(i)});
        }
        String str = Grammar.ATTR_DEFAULT_VALUE;
        try {
            MspTradeContext tradeContextByBizId = MspContextManager.getInstance().getTradeContextByBizId(i);
            if (tradeContextByBizId == null) {
                return str;
            }
            String orderInfo = tradeContextByBizId.getOrderInfo();
            String str2 = null;
            if (TextUtils.isEmpty(orderInfo)) {
                return str;
            }
            String[] split = orderInfo.split("&");
            int length = split.length;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                String str3 = split[i2];
                if (!TextUtils.isEmpty(str3) && str3.startsWith("bizcontext=")) {
                    str2 = str3;
                    break;
                }
                i2++;
            }
            if (str2 == null) {
                return str;
            }
            String substring = str2.substring(11);
            if (substring.startsWith("\"") && substring.endsWith("\"")) {
                substring = substring.substring(1, substring.length() - 1);
            }
            JSONObject parseObject = JSON.parseObject(substring);
            if (parseObject == null) {
                return str;
            }
            String string = parseObject.getString("an");
            String string2 = parseObject.getString("av");
            if (TextUtils.isEmpty(string)) {
                return str;
            }
            try {
                if (TextUtils.isEmpty(string2)) {
                    return string;
                }
                return string + "|" + string2;
            } catch (Throwable th) {
                th = th;
                str = string;
                LogUtil.printExceptionStackTrace(th);
                return str;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
