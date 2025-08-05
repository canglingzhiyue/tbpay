package com.taobao.taolive.movehighlight.bussiness.detail;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import tb.kge;

/* loaded from: classes8.dex */
public class MtopTbliveSeckillBusinessThresholdGetResponse extends NetBaseOutDo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private MtopTbliveSeckillBusinessThresholdGetResponseData data;

    static {
        kge.a(-246987331);
    }

    @Override // com.taobao.taolive.sdk.adapter.network.NetBaseOutDo
    /* renamed from: getData */
    public MtopTbliveSeckillBusinessThresholdGetResponseData mo1437getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopTbliveSeckillBusinessThresholdGetResponseData) ipChange.ipc$dispatch("8d6df831", new Object[]{this}) : this.data;
    }

    public void setData(MtopTbliveSeckillBusinessThresholdGetResponseData mtopTbliveSeckillBusinessThresholdGetResponseData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cace2507", new Object[]{this, mtopTbliveSeckillBusinessThresholdGetResponseData});
        } else {
            this.data = mtopTbliveSeckillBusinessThresholdGetResponseData;
        }
    }
}
