package com.taobao.android.live.plugin.atype.flexalocal.input.atmosphere.business;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.d;
import com.taobao.taolive.sdk.business.b;
import tb.kge;

/* loaded from: classes6.dex */
public class a extends b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-614544651);
    }

    public a(d dVar) {
        super(dVar);
    }

    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        AtmosphereResListRequest atmosphereResListRequest = new AtmosphereResListRequest();
        atmosphereResListRequest.liveId = str;
        atmosphereResListRequest.anchorId = str2;
        a(0, atmosphereResListRequest, AtmosphereResListResponse.class);
    }

    public void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
            return;
        }
        AtmosphereResListRequest atmosphereResListRequest = new AtmosphereResListRequest();
        atmosphereResListRequest.liveId = str;
        atmosphereResListRequest.anchorId = str2;
        atmosphereResListRequest.encryptAnchorId = str3;
        atmosphereResListRequest.VERSION = "2.0";
        a(0, atmosphereResListRequest, AtmosphereResListResponseNew.class);
    }

    public void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{this, str, str2});
            return;
        }
        AtmosphereRealRequest atmosphereRealRequest = new AtmosphereRealRequest();
        atmosphereRealRequest.liveId = str;
        atmosphereRealRequest.anchorId = str2;
        a(0, atmosphereRealRequest, AtmosphereRealResponse.class);
    }
}
