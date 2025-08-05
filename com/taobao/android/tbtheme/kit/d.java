package com.taobao.android.tbtheme.kit;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import java.util.Map;
import tb.kge;

/* loaded from: classes.dex */
public class d implements com.taobao.orange.d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1278772173);
        kge.a(-1209827241);
    }

    @Override // com.taobao.orange.d
    public void onConfigUpdate(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
        } else {
            f.a(f.MODULE_NAME, OrangeConfig.getInstance().getConfigs(str));
        }
    }
}
