package com.taobao.android.live.plugin.atype.flexalocal.good.business;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes4.dex */
public class h extends com.taobao.taolive.sdk.business.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-462976984);
    }

    public h(com.taobao.taolive.sdk.adapter.network.d dVar) {
        super(dVar);
    }

    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        MemberCheckRequest memberCheckRequest = new MemberCheckRequest();
        memberCheckRequest.anchorId = str;
        memberCheckRequest.liveId = str2;
        a(1, memberCheckRequest, MemberCheckResponse.class);
    }
}
