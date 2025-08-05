package com.alipay.mobile.common.logging.strategy;

import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: classes3.dex */
public class RealTimeConfig {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int interval = 5;
    public boolean enable = true;
    public Map<String, Boolean> realtimeCategory = new ConcurrentHashMap();

    public int getInterval() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("34e1135", new Object[]{this})).intValue() : this.interval;
    }

    public void setInterval(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f94af075", new Object[]{this, new Integer(i)});
            return;
        }
        if (i <= 1) {
            i = 1;
        }
        this.interval = i;
    }

    public boolean isEnable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f2312d58", new Object[]{this})).booleanValue() : this.enable;
    }

    public void setEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("183c4dc8", new Object[]{this, new Boolean(z)});
        } else {
            this.enable = z;
        }
    }

    public Map<String, Boolean> getRealtimeCategory() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("192717bb", new Object[]{this}) : this.realtimeCategory;
    }

    public void setRealtimeCategory(Map<String, Boolean> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("935cde33", new Object[]{this, map});
        } else {
            this.realtimeCategory = map;
        }
    }
}
