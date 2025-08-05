package com.taobao.taolive.taolivemorelive.morelive.business;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.d;
import com.taobao.taolive.sdk.business.b;
import com.taobao.taolive.sdk.controller.k;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.VideoInfo;

/* loaded from: classes8.dex */
public class a extends b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public a(d dVar) {
        super(dVar);
    }

    public void a(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd977ce1", new Object[]{this, tBLiveDataModel});
            return;
        }
        TabMenuRequest tabMenuRequest = new TabMenuRequest();
        VideoInfo a2 = k.a(tBLiveDataModel);
        if (a2 == null || a2.broadCaster == null) {
            return;
        }
        tabMenuRequest.setAnchorId(a2.broadCaster.accountId);
        tabMenuRequest.setLiveId(a2.liveId);
        tabMenuRequest.setUseWelfareCenterEntry("true");
        a(1, tabMenuRequest, (Class<?>) null);
    }
}
