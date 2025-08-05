package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.hostcontainer.tnode.IHostTNodeService;
import com.uc.webview.export.extension.UCClient;
import java.util.HashMap;

/* loaded from: classes5.dex */
public final class smk {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TYPE_ENTER_IMMERSIVE_VIDEO = "1";
    public static final String TYPE_EXIT_IMMERSIVE_VIDEO = "2";
    public static final String TYPE_PAUSE_EXIT = "3";
    public static final String TYPE_RECOVER_PLAY_ENTER = "4";
    public static final String TYPE_VIDEO_AMPLIFY = "5";

    static {
        kge.a(-1198374387);
    }

    public static void a(FluidContext fluidContext, String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d26c6b0c", new Object[]{fluidContext, str, str2, str3, str4, str5});
        } else if (!spj.i(fluidContext)) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("type", str);
            hashMap.put("contentId", String.valueOf(str2));
            hashMap.put("index", String.valueOf(str3));
            hashMap.put(UCClient.UI_PARAMS_KEY_GESTURE, String.valueOf(str4));
            hashMap.put("currentData", str5);
            hashMap.put("disabledBgInteractLayer", "false");
            spz.c("ImmersiveVideoHelper", "PickPreloadController,发送给Node节点消息");
            ((IHostTNodeService) fluidContext.getService(IHostTNodeService.class)).sendMessage("onvideolistmsg", null, hashMap, null);
            ((IHostTNodeService) fluidContext.getService(IHostTNodeService.class)).reLayoutForVirtualNavigationBar();
        }
    }

    public static void a(FluidContext fluidContext, int i, String str, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("994a9f3", new Object[]{fluidContext, new Integer(i), str, new Boolean(z), new Boolean(z2)});
        } else if (!spj.i(fluidContext)) {
        } else {
            if (((IDataService) fluidContext.getService(IDataService.class)).isTab3CacheEnable()) {
                i--;
            }
            if (i > 0 || ((i == 0 && z) || (i == 0 && z2))) {
                a(fluidContext, "1", null, String.valueOf(i), null, str);
                return;
            }
            spz.c("ImmersiveVideoHelper", "首坑不进入发送进入沉浸式消息，index:" + i + ",needScaleMediaCard:" + z);
        }
    }

    public static void a(FluidContext fluidContext, skd skdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6cecf7e", new Object[]{fluidContext, skdVar});
        } else if (!snf.a(fluidContext) || skdVar == null) {
        } else {
            skdVar.a();
        }
    }
}
