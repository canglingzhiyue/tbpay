package com.taobao.taolive.sdk.business.official.heartbeat;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.d;
import com.taobao.taolive.sdk.business.b;
import tb.kge;

/* loaded from: classes8.dex */
public class a extends b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(503399264);
    }

    public a(d dVar) {
        super(dVar);
    }

    public void a(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee2b490", new Object[]{this, str, str2, str3, str4});
            return;
        }
        OfficialHeartbeatRequest officialHeartbeatRequest = new OfficialHeartbeatRequest();
        officialHeartbeatRequest.encryptAnchorId = str;
        officialHeartbeatRequest.liveId = str2;
        officialHeartbeatRequest.topic = str3;
        officialHeartbeatRequest.exParam = str4;
        a(1, officialHeartbeatRequest, OfficialHeartbeatResponse.class);
    }
}
