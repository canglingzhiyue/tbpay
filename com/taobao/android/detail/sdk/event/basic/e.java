package com.taobao.android.detail.sdk.event.basic;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.trade.event.Event;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class e implements Event {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f10222a;
    public com.taobao.android.detail.sdk.utils.ocr.b b;

    static {
        kge.a(-1508944961);
        kge.a(-1834561497);
    }

    @Override // com.taobao.android.trade.event.Event
    public int getEventId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ce275619", new Object[]{this})).intValue();
        }
        return 27001;
    }

    @Override // com.taobao.android.trade.event.Event
    public /* synthetic */ Object getParam() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("a5850f14", new Object[]{this}) : a();
    }

    public e(com.taobao.android.detail.sdk.utils.ocr.b bVar, boolean z) {
        this.f10222a = false;
        this.b = bVar;
        this.f10222a = z;
        tpc.a("com.taobao.android.detail.sdk.event.basic.GetOCRResultEvent");
    }

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : new Boolean(this.f10222a).toString();
    }
}
