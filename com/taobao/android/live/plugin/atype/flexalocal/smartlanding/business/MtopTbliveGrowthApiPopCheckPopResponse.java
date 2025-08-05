package com.taobao.android.live.plugin.atype.flexalocal.smartlanding.business;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import tb.kge;

/* loaded from: classes6.dex */
public class MtopTbliveGrowthApiPopCheckPopResponse extends NetBaseOutDo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private MtopTbliveGrowthApiPopCheckPopResponseData data;

    static {
        kge.a(1050325924);
    }

    @Override // com.taobao.taolive.sdk.adapter.network.NetBaseOutDo
    /* renamed from: getData */
    public MtopTbliveGrowthApiPopCheckPopResponseData mo1437getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopTbliveGrowthApiPopCheckPopResponseData) ipChange.ipc$dispatch("3b3c0590", new Object[]{this}) : this.data;
    }

    public void setData(MtopTbliveGrowthApiPopCheckPopResponseData mtopTbliveGrowthApiPopCheckPopResponseData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("400325b4", new Object[]{this, mtopTbliveGrowthApiPopCheckPopResponseData});
        } else {
            this.data = mtopTbliveGrowthApiPopCheckPopResponseData;
        }
    }
}
