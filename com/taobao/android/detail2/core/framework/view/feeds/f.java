package com.taobao.android.detail2.core.framework.view.feeds;

import com.android.alibaba.ip.runtime.IpChange;
import tb.fmd;
import tb.kge;
import tb.lnq;
import tb.mfh;

/* loaded from: classes5.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1659800668);
    }

    public static e a(fmd fmdVar, com.taobao.android.detail2.core.framework.b bVar, d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("ad7f931", new Object[]{fmdVar, bVar, dVar}) : "vertical".equals(bVar.h().k().F) ? new mfh(fmdVar, bVar, dVar) : new lnq(fmdVar, bVar, dVar);
    }
}
