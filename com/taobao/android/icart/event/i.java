package com.taobao.android.icart.event;

import com.alibaba.android.umbrella.trace.UmbrellaTracker;
import com.android.alibaba.ip.runtime.IpChange;
import tb.bca;
import tb.bdx;
import tb.bmz;
import tb.kge;

/* loaded from: classes5.dex */
public class i extends bca {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_PV_FEATURE = "enter.page";
    public static final String KEY_PV_VERSION = "1.0";
    public static final String TAG = "CartUndowngradeSubscriber";

    static {
        kge.a(1156403958);
    }

    @Override // com.alibaba.android.ultron.trade.event.d
    public void b(bmz bmzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d08b596a", new Object[]{this, bmzVar});
            return;
        }
        bdx.a(bmzVar);
        UmbrellaTracker.commitSuccessStability(KEY_PV_FEATURE, TAG, "1.0", "iCart", null, null);
    }
}
