package com.taobao.android.detail.wrapper.ext.event;

import com.android.alibaba.ip.runtime.IpChange;
import tb.emu;
import tb.enn;
import tb.kge;

/* loaded from: classes5.dex */
public class c extends enn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1519930221);
    }

    @Override // com.taobao.android.trade.event.Event
    public Object getParam() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("a5850f14", new Object[]{this});
        }
        return null;
    }

    public c() {
        emu.a("com.taobao.android.detail.wrapper.ext.event.AllVideosPauseEvent");
    }
}
