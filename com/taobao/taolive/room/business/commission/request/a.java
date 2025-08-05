package com.taobao.taolive.room.business.commission.request;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.d;
import com.taobao.taolive.sdk.business.b;
import tb.kge;

/* loaded from: classes8.dex */
public class a extends b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1638316737);
    }

    public a(d dVar) {
        super(dVar);
    }

    public void a(String str, String str2, JSONObject jSONObject, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73244fd2", new Object[]{this, str, str2, jSONObject, str3, str4, str5});
            return;
        }
        OuterTraceRequest outerTraceRequest = new OuterTraceRequest();
        outerTraceRequest.fromType = str;
        outerTraceRequest.liveId = str2;
        outerTraceRequest.context = jSONObject;
        outerTraceRequest.entryLiveSource = str3;
        outerTraceRequest.actionSource = str4;
        outerTraceRequest.liveSource = str5;
        a(0, outerTraceRequest, OuterTraceResponse.class);
    }
}
