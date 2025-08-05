package com.alipay.android.msp.framework.statisticsv2.model;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class StEventForRenderFinish extends StEvent {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public StEventForRenderFinish(String str, String str2, String str3) {
        super(str, str2, str3);
    }

    public void setTemplateDownLoadTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33c8350c", new Object[]{this, new Long(j)});
        } else {
            onStatistic(StEvent.NET_COST, String.valueOf(j));
        }
    }

    public void setParseTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed97bff", new Object[]{this, new Long(j)});
        } else {
            onStatistic(StEvent.CONVERT_TIME, String.valueOf(j));
        }
    }

    public void setRenderTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6da9ab8", new Object[]{this, new Long(j)});
        } else {
            onStatistic(StEvent.PARSE_TIME, String.valueOf(j));
        }
    }
}
