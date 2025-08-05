package com.taobao.android.remoteso.index;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class SoIndexAdvanced {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String appVersion = null;
    private final Map<String, SoInfo2> infoMap = new ConcurrentHashMap();

    public String getAppVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("65f009ac", new Object[]{this});
        }
        String str = this.appVersion;
        return str == null ? "" : str;
    }

    public void setAppVersion(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cefab34a", new Object[]{this, str});
        } else {
            this.appVersion = str;
        }
    }

    public Map<String, SoInfo2> getInfoMap() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("71240614", new Object[]{this}) : this.infoMap;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "SoIndexAdvanced{appVersion='" + this.appVersion + "', infoMap=" + this.infoMap.size() + '}';
    }
}
