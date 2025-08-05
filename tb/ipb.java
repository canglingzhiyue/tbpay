package tb;

import anet.channel.GlobalAppRuntimeInfo;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes6.dex */
public final class ipb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Boolean f29200a;

    static {
        kge.a(1277972178);
        f29200a = null;
    }

    public static boolean a() {
        Boolean bool;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            bool = (Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0]);
        } else {
            Boolean bool2 = f29200a;
            if (bool2 != null) {
                return bool2.booleanValue();
            }
            try {
            } catch (Exception e) {
                jpr.a(jpu.a("ultron").c("isTaobaoError").b(e.getMessage()));
                f29200a = true;
            }
            if (GlobalAppRuntimeInfo.getContext() == null) {
                return true;
            }
            f29200a = Boolean.valueOf("com.taobao.taobao".equals(GlobalAppRuntimeInfo.getContext().getApplicationInfo().packageName));
            bool = f29200a;
        }
        return bool.booleanValue();
    }
}
