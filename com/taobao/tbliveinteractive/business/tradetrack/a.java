package com.taobao.tbliveinteractive.business.tradetrack;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.d;
import tb.kge;

/* loaded from: classes8.dex */
public class a extends com.taobao.taolive.sdk.business.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1332462778);
    }

    public a(d dVar) {
        super(dVar);
    }

    public void a(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54b86a6e", new Object[]{this, str, str2, str3, str4, str5, str6, str7});
            return;
        }
        MtopContentlivekitComponentTradeTrackRequest mtopContentlivekitComponentTradeTrackRequest = new MtopContentlivekitComponentTradeTrackRequest();
        mtopContentlivekitComponentTradeTrackRequest.setLiveId(str);
        mtopContentlivekitComponentTradeTrackRequest.setItemId(str2);
        mtopContentlivekitComponentTradeTrackRequest.setSpmUrl(str3);
        mtopContentlivekitComponentTradeTrackRequest.setEntrySpm(str4);
        mtopContentlivekitComponentTradeTrackRequest.setLiveSource(str5);
        mtopContentlivekitComponentTradeTrackRequest.setEntryLiveSource(str6);
        mtopContentlivekitComponentTradeTrackRequest.setSign(str7);
        a(0, mtopContentlivekitComponentTradeTrackRequest, MtopContentlivekitComponentTradeTrackResponse.class);
    }
}
