package com.taobao.android.detail.sdk.event.params;

import java.io.Serializable;
import tb.evt;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class JoinJhsParams implements Serializable {
    public String action;
    public a baseTradeParams;
    public String itemId;
    public evt nextEvent;

    static {
        kge.a(-1823863875);
        kge.a(1028243835);
    }

    public JoinJhsParams(String str, String str2, evt evtVar, a aVar) {
        this.itemId = str;
        this.action = str2;
        this.nextEvent = evtVar;
        this.baseTradeParams = aVar;
        tpc.a("com.taobao.android.detail.sdk.event.params.JoinJhsParams");
    }
}
