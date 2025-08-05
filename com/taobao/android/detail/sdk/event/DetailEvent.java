package com.taobao.android.detail.sdk.event;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.trade.event.Event;
import com.taobao.android.trade.event.c;
import java.io.Serializable;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class DetailEvent implements Event, Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public c callback;
    public int eventId;
    public Object params;

    static {
        kge.a(-297570508);
        kge.a(-1834561497);
        kge.a(1028243835);
    }

    public DetailEvent() {
        tpc.a("com.taobao.android.detail.sdk.event.DetailEvent");
    }

    @Override // com.taobao.android.trade.event.Event
    public int getEventId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ce275619", new Object[]{this})).intValue() : this.eventId;
    }

    @Override // com.taobao.android.trade.event.Event
    public Object getParam() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("a5850f14", new Object[]{this}) : this.params;
    }
}
