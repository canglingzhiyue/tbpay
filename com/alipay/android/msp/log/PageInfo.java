package com.alipay.android.msp.log;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class PageInfo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public boolean isEnd = false;
    public PageInfo mReferPageInfo;
    public String pageId;
    public long pageStartTime10;
    public String pageStartTime64;
    public long pageStayTime;
    public String refer;
    public String sessionId;
    public String spm;
    public String tplViewId;

    public String getRefer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a60c1e6f", new Object[]{this});
        }
        if (this.mReferPageInfo == null) {
            return "first";
        }
        return this.mReferPageInfo.spm + "|" + this.mReferPageInfo.pageId;
    }
}
