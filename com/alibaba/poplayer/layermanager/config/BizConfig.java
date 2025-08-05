package com.alibaba.poplayer.layermanager.config;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.kge;
import tb.riy;

/* loaded from: classes.dex */
public final class BizConfig implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Map<String, ConfigItem> mConfigs = new ConcurrentHashMap();

    static {
        kge.a(357582893);
        kge.a(1028243835);
    }

    public ConfigItem findConfig(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConfigItem) ipChange.ipc$dispatch("6324300", new Object[]{this, str});
        }
        if (!TextUtils.isEmpty(str)) {
            return this.mConfigs.get(str);
        }
        return null;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder(riy.BLOCK_START_STR);
        for (String str : this.mConfigs.keySet()) {
            if (!TextUtils.isEmpty(str)) {
                sb.append(riy.BLOCK_START_STR);
                sb.append(str);
                sb.append(":");
                sb.append(this.mConfigs.get(str).toString());
                sb.append(riy.BLOCK_END_STR);
            }
        }
        sb.append(riy.BLOCK_END_STR);
        return sb.toString();
    }
}
