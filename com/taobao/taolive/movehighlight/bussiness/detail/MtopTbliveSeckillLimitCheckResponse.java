package com.taobao.taolive.movehighlight.bussiness.detail;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import tb.kge;

/* loaded from: classes8.dex */
public class MtopTbliveSeckillLimitCheckResponse extends NetBaseOutDo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private MtopTbliveSeckillLimitCheckResponseData data;

    static {
        kge.a(-605065153);
    }

    @Override // com.taobao.taolive.sdk.adapter.network.NetBaseOutDo
    /* renamed from: getData */
    public MtopTbliveSeckillLimitCheckResponseData mo1437getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopTbliveSeckillLimitCheckResponseData) ipChange.ipc$dispatch("429d9f2f", new Object[]{this}) : this.data;
    }

    public void setData(MtopTbliveSeckillLimitCheckResponseData mtopTbliveSeckillLimitCheckResponseData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e1a7bc5", new Object[]{this, mtopTbliveSeckillLimitCheckResponseData});
        } else {
            this.data = mtopTbliveSeckillLimitCheckResponseData;
        }
    }
}
