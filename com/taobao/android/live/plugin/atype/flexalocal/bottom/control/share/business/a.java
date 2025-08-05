package com.taobao.android.live.plugin.atype.flexalocal.bottom.control.share.business;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.bottom.control.share.config.GetLiveShareConfigRequest;
import com.taobao.android.live.plugin.atype.flexalocal.bottom.control.share.config.GetLiveShareConfigResponse;
import com.taobao.taolive.sdk.adapter.network.d;
import tb.kge;

/* loaded from: classes5.dex */
public class a extends com.taobao.taolive.sdk.business.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(587523678);
    }

    public a(d dVar) {
        super(dVar);
    }

    public void a(GetLiveShareConfigRequest getLiveShareConfigRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fc30a7c", new Object[]{this, getLiveShareConfigRequest});
        } else {
            a(0, getLiveShareConfigRequest, GetLiveShareConfigResponse.class);
        }
    }
}
