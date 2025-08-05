package com.taobao.tbliveinteractive.business.intimacy;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.d;
import com.taobao.taolive.sdk.business.b;
import com.taobao.tbliveinteractive.view.system_component.IntimacyParams;
import tb.kge;

/* loaded from: classes8.dex */
public class a extends b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1580773126);
    }

    public a(d dVar) {
        super(dVar);
    }

    public void a(IntimacyParams intimacyParams, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e3264a7", new Object[]{this, intimacyParams, str});
            return;
        }
        int i = intimacyParams.roomType;
        String str2 = intimacyParams.accountId;
        String str3 = intimacyParams.liveId;
        boolean z = intimacyParams.follow;
        boolean z2 = intimacyParams.shopVip;
        boolean z3 = intimacyParams.shopHasVip;
        MtopTaobaoGiuliaIntimacyQueryLiveRequest mtopTaobaoGiuliaIntimacyQueryLiveRequest = new MtopTaobaoGiuliaIntimacyQueryLiveRequest();
        mtopTaobaoGiuliaIntimacyQueryLiveRequest.setAPI_NAME("mtop.taobao.giulia.intimacy.query.live");
        mtopTaobaoGiuliaIntimacyQueryLiveRequest.setBizCode("live");
        mtopTaobaoGiuliaIntimacyQueryLiveRequest.setInvokeType("native");
        mtopTaobaoGiuliaIntimacyQueryLiveRequest.setRoomType(i);
        mtopTaobaoGiuliaIntimacyQueryLiveRequest.setSource(intimacyParams.liveSource);
        mtopTaobaoGiuliaIntimacyQueryLiveRequest.setTargetUid(str2);
        mtopTaobaoGiuliaIntimacyQueryLiveRequest.setShowCodes(str);
        mtopTaobaoGiuliaIntimacyQueryLiveRequest.setLiveId(str3);
        mtopTaobaoGiuliaIntimacyQueryLiveRequest.setFollow(z);
        mtopTaobaoGiuliaIntimacyQueryLiveRequest.setSpm(intimacyParams.spm);
        mtopTaobaoGiuliaIntimacyQueryLiveRequest.member = z2;
        mtopTaobaoGiuliaIntimacyQueryLiveRequest.hasMember = z3;
        a(0, mtopTaobaoGiuliaIntimacyQueryLiveRequest, MtopTaobaoGiuliaIntimacyQueryLiveResponse.class);
    }
}
