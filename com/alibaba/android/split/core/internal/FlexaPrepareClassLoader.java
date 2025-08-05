package com.alibaba.android.split.core.internal;

import com.alibaba.android.split.q;
import com.android.alibaba.ip.runtime.IpChange;
import tb.bgy;
import tb.kge;

/* loaded from: classes2.dex */
public class FlexaPrepareClassLoader {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-621288652);
    }

    public static void tryLoad(q qVar, bgy bgyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6af8595a", new Object[]{qVar, bgyVar});
            return;
        }
        try {
            String b = qVar.b();
            Class.forName(bgyVar.t().getPackageName() + "." + b + ".R", false, FlexaPrepareClassLoader.class.getClassLoader());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
