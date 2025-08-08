package com.alipay.android.msp.framework.statisticsv2.collector;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.alipay.android.msp.core.context.MspContext;
import com.alipay.android.msp.core.context.MspContextManager;
import com.alipay.android.msp.framework.helper.GlobalHelper;
import com.alipay.android.msp.framework.statisticsv2.Grammar;
import com.alipay.android.msp.framework.sys.DeviceInfo;
import com.alipay.android.msp.framework.tid.TidStorage;
import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class IdCollector {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static String collectData(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ae92bc42", new Object[]{str, new Integer(i)});
        }
        String str2 = Grammar.ATTR_DEFAULT_VALUE;
        char c = 65535;
        switch (str.hashCode()) {
            case -836030906:
                if (str.equals("userId")) {
                    c = 2;
                    break;
                }
                break;
            case 114831:
                if (str.equals("tid")) {
                    c = 0;
                    break;
                }
                break;
            case 111607168:
                if (str.equals("utdid")) {
                    c = 1;
                    break;
                }
                break;
            case 607796817:
                if (str.equals("sessionId")) {
                    c = 3;
                    break;
                }
                break;
            case 2063197029:
                if (str.equals("imsiAndImei")) {
                    c = 4;
                    break;
                }
                break;
        }
        if (c == 0) {
            return TidStorage.isInitialized() ? TidStorage.getInstance().getTid() : str2;
        } else if (c == 1) {
            return GlobalHelper.getInstance().getUtdid(GlobalHelper.getInstance().getContext());
        } else {
            if (c == 2) {
                return PhoneCashierMspEngine.getMspWallet().getUserId();
            }
            if (c == 3) {
                MspContext mspContextByBizId = MspContextManager.getInstance().getMspContextByBizId(i);
                return (mspContextByBizId == null || StringUtils.isEmpty(mspContextByBizId.getGlobalSession())) ? str2 : mspContextByBizId.getGlobalSession();
            } else if (c != 4) {
                return str2;
            } else {
                Context context = GlobalHelper.getInstance().getContext();
                String imsi = DeviceInfo.getInstance(context).getIMSI(context);
                String imei = DeviceInfo.getInstance(context).getIMEI(context);
                if ("000000000000000".equals(imsi)) {
                    imsi = "0";
                }
                if ("000000000000000".equals(imei)) {
                    imei = "0";
                }
                return imsi + "|" + imei + "|" + DeviceInfo.getUid();
            }
        }
    }
}
