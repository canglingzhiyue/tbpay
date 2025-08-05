package com.taobao.android.live.plugin.atype.flexalocal.good.business.getCoupon;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import tb.kge;

/* loaded from: classes4.dex */
public class GetCouponResponse extends NetBaseOutDo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public GetCouponResponseData data;

    /* loaded from: classes4.dex */
    public static class GetCouponResponseData implements INetDataObject {
        public boolean error;

        static {
            kge.a(-1069048700);
            kge.a(-540945145);
        }
    }

    static {
        kge.a(1172910145);
    }

    @Override // com.taobao.taolive.sdk.adapter.network.NetBaseOutDo
    /* renamed from: getData */
    public GetCouponResponseData mo1437getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (GetCouponResponseData) ipChange.ipc$dispatch("2eaecad4", new Object[]{this}) : this.data;
    }
}
