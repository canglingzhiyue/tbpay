package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.business.intelligence.IIntelligenceService;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.core.FluidInstanceConfig;
import com.taobao.android.fluid.framework.container.IContainerService;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.scene.ISceneConfigService;
import com.taobao.tao.log.TLog;

/* loaded from: classes5.dex */
public final class spj {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int NEXT_VIDEO_BREAK = 2;
    public static final int NEXT_VIDEO_NONE = 0;
    public static final int NEXT_VIDEO_PUBLIC = 1;

    static {
        kge.a(690257964);
    }

    public static boolean a(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8fc4079e", new Object[]{fluidContext})).booleanValue();
        }
        skl j = ((IDataService) fluidContext.getService(IDataService.class)).getConfig().j();
        return j != null && "guangguang".equalsIgnoreCase(j.O);
    }

    public static boolean b(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8f4da19f", new Object[]{fluidContext})).booleanValue();
        }
        sps sessionParams = ((ISceneConfigService) fluidContext.getService(ISceneConfigService.class)).getSessionParams();
        if (sessionParams != null) {
            return a("TBVideoGuangTypeList", sessionParams.b, ",guangguang,guangguang_follow,guangguang_homepage,guang_std_a,guang_std_b,guangguang_cainixihuan,guangguang_pick,guangguang_interaction_ad,");
        }
        return false;
    }

    public static boolean c(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8ed73ba0", new Object[]{fluidContext})).booleanValue();
        }
        spo globalState = ((ISceneConfigService) fluidContext.getService(ISceneConfigService.class)).getGlobalState();
        if (globalState.c == null) {
            globalState.c = Boolean.valueOf(Boolean.parseBoolean(FluidSDK.getRemoteConfigAdapter().getOrangeStringConfig("degradeUtIndex", "false")));
        }
        return globalState.c.booleanValue();
    }

    public static boolean d(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8e60d5a1", new Object[]{fluidContext})).booleanValue() : FluidInstanceConfig.CONTAINER_NAME_GG_TAG3.equals(fluidContext.getInstanceConfig().getBizType());
    }

    public static boolean e(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8dea6fa2", new Object[]{fluidContext})).booleanValue() : "shopLoft".equals(((ISceneConfigService) fluidContext.getService(ISceneConfigService.class)).getSessionParams().a().a());
    }

    public static boolean a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("929ad04a", new Object[]{str, str2, str3})).booleanValue();
        }
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        try {
            return a(str2, FluidSDK.getRemoteConfigAdapter().getOrangeStringConfig(str, str3));
        } catch (Throwable th) {
            TLog.loge("SceneServiceConfig", "isInTypeList error", th);
            return false;
        }
    }

    public static boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{str, str2})).booleanValue();
        }
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        String lowerCase = str2.toLowerCase();
        if (lowerCase.contains(",all,")) {
            return true;
        }
        return lowerCase.contains("," + str + ",");
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue() : "video".equalsIgnoreCase(str);
    }

    public static boolean f(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8d7409a3", new Object[]{fluidContext})).booleanValue() : fluidContext.getInstanceConfig().isTab3FromLauncher();
    }

    public static boolean g(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8cfda3a4", new Object[]{fluidContext})).booleanValue() : fluidContext.getInstanceConfig().isTab3FromIconStream();
    }

    public static boolean h(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8c873da5", new Object[]{fluidContext})).booleanValue() : ((IContainerService) fluidContext.getService(IContainerService.class)).getConfig().h();
    }

    public static boolean i(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8c10d7a6", new Object[]{fluidContext})).booleanValue();
        }
        if (sjt.u() || !a() || !d(fluidContext)) {
            return false;
        }
        FluidInstanceConfig instanceConfig = fluidContext.getInstanceConfig();
        if (!k(fluidContext)) {
            return instanceConfig.isTab3Fullscreen();
        }
        return false;
    }

    public static int m(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8a373f99", new Object[]{fluidContext})).intValue();
        }
        if (sjv.b(fluidContext) && i(fluidContext)) {
            return obu.b();
        }
        return 0;
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : !obx.g() && oeb.a("ShortVideo.enableImmersiveVideo", true);
    }

    public static String j(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b2929d5d", new Object[]{fluidContext}) : fluidContext == null ? "video" : fluidContext.getInstanceConfig().getTab3CardType();
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : oeb.a("ShortVideo.enableRelatedData", true);
    }

    public static String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd025a76", new Object[0]);
        }
        JSONObject jSONObject = (JSONObject) oeb.a(IIntelligenceService.KEY_ABTEST_UI_RELAYOUT, new JSONObject());
        if (!jSONObject.containsKey("uiLayoutStrategy")) {
            return "-1";
        }
        String obj = jSONObject.get("uiLayoutStrategy").toString();
        spz.c("Tab2MobileAI", "initHandleRecognizeService info:" + jSONObject.get("uiLayoutStrategy"));
        return obj;
    }

    public static boolean l(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8aada5a9", new Object[]{fluidContext})).booleanValue() : a(fluidContext.getContext(), d(fluidContext));
    }

    public static boolean a(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("258fda78", new Object[]{context, new Boolean(z)})).booleanValue() : obu.b(context) && z;
    }

    public static boolean k(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8b240ba8", new Object[]{fluidContext})).booleanValue() : TextUtils.equals("outside", fluidContext.getInstanceConfig().getTab3ComponentSource());
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[0])).booleanValue() : oeb.a("ShortVideo.enableCheckMatchCurrentTab", true);
    }
}
