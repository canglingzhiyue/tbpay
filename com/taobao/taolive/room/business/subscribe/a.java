package com.taobao.taolive.room.business.subscribe;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.d;
import com.taobao.taolive.sdk.business.b;
import tb.kge;

/* loaded from: classes8.dex */
public class a extends b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1194538666);
    }

    public a(d dVar) {
        super(dVar);
    }

    public void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
            return;
        }
        VideoSubscribeRequest videoSubscribeRequest = new VideoSubscribeRequest();
        videoSubscribeRequest.accountId = j;
        a(0, videoSubscribeRequest, VideoSubscribeResponse.class);
    }
}
