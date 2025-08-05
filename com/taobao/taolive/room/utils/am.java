package com.taobao.taolive.room.utils;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.proxy.gift.IGiftProxy;
import tb.kge;

/* loaded from: classes8.dex */
public class am {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1669932995);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : (com.taobao.android.live.plugin.proxy.c.a().e() == null || com.taobao.android.live.plugin.proxy.c.a().e().get(IGiftProxy.KEY) == null) ? false : true;
    }
}
