package com.taobao.android.live.plugin.atype.flexalocal.officialLive;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.d;
import com.taobao.taolive.sdk.business.detail.LiveDetailRequest;
import com.taobao.taolive.sdk.business.detail.LiveDetailResponse;
import tb.kge;

/* loaded from: classes6.dex */
public class c extends com.taobao.taolive.sdk.business.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1704661219);
    }

    public c(d dVar) {
        super(dVar);
    }

    public void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
            return;
        }
        LiveDetailRequest liveDetailRequest = new LiveDetailRequest();
        liveDetailRequest.liveId = str;
        liveDetailRequest.liveSource = str2;
        liveDetailRequest.entryLiveSource = str3;
        liveDetailRequest.setAPI_NAME("mtop.tblive.live.detail.query");
        liveDetailRequest.setVERSION("4.0");
        a(1, liveDetailRequest, LiveDetailResponse.class);
    }
}
