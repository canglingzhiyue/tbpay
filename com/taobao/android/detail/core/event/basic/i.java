package com.taobao.android.detail.core.event.basic;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.emu;
import tb.enn;
import tb.kge;

/* loaded from: classes4.dex */
public class i extends enn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f9704a;
    public String b;

    static {
        kge.a(-1753808411);
    }

    public i(JSONObject jSONObject) {
        emu.a("com.taobao.android.detail.core.event.basic.LocalRefreshDataEvent");
        if (jSONObject == null || jSONObject.isEmpty()) {
        }
    }

    @Override // com.taobao.android.trade.event.Event
    public Object getParam() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("a5850f14", new Object[]{this}) : this.f9704a;
    }
}
