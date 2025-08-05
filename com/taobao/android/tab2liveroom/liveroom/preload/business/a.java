package com.taobao.android.tab2liveroom.liveroom.preload.business;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.adapter.network.d;
import tb.kge;
import tb.ogg;

/* loaded from: classes6.dex */
public abstract class a implements d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-813953719);
        kge.a(-797454141);
    }

    @Override // com.taobao.taolive.sdk.adapter.network.d
    public void onError(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
            return;
        }
        ogg.a("NetWorkListenerImpl", "2.onError,i:" + i + " netResponse:" + netResponse + " o:" + obj);
    }

    @Override // com.taobao.taolive.sdk.adapter.network.d
    public void onSystemError(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
            return;
        }
        ogg.a("NetWorkListenerImpl", "2.onSystemError,i:" + i + " netResponse:" + netResponse + " o:" + obj);
    }
}
