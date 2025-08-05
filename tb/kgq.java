package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.application.common.c;
import com.taobao.mrt.service.b;

/* loaded from: classes7.dex */
public class kgq implements b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.taobao.mrt.service.b
    public String getDeviceLevel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("89e64461", new Object[]{this});
        }
        try {
            int a2 = c.a().a("deviceLevel", -1);
            return a2 == 0 ? "high" : a2 == 1 ? "medium" : "low";
        } catch (Throwable th) {
            th.printStackTrace();
            return "low";
        }
    }
}
