package com.taobao.android.live.plugin.atype.flexalocal.comments.chat.net;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import tb.kge;

/* loaded from: classes5.dex */
public class PersonalityIntroResp extends NetBaseOutDo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public JSONObject data;

    static {
        kge.a(1762318984);
    }

    @Override // com.taobao.taolive.sdk.adapter.network.NetBaseOutDo
    /* renamed from: getData */
    public Object mo1437getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("4ca84d6b", new Object[]{this}) : this.data;
    }
}
