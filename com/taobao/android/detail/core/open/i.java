package com.taobao.android.detail.core.open;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import tb.kge;

/* loaded from: classes4.dex */
public class i {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(33065726);
    }

    public static <T extends DetailCoreActivity> g a(T t, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("78eb297", new Object[]{t, aVar});
        }
        g a2 = n.a(t);
        if (a2 != null) {
            return a2;
        }
        h hVar = new h(t, aVar);
        n.a(t, hVar);
        return hVar;
    }
}
