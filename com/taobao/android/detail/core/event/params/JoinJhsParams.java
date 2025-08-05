package com.taobao.android.detail.core.event.params;

import java.io.Serializable;
import tb.emu;
import tb.eoj;
import tb.kge;

/* loaded from: classes4.dex */
public class JoinJhsParams implements Serializable {
    public String action;
    public com.taobao.android.detail.datasdk.event.params.a baseTradeParams;
    public String itemId;
    public eoj nextEvent;

    static {
        kge.a(-484897406);
        kge.a(1028243835);
    }

    public JoinJhsParams(String str, String str2, eoj eojVar, com.taobao.android.detail.datasdk.event.params.a aVar) {
        this.itemId = str;
        this.action = str2;
        this.nextEvent = eojVar;
        this.baseTradeParams = aVar;
        emu.a("com.taobao.android.detail.core.event.params.JoinJhsParams");
    }
}
