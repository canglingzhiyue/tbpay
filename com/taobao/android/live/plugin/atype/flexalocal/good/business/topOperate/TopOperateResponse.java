package com.taobao.android.live.plugin.atype.flexalocal.good.business.topOperate;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import tb.kge;

/* loaded from: classes4.dex */
public class TopOperateResponse extends NetBaseOutDo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private TopOperateResponseData data;

    static {
        kge.a(1994881767);
    }

    @Override // com.taobao.taolive.sdk.adapter.network.NetBaseOutDo
    /* renamed from: getData */
    public TopOperateResponseData mo1437getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TopOperateResponseData) ipChange.ipc$dispatch("2e0603c7", new Object[]{this}) : this.data;
    }

    public void setData(TopOperateResponseData topOperateResponseData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("934aef9d", new Object[]{this, topOperateResponseData});
        } else {
            this.data = topOperateResponseData;
        }
    }
}
