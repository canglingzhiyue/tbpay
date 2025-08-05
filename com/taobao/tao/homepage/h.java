package com.taobao.tao.homepage;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import java.util.Map;
import tb.fky;
import tb.kge;
import tb.ktp;

/* loaded from: classes8.dex */
public class h implements com.taobao.orange.d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1446521134);
        kge.a(-1209827241);
    }

    @Override // com.taobao.orange.d
    public void onConfigUpdate(String str, Map<String, String> map) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
            return;
        }
        Map<String, String> configs = OrangeConfig.getInstance().getConfigs(str);
        if (map != null && (str2 = map.get("configVersion")) != null) {
            configs.put(fky.SP_KEY_ORANGE_CONFIG_VERSION, str2);
        }
        com.taobao.android.home.component.utils.c.a().a(configs);
        ktp.a().b();
    }
}
