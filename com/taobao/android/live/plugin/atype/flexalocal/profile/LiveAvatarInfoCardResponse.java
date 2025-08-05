package com.taobao.android.live.plugin.atype.flexalocal.profile;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import tb.kge;

/* loaded from: classes6.dex */
public class LiveAvatarInfoCardResponse extends NetBaseOutDo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private LiveAvatarInfoCardResponseData data;

    static {
        kge.a(-1421029194);
    }

    @Override // com.taobao.taolive.sdk.adapter.network.NetBaseOutDo
    /* renamed from: getData */
    public LiveAvatarInfoCardResponseData mo1437getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LiveAvatarInfoCardResponseData) ipChange.ipc$dispatch("6920017e", new Object[]{this}) : this.data;
    }

    public void setData(LiveAvatarInfoCardResponseData liveAvatarInfoCardResponseData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a813ce2", new Object[]{this, liveAvatarInfoCardResponseData});
        } else {
            this.data = liveAvatarInfoCardResponseData;
        }
    }
}
