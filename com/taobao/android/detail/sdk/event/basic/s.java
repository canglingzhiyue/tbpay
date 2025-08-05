package com.taobao.android.detail.sdk.event.basic;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.trade.event.Event;
import com.taobao.tao.flexbox.layoutmanager.container.dx.DxContainerActivity;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class s implements Event {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public com.taobao.android.detail.sdk.event.params.d f10237a;
    public JSONObject b;

    static {
        kge.a(1989948384);
        kge.a(-1834561497);
    }

    @Override // com.taobao.android.trade.event.Event
    public int getEventId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ce275619", new Object[]{this})).intValue();
        }
        return 20013;
    }

    @Override // com.taobao.android.trade.event.Event
    public Object getParam() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("a5850f14", new Object[]{this});
        }
        return null;
    }

    public s(JSONObject jSONObject) {
        tpc.a("com.taobao.android.detail.sdk.event.basic.OpenWangxinEvent");
        if (jSONObject == null || !jSONObject.containsKey(DxContainerActivity.PARAMS_URL_BUSINESS_PARAMS)) {
            return;
        }
        this.b = jSONObject.getJSONObject(DxContainerActivity.PARAMS_URL_BUSINESS_PARAMS);
        String a2 = com.taobao.android.detail.sdk.utils.c.a(this.b.getString("nick"));
        String a3 = com.taobao.android.detail.sdk.utils.c.a(this.b.getString("itemid"));
        String a4 = com.taobao.android.detail.sdk.utils.c.a(this.b.getString("shopId"));
        String a5 = com.taobao.android.detail.sdk.utils.c.a(this.b.getString("saleCount"));
        this.f10237a = new com.taobao.android.detail.sdk.event.params.d(a2, a3, a4);
        try {
            this.f10237a.d = Integer.parseInt(a5);
        } catch (Exception unused) {
        }
    }
}
