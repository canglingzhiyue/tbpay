package com.taobao.android.live.plugin.atype.flexalocal.bottom.control.share.business;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import tb.kge;

/* loaded from: classes5.dex */
public class ShareReturnResponse extends NetBaseOutDo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private ShareReturnResponseData data;

    static {
        kge.a(-1200278597);
    }

    @Override // com.taobao.taolive.sdk.adapter.network.NetBaseOutDo
    /* renamed from: getData */
    public ShareReturnResponseData mo1437getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ShareReturnResponseData) ipChange.ipc$dispatch("3d05b3", new Object[]{this}) : this.data;
    }

    public void setData(ShareReturnResponseData shareReturnResponseData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c730bc9", new Object[]{this, shareReturnResponseData});
        } else {
            this.data = shareReturnResponseData;
        }
    }
}
