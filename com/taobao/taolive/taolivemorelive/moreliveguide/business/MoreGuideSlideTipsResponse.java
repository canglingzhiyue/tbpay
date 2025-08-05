package com.taobao.taolive.taolivemorelive.moreliveguide.business;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;

/* loaded from: classes8.dex */
public class MoreGuideSlideTipsResponse extends NetBaseOutDo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private MoreGuideSlideTipsResponseData data;

    public void setData(MoreGuideSlideTipsResponseData moreGuideSlideTipsResponseData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32344ace", new Object[]{this, moreGuideSlideTipsResponseData});
        } else {
            this.data = moreGuideSlideTipsResponseData;
        }
    }

    @Override // com.taobao.taolive.sdk.adapter.network.NetBaseOutDo
    /* renamed from: getData */
    public Object mo1437getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("4ca84d6b", new Object[]{this}) : this.data;
    }
}
