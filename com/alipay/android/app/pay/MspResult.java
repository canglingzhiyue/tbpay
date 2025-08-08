package com.alipay.android.app.pay;

import mtopsdk.common.util.StringUtils;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.alipay.android.msp.utils.JsonUtil;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class MspResult {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String extendInfo;
    public String memo;
    public String netError;
    public String openTime;
    public String result;
    public String resultStatus;

    public MspResult(String str) {
        String[] split;
        int indexOf;
        String str2 = null;
        try {
            if (!StringUtils.isEmpty(str) && str.contains("{\"biz_type\":\"share_pp\"}") && str.contains("extendInfo={")) {
                String gatValue = gatValue(str.substring(str.indexOf("extendInfo={")), MspGlobalDefine.EXTENDINFO);
                if (JsonUtil.isJsonObjectString(gatValue)) {
                    str2 = gatValue;
                }
            }
            this.extendInfo = str2;
            String str3 = this.extendInfo;
            if (!StringUtils.isEmpty(str) && !StringUtils.isEmpty(str3) && (indexOf = str.indexOf("extendInfo={".concat(String.valueOf(str3)))) > 0) {
                str = str.substring(0, indexOf);
            }
            for (String str4 : str.split(";")) {
                if (str4.startsWith("resultStatus")) {
                    this.resultStatus = gatValue(str4, "resultStatus");
                }
                if (str4.startsWith("result")) {
                    this.result = gatValue(str4, "result");
                }
                if (str4.startsWith("memo")) {
                    this.memo = gatValue(str4, "memo");
                }
                if (str4.startsWith(MspGlobalDefine.OPEN_TIME)) {
                    this.openTime = gatValue(str4, MspGlobalDefine.OPEN_TIME);
                }
                if (str4.startsWith("netError")) {
                    this.netError = gatValue(str4, "netError");
                }
            }
        } catch (Exception e) {
            LogUtil.printExceptionStackTrace(e);
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "resultStatus : " + this.resultStatus + ", result = " + this.result + ", memo = " + this.memo + ", openTime = " + this.openTime + ", netError = " + this.netError + ", extendInfo = " + this.extendInfo;
    }

    public String gatValue(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("10db490e", new Object[]{this, str, str2});
        }
        String substring = str.substring((str2 + "={").length(), str.length());
        return substring.substring(0, substring.length() - 1);
    }
}
