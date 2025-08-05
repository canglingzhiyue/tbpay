package com.taobao.tbliveinteractive.business.tradetrack.sign;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.d;
import com.taobao.taolive.sdk.business.b;
import tb.kge;

/* loaded from: classes8.dex */
public class a extends b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(858772771);
    }

    public a(d dVar) {
        super(dVar);
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        MtopContentlivekitComponentTradeSignRequest mtopContentlivekitComponentTradeSignRequest = new MtopContentlivekitComponentTradeSignRequest();
        mtopContentlivekitComponentTradeSignRequest.setLiveId(str);
        a(0, mtopContentlivekitComponentTradeSignRequest, MtopContentlivekitComponentTradeSignResponse.class);
    }
}
