package com.taobao.android.upp;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String GATEWAY = "gateway";
    public static final String OFF = "off";
    public static final String ORANGE = "orange";

    static {
        kge.a(1280731339);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : !StringUtils.equals("off", b()) && com.taobao.android.behavix.d.e();
    }

    public static String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[0]) : com.taobao.android.behavix.behavixswitch.a.a("uppMode", "gateway");
    }
}
