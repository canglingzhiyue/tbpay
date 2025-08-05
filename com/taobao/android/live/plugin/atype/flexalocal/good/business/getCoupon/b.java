package com.taobao.android.live.plugin.atype.flexalocal.good.business.getCoupon;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.adapter.network.d;
import com.taobao.taolive.sdk.model.common.LiveItem;
import java.util.HashMap;
import tb.hir;
import tb.his;
import tb.hit;
import tb.hix;
import tb.kge;

/* loaded from: classes4.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-280810578);
    }

    public static /* synthetic */ void a(Context context, NetResponse netResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8612bdbb", new Object[]{context, netResponse});
        } else {
            b(context, netResponse);
        }
    }

    public static void a(c cVar, final Context context, final JSONObject jSONObject, LiveItem liveItem, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f82c3e1c", new Object[]{cVar, context, jSONObject, liveItem, str});
            return;
        }
        new a(new d() { // from class: com.taobao.android.live.plugin.atype.flexalocal.good.business.getCoupon.b.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taolive.sdk.adapter.network.d
            public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
                JSONObject jSONObject2;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
                    return;
                }
                JSONObject jSONObject3 = JSONObject.this;
                String string = (jSONObject3 == null || (jSONObject2 = jSONObject3.getJSONObject("detailInfo")) == null) ? "领取成功" : jSONObject2.getString("couponThresholdTip");
                hix.a(context, string);
                his.a("GetCouponHelper", "onSuccess | toastString=" + string);
            }

            @Override // com.taobao.taolive.sdk.adapter.network.d
            public void onError(int i, NetResponse netResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
                } else {
                    b.a(context, netResponse);
                }
            }

            @Override // com.taobao.taolive.sdk.adapter.network.d
            public void onSystemError(int i, NetResponse netResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
                } else {
                    b.a(context, netResponse);
                }
            }
        }).a(jSONObject);
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("service_mark", "officialCoupon");
        hashMap.putAll(hit.a(cVar, liveItem));
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("clickSource", str);
        }
        if (com.taobao.android.live.plugin.atype.flexalocal.good.a.a().j() == null) {
            return;
        }
        com.taobao.android.live.plugin.atype.flexalocal.good.a.a().j().a("ServiceMark", hashMap);
    }

    private static void b(Context context, NetResponse netResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4c427da", new Object[]{context, netResponse});
            return;
        }
        String str = "活动太火爆了，请稍后再试";
        if (hir.n() && netResponse != null && !TextUtils.isEmpty(netResponse.getRetCode()) && netResponse.getRetCode().startsWith("FAIL_BIZ_") && !TextUtils.isEmpty(netResponse.getRetMsg())) {
            str = netResponse.getRetMsg();
        }
        hix.a(context, str);
        StringBuilder sb = new StringBuilder();
        sb.append("onError | code=");
        sb.append(netResponse == null ? "" : netResponse.getRetCode());
        sb.append("  toastMsg=");
        sb.append(str);
        his.a("GetCouponHelper", sb.toString());
    }
}
