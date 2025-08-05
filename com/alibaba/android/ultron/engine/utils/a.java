package com.alibaba.android.ultron.engine.utils;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collection;
import tb.kge;

/* loaded from: classes2.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-26477566);
    }

    public static boolean a(Collection<?> collection) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d2847c1d", new Object[]{collection})).booleanValue() : collection == null || collection.isEmpty();
    }
}
