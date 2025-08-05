package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.data.remote.newmodel.a;
import com.taobao.android.fluid.framework.scene.ISceneConfigService;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public class slt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Map<String, String> f33707a;

    static {
        kge.a(-603562879);
    }

    public static boolean a(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8fc4079e", new Object[]{fluidContext})).booleanValue();
        }
        skl j = ((IDataService) fluidContext.getService(IDataService.class)).getConfig().j();
        sps sessionParams = ((ISceneConfigService) fluidContext.getService(ISceneConfigService.class)).getSessionParams();
        if (j != null && sessionParams != null) {
            return ohh.b(a(sessionParams.b), a.a(j));
        }
        return false;
    }

    public static String b(FluidContext fluidContext) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("61165c65", new Object[]{fluidContext});
        }
        sps sessionParams = ((ISceneConfigService) fluidContext.getService(ISceneConfigService.class)).getSessionParams();
        if (sessionParams == null || (str = sessionParams.b) == null) {
            return null;
        }
        Object b = ohh.b(a(str));
        if (b instanceof String) {
            return (String) b;
        }
        return c(fluidContext).get(str);
    }

    private static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        return "VideoListTypeKey_" + str;
    }

    private static Map<String, String> c(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("137accd1", new Object[]{fluidContext});
        }
        Map<String, String> map = f33707a;
        if (map != null) {
            return map;
        }
        f33707a = new HashMap();
        ((ISceneConfigService) fluidContext.getService(ISceneConfigService.class)).getSessionParams();
        if (skk.a(fluidContext) && skk.b()) {
            f33707a.put("guangguang_pick", "newdetail");
        } else {
            f33707a.put("guangguang_pick", "guangguang");
        }
        return f33707a;
    }
}
