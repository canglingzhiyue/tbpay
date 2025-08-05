package com.taobao.live.home;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.proxy.f;

/* loaded from: classes7.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PLAY_PAGEID = "taolivehomepage";
    public static final String PLAY_SUBBUSINESS_TYPE = "LiveCard";

    public static String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[0]) : f.z().getDXAppVersion();
    }
}
