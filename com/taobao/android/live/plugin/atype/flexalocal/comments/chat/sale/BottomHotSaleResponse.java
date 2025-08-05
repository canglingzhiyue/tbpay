package com.taobao.android.live.plugin.atype.flexalocal.comments.chat.sale;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import tb.kge;

/* loaded from: classes5.dex */
public class BottomHotSaleResponse extends NetBaseOutDo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private BottomHotSaleDo data;

    static {
        kge.a(-566795606);
    }

    @Override // com.taobao.taolive.sdk.adapter.network.NetBaseOutDo
    /* renamed from: getData */
    public Object mo1437getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("4ca84d6b", new Object[]{this}) : this.data;
    }

    public void setData(BottomHotSaleDo bottomHotSaleDo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1612892e", new Object[]{this, bottomHotSaleDo});
        } else {
            this.data = bottomHotSaleDo;
        }
    }
}
