package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.orange.d;
import java.util.Map;

/* loaded from: classes7.dex */
public class lwy implements d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-2020577410);
        kge.a(-1209827241);
    }

    @Override // com.taobao.orange.d
    public void onConfigUpdate(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
        } else {
            lww.a().a("homepage_switch", OrangeConfig.getInstance().getConfigs(str));
        }
    }
}
