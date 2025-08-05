package tb;

import com.alibaba.ut.abtest.UTABTest;
import com.alibaba.ut.abtest.Variation;
import com.alibaba.ut.abtest.VariationSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.card.ICardService;
import com.taobao.android.fluid.framework.scene.ISceneConfigService;

/* loaded from: classes5.dex */
public final class sil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1429171530);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : FluidSDK.getRemoteConfigAdapter().getOrangeBooleanConfig("enableVideoProgressFull", true);
    }

    public static boolean a(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8fc4079e", new Object[]{fluidContext})).booleanValue();
        }
        try {
            if (!sjt.a()) {
                return false;
            }
            if (spj.a(fluidContext)) {
                return a(fluidContext, "willactive_guangguang");
            }
            return a(fluidContext, "willactive");
        } catch (Exception e) {
            spz.a("VideoCardConfig", "", e);
            return false;
        }
    }

    private static boolean a(FluidContext fluidContext, String str) {
        Variation variation;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8ab43ee8", new Object[]{fluidContext, str})).booleanValue();
        }
        VariationSet activate = UTABTest.activate("AB_fullscreenpage_android", str);
        if (activate == null || (variation = activate.getVariation("enable")) == null || !Boolean.parseBoolean(variation.getValueAsString(String.valueOf(false)))) {
            return false;
        }
        Variation variation2 = activate.getVariation(ios.K_DEVICE_SCORE);
        if (variation2 != null) {
            float valueAsFloat = variation2.getValueAsFloat(0.0f);
            float c = pio.c(fluidContext);
            spz.c("VideoCardConfig", "deviceScore:" + c);
            if (c < valueAsFloat) {
                return false;
            }
        }
        Variation variation3 = activate.getVariation("type");
        if (variation3 != null) {
            String valueAsString = variation3.getValueAsString(",all,");
            sps sessionParams = ((ISceneConfigService) fluidContext.getService(ISceneConfigService.class)).getSessionParams();
            if (sessionParams != null) {
                return spj.a(sessionParams.b, valueAsString);
            }
        }
        return true;
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : FluidSDK.getRemoteConfigAdapter().getOrangeBooleanConfig("enableSeekToAndPause", true);
    }

    public static boolean b(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8f4da19f", new Object[]{fluidContext})).booleanValue();
        }
        try {
            Boolean d = ((ICardService) fluidContext.getService(ICardService.class)).getConfig().d();
            if (d == null) {
                if (!spj.d(fluidContext) || !c()) {
                    z = false;
                }
                d = Boolean.valueOf(z);
                ((ICardService) fluidContext.getService(ICardService.class)).getConfig().a(d);
            }
            spz.c("VideoCardConfig", "isTab3ProgressChangeAll enable=" + d);
            return d.booleanValue();
        } catch (Exception e) {
            spz.c("VideoCardConfig", "isTab3ProgressChangeAll error:" + e.getMessage());
            return false;
        }
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue() : FluidSDK.getRemoteConfigAdapter().getOrangeBooleanConfig("enableTab3ProgressChange", true);
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[0])).booleanValue() : FluidSDK.getRemoteConfigAdapter().getOrangeBooleanConfig("enableProgressRelativeMove", true);
    }

    public static boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[0])).booleanValue() : FluidSDK.getRemoteConfigAdapter().getOrangeBooleanConfig("enableReleaseLiveMuteListener", true);
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[0])).booleanValue() : FluidSDK.getRemoteConfigAdapter().getOrangeBooleanConfig("enableCacheCellHeightAndImmersive", true);
    }

    public static boolean i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[0])).booleanValue() : FluidSDK.getRemoteConfigAdapter().getOrangeBooleanConfig("enablePlayhintLoadingNoRebuild", true);
    }
}
