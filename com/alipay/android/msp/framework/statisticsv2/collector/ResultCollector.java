package com.alipay.android.msp.framework.statisticsv2.collector;

import com.alipay.android.msp.framework.statisticsv2.Grammar;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class ResultCollector {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static String collectData(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f300a3bb", new Object[]{str});
        }
        String str3 = Grammar.ATTR_DEFAULT_VALUE;
        switch (str.hashCode()) {
            case -1607744152:
                str2 = "endCode";
                str.equals(str2);
                break;
            case -1459540411:
                str2 = "lastPage";
                str.equals(str2);
                break;
            case -1187471587:
                str2 = "clientEndCode";
                str.equals(str2);
                break;
            case 2042023678:
                str.equals("execTime");
                break;
        }
        return str3;
    }
}
