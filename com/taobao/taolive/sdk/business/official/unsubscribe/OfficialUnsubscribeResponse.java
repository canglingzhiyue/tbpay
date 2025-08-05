package com.taobao.taolive.sdk.business.official.unsubscribe;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import org.json.JSONObject;
import tb.kge;

/* loaded from: classes8.dex */
public class OfficialUnsubscribeResponse extends NetBaseOutDo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private JSONObject data;

    static {
        kge.a(1885189003);
    }

    @Override // com.taobao.taolive.sdk.adapter.network.NetBaseOutDo
    /* renamed from: getData  reason: collision with other method in class */
    public JSONObject mo1437getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("54c56415", new Object[]{this}) : this.data;
    }

    public void setData(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f6fa1eb", new Object[]{this, jSONObject});
        } else {
            this.data = jSONObject;
        }
    }
}
