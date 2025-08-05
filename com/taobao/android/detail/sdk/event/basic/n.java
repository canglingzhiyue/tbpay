package com.taobao.android.detail.sdk.event.basic;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.sdk.model.node.NodeBundle;
import tb.evl;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class n extends evl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f10231a;
    public String b;
    public String c;
    public String d;
    public JSONObject e;

    static {
        kge.a(-681552511);
    }

    @Override // com.taobao.android.trade.event.Event
    public int getEventId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ce275619", new Object[]{this})).intValue();
        }
        return 20046;
    }

    @Override // tb.evl, com.taobao.android.trade.event.Event
    public Object getParam() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("a5850f14", new Object[]{this});
        }
        return null;
    }

    public n(JSONObject jSONObject, NodeBundle nodeBundle) {
        this.f10231a = "detail";
        tpc.a("com.taobao.android.detail.sdk.event.basic.OpenRedPacketEvent");
        if (jSONObject == null && nodeBundle == null) {
            return;
        }
        this.b = jSONObject.getString("activityId");
        this.f10231a = jSONObject.getString("channel");
        this.c = jSONObject.getString("umidToken");
        this.d = jSONObject.getString("asac");
        this.e = jSONObject;
    }
}
