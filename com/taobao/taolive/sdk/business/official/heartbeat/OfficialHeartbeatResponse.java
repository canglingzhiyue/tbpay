package com.taobao.taolive.sdk.business.official.heartbeat;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.model.official.OfficialHeartbeatDO;
import tb.kge;

/* loaded from: classes8.dex */
public class OfficialHeartbeatResponse extends NetBaseOutDo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private OfficialHeartbeatDO data;

    static {
        kge.a(1309906913);
    }

    @Override // com.taobao.taolive.sdk.adapter.network.NetBaseOutDo
    /* renamed from: getData */
    public OfficialHeartbeatDO mo1437getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (OfficialHeartbeatDO) ipChange.ipc$dispatch("b1f30871", new Object[]{this}) : this.data;
    }

    public void setData(OfficialHeartbeatDO officialHeartbeatDO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35110087", new Object[]{this, officialHeartbeatDO});
        } else {
            this.data = officialHeartbeatDO;
        }
    }
}
