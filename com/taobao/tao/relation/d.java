package com.taobao.tao.relation;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;

/* loaded from: classes8.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue();
        }
        return String.valueOf(true).equals(OrangeConfig.getInstance().getConfig("relation-daifu", "isNavTransferOpen", String.valueOf(true)));
    }
}
