package com.taobao.android.detail.core.event.video;

import com.android.alibaba.ip.runtime.IpChange;
import tb.emu;
import tb.enn;
import tb.kge;

/* loaded from: classes4.dex */
public class j extends enn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-120564820);
    }

    @Override // com.taobao.android.trade.event.Event
    public Object getParam() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("a5850f14", new Object[]{this});
        }
        return null;
    }

    public j() {
        emu.a("com.taobao.android.detail.core.event.video.VideoExitPopDialogEvent");
    }
}
