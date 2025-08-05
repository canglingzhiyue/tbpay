package com.taobao.taolive.movehighlight.bussiness.detail;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes8.dex */
public class c extends com.taobao.taolive.sdk.business.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1411572802);
    }

    public c(com.taobao.taolive.sdk.adapter.network.d dVar) {
        super(dVar);
    }

    public void a(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee2b490", new Object[]{this, str, str2, str3, str4});
            return;
        }
        MtopTbliveSeckillLimitCheckRequest mtopTbliveSeckillLimitCheckRequest = new MtopTbliveSeckillLimitCheckRequest();
        mtopTbliveSeckillLimitCheckRequest.setAnchorId(str);
        mtopTbliveSeckillLimitCheckRequest.setLiveId(str2);
        mtopTbliveSeckillLimitCheckRequest.setItemId(str3);
        mtopTbliveSeckillLimitCheckRequest.setActivityId(str4);
        a(1, mtopTbliveSeckillLimitCheckRequest, MtopTbliveSeckillLimitCheckResponse.class);
    }
}
