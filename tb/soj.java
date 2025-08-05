package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.mute.helper.f;
import java.util.Map;

/* loaded from: classes5.dex */
public class soj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1631147845);
    }

    public static boolean a(FluidContext fluidContext) {
        Map<String, Object> map;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8fc4079e", new Object[]{fluidContext})).booleanValue();
        }
        if (!oeb.a("ShortVideo.enableNewGlobalMute", true)) {
            return false;
        }
        skl j = ((IDataService) fluidContext.getService(IDataService.class)).getConfig().j();
        if (j != null && j.am != null && (map = j.am.get("newMuteSettingV2")) != null) {
            z = oec.a(map.get("enable"), false);
        }
        spz.c("MuteConfig", z + "--enableNewMuteSetting ");
        return z;
    }

    public static boolean b(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8f4da19f", new Object[]{fluidContext})).booleanValue() : oeb.i(f.j(fluidContext));
    }
}
