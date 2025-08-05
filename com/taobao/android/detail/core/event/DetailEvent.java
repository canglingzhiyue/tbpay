package com.taobao.android.detail.core.event;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.trade.event.c;
import java.io.Serializable;
import tb.emu;
import tb.enn;
import tb.kge;

/* loaded from: classes4.dex */
public class DetailEvent extends enn implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int EVENT_TYPE_CHECK_REMIND = 3;
    public static final int EVENT_TYPE_CLOSE_BIG_GALLERY = 1;
    public static final int EVENT_TYPE_HAS_CLOSED_BIG_GALLERY = 2;
    public c callback;
    private int eventType;
    public Object params;

    static {
        kge.a(-240686129);
        kge.a(1028243835);
    }

    public DetailEvent(int i) {
        this.eventType = i;
        emu.a("com.taobao.android.detail.core.event.DetailEvent");
    }

    public int getEventType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("23373fb8", new Object[]{this})).intValue() : this.eventType;
    }

    @Override // com.taobao.android.trade.event.Event
    public Object getParam() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("a5850f14", new Object[]{this}) : this.params;
    }
}
