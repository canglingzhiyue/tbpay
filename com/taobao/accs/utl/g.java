package com.taobao.accs.utl;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes.dex */
public class g extends n {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1880025882);
    }

    @Override // com.taobao.accs.utl.n
    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        String emuiVersion = UtilityImpl.getEmuiVersion();
        return (emuiVersion != null || this.f8314a == null) ? emuiVersion : this.f8314a.a();
    }
}
