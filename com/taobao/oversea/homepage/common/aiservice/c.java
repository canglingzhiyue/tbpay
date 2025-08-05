package com.taobao.oversea.homepage.common.aiservice;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes7.dex */
public class c extends a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.taobao.oversea.homepage.common.aiservice.a
    public String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : "mtop.taobao.wireless.home.newface.awesome.get";
    }

    @Override // com.taobao.oversea.homepage.common.aiservice.a
    public String d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[]{this}) : "1.0";
    }
}
