package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.mute.helper.f;

/* loaded from: classes5.dex */
public final class sie {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(880251949);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : b();
    }

    public static void a(FluidContext fluidContext, sic sicVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f940a57", new Object[]{fluidContext, sicVar, new Boolean(z)});
        } else if ((StringUtils.equals(fluidContext.getInstanceConfig().getTab3CardType(), obw.TAB2_CONTAINER_TYPE_LIVE_LARGE) && !z) || !a() || sicVar == null) {
        } else {
            sicVar.S();
            sicVar.c(false);
        }
    }

    public static boolean a(snv snvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ff16fb81", new Object[]{snvVar})).booleanValue();
        }
        if (!a() || snvVar == null) {
            return false;
        }
        return snvVar.e() == 1 || snvVar.e() == 8;
    }

    public static void a(FluidContext fluidContext, snv snvVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39280405", new Object[]{fluidContext, snvVar, new Boolean(z)});
        } else if (StringUtils.equals(fluidContext.getInstanceConfig().getTab3CardType(), obw.TAB2_CONTAINER_TYPE_LIVE_LARGE) && !z) {
        } else {
            f.a(snvVar);
        }
    }

    private static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue();
        }
        boolean orangeBooleanConfig = FluidSDK.getRemoteConfigAdapter().getOrangeBooleanConfig("enablePreloadLive", true);
        ogg.b("直播卡片提前播放：orange开关打开：" + orangeBooleanConfig);
        return orangeBooleanConfig;
    }
}
