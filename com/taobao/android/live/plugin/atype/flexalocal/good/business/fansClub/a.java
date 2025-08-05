package com.taobao.android.live.plugin.atype.flexalocal.good.business.fansClub;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.d;
import com.taobao.taolive.sdk.business.b;
import tb.kge;

/* loaded from: classes4.dex */
public class a extends b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-592841274);
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
        FansClubRequest fansClubRequest = new FansClubRequest();
        fansClubRequest.encodeAnchorId = str;
        a(1, fansClubRequest, FansClubResponse.class);
    }
}
