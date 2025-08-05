package com.taobao.taolive.room.business.growth;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.d;
import com.taobao.taolive.sdk.business.b;
import tb.kge;

/* loaded from: classes8.dex */
public class a extends b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1900227528);
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
        GrowthQueryRequest growthQueryRequest = new GrowthQueryRequest();
        growthQueryRequest.liveId = str;
        growthQueryRequest.liveSource = str2;
        a(1, growthQueryRequest, GrowthQueryResponse.class);
    }
}
