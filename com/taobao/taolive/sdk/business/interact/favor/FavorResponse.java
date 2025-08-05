package com.taobao.taolive.sdk.business.interact.favor;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.model.interact.FavorDO;
import tb.kge;

/* loaded from: classes8.dex */
public class FavorResponse extends NetBaseOutDo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private FavorDO data;

    static {
        kge.a(-1494117413);
    }

    @Override // com.taobao.taolive.sdk.adapter.network.NetBaseOutDo
    /* renamed from: getData */
    public FavorDO mo1437getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FavorDO) ipChange.ipc$dispatch("8974a979", new Object[]{this}) : this.data;
    }

    public void setData(FavorDO favorDO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3c8050f", new Object[]{this, favorDO});
        } else {
            this.data = favorDO;
        }
    }
}
