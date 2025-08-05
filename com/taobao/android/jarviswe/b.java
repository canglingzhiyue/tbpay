package com.taobao.android.jarviswe;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.jarviswe.bean.EnvType;
import tb.kge;

/* loaded from: classes5.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1232963359);
    }

    public static void a(EnvType envType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4fdb686", new Object[]{envType});
        }
    }
}
