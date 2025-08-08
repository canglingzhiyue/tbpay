package com.taobao.android.detail.sdk.event.basic;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.trade.event.Event;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class g implements Event {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f10223a;
    public JSONObject b;

    static {
        kge.a(945007584);
        kge.a(-1834561497);
    }

    @Override // com.taobao.android.trade.event.Event
    public int getEventId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ce275619", new Object[]{this})).intValue();
        }
        return 20047;
    }

    @Override // com.taobao.android.trade.event.Event
    public Object getParam() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("a5850f14", new Object[]{this});
        }
        return null;
    }

    public g(JSONObject jSONObject) {
        if (!StringUtils.isEmpty(jSONObject.getString("url"))) {
            this.f10223a = jSONObject.getString("url");
        } else {
            this.f10223a = "";
        }
        if (!StringUtils.isEmpty(jSONObject.getString("params"))) {
            this.b = jSONObject.getJSONObject("params");
        } else {
            this.b = new JSONObject();
        }
        tpc.a("com.taobao.android.detail.sdk.event.basic.OpenCommonFloatWeexDialogEvent");
    }
}
