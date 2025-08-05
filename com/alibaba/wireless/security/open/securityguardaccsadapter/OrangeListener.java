package com.alibaba.wireless.security.open.securityguardaccsadapter;

import com.alibaba.wireless.security.framework.IRouterComponent;
import com.alibaba.wireless.security.open.SecurityGuardManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.orange.d;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import tb.kge;

/* loaded from: classes.dex */
public class OrangeListener implements d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final boolean DEBUG = false;
    private static final String SECEVENT_ENUM_PUSH_UNI_CONFIG = "127";
    private static final String TAG = "OrangeListener";
    private static final String UNI_CONFIG_VERSION_KEY = "__177756728";
    private static volatile IRouterComponent gGlobalRounterComponent;

    static {
        kge.a(-2071453965);
        kge.a(-1209827241);
        gGlobalRounterComponent = null;
    }

    public static String getOrangeConfig(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bcfd1ad5", new Object[]{str, str2, str3});
        }
        try {
            return OrangeConfig.getInstance().getConfig(str, str2, str3);
        } catch (Exception unused) {
            return null;
        }
    }

    public static String parseTimeStamp(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a2a9d94c", new Object[]{str});
        }
        if (str != null && str.length() >= 19) {
            return str.substring(2, 16);
        }
        return null;
    }

    @Override // com.taobao.orange.d
    public void onConfigUpdate(String str, Map<String, String> map) {
        IRouterComponent routerComponent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
            return;
        }
        String str2 = null;
        Map<String, String> configs = OrangeConfig.getInstance().getConfigs(str);
        if (configs != null) {
            String str3 = map.get("configVersion");
            if (configs.containsKey(SECEVENT_ENUM_PUSH_UNI_CONFIG)) {
                try {
                    JSONObject jSONObject = new JSONObject(configs.get(SECEVENT_ENUM_PUSH_UNI_CONFIG));
                    String parseTimeStamp = parseTimeStamp(str3);
                    if (parseTimeStamp != null) {
                        jSONObject.put(UNI_CONFIG_VERSION_KEY, parseTimeStamp);
                        configs.put(SECEVENT_ENUM_PUSH_UNI_CONFIG, jSONObject.toString());
                    }
                } catch (JSONException unused) {
                    configs.remove(SECEVENT_ENUM_PUSH_UNI_CONFIG);
                }
            }
            try {
                str2 = new JSONObject(configs).toString();
            } catch (Exception unused2) {
            }
        }
        if (str2 == null || (routerComponent = getRouterComponent()) == null) {
            return;
        }
        routerComponent.doCommand(11153, str2);
    }

    private IRouterComponent getRouterComponent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IRouterComponent) ipChange.ipc$dispatch("695ef05", new Object[]{this});
        }
        if (gGlobalRounterComponent == null) {
            synchronized (d.class) {
                if (gGlobalRounterComponent == null) {
                    try {
                        gGlobalRounterComponent = SecurityGuardManager.getInstance(OrangeAdapter.gContext).getSGPluginManager().getRouter();
                    } catch (Exception unused) {
                    }
                }
            }
        }
        return gGlobalRounterComponent;
    }
}
