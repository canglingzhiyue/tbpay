package com.taobao.android.live.plugin.atype.flexalocal.traffic.request;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.d;
import tb.kge;

/* loaded from: classes6.dex */
public class b extends com.taobao.taolive.sdk.business.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(542511555);
    }

    public b(d dVar) {
        super(dVar);
    }

    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        QueryTrafficCardRequest queryTrafficCardRequest = new QueryTrafficCardRequest();
        queryTrafficCardRequest.isp = str;
        queryTrafficCardRequest.ispResult = str2;
        a(0, queryTrafficCardRequest, QueryTrafficCardResponse.class);
    }
}
