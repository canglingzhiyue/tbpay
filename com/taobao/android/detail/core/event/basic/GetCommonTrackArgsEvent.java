package com.taobao.android.detail.core.event.basic;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.emu;
import tb.enn;
import tb.kge;

/* loaded from: classes4.dex */
public class GetCommonTrackArgsEvent extends enn implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public com.taobao.android.trade.event.c callback;
    public Object params;

    static {
        kge.a(-1918832488);
        kge.a(1028243835);
    }

    public GetCommonTrackArgsEvent() {
        emu.a("com.taobao.android.detail.core.event.basic.GetCommonTrackArgsEvent");
    }

    @Override // com.taobao.android.trade.event.Event
    public Object getParam() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("a5850f14", new Object[]{this}) : this.params;
    }
}
