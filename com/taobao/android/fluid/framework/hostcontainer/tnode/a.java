package com.taobao.android.fluid.framework.hostcontainer.tnode;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import tb.kge;

/* loaded from: classes5.dex */
public final class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1972662937);
    }

    public static int a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f3a64c25", new Object[]{str})).intValue() : (StringUtils.isEmpty(str) || !str.equals("localFirst")) ? 1 : 0;
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : FluidSDK.getRemoteConfigAdapter().getOrangeBooleanConfig("enablePauseOrResumeTNodeEngine", true);
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : FluidSDK.getRemoteConfigAdapter().getOrangeBooleanConfig("enablePauseOrResumeTNodeEngineAppear", true);
    }
}
