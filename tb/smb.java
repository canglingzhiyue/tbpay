package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.business.videocollection.helper.ICollectionService;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.core.FluidInstance;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.data.remote.c;
import com.taobao.android.fluid.framework.mute.helper.f;
import com.taobao.android.fluid.framework.preload.data.PreloadWeexData;
import com.taobao.android.fluid.framework.preload.weex.IPreloadWeexService;
import com.taobao.android.fluid.framework.scene.ISceneConfigService;
import com.taobao.android.revisionswitch.TBRevisionSwitchManager;
import com.taobao.tao.flexbox.layoutmanager.adapter.a;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public final class smb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-926204089);
    }

    public static Map a(FluidContext fluidContext, spy spyVar) {
        int a2;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("e5346283", new Object[]{fluidContext, spyVar});
        }
        HashMap hashMap = new HashMap();
        ISceneConfigService iSceneConfigService = (ISceneConfigService) fluidContext.getService(ISceneConfigService.class);
        spr sessionExtParams = iSceneConfigService.getSessionExtParams();
        sps sessionParams = iSceneConfigService.getSessionParams();
        skl j = ((IDataService) fluidContext.getService(IDataService.class)).getConfig().j();
        hashMap.put("tbvs_version", 31);
        hashMap.put("pageUrl", fluidContext.getInstanceConfig().getFluidUrl());
        hashMap.put("configs", j == null ? new HashMap<>() : j.b());
        Map map = null;
        hashMap.put("sessionParams", sessionParams == null ? null : sessionParams.f33820a);
        hashMap.put("initData", spyVar != null ? spyVar.b() : new HashMap());
        hashMap.put("scene", sessionExtParams == null ? null : sessionExtParams.a());
        hashMap.put("isFullScreen", Boolean.valueOf(fluidContext.getInstanceConfig().isTab3Fullscreen()));
        String guangGuangType = fluidContext.getInstanceConfig().getGuangGuangType();
        if (TextUtils.isEmpty(guangGuangType)) {
            guangGuangType = null;
        }
        hashMap.put("ggType", guangGuangType);
        String tab3ComponentSource = fluidContext.getInstanceConfig().getTab3ComponentSource();
        if (TextUtils.isEmpty(tab3ComponentSource)) {
            tab3ComponentSource = null;
        }
        hashMap.put(c.KEY_TAB3COMPONENTSOURCE, tab3ComponentSource);
        if (!a(fluidContext)) {
            z = spj.i(fluidContext);
        }
        hashMap.put("isImmersiveVideo", Boolean.valueOf(z));
        String d = sessionExtParams == null ? null : sessionExtParams.d();
        if (!TextUtils.isEmpty(d)) {
            hashMap.put("tab3SceneSource", d);
        }
        if (sessionExtParams != null) {
            map = sessionExtParams.b();
        }
        hashMap.put("tab3ExtParams", map);
        String tab3CardType = fluidContext.getInstanceConfig().getTab3CardType();
        if (!TextUtils.isEmpty(tab3CardType)) {
            hashMap.put("tab3CardType", tab3CardType);
        }
        if (a(fluidContext)) {
            a2 = sjs.b(fluidContext);
        } else {
            a2 = sjs.a(fluidContext);
        }
        hashMap.put("actionBarHeight", Integer.valueOf(a2));
        hashMap.put("bottomBarHeight", Integer.valueOf(sjs.c(fluidContext)));
        hashMap.put(c.KEY_VERTICAL_LAYOUT, Boolean.valueOf(sjt.u()));
        hashMap.put("isLargeScreenDevice", Boolean.valueOf(obx.g()));
        hashMap.put("topBarMarginTop", Integer.valueOf(soi.a()));
        hashMap.put("topBarHeight", Integer.valueOf(soi.b()));
        FluidInstance fluidInstance = (FluidInstance) fluidContext;
        hashMap.put("tab3TopBarHeight", Integer.valueOf(soi.a(fluidInstance)));
        hashMap.put("tab3TopBarTopY", Integer.valueOf(soi.b(fluidInstance)));
        hashMap.put("tab3TopBarBottomY", Integer.valueOf(soi.c(fluidInstance)));
        hashMap.put("ggTabbarHeight", Integer.valueOf(ohd.b(obu.e(), obu.b())));
        hashMap.put("isTabbarVisible", Boolean.valueOf(a.a().b().g()));
        long a3 = com.taobao.android.fluid.business.usertrack.track.a.a(fluidContext);
        if (a3 > 0) {
            hashMap.put("TTFE", Long.valueOf(a3));
        }
        HashMap hashMap2 = new HashMap();
        hashMap2.put("isGuangGuang", Boolean.valueOf(TBRevisionSwitchManager.i().a(ilw.KEY_NEW_CONTENT_ENABLE)));
        hashMap2.put("supportLockListView", "true");
        hashMap2.put("supportDXComment", "true");
        hashMap2.put("supportItemRecognize", "true");
        hashMap2.put("supportGoodsPoint", "true");
        hashMap2.put("supportProgressMovedown", Boolean.valueOf(sil.b(fluidContext)));
        hashMap2.put("hasHalfScreenGuide", false);
        hashMap2.put("supportNewLandscape", Boolean.valueOf(a()));
        hashMap2.put("isTab3GuideShoppingVersion", Boolean.valueOf(sjv.b(fluidContext)));
        hashMap2.put("supportCollectionPage", Boolean.valueOf(obo.f31895a));
        hashMap2.put("isTab3UseNewMtop", Boolean.valueOf(skk.a(fluidContext)));
        hashMap2.put("enableUTDirect", Boolean.valueOf(b()));
        hashMap2.put("isUnderageMode", Boolean.valueOf(com.taobao.android.fluid.business.undermode.helper.a.INSTANCE.a()));
        hashMap2.put("supportSnapShot", Boolean.valueOf(soh.INSTANCE.a()));
        hashMap2.put("isSupportRelateData", Boolean.valueOf(spj.b()));
        hashMap2.put("isRelateDataFlow", Boolean.valueOf(((ICollectionService) fluidContext.getService(ICollectionService.class)).isNewPageRecommend()));
        hashMap2.put("openUiReLayout", spj.c());
        hashMap2.put("supportImmersiveLiveJump", String.valueOf(jam.a()));
        hashMap.put("extra", hashMap2);
        HashMap i = f.i(fluidContext);
        if (!i.isEmpty()) {
            hashMap.put("globalMuteState", i);
        }
        hashMap.put(FluidSDK.FLUID_SDK_FLAG, "1");
        hashMap.put(com.taobao.android.fluid.f.FLUID_SDK_REMOTE_VERSION, com.taobao.android.fluid.f.FLUID_SDK_REMOTE_VERSION_VALUE);
        return hashMap;
    }

    private static boolean a(FluidContext fluidContext) {
        IPreloadWeexService iPreloadWeexService;
        PreloadWeexData preloadWeexData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8fc4079e", new Object[]{fluidContext})).booleanValue();
        }
        if (fluidContext != null && fluidContext.getService(IPreloadWeexService.class) != null && (iPreloadWeexService = (IPreloadWeexService) fluidContext.getService(IPreloadWeexService.class)) != null && iPreloadWeexService.getPreloadWeexData() != null && (preloadWeexData = iPreloadWeexService.getPreloadWeexData()) != null) {
            return preloadWeexData.c();
        }
        return false;
    }

    private static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : FluidSDK.getRemoteConfigAdapter().getOrangeBooleanConfig("enableLandscapeDialog", true);
    }

    private static boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : oeb.a("ShortVideo.enableUTDirect", true);
    }
}
