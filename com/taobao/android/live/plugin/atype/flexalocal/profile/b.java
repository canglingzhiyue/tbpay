package com.taobao.android.live.plugin.atype.flexalocal.profile;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.d;
import tb.kge;

/* loaded from: classes6.dex */
public class b extends com.taobao.taolive.sdk.business.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(2067430453);
    }

    public b(d dVar) {
        super(dVar);
    }

    public void a(long j, long j2, String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9068658", new Object[]{this, new Long(j), new Long(j2), str, str2, new Boolean(z)});
            return;
        }
        LiveAvatarInfoCardRequest liveAvatarInfoCardRequest = new LiveAvatarInfoCardRequest();
        liveAvatarInfoCardRequest.liveId = j;
        liveAvatarInfoCardRequest.anchorId = j2;
        liveAvatarInfoCardRequest.encodeAccountId = str;
        liveAvatarInfoCardRequest.sourceType = str2;
        liveAvatarInfoCardRequest.isPublic = z;
        a(0, liveAvatarInfoCardRequest, LiveAvatarInfoCardResponse.class);
    }
}
