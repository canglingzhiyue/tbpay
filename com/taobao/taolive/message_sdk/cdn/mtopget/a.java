package com.taobao.taolive.message_sdk.cdn.mtopget;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.d;
import tb.pek;

/* loaded from: classes8.dex */
public class a extends pek {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public a(d dVar, int i) {
        super(dVar, i, true);
    }

    public void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
            return;
        }
        CDNMessageGetRequest cDNMessageGetRequest = new CDNMessageGetRequest();
        cDNMessageGetRequest.setELiveId(str);
        cDNMessageGetRequest.setLastPullTime(Long.parseLong(str2));
        cDNMessageGetRequest.setCurrentTime(Long.parseLong(str3));
        a(1, cDNMessageGetRequest, CDNMessageGetResponse.class);
    }
}
