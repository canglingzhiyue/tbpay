package com.taobao.android.icart.event;

import com.alibaba.android.icart.core.data.config.RequestConfig;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import tb.bca;
import tb.bdx;
import tb.bmz;
import tb.kge;

/* loaded from: classes5.dex */
public class f extends bca {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-531462897);
    }

    @Override // com.alibaba.android.ultron.trade.event.d
    public void b(bmz bmzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d08b596a", new Object[]{this, bmzVar});
            return;
        }
        bdx.a(bmzVar);
        HashMap hashMap = new HashMap();
        hashMap.put(RequestConfig.IS_POP_LAYE_RQUERY, "true");
        hashMap.put(RequestConfig.IS_POP_LAYER_FIRST_PAGE, "true");
        this.f25791a.b(true, hashMap, null);
    }
}
