package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavix.service.BUFS;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.scene.ISceneConfigService;

/* loaded from: classes5.dex */
public class sll {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1961495030);
    }

    private static String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{str, str2});
        }
        try {
            return BUFS.getFeature(new BUFS.QueryArgs(), str, str2, "Page_videointeract");
        } catch (Throwable th) {
            spz.c("BxUtils", "t:" + th.getMessage());
            return "";
        }
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[0]) : a("video.request.refresh", "Page_videointeract");
    }

    public static String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[0]) : a("guangguang.shortVideo.request.recommend", "guangguang");
    }

    public static boolean a(FluidContext fluidContext) {
        sps sessionParams;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8fc4079e", new Object[]{fluidContext})).booleanValue();
        }
        try {
            sessionParams = ((ISceneConfigService) fluidContext.getService(ISceneConfigService.class)).getSessionParams();
        } catch (Throwable th) {
            spz.c("BxUtils", "t:" + th.getMessage());
        }
        if (sessionParams == null) {
            return false;
        }
        return spj.a("supportBXTypeList", sessionParams.b, ",cainixihuansy,");
    }

    public static boolean a(sps spsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ff31cd66", new Object[]{spsVar})).booleanValue();
        }
        if (spsVar == null) {
            return false;
        }
        try {
            if (!"guangguang".equals(spsVar.b)) {
                if (!"guangguang_pick".equals(spsVar.b)) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            spz.c("BxUtils", "t:" + th.getMessage());
            return false;
        }
    }
}
