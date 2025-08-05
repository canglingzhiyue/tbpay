package com.taobao.search.common;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.noa;

/* loaded from: classes7.dex */
public class TBSearchApi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1094837076);
    }

    public static String getCurrentSVersion() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ba1c4b1", new Object[0]) : noa.SERVER_VERSION_VALUE;
    }
}
