package com.alipay.mobile.monitor.track.spm;

import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.umipublish.draft.DraftMediaHelper;

@MpaasClassInfo(BundleName = "android-phone-wallet-spmtracker", ExportJarName = "unknown", Level = DraftMediaHelper.DraftType.PRODUCT, Product = ":android-phone-wallet-spmtracker")
/* loaded from: classes3.dex */
public class PageInfo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String className;
    public String lastClickSem;
    public String lastClickSpm;
    public String miniPageId;
    public String pageId;
    public long pageStartTime10;
    public String pageStartTime64;
    public long pageStayTime;
    public String refer;
    public String referClickSpm;
    public PageInfo referPageInfo;
    public String spm;
    public String srcSpm;
    public boolean isEnd = false;
    public String spmStatus = "0";
    public boolean needRpc = true;

    public String getRefer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a60c1e6f", new Object[]{this});
        }
        if (this.referPageInfo == null) {
            return "first";
        }
        return this.referPageInfo.spm + "|" + this.referPageInfo.pageId;
    }

    public static PageInfo clonePageInfo(PageInfo pageInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PageInfo) ipChange.ipc$dispatch("84550cd5", new Object[]{pageInfo});
        }
        PageInfo pageInfo2 = new PageInfo();
        pageInfo2.pageStartTime10 = pageInfo.pageStartTime10;
        pageInfo2.pageStartTime64 = pageInfo.pageStartTime64;
        pageInfo2.pageId = pageInfo.pageId;
        pageInfo2.pageStayTime = pageInfo.pageStayTime;
        pageInfo2.spm = pageInfo.spm;
        pageInfo2.refer = pageInfo.refer;
        pageInfo2.isEnd = pageInfo.isEnd;
        pageInfo2.spmStatus = pageInfo.spmStatus;
        pageInfo2.miniPageId = pageInfo.miniPageId;
        pageInfo2.needRpc = pageInfo.needRpc;
        pageInfo2.referClickSpm = pageInfo.referClickSpm;
        pageInfo2.className = pageInfo.className;
        pageInfo2.srcSpm = pageInfo.srcSpm;
        pageInfo2.lastClickSpm = pageInfo.lastClickSpm;
        pageInfo2.lastClickSem = pageInfo.lastClickSem;
        pageInfo2.referPageInfo = pageInfo.referPageInfo;
        return pageInfo2;
    }
}
