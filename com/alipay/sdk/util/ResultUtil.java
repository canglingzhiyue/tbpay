package com.alipay.sdk.util;

import com.alipay.sdk.app.ResultStatus;
import com.alipay.sdk.app.statistic.StatisticRecord;
import com.alipay.sdk.sys.BizContext;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import tb.riy;

/* loaded from: classes3.dex */
public class ResultUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_MEMO = "memo";
    public static final String KEY_RESULT = "result";
    public static final String KEY_RESULT_STATUS = "resultStatus";

    public static Map<String, String> formatImpl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("79f2263d", new Object[]{str});
        }
        String[] split = str.split(";");
        HashMap hashMap = new HashMap();
        for (String str2 : split) {
            String substring = str2.substring(0, str2.indexOf("={"));
            String str3 = substring + "={";
            hashMap.put(substring, str2.substring(str2.indexOf(str3) + str3.length(), str2.lastIndexOf(riy.BLOCK_END_STR)));
        }
        return hashMap;
    }

    public static String getAttributeVal(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("45c142ea", new Object[]{str, str2});
        }
        try {
            Matcher matcher = Pattern.compile("(^|;)" + str2 + "=\\{([^}]*?)\\}").matcher(str);
            return matcher.find() ? matcher.group(2) : "?";
        } catch (Throwable th) {
            LogUtils.printExceptionStackTrace(th);
            return "?";
        }
    }

    public static Map<String, String> format(BizContext bizContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("8d449278", new Object[]{bizContext, str});
        }
        ResultStatus resultState = ResultStatus.getResultState(ResultStatus.CANCELED.getStatus());
        HashMap hashMap = new HashMap();
        hashMap.put("resultStatus", Integer.toString(resultState.getStatus()));
        hashMap.put("memo", resultState.getMemo());
        hashMap.put("result", "");
        try {
            return formatImpl(str);
        } catch (Throwable th) {
            LogUtils.e("mspl", th, "biz", StatisticRecord.EC_FORMAT_RESULT_EX);
            return hashMap;
        }
    }
}
