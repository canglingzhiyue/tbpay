package com.taobao.taobao.wxapi;

import com.android.alibaba.ip.runtime.IpChange;
import tb.jqm;

/* loaded from: classes8.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[0]) : (!jqm.a() || !com.taobao.taobao.utils.a.b()) ? "wxbe3521a0fad2fe85" : "wx125d18983381f37e";
    }
}
