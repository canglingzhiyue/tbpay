package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.adapter.remoteconfig.a;
import com.taobao.android.fluid.framework.container.IContainerService;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.lifecycle.ILifecycleService;
import com.taobao.android.fluid.framework.list.IFeedsListService;
import com.taobao.android.fluid.framework.media.IMediaService;

/* loaded from: classes5.dex */
public class snf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Boolean f33726a;

    static {
        kge.a(-440869367);
        f33726a = null;
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue();
        }
        if (!FluidSDK.getRemoteConfigAdapter().getOrangeBooleanConfig("disableAutoScrollLoadMore", false)) {
            return a.a("AB_fullscreenpage_loadmore", "autoScrollLoadMore", "disable", false);
        }
        return true;
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : oeb.a("ShortVideo.disableInsideLoadOnCreate", false);
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue();
        }
        if (f33726a == null) {
            f33726a = Boolean.valueOf(oec.a((Object) FluidSDK.getRemoteConfigAdapter().getOrangeStringConfig("enableH5ScrollOpti", "true"), false));
        }
        ogg.a("TestConfig", "AB_fullscreen.web优化---isEnableH5ScrollOpti : " + f33726a);
        return f33726a.booleanValue();
    }

    public static boolean a(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8fc4079e", new Object[]{fluidContext})).booleanValue();
        }
        if (!sjt.u() && !spj.i(fluidContext)) {
            return false;
        }
        return oeb.a("ShortVideo.enableImmersiveVideoPullRefresh", true);
    }

    public static boolean b(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8f4da19f", new Object[]{fluidContext})).booleanValue() : ((IDataService) fluidContext.getService(IDataService.class)).isTab3CacheHadExposedNeedPlayNextVideo();
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[0])).booleanValue() : Boolean.valueOf(Boolean.parseBoolean(FluidSDK.getRemoteConfigAdapter().getOrangeStringConfig("layoutXmlToJava", "true"))).booleanValue();
    }

    public static int c(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8ed73b8f", new Object[]{fluidContext})).intValue();
        }
        if (((ILifecycleService) fluidContext.getService(ILifecycleService.class)).getPageState() != 2) {
            return 0;
        }
        if (((IMediaService) fluidContext.getService(IMediaService.class)).shouldVideoStay() || ((IFeedsListService) fluidContext.getService(IFeedsListService.class)).isPublicTheLastOne()) {
            return 2;
        }
        return sij.a(((IDataService) fluidContext.getService(IDataService.class)).getConfig().j().q) || ((IContainerService) fluidContext.getService(IContainerService.class)).getConfig().g() ? 1 : 0;
    }

    public static boolean d(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8e60d5a1", new Object[]{fluidContext})).booleanValue() : !obo.b(fluidContext);
    }
}
