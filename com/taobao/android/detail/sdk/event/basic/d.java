package com.taobao.android.detail.sdk.event.basic;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.trade.event.Event;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class d implements Event {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1883508715);
        kge.a(-1834561497);
    }

    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        return null;
    }

    @Override // com.taobao.android.trade.event.Event
    public int getEventId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ce275619", new Object[]{this})).intValue();
        }
        return 27002;
    }

    @Override // com.taobao.android.trade.event.Event
    public /* synthetic */ Object getParam() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("a5850f14", new Object[]{this}) : a();
    }

    public d() {
        tpc.a("com.taobao.android.detail.sdk.event.basic.GetOCRManagerEvent");
    }
}
