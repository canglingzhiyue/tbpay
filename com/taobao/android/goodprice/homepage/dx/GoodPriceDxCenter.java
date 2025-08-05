package com.taobao.android.goodprice.homepage.dx;

import com.android.alibaba.ip.runtime.IpChange;
import tb.gmh;
import tb.gmi;
import tb.kge;

/* loaded from: classes5.dex */
public class GoodPriceDxCenter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1351307003);
    }

    public static gmi createGoodPriceDxRegistry(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (gmi) ipChange.ipc$dispatch("4926e491", new Object[]{str}) : new gmh(str);
    }
}
