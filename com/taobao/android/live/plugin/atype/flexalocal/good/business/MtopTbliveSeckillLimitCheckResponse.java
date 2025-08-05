package com.taobao.android.live.plugin.atype.flexalocal.good.business;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import tb.kge;

/* loaded from: classes4.dex */
public class MtopTbliveSeckillLimitCheckResponse extends NetBaseOutDo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private MtopTbliveSeckillLimitCheckResponseData data;

    static {
        kge.a(286446290);
    }

    @Override // com.taobao.taolive.sdk.adapter.network.NetBaseOutDo
    /* renamed from: getData */
    public MtopTbliveSeckillLimitCheckResponseData mo1437getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopTbliveSeckillLimitCheckResponseData) ipChange.ipc$dispatch("fb8a3cfc", new Object[]{this}) : this.data;
    }

    public void setData(MtopTbliveSeckillLimitCheckResponseData mtopTbliveSeckillLimitCheckResponseData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d94f94d2", new Object[]{this, mtopTbliveSeckillLimitCheckResponseData});
        } else {
            this.data = mtopTbliveSeckillLimitCheckResponseData;
        }
    }
}
