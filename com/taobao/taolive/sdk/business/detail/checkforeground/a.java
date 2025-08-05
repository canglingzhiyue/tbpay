package com.taobao.taolive.sdk.business.detail.checkforeground;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.d;
import com.taobao.taolive.sdk.business.b;
import java.util.List;
import tb.kge;

/* loaded from: classes8.dex */
public class a extends b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(639874319);
    }

    public a(d dVar) {
        super(dVar);
    }

    public void a(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
            return;
        }
        CheckForeGroundRequest checkForeGroundRequest = new CheckForeGroundRequest();
        checkForeGroundRequest.liveIdList = list;
        a(1, checkForeGroundRequest, CheckForeGroundResponse.class);
    }
}
