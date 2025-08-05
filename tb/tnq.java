package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.a;
import com.taobao.taolive.sdk.utils.p;
import com.taobao.taolive.sdk.utils.q;

/* loaded from: classes8.dex */
public class tnq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1563711307);
    }

    public static void a(a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb15e917", new Object[]{aVar, new Boolean(z)});
        } else if (!a()) {
        } else {
            q.b("StdPopUtils", "setCanShowPopFlag, postEvent canShow = " + z);
            ddw.a().a(xkw.EVENT_CAN_SHOW_POP_LAYER, Boolean.valueOf(z), aVar != null ? aVar.G() : null);
        }
    }

    private static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : p.a("enableInterruptShowPopWithFlag", true);
    }
}
