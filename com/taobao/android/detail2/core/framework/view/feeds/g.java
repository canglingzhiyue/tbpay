package com.taobao.android.detail2.core.framework.view.feeds;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.lnr;
import tb.moo;

/* loaded from: classes5.dex */
public class g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(655420141);
    }

    public static float a(com.taobao.android.detail2.core.framework.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f8b7147", new Object[]{bVar})).floatValue();
        }
        if ("vertical".equals(bVar.h().k().F)) {
            return bVar.h().K().a() - moo.b(bVar);
        }
        return lnr.d(bVar);
    }

    public static int b(com.taobao.android.detail2.core.framework.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1351769", new Object[]{bVar})).intValue();
        }
        if (!"vertical".equals(bVar.h().k().F)) {
            return lnr.a(bVar);
        }
        return -1;
    }
}
