package com.taobao.android.detail.sdk.request.coupon;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class BasicFetchCouponResult implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String retCode;
    public String retMsg;

    static {
        kge.a(-2042310568);
        kge.a(1028243835);
    }

    public BasicFetchCouponResult() {
        tpc.a("com.taobao.android.detail.sdk.request.coupon.BasicFetchCouponResult");
    }

    public boolean isSuccess() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6049a784", new Object[]{this})).booleanValue() : "SUCCESS".equals(this.retCode);
    }
}
