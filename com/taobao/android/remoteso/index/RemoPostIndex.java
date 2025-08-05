package com.taobao.android.remoteso.index;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.index.SoIndexData;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public final class RemoPostIndex {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String appVersion;
    private final Map<String, SoIndexData.SoFileInfo> assets = new HashMap();

    public String getAppVersion() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("65f009ac", new Object[]{this}) : this.appVersion;
    }

    public void setAppVersion(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cefab34a", new Object[]{this, str});
        } else {
            this.appVersion = str;
        }
    }

    public Map<String, SoIndexData.SoFileInfo> getAssets() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("72bbe8b5", new Object[]{this}) : this.assets;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "RemoPostIndex{appVersion='" + this.appVersion + "', assets=" + this.assets + '}';
    }
}
