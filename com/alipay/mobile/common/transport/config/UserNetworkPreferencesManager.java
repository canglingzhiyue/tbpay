package com.alipay.mobile.common.transport.config;

import android.text.TextUtils;
import android.util.Pair;
import com.alipay.mobile.common.transport.httpdns.DnsUtil;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.MiscUtils;
import com.alipay.mobile.common.transport.utils.NwSharedSwitchUtil;
import com.alipay.mobile.common.transport.utils.TransportEnvUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class UserNetworkPreferencesManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Pair<String, Integer> EMPTY_PAIR = new Pair<>("", 0);

    /* renamed from: a  reason: collision with root package name */
    private static UserNetworkPreferencesManager f5527a;
    private Map<String, String> b = null;
    private boolean c = false;
    private boolean d = false;

    public static final UserNetworkPreferencesManager getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UserNetworkPreferencesManager) ipChange.ipc$dispatch("ee6c8e44", new Object[0]);
        }
        UserNetworkPreferencesManager userNetworkPreferencesManager = f5527a;
        if (userNetworkPreferencesManager != null) {
            return userNetworkPreferencesManager;
        }
        synchronized (UserNetworkPreferencesManager.class) {
            if (f5527a != null) {
                return f5527a;
            }
            f5527a = new UserNetworkPreferencesManager();
            return f5527a;
        }
    }

    public void bindHost(String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c53c663", new Object[]{this, str, str2, new Integer(i)});
        } else if (TextUtils.isEmpty(str)) {
            LogCatUtil.warn("UserNetworkPreferencesManager", "[bindHost] domain is null.");
        } else if (TextUtils.isEmpty(str2)) {
            LogCatUtil.warn("UserNetworkPreferencesManager", "[bindHost] ip is null.");
        } else if (i <= 0) {
            LogCatUtil.warn("UserNetworkPreferencesManager", "[bindHost] port is " + i);
        } else {
            try {
                LogCatUtil.info("UserNetworkPreferencesManager", "[bindHost] domain = " + str + ", ip = " + str2 + ", port = " + i);
                TransportConfigureManager.getInstance().firstUpdateConfig(TransportEnvUtil.getContext());
                a();
                Map<String, String> b = b();
                b.put(str, str2 + ":" + i);
                a("np-bind-host", new JSONObject(this.b));
            } catch (Throwable th) {
                LogCatUtil.error("UserNetworkPreferencesManager", "[bindHost] Exception: " + th.toString(), th);
            }
        }
    }

    public void unbindHost(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb85fd2f", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str)) {
            LogCatUtil.warn("UserNetworkPreferencesManager", "[unbindHost] domain is null.");
        } else {
            try {
                LogCatUtil.info("UserNetworkPreferencesManager", "[unbindHost] domain = " + str);
                TransportConfigureManager.getInstance().firstUpdateConfig(TransportEnvUtil.getContext());
                a();
                if (this.b == null || this.b.isEmpty() || TextUtils.isEmpty(this.b.get(str))) {
                    return;
                }
                this.b.put(str, "");
                a("np-bind-host", new JSONObject(this.b));
            } catch (Throwable th) {
                LogCatUtil.error("UserNetworkPreferencesManager", "[unbindHost] Exception: " + th.toString(), th);
            }
        }
    }

    public String getBindHostByDomain(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e3287359", new Object[]{this, str});
        }
        try {
            a();
            if (this.b == null || this.b.isEmpty() || (str2 = this.b.get(str)) == null) {
                return null;
            }
            if (str2.trim().length() <= 0) {
                return "";
            }
            LogCatUtil.info("UserNetworkPreferencesManager", "[getBindHostByDomain] domain = " + str + ", host = " + str2);
            return str2;
        } catch (Throwable th) {
            LogCatUtil.error("UserNetworkPreferencesManager", "[getBindHost] Exception: " + th.toString(), th);
            return "";
        }
    }

    public Pair<String, Integer> getBindHostPairByDomain(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("f561902b", new Object[]{this, str});
        }
        try {
            String bindHostByDomain = getBindHostByDomain(str);
            StringBuilder sb = new StringBuilder();
            sb.append("[getBindHostPairByDomain] Domain = ");
            sb.append(str);
            sb.append(", host info: ");
            sb.append(bindHostByDomain != null ? bindHostByDomain : "is null.");
            LogCatUtil.info("UserNetworkPreferencesManager", sb.toString());
            return a(bindHostByDomain);
        } catch (Throwable th) {
            LogCatUtil.warn("UserNetworkPreferencesManager", "[getInetAddressByBindHosts] Exception:" + th.toString(), th);
            return null;
        }
    }

    public Map<String, Pair<String, Integer>> getAllBindHostPairs() {
        String value;
        Pair<String, Integer> a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("fa66bde5", new Object[]{this});
        }
        a();
        Map<String, String> map = this.b;
        if (map == null || map.isEmpty()) {
            return Collections.EMPTY_MAP;
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, String> entry : this.b.entrySet()) {
            if (!TextUtils.isEmpty(entry.getKey()) && (value = entry.getValue()) != null && (a2 = a(value)) != null) {
                hashMap.put(entry.getKey(), a2);
            }
        }
        return hashMap.isEmpty() ? Collections.EMPTY_MAP : hashMap;
    }

    public void forceLoadLocalBindHosts() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc7385bb", new Object[]{this});
            return;
        }
        TransportConfigureManager.getInstance().firstUpdateConfig(TransportEnvUtil.getContext());
        String stringValue = TransportConfigureManager.getInstance().getStringValue("np-bind-host");
        if (TextUtils.isEmpty(stringValue)) {
            return;
        }
        try {
            LogCatUtil.info("UserNetworkPreferencesManager", "[forceLoadLocalBindHosts] value = " + stringValue);
            JSONObject jSONObject = new JSONObject(stringValue);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                b().put(next, jSONObject.optString(next));
            }
        } catch (Throwable th) {
            LogCatUtil.error("UserNetworkPreferencesManager", "[forceLoadLocalBindHosts] Parse json: " + stringValue + ",  exception: " + th.toString(), th);
        }
    }

    public void setH2Url(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("748f9b54", new Object[]{this, str});
            return;
        }
        try {
            LogCatUtil.info("UserNetworkPreferencesManager", "[setH2Url] Enter. urlStr = " + str);
            if (!TextUtils.isEmpty(str)) {
                URL url = new URL(str);
                str = url.getHost() + ":" + MiscUtils.getPortByUrlObj(url);
                LogCatUtil.info("UserNetworkPreferencesManager", "[setH2Url] urlStr convert to : " + str);
            } else {
                LogCatUtil.info("UserNetworkPreferencesManager", "[setH2Url] Clear h2 url config");
            }
            TransportConfigureManager.getInstance().firstUpdateConfig(TransportEnvUtil.getContext());
            TransportConfigureManager.getInstance().setValue(TransportConfigureItem.BIFROST_H2_URL, str);
            HashMap hashMap = new HashMap(1);
            hashMap.put(TransportConfigureItem.BIFROST_H2_URL.getConfigName(), str == null ? "" : str);
            TransportConfigureManager.getInstance().updateConfig(TransportEnvUtil.getContext(), hashMap, NwSharedSwitchUtil.KEY_NET_SWITCH_TWO);
            NwSharedSwitchUtil.notifySwitchUpdate();
            LogCatUtil.info("UserNetworkPreferencesManager", "[setH2Url] Finished. urlStr = " + str);
        } catch (Throwable th) {
            LogCatUtil.error("UserNetworkPreferencesManager", "[setH2Url] Exception: " + th.toString());
        }
    }

    private Pair<String, Integer> a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("c2e055fc", new Object[]{this, str});
        }
        if (str == null) {
            return null;
        }
        if (str.trim().length() <= 0) {
            return EMPTY_PAIR;
        }
        LogCatUtil.info("UserNetworkPreferencesManager", "[createPairByHostInfos] Enter. bindedHost = " + str);
        String[] split = str.split(":");
        if (split.length != 2) {
            LogCatUtil.warn("UserNetworkPreferencesManager", "[createPairByHostInfos] Illegal hostInfos");
            return null;
        } else if (!DnsUtil.isLogicIP(split[0])) {
            LogCatUtil.warn("UserNetworkPreferencesManager", "[createPairByHostInfos] Illegal ip = " + split[0]);
            return null;
        } else {
            try {
                int parseInt = Integer.parseInt(split[1]);
                if (parseInt <= 0) {
                    LogCatUtil.warn("UserNetworkPreferencesManager", "[createPairByHostInfos] Illegal port = " + parseInt);
                    return null;
                }
                return new Pair<>(split[0], Integer.valueOf(parseInt));
            } catch (NumberFormatException e) {
                LogCatUtil.warn("UserNetworkPreferencesManager", "[createPairByHostInfos] Illegal port = " + split[1] + ", Exception: " + e.toString());
                return null;
            }
        }
    }

    public boolean isDisabledAllTraficLimit() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1a49944e", new Object[]{this})).booleanValue() : this.d;
    }

    public void setDisabledAllTraficLimit(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c80c3592", new Object[]{this, new Boolean(z)});
            return;
        }
        LogCatUtil.info("UserNetworkPreferencesManager", "[setDisabledAllTraficLimit]  disabledAllTraficLimit = " + z);
        this.d = z;
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.c) {
        } else {
            synchronized (this) {
                if (this.c) {
                    return;
                }
                this.c = true;
                forceLoadLocalBindHosts();
            }
        }
    }

    private Map<String, String> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("6dbf0a5e", new Object[]{this});
        }
        Map<String, String> map = this.b;
        if (map != null) {
            return map;
        }
        this.b = new HashMap();
        return this.b;
    }

    private void a(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3502d8cc", new Object[]{this, str, jSONObject});
            return;
        }
        String jSONObject2 = jSONObject.toString();
        HashMap hashMap = new HashMap(1);
        hashMap.put(str, jSONObject2);
        TransportConfigureManager.getInstance().updateConfig(TransportEnvUtil.getContext(), hashMap, NwSharedSwitchUtil.KEY_NET_SWITCH_TWO);
        NwSharedSwitchUtil.notifySwitchUpdate();
        LogCatUtil.info("UserNetworkPreferencesManager", "[update2Config] Finished. key = " + str + ", value = " + jSONObject2);
    }
}
