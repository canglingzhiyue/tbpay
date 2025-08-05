package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.utils.r;
import com.taobao.android.detail.core.utils.s;
import java.util.Map;

/* loaded from: classes5.dex */
public class iyx {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PARAM_IS_DETAIL_DRAWER_MODE = "isDetailDrawerMode";
    public static final String PARAM_IS_PAD_DEVICE = "isPadDevice";
    public static final String PARAM_VIDEO_AUTO_PLAY = "videoAutoPlay";

    static {
        kge.a(-418492425);
        emu.a("com.taobao.android.detail.wrapper.ext.request.RequestUtils");
    }

    public static void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{map});
            return;
        }
        map.put(PARAM_VIDEO_AUTO_PLAY, String.valueOf(r.a()));
        if (!eip.B) {
            return;
        }
        map.put(PARAM_IS_PAD_DEVICE, String.valueOf(s.a()));
    }
}
