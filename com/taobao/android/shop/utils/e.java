package com.taobao.android.shop.utils;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.util.TBImageUrlStrategy;
import tb.kge;

/* loaded from: classes6.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1451424361);
    }

    public static String a(String str, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("75f5ebaf", new Object[]{str, new Integer(i)}) : TBImageUrlStrategy.getInstance().decideLowNetUrl(str, i, TBImageUrlStrategy.Area.shop, TBImageUrlStrategy.CutType.non);
    }
}
