package com.alipay.android.msp.utils.net;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.constants.MspNetConstants;
import com.alipay.android.msp.framework.helper.MspConfig;
import com.alipay.android.msp.pay.TradeLogicData;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.IpChange;
import org.apache.http.Header;
import tb.riy;

/* loaded from: classes3.dex */
public class LdcUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static String getMspParams(TradeLogicData tradeLogicData, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f305ef9d", new Object[]{tradeLogicData, str});
        }
        if (tradeLogicData == null) {
            LogUtil.record(4, "LdcUtils", "getMspParams", "logicData==null");
            return "";
        }
        Header[] ldcHeaders = tradeLogicData.getLdcHeaders();
        if (ldcHeaders != null) {
            StringBuilder sb = new StringBuilder();
            for (Header header : ldcHeaders) {
                if (MspNetConstants.Request.MSP_PARAM.equals(header.getName())) {
                    sb.append(header.getValue());
                }
            }
            if (str != null) {
                try {
                    if (str.startsWith(riy.BLOCK_START_STR) && str.endsWith(riy.BLOCK_END_STR)) {
                        JSONObject parseObject = JSON.parseObject(str);
                        if (parseObject.containsKey("ldc_userId")) {
                            sb.append(";userIdLdc=");
                            sb.append(parseObject.getString("ldc_userId"));
                        }
                        if (parseObject.containsKey("ldc_logonId")) {
                            sb.append(";logon_id=");
                            sb.append(parseObject.getString("ldc_logonId"));
                        }
                    }
                } catch (Exception e) {
                    LogUtil.printExceptionStackTrace("LdcUtils", "getMspParams parse content", e);
                }
            }
            String sb2 = sb.toString();
            if (!TextUtils.isEmpty(sb2)) {
                return sb2;
            }
            if (str != null && str.contains("out_trade_no")) {
                LogUtil.record(4, "LdcUtils", "getMspParams", "use last msp params: ".concat(String.valueOf(sb2)));
                String lastMspParams = MspConfig.getInstance().getLastMspParams();
                if (!TextUtils.isEmpty(lastMspParams)) {
                    return lastMspParams;
                }
            }
        }
        return "";
    }
}
