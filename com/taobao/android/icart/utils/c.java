package com.taobao.android.icart.utils;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.jpo;
import tb.kge;

/* loaded from: classes5.dex */
public final class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-48232445);
    }

    public static void a(Context context, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c6c26e0", new Object[]{context, new Boolean(z), new Boolean(z2)});
            return;
        }
        jpo b = jpo.b(context);
        b.a("apmClientBeforeNetworkLogicProcess", false, (Map<String, String>) null);
        b.a("apmClientNetwork", (String) null);
        if (z) {
            b.a("apmClientNetwork", false, (Map<String, String>) null);
        }
        b.a("apmClientAfterNetworkLogicProcess", (String) null);
        if (!z || !z2) {
            return;
        }
        b.a("apmClientAfterNetworkLogicProcess", false, (Map<String, String>) null);
        b.a("apmClientUltronProcess", "apmClientAfterNetworkLogicProcess");
        b.a("apmClientUltronProcess", false, (Map<String, String>) null);
    }
}
