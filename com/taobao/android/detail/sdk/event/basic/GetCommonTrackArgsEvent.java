package com.taobao.android.detail.sdk.event.basic;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.sdk.event.DetailEvent;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class GetCommonTrackArgsEvent extends DetailEvent {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1050330301);
    }

    @Override // com.taobao.android.detail.sdk.event.DetailEvent, com.taobao.android.trade.event.Event
    public int getEventId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ce275619", new Object[]{this})).intValue();
        }
        return 20023;
    }

    public GetCommonTrackArgsEvent() {
        tpc.a("com.taobao.android.detail.sdk.event.basic.GetCommonTrackArgsEvent");
    }
}
