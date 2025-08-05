package com.taobao.tao.welcome;

import android.app.Application;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes.dex */
public class Launcher implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String BC_SP = "alibc_flowcustoms";
    private static final boolean DEBUG = true;
    private static final String ORANGE_NAMESPACE = "next_launch";
    private static final String POPLAYER_SP = "sp_poplayer_info_xxx";
    public static final String WELCOME_SP = "com.taobao.tao.welcome.Welcome";

    static {
        kge.a(731749709);
        kge.a(1028243835);
    }

    public void init(final Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{this, application, hashMap});
            return;
        }
        Log.e("Welcome", "preload preference with poplayer");
        application.getSharedPreferences("com.taobao.tao.welcome.Welcome", 0);
        application.getSharedPreferences(POPLAYER_SP, 0);
        application.getSharedPreferences(BC_SP, 0);
        OrangeConfig.getInstance().registerListener(new String[]{"next_launch"}, new com.taobao.orange.d() { // from class: com.taobao.tao.welcome.Launcher.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.orange.d
            public void onConfigUpdate(String str, Map<String, String> map) {
                Map<String, String> configs;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
                } else if (!"next_launch".equals(str) || (configs = OrangeConfig.getInstance().getConfigs(str)) == null || configs.isEmpty()) {
                } else {
                    application.getSharedPreferences("com.taobao.tao.welcome.Welcome", 0).edit().putBoolean(HostController.KEY_REQUEST_PERMISSION_ALWAYS, "1".equals(configs.get("welRequestPerAlways"))).commit();
                }
            }
        }, false);
    }
}
