package com.alibaba.android.icart.core.event;

import com.android.alibaba.ip.runtime.IpChange;
import tb.bca;
import tb.bmz;
import tb.kge;

/* loaded from: classes2.dex */
public class ah extends bca {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1246554070);
    }

    @Override // com.alibaba.android.ultron.trade.event.d
    public void b(bmz bmzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d08b596a", new Object[]{this, bmzVar});
        } else {
            this.f25791a.x().a(false);
        }
    }
}
