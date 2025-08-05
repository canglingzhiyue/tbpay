package com.taobao.taolive.room.utils;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collection;
import java.util.Map;
import tb.kge;

/* loaded from: classes8.dex */
public class at {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1640938091);
    }

    public static boolean a(Collection collection) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d2847c1d", new Object[]{collection})).booleanValue() : collection == null || collection.isEmpty();
    }

    public static boolean a(Map map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a421221", new Object[]{map})).booleanValue() : map == null || map.isEmpty();
    }
}
