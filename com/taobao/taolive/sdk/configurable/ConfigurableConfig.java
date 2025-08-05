package com.taobao.taolive.sdk.configurable;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tb.riy;

/* loaded from: classes8.dex */
public class ConfigurableConfig implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Map<String, ITaoLiveComponent> componentMap = new HashMap();
    private Map<String, ITaoLiveComponentConfig> configMap;

    static {
        kge.a(1305566888);
        kge.a(1028243835);
    }

    public Map<String, ITaoLiveComponentConfig> getConfigMap() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("7d126180", new Object[]{this}) : this.configMap;
    }

    public void setConfigMap(Map<String, ITaoLiveComponentConfig> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17e4d8a6", new Object[]{this, map});
        } else {
            this.configMap = map;
        }
    }

    public Map<String, ITaoLiveComponent> getComponentMap() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("a18368d1", new Object[]{this}) : this.componentMap;
    }

    public void setComponentMap(Map<String, ITaoLiveComponent> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("642889dd", new Object[]{this, map});
        } else {
            this.componentMap = map;
        }
    }

    public String toString() {
        ITaoLiveComponentConfig value;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        sb.append(riy.ARRAY_START_STR);
        for (Map.Entry<String, ITaoLiveComponentConfig> entry : this.configMap.entrySet()) {
            if (entry != null && (value = entry.getValue()) != null && value.cList != null && !value.cList.isEmpty()) {
                for (ITaoLiveComponentConfig iTaoLiveComponentConfig : value.cList) {
                    sb.append(iTaoLiveComponentConfig.toString());
                    sb.append(" ");
                }
            }
        }
        sb.append(riy.ARRAY_END_STR);
        return super.toString() + riy.BLOCK_START_STR + "configMap = " + this.configMap + '}';
    }
}
