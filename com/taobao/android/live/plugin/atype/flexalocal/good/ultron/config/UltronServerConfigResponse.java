package com.taobao.android.live.plugin.atype.flexalocal.good.ultron.config;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import tb.kge;

/* loaded from: classes3.dex */
public class UltronServerConfigResponse extends NetBaseOutDo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public ServerConfigs data;

    static {
        kge.a(-1334126222);
    }

    @Override // com.taobao.taolive.sdk.adapter.network.NetBaseOutDo
    /* renamed from: getData */
    public ServerConfigs mo1437getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ServerConfigs) ipChange.ipc$dispatch("67b579e8", new Object[]{this}) : this.data;
    }
}
