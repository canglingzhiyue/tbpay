package com.taobao.android.fluid.framework.hostcontainer.tnode.component;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import tb.kge;
import tb.oeb;
import tb.spj;
import tb.spz;

/* loaded from: classes5.dex */
public final class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-972569186);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : FluidSDK.getRemoteConfigAdapter().getOrangeBooleanConfig("enableUseEngineJudgeAppInBackground", true);
    }

    public static boolean a(boolean z, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f7197a3a", new Object[]{new Boolean(z), str})).booleanValue() : spj.a() && z && !StringUtils.equals("outside", str);
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : FluidSDK.getRemoteConfigAdapter().getOrangeBooleanConfig("enableResetPreloadArgs", true);
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue() : FluidSDK.getRemoteConfigAdapter().getOrangeBooleanConfig("enableAdaptVirtualNavigationBar", true);
    }

    public static boolean a(boolean z) {
        IpChange ipChange = $ipChange;
        boolean z2 = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821d370", new Object[]{new Boolean(z)})).booleanValue();
        }
        if (z && oeb.a("ShortVideo.enableTab3PreBuildController", true)) {
            z2 = true;
        }
        spz.c("TBVideoListComponentConfig", "PickPreloadControllerNew,enableTab3PreBuildController:" + z2 + ",isDefalutTab3:" + z);
        return z2;
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[0])).booleanValue() : oeb.a("ShortVideo.enableRelayoutForVirtualNavigationBar", true);
    }
}
