package com.taobao.taolive.room.business.mess;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.business.b;
import tb.kge;
import tb.poy;

/* loaded from: classes8.dex */
public class c extends b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1806250741);
    }

    public c(com.taobao.taolive.sdk.adapter.network.d dVar) {
        super(dVar);
    }

    public void a(String str, String str2, com.taobao.alilive.aliliveframework.frame.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58c704c9", new Object[]{this, str, str2, aVar});
            return;
        }
        LiveDetailMessinfoRequest liveDetailMessinfoRequest = new LiveDetailMessinfoRequest();
        liveDetailMessinfoRequest.creatorId = str;
        liveDetailMessinfoRequest.liveId = str2;
        liveDetailMessinfoRequest.type = "sponsor,timerInteractive4NeoProtocol,broadcasterScore,activity,liveHeadBanner,visitorIdentity,hasLive";
        if (poy.u(aVar) != null && poy.u(aVar).extraBizType == 1) {
            liveDetailMessinfoRequest.type += ",auction";
        }
        a(0, liveDetailMessinfoRequest, LiveDetailMessinfoResponse.class);
    }
}
