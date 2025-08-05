package com.taobao.android.detail.sdk.event.basic;

import android.net.Uri;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.trade.event.Event;
import java.util.Map;
import tb.ewy;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class i implements Event {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f10225a;
    public String b;
    public String c;
    public String d;

    static {
        kge.a(-1021557361);
        kge.a(-1834561497);
    }

    @Override // com.taobao.android.trade.event.Event
    public int getEventId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ce275619", new Object[]{this})).intValue() : ewy.T_BOTTOM_BAR_GRADIENT;
    }

    @Override // com.taobao.android.trade.event.Event
    public Object getParam() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("a5850f14", new Object[]{this});
        }
        return null;
    }

    public i(JSONObject jSONObject) {
        this.f10225a = "";
        this.b = "";
        this.c = "";
        this.d = "";
        if (jSONObject != null) {
            this.f10225a = com.taobao.android.detail.sdk.utils.c.a(jSONObject.getString("url"));
            this.b = com.taobao.android.detail.sdk.utils.c.a(jSONObject.getString("itemId"));
            this.c = com.taobao.android.detail.sdk.utils.c.a(jSONObject.getString("sellerId"));
            this.d = com.taobao.android.detail.sdk.utils.c.a(jSONObject.getString("shopId"));
            JSONObject jSONObject2 = jSONObject.getJSONObject("url_params");
            if (jSONObject2 != null) {
                Uri.Builder buildUpon = Uri.parse(this.f10225a).buildUpon();
                for (Map.Entry<String, Object> entry : jSONObject2.entrySet()) {
                    buildUpon.appendQueryParameter(entry.getKey(), entry.getValue().toString());
                }
                this.f10225a = buildUpon.toString();
            }
        }
        tpc.a("com.taobao.android.detail.sdk.event.basic.OpenCouponViewEvent");
    }
}
