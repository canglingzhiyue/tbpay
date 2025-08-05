package com.taobao.android.live.plugin.atype.flexalocal.bottom.control.reward.net;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.d;
import com.taobao.taolive.sdk.business.b;
import tb.kge;

/* loaded from: classes5.dex */
public class a extends b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1243632719);
    }

    public a(d dVar) {
        super(dVar);
    }

    public void a(String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9b9da5a", new Object[]{this, str, str2, str3, str4, str5});
            return;
        }
        RewardGiftEnterRequest rewardGiftEnterRequest = new RewardGiftEnterRequest();
        rewardGiftEnterRequest.liveId = str;
        rewardGiftEnterRequest.encodeAnchorId = str2;
        rewardGiftEnterRequest.rewardSourceLiveId = str3;
        rewardGiftEnterRequest.giftId = str4;
        rewardGiftEnterRequest.senderNick = str5;
        a(0, rewardGiftEnterRequest, NetBaseOutDo.class);
    }
}
