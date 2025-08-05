package com.taobao.android.live.plugin.atype.flexalocal.good.business.getCoupon;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.d;
import tb.kge;

/* loaded from: classes4.dex */
public class a extends com.taobao.taolive.sdk.business.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(366402496);
    }

    public a(d dVar) {
        super(dVar);
    }

    public void a(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else if (jSONObject == null || (jSONObject2 = jSONObject.getJSONObject("detailInfo")) == null) {
        } else {
            GetCouponRequest getCouponRequest = new GetCouponRequest();
            getCouponRequest.supplierId = jSONObject2.getString("supplierId");
            getCouponRequest.uuid = jSONObject2.getString("uuid");
            getCouponRequest.couponInstanceSource = jSONObject2.getString("couponInstanceSource");
            getCouponRequest.querySource = jSONObject2.getString("querySource");
            a(1, getCouponRequest, GetCouponResponse.class);
        }
    }
}
