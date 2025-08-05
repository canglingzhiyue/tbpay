package com.taobao.phenix.compat.mtop;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes7.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static String a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9064aa65", new Object[]{new Integer(i)}) : i != 1 ? i != 2 ? i != 3 ? "unknown" : "low" : "medium" : "high";
    }
}
