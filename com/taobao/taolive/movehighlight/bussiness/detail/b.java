package com.taobao.taolive.movehighlight.bussiness.detail;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes8.dex */
public class b extends com.taobao.taolive.sdk.business.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1053494980);
    }

    public b(com.taobao.taolive.sdk.adapter.network.d dVar) {
        super(dVar);
    }

    public void a(String str, String str2, long j, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d262092", new Object[]{this, str, str2, new Long(j), str3});
            return;
        }
        MtopTbliveSeckillBusinessThresholdGetRequest mtopTbliveSeckillBusinessThresholdGetRequest = new MtopTbliveSeckillBusinessThresholdGetRequest();
        mtopTbliveSeckillBusinessThresholdGetRequest.setAnchorId(str);
        mtopTbliveSeckillBusinessThresholdGetRequest.setLiveId(str2);
        mtopTbliveSeckillBusinessThresholdGetRequest.setItemId(String.valueOf(j));
        mtopTbliveSeckillBusinessThresholdGetRequest.setRecordId(str3);
        a(1, mtopTbliveSeckillBusinessThresholdGetRequest, MtopTbliveSeckillBusinessThresholdGetResponse.class);
    }
}
