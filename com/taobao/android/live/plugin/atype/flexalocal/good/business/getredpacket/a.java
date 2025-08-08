package com.taobao.android.live.plugin.atype.flexalocal.good.business.getredpacket;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.business.GoodListSearchResponse;
import com.taobao.taolive.sdk.adapter.network.d;
import com.taobao.taolive.sdk.business.b;
import java.util.HashMap;
import tb.kge;

/* loaded from: classes4.dex */
public class a extends b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-759627909);
    }

    public a(d dVar) {
        super(dVar);
    }

    public void a(GetPacketRequest getPacketRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba326ce5", new Object[]{this, getPacketRequest});
            return;
        }
        if (!StringUtils.isEmpty(getPacketRequest.asac)) {
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put("asac", getPacketRequest.asac);
            a(hashMap);
        }
        a(1, getPacketRequest, GoodListSearchResponse.class);
    }
}
