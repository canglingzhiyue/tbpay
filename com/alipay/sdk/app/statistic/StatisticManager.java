package com.alipay.sdk.app.statistic;

import com.alipay.android.msp.framework.statisticsv2.model.StEvent;
import com.alipay.sdk.sys.BizContext;
import com.alipay.sdk.util.LogUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class StatisticManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void putError(BizContext bizContext, String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("891c8eca", new Object[]{bizContext, str, str2, th});
            return;
        }
        LogUtils.e("mspl", th, str, str2);
        if (bizContext == null || bizContext.getStatisticInfo() == null) {
            return;
        }
        if (th != null) {
            bizContext.getStatisticInfo().addError(str, str2, th);
        } else {
            bizContext.getStatisticInfo().addError(str, str2, "");
        }
    }

    public static void putError(BizContext bizContext, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b608aa0b", new Object[]{bizContext, str, str2});
        } else {
            putError(bizContext, str, str2, null);
        }
    }

    public static void putErrorMsg(BizContext bizContext, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc968da6", new Object[]{bizContext, str, str2, str3});
        } else if (bizContext == null || bizContext.getStatisticInfo() == null) {
        } else {
            bizContext.getStatisticInfo().addError(str, str2, str3);
        }
    }

    public static void putAction(BizContext bizContext, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a8c92a9", new Object[]{bizContext, str, str2, str3});
            return;
        }
        LogUtils.i("mspl", str, str2, str3);
        if (bizContext == null || bizContext.getStatisticInfo() == null) {
            return;
        }
        bizContext.getStatisticInfo().addEvent(new StEvent(str, str2, str3));
    }

    public static void putAction(BizContext bizContext, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e11d329f", new Object[]{bizContext, str, str2});
        } else {
            putAction(bizContext, str, str2, null);
        }
    }
}
