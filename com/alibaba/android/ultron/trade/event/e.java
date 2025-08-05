package com.alibaba.android.ultron.trade.event;

import com.android.alibaba.ip.runtime.IpChange;
import tb.bmz;
import tb.kge;

/* loaded from: classes2.dex */
public class e extends d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(677993094);
    }

    @Override // com.alibaba.android.ultron.trade.event.d
    public void b(bmz bmzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d08b596a", new Object[]{this, bmzVar});
        } else {
            this.f.y().a(false);
        }
    }
}
