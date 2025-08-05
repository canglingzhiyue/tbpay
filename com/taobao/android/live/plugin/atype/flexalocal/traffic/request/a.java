package com.taobao.android.live.plugin.atype.flexalocal.traffic.request;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.d;
import tb.kge;

/* loaded from: classes6.dex */
public class a extends com.taobao.taolive.sdk.business.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-277994482);
    }

    public a(d dVar) {
        super(dVar);
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        QueryOperatorRequest queryOperatorRequest = new QueryOperatorRequest();
        queryOperatorRequest.isp = str;
        a(0, queryOperatorRequest, QueryOperatorResponse.class);
    }
}
