package com.taobao.tbliveinteractive.business.rank_module;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.d;
import com.taobao.taolive.sdk.business.b;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import tb.kge;

/* loaded from: classes8.dex */
public class a extends b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-2106509187);
    }

    public a(d dVar) {
        super(dVar);
    }

    public void a(VideoInfo videoInfo, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7065a63e", new Object[]{this, videoInfo, new Integer(i)});
        } else if (videoInfo == null || videoInfo.broadCaster == null) {
        } else {
            MtopMediaplatformLivedetailEntryRequest mtopMediaplatformLivedetailEntryRequest = new MtopMediaplatformLivedetailEntryRequest();
            mtopMediaplatformLivedetailEntryRequest.setType(i);
            mtopMediaplatformLivedetailEntryRequest.setLiveId(videoInfo.liveId);
            mtopMediaplatformLivedetailEntryRequest.setAccountId(videoInfo.broadCaster.accountId);
            a(0, mtopMediaplatformLivedetailEntryRequest, MtopMediaplatformLivedetailEntryResponse.class);
        }
    }
}
