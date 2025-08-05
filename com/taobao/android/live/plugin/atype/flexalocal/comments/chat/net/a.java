package com.taobao.android.live.plugin.atype.flexalocal.comments.chat.net;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.d;
import com.taobao.taolive.sdk.business.b;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import tb.kge;

/* loaded from: classes5.dex */
public class a extends b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1414782344);
    }

    public a(d dVar) {
        super(dVar);
    }

    public void a(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd977ce1", new Object[]{this, tBLiveDataModel});
            return;
        }
        PersonalityIntroRequest personalityIntroRequest = new PersonalityIntroRequest();
        personalityIntroRequest.anchorId = tBLiveDataModel.mVideoInfo.broadCaster.accountId;
        personalityIntroRequest.liveId = tBLiveDataModel.mVideoInfo.liveId;
        personalityIntroRequest.topic = tBLiveDataModel.mVideoInfo.topic;
        a(0, personalityIntroRequest, PersonalityIntroResp.class);
    }
}
