package com.taobao.monitor.common;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.Map;

/* loaded from: classes.dex */
public class BundleMap implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final Map<String, Object> data;

    public BundleMap(Map<String, Object> map) {
        this.data = map;
    }

    public Map<String, Object> getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("516a2e9c", new Object[]{this}) : this.data;
    }
}
