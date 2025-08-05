package com.taobao.taolive.sdk.business.sendmsg;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.d;
import com.taobao.taolive.sdk.business.b;
import com.taobao.taolive.sdk.utils.l;
import tb.kge;

/* loaded from: classes8.dex */
public class a extends b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1353873647);
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
        MtopTbliveLiveDetailSendUserAtmosphereRequest mtopTbliveLiveDetailSendUserAtmosphereRequest = new MtopTbliveLiveDetailSendUserAtmosphereRequest();
        mtopTbliveLiveDetailSendUserAtmosphereRequest.setLiveId(str);
        mtopTbliveLiveDetailSendUserAtmosphereRequest.setAnchorId(str2);
        mtopTbliveLiveDetailSendUserAtmosphereRequest.setTopic(str3);
        mtopTbliveLiveDetailSendUserAtmosphereRequest.setSubtype(l.b(str4));
        mtopTbliveLiveDetailSendUserAtmosphereRequest.setData(str5);
        a(1, mtopTbliveLiveDetailSendUserAtmosphereRequest, MtopTbliveLiveDetailSendUserAtmosphereResponse.class);
    }
}
