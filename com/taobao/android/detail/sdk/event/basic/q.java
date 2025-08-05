package com.taobao.android.detail.sdk.event.basic;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.evl;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class q extends evl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f10235a;

    static {
        kge.a(-1515925055);
    }

    @Override // com.taobao.android.trade.event.Event
    public int getEventId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ce275619", new Object[]{this})).intValue();
        }
        return 20042;
    }

    public q(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.f10235a = jSONObject.getString("url");
        }
        tpc.a("com.taobao.android.detail.sdk.event.basic.OpenTmallAppEvent");
    }

    @Override // tb.evl, com.taobao.android.trade.event.Event
    public Object getParam() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("a5850f14", new Object[]{this}) : this.f10235a;
    }
}
