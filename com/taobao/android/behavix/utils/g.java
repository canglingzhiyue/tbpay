package com.taobao.android.behavix.utils;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collection;
import java.util.Map;
import tb.kge;

/* loaded from: classes4.dex */
public class g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1504217636);
    }

    public static boolean a(Collection collection) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d2847c1d", new Object[]{collection})).booleanValue() : collection == null || collection.size() == 0;
    }

    public static boolean a(Map map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a421221", new Object[]{map})).booleanValue() : map == null || map.size() == 0;
    }
}
