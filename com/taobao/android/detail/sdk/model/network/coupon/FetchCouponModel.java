package com.taobao.android.detail.sdk.model.network.coupon;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class FetchCouponModel implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String retCode;
    public String retMsg;

    static {
        kge.a(-1434240725);
        kge.a(1028243835);
    }

    public FetchCouponModel() {
        tpc.a("com.taobao.android.detail.sdk.model.network.coupon.FetchCouponModel");
    }

    public boolean isSuccess() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6049a784", new Object[]{this})).booleanValue() : "SUCCESS".equals(this.retCode);
    }
}
